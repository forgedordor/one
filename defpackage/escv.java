package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class escv implements esfi, esfh {
    private final Executor c;
    private final Map b = new HashMap();
    public Queue a = new ArrayDeque();

    public escv(Executor executor) {
        this.c = executor;
    }

    @Override // defpackage.esfi
    public final void a(Class cls, esjf esjfVar) {
        b(cls, this.c, esjfVar);
    }

    public final synchronized void b(Class cls, Executor executor, esjf esjfVar) {
        esdc.b(esjfVar);
        esdc.b(executor);
        Map map = this.b;
        if (!map.containsKey(cls)) {
            map.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) map.get(cls)).put(esjfVar, executor);
    }

    public final synchronized Set c() {
        throw null;
    }
}
