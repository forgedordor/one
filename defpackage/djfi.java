package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djfi implements fdat {
    final /* synthetic */ djex a;
    final /* synthetic */ djfn b;
    final /* synthetic */ hox c;

    public djfi(djex djexVar, djfn djfnVar, hox hoxVar) {
        this.a = djexVar;
        this.b = djfnVar;
        this.c = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djex djexVar = this.a;
            djfn djfnVar = this.b;
            Integer num = djfnVar.b;
            djfm.h(djexVar.c, jqu.c(R.string.compose_icon_sim_content_description, new Object[]{Integer.valueOf((num != null ? num.intValue() : 0) + 1), Integer.valueOf(djfnVar.a.size())}, hmlVar), efy.j(ics.e, 0.0f, 0.0f, 0.0f, true != ((Boolean) dljt.b(hmlVar).j.invoke()).booleanValue() ? 0.0f : 8.0f, 7), hmlVar, 0);
            final hox hoxVar = this.c;
            boolean zF = djfm.f(hoxVar);
            hmlVar.v(5004770);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new fdae() { // from class: djfh
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        djfm.c(hoxVar, false);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            djfm.d(djfnVar, zF, (fdae) objF, hmlVar, 384);
        }
        return fctx.a;
    }
}
