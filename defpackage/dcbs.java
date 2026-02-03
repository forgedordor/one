package defpackage;

import com.google.android.gms.clearcut.sampler.IDeviceSamplerCallback;
import com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcbs extends IDeviceSamplerCallback.Stub {
    private final defr a;

    public dcbs(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.clearcut.sampler.IDeviceSamplerCallback
    public final void onDecisionRetrieved(Status status, SamplerDecisionParcelable samplerDecisionParcelable) {
        dcjb.b(status, samplerDecisionParcelable, this.a);
    }
}
