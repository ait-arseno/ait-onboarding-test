package org.ait.project.template.shared.template;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseCollection<T> {
  @JsonProperty("list")
  private ResponseCollectionContent<T> list;
}
