package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyke extends fcyz implements fdat {
    int a;
    final /* synthetic */ cykk b;
    final /* synthetic */ Activity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyke(cykk cykkVar, Activity activity, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cykkVar;
        this.c = activity;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyke) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cykk cykkVar = this.b;
            this.a = 1;
            if (cykkVar.f.b(this) == fcylVar) {
                return fcylVar;
            }
        }
        this.b.b(this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cyke(this.b, this.c, fcxyVar);
    }
}
