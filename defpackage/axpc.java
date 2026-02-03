package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.GetFrecentConversationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axpc extends aypf {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public axpc(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
    }

    @Override // defpackage.aypf
    public final /* bridge */ /* synthetic */ Action a() {
        cphu cphuVar = (cphu) this.b.b();
        cphuVar.getClass();
        axgd axgdVar = (axgd) this.c.b();
        axgdVar.getClass();
        return new GetFrecentConversationsAction(this.a, cphuVar, axgdVar);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        cphu cphuVar = (cphu) this.b.b();
        cphuVar.getClass();
        axgd axgdVar = (axgd) this.c.b();
        axgdVar.getClass();
        parcel.getClass();
        return new GetFrecentConversationsAction(this.a, cphuVar, axgdVar, parcel);
    }
}
