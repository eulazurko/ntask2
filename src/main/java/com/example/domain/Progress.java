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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PROGRESS")
public class Progress
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "PROGRESS_ID", nullable = false, updatable = false)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "USER_ID")
  private Student student;
  @ManyToOne
  @JoinColumn(name = "SEMESTER_ID")
  private Semester semester;
  @ManyToOne
  @JoinColumn(name = "DISCIPLINE_ID")
  private Discipline discipline;
  @Column(name = "MARK")
  private int mark;
}
