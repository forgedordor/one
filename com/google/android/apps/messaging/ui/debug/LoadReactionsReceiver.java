package com.google.android.apps.messaging.ui.debug;

import android.content.Context;
import android.content.Intent;
import defpackage.auvw;
import defpackage.cqce;
import defpackage.cxth;
import defpackage.cxue;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.eygg;
import defpackage.fcsu;
import defpackage.fcva;
import defpackage.fcyi;
import defpackage.fczv;
import defpackage.fdbq;
import defpackage.fdey;
import defpackage.fdfy;
import defpackage.fdjx;
import defpackage.fdjz;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LoadReactionsReceiver extends cxth {
    public static final cqce a = cqce.g("BugleReactions", "LoadReactionsReceiver");
    public fcsu b;
    public fcsu c;
    public eygg d;
    public fcsu e;

    @Override // defpackage.cldb
    public final eieh b() {
        fcsu fcsuVar = this.b;
        if (fcsuVar == null) {
            fdbq.c("traceCreation");
            fcsuVar = null;
        }
        return ((eigp) fcsuVar.b()).a("LoadReactionsReceiver receive broadcast");
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (fdbq.f(intent.getAction(), "com.google.android.apps.messaging.load_reactions")) {
            List listAj = fcva.aj(fdey.g(fdey.l(fdey.h(fczv.a(new BufferedReader(new InputStreamReader(new FileInputStream((File) LoadMessagesReceiver.c.a(intent, context, "single_conversation_reactions.csv")), fdfy.a), 8192)), ((Number) LoadMessagesReceiver.b.invoke(intent)).intValue()), ((Number) LoadMessagesReceiver.a.invoke(intent)).intValue())));
            a.p("Number of lines: " + listAj.size());
            Iterator it = listAj.iterator();
            fcsu fcsuVar = this.c;
            if (fcsuVar == null) {
                fdbq.c("backgroundScope");
                fcsuVar = null;
            }
            Object objB = fcsuVar.b();
            objB.getClass();
            q("LoadReactions", auvw.c((fdjx) objB, fcyi.a, fdjz.a, new cxue(this, it, null)));
        } else {
            a.p("Skipping the import, the action " + intent.getAction() + " != com.google.android.apps.messaging.load_reactions");
        }
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cldb
    public final String d() {
        return "";
    }
}
