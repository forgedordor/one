package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wfw extends fcyz implements fdat {
    int a;
    final /* synthetic */ wgk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfw(wgk wgkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wgkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wfw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Intent intentCreateRequestRoleIntent = craf.c ? abo$$ExternalSyntheticApiModelOutline0.m(this.b.b.getSystemService(abo$$ExternalSyntheticApiModelOutline0.m42m())).createRequestRoleIntent("android.app.role.SMS") : new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT").putExtra("package", this.b.b.getPackageName());
            intentCreateRequestRoleIntent.getClass();
            afzc afzcVar = (afzc) this.b.e.b();
            agau agauVar = new agau("changeDefaultSmsApp", new aeo(), intentCreateRequestRoleIntent, null);
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
        return new wfw(this.b, fcxyVar);
    }
}
