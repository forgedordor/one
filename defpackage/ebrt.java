package defpackage;

import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebrt {
    private long f;
    private Optional d = Optional.empty();
    private Optional e = Optional.empty();
    private final UUID b = UUID.randomUUID();
    private final ArrayDeque c = new ArrayDeque();
    public final Set a = new HashSet();

    private final int d() {
        return this.c.size() - 1;
    }

    private final ebrs e() {
        ejwl.m(!b(), "history is empty, have you called enterInitialState?");
        ebrs ebrsVar = (ebrs) this.c.peekFirst();
        ebrsVar.getClass();
        return ebrsVar;
    }

    private final boolean f() {
        return this.d.isEmpty();
    }

    public final ebrw a() {
        return e().a;
    }

    public final boolean b() {
        return this.c.isEmpty();
    }

    public final ebro c(ebrs ebrsVar) {
        boolean z = false;
        if (!b() && a().equals(ebrsVar.a)) {
            z = true;
        }
        boolean z2 = z;
        if (b()) {
            this.f = ebrsVar.b;
        }
        this.c.addFirst(ebrsVar);
        this.a.add(ebrsVar.a);
        if (f() && !ebrsVar.c()) {
            this.d = Optional.of(ebrsVar);
            this.e = Optional.of(Integer.valueOf(d()));
        }
        boolean zF = f();
        Optional optional = this.d;
        Optional optional2 = this.e;
        int iD = d();
        UUID uuid = this.b;
        int millis = (int) TimeUnit.NANOSECONDS.toMillis(e().b - this.f);
        int i = ebrz.d;
        return new ebro(ebrsVar, zF, optional, optional2, iD, uuid, z2, millis);
    }
}
