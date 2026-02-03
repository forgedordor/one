package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxhb extends dxhd {
    public String a;
    public String b;
    public String c;
    public String d;
    public ekhx e;
    public String f;
    public String g;
    private long h;
    private String i;
    private int j;
    private long k;
    private long l;
    private int m;
    private long n;
    private long o;
    private byte p;
    private int q;

    public dxhb() {
    }

    @Override // defpackage.dxhd
    public final dxhe a() {
        String str;
        int i;
        if (this.p == 127 && (str = this.i) != null && (i = this.q) != 0) {
            return new dxhc(this.h, str, i, this.a, this.b, this.c, this.j, this.d, this.e, this.f, this.k, this.l, this.m, this.n, this.g, this.o);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.p & 1) == 0) {
            sb.append(" id");
        }
        if (this.i == null) {
            sb.append(" accountSpecificId");
        }
        if (this.q == 0) {
            sb.append(" accountType");
        }
        if ((this.p & 2) == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.p & 4) == 0) {
            sb.append(" syncVersion");
        }
        if ((this.p & 8) == 0) {
            sb.append(" lastRegistrationTimeMs");
        }
        if ((this.p & 16) == 0) {
            sb.append(" lastRegistrationRequestHash");
        }
        if ((this.p & 32) == 0) {
            sb.append(" firstRegistrationVersion");
        }
        if ((this.p & 64) == 0) {
            sb.append(" fitbitDecodedId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dxhd
    protected final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null accountSpecificId");
        }
        this.i = str;
    }

    @Override // defpackage.dxhd
    public final void c(long j) {
        this.n = j;
        this.p = (byte) (this.p | 32);
    }

    @Override // defpackage.dxhd
    public final void d(long j) {
        this.o = j;
        this.p = (byte) (this.p | 64);
    }

    @Override // defpackage.dxhd
    public final void e(long j) {
        this.h = j;
        this.p = (byte) (this.p | 1);
    }

    @Override // defpackage.dxhd
    public final void f(int i) {
        this.m = i;
        this.p = (byte) (this.p | 16);
    }

    @Override // defpackage.dxhd
    public final void g(long j) {
        this.l = j;
        this.p = (byte) (this.p | 8);
    }

    @Override // defpackage.dxhd
    public final void h(String str) {
        this.a = str;
    }

    @Override // defpackage.dxhd
    public final void i(int i) {
        this.j = i;
        this.p = (byte) (this.p | 2);
    }

    @Override // defpackage.dxhd
    public final void j(long j) {
        this.k = j;
        this.p = (byte) (this.p | 4);
    }

    @Override // defpackage.dxhd
    protected final void k(int i) {
        this.q = i;
    }

    public dxhb(dxhe dxheVar) {
        dxhc dxhcVar = (dxhc) dxheVar;
        this.h = dxhcVar.a;
        this.i = dxhcVar.b;
        this.q = dxhcVar.p;
        this.a = dxhcVar.c;
        this.b = dxhcVar.d;
        this.c = dxhcVar.e;
        this.j = dxhcVar.f;
        this.d = dxhcVar.g;
        this.e = dxhcVar.h;
        this.f = dxhcVar.i;
        this.k = dxhcVar.j;
        this.l = dxhcVar.k;
        this.m = dxhcVar.l;
        this.n = dxhcVar.m;
        this.g = dxhcVar.n;
        this.o = dxhcVar.o;
        this.p = (byte) 127;
    }
}
