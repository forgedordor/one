package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhaa {
    public dhab b;
    private static final Timer c = new Timer(true);
    public static final Map a = new ConcurrentHashMap();

    public static final String c(dgzn dgznVar, String str) {
        return dgznVar.k + "#" + str;
    }

    public final void a(dgzn dgznVar, long j, String str) {
        String strC = c(dgznVar, str);
        Map map = a;
        dgzz dgzzVar = (dgzz) map.remove(strC);
        if (dgzzVar != null) {
            dgzzVar.cancel();
        }
        dhja.c("Start timer: remote contact will be considered idle in %ds", Long.valueOf(j));
        dgzz dgzzVar2 = new dgzz(this, dgznVar, str);
        map.put(strC, dgzzVar2);
        c.schedule(dgzzVar2, j * 1000);
    }

    public final void b(dgzn dgznVar, String str) {
        dhja.c("Stopping timer for contact: %s", dhja.a(str));
        dgzz dgzzVar = (dgzz) a.remove(c(dgznVar, str));
        if (dgzzVar != null) {
            dhab dhabVar = this.b;
            dhabVar.getClass();
            dhabVar.a(dgzzVar.a, str, false);
            dgzzVar.cancel();
        }
    }
}
