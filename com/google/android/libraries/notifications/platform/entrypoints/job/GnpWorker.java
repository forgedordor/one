package com.google.android.libraries.notifications.platform.entrypoints.job;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.ahie;
import defpackage.dxht;
import defpackage.dxkg;
import defpackage.eksl;
import defpackage.eksp;
import defpackage.fcsu;
import defpackage.fcxy;
import defpackage.fdbq;
import defpackage.pzs;
import defpackage.qam;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class GnpWorker extends CoroutineWorker {
    private static final eksp f = eksp.c("GnpSdk");
    public dxht e;
    private final WorkerParameters g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GnpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(fcxy fcxyVar) {
        fcsu fcsuVar = (fcsu) dxkg.a(this.a).fI().get(GnpWorker.class);
        if (fcsuVar == null) {
            ((eksl) f.j()).q("Failed to inject dependencies.");
            return new qam();
        }
        Object objB = fcsuVar.b();
        objB.getClass();
        dxht dxhtVar = (dxht) ((ahie) objB).a.b.gd.b();
        this.e = dxhtVar;
        if (dxhtVar == null) {
            fdbq.c("gnpWorkerHandler");
            dxhtVar = null;
        }
        WorkerParameters workerParameters = this.g;
        pzs pzsVar = workerParameters.b;
        pzsVar.getClass();
        return dxhtVar.a(pzsVar, workerParameters.e, fcxyVar);
    }
}
