package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.learning.internal.ExampleStoreQueryCallbackImpl$IteratorAdapter;
import com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddkb {
    private final ExampleStoreQueryCallbackImpl$IteratorAdapter a;
    private final IExampleStoreIteratorCallbackV2 b;
    private final ejya c;
    private final long d;

    public ddkb(ExampleStoreQueryCallbackImpl$IteratorAdapter exampleStoreQueryCallbackImpl$IteratorAdapter, IExampleStoreIteratorCallbackV2 iExampleStoreIteratorCallbackV2, ejya ejyaVar) {
        this.a = exampleStoreQueryCallbackImpl$IteratorAdapter;
        this.b = iExampleStoreIteratorCallbackV2;
        this.c = ejyaVar;
        this.d = ejyaVar.a();
    }

    public final void a(int i, String str) {
        try {
            this.b.onIteratorNextFailure(new Status(i, str), this.c.a() - this.d);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextFailure AIDL call failed, closing iterator", e);
            this.a.close();
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        long jA = this.c.a() - this.d;
        try {
            IExampleStoreIteratorCallbackV2 iExampleStoreIteratorCallbackV2 = this.b;
            IObjectWrapper iObjectWrapperWrap = null;
            IObjectWrapper iObjectWrapperWrap2 = bArr == null ? null : ObjectWrapper.wrap(bArr);
            if (bArr2 != null) {
                iObjectWrapperWrap = ObjectWrapper.wrap(bArr2);
            }
            iExampleStoreIteratorCallbackV2.onIteratorNextSuccess(iObjectWrapperWrap2, iObjectWrapperWrap, jA);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextSuccess AIDL call failed, closing iterator", e);
            this.a.close();
        }
    }
}
