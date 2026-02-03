package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zss extends fcyz implements fdat {
    int a;
    final /* synthetic */ ztv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zss(ztv ztvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ztvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zss) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ztv ztvVar = this.b;
            aaft aaftVar = (aaft) ztvVar.w.b();
            String string = ztvVar.g.getString(R.string.business_action_failed_to_launch);
            string.getClass();
            aafw aafwVar = new aafw(string, null, false, 2, null, 109);
            this.a = 1;
            if (aaftVar.a(aafwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zss(this.b, fcxyVar);
    }
}
