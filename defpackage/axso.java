package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.NoConfirmationMessageSendAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axso extends aypn {
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
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;

    public axso(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18) {
        fcsuVar.getClass();
        this.b = fcsuVar;
        fcsuVar2.getClass();
        this.c = fcsuVar2;
        fcsuVar3.getClass();
        this.d = fcsuVar3;
        fcsuVar4.getClass();
        this.e = fcsuVar4;
        fcsuVar5.getClass();
        this.f = fcsuVar5;
        fcsuVar6.getClass();
        this.g = fcsuVar6;
        fcsuVar7.getClass();
        this.h = fcsuVar7;
        fcsuVar8.getClass();
        this.i = fcsuVar8;
        fcsuVar9.getClass();
        this.j = fcsuVar9;
        fcsuVar10.getClass();
        this.k = fcsuVar10;
        fcsuVar11.getClass();
        this.l = fcsuVar11;
        fcsuVar12.getClass();
        this.m = fcsuVar12;
        fcsuVar13.getClass();
        this.n = fcsuVar13;
        this.o = fcsuVar14;
        fcsuVar15.getClass();
        this.p = fcsuVar15;
        fcsuVar16.getClass();
        this.q = fcsuVar16;
        fcsuVar17.getClass();
        this.r = fcsuVar17;
        fcsuVar18.getClass();
    }

    @Override // defpackage.aypn
    public final /* bridge */ /* synthetic */ Action a() {
        Context context = (Context) this.b.b();
        context.getClass();
        avmp avmpVar = (avmp) this.d.b();
        avmpVar.getClass();
        ains ainsVar = (ains) this.f.b();
        ainsVar.getClass();
        cggc cggcVar = (cggc) this.i.b();
        cggcVar.getClass();
        cogw cogwVar = (cogw) this.o.b();
        cogwVar.getClass();
        fcsu fcsuVar = this.p;
        fcsu fcsuVar2 = this.q;
        fcsu fcsuVar3 = this.r;
        fcsu fcsuVar4 = this.j;
        fcsu fcsuVar5 = this.k;
        fcsu fcsuVar6 = this.l;
        fcsu fcsuVar7 = this.m;
        fcsu fcsuVar8 = this.n;
        fcsu fcsuVar9 = this.g;
        fcsu fcsuVar10 = this.h;
        return new NoConfirmationMessageSendAction(context, this.c, avmpVar, this.e, ainsVar, fcsuVar9, fcsuVar10, cggcVar, fcsuVar4, fcsuVar5, fcsuVar6, fcsuVar7, fcsuVar8, cogwVar, fcsuVar, fcsuVar2, fcsuVar3);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.b.b();
        context.getClass();
        avmp avmpVar = (avmp) this.d.b();
        avmpVar.getClass();
        ains ainsVar = (ains) this.f.b();
        ainsVar.getClass();
        cggc cggcVar = (cggc) this.i.b();
        cggcVar.getClass();
        cogw cogwVar = (cogw) this.o.b();
        cogwVar.getClass();
        parcel.getClass();
        fcsu fcsuVar = this.p;
        fcsu fcsuVar2 = this.j;
        fcsu fcsuVar3 = this.k;
        fcsu fcsuVar4 = this.l;
        fcsu fcsuVar5 = this.m;
        fcsu fcsuVar6 = this.n;
        fcsu fcsuVar7 = this.r;
        fcsu fcsuVar8 = this.q;
        fcsu fcsuVar9 = this.g;
        fcsu fcsuVar10 = this.h;
        return new NoConfirmationMessageSendAction(context, this.c, avmpVar, this.e, ainsVar, fcsuVar9, fcsuVar10, cggcVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, fcsuVar6, fcsuVar7, fcsuVar8, cogwVar, fcsuVar, parcel);
    }
}
