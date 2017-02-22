package com.example.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Calendar;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "STUDENT")
public class Student extends User
{
  @Column(name = "GROUP_NAME")
  private String groupName;
  @Column(name = "RECEIPT_DATE")
  private Calendar receiptDate;
  @OneToMany(mappedBy = "student")
  private List<Progress> progresses;
}
