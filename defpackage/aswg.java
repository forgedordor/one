package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aswg implements eora {
    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        StringBuilder sb = new StringBuilder("RCS-capable ChatEndpoints: ");
        StringBuilder sb2 = new StringBuilder("Non-RCS ChatEndpoints: ");
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            String strB = cqcv.b(((aubq) entry.getKey()).d);
            if (((asts) entry.getValue()).c()) {
                sb.append(strB);
                sb.append(",");
            } else {
                sb2.append(strB);
                sb2.append(",");
            }
        }
        ekrg ekrgVar = aswi.a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleRcsCapabilities");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CapabilitiesLoggingInterceptor$BatchLoggingCallback", "onSuccess", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "CapabilitiesLoggingInterceptor.java")).p(sb);
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleRcsCapabilities");
        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CapabilitiesLoggingInterceptor$BatchLoggingCallback", "onSuccess", 102, "CapabilitiesLoggingInterceptor.java")).p(sb2);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
    }
}
