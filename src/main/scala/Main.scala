protected RouteBuilder createRouteBuilder() throws Exception {
    return new RouteBuilder() {
        public void configure() throws Exception {
            // we use a delay of 60 minutes (eg. once pr. hour we poll the FTP server
            long delay = 3600000;

            // from the given FTP server we poll (= download) all the files
            // from the public/reports folder as BINARY types and store this as files
            // in a local directory. Camel will use the filenames from the FTPServer

            // notice that the FTPConsumer properties must be prefixed with "consumer." in the URL
            // the delay parameter is from the FileConsumer component so we should use consumer.delay as
            // the URI parameter name. The FTP Component is an extension of the File Component.

            val user = "anwarabdus-samad"
            val pass = ""
            val host = "localhost"
            val srcPath = "/var/tmp/sftp_ingestion_test"
            val srcFile = "data.txt"
            val dstPath = "/var/tmp/sftp_ingestion_test"
            val dstFile = "ingestion.txt"

            from(s"ftp://$user:$pass@$host$srcPath/$srcFile?binary=true&consumer.delay=" + delay).
                    to(s"file://$dstPath/$dstFiler");
        }
    };
}
