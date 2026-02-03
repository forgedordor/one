package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecob {
    static final Object[] a;
    static final ecob b;
    public final Object[] c;
    private final int d;

    static {
        Object[] objArr = new Object[0];
        a = objArr;
        b = new ecob(objArr);
    }

    public ecob(Object... objArr) {
        this.c = objArr;
        this.d = Arrays.hashCode(objArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ecob)) {
            return false;
        }
        ecob ecobVar = (ecob) obj;
        return this.d == ecobVar.d && Arrays.equals(this.c, ecobVar.c);
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return Arrays.toString(this.c);
    }
}
