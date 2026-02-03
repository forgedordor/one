package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzvp {
    private final float a;
    private final Random b;

    public dzvp(Random random, float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        ejwl.b(z, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = f;
        this.b = random;
    }

    public final boolean a() {
        return this.b.nextFloat() < this.a;
    }
}
