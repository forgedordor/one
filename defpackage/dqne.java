package defpackage;

import android.os.Process;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqne {
    public final Map a = new ConcurrentHashMap();
    public final Executor b;

    public dqne(Executor executor) {
        this.b = executor;
        a(new dqmp("Main", 1, true, dqmw.a)).e(Process.myPid());
    }

    public final dqnb a(dqmu dqmuVar) {
        dqnc dqncVar = new dqnc(dqmuVar);
        this.a.put(dqmuVar, dqncVar);
        return dqncVar;
    }
}
