package defpackage;

import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abse {
    private static final cqce a = cqce.g("Bugle", "SatelliteUtils");
    private final crny b;
    private final crma c;
    private Optional d = Optional.empty();

    public abse(crny crnyVar, crma crmaVar) {
        this.b = crnyVar;
        this.c = crmaVar;
    }

    public final Optional a() {
        if (!c()) {
            a.m("no PhonePermission");
            return Optional.empty();
        }
        if (this.d.isPresent()) {
            return this.d;
        }
        Iterator it = this.b.m().iterator();
        while (it.hasNext()) {
            Optional optionalI = ((crof) it.next()).i(false);
            if (optionalI.isPresent()) {
                this.d = optionalI;
                return optionalI;
            }
        }
        return Optional.empty();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [alqm, java.lang.Object] */
    public final boolean b() {
        Optional optionalA = a();
        return optionalA.isPresent() && !optionalA.get().w();
    }

    public final boolean c() {
        return this.c.k();
    }

    public final boolean d() {
        if (this.d.isPresent()) {
            return true;
        }
        return this.b.r();
    }
}
