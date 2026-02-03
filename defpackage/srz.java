package defpackage;

import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srz extends fcyz implements fdat {
    final /* synthetic */ MessagePartCoreData a;
    final /* synthetic */ ssb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srz(fcxy fcxyVar, MessagePartCoreData messagePartCoreData, ssb ssbVar) {
        super(2, fcxyVar);
        this.a = messagePartCoreData;
        this.b = ssbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((srz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrd ekrdVar = (ekrd) ssb.a.h().h("com/google/android/apps/messaging/audio/amplitude/AmplitudeTriggerListener$queueForAmplitude$1$invokeSuspend$lambda$3$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "AmplitudeTriggerListener.kt");
        MessagePartCoreData messagePartCoreData = this.a;
        ekrdVar.t("Queuing contentUri: %s", String.valueOf(messagePartCoreData.t()));
        ssn ssnVar = this.b.c;
        sso ssoVar = (sso) ssp.a.createBuilder();
        ssoVar.getClass();
        String strA = messagePartCoreData.A().a();
        strA.getClass();
        ssoVar.copyOnWrite();
        ((ssp) ssoVar.instance).b = strA;
        String strB = messagePartCoreData.B().b();
        strB.getClass();
        ssoVar.copyOnWrite();
        ((ssp) ssoVar.instance).c = strB;
        Uri uriT = messagePartCoreData.t();
        uriT.getClass();
        String string = uriT.toString();
        string.getClass();
        ssoVar.copyOnWrite();
        ((ssp) ssoVar.instance).d = string;
        evsn evsnVarBuild = ssoVar.build();
        evsnVarBuild.getClass();
        ((cazj) ssnVar.a.b()).a(cbcu.f("file_audio_levels", (ssp) evsnVarBuild));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        srz srzVar = new srz(fcxyVar, this.a, this.b);
        srzVar.c = obj;
        return srzVar;
    }
}
