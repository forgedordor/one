package defpackage;

import com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddvq extends AbstractContactsSyncServiceCallbacks {
    final /* synthetic */ dcib a;

    public ddvq(dcib dcibVar) {
        this.a = dcibVar;
    }

    @Override // com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks, com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public final void onDeviceContactsSyncSettingChanged() {
        this.a.b(new ddvp());
    }
}
