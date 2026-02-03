package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajw extends ajn {
    public final int a;
    private final int b = 0;

    public ajw(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajw)) {
            return false;
        }
        ajw ajwVar = (ajw) obj;
        if (!Objects.equals(Integer.valueOf(this.a), Integer.valueOf(ajwVar.a))) {
            return false;
        }
        int i = ajwVar.b;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), 0);
    }

    public final String toString() {
        return "{joinableValueType: " + this.a + ", deletePropagationType: 0}";
    }
}
