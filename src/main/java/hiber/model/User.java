package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {


   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Long id;

   public User(String firstName, String lastName, String email, Car car) {
      this.id = id;
      this.car = car;
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
   }

//   @JoinColumn(unique = true)
   @OneToOne(mappedBy = "user", cascade = {CascadeType.ALL})
//   @PrimaryKeyJoinColumn
   private Car car;

   @Column(name = "name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;

   @Column(name = "email")
   private String email;

   public String getCar() {
      return car.getModel() + car.getSeries();
   }

   public User() {}
   
   public User(String firstName, String lastName, String email) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }
}
