package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deac extends dead {
    final /* synthetic */ defr a;

    public deac(defr defrVar) {
        this.a = defrVar;
    }

    @Override // defpackage.dead, com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
    public final void onTokenRetrieved(Status status, PseudonymousIdToken pseudonymousIdToken) {
        dcjb.b(status, pseudonymousIdToken, this.a);
    }
}
