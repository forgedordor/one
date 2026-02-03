package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrj extends nrg {
    public final int a;
    public final int b;
    public final int c;
    public final int[] d;
    public final int[] e;

    public nrj(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
        this.e = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nrj nrjVar = (nrj) obj;
            if (this.a == nrjVar.a && this.b == nrjVar.b && this.c == nrjVar.c && Arrays.equals(this.d, nrjVar.d) && Arrays.equals(this.e, nrjVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
    }
}
