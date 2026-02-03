package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdxj implements fdpm {
    private final fcyh a;
    private final Object b;
    private final fdat c;

    public fdxj(fdpm fdpmVar, fcyh fcyhVar) {
        this.a = fcyhVar;
        this.b = fdzp.a(fcyhVar);
        this.c = new fdxi(fdpmVar, null);
    }

    @Override // defpackage.fdpm
    public final Object fO(Object obj, fcxy fcxyVar) {
        Object objA = fdvu.a(this.a, obj, this.b, this.c, fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
