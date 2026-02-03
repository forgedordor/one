package defpackage;

import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbld extends dblf {
    final /* synthetic */ defr a;

    public dbld(defr defrVar) {
        this.a = defrVar;
    }

    @Override // defpackage.dblf, com.google.android.gms.asterism.internal.IAsterismCallbacks
    public final void onConsentRegistered(Status status, SetAsterismConsentResponse setAsterismConsentResponse) {
        dcjb.b(status, setAsterismConsentResponse, this.a);
    }
}
