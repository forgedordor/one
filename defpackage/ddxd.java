package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.internal.AbstractPeopleCallbacks;
import com.google.android.gms.people.internal.PeopleClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddxd extends AbstractPeopleCallbacks {
    private final dcgq a;

    public ddxd(dcgq dcgqVar) {
        this.a = dcgqVar;
    }

    @Override // com.google.android.gms.people.internal.AbstractPeopleCallbacks, com.google.android.gms.people.internal.IPeopleCallbacks
    public final void onDataHolderLoaded(int i, Bundle bundle, DataHolder dataHolder) {
        this.a.c(new ddxf(PeopleClientImpl.O(i, bundle), dataHolder == null ? null : new ddxp(dataHolder)));
    }
}
