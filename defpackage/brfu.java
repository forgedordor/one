package defpackage;

import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brfu extends dqpg {
    public bash a;
    public Instant b;
    public float c;

    public brfu() {
        super(brgt.c());
        this.a = bash.a;
        this.b = Instant.EPOCH;
    }

    public final brfq a(Supplier supplier) {
        brfq brfqVar = (brfq) supplier.get();
        brfqVar.aD(aB());
        brfqVar.a = this.a;
        brfqVar.b = this.b;
        brfqVar.c = this.c;
        brfqVar.cM = aC();
        return brfqVar;
    }

    public final void b(Instant instant) {
        aE(1);
        this.b = instant;
    }

    public final void c(bash bashVar) {
        aE(0);
        this.a = bashVar;
    }

    public final void d(float f) {
        aE(2);
        this.c = f;
    }
}
