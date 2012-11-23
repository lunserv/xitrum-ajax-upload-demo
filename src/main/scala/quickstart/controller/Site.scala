package quickstart.controller

import quickstart.DefaultLayout
import org.jboss.netty.handler.codec.http.multipart.FileUpload

object Site extends Site

class Site extends DefaultLayout {
  def index = GET {
    respondView()
  }
  
  def upload = POST("upload") {
    val myFile = param[FileUpload]("my_file")
    println(myFile.getFilename() + " upload....")
  }
}
