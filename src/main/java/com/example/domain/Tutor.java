package com.example.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "TUTOR")
public class Tutor extends User
{
  @Column(name = "SCIENCE_DEGREE")
  private String scienceDegree;
}
