package com.google.android.apps.messaging.shared.rcs.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.apps.messaging.shared.rcs.messaging.MessagingServiceResponseReceiver;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.chwq;
import defpackage.ciyw;
import defpackage.cjad;
import defpackage.cogw;
import defpackage.cqbd;
import defpackage.cqca;
import defpackage.cqce;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.ejwk;
import defpackage.fcsu;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class MessagingServiceResponseReceiver extends ciyw {
    private static final cqce g = cqce.g("BugleRcs", "MessagingServiceResponseReceiver");
    public fcsu a;
    public fcsu b;
    public fcsu c;
    public fcsu d;
    public fcsu e;
    public fcsu f;

    @Override // defpackage.clca
    protected final String M() {
        return "Bugle.Broadcast.Sequencer.MessagingServiceResponseReceiver.Latency";
    }

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.a.b()).c("RCS Engine MessagingService receive broadcast", "com/google/android/apps/messaging/shared/rcs/messaging/MessagingServiceResponseReceiver", "beginRootTrace", 53);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.MessagingServiceResponseReceiver.Latency";
    }

    @Override // defpackage.clca
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.MessagingServiceResponseReceiver.Latency";
    }

    @Override // defpackage.clca
    protected final boolean h(Context context, Intent intent) {
        return ((chwq) this.b.b()).y(intent);
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.clca
    public final eiju j(Context context, Intent intent) {
        eiju eijuVarE;
        String strB = ejwk.b(intent.getAction());
        cqce cqceVar = g;
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.I("Intent received");
        cqbdVarC.A(GroupManagementRequest.ACTION_TAG, strB);
        cqbdVarC.r();
        fcsu fcsuVar = (fcsu) ((Map) this.c.b()).get(strB);
        if (fcsuVar == null) {
            cqbd cqbdVarB = cqceVar.b();
            cqbdVarB.I("Ignoring intent with unknown action");
            cqbdVarB.A(GroupManagementRequest.ACTION_TAG, strB);
            cqbdVarB.r();
            return eijx.e(null);
        }
        final cjad cjadVar = (cjad) fcsuVar.b();
        final Instant instantOfEpochMilli = Instant.ofEpochMilli(((cogw) this.d.b()).a());
        try {
            eijuVarE = cjadVar.a(intent);
        } catch (IllegalArgumentException e) {
            cqbd cqbdVarB2 = g.b();
            cqbdVarB2.I("Ignoring intent with invalid data");
            cqbdVarB2.A(GroupManagementRequest.ACTION_TAG, intent.getAction());
            cqbdVarB2.r();
            cqca.n("BugleRcs", Log.getStackTraceString(e));
            eijuVarE = eijx.e(null);
        }
        return eijuVarE.h(new ejvr() { // from class: cjaf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                MessagingServiceResponseReceiver messagingServiceResponseReceiver = this.a;
                ((cjae) messagingServiceResponseReceiver.e.b()).b.g(cjadVar.b(), Duration.between(instantOfEpochMilli, Instant.ofEpochMilli(((cogw) messagingServiceResponseReceiver.d.b()).a())).toMillis());
                return null;
            }
        }, (Executor) this.f.b());
    }
}
