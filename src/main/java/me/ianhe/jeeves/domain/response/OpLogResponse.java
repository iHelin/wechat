package me.ianhe.jeeves.domain.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import me.ianhe.jeeves.domain.response.component.AbstractWeChatHttpResponseBase;

/**
 * @author iHelin
 * @since 2018/8/15 09:42
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpLogResponse extends AbstractWeChatHttpResponseBase {
}