package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ResendMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayfd extends aypm {
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
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final fcsu t;

    public ayfd(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
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
        fcsuVar14.getClass();
        this.n = fcsuVar14;
        fcsuVar15.getClass();
        this.o = fcsuVar15;
        fcsuVar16.getClass();
        this.p = fcsuVar16;
        fcsuVar17.getClass();
        this.q = fcsuVar17;
        this.r = fcsuVar18;
        fcsuVar19.getClass();
        this.s = fcsuVar19;
        fcsuVar20.getClass();
        this.t = fcsuVar20;
    }

    @Override // defpackage.aypm
    public final /* bridge */ /* synthetic */ Action a(MessageIdType messageIdType, MessageUsageStatisticsData messageUsageStatisticsData) {
        bbdl bbdlVar = (bbdl) this.d.b();
        bbdlVar.getClass();
        cogw cogwVar = (cogw) this.e.b();
        cogwVar.getClass();
        bxna bxnaVar = (bxna) this.f.b();
        bxnaVar.getClass();
        ajhd ajhdVar = (ajhd) this.g.b();
        ajhdVar.getClass();
        aika aikaVar = (aika) this.h.b();
        aikaVar.getClass();
        bbfk bbfkVar = (bbfk) this.i.b();
        bbfkVar.getClass();
        bydb bydbVar = (bydb) this.j.b();
        bydbVar.getClass();
        messageIdType.getClass();
        eosc eoscVar = (eosc) this.o.b();
        eoscVar.getClass();
        aqbh aqbhVar = (aqbh) this.p.b();
        aqbhVar.getClass();
        AtomicReference atomicReference = (AtomicReference) this.s.b();
        atomicReference.getClass();
        fcsu fcsuVar = this.t;
        fcsu fcsuVar2 = this.q;
        fcsu fcsuVar3 = this.r;
        fcsu fcsuVar4 = this.n;
        return new ResendMessageAction(this.a, this.b, this.c, bbdlVar, cogwVar, bxnaVar, ajhdVar, aikaVar, bbfkVar, bydbVar, this.k, this.l, this.m, messageIdType, messageUsageStatisticsData, fcsuVar4, eoscVar, aqbhVar, fcsuVar2, fcsuVar3, atomicReference, fcsuVar);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        bbdl bbdlVar = (bbdl) this.d.b();
        bbdlVar.getClass();
        cogw cogwVar = (cogw) this.e.b();
        cogwVar.getClass();
        bxna bxnaVar = (bxna) this.f.b();
        bxnaVar.getClass();
        ajhd ajhdVar = (ajhd) this.g.b();
        ajhdVar.getClass();
        aika aikaVar = (aika) this.h.b();
        aikaVar.getClass();
        bbfk bbfkVar = (bbfk) this.i.b();
        bbfkVar.getClass();
        bydb bydbVar = (bydb) this.j.b();
        bydbVar.getClass();
        eosc eoscVar = (eosc) this.o.b();
        eoscVar.getClass();
        aqbh aqbhVar = (aqbh) this.p.b();
        aqbhVar.getClass();
        AtomicReference atomicReference = (AtomicReference) this.s.b();
        atomicReference.getClass();
        parcel.getClass();
        fcsu fcsuVar = this.t;
        fcsu fcsuVar2 = this.q;
        fcsu fcsuVar3 = this.r;
        return new ResendMessageAction(this.a, this.b, this.c, bbdlVar, cogwVar, bxnaVar, ajhdVar, aikaVar, bbfkVar, bydbVar, this.k, this.l, this.m, this.n, eoscVar, aqbhVar, fcsuVar2, fcsuVar3, atomicReference, fcsuVar, parcel);
    }
}
