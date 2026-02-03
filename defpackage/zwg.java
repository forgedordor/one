package defpackage;

import android.content.Intent;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwg extends fcyz implements fdat {
    int a;
    final /* synthetic */ zwh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwg(zwh zwhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zwhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zwg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            zwh zwhVar = this.b;
            this.a = 1;
            obj = fdtc.a(zwhVar.d, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ekgb ekgbVar = (ekgb) obj;
        if (!ekgbVar.isEmpty() && alpd.b(((ResolvedRecipient) ekgbVar.get(0)).g().n())) {
            zwh zwhVar2 = this.b;
            ((ekrd) zwh.a.h().h("com/google/android/apps/messaging/conversation2/satellite/EndSatelliteDemoConversationStoppedListener", "tryToEndSatelliteSession", 62, "EndSatelliteDemoConversationStoppedListener.kt")).q("Force ending satellite demo with END_SATELLITE_SESSION intent.");
            Intent intent = new Intent();
            intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            intent.setPackage("com.google.android.apps.stargate");
            intent.setAction("com.google.android.apps.stargate.END_SATELLITE_SESSION");
            intent.putExtra("force_end_session", true);
            zwhVar2.b.sendBroadcast(intent);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zwg(this.b, fcxyVar);
    }
}
