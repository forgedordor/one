package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bsod extends dqpg {
    public long a;
    public Instant b;
    public String c;
    public String d;

    public bsod() {
        super(bspe.b());
        this.b = bart.b(0L);
    }

    public final bsob a() {
        bsoc bsocVar = new bsoc();
        bsocVar.aD(aB());
        bsocVar.a = this.a;
        bsocVar.b = this.b;
        bsocVar.c = this.c;
        bsocVar.d = this.d;
        bsocVar.cM = aC();
        return bsocVar;
    }

    public final void b(String str) {
        aE(3);
        this.d = str;
    }

    public final void c(String str) {
        aE(2);
        this.c = str;
    }
}
