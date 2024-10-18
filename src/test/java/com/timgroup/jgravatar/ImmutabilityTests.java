package com.timgroup.jgravatar;

import static org.mutabilitydetector.unittesting.MutabilityAssert.assertInstancesOf;
import static org.mutabilitydetector.unittesting.MutabilityMatchers.areImmutable;

import org.junit.jupiter.api.Test;

public class ImmutabilityTests {

    @Test
    public void gravatar() {
        assertInstancesOf(Gravatar.class, areImmutable());
    }

    @Test
    public void gravatarDefaultImage() {
        assertInstancesOf(GravatarDefaultImage.class, areImmutable());
    }

    @Test
    public void gravatarRating() {
        assertInstancesOf(GravatarRating.class, areImmutable());
    }

}
