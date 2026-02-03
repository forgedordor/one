package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ieo extends fdbr implements fdap {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ int c;
    final /* synthetic */ ikp d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ieo(float f, float f2, int i, ikp ikpVar, boolean z) {
        super(1);
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = ikpVar;
        this.e = z;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        ikl iklVar = (ikl) obj;
        float fD = kin.d(iklVar, this.a);
        float fD2 = kin.d(iklVar, this.b);
        iiw iiwVar = null;
        if (fD > 0.0f && fD2 > 0.0f) {
            iiwVar = new iiw(fD, fD2, this.c);
        }
        iklVar.t(iiwVar);
        ikp ikpVar = this.d;
        if (ikpVar == null) {
            ikpVar = ikj.a;
        }
        iklVar.A(ikpVar);
        iklVar.r(this.e);
        return fctx.a;
    }
}
