package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.execution.DeferBackgroundWorkAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayoo implements ayms {
    public final fcsu a;

    public ayoo(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final DeferBackgroundWorkAction c(Parcel parcel) {
        ayoe ayoeVar = (ayoe) this.a.b();
        ayoeVar.getClass();
        parcel.getClass();
        return new DeferBackgroundWorkAction(ayoeVar, parcel);
    }
}
