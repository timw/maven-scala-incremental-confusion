package package2

class Consumer() {

  def fu(): Unit = {
    println(new package1.Producer.Domain())
  }

}
