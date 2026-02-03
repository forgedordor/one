package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enu {
    public kil b;
    public int c;
    public int d;
    public int f;
    public int g;
    public ens[] a = enz.a;
    public int e = 1;

    public static /* synthetic */ void b(enu enuVar, eou eouVar, fdjx fdjxVar, iie iieVar, int i, int i2) {
        long jG = eouVar.g(0);
        enuVar.a(eouVar, fdjxVar, iieVar, i, i2, !eouVar.m() ? kjb.b(jG) : kjb.a(jG));
    }

    public final void a(eou eouVar, fdjx fdjxVar, iie iieVar, int i, int i2, int i3) {
        for (ens ensVar : this.a) {
        }
        this.f = i;
        this.g = i2;
        int length = this.a.length;
        for (int iD = eouVar.d(); iD < length; iD++) {
            ens ensVar2 = this.a[iD];
            if (ensVar2 != null) {
                ensVar2.d();
            }
        }
        if (this.a.length != eouVar.d()) {
            Object[] objArrCopyOf = Arrays.copyOf(this.a, eouVar.d());
            objArrCopyOf.getClass();
            this.a = (ens[]) objArrCopyOf;
        }
        this.b = new kil(eouVar.f());
        this.c = i3;
        this.d = eouVar.b();
        this.e = eouVar.e();
        int iD2 = eouVar.d();
        for (int i4 = 0; i4 < iD2; i4++) {
            if (enz.a(eouVar.i(i4)) != null) {
                if (this.a[i4] != null) {
                    throw null;
                }
                this.a[i4] = new ens(fdjxVar, iieVar);
                throw null;
            }
            ens ensVar3 = this.a[i4];
            if (ensVar3 != null) {
                ensVar3.d();
            }
            this.a[i4] = null;
        }
    }
}
