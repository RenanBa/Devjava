// Create a class with the attributes persons [first name], [last name],
// and [date of birth] (consisting of separated attributes for the month,
// day and year of birth). This class should have a [constructor] that receives
// this data as parameters. For each attribute provides [set and get] methods.
// The class also should [returns the person's maximum heart rate] and a method
// that calculates and [returns the person's targer heart rate]. Write a Java
// application that prompts for the person's information, instantiate an object
// of class HeartRates and print the information from that object then calculates
// the person's age in year. maximum heart rate and target-heart-rate range.
// 220 minus your age in year is the formula for maximum heart rate
// Targer hear rate is 50% to 85% of your maximum heart rate

public class HeartRate
{
  private String firstName; // user's first nane
  private String lastName; // user's last name
  private int dayBirth; // user's day of birth
  private int monthBirth; // user's month of birth
  private int yearBirth; // user's year of birth
  private int calcRate = 220; // set the Rate to calculates ueser's heart rates
  private int maxRate; // to store maximum heart rate
  private int maxTargetRate; // to store target heart rate
  private int lowTargetRate; // to store target heart rate
  private int age; // to store user's age

  // constructor
  public class HeartRate( firstN, lastN, day, month, year )
  {
    // initiates attributes
    firstName = firstN;
    lastName = lastN;
    dayBirth = day;
    monthBirth = month;
    yearBirth = year;
    age = 2019 - yearBirth; // calculates user's age
    maxRate = calcRate - age; // calculates max heat rate
    maxTargetRate = maxRate * 0.85; // calculates target maximum rate
    lowTargetRate = maxRate * 0.5; // calculates target low rate
  } // end of constructor

  // calculates and returns maximum heart rate
  public int getMaxRate()
  {
    return maxRate
  }

  // calculates and returns target heart rate
  public int getMaxTargetRate()
  {
    return maxTargetRate
  }

  // calculates and returns target heart rate
  public int getLowTargetRate()
  {
    return lowTargetRate
  }

  // calculates and returns age, only the year
  public int getAgeYear()
  {
    return age;
  }

  // method to set the user's firstName
  public void setFirstName( fName )
  {
    firstName = fName; // store first name
  } // end of setFirstName

  // method to set the user's firstName
  public void setLastName( lName )
  {
    lastName = lName; // store last name
  } // end of setLastName

  // method to set the user's hRate
  public void setHRate( heartR )
  {
    hRate = heartR; // store heart rate
  } // end of setHRate

  // method to set the user's dayBirth
  public void setDayBirth( bDay )
  {
    dayBirth = bDay; // store day of birth
  } // end of setDayBirth

  // method to set the user's monthBirth
  public void setMonthBirth( bMonth )
  {
    monthBirth = bMonth; // store month of birth
  } // end of setMonthBirth

  // method to set the user's yearBirth
  public void setMonthBirth( bYear )
  {
    yearBirth = bYear; // store year of birth
  } // end of yearBirth

  // method to get the user's firstName
  public String getFirstName()
  {
    return firstName; // returns first name
  } // end of getFirstName

  // method to get the user's firstName
  public String getLastName()
  {
    return lastName; // returns last name
  } // end of getLastName

  // method to get the user's hRate
  public int getHRate()
  {
    return hRate ; // return heart rate
  } // end of getHRate

  // method to get the user's dayBirth
  public int getDayBirth()
  {
    return dayBirth; // return day of birth
  } // end of getDayBirth

  // method to get the user's monthBirth
  public int getMonthBirth()
  {
    return monthBirth; // return month of birth
  } // end of getMonthBirth

  // method to get the user's yearBirth
  public int getMonthBirth()
  {
    return yearBirth; // return year of birth
  } // end of getMonthBirth

} // end of HeartRate class
