package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyl {
    public final dbs a;
    public final dhk b;
    public final hox c;
    public final hox d;
    public dew e;
    private final hox f;

    public cyl(dbs dbsVar, dhk dhkVar, dhc dhcVar, dcg dcgVar) {
        this.a = dbsVar;
        this.b = dhkVar;
        hsi hsiVar = hsi.a;
        this.c = new hpl(dhcVar, hsiVar);
        this.d = new hpl(dcgVar, hsiVar);
        this.e = cym.a;
        this.f = new hpl(null, hsiVar);
    }

    public final dhc a() {
        return (dhc) this.c.a();
    }

    public final hsf b() {
        return (hsf) this.f.a();
    }

    public final ihu c() {
        hsf hsfVarB;
        if (!this.a.a() || (hsfVarB = b()) == null) {
            return null;
        }
        return (ihu) hsfVarB.a();
    }

    public final void d(hsf hsfVar) {
        this.f.b(hsfVar);
    }

    public final boolean e() {
        return ((Boolean) this.b.f()).booleanValue();
    }
}
