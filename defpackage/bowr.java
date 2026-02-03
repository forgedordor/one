package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bowr extends dqpg {
    public long a;
    public String b;
    public long c;
    public long d;
    public long e;
    public String f;
    public boolean g;
    public byte[] h;
    public String i;
    public String j;
    public int k;
    public byte[] l;
    public byte[] m;
    public bveb n;
    public boolean o;
    public String p;
    public boolean q;
    public bvdm r;
    public bvdu s;
    public byte[] t;
    public String u;
    public long v;
    public long w;

    public bowr() {
        super(bpab.e());
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = "";
        this.g = false;
        this.i = "";
        this.j = "";
        this.k = 0;
        this.o = false;
        this.p = "";
        this.q = false;
        this.r = bvdm.WEB;
        this.s = bvdu.ANONYMOUS;
        this.v = 0L;
        this.w = 0L;
    }

    public final bowp a() {
        bowq bowqVar = new bowq();
        bowqVar.aD(aB());
        bowqVar.a = this.a;
        bowqVar.b = this.b;
        bowqVar.c = this.c;
        bowqVar.d = this.d;
        bowqVar.e = this.e;
        bowqVar.f = this.f;
        bowqVar.g = this.g;
        bowqVar.h = this.h;
        bowqVar.i = this.i;
        bowqVar.j = this.j;
        bowqVar.k = this.k;
        bowqVar.l = this.l;
        bowqVar.m = this.m;
        bowqVar.n = this.n;
        bowqVar.o = this.o;
        bowqVar.p = this.p;
        bowqVar.q = this.q;
        bowqVar.r = this.r;
        bowqVar.s = this.s;
        bowqVar.t = this.t;
        bowqVar.u = this.u;
        bowqVar.v = this.v;
        bowqVar.w = this.w;
        bowqVar.cM = aC();
        return bowqVar;
    }

    public final void b(int i) {
        int i2 = this.aB;
        if (i2 < 18020) {
            dqru.x("browser_type", i2);
        }
        aE(10);
        this.k = i;
    }

    public final void c(byte[] bArr) {
        aE(7);
        this.h = bArr;
    }

    public final void d(long j) {
        int i = this.aB;
        if (i < 59870) {
            dqru.x("creation_time", i);
        }
        aE(21);
        this.v = j;
    }

    public final void e(String str) {
        aE(1);
        this.b = str;
    }

    public final void f(bvdm bvdmVar) {
        int i = this.aB;
        if (i < 58010) {
            dqru.x("desktop_type", i);
        }
        aE(17);
        this.r = bvdmVar;
    }

    public final void g(byte[] bArr) {
        int i = this.aB;
        if (i < 59290) {
            dqru.x("destination_registration_id", i);
        }
        aE(19);
        this.t = bArr;
    }

    public final void h(byte[] bArr) {
        int i = this.aB;
        if (i < 21030) {
            dqru.x("encryption_key", i);
        }
        aE(11);
        this.l = bArr;
    }

    public final void i(String str) {
        int i = this.aB;
        if (i < 59560) {
            dqru.x("gaia_email", i);
        }
        aE(20);
        this.u = str;
    }

    public final void j(byte[] bArr) {
        int i = this.aB;
        if (i < 21030) {
            dqru.x("hmac_key", i);
        }
        aE(12);
        this.m = bArr;
    }

    public final void k(boolean z) {
        int i = this.aB;
        if (i < 58010) {
            dqru.x("is_persistent", i);
        }
        aE(16);
        this.q = z;
    }

    public final void l(String str) {
        int i = this.aB;
        if (i < 22040) {
            dqru.x("operating_system", i);
        }
        aE(8);
        this.i = str;
    }

    public final void m(String str) {
        int i = this.aB;
        if (i < 22040) {
            dqru.x("operating_system_version", i);
        }
        aE(9);
        this.j = str;
    }

    public final void n(bvdu bvduVar) {
        int i = this.aB;
        if (i < 58960) {
            dqru.x("pairing_type", i);
        }
        aE(18);
        this.s = bvduVar;
    }
}
