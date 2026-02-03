package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ens {
    public final hox a;
    public long b;
    public long c;
    public ini d;
    public final ddp e;
    public final ddp f;
    public long g;
    private final fdjx h;
    private final hox i;
    private final hox j;
    private final hox k;
    private final hox l;
    private final iie m;

    public ens(fdjx fdjxVar, iie iieVar) {
        this.h = fdjxVar;
        this.m = iieVar;
        hsi hsiVar = hsi.a;
        this.i = new hpl(false, hsiVar);
        this.j = new hpl(false, hsiVar);
        this.k = new hpl(false, hsiVar);
        this.a = new hpl(false, hsiVar);
        this.b = 9223372034707292159L;
        this.c = 0L;
        Object obj = null;
        this.d = iieVar != null ? iieVar.a() : null;
        int i = 12;
        this.e = new ddp(new kjb(0L), diu.g, obj, i);
        this.f = new ddp(Float.valueOf(1.0f), diu.a, obj, i);
        this.l = new hpl(new kjb(0L), hsiVar);
        this.g = 9223372034707292159L;
    }

    public final long a() {
        return ((kjb) this.l.a()).a;
    }

    public final void b() {
        ini iniVar = this.d;
        e();
        if (f()) {
            if (iniVar != null) {
                iniVar.i(1.0f);
            }
            fdil.d(this.h, null, null, new enn(this, null), 3);
        }
    }

    public final void c() {
        if (g()) {
            fdil.d(this.h, null, null, new eno(this, null), 3);
        }
    }

    public final void d() {
        iie iieVar;
        if (g()) {
            h();
            fdil.d(this.h, null, null, new enp(this, null), 3);
        }
        if (e()) {
            this.j.b(false);
            fdil.d(this.h, null, null, new enq(this, null), 3);
        }
        if (f()) {
            this.k.b(false);
            fdil.d(this.h, null, null, new enr(this, null), 3);
        }
        i();
        this.b = 9223372034707292159L;
        ini iniVar = this.d;
        if (iniVar != null && (iieVar = this.m) != null) {
            iieVar.b(iniVar);
        }
        this.d = null;
    }

    public final boolean e() {
        return ((Boolean) this.j.a()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) this.k.a()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) this.i.a()).booleanValue();
    }

    public final void h() {
        this.i.b(false);
    }

    public final void i() {
        this.l.b(new kjb(0L));
    }
}
