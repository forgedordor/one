package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmjk {
    public final AtomicReference a = new AtomicReference();
    public final AtomicBoolean b = new AtomicBoolean();
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public final dggn a(int i) {
        Object obj = this.c.get(new dggr(i));
        if (i < 0) {
            obj = null;
        }
        dggn dggnVar = (dggn) obj;
        if (dggnVar == null || dggo.a(dggnVar).a.length() == 0) {
            return null;
        }
        return dggnVar;
    }

    public final void b(cmme cmmeVar) {
        this.a.set(cmmeVar);
    }
}
