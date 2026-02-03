package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ClearCloudSyncMessagesAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axmq implements ayms {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public axmq(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.a = fcsuVar2;
        fcsuVar3.getClass();
        this.b = fcsuVar3;
        fcsuVar4.getClass();
        this.c = fcsuVar4;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ClearCloudSyncMessagesAction c(Parcel parcel) {
        ayqd ayqdVar = (ayqd) this.a.b();
        ayqdVar.getClass();
        bxlc bxlcVar = (bxlc) this.b.b();
        bxlcVar.getClass();
        dqsn dqsnVar = (dqsn) this.c.b();
        dqsnVar.getClass();
        parcel.getClass();
        return new ClearCloudSyncMessagesAction(ayqdVar, bxlcVar, dqsnVar, parcel);
    }
}
