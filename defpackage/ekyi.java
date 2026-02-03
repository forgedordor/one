package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekyi {
    public final ekxp a;
    public final double b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    private final ekxf g;
    private ekxf h;

    public ekyi(ekxp ekxpVar, double d) {
        this.a = ekxpVar;
        this.b = d;
        if (ekxpVar.E()) {
            double d2 = 1.0d + d;
            double d3 = -d2;
            this.g = new ekxf(new ekxe(d3, d2), new ekxe(d3, d2));
            double d4 = -d;
            this.h = new ekxf(new ekxe(d4, d), new ekxe(d4, d));
            this.d = 0;
            this.c = 0;
            this.e = ekxpVar.b() & 1;
            this.f = 0;
            return;
        }
        long jQ = ekxpVar.q();
        int iC = ekxp.c(jQ);
        int iD = ekxp.d(jQ);
        this.e = ekxp.e(jQ);
        int iH = ekxpVar.h();
        this.f = iH;
        ekxf ekxfVar = new ekxf();
        int iG = ekxp.g(iH);
        ekxp.A(iC, iG, ekxfVar.a);
        ekxp.A(iD, iG, ekxfVar.b);
        this.g = ekxfVar.b(d);
        int i = -ekxp.g(iH);
        this.c = iC & i;
        this.d = i & iD;
    }

    public final ekxf a() {
        if (this.h == null) {
            int i = this.f;
            int i2 = this.c;
            int i3 = this.d;
            double d = this.b;
            long j = i2;
            long jG = ekxp.g(i);
            ekxl ekxlVar = ekzf.a;
            double dC = ekzf.c(ekzf.b(j + j + jG));
            ekxe ekxeVar = new ekxe(dC - d, dC + d);
            long j2 = i3;
            double dC2 = ekzf.c(ekzf.b(j2 + j2 + jG));
            this.h = new ekxf(ekxeVar, new ekxe(dC2 - d, dC2 + d));
        }
        return this.h;
    }

    public ekyi(ekyi ekyiVar, int i, int i2, int i3) {
        this.b = ekyiVar.b;
        ekxf ekxfVar = ekyiVar.g;
        ekxf ekxfVar2 = new ekxf(new ekxe(ekxfVar.a), new ekxe(ekxfVar.b));
        this.g = ekxfVar2;
        int i4 = ekyiVar.f + 1;
        this.f = i4;
        ekxp ekxpVar = ekyiVar.a;
        this.a = new ekxp(ekxpVar.d + (((i + i) - 3) * (ekxpVar.l() >>> 2)));
        int iG = ekxp.g(i4);
        this.c = ekyiVar.c + (i2 * iG);
        this.d = ekyiVar.d + (iG * i3);
        this.e = ekyiVar.e ^ ekxm.b(i);
        ekxf ekxfVarA = ekyiVar.a();
        ekxe ekxeVar = ekxfVar2.a;
        ekxe ekxeVar2 = ekxfVarA.a;
        int i5 = i2 == 0 ? 2 : 1;
        ekxd.b(i5, ekxeVar, ekxd.a(i5, ekxeVar2));
        ekxe ekxeVar3 = ekxfVar2.b;
        ekxe ekxeVar4 = ekxfVarA.b;
        int i6 = 1 != i3 ? 2 : 1;
        ekxd.b(i6, ekxeVar3, ekxd.a(i6, ekxeVar4));
    }
}
