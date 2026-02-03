package com.google.apps.tiktok.contrib.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.a;
import defpackage.dzis;
import defpackage.dziu;
import defpackage.egsf;
import defpackage.egsp;
import defpackage.egus;
import defpackage.eieu;
import defpackage.eiez;
import defpackage.eifp;
import defpackage.eigp;
import defpackage.eiid;
import defpackage.eiiy;
import defpackage.ejwl;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.eoqg;
import defpackage.eork;
import defpackage.fcsu;
import defpackage.qaq;
import j$.util.Map;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TikTokListenableWorker extends qaq {
    private final eigp g;
    private final Map h;
    private final fcsu i;
    private final WorkerParameters j;
    private final eiez k;
    private egsp l;
    private boolean m;
    private static final ekrg f = ekrg.c("com/google/apps/tiktok/contrib/work/TikTokListenableWorker");
    public static final dzis e = new dziu("UNKNOWN");

    public TikTokListenableWorker(Context context, eigp eigpVar, Map<String, dzis> map, fcsu<egsp> fcsuVar, WorkerParameters workerParameters, eiez eiezVar) {
        super(context, workerParameters);
        this.l = null;
        this.m = false;
        this.h = map;
        this.i = fcsuVar;
        this.g = eigpVar;
        this.j = workerParameters;
        this.k = eiezVar;
    }

    public static /* synthetic */ void c(ListenableFuture listenableFuture, dzis dzisVar) {
        try {
            eork.q(listenableFuture);
        } catch (CancellationException unused) {
            ((ekrd) ((ekrd) f.j()).h("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "logOnCancellationOrFailure", 190, "TikTokListenableWorker.java")).t("TikTokListenableWorker was cancelled while running client worker: %s", dzisVar);
        } catch (ExecutionException e2) {
            ((ekrd) ((ekrd) ((ekrd) f.i()).g(e2.getCause())).h("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "logOnCancellationOrFailure", 185, "TikTokListenableWorker.java")).t("TikTokListenableWorker encountered an exception while running client worker: %s", dzisVar);
        }
    }

    @Override // defpackage.qaq
    public final ListenableFuture a() {
        WorkerParameters workerParameters = this.j;
        String strC = egus.c(workerParameters);
        eifp eifpVarG = this.g.g("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "getForegroundInfoAsync", 150, "WorkManager:TikTokListenableWorker getForegroundInfoAsync()");
        try {
            eieu eieuVarJ = eiiy.j(a.x(strC, " getForegroundInfoAsync()"), this.k);
            try {
                ejwl.m(this.l == null, "A TikTokListenableWorker's worker was null during getForegroundInfoAsync(), which should always be called before `startWork()`. Please report any instance of this Exception at go/tiktok-bug.");
                egsp egspVar = (egsp) this.i.b();
                this.l = egspVar;
                ListenableFuture listenableFutureA = egspVar.a(workerParameters);
                eieuVarJ.b(listenableFutureA);
                eieuVarJ.close();
                eifpVarG.close();
                return listenableFutureA;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eifpVarG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.qaq
    public final ListenableFuture b() {
        WorkerParameters workerParameters = this.j;
        String strC = egus.c(workerParameters);
        eifp eifpVarG = this.g.g("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "startWork", 92, "WorkManager:TikTokListenableWorker startWork");
        try {
            eieu eieuVarJ = eiiy.j(a.x(strC, " startWork()"), this.k);
            try {
                String strC2 = egus.c(workerParameters);
                eieu eieuVarK = eiiy.k(String.valueOf(strC2).concat(" startWork()"));
                try {
                    ejwl.m(!this.m, "A TikTokListenableWorker started twice. Please report any instance of this Exception at go/tiktok-bug.");
                    this.m = true;
                    if (this.l == null) {
                        this.l = (egsp) this.i.b();
                    }
                    this.l.c(new egsf());
                    final ListenableFuture listenableFutureB = this.l.b(workerParameters);
                    final dzis dzisVar = (dzis) Map.EL.getOrDefault(this.h, strC2, e);
                    listenableFutureB.b(eiid.k(new Runnable() { // from class: egse
                        @Override // java.lang.Runnable
                        public final void run() {
                            TikTokListenableWorker.c(listenableFutureB, dzisVar);
                        }
                    }), eoqg.a);
                    eieuVarK.b(listenableFutureB);
                    eieuVarK.close();
                    eieuVarJ.b(listenableFutureB);
                    eieuVarJ.close();
                    eifpVarG.close();
                    return listenableFutureB;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                eifpVarG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
