package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekf implements ekh {
    private final float a = 120.0f;

    public ekf() {
        if (Float.compare(120.0f, 0.0f) > 0) {
            return;
        }
        ebs.c("Provided min size should be larger than zero.");
    }

    @Override // defpackage.ekh
    public final List a(kio kioVar, int i, int i2) {
        return ekn.a(i, Math.max((i + i2) / (kioVar.ep(120.0f) + i2), 1), i2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ekf)) {
            return false;
        }
        float f = ((ekf) obj).a;
        return kir.b(120.0f, 120.0f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(120.0f);
    }
}
