package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esuh implements eyif {
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    public static fbsj a(Object obj, fbpc fbpcVar, ejwi ejwiVar) throws ClassNotFoundException {
        fbye fbyeVar = new fbye(new fbxy());
        ScheduledExecutorService scheduledExecutorService = ((estz) obj).a;
        fbyeVar.e(scheduledExecutorService);
        scheduledExecutorService.getClass();
        fbyeVar.b = new fcdj(scheduledExecutorService);
        fbyeVar.f(fbpcVar);
        Iterator it = ((ejwt) ejwiVar).a.iterator();
        while (it.hasNext()) {
            fbyeVar.c((fbso) it.next());
        }
        fbsj fbsjVarA = fbyeVar.a();
        try {
            fbsjVarA.d();
            return fbsjVarA;
        } catch (IOException e) {
            throw new IllegalStateException("Failed to start in-process server!", e);
        }
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
