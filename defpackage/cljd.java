package defpackage;

import android.os.PersistableBundle;
import android.telephony.CarrierConfigManager;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cljd extends fcyz implements fdat {
    int a;
    final /* synthetic */ clje b;
    final /* synthetic */ axcm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cljd(clje cljeVar, axcm axcmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cljeVar;
        this.c = axcmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cljd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        PersistableBundle config;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            clje cljeVar = this.b;
            axcm axcmVar = this.c;
            this.a = 1;
            obj = cljeVar.k(axcmVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            CarrierConfigManager carrierConfigManagerJ = this.b.j();
            carrierConfigManagerJ.getClass();
            config = carrierConfigManagerJ.getConfigForSubId(num.intValue(), "carrier_roaming_ntn_connect_type_int");
            config.getClass();
        } else {
            CarrierConfigManager carrierConfigManagerJ2 = this.b.j();
            carrierConfigManagerJ2.getClass();
            config = carrierConfigManagerJ2.getConfig("carrier_roaming_ntn_connect_type_int");
            config.getClass();
        }
        int i2 = config.getInt("carrier_roaming_ntn_connect_type_int");
        if (i2 == 0) {
            ekrw ekrwVarH = clje.a.h();
            ekrwVarH.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl$updateSatelliteConnectionTypeForMyIdentity$1", "invokeSuspend", 230, "ConversationSatelliteConnectionChangeListenerImpl.kt")).t("New satellite connection type on subId %d: automatic", num);
            this.b.e.f(cljh.b);
        } else if (i2 != 1) {
            ekrw ekrwVarH2 = clje.a.h();
            ekrwVarH2.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl$updateSatelliteConnectionTypeForMyIdentity$1", "invokeSuspend", 238, "ConversationSatelliteConnectionChangeListenerImpl.kt")).t("New satellite connection type on subId %d: unknown", num);
            this.b.e.f(cljh.a);
        } else {
            ekrw ekrwVarH3 = clje.a.h();
            ekrwVarH3.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl$updateSatelliteConnectionTypeForMyIdentity$1", "invokeSuspend", 234, "ConversationSatelliteConnectionChangeListenerImpl.kt")).t("New satellite connection type on subId %d: manual", num);
            this.b.e.f(cljh.c);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cljd(this.b, this.c, fcxyVar);
    }
}
