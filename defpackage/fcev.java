package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcev extends fcdm {
    public final fcab a;
    private final fcbc b;

    public fcev(fcbc fcbcVar, fcab fcabVar) {
        this.b = fcbcVar;
        this.a = fcabVar;
    }

    @Override // defpackage.fcdm
    protected final fcbc a() {
        return this.b;
    }

    @Override // defpackage.fcdm, defpackage.fcaq
    public final fcan d(fbrk fbrkVar, fbrg fbrgVar, fbnc fbncVar, fbnm[] fbnmVarArr) {
        return new fceu(this, this.b.d(fbrkVar, fbrgVar, fbncVar, fbnmVarArr));
    }
}
