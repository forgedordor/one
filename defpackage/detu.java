package defpackage;

import com.google.android.gms.wearable.internal.PutDataResponse;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class detu extends deto {
    private final List a;

    public detu(dcgq dcgqVar, List list) {
        super(dcgqVar);
        this.a = list;
    }

    @Override // com.google.android.gms.wearable.internal.AbstractWearableCallbacks, com.google.android.gms.wearable.internal.IWearableCallbacks
    public final void onPutData(PutDataResponse putDataResponse) {
        int i = putDataResponse.a;
        a(new deqt(detm.a(i), putDataResponse.b));
        if (i != 0) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((FutureTask) it.next()).cancel(true);
            }
        }
    }
}
