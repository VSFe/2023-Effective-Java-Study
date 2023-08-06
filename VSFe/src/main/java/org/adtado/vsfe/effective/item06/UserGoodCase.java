/*
 * @(#)UserGoodCase.java 2023. 08. 06.
 *
 * Copyright 2023 NaverCloud Corp. All rights Reserved.
 * NaverCloud PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package org.adtado.vsfe.effective.item06;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record UserGoodCase(
	@NotEmpty String name,
	@Positive int point,
	@Positive long score,
	@NotNull Type type
) {
}
