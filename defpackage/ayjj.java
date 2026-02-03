package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.SyncTelephonyThreadsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.actionfactories.SyncTelephonyThreadsActionFactory$SchedulableSyncTelephonyThreadsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayjj implements ayms {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;

    public ayjj(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
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
        fcsuVar7.getClass();
        this.g = fcsuVar7;
        fcsuVar8.getClass();
        this.h = fcsuVar8;
        fcsuVar9.getClass();
        this.i = fcsuVar9;
    }

    public final /* bridge */ /* synthetic */ SyncTelephonyThreadsActionFactory$SchedulableSyncTelephonyThreadsAction a(boolean z) {
        cmot cmotVar = (cmot) this.d.b();
        cmotVar.getClass();
        ciux ciuxVar = (ciux) this.g.b();
        ciuxVar.getClass();
        fcsu fcsuVar = this.h;
        fcsu fcsuVar2 = this.i;
        return new SyncTelephonyThreadsAction((fcsu<cmqf>) this.a, (fcsu<baqt>) this.b, (fcsu<cdww>) this.c, cmotVar, (fcsu<cnod>) this.e, (fcsu<ayqd>) this.f, ciuxVar, (fcsu<aill>) fcsuVar, (fcsu<cnwj>) fcsuVar2, z);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        cmot cmotVar = (cmot) this.d.b();
        cmotVar.getClass();
        ciux ciuxVar = (ciux) this.g.b();
        ciuxVar.getClass();
        parcel.getClass();
        fcsu fcsuVar = this.h;
        fcsu fcsuVar2 = this.i;
        return new SyncTelephonyThreadsAction((fcsu<cmqf>) this.a, (fcsu<baqt>) this.b, (fcsu<cdww>) this.c, cmotVar, (fcsu<cnod>) this.e, (fcsu<ayqd>) this.f, ciuxVar, (fcsu<aill>) fcsuVar, (fcsu<cnwj>) fcsuVar2, parcel);
    }
}
