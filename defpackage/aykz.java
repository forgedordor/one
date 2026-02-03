package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateRbmBotParticipantAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aykz implements ayms {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public aykz(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UpdateRbmBotParticipantAction c(Parcel parcel) {
        bxlc bxlcVar = (bxlc) this.c.b();
        bxlcVar.getClass();
        dqsn dqsnVar = (dqsn) this.d.b();
        dqsnVar.getClass();
        parcel.getClass();
        return new UpdateRbmBotParticipantAction(this.a, this.b, bxlcVar, dqsnVar, parcel);
    }
}
