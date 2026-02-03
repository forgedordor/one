package com.google.android.apps.messaging.shared.util.block;

import android.content.Context;
import android.net.Uri;
import android.provider.BlockedNumberContract;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.util.block.BlockedNumbersJob;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ehli;
import defpackage.eijx;
import defpackage.eosc;
import defpackage.fcsu;
import defpackage.pzh;
import defpackage.pzz;
import defpackage.qaq;
import defpackage.qau;
import defpackage.qav;
import defpackage.qbq;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BlockedNumbersJob extends qaq {
    public final fcsu e;
    private final eosc f;

    /* compiled from: PG */
    public interface a {
        eosc eJ();

        fcsu gb();
    }

    public BlockedNumbersJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ehli.a(context, a.class);
        this.f = aVar.eJ();
        this.e = aVar.gb();
    }

    public static void c(Context context) {
        qau qauVar = new qau(BlockedNumbersJob.class);
        pzh pzhVar = new pzh();
        pzhVar.b(BlockedNumberContract.BlockedNumbers.CONTENT_URI, true);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        pzhVar.e = timeUnit.toMillis(0L);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        timeUnit2.getClass();
        pzhVar.f = timeUnit2.toMillis(3L);
        qauVar.g(pzhVar.a());
        qbq.a(context).j("BlockedNumbersListenableWorker", pzz.a, (qav) qauVar.b()).a();
    }

    @Override // defpackage.qaq
    public final ListenableFuture b() {
        return eijx.g(new Callable() { // from class: cpip
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BlockedNumbersJob blockedNumbersJob = this.a;
                try {
                    Iterator it = blockedNumbersJob.b.d.a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((Uri) it.next()).toString().startsWith(BlockedNumberContract.BlockedNumbers.CONTENT_URI.toString())) {
                            ((cpii) blockedNumbersJob.e.b()).d();
                            break;
                        }
                    }
                    return new qao();
                } finally {
                    BlockedNumbersJob.c(blockedNumbersJob.a);
                }
            }
        }, this.f);
    }
}
