class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    private String postalCode;
    private String streetName;
    private String city;
    private String buildingNumber;

    public Person(String firstName,
                  String lastName,
                  int age,
                  String email,
                  String postalCode,
                  String streetName,
                  String city,
                  String buildingNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.postalCode = postalCode;
        this.streetName = streetName;
        this.city = city;
        this.buildingNumber = buildingNumber;
    }

    public boolean validateEmail(String email) {
        return email.contains("@") && email.contains(".");
    }
}

