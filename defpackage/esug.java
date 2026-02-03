package defpackage;

import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esug implements eyif {
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    public static fbnd a(Object obj, fbrv fbrvVar, ejwi ejwiVar) {
        estz estzVar = (estz) obj;
        fbyb fbybVar = new fbyb();
        fbybVar.b = true;
        fbybVar.j(fbrvVar);
        ScheduledExecutorService scheduledExecutorService = estzVar.a;
        scheduledExecutorService.getClass();
        fbybVar.a = scheduledExecutorService;
        fbybVar.g(scheduledExecutorService);
        fbybVar.k(estzVar.b);
        Iterator it = ((ejwt) ejwiVar).a.iterator();
        while (it.hasNext()) {
            fbybVar.i((fbni) it.next());
        }
        return fbybVar.a();
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
