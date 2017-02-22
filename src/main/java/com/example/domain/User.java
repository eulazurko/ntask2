package com.example.domain;

import com.example.common.UserType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class User
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "USER_ID", nullable = false, updatable = false)
  protected Long id;
  @Column(name = "USER_TYPE", nullable = false)
  @Enumerated(EnumType.STRING)
  protected UserType userType;
  @Column(name = "LAST_NAME")
  protected String lastName;
  @Column(name = "FIRST_NAME")
  protected String firstName;
}
