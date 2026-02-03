package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nra extends nrg {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String[] d;
    private final nrg[] e;

    public nra(String str, boolean z, boolean z2, String[] strArr, nrg[] nrgVarArr) {
        super("CTOC");
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = strArr;
        this.e = nrgVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nra nraVar = (nra) obj;
            if (this.b == nraVar.b && this.c == nraVar.c && Objects.equals(this.a, nraVar.a) && Arrays.equals(this.d, nraVar.d) && Arrays.equals(this.e, nraVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b ? 1 : 0) + 527) * 31) + (this.c ? 1 : 0)) * 31) + this.a.hashCode();
    }
}
