package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddtm extends ddtp {
    final /* synthetic */ defr a;

    public ddtm(defr defrVar) {
        this.a = defrVar;
    }

    @Override // defpackage.ddtp, com.google.android.gms.mobstore.IMobStoreFileCallbacks
    public final void onFileDescriptorOpened(Status status, OpenFileDescriptorResponse openFileDescriptorResponse) {
        dcjb.b(status, openFileDescriptorResponse, this.a);
    }
}
