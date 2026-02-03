package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.MarkConversationNotYetDeliveredAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axsf implements ayms {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;

    public axsf(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
        fcsuVar5.getClass();
        this.e = fcsuVar5;
        fcsuVar6.getClass();
        this.f = fcsuVar6;
    }

    public final /* bridge */ /* synthetic */ Action a(basd basdVar, boolean z) {
        chwq chwqVar = (chwq) this.c.b();
        chwqVar.getClass();
        ains ainsVar = (ains) this.d.b();
        ainsVar.getClass();
        dqsn dqsnVar = (dqsn) this.e.b();
        dqsnVar.getClass();
        baxf baxfVar = (baxf) this.f.b();
        baxfVar.getClass();
        basdVar.getClass();
        return new MarkConversationNotYetDeliveredAction(this.a, this.b, chwqVar, ainsVar, dqsnVar, baxfVar, basdVar, z);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        chwq chwqVar = (chwq) this.c.b();
        chwqVar.getClass();
        ains ainsVar = (ains) this.d.b();
        ainsVar.getClass();
        dqsn dqsnVar = (dqsn) this.e.b();
        dqsnVar.getClass();
        baxf baxfVar = (baxf) this.f.b();
        baxfVar.getClass();
        parcel.getClass();
        return new MarkConversationNotYetDeliveredAction(this.a, this.b, chwqVar, ainsVar, dqsnVar, baxfVar, parcel);
    }
}
