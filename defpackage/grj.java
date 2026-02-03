package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class grj implements fdat {
    final /* synthetic */ int a;
    final /* synthetic */ fdat b;
    final /* synthetic */ fdau c;
    final /* synthetic */ fdat d;
    final /* synthetic */ fdat e;
    final /* synthetic */ hjm f;
    final /* synthetic */ fdat g;

    public grj(int i, fdat fdatVar, fdau fdauVar, fdat fdatVar2, fdat fdatVar3, hjm hjmVar, fdat fdatVar4) {
        this.a = i;
        this.b = fdatVar;
        this.c = fdauVar;
        this.d = fdatVar2;
        this.e = fdatVar3;
        this.f = hjmVar;
        this.g = fdatVar4;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            grq.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
