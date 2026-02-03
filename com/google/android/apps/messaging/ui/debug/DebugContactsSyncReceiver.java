package com.google.android.apps.messaging.ui.debug;

import android.content.Context;
import android.content.Intent;
import defpackage.auvw;
import defpackage.cqce;
import defpackage.cwzy;
import defpackage.cxsq;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.fcsu;
import defpackage.fcyi;
import defpackage.fdbq;
import defpackage.fdjx;
import defpackage.fdjz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DebugContactsSyncReceiver extends cxsq {
    public static final cqce a = cqce.g("BugleContacts", "ContactsSyncReceiver");
    public fcsu b;
    public fcsu c;
    public fcsu d;
    public fcsu e;
    public fcsu f;
    public fcsu g;
    public fcsu h;

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        fcsu fcsuVar = this.b;
        if (fcsuVar == null) {
            fdbq.c("traceCreation");
            fcsuVar = null;
        }
        return ((eigp) fcsuVar.b()).a("ContactsSyncReceiver Receive broadcast");
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (fdbq.f(intent.getAction(), "com.google.android.apps.messaging.contacts_sync")) {
            a.p("Forcing a contacts import to Bugle DB");
            fcsu fcsuVar = this.d;
            if (fcsuVar == null) {
                fdbq.c("backgroundScope");
                fcsuVar = null;
            }
            Object objB = fcsuVar.b();
            objB.getClass();
            q("DebugContactsSync", auvw.c((fdjx) objB, fcyi.a, fdjz.a, new cwzy(this, null)));
        } else {
            a.p("Skipping the import, the action " + intent.getAction() + " != ACTION_CONTACTS_SYNC");
        }
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cldb
    public final String d() {
        return "";
    }

    public final fcsu f() {
        fcsu fcsuVar = this.g;
        if (fcsuVar != null) {
            return fcsuVar;
        }
        fdbq.c("contactsSyncDataService");
        return null;
    }

    public final fcsu g() {
        fcsu fcsuVar = this.e;
        if (fcsuVar != null) {
            return fcsuVar;
        }
        fdbq.c("settingsStore");
        return null;
    }
}
