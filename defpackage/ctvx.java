package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctvx {
    public final int a;
    public final int b;

    public ctvx(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctvx)) {
            return false;
        }
        ctvx ctvxVar = (ctvx) obj;
        return this.a == ctvxVar.a && this.b == ctvxVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "GroupLimitExcludingSelf(mmsGroupLimit=" + this.a + ", rcsGroupLimit=" + this.b + ")";
    }

    public ctvx() {
        this(Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
