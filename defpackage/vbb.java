package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vbb implements fdat {
    final /* synthetic */ hox a;
    final /* synthetic */ kph b;

    public vbb(hox hoxVar, kph kphVar) {
        this.a = hoxVar;
        this.b = kphVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            this.a.b(fctx.a);
            kph kphVar = this.b;
            kphVar.c();
            hmlVar.v(-2006169583);
            kpg kpgVarB = kphVar.b();
            kow kowVarA = kpgVarB.a();
            kow kowVarB = kpgVarB.b();
            ico icoVar = ics.e;
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            Object obj3 = hmk.a;
            if (objF == obj3) {
                objF = vav.a;
                hmlVar.y(objF);
            }
            hmlVar.o();
            dktx.a(kph.d(icoVar, kowVarA, (fdap) objF), hmlVar, 0, 0);
            inz inzVarA = jqq.a(R.drawable.creative_compose_illustration, hmlVar, 0);
            ics icsVarK = egq.k(icoVar, 72.0f);
            hmlVar.v(5004770);
            boolean zD = hmlVar.D(kowVarA);
            Object objF2 = hmlVar.f();
            if (zD || objF2 == obj3) {
                objF2 = new vaw(kowVarA);
                hmlVar.y(objF2);
            }
            hmlVar.o();
            dnc.a(inzVarA, null, kph.d(icsVarK, kowVarB, (fdap) objF2), null, null, 0.0f, null, hmlVar, 48, 120);
            hmlVar.o();
            hmlVar.v(1659148056);
            hmlVar.o();
        }
        return fctx.a;
    }
}
