import sys.process._


val base_dir = "/var/tmp"

val repos = Array("individualSOR", "physicalProperty", "voyageSOR")

val repo_url = "git clone ssh://git@github.com/gxitrident"

for (r <- repos) {

  val dir = new File(s"$base_dir/$r")

  if dir.  

  val cmd = s"$repo_url/$r.git"

  println(s"cd $base_dir ; $cmd")

  cmd!

}
