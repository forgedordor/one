package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipo extends ipk {
    public final ioe a;
    public String b;
    public boolean c;
    public fdae d;
    public final hox e;
    public final hox f;
    public float g;
    public float h;
    private final ioa i;
    private ijf j;
    private long k;
    private final fdap l;

    public ipo(ioe ioeVar) {
        this.a = ioeVar;
        ioeVar.e = new ipl(this);
        this.b = "";
        this.c = true;
        this.i = new ioa();
        this.d = ipn.a;
        hsi hsiVar = hsi.a;
        this.e = new hpl(null, hsiVar);
        this.f = new hpl(new ihz(0L), hsiVar);
        this.k = 9205357640488583168L;
        this.g = 1.0f;
        this.h = 1.0f;
        this.l = new ipm(this);
    }

    @Override // defpackage.ipk
    public final void b(imz imzVar) {
        g(imzVar, 1.0f, null);
    }

    public final long c() {
        return ((ihz) this.f.a()).a;
    }

    public final ijf d() {
        return (ijf) this.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.imz r26, float r27, defpackage.ijf r28) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipo.g(imz, float, ijf):void");
    }

    public final String toString() {
        return "Params: \tname: " + this.b + "\n\tviewportWidth: " + Float.intBitsToFloat((int) (c() >> 32)) + "\n\tviewportHeight: " + Float.intBitsToFloat((int) (c() & 4294967295L)) + "\n";
    }
}
