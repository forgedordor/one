package defpackage;

import android.net.Uri;
import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class awqi extends dqpg {
    public awjl a;
    public awpy b;
    public String c;
    public String d;
    public Uri e;
    public awmu f;
    public byte[] g;
    public cigb h;
    public Instant i;
    public Instant j;
    public Uri k;

    public awqi() {
        super(awse.f());
        this.a = null;
        this.f = awmu.a;
        this.h = new cigb(0L);
        this.i = bart.b(0L);
        this.j = bart.b(0L);
    }

    public final awqe a() {
        return b(new Supplier() { // from class: awqg
            @Override // java.util.function.Supplier
            public final Object get() {
                return new awqf();
            }
        });
    }

    public final awqe b(Supplier supplier) {
        awqe awqeVar = (awqe) supplier.get();
        awqeVar.aD(aB());
        awqeVar.a = this.a;
        awqeVar.b = this.b;
        awqeVar.c = this.c;
        awqeVar.d = this.d;
        awqeVar.e = this.e;
        awqeVar.f = this.f;
        awqeVar.g = this.g;
        awqeVar.h = this.h;
        awqeVar.i = this.i;
        awqeVar.j = this.j;
        awqeVar.k = this.k;
        awqeVar.cM = aC();
        return awqeVar;
    }

    public final void c(awpy awpyVar) {
        aE(1);
        this.b = awpyVar;
    }

    public final void d(String str) {
        aE(3);
        this.d = str;
    }

    public final void e(String str) {
        aE(2);
        this.c = str;
    }

    public final void f(cigb cigbVar) {
        aE(7);
        this.h = cigbVar;
    }

    public final void g(Instant instant) {
        aE(8);
        this.i = instant;
    }

    public final void h(awmu awmuVar) {
        aE(5);
        this.f = awmuVar;
    }

    public final void i(Uri uri) {
        aE(4);
        this.e = uri;
    }

    public final void j(Uri uri) {
        int i = this.aB;
        if (i < 60940) {
            dqru.x("rcs_join_link_url", i);
        }
        aE(10);
        this.k = uri;
    }

    public final void k(Instant instant) {
        int i = this.aB;
        if (i < 60850) {
            dqru.x("rcs_name_last_change_timestamp", i);
        }
        aE(9);
        this.j = instant;
    }

    public final void l(byte[] bArr) {
        aE(6);
        this.g = bArr;
    }

    public final void m(awjl awjlVar) {
        aE(0);
        this.a = awjlVar;
    }
}
