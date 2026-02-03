package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcr {
    public final int a;
    public final mcm b;
    public final int[] c;
    public final boolean[] d;
    private final boolean e;

    static {
        mgb.O(0);
        mgb.O(1);
        mgb.O(3);
        mgb.O(4);
    }

    public mcr(mcm mcmVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = mcmVar.a;
        this.a = i;
        mee.a(i == iArr.length && i == zArr.length);
        this.b = mcmVar;
        this.e = z && i > 1;
        this.c = (int[]) iArr.clone();
        this.d = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.b.c;
    }

    public final mau b(int i) {
        return this.b.a(i);
    }

    public final boolean c(int i) {
        return this.d[i];
    }

    public final boolean d(int i) {
        return this.c[i] == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mcr mcrVar = (mcr) obj;
            if (this.e == mcrVar.e && this.b.equals(mcrVar.b) && Arrays.equals(this.c, mcrVar.c) && Arrays.equals(this.d, mcrVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + (this.e ? 1 : 0)) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }
}
