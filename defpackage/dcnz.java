package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.GetIidTokenResponse;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcnz extends dcob {
    final /* synthetic */ defr a;

    public dcnz(defr defrVar) {
        this.a = defrVar;
    }

    @Override // defpackage.dcob, com.google.android.gms.constellation.internal.IConstellationCallbacks
    public final void onIidTokenGenerated(Status status, GetIidTokenResponse getIidTokenResponse) {
        try {
            dcjb.b(status, getIidTokenResponse, this.a);
        } catch (RejectedExecutionException e) {
            dcoc.a.f("Rejected API result: ", e, new Object[0]);
        }
    }
}
