package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.qap;
import defpackage.qaq;
import defpackage.qbv;
import defpackage.qbw;
import defpackage.qcc;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class Worker extends qaq {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // defpackage.qaq
    public final ListenableFuture a() {
        return qcc.a(h(), new qbv());
    }

    @Override // defpackage.qaq
    public final ListenableFuture b() {
        return qcc.a(h(), new qbw(this));
    }

    public abstract qap c();
}
