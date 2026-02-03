package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xfd extends fcyz implements fdat {
    int a;
    final /* synthetic */ xfi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfd(xfi xfiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xfiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xfd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xfi xfiVar = this.b;
            String string = xfiVar.f.getString(R.string.not_available_on_satellite);
            string.getClass();
            aafw aafwVar = new aafw(string, null, true, 0, null, 117);
            this.a = 1;
            if (xfiVar.v.a(aafwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xfd(this.b, fcxyVar);
    }
}
