package org.example;

import lombok.Data;

@Data
public class Post {
  long id;
  int userId;
  String title;
  String body;
}
