package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gla implements fdat {
    final /* synthetic */ fdat a;
    final /* synthetic */ fdat b;
    final /* synthetic */ fdat c;
    final /* synthetic */ fdat d;
    final /* synthetic */ fdat e;

    public gla(fdat fdatVar, fdat fdatVar2, fdat fdatVar3, fdat fdatVar4, fdat fdatVar5) {
        this.a = fdatVar;
        this.b = fdatVar2;
        this.c = fdatVar3;
        this.d = fdatVar4;
        this.e = fdatVar5;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            glg.c(this.a, this.b, this.c, this.d, this.e, hmlVar, 384);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
