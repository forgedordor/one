package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class ccde extends dqpg {
    public String a;
    public String b;
    public long c;
    public byte[] d;
    public Instant e;

    public ccde() {
        super(ccen.a().M());
        this.e = Instant.EPOCH;
    }

    public final ccdc a() {
        ccdd ccddVar = new ccdd();
        ccddVar.aD(aB());
        ccddVar.a = this.a;
        ccddVar.b = this.b;
        ccddVar.c = this.c;
        ccddVar.d = this.d;
        ccddVar.e = this.e;
        ccddVar.cM = aC();
        return ccddVar;
    }

    public final void b(Instant instant) {
        aE(4);
        this.e = instant;
    }

    public final void c(byte[] bArr) {
        aE(3);
        this.d = bArr;
    }

    public final void d(long j) {
        aE(2);
        this.c = j;
    }

    public final void e(String str) {
        aE(1);
        this.b = str;
    }

    public final void f(String str) {
        aE(0);
        this.a = str;
    }
}
