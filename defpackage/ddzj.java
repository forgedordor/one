package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddzj extends IGetStorageInfoCallbacks.Stub {
    final /* synthetic */ defr a;

    public ddzj(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks
    public final void onResult(Status status, byte[] bArr) {
        if (!status.d()) {
            dcjb.b(status, null, this.a);
            return;
        }
        try {
            evrr evrrVar = evrr.a;
            evuq evuqVar = evuq.a;
            dcjb.b(status, (eabb) evsn.parseFrom(eabb.a, bArr, evrr.a), this.a);
        } catch (evtj e) {
            this.a.a(e);
        }
    }
}
