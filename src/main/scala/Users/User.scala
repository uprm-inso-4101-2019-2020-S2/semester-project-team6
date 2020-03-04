package Users

class User {

  //Creation of variables that contain the user's information. Saved in String format.
  //initialized all as null.
  var  FirstName : String = null ;
  var  LastName  : String = null ;
  var DOB : String = null ;
  var Phone : String = null ;
  var Password : String = null ;
  var Email  : String = null ;
  var Location  : String = null ;


  //creation of a variable to determine whether the user is logged in or not.
  //initialize logged in at false
  var LoggedOn : Boolean = false;

  //creation of a user.
  def User (FirstName:String,LastName:String,DOB:String,Phone:String,
            Password:String,Email:String,Location:String): Unit ={

    //Assignment of values.
    this.DOB = DOB;
    this.Email = Email;
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.Password = Password;
    this.Phone = Phone;
    this.Location = Location;
    this.LoggedOn = true;

  }


  //Getters and Setters for variables./////////////
  def getFirstName (): Unit = {

    return this.FirstName;

  }
  def getLastName (): Unit = {

    return this.LastName;

  }
  def getPhone (): Unit = {

    return this.Phone;

  }
  def getDOB (): Unit = {

    return this.DOB;

  }
  def getPassword (): Unit = {

    return this.Password;

  }
  def getLocation (): Unit = {

    return this.Location;

  }
  def getEmail (): Unit = {

    return this.Email;

  }

  def setFirstName (): Unit = {

    return this.FirstName;

  }
  def setLastName (): Unit = {

    return this.LastName;

  }
  def setPhone (): Unit = {

    return this.Phone;

  }
  def setDOB (): Unit = {

    return this.DOB;

  }
  def setPassword (): Unit = {

    return this.Password;

  }
  def setLocation (): Unit = {

    return this.Location;

  }
  def setEmail (): Unit = {

    return this.Email;

  }
  ///////////////////////////////////////




}
