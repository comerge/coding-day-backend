package net.comerge.codingday.backend.dto;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import net.comerge.codingday.backend.database.models.backend.tables.records.UserRecord;

@Data
@ToString
@Accessors(chain = true)
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    public static UserDTO fromRecord(UserRecord record) {
        return new UserDTO()
                .setId(record.getId())
                .setFirstName(record.getFirstName())
                .setLastName(record.getLastName())
                .setEmail(record.getEmail());
    }
}
