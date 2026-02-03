package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qla {
    public static final qjn a(List list, qjn qjnVar) {
        list.getClass();
        boolean zF = qjnVar.g.f("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean zF2 = qjnVar.g.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean zF3 = qjnVar.g.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (zF || !zF2 || !zF3) {
            return qjnVar;
        }
        String str = qjnVar.e;
        pzn pznVar = new pzn();
        pznVar.b(qjnVar.g);
        pznVar.e("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
        return qjn.g(qjnVar, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", pznVar.a(), 0, 0L, 0, 0, 0L, 0, 33554411);
    }
}
