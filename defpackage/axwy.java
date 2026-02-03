package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessFileTransferAction;
import com.google.android.ims.rcsservice.events.Event;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axwy implements aypt {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;

    public axwy(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13) {
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
        fcsuVar7.getClass();
        this.g = fcsuVar7;
        fcsuVar8.getClass();
        this.h = fcsuVar8;
        fcsuVar9.getClass();
        this.i = fcsuVar9;
        fcsuVar10.getClass();
        this.j = fcsuVar10;
        fcsuVar11.getClass();
        this.k = fcsuVar11;
        fcsuVar12.getClass();
        this.l = fcsuVar12;
        fcsuVar13.getClass();
        this.m = fcsuVar13;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ProcessFileTransferAction c(Parcel parcel) {
        bbfn bbfnVar = (bbfn) this.a.b();
        bbfnVar.getClass();
        ayqn ayqnVar = (ayqn) this.b.b();
        ayqnVar.getClass();
        cggg cgggVar = (cggg) this.c.b();
        cgggVar.getClass();
        cogw cogwVar = (cogw) this.f.b();
        cogwVar.getClass();
        ajhd ajhdVar = (ajhd) this.g.b();
        ajhdVar.getClass();
        dqsn dqsnVar = (dqsn) this.h.b();
        dqsnVar.getClass();
        Optional optional = (Optional) ((eyig) this.i).a;
        coyz coyzVar = (coyz) this.j.b();
        coyzVar.getClass();
        parcel.getClass();
        return new ProcessFileTransferAction(bbfnVar, ayqnVar, cgggVar, this.d, this.e, cogwVar, ajhdVar, dqsnVar, optional, this.k, coyzVar, this.l, this.m, parcel);
    }

    public final ProcessFileTransferAction b(Event event) {
        bbfn bbfnVar = (bbfn) this.a.b();
        bbfnVar.getClass();
        ayqn ayqnVar = (ayqn) this.b.b();
        ayqnVar.getClass();
        cggg cgggVar = (cggg) this.c.b();
        cgggVar.getClass();
        cogw cogwVar = (cogw) this.f.b();
        cogwVar.getClass();
        ajhd ajhdVar = (ajhd) this.g.b();
        ajhdVar.getClass();
        dqsn dqsnVar = (dqsn) this.h.b();
        dqsnVar.getClass();
        Optional optional = (Optional) ((eyig) this.i).a;
        coyz coyzVar = (coyz) this.j.b();
        coyzVar.getClass();
        event.getClass();
        fcsu fcsuVar = this.k;
        return new ProcessFileTransferAction(bbfnVar, ayqnVar, cgggVar, this.d, this.e, cogwVar, ajhdVar, dqsnVar, optional, coyzVar, fcsuVar, this.l, this.m, event);
    }
}
