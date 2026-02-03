package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddtn extends ddtp {
    final /* synthetic */ defr a;

    public ddtn(defr defrVar) {
        this.a = defrVar;
    }

    @Override // defpackage.ddtp, com.google.android.gms.mobstore.IMobStoreFileCallbacks
    public final void onFileDeleted(Status status) {
        dcjb.a(status, this.a);
    }
}
