package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elgj implements Serializable {
    private final int a = 1;
    private final int b = 1;
    private final int c = 0;
    private final int d = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elgj)) {
            return false;
        }
        elgj elgjVar = (elgj) obj;
        int i = elgjVar.a;
        int i2 = elgjVar.b;
        int i3 = elgjVar.c;
        int i4 = elgjVar.d;
        return true;
    }

    public final int hashCode() {
        return 12036526;
    }
}
