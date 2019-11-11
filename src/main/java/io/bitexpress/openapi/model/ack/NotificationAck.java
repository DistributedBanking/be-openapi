package io.bitexpress.openapi.model.ack;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * 确认异步通知
 * 
 * @author shenyue
 *
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class NotificationAck {
	private boolean success;

}
