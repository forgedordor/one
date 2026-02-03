package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.FixupMessageStatusOnStartupAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axog implements ayms {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;

    public axog(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        fcsuVar5.getClass();
        this.e = fcsuVar5;
        fcsuVar6.getClass();
        this.f = fcsuVar6;
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        bxmv bxmvVar = (bxmv) this.a.b();
        bxmvVar.getClass();
        dqsn dqsnVar = (dqsn) this.b.b();
        dqsnVar.getClass();
        parcel.getClass();
        cogw cogwVar = (cogw) this.d.b();
        cogwVar.getClass();
        return new FixupMessageStatusOnStartupAction(bxmvVar, dqsnVar, parcel, this.c, cogwVar, this.e, this.f);
    }
}
