package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.RedownloadMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aydv extends aypl {
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

    public aydv(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
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
        this.j = fcsuVar10;
        fcsuVar11.getClass();
        this.k = fcsuVar11;
    }

    @Override // defpackage.aypl
    public final /* bridge */ /* synthetic */ Action a(MessageIdType messageIdType) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.c.b();
        cogwVar.getClass();
        avmp avmpVar = (avmp) this.d.b();
        avmpVar.getClass();
        ayqj ayqjVar = (ayqj) this.e.b();
        ayqjVar.getClass();
        ayqd ayqdVar = (ayqd) this.f.b();
        ayqdVar.getClass();
        axxy axxyVar = (axxy) this.g.b();
        axxyVar.getClass();
        messageIdType.getClass();
        return new RedownloadMessageAction(context, this.b, cogwVar, avmpVar, ayqjVar, ayqdVar, axxyVar, this.h, this.i, this.j, this.k, messageIdType, false);
    }

    @Override // defpackage.aypl
    public final /* bridge */ /* synthetic */ Action b(MessageIdType messageIdType, boolean z) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.c.b();
        cogwVar.getClass();
        avmp avmpVar = (avmp) this.d.b();
        avmpVar.getClass();
        ayqj ayqjVar = (ayqj) this.e.b();
        ayqjVar.getClass();
        ayqd ayqdVar = (ayqd) this.f.b();
        ayqdVar.getClass();
        axxy axxyVar = (axxy) this.g.b();
        axxyVar.getClass();
        return new RedownloadMessageAction(context, this.b, cogwVar, avmpVar, ayqjVar, ayqdVar, axxyVar, this.h, this.i, this.j, this.k, messageIdType, true, z);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.c.b();
        cogwVar.getClass();
        avmp avmpVar = (avmp) this.d.b();
        avmpVar.getClass();
        ayqj ayqjVar = (ayqj) this.e.b();
        ayqjVar.getClass();
        ((ayqd) this.f.b()).getClass();
        axxy axxyVar = (axxy) this.g.b();
        axxyVar.getClass();
        parcel.getClass();
        return new RedownloadMessageAction(context, this.b, cogwVar, avmpVar, ayqjVar, axxyVar, this.h, this.i, this.j, this.k, parcel);
    }
}
