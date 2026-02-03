package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class ccit extends dqpg {
    public basd a;
    public basd b;
    public byte[] c;
    public byte[] d;
    public Instant e;
    public String f;
    public String g;
    public long h;
    public long i;
    public byte[] j;
    public athh k;

    public ccit() {
        super(cckr.g());
        basd basdVar = basd.a;
        this.a = basdVar;
        this.b = basdVar;
        this.e = Instant.EPOCH;
        this.k = null;
    }

    public final ccir a() {
        ccis ccisVar = new ccis();
        ccisVar.aD(aB());
        ccisVar.a = this.a;
        ccisVar.b = this.b;
        ccisVar.c = this.c;
        ccisVar.d = this.d;
        ccisVar.e = this.e;
        ccisVar.f = this.f;
        ccisVar.g = this.g;
        ccisVar.h = this.h;
        ccisVar.i = this.i;
        ccisVar.j = this.j;
        ccisVar.k = this.k;
        ccisVar.cM = aC();
        return ccisVar;
    }

    public final void b(byte[] bArr) {
        aE(3);
        this.d = bArr;
    }

    public final void c(Instant instant) {
        aE(4);
        this.e = instant;
    }

    public final void d(byte[] bArr) {
        aE(9);
        this.j = bArr;
    }

    public final void e(athh athhVar) {
        int i = this.aB;
        if (i < 60960) {
            dqru.x("file_processing_id", i);
        }
        aE(10);
        this.k = athhVar;
    }

    public final void f(long j) {
        aE(7);
        this.h = j;
    }

    public final void g(long j) {
        aE(8);
        this.i = j;
    }

    public final void h(String str) {
        aE(6);
        this.g = str;
    }

    public final void i(basd basdVar) {
        aE(1);
        this.b = basdVar;
    }

    public final void j(byte[] bArr) {
        aE(2);
        this.c = bArr;
    }

    public final void k(basd basdVar) {
        aE(0);
        this.a = basdVar;
    }

    public final void l(String str) {
        aE(5);
        this.f = str;
    }
}
