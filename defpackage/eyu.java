package defpackage;

import androidx.compose.foundation.relocation.BringIntoViewRequesterElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyu implements fdat {
    final /* synthetic */ faj a;
    final /* synthetic */ jyq b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ fcu e;
    final /* synthetic */ kew f;
    final /* synthetic */ kfp g;
    final /* synthetic */ ics h;
    final /* synthetic */ ics i;
    final /* synthetic */ ics j;
    final /* synthetic */ ics k;
    final /* synthetic */ fmx l;
    final /* synthetic */ boolean m;
    final /* synthetic */ fdap n;
    final /* synthetic */ kel o;
    final /* synthetic */ kio p;
    final /* synthetic */ eug q;

    public eyu(faj fajVar, jyq jyqVar, int i, int i2, fcu fcuVar, kew kewVar, kfp kfpVar, ics icsVar, ics icsVar2, ics icsVar3, ics icsVar4, eug eugVar, fmx fmxVar, boolean z, fdap fdapVar, kel kelVar, kio kioVar) {
        this.a = fajVar;
        this.b = jyqVar;
        this.c = i;
        this.d = i2;
        this.e = fcuVar;
        this.f = kewVar;
        this.g = kfpVar;
        this.h = icsVar;
        this.i = icsVar2;
        this.j = icsVar3;
        this.k = icsVar4;
        this.q = eugVar;
        this.l = fmxVar;
        this.m = z;
        this.n = fdapVar;
        this.o = kelVar;
        this.p = kioVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ics fecVar;
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (hmlVar.J((iIntValue & 3) != 2, iIntValue & 1)) {
            final faj fajVar = this.a;
            ics icsVarU = egq.u(ics.e, ((kir) fajVar.e.a()).a, 0.0f, 2);
            jyq jyqVar = this.b;
            int i = this.c;
            int i2 = this.d;
            ics icsVarG = icj.g(icsVarU, new ezn(i, i2, jyqVar));
            fcu fcuVar = this.e;
            kew kewVar = this.f;
            kfp kfpVar = this.g;
            boolean zF = hmlVar.F(fajVar);
            Object objF = hmlVar.f();
            if (zF || objF == hmk.a) {
                objF = new fdae() { // from class: eyq
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return fajVar.d();
                    }
                };
                hmlVar.y(objF);
            }
            fdae fdaeVar = (fdae) objF;
            dwm dwmVarC = fcuVar.c();
            long j = kewVar.c;
            int iE = jyo.e(j);
            long j2 = fcuVar.b;
            int iE2 = iE != jyo.e(j2) ? jyo.e(j) : jyo.a(j) != jyo.a(j2) ? jyo.a(j) : jyo.d(j);
            fcuVar.b = j;
            kfm kfmVarA = fea.a(kfpVar, kewVar.b);
            int iOrdinal = dwmVarC.ordinal();
            if (iOrdinal == 0) {
                fecVar = new fec(fcuVar, iE2, kfmVarA, fdaeVar);
            } else {
                if (iOrdinal != 1) {
                    throw new fctg();
                }
                fecVar = new ezq(fcuVar, iE2, kfmVarA, fdaeVar);
            }
            fmc.a(icj.g(iex.b(icsVarG).a(fecVar).a(this.h).a(this.i), new fcy(jyqVar)).a(this.j).a(this.k).a(new BringIntoViewRequesterElement(this.q)), hxe.d(1412697320, new eyt(this.l, fajVar, this.m, this.n, kewVar, this.o, this.p, i2), hmlVar), hmlVar, 48);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
