package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekg implements ekh {
    private final int a = 3;

    @Override // defpackage.ekh
    public final List a(kio kioVar, int i, int i2) {
        return ekn.a(i, 3, i2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ekg)) {
            return false;
        }
        int i = ((ekg) obj).a;
        return true;
    }

    public final int hashCode() {
        return -3;
    }
}
