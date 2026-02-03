package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import defpackage.ains;
import defpackage.axnk;
import defpackage.axnl;
import defpackage.aymo;
import defpackage.cczi;
import defpackage.cdag;
import defpackage.cqbd;
import defpackage.cqbm;
import defpackage.cqce;
import defpackage.cqey;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class EnsureConnectivityStabilizedAction extends ThrottledAction {
    private final cqbm c;
    private final ains d;
    public static final cczi a = cdag.f(cdag.b, "ensure_connectivity_stabilized_backoff_duration_in_millis", TimeUnit.SECONDS.toMillis(5));
    private static final cqce b = cqce.g("Bugle", "EnsureConnectivityStabilizedAction");
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new axnk();

    /* compiled from: PG */
    public interface a {
        axnl hE();
    }

    public EnsureConnectivityStabilizedAction(cqbm<cqey> cqbmVar, ains ainsVar) {
        super(elgm.ENSURE_CONNECTIVITY_STABILIZED_ACTION);
        this.c = cqbmVar;
        this.d = ainsVar;
        this.v.p("key_is_stable", false);
        this.v.r("key_retry_count", -1);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("EnsureConnectivityStabilizedAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.EnsureConnectivityStabilized.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 114;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return ((Long) a.e()).longValue();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "EnsureConnectivityStabilizedAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void i() {
        aymo aymoVar = this.v;
        boolean zY = aymoVar.y("key_is_stable");
        cqbd cqbdVarA = b.a();
        cqbdVarA.B("isStable", zY);
        cqbdVarA.r();
        int iA = aymoVar.a("key_retry_count");
        if (zY) {
            this.d.e("Bugle.Connectivity.Stabilized", iA);
            ((cqey) this.c.a()).k();
        } else {
            aymoVar.p("key_is_stable", true);
            aymoVar.r("key_retry_count", iA + 1);
            E(g());
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void j(ThrottledAction throttledAction) {
        this.v.p("key_is_stable", false);
    }

    public EnsureConnectivityStabilizedAction(cqbm cqbmVar, ains ainsVar, Parcel parcel) {
        super(parcel, elgm.ENSURE_CONNECTIVITY_STABILIZED_ACTION);
        this.c = cqbmVar;
        this.d = ainsVar;
    }
}
