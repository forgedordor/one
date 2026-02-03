package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveRbmSuggestionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aybx implements ayms {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;

    public aybx(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
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
    }

    public final /* bridge */ /* synthetic */ Action a(Bundle bundle) {
        cogw cogwVar = (cogw) this.f.b();
        cogwVar.getClass();
        bxlc bxlcVar = (bxlc) this.g.b();
        bxlcVar.getClass();
        return new ReceiveRbmSuggestionsAction(this.a, this.b, this.c, this.d, this.e, cogwVar, bxlcVar, this.h, this.i, bundle);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        cogw cogwVar = (cogw) this.f.b();
        cogwVar.getClass();
        bxlc bxlcVar = (bxlc) this.g.b();
        bxlcVar.getClass();
        parcel.getClass();
        return new ReceiveRbmSuggestionsAction(this.a, this.b, this.c, this.d, this.e, cogwVar, bxlcVar, this.h, this.i, parcel);
    }
}
