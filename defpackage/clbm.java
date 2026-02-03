package defpackage;

import com.google.android.apps.messaging.shared.receiver.SpatulaSettingsBroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clbm extends fcyz implements fdat {
    int a;
    final /* synthetic */ SpatulaSettingsBroadcastReceiver b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clbm(SpatulaSettingsBroadcastReceiver spatulaSettingsBroadcastReceiver, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = spatulaSettingsBroadcastReceiver;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clbm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fcsu fcsuVar = this.b.b;
            if (fcsuVar == null) {
                fdbq.c("spatulaSettingsProxy");
                fcsuVar = null;
            }
            csmf csmfVar = (csmf) fcsuVar.b();
            String str = this.c;
            this.a = 1;
            if (csmfVar.b(str, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new clbm(this.b, this.c, fcxyVar);
    }
}
