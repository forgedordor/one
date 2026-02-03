package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edyz implements fdat {
    final /* synthetic */ hox a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fdap c;
    final /* synthetic */ edvs d;

    public edyz(hox hoxVar, boolean z, fdap fdapVar, edvs edvsVar) {
        this.a = hoxVar;
        this.b = z;
        this.c = fdapVar;
        this.d = edvsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ioi ioiVar = fwe.a;
            if (ioiVar == null) {
                iog iogVar = new iog("Filled.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                List list = ipr.a;
                ikt iktVar = new ikt(ije.a);
                ArrayList arrayList = new ArrayList(32);
                ioj.i(12.0f, 8.0f, arrayList);
                ioj.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f, arrayList);
                ioj.l(-0.9f, -2.0f, -2.0f, -2.0f, arrayList);
                ioj.l(-2.0f, 0.9f, -2.0f, 2.0f, arrayList);
                ioj.l(0.9f, 2.0f, 2.0f, 2.0f, arrayList);
                ioj.b(arrayList);
                ioj.i(12.0f, 10.0f, arrayList);
                ioj.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f, arrayList);
                ioj.l(0.9f, 2.0f, 2.0f, 2.0f, arrayList);
                ioj.l(2.0f, -0.9f, 2.0f, -2.0f, arrayList);
                ioj.l(-0.9f, -2.0f, -2.0f, -2.0f, arrayList);
                ioj.b(arrayList);
                ioj.i(12.0f, 16.0f, arrayList);
                ioj.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f, arrayList);
                ioj.l(0.9f, 2.0f, 2.0f, 2.0f, arrayList);
                ioj.l(2.0f, -0.9f, 2.0f, -2.0f, arrayList);
                ioj.l(-0.9f, -2.0f, -2.0f, -2.0f, arrayList);
                ioj.b(arrayList);
                iogVar.c(arrayList, 0, "", iktVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                fwe.a = iogVar.a();
                ioiVar = fwe.a;
                ioiVar.getClass();
            }
            dtfn.b(ioiVar, jqu.b(R.string.pqe_overflow_menu_a11y_label, hmlVar), null, 0L, hmlVar, 0, 12);
            final hox hoxVar = this.a;
            boolean zBooleanValue = ((Boolean) hoxVar.a()).booleanValue();
            hmlVar.v(5004770);
            Object objF = hmlVar.f();
            Object obj3 = hmk.a;
            if (objF == obj3) {
                objF = new fdae() { // from class: edys
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        edzd.c(hoxVar, false);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            fdae fdaeVar = (fdae) objF;
            hmlVar.o();
            ico icoVar = ics.e;
            hmlVar.v(1849434622);
            Object objF2 = hmlVar.f();
            if (objF2 == obj3) {
                objF2 = new fdap() { // from class: edyt
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        jto jtoVar = (jto) obj4;
                        jtoVar.getClass();
                        jtk.u(jtoVar, "dropdownMenu");
                        return fctx.a;
                    }
                };
                hmlVar.y(objF2);
            }
            hmlVar.o();
            dtfz.b(zBooleanValue, fdaeVar, jsh.c(icoVar, false, (fdap) objF2), 0L, null, null, null, 0L, 0.0f, hxe.d(-698264557, new edyy(this.b, this.c, this.d, hoxVar), hmlVar), hmlVar, 48, 48, 2040);
        }
        return fctx.a;
    }
}
