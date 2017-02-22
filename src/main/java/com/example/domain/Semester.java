package com.example.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "SEMESTER")
public class Semester
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "SEMESTER_ID", nullable = false, updatable = false)
  private Long id;
  @Column(name = "QUARTER")
  private int quarter;
  @ManyToMany
  @JoinTable(name = "SEMESTER_DISCIPLINE",
      joinColumns = @JoinColumn(name = "SEMESTER_ID", referencedColumnName = "SEMESTER_ID"),
      inverseJoinColumns = @JoinColumn(name = "DISCIPLINE_ID", referencedColumnName = "DISCIPLINE_ID"))
  private List<Discipline> disciplines;
  @OneToMany(mappedBy = "semester")
  private List<Progress> progresses;
}
