package defpackage;

import com.google.android.gms.auth.folsom.internal.IStringListCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbus extends IStringListCallback.Stub {
    final /* synthetic */ defr a;

    public dbus(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.auth.folsom.internal.IStringListCallback
    public final void onResult(Status status, String[] strArr, ApiMetadata apiMetadata) {
        if (status.d()) {
            this.a.b(Arrays.asList(strArr));
        } else {
            this.a.a(dcjq.a(status));
        }
    }
}
