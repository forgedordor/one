package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hpp {
    public final List a;
    public final int b;
    public int c;
    public final List d;
    public final cuh e;
    public final fctc f;

    public hpp(List list, int i) {
        this.a = list;
        this.b = i;
        if (i < 0) {
            hpq.a("Invalid start index");
        }
        this.d = new ArrayList();
        cuh cuhVar = new cuh((byte[]) null);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            hoj hojVar = (hoj) this.a.get(i3);
            cuhVar.f(hojVar.c, new hod(i3, i2, hojVar.d));
            i2 += hojVar.d;
        }
        this.e = cuhVar;
        this.f = fctd.a(new hpo(this));
    }

    public final int a(hoj hojVar) {
        hod hodVar = (hod) this.e.a(hojVar.c);
        if (hodVar != null) {
            return hodVar.b;
        }
        return -1;
    }

    public final int b(hoj hojVar) {
        hod hodVar = (hod) this.e.a(hojVar.c);
        return hodVar != null ? hodVar.c : hojVar.d;
    }

    public final void c(hoj hojVar, int i) {
        this.e.f(hojVar.c, new hod(-1, i, 0));
    }

    public final boolean d(int i, int i2) {
        int i3;
        int i4;
        cuh cuhVar = this.e;
        hod hodVar = (hod) cuhVar.a(i);
        if (hodVar == null) {
            return false;
        }
        int i5 = hodVar.b;
        int i6 = i2 - hodVar.c;
        hodVar.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = cuhVar.c;
        long[] jArr = cuhVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = i7 - length;
                int i9 = 0;
                while (true) {
                    i3 = 8 - ((~i8) >>> 31);
                    if (i9 >= i3) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        hod hodVar2 = (hod) objArr[(i7 << 3) + i9];
                        if (hodVar2.b >= i5 && !fdbq.f(hodVar2, hodVar) && (i4 = hodVar2.b + i6) >= 0) {
                            hodVar2.b = i4;
                        }
                    }
                    j >>= 8;
                    i9++;
                }
                if (i3 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }

    public final void e(hoj hojVar) {
        this.d.add(hojVar);
    }
}
