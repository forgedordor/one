package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.EnsureConnectivityStabilizedAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axnl implements ayms {
    private final fcsu a;
    private final fcsu b;

    public axnl(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final EnsureConnectivityStabilizedAction c(Parcel parcel) {
        cqbm cqbmVar = (cqbm) this.a.b();
        cqbmVar.getClass();
        ains ainsVar = (ains) this.b.b();
        ainsVar.getClass();
        parcel.getClass();
        return new EnsureConnectivityStabilizedAction(cqbmVar, ainsVar, parcel);
    }
}
