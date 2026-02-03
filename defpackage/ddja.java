package defpackage;

import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2;
import com.google.android.gms.learning.internal.IExampleStoreV2;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddja extends IExampleStoreV2.Stub {
    final /* synthetic */ ddjb a;

    public ddja(ddjb ddjbVar) {
        this.a = ddjbVar;
    }

    @Override // com.google.android.gms.learning.internal.IExampleStoreV2
    public final void startQuery(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IExampleStoreQueryCallbackV2 iExampleStoreQueryCallbackV2) {
        byte[] bArr = (byte[]) ObjectWrapper.unwrap(iObjectWrapper);
        byte[] bArr2 = (byte[]) ObjectWrapper.unwrap(iObjectWrapper2);
        ddkc ddkcVar = new ddkc(iExampleStoreQueryCallbackV2);
        etpm etpmVar = etpm.a;
        this.a.b(str, bArr, bArr2, ddkcVar);
    }

    @Override // com.google.android.gms.learning.internal.IExampleStoreV2
    public final void startQueryWithSelectorContext(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IExampleStoreQueryCallbackV2 iExampleStoreQueryCallbackV2, IObjectWrapper iObjectWrapper3) {
        etpm etpmVar = etpm.a;
        byte[] bArr = (byte[]) ObjectWrapper.unwrap(iObjectWrapper3);
        if (bArr != null) {
            try {
            } catch (evtj e) {
                new ddkc(iExampleStoreQueryCallbackV2).a(8, e.getMessage());
                return;
            }
        }
        this.a.b(str, (byte[]) ObjectWrapper.unwrap(iObjectWrapper), (byte[]) ObjectWrapper.unwrap(iObjectWrapper2), new ddkc(iExampleStoreQueryCallbackV2));
    }

    @Override // com.google.android.gms.learning.internal.IExampleStoreV2
    public final boolean supportsSelectorContext() {
        return true;
    }
}
