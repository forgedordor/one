package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.RecurringTelemetryUploaderAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayds implements ayms {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;

    public ayds(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
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
        this.h = fcsuVar8;
        fcsuVar9.getClass();
        this.i = fcsuVar9;
    }

    public final /* bridge */ /* synthetic */ Action a() {
        Context context = (Context) this.a.b();
        context.getClass();
        ajat ajatVar = (ajat) this.b.b();
        ajatVar.getClass();
        ains ainsVar = (ains) this.c.b();
        ainsVar.getClass();
        ajbk ajbkVar = (ajbk) this.d.b();
        ajbkVar.getClass();
        cnoy cnoyVar = (cnoy) this.e.b();
        cnoyVar.getClass();
        cnod cnodVar = (cnod) this.f.b();
        cnodVar.getClass();
        eosc eoscVar = (eosc) this.g.b();
        eoscVar.getClass();
        eosc eoscVar2 = (eosc) this.h.b();
        eoscVar2.getClass();
        return new RecurringTelemetryUploaderAction(context, ajatVar, ainsVar, ajbkVar, cnoyVar, cnodVar, eoscVar, eoscVar2, this.i);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        ajat ajatVar = (ajat) this.b.b();
        ajatVar.getClass();
        ains ainsVar = (ains) this.c.b();
        ainsVar.getClass();
        ajbk ajbkVar = (ajbk) this.d.b();
        ajbkVar.getClass();
        eosc eoscVar = (eosc) this.g.b();
        eoscVar.getClass();
        eosc eoscVar2 = (eosc) this.h.b();
        eoscVar2.getClass();
        cnoy cnoyVar = (cnoy) this.e.b();
        cnoyVar.getClass();
        cnod cnodVar = (cnod) this.f.b();
        cnodVar.getClass();
        parcel.getClass();
        return new RecurringTelemetryUploaderAction(context, ajatVar, ainsVar, ajbkVar, eoscVar, eoscVar2, cnoyVar, cnodVar, this.i, parcel);
    }
}
