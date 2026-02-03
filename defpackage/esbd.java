package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esbd extends IStatusCallback.Stub {
    final /* synthetic */ defr a;
    final /* synthetic */ esbe b;

    public esbd(esbe esbeVar, defr defrVar) {
        this.a = defrVar;
        this.b = esbeVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        if (this.a.d(null)) {
            if (status.d()) {
                this.b.a.b.b(null);
                return;
            }
            esbe esbeVar = this.b;
            esbeVar.a.b.a(esbw.a(status, "Indexing error, please try again."));
        }
    }
}
