package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcnx extends dcob {
    final /* synthetic */ defr a;

    public dcnx(defr defrVar) {
        this.a = defrVar;
    }

    @Override // defpackage.dcob, com.google.android.gms.constellation.internal.IConstellationCallbacks
    public final void onPhoneNumberVerificationsCompleted(Status status, VerifyPhoneNumberResponse verifyPhoneNumberResponse) {
        try {
            dcjb.b(status, verifyPhoneNumberResponse, this.a);
        } catch (RejectedExecutionException e) {
            dcoc.a.f("Rejected API result: ", e, new Object[0]);
        }
    }
}
