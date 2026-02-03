package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessUserAlertAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axyz extends aypz {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;

    public axyz(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
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
        this.i = fcsuVar9;
    }

    @Override // defpackage.aypz
    public final /* bridge */ /* synthetic */ Action a(int i, ezol ezolVar, String str) {
        bvkr bvkrVar = (bvkr) this.c.b();
        bvkrVar.getClass();
        ains ainsVar = (ains) this.d.b();
        ainsVar.getClass();
        eosc eoscVar = (eosc) this.e.b();
        eoscVar.getClass();
        eosc eoscVar2 = (eosc) this.f.b();
        eoscVar2.getClass();
        cffw cffwVar = (cffw) this.g.b();
        cffwVar.getClass();
        cfeh cfehVar = (cfeh) this.h.b();
        cfehVar.getClass();
        ezolVar.getClass();
        str.getClass();
        return new ProcessUserAlertAsyncAction(this.a, this.b, bvkrVar, ainsVar, eoscVar, eoscVar2, cffwVar, cfehVar, this.i, i, ezolVar, str);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        bvkr bvkrVar = (bvkr) this.c.b();
        bvkrVar.getClass();
        ains ainsVar = (ains) this.d.b();
        ainsVar.getClass();
        eosc eoscVar = (eosc) this.e.b();
        eoscVar.getClass();
        eosc eoscVar2 = (eosc) this.f.b();
        eoscVar2.getClass();
        cffw cffwVar = (cffw) this.g.b();
        cffwVar.getClass();
        cfeh cfehVar = (cfeh) this.h.b();
        cfehVar.getClass();
        parcel.getClass();
        return new ProcessUserAlertAsyncAction(this.a, this.b, bvkrVar, ainsVar, eoscVar, eoscVar2, cffwVar, cfehVar, this.i, parcel);
    }
}
