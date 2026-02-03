package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djjk implements fdau {
    final /* synthetic */ djjn a;
    final /* synthetic */ hox b;
    final /* synthetic */ fdap c;

    public djjk(djjn djjnVar, hox hoxVar, fdap fdapVar) {
        this.a = djjnVar;
        this.b = hoxVar;
        this.c = fdapVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fdae fdaeVar;
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        icsVar.getClass();
        hmlVar.v(1130044996);
        Context context = (Context) hmlVar.e(AndroidCompositionLocals_androidKt.b);
        iqa iqaVar = (iqa) hmlVar.e(jmh.h);
        Object objE = hmlVar.e(jmh.j);
        kji kjiVar = kji.a;
        Object objF = hmlVar.f();
        Object obj4 = hmk.a;
        if (objF == obj4) {
            objF = hob.a(fcyi.a, hmlVar);
            hmlVar.y(objF);
        }
        fdjx fdjxVar = (fdjx) objF;
        hmlVar.v(1849434622);
        Object objF2 = hmlVar.f();
        if (objF2 == obj4) {
            hpl hplVar = new hpl(false, hsi.a);
            hmlVar.y(hplVar);
            objF2 = hplVar;
        }
        hox hoxVar = (hox) objF2;
        hmlVar.o();
        hmlVar.v(1849434622);
        Object objF3 = hmlVar.f();
        if (objF3 == obj4) {
            hpl hplVar2 = new hpl(false, hsi.a);
            hmlVar.y(hplVar2);
            objF3 = hplVar2;
        }
        hox hoxVar2 = (hox) objF3;
        hmlVar.o();
        fdci fdciVar = new fdci();
        hmlVar.v(1849434622);
        Object objF4 = hmlVar.f();
        if (objF4 == obj4) {
            hmlVar.y(null);
            objF4 = null;
        }
        hmlVar.o();
        fdciVar.a = (fdkf) objF4;
        djjn djjnVar = this.a;
        hmlVar.v(-1746271574);
        boolean zD = hmlVar.D(djjnVar) | hmlVar.F(context);
        hox hoxVar3 = this.b;
        boolean zD2 = zD | hmlVar.D(hoxVar3);
        Object objF5 = hmlVar.f();
        if (zD2 || objF5 == obj4) {
            fdaeVar = null;
            objF5 = new djje(djjnVar, context, hoxVar3, null);
            hmlVar.y(objF5);
        } else {
            fdaeVar = null;
        }
        hmlVar.o();
        hob.g(djjnVar.h, (fdat) objF5, hmlVar);
        fdap fdapVar = this.c;
        fctx fctxVar = fctx.a;
        fdae fdaeVar2 = fdaeVar;
        ics icsVarA = itf.a(icsVar, fctxVar, new djjj(fdciVar, djjnVar, context, fdjxVar, hoxVar3, iqaVar, hoxVar, hoxVar2, fdapVar));
        fdap fdapVar2 = djjnVar.f;
        djis djisVar = djjnVar.c;
        ics icsVarA2 = itf.a(icsVarA, fctxVar, new djiy(new fdcf(), new fdcf(), hoxVar, hoxVar2, hoxVar3, fdapVar2, context, objE == kjiVar, djisVar != null ? djisVar.c : fdaeVar2, iqaVar));
        fdap fdapVar3 = djjnVar.g;
        ics icsVarA3 = itf.a(icsVarA2, fdapVar3, new djjd(new fdcf(), fdapVar3, context));
        hmlVar.o();
        return icsVarA3;
    }
}
