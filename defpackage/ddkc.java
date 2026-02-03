package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.internal.ExampleStoreQueryCallbackImpl$IteratorAdapter;
import com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddkc {
    private final IExampleStoreQueryCallbackV2 a;
    private final ejya b;
    private final long c;

    public ddkc(IExampleStoreQueryCallbackV2 iExampleStoreQueryCallbackV2) {
        this.a = iExampleStoreQueryCallbackV2;
        ejya ejyaVar = ejsz.a;
        this.b = ejyaVar;
        this.c = ejyaVar.a();
    }

    public final void a(int i, String str) {
        try {
            this.a.onStartQueryFailure(new Status(i, str), this.b.a() - this.c);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onStartQueryFailure AIDL call failed, ignoring", e);
        }
    }

    public final void b(ddix ddixVar) {
        ejya ejyaVar = this.b;
        long jA = ejyaVar.a() - this.c;
        ExampleStoreQueryCallbackImpl$IteratorAdapter exampleStoreQueryCallbackImpl$IteratorAdapter = new ExampleStoreQueryCallbackImpl$IteratorAdapter(ddixVar, ejyaVar);
        try {
            this.a.onStartQuerySuccess(exampleStoreQueryCallbackImpl$IteratorAdapter, jA);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onStartQuerySuccess AIDL call failed, closing iterator", e);
            exampleStoreQueryCallbackImpl$IteratorAdapter.close();
        }
    }
}
