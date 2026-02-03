package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axpa implements ayms {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;

    public axpa(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
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
        this.f = fcsuVar6;
        this.g = fcsuVar7;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [eygg, java.lang.Object] */
    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final GenericWorkerQueueAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        byfd byfdVar = (byfd) this.d.b();
        byfdVar.getClass();
        eosc eoscVar = (eosc) this.e.b();
        eoscVar.getClass();
        ?? B = this.f.b();
        B.getClass();
        cogw cogwVar = (cogw) this.g.b();
        cogwVar.getClass();
        parcel.getClass();
        return new GenericWorkerQueueAction(context, this.b, this.c, byfdVar, eoscVar, B, cogwVar, parcel);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [eygg, java.lang.Object] */
    public final /* bridge */ /* synthetic */ ThrottledAction b() {
        Context context = (Context) this.a.b();
        context.getClass();
        byfd byfdVar = (byfd) this.d.b();
        byfdVar.getClass();
        eosc eoscVar = (eosc) this.e.b();
        eoscVar.getClass();
        ?? B = this.f.b();
        B.getClass();
        cogw cogwVar = (cogw) this.g.b();
        cogwVar.getClass();
        return new GenericWorkerQueueAction(context, this.b, this.c, byfdVar, eoscVar, B, cogwVar);
    }
}
