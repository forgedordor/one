package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgy {
    private final cogw a;
    private final Map b;
    private final aquo c;
    private final arwe d;
    private final arwd e;

    public cdgy(cogw cogwVar, Map map, aquo aquoVar, arwe arweVar, arwd arwdVar) {
        this.a = cogwVar;
        this.b = new HashMap(map);
        this.c = aquoVar;
        this.d = arweVar;
        this.e = arwdVar;
    }

    final long a(bple bpleVar) {
        if ((this.c.a() || this.d.a() || this.e.a()) && bpleVar.o().compareTo(Duration.ZERO) > 0) {
            return bpleVar.o().plusMillis(bpleVar.k()).toMillis();
        }
        cdhb cdhbVar = (cdhb) this.b.get(bpleVar.n());
        if (cdhbVar == null) {
            return Long.MAX_VALUE;
        }
        bpleVar.n();
        return cdhbVar.d().plusMillis(bpleVar.k()).toMillis();
    }

    final Instant b(bple bpleVar) {
        return Instant.ofEpochMilli(a(bpleVar));
    }

    final boolean c(bple bpleVar) {
        return b(bpleVar).compareTo(this.a.f()) <= 0;
    }
}
