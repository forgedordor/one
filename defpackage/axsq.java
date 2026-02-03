package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ParticipantFullRefreshAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axsq implements ayms {
    private final fcsu a;

    public axsq(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    public final /* bridge */ /* synthetic */ Action a() {
        bxjn bxjnVar = (bxjn) this.a.b();
        bxjnVar.getClass();
        return new ParticipantFullRefreshAction(bxjnVar);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        bxjn bxjnVar = (bxjn) this.a.b();
        bxjnVar.getClass();
        parcel.getClass();
        return new ParticipantFullRefreshAction(bxjnVar, parcel);
    }
}
