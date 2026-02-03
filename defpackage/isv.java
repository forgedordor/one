package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class isv extends fdbr implements fdau {
    final /* synthetic */ fdap a;
    final /* synthetic */ itc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isv(fdap fdapVar, itc itcVar) {
        super(3);
        this.a = fdapVar;
        this.b = itcVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(374375707);
        Object objF = hmlVar.f();
        if (objF == hmk.a) {
            objF = new iss();
            hmlVar.y(objF);
        }
        iss issVar = (iss) objF;
        issVar.a = this.a;
        issVar.e(this.b);
        hmlVar.o();
        return issVar;
    }
}
