package org.adtado.vsfe.effective.item06;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record UserBadCase(
	@NotEmpty String name,
	@Positive Integer point,
	@Positive Long score,
	@NotNull Type type
) {
}
