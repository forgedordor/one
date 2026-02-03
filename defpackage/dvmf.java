package defpackage;

import java.util.Map;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvmf extends TimerTask {
    final /* synthetic */ dwpx a;
    final /* synthetic */ dwpk b;
    final /* synthetic */ dvmi c;

    public dvmf(dvmi dvmiVar, dwpx dwpxVar, dwpk dwpkVar) {
        this.a = dwpxVar;
        this.b = dwpkVar;
        this.c = dvmiVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        dvmi dvmiVar = this.c;
        synchronized (dvmiVar.y) {
            dwpx dwpxVar = this.a;
            dwpk dwpkVar = this.b;
            dvhn.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map map = dvmiVar.z;
            if (!map.containsKey(dwpxVar) || !((Map) map.get(dwpxVar)).containsKey(dwpkVar) || jCurrentTimeMillis >= ((Long) ((Map) map.get(dwpxVar)).get(dwpkVar)).longValue()) {
                dviy dviyVar = dvmiVar.g;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dvhn.a();
                dviyVar.d(dwpxVar, dwpkVar, timeUnit.toMicros(System.currentTimeMillis() - dvmi.a));
                dvmiVar.g(dwpxVar, dwpkVar);
            }
        }
    }
}
