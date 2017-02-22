package com.example.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "DISCIPLINE")
public class Discipline
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "DISCIPLINE_ID", nullable = false, updatable = false)
  private Long id;
  @Column(name = "DISCIPLINE_NAME", nullable = false)
  private String name;
  @ManyToMany(mappedBy = "disciplines")
  private List<Semester> semesters;
  @OneToMany(mappedBy = "discipline")
  private List<Progress> progresses;
}
