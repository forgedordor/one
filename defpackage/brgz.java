package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brgz extends dqpg {
    public bash a;
    public basi b;
    public Instant c;

    public brgz() {
        super(brhv.g());
        this.a = bash.a;
        this.b = basi.a;
        this.c = Instant.EPOCH;
    }

    public final brgx a() {
        brgy brgyVar = new brgy();
        brgyVar.aD(aB());
        brgyVar.a = this.a;
        brgyVar.b = this.b;
        brgyVar.c = this.c;
        brgyVar.cM = aC();
        return brgyVar;
    }

    public final void b(basi basiVar) {
        int i = this.aB;
        if (i < 54060) {
            dqru.x("feature", i);
        }
        aE(1);
        this.b = basiVar;
    }

    public final void c(bash bashVar) {
        aE(0);
        this.a = bashVar;
    }

    public final void d(Instant instant) {
        aE(2);
        this.c = instant;
    }
}
