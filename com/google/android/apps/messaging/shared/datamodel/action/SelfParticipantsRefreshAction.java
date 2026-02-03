package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import defpackage.aygd;
import defpackage.ayge;
import defpackage.bxjn;
import defpackage.crny;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.fcsu;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class SelfParticipantsRefreshAction extends ThrottledAction {
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new aygd();
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    /* compiled from: PG */
    public interface SelfParticipantsRefreshActionInjector {
        ayge ii();
    }

    public SelfParticipantsRefreshAction(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        super(elgm.SELF_PARTICIPANTS_REFRESH_ACTION);
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("SelfParticipantsRefreshAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SelfParticipantsRefresh.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 105;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return Duration.ofSeconds(((Long) this.c.b()).longValue()).toMillis();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "SelfParticipantsRefreshAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void i() {
        ((crny) this.b.b()).n();
        ((bxjn) this.a.b()).c();
    }

    public SelfParticipantsRefreshAction(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, Parcel parcel) {
        super(parcel, elgm.SELF_PARTICIPANTS_REFRESH_ACTION);
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }
}
