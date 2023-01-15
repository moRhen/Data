package org.example;

import lombok.Data;

@Data
public class PostDto {
  long id;
  int userId;
  String title;
  String body;
}
