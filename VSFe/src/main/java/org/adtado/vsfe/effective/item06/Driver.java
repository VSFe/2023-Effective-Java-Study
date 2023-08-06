package org.adtado.vsfe.effective.item06;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Driver {
	private Driver() {
		throw new UnsupportedOperationException("Utility Class.");
	}

	public static void testCase(int count, String targetClass) throws NoSuchAlgorithmException {
		var random = SecureRandom.getInstanceStrong();
		var totalCount = new AtomicInteger();

		IntStream.range(0, count)
			.mapToObj(idx -> {
				var name = createName();
				var point = random.nextInt(1000000);
				var score = random.nextLong(1000000000L);

				return switch (targetClass) {
					case "UserGoodCase" -> new UserBadCase(name, point, score, Type.valueOfBadCase(score));
					case "UserBadCase" -> new UserGoodCase(name, point, score, Type.valueOfGoodCase(score));
					default -> throw new IllegalArgumentException(targetClass);
				};
			}).forEach(user -> totalCount.getAndIncrement());
	}

	private static String createName() {
		return UUID.randomUUID().toString();
	}
}
