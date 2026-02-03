package com.google.android.apps.messaging.shared.datamodel.action.execution;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.aiiw;
import defpackage.ajfo;
import defpackage.aymh;
import defpackage.aymr;
import defpackage.ayoe;
import defpackage.ayor;
import defpackage.cczi;
import defpackage.cdag;
import defpackage.cqce;
import defpackage.crag;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.ejxr;
import defpackage.elgm;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class PendingActionReceiver extends ayor {
    static final ejxr a = cdag.w(169455120, "pending_action_receiver_async");
    private static final cqce f = cqce.g("BugleDataModel", "PendingActionReceiver");
    public fcsu b;
    public fcsu c;
    public fcsu d;
    public fcsu e;

    public static PendingIntent l(Context context, Action action, int i, boolean z, int i2, Uri uri, ayoe ayoeVar) {
        Intent intentA = aiiw.c(context.getApplicationContext(), PendingActionReceiver.class, "android.intent.action.VIEW").a();
        if (uri != null) {
            intentA.setData(uri);
        }
        intentA.putExtra("datamodel_action_bundle", ayoeVar.a(action));
        intentA.putExtra("job_id", i);
        if (z) {
            intentA.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        }
        return PendingIntent.getBroadcast(context, i, intentA, crag.a(i2));
    }

    private final void m(Intent intent) {
        if (intent == null) {
            f.n("received no intent.");
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("datamodel_action_bundle");
        if (bundleExtra == null) {
            f.n("received intent with no Bundle.");
            return;
        }
        try {
            Action actionC = ((ayoe) this.c.b()).c(bundleExtra);
            if (actionC == null) {
                f.n("received intent with no Action.");
                return;
            }
            int i = bundleExtra.getInt("job_id", aymr.a(actionC));
            if (actionC.y == elgm.MARK_AS_READ_ACTION) {
                ((ajfo) this.b.b()).d(ajfo.i);
            }
            aymr aymrVar = new aymr(actionC.u, i, null, this, true);
            aymrVar.b = toString();
            q("PendingActionReceiver", ((aymh) this.e.b()).a(aymrVar, actionC));
        } catch (BadParcelableException e) {
            f.o("Failed to unparcel action.", e);
        }
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.d.b()).c("PendingActionReceiver Receive broadcast", "com/google/android/apps/messaging/shared/datamodel/action/execution/PendingActionReceiver", "beginRootTrace", 102);
    }

    @Override // defpackage.cldb
    public final String d() {
        return null;
    }

    @Override // defpackage.clca
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.PendingActionReceiver.Latency";
    }

    @Override // defpackage.clca
    protected final void g(Context context, Intent intent) {
        m(intent);
    }

    @Override // defpackage.clca
    public final boolean h(Context context, Intent intent) {
        if (((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            return true;
        }
        this.J = true;
        m(intent);
        return false;
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return ((Boolean) ((cczi) a.get()).e()).booleanValue();
    }
}
