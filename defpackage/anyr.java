package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.Map;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anyr implements awhf {
    final /* synthetic */ anys a;

    public anyr(anys anysVar) {
        this.a = anysVar;
    }

    @Override // defpackage.awhf
    public final void a(awhi awhiVar, Map map) {
        if (awhiVar != awhi.RCS) {
            return;
        }
        anys anysVar = this.a;
        Optional optionalE = anysVar.e.e();
        if (optionalE.isEmpty() || !map.containsKey(optionalE.get())) {
            return;
        }
        eksl ekslVar = (eksl) anys.a.h();
        ekslVar.X(cqnc.H, anysVar.d());
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier$RcsChangeListener", "onBatchCapabilitiesUpdate", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "ProviderRcsCapabilitiesSupplier.java")).q("RCS Capabilities updated in batch update.");
        anysVar.b.c(new Supplier() { // from class: anyp
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "ProviderRcsCapabilitiesSupplier::onBatchCapabilitiesUpdate");
    }

    @Override // defpackage.awhf
    public final void b(awhi awhiVar, aubq aubqVar) {
        if (awhiVar != awhi.RCS) {
            return;
        }
        anys anysVar = this.a;
        if (aubqVar.equals((aubq) anysVar.e.e().orElse(null))) {
            eksl ekslVar = (eksl) anys.a.h();
            ekslVar.X(cqnc.H, anysVar.d());
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier$RcsChangeListener", "onCapabilitiesUpdate", 181, "ProviderRcsCapabilitiesSupplier.java")).q("RCS Capabilities Updated.");
            anysVar.b.c(new Supplier() { // from class: anyq
                @Override // java.util.function.Supplier
                public final Object get() {
                    return null;
                }
            }, "ProviderRcsCapabilitiesSupplier::onRcsCapabilitiesUpdate");
        }
    }
}
