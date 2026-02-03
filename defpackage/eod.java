package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eod {
    public final Object a;
    public final Object b;
    public int c;
    public fdat d;
    final /* synthetic */ eoe e;

    public eod(eoe eoeVar, int i, Object obj, Object obj2) {
        this.e = eoeVar;
        this.a = obj;
        this.b = obj2;
        this.c = i;
    }

    public final fdat a() {
        fdat fdatVar = this.d;
        if (fdatVar != null) {
            return fdatVar;
        }
        hxd hxdVar = new hxd(818252804, true, new eoc(this.e, this));
        this.d = hxdVar;
        return hxdVar;
    }
}
