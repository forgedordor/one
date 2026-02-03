package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.FallbackToXmsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axnv implements ayms {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;

    public axnv(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
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
        fcsuVar7.getClass();
        this.g = fcsuVar7;
        fcsuVar8.getClass();
        this.h = fcsuVar8;
        fcsuVar9.getClass();
        this.i = fcsuVar9;
    }

    public final /* bridge */ /* synthetic */ Action a(basd basdVar, int i, enyw enywVar) {
        ains ainsVar = (ains) this.a.b();
        ainsVar.getClass();
        cogw cogwVar = (cogw) this.d.b();
        cogwVar.getClass();
        ajhd ajhdVar = (ajhd) this.e.b();
        ajhdVar.getClass();
        chwq chwqVar = (chwq) this.f.b();
        chwqVar.getClass();
        dqsn dqsnVar = (dqsn) this.g.b();
        dqsnVar.getClass();
        eosc eoscVar = (eosc) this.i.b();
        eoscVar.getClass();
        enywVar.getClass();
        return new FallbackToXmsAction(ainsVar, this.b, this.c, cogwVar, ajhdVar, chwqVar, dqsnVar, this.h, eoscVar, basdVar, i, enywVar);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        ains ainsVar = (ains) this.a.b();
        ainsVar.getClass();
        cogw cogwVar = (cogw) this.d.b();
        cogwVar.getClass();
        ajhd ajhdVar = (ajhd) this.e.b();
        ajhdVar.getClass();
        chwq chwqVar = (chwq) this.f.b();
        chwqVar.getClass();
        dqsn dqsnVar = (dqsn) this.g.b();
        dqsnVar.getClass();
        eosc eoscVar = (eosc) this.i.b();
        eoscVar.getClass();
        parcel.getClass();
        return new FallbackToXmsAction(ainsVar, this.b, this.c, cogwVar, ajhdVar, chwqVar, dqsnVar, this.h, eoscVar, parcel);
    }
}
