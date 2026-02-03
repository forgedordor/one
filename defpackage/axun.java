package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDeliveryReportAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axun implements ayms {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;

    public axun(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
        fcsuVar5.getClass();
        this.e = fcsuVar5;
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        cmqj cmqjVar = (cmqj) this.c.b();
        cmqjVar.getClass();
        ajhd ajhdVar = (ajhd) this.d.b();
        ajhdVar.getClass();
        dqsn dqsnVar = (dqsn) this.e.b();
        dqsnVar.getClass();
        parcel.getClass();
        return new ProcessDeliveryReportAction(this.a, cogwVar, cmqjVar, ajhdVar, dqsnVar, parcel);
    }
}
