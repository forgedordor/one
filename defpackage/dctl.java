package defpackage;

import android.util.Log;
import com.google.android.apps.tachyon.clientapi.IGetMeetApiAvailabilityCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dctl extends IGetMeetApiAvailabilityCallback.Stub {
    final /* synthetic */ defr a;

    public dctl(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.apps.tachyon.clientapi.IGetMeetApiAvailabilityCallback
    public final void onResult(byte[] bArr) {
        try {
            this.a.b(new dctd(true, true, ((epgi) evsn.parseFrom(epgi.a, bArr, evrr.a())).b));
        } catch (evtj | NullPointerException e) {
            Log.e("DuoStateFetcher", "Error getting Meet registered.", e);
            this.a.b(new dctd(true, true, false));
        }
    }
}
