package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyv implements fdat {
    final /* synthetic */ fdau a;
    final /* synthetic */ faj b;
    final /* synthetic */ jyq c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ fcu f;
    final /* synthetic */ kew g;
    final /* synthetic */ kfp h;
    final /* synthetic */ ics i;
    final /* synthetic */ ics j;
    final /* synthetic */ ics k;
    final /* synthetic */ ics l;
    final /* synthetic */ fmx m;
    final /* synthetic */ boolean n;
    final /* synthetic */ fdap o;
    final /* synthetic */ kel p;
    final /* synthetic */ kio q;
    final /* synthetic */ eug r;

    public eyv(fdau fdauVar, faj fajVar, jyq jyqVar, int i, int i2, fcu fcuVar, kew kewVar, kfp kfpVar, ics icsVar, ics icsVar2, ics icsVar3, ics icsVar4, eug eugVar, fmx fmxVar, boolean z, fdap fdapVar, kel kelVar, kio kioVar) {
        this.a = fdauVar;
        this.b = fajVar;
        this.c = jyqVar;
        this.d = i;
        this.e = i2;
        this.f = fcuVar;
        this.g = kewVar;
        this.h = kfpVar;
        this.i = icsVar;
        this.j = icsVar2;
        this.k = icsVar3;
        this.l = icsVar4;
        this.r = eugVar;
        this.m = fmxVar;
        this.n = z;
        this.o = fdapVar;
        this.p = kelVar;
        this.q = kioVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            this.a.a(hxe.d(-44346382, new eyu(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.r, this.m, this.n, this.o, this.p, this.q), hmlVar), hmlVar, 6);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
