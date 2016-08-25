import sys.process._
import java.io.File
import java.util.Calendar
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;


val base_dir = "/var/tmp"

val repos = Array("individualSOR", "physicalProperty", "voyageSOR")

val repo_url = "git clone ssh://git@github.com/gxitrident"

val now = Calendar.getInstance().getTime()

val fmt = new SimpleDateFormat("MM-dd-yyyy_hh:mm:ss", Locale.ENGLISH);

val tstamp = fmt.format(now)

for (r <- repos) {

  val old = new File(s"$base_dir/$r")
  val cur = new File(s"$base_dir/$r.$tstamp")

  if (old.exists) {
    println(s"Backing Up: $old to $cur")
    old.renameTo(cur)
  }

  val cmd = s"$repo_url/$r.git"

  println(s"\ncd $base_dir ; $cmd")
  cmd!

}
