public class Contact {

    private String lastName;
    private String firstName;
    private String birthday;
    private String phone;
    private String sex;


    /**
     * @param lastName Фамилия
     * @param firstName Имя
     * @param patronymic Отчество
     * @param birthday День рождения
     * @param phone Номер телефона
     * @param sex Пол
     */
    public Contact(String lastName, String firstName, String patronymic, String birthday, String phone, String sex) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phone = phone;
        this.sex = sex;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

        public String patronymic;
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else
            return (this.firstName.equals(((Contact) obj).firstName)
                    && this.lastName.equals(((Contact) obj).lastName));
    }  

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s", 
        getLastName(), getFirstName(), getPatronymic(), getBirthday(), getPhone(), getSex());
    }
}
