package defpackage;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.internal.AbstractPeopleCallbacks;
import com.google.android.gms.people.internal.PeopleClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddxe extends AbstractPeopleCallbacks {
    private final dcgq a;

    public ddxe(dcgq dcgqVar) {
        this.a = dcgqVar;
    }

    @Override // com.google.android.gms.people.internal.AbstractPeopleCallbacks, com.google.android.gms.people.internal.IPeopleCallbacks
    public final void onParcelFileDescriptorLoaded(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        Status statusO = PeopleClientImpl.O(i, bundle);
        if (bundle2 != null) {
            bundle2.getBoolean("rewindable");
            bundle2.getInt("width");
            bundle2.getInt("height");
        }
        this.a.c(new ddxg(statusO, parcelFileDescriptor));
    }
}
