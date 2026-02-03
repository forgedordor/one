package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpek extends dqpg {
    public String a;
    public amrb b;
    public Instant c;
    public Instant d;
    public long e;

    public bpek() {
        super(bpfo.a().M());
        this.c = Instant.EPOCH;
        this.d = Instant.EPOCH;
    }

    public final bpei a() {
        bpej bpejVar = new bpej();
        bpejVar.aD(aB());
        bpejVar.a = this.a;
        bpejVar.b = this.b;
        bpejVar.c = this.c;
        bpejVar.d = this.d;
        bpejVar.e = this.e;
        bpejVar.cM = aC();
        return bpejVar;
    }

    public final void b(String str) {
        aE(0);
        this.a = str;
    }

    public final void c(Instant instant) {
        aE(3);
        this.d = instant;
    }

    public final void d(long j) {
        aE(4);
        this.e = j;
    }

    public final void e(Instant instant) {
        aE(2);
        this.c = instant;
    }

    public final void f(amrb amrbVar) {
        aE(1);
        this.b = amrbVar;
    }
}
