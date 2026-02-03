package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingRevocationsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axyc implements ayms {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;

    public axyc(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ProcessPendingRevocationsAction c(Parcel parcel) {
        aypx aypxVar = (aypx) this.b.b();
        aypxVar.getClass();
        parcel.getClass();
        return new ProcessPendingRevocationsAction(this.a, aypxVar, this.c, this.d, parcel);
    }
}
