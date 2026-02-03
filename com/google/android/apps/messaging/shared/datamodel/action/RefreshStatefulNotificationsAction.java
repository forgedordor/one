package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.ajfo;
import defpackage.aydw;
import defpackage.aymo;
import defpackage.ayqd;
import defpackage.barn;
import defpackage.cgbn;
import defpackage.cgey;
import defpackage.cqnc;
import defpackage.cqpz;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.eksl;
import defpackage.eksp;
import defpackage.elgm;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class RefreshStatefulNotificationsAction extends ThrottledAction {
    private final cgbn b;
    private final ajfo c;
    private final cqpz d;
    private static final eksp a = eksp.c("BugleNotifications");
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new aydw();

    /* compiled from: PG */
    public interface a {
        ayqd bl();
    }

    public RefreshStatefulNotificationsAction(cgbn cgbnVar, ajfo ajfoVar, cqpz cqpzVar, Parcel parcel) {
        super(parcel, elgm.REFRESH_STATEFUL_NOTIFICATIONS_ACTION);
        this.b = cgbnVar;
        this.c = ajfoVar;
        this.d = cqpzVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("RefreshStatefulNotificationsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RefreshNotificationsAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 108;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fT() {
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return this.d.c("bugle_refresh_notification_backoff_duration_in_millis", 100L);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "RefreshStatefulNotificationsAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void j(ThrottledAction throttledAction) {
        I(throttledAction, "silent");
        aymo aymoVar = throttledAction.v;
        aymo aymoVar2 = this.v;
        if (!TextUtils.equals(aymoVar2.l("conv_id"), aymoVar.l("conv_id"))) {
            aymoVar2.v("conv_id", null);
        }
        J(throttledAction, "refresh_incoming");
        J(throttledAction, "refresh_failure");
        J(throttledAction, "quick_reply");
        I(throttledAction, "smart_replies");
        J(throttledAction, "is_from_notification_action");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final eiju k() {
        eieu eieuVarK = eiiy.k("RefreshStatefulNotificationsAction.doThrottledWork");
        try {
            aymo aymoVar = this.v;
            boolean zY = aymoVar.y("refresh_incoming");
            boolean zY2 = aymoVar.y("refresh_failure");
            boolean zY3 = aymoVar.y("silent");
            boolean zY4 = aymoVar.y("quick_reply");
            boolean zY5 = aymoVar.y("smart_replies");
            aymoVar.y("is_from_notification_action");
            ConversationIdType conversationIdTypeB = barn.b(aymoVar.l("conv_id"));
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(cgey.f, Boolean.valueOf(zY));
            ekslVar.X(cgey.g, Boolean.valueOf(zY2));
            ekslVar.X(cgey.h, Boolean.valueOf(zY3));
            ekslVar.X(cgey.i, Boolean.valueOf(zY4));
            ekslVar.X(cgey.j, Boolean.valueOf(zY5));
            ekslVar.X(cqnc.r, conversationIdTypeB.toString());
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/action/RefreshStatefulNotificationsAction", "doThrottledWorkAsync", 147, "RefreshStatefulNotificationsAction.java")).q("Refreshing message notifications");
            eiju eijuVarM = (zY || zY4) ? this.b.M() : eijx.e(null);
            if (zY2) {
                this.b.B();
            }
            this.c.e(ajfo.i);
            eieuVarK.close();
            return eijuVarM;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public RefreshStatefulNotificationsAction(cgbn cgbnVar, ajfo ajfoVar, cqpz cqpzVar, boolean z, boolean z2, boolean z3, ConversationIdType conversationIdType) {
        super(elgm.REFRESH_STATEFUL_NOTIFICATIONS_ACTION);
        this.b = cgbnVar;
        this.c = ajfoVar;
        this.d = cqpzVar;
        this.v.p("refresh_incoming", z);
        this.v.p("refresh_failure", z2);
        this.v.p("quick_reply", false);
        this.v.p("silent", z3);
        this.v.p("smart_replies", false);
        this.v.v("conv_id", conversationIdType.toString());
        this.v.p("is_from_notification_action", false);
        this.v.p("is_background", false);
    }
}
