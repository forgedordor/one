package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zwi extends fcyz implements fdat {
    int a;
    final /* synthetic */ zwj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwi(zwj zwjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zwjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zwi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Intent intentA = aiiw.d("android.settings.SATELLITE_SETTING").a();
            zwj zwjVar = this.b;
            Intent intentPutExtra = intentA.putExtra("sub_id", zwjVar.a.c());
            intentPutExtra.getClass();
            afzc afzcVar = (afzc) zwjVar.b.b();
            agau agauVar = new agau("launchSatelliteSettings", new aeo(), intentPutExtra, null);
            this.a = 1;
            obj = afzcVar.f(agauVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zwi(this.b, fcxyVar);
    }
}
