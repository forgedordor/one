package defpackage;

import com.google.android.gms.asterism.GetAsterismConsentResponse;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dblb extends dblf {
    final /* synthetic */ defr a;

    public dblb(defr defrVar) {
        this.a = defrVar;
    }

    @Override // defpackage.dblf, com.google.android.gms.asterism.internal.IAsterismCallbacks
    public final void onConsentFetched(Status status, GetAsterismConsentResponse getAsterismConsentResponse) {
        dcjb.b(status, getAsterismConsentResponse, this.a);
    }
}
