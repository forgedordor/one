package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aju extends ajn {
    public final int a;
    private final int b = 0;

    public aju(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aju)) {
            return false;
        }
        aju ajuVar = (aju) obj;
        if (this.a != ajuVar.a) {
            return false;
        }
        int i = ajuVar.b;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), 0);
    }

    public final String toString() {
        return "{indexingType: " + this.a + ", quantizationType: 0}";
    }
}
