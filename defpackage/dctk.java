package defpackage;

import android.util.Log;
import com.google.android.apps.tachyon.clientapi.IGetRegisteredIdTypeCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dctk extends IGetRegisteredIdTypeCallback.Stub {
    final /* synthetic */ defr a;

    public dctk(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.apps.tachyon.clientapi.IGetRegisteredIdTypeCallback
    public final void onResult(byte[] bArr) {
        try {
            int i = ((epgg) evsn.parseFrom(epgg.a, bArr, evrr.a())).b;
            int iA = felr.a(i);
            if (iA == 0 || iA != 2) {
                int iA2 = felr.a(i);
                if (iA2 != 0 && iA2 != 1) {
                    this.a.b(true);
                    return;
                }
            }
            this.a.b(false);
        } catch (evtj | NullPointerException e) {
            if (this.a.c(e)) {
                return;
            }
            Log.e("DuoStateFetcher", "Error setting exception--task is already complete.", e);
        }
    }
}
