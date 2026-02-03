package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elgi extends elgk {
    public elgi(elgj elgjVar) {
        super(elgjVar);
    }

    public final void a() {
        this.a.equals(elgh.a);
    }

    @Override // defpackage.elgk
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elgi)) {
            return false;
        }
        b((elgi) obj);
        return true;
    }

    @Override // defpackage.elgk
    public final int hashCode() {
        a();
        return Arrays.hashCode(new Object[]{Double.valueOf(100000.0d)});
    }

    @Override // defpackage.elgk
    public final String toString() {
        a();
        return "100000.0m";
    }
}
