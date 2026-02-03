package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateCloudSyncMessageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayjx implements ayms {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;

    public ayjx(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
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
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UpdateCloudSyncMessageAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        cggc cggcVar = (cggc) this.d.b();
        cggcVar.getClass();
        cggg cgggVar = (cggg) this.e.b();
        cgggVar.getClass();
        dqsn dqsnVar = (dqsn) this.f.b();
        dqsnVar.getClass();
        auuh auuhVar = (auuh) this.g.b();
        auuhVar.getClass();
        parcel.getClass();
        return new UpdateCloudSyncMessageAction(context, this.b, this.c, cggcVar, cgggVar, dqsnVar, auuhVar, parcel);
    }
}
