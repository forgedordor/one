package com.google.android.apps.messaging.shared.datamodel.etouffee.impl.datausage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.eijx;
import defpackage.qam;
import defpackage.qaq;
import defpackage.qbq;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class DataUsageWorker extends qaq {
    private final Context e;

    public DataUsageWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.e = context;
    }

    @Override // defpackage.qaq
    public final ListenableFuture b() {
        qbq.a(this.e).a("data_usage_recurring_worker");
        return eijx.e(new qam());
    }
}
