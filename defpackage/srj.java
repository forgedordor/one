package defpackage;

import android.app.PendingIntent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class srj extends fcyz implements fdat {
    int a;
    final /* synthetic */ srn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srj(srn srnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = srnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((srj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            defn defnVarA = ((dejx) this.b.d.b()).a();
            this.a = 1;
            obj = febo.a(defnVarA, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ((PendingIntent) obj).send();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new srj(this.b, fcxyVar);
    }
}
