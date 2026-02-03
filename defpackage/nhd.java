package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nhd implements nif {
    protected final mcm a;
    protected final int b;
    protected final int[] c;
    private final mau[] d;
    private int e;

    public nhd(mcm mcmVar, int[] iArr) {
        int length = iArr.length;
        mee.c(length > 0);
        this.a = mcmVar;
        this.b = length;
        this.d = new mau[length];
        for (int i = 0; i < iArr.length; i++) {
            this.d[i] = mcmVar.a(iArr[i]);
        }
        Arrays.sort(this.d, new Comparator() { // from class: nhc
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((mau) obj2).j - ((mau) obj).j;
            }
        });
        this.c = new int[this.b];
        for (int i2 = 0; i2 < this.b; i2++) {
            int[] iArr2 = this.c;
            mau mauVar = this.d[i2];
            int i3 = 0;
            while (true) {
                mau[] mauVarArr = mcmVar.d;
                if (i3 >= mauVarArr.length) {
                    i3 = -1;
                    break;
                } else if (mauVar == mauVarArr[i3]) {
                    break;
                } else {
                    i3++;
                }
            }
            iArr2[i2] = i3;
        }
    }

    @Override // defpackage.nik
    public final mau a(int i) {
        return this.d[i];
    }

    @Override // defpackage.nif
    public final mau b() {
        return this.d[0];
    }

    @Override // defpackage.nik
    public final mcm c() {
        return this.a;
    }

    @Override // defpackage.nik
    public final int e(int i) {
        return this.c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nhd nhdVar = (nhd) obj;
            if (this.a.equals(nhdVar.a) && Arrays.equals(this.c, nhdVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nif
    public final int f() {
        return this.c[0];
    }

    @Override // defpackage.nik
    public final int g(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.nik
    public final int h() {
        return this.c.length;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iIdentityHashCode = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
        this.e = iIdentityHashCode;
        return iIdentityHashCode;
    }
}
