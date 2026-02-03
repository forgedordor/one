package defpackage;

import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bspn extends dqpg {
    public cgzx a;
    public cgxy b;
    public String c;
    public Instant d;
    public long e;
    public cgzv f;
    public String g;
    public byte[] h;
    public Instant i;

    public bspn() {
        super(bsrg.e());
        this.a = null;
        this.b = cgxy.a;
        this.d = Instant.EPOCH;
        this.e = 0L;
        this.i = Instant.EPOCH;
    }

    public final bspj a(Supplier supplier) {
        bspj bspjVar = (bspj) supplier.get();
        bspjVar.aD(aB());
        bspjVar.a = this.a;
        bspjVar.b = this.b;
        bspjVar.c = this.c;
        bspjVar.d = this.d;
        bspjVar.e = this.e;
        bspjVar.f = this.f;
        bspjVar.g = this.g;
        bspjVar.h = this.h;
        bspjVar.i = this.i;
        bspjVar.cM = aC();
        return bspjVar;
    }

    public final void b(String str) {
        aE(6);
        this.g = str;
    }

    public final void c(Instant instant) {
        int i = this.aB;
        if (i < 60840) {
            dqru.x("execute_after_timestamp", i);
        }
        aE(8);
        this.i = instant;
    }

    public final void d(long j) {
        aE(4);
        this.e = j;
    }

    public final void e(cgzv cgzvVar) {
        aE(5);
        this.f = cgzvVar;
    }

    public final void f(Instant instant) {
        aE(3);
        this.d = instant;
    }

    public final void g(byte[] bArr) {
        aE(7);
        this.h = bArr;
    }

    public final void h(cgxy cgxyVar) {
        aE(1);
        this.b = cgxyVar;
    }

    public final void i(String str) {
        aE(2);
        this.c = str;
    }

    public final void j(cgzx cgzxVar) {
        aE(0);
        this.a = cgzxVar;
    }
}
