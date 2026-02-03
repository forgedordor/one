package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.SelfParticipantsRefreshAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayge implements ayms {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public ayge(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SelfParticipantsRefreshAction c(Parcel parcel) {
        parcel.getClass();
        return new SelfParticipantsRefreshAction(this.a, this.b, this.c, parcel);
    }

    public final /* bridge */ /* synthetic */ ThrottledAction b() {
        return new SelfParticipantsRefreshAction(this.a, this.b, this.c);
    }
}
