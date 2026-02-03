package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ipm extends fdbr implements fdap {
    final /* synthetic */ ipo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipm(ipo ipoVar) {
        super(1);
        this.a = ipoVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        ipo ipoVar = this.a;
        imz imzVar = (imz) obj;
        float f = ipoVar.g;
        float f2 = ipoVar.h;
        imt imtVarT = imzVar.t();
        long jA = imtVarT.a();
        imtVarT.b().l();
        ioe ioeVar = ipoVar.a;
        try {
            imtVarT.c.d(f, f2, 0L);
            ioeVar.b(imzVar);
            imtVarT.b().j();
            imtVarT.h(jA);
            return fctx.a;
        } catch (Throwable th) {
            imtVarT.b().j();
            imtVarT.h(jA);
            throw th;
        }
    }
}
