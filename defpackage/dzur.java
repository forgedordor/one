package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzur {
    public final float a;

    public dzur(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException(String.format("Probability must be in [0, 1], was %s", Float.valueOf(f)));
        }
        this.a = f;
    }
}
