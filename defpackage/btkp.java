package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btkp extends dqpg {
    public String a;
    public boolean b;
    public boolean c;
    public basa d;
    public Instant e;
    public byte[] f;
    public long g;
    public Instant h;
    public boolean i;

    public btkp() {
        super(btmf.e());
        this.b = false;
        this.c = false;
        this.d = new basa(0L);
        this.e = bart.b(0L);
        this.g = 0L;
        this.h = bart.b(0L);
        this.i = false;
    }

    public final btkn a() {
        btko btkoVar = new btko();
        btkoVar.aD(aB());
        btkoVar.a = this.a;
        btkoVar.b = this.b;
        btkoVar.c = this.c;
        btkoVar.d = this.d;
        btkoVar.e = this.e;
        btkoVar.f = this.f;
        btkoVar.g = this.g;
        btkoVar.h = this.h;
        btkoVar.i = this.i;
        btkoVar.cM = aC();
        return btkoVar;
    }

    public final void b(Instant instant) {
        aE(7);
        this.h = instant;
    }

    public final void c(boolean z) {
        aE(1);
        this.b = z;
    }

    public final void d(boolean z) {
        int i = this.aB;
        if (i < 46000) {
            dqru.x("better_etouffee", i);
        }
        aE(2);
        this.c = z;
    }

    public final void e(byte[] bArr) {
        aE(5);
        this.f = bArr;
    }

    public final void f(boolean z) {
        aE(8);
        this.i = z;
    }

    public final void g(Instant instant) {
        aE(4);
        this.e = instant;
    }

    public final void h(basa basaVar) {
        int i = this.aB;
        if (i < 58800) {
            dqru.x("messages_feature_hash", i);
        }
        aE(3);
        this.d = basaVar;
    }

    public final void i(String str) {
        aE(0);
        this.a = str;
    }

    public final void j(long j) {
        aE(6);
        this.g = j;
    }
}
