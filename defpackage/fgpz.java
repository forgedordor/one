package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgpz {
    public final fgmq a;
    public final Locale b;
    public fgmz c;
    public Integer d;
    public fgpx[] e;
    public int f;
    public boolean g;
    private final fgmz h;
    private Object i;

    public fgpz(fgmq fgmqVar) {
        fgmq fgmqVarC = fgmw.c(fgmqVar);
        fgmz fgmzVarZ = fgmqVarC.z();
        this.h = fgmzVarZ;
        this.a = fgmqVarC.a();
        this.b = Locale.getDefault();
        this.c = fgmzVarZ;
        this.e = new fgpx[8];
    }

    static int a(fgna fgnaVar, fgna fgnaVar2) {
        if (fgnaVar == null || !fgnaVar.f()) {
            return (fgnaVar2 == null || !fgnaVar2.f()) ? 0 : -1;
        }
        if (fgnaVar2 == null || !fgnaVar2.f()) {
            return 1;
        }
        return -fgnaVar.compareTo(fgnaVar2);
    }

    public final Object b() {
        if (this.i == null) {
            this.i = new fgpy(this);
        }
        return this.i;
    }

    public final fgpx c() {
        fgpx[] fgpxVarArr = this.e;
        int i = this.f;
        int length = fgpxVarArr.length;
        if (i == length || this.g) {
            if (i == length) {
                length = i + i;
            }
            fgpx[] fgpxVarArr2 = new fgpx[length];
            System.arraycopy(fgpxVarArr, 0, fgpxVarArr2, 0, i);
            this.e = fgpxVarArr2;
            this.g = false;
            fgpxVarArr = fgpxVarArr2;
        }
        this.i = null;
        fgpx fgpxVar = fgpxVarArr[i];
        if (fgpxVar == null) {
            fgpxVar = new fgpx();
            fgpxVarArr[i] = fgpxVar;
        }
        this.f = i + 1;
        return fgpxVar;
    }

    public final void d(fgmu fgmuVar, int i) {
        c().c(fgmuVar.a(this.a), i);
    }

    public final void e(Integer num) {
        this.i = null;
        this.d = num;
    }

    public final void f(fgmz fgmzVar) {
        this.i = null;
        this.c = fgmzVar;
    }

    public final long g(CharSequence charSequence) {
        fgpx[] fgpxVarArr = this.e;
        int i = this.f;
        if (this.g) {
            fgpxVarArr = (fgpx[]) fgpxVarArr.clone();
            this.e = fgpxVarArr;
            this.g = false;
        }
        if (i > 10) {
            Arrays.sort(fgpxVarArr, 0, i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2;
                while (i3 > 0) {
                    int i4 = i3 - 1;
                    if (fgpxVarArr[i4].compareTo(fgpxVarArr[i3]) > 0) {
                        fgpx fgpxVar = fgpxVarArr[i3];
                        fgpxVarArr[i3] = fgpxVarArr[i4];
                        fgpxVarArr[i4] = fgpxVar;
                        i3 = i4;
                    }
                }
            }
        }
        long jB = 0;
        if (i > 0) {
            fgmq fgmqVar = this.a;
            fgna fgnaVarA = fgnc.e.a(fgmqVar);
            fgna fgnaVarA2 = fgnc.g.a(fgmqVar);
            fgna fgnaVarQ = fgpxVarArr[0].a.q();
            if (a(fgnaVarQ, fgnaVarA) >= 0 && a(fgnaVarQ, fgnaVarA2) <= 0) {
                d(fgmu.f, 2000);
                return g(charSequence);
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            try {
                jB = fgpxVarArr[i5].b(jB, true);
            } catch (fgnd e) {
                if (charSequence != null) {
                    String strA = a.a((String) charSequence, "Cannot parse \"", "\"");
                    String str = e.a;
                    if (str == null) {
                        e.a = strA;
                    } else {
                        e.a = a.q(str, strA, ": ");
                    }
                }
                throw e;
            }
        }
        int i6 = 0;
        while (i6 < i) {
            fgpxVarArr[i6].a.v();
            jB = fgpxVarArr[i6].b(jB, i6 == i + (-1));
            i6++;
        }
        if (this.d != null) {
            return jB - r0.intValue();
        }
        fgmz fgmzVar = this.c;
        if (fgmzVar != null) {
            int iB = fgmzVar.b(jB);
            jB -= iB;
            if (iB != this.c.a(jB)) {
                String strN = "Illegal instant due to time zone offset transition (" + String.valueOf(this.c) + ")";
                if (charSequence != null) {
                    strN = a.n(strN, (String) charSequence, "Cannot parse \"", "\": ");
                }
                throw new fgne(strN);
            }
        }
        return jB;
    }

    public final void h(Object obj) {
        if (obj instanceof fgpy) {
            fgpy fgpyVar = (fgpy) obj;
            if (this != fgpyVar.e) {
                return;
            }
            this.c = fgpyVar.a;
            this.d = fgpyVar.b;
            this.e = fgpyVar.c;
            int i = fgpyVar.d;
            if (i < this.f) {
                this.g = true;
            }
            this.f = i;
            this.i = obj;
        }
    }
}
