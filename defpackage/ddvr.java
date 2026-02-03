package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddvr extends AbstractContactsSyncServiceCallbacks {
    final /* synthetic */ defr a;

    public ddvr(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks, com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public final void onStatus(Status status) {
        dcjb.c(status, true, this.a);
    }
}
