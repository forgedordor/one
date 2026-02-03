package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmgp extends dqpg {
    public long a;
    public crws b;
    public Instant c;
    public crwi d;
    public Instant e;

    public bmgp() {
        super(bmhw.e());
        this.b = crws.b(0);
        this.c = Instant.EPOCH;
        this.d = crwi.b(0);
        this.e = Instant.EPOCH;
    }

    public final bmgn a() {
        bmgo bmgoVar = new bmgo();
        bmgoVar.aD(aB());
        bmgoVar.a = this.a;
        bmgoVar.b = this.b;
        bmgoVar.c = this.c;
        bmgoVar.d = this.d;
        bmgoVar.e = this.e;
        bmgoVar.cM = aC();
        return bmgoVar;
    }

    public final void b(crwi crwiVar) {
        aE(3);
        this.d = crwiVar;
    }

    public final void c(crws crwsVar) {
        aE(1);
        this.b = crwsVar;
    }

    public final void d(Instant instant) {
        aE(4);
        this.e = instant;
    }

    public final void e(long j) {
        aE(0);
        this.a = j;
    }
}
