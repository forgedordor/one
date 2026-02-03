package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfh extends fdcy {
    final /* synthetic */ dpfq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfh(Object obj, dpfq dpfqVar) {
        super(obj);
        this.a = dpfqVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        jyq jyqVar = (jyq) obj2;
        dpfq dpfqVar = this.a;
        kio kioVarD = dpfqVar.d();
        jyqVar.getClass();
        kioVarD.getClass();
        kbi kbiVar = dpfqVar.b;
        kbiVar.getClass();
        dpfqVar.setBackgroundColor(ijg.b(jyqVar.e()));
        if (jyqVar.n() != null || jyqVar.o() != null || jyqVar.q() != null) {
            kbj kbjVarN = jyqVar.n();
            kcc kccVarQ = jyqVar.q();
            if (kccVarQ == null) {
                kccVarQ = kcc.e;
            }
            kbw kbwVarO = jyqVar.o();
            int i = kbwVarO != null ? kbwVarO.a : 0;
            kbx kbxVarP = jyqVar.p();
            Object objA = kbiVar.a(kbjVarN, kccVarQ, i, kbxVarP != null ? kbxVarP.a : 65535).a();
            objA.getClass();
            dpfqVar.setTypeface((Typeface) objA);
        }
        dpfqVar.setTextColor(ijg.b(jyqVar.f()));
        if (kjl.b(jyqVar.g()) != 0) {
            if (kjn.b(kjl.c(jyqVar.g()), 8589934592L)) {
                dpfqVar.setTextSize(dpfqVar.getTextSize() * kjl.a(jyqVar.g()));
            } else {
                dpfqVar.setTextSize(0, kioVarD.em(jyqVar.g()));
            }
        }
        if (kjl.b(jyqVar.i()) != 0) {
            lip.e(dpfqVar, kioVarD.eo(jyqVar.i()));
        }
        dpfqVar.setIncludeFontPadding(false);
        dpfqVar.setTextDirection(true != khm.b(jyqVar.d(), 2) ? 3 : 4);
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
