package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dabc implements daaw {
    public final aofc a;
    public int b;
    public int c;
    public byas d;
    public final bdxj e;
    public final bcvd f;
    public int g;
    private final fdjx h;

    public dabc(fdjx fdjxVar, aofc aofcVar) {
        fdjxVar.getClass();
        aofcVar.getClass();
        this.h = fdjxVar;
        this.a = aofcVar;
        this.b = -1;
        this.c = -1;
        this.g = 1;
        this.d = byas.a;
        String[] strArr = bdxk.a;
        this.e = new bdxj();
        String[] strArr2 = bcve.a;
        this.f = new bcvd();
    }

    @Override // defpackage.daaw
    public final eiju a() {
        int i = this.c;
        if (i == -1) {
            throw new IllegalStateException("iconResId must be provided");
        }
        if (this.b == -1) {
            throw new IllegalStateException("simSlot must be provided");
        }
        if (this.g == 1) {
            throw new IllegalStateException("logType must be provided");
        }
        if (this.d != byas.a) {
            return auvw.c(this.h, fcyi.a, fdjz.a, new dabb(this, i, null));
        }
        throw new IllegalStateException("position must be provided");
    }

    public final void b(byas byasVar) {
        byasVar.getClass();
        this.d = byasVar;
    }
}
