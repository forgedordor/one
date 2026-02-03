package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class asty extends dqpg {
    public String a;
    public Instant b;
    public asva c;

    public asty() {
        super(asux.a().M());
        this.b = Instant.EPOCH;
    }

    public final astw a() {
        astx astxVar = new astx();
        astxVar.aD(aB());
        astxVar.a = this.a;
        astxVar.b = this.b;
        astxVar.c = this.c;
        astxVar.cM = aC();
        return astxVar;
    }

    public final void b(Instant instant) {
        aE(1);
        this.b = instant;
    }

    public final void c(String str) {
        aE(0);
        this.a = str;
    }

    public final void d(asva asvaVar) {
        aE(2);
        this.c = asvaVar;
    }
}
