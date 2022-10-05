package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;

@Data
@AllArgsConstructor
public class DeliveryCode {
    private String code;
    private String displayName;
}
