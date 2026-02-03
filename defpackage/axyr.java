package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessTelephonyChangeAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axyr implements ayms {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;

    public axyr(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11) {
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
        fcsuVar10.getClass();
        this.j = fcsuVar10;
        this.k = fcsuVar11;
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        ((Context) this.a.b()).getClass();
        crny crnyVar = (crny) this.d.b();
        crnyVar.getClass();
        ((aipo) this.e.b()).getClass();
        ((ayqd) this.f.b()).getClass();
        cggc cggcVar = (cggc) this.g.b();
        cggcVar.getClass();
        bxlc bxlcVar = (bxlc) this.h.b();
        bxlcVar.getClass();
        ((cmof) this.i.b()).getClass();
        parcel.getClass();
        return new ProcessTelephonyChangeAction(this.b, this.c, crnyVar, cggcVar, bxlcVar, this.j, this.k, parcel);
    }
}
