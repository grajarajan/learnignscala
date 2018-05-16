object PrintCapital {
  var Capital = Map("US" -> "Washington", "India" ->"Delhi", "France" -> "Paris")
  def getCapital(country: String) = Capital.get(country)
}
