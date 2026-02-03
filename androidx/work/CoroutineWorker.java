package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.fcxy;
import defpackage.fcyh;
import defpackage.fdbq;
import defpackage.fdjq;
import defpackage.fdlt;
import defpackage.pzk;
import defpackage.pzl;
import defpackage.pzm;
import defpackage.qak;
import defpackage.qaq;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends qaq {
    private final WorkerParameters e;
    private final fdjq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = pzk.a;
    }

    @Override // defpackage.qaq
    public final ListenableFuture a() {
        return qak.b(this.f.plus(new fdlt(null)), new pzl(this, null));
    }

    @Override // defpackage.qaq
    public final ListenableFuture b() {
        fcyh fcyhVar = this.f;
        if (fdbq.f(fcyhVar, pzk.a)) {
            fcyhVar = this.e.g;
        }
        fcyhVar.getClass();
        return qak.b(fcyhVar.plus(new fdlt(null)), new pzm(this, null));
    }

    public abstract Object c(fcxy fcxyVar);

    @Override // defpackage.qaq
    public final void d() {
    }
}
