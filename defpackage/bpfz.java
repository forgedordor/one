package defpackage;

import android.net.Uri;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpfz extends dqpg {
    public basd a;
    public byte[] b;
    public byte[] c;
    public int d;
    public byte[] e;
    public byte[] f;
    public int g;
    public Instant h;
    public Uri i;
    public String j;
    public byte[] k;
    public byte[] l;
    public String m;
    public Instant n;
    public String o;
    public String p;
    public String q;
    public epwa r;

    public bpfz() {
        super(bpio.e());
        this.a = basd.a;
        this.h = bart.b(0L);
        this.n = Instant.EPOCH;
    }

    public final bpfv a() {
        return b(new Supplier() { // from class: bpfy
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bpfw();
            }
        });
    }

    public final bpfv b(Supplier supplier) {
        bpfv bpfvVar = (bpfv) supplier.get();
        bpfvVar.aD(aB());
        bpfvVar.a = this.a;
        bpfvVar.b = this.b;
        bpfvVar.c = this.c;
        bpfvVar.d = this.d;
        bpfvVar.e = this.e;
        bpfvVar.f = this.f;
        bpfvVar.g = this.g;
        bpfvVar.h = this.h;
        bpfvVar.i = this.i;
        bpfvVar.j = this.j;
        bpfvVar.k = this.k;
        bpfvVar.l = this.l;
        bpfvVar.m = this.m;
        bpfvVar.n = this.n;
        bpfvVar.o = this.o;
        bpfvVar.p = this.p;
        bpfvVar.q = this.q;
        bpfvVar.r = this.r;
        bpfvVar.cM = aC();
        return bpfvVar;
    }

    @Deprecated
    public final void c() {
        bpfv bpfvVarB = b(new Supplier() { // from class: bpfx
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bpfw();
            }
        });
        final dqsy dqsyVarB = bpio.b();
        dqru.b(bpio.b(), "etouffee_rcs_metadata", bpfvVarB, new Function() { // from class: bpfs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarB.O("etouffee_rcs_metadata", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bpft
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void d(byte[] bArr) {
        aE(5);
        this.f = bArr;
    }

    public final void e(byte[] bArr) {
        aE(4);
        this.e = bArr;
    }

    public final void f(int i) {
        aE(6);
        this.g = i;
    }

    public final void g(Uri uri) {
        int i = this.aB;
        if (i < 35060) {
            dqru.x("attachment_uri", i);
        }
        aE(8);
        this.i = uri;
    }

    public final void h(Instant instant) {
        aE(7);
        this.h = instant;
    }

    public final void i(byte[] bArr) {
        int i = this.aB;
        if (i < 37020) {
            dqru.x("custom_delivery_receipt_content", i);
        }
        aE(10);
        this.k = bArr;
    }

    public final void j(String str) {
        int i = this.aB;
        if (i < 37020) {
            dqru.x("custom_delivery_receipt_mime_type", i);
        }
        aE(9);
        this.j = str;
    }

    public final void k(epwa epwaVar) {
        int i = this.aB;
        if (i < 60700) {
            dqru.x("mls_file_info", i);
        }
        aE(17);
        this.r = epwaVar;
    }

    public final void l(String str) {
        int i = this.aB;
        if (i < 56020) {
            dqru.x("plaintext_attachment_content_type", i);
        }
        aE(15);
        this.p = str;
    }

    public final void m(String str) {
        int i = this.aB;
        if (i < 56020) {
            dqru.x("plaintext_attachment_name", i);
        }
        aE(14);
        this.o = str;
    }

    public final void n(String str) {
        int i = this.aB;
        if (i < 56020) {
            dqru.x("plaintext_thumbnail_content_type", i);
        }
        aE(16);
        this.q = str;
    }

    public final void o(byte[] bArr) {
        aE(2);
        this.c = bArr;
    }

    public final void p(byte[] bArr) {
        aE(1);
        this.b = bArr;
    }

    public final void q(int i) {
        aE(3);
        this.d = i;
    }

    public final void r(basd basdVar) {
        aE(0);
        this.a = basdVar;
    }
}
