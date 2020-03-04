package DataStruct

import java.util.ArrayList

//Basic Data Structure for managing emails and user objects
object ADT{

  //creation of base arraylist of users and emails.
  var userList : ArrayList[Users.User] = new ArrayList[Users.User]();
  var emailList : ArrayList[String] = new ArrayList[String]()

  //function to add to list of users
  def addTo(users: Users.User): Unit ={

    //verify if the email already exists within the email list, if so then user must enter
    // new email.
    if(emailList.contains(users.Email) == false) {

      this.userList.add(users)
      this.emailList.add(users.Email)

    };

  }

  //Function verifies if an email exists
  def emailExists(email: String): Unit ={
    if(this.emailList.contains(email)) {

      return true
    }
    return false
  }


  //Function to verify if password is the one assigned to the email.
  def verifyPass(email: String, pass: String): Unit ={

    //verifies if email within email list
    if(this.emailExists(email)==true) {
      //verifies password of user tied to email.
      if(this.userList.get(this.emailList.indexOf(email)).getPassword() == pass){

        return this.userList.get(this.emailList.indexOf(email))

      }
    }else{

      return null

    }
  }

  //verify if a user exists
  def verifyExist(users: Users.User): Unit ={

    if(this.userList.contains(users)){

      return true;

    }

    return false

  }



}
