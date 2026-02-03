package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jgk extends fdbr implements fdat {
    final /* synthetic */ jgl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgk(jgl jglVar) {
        super(2);
        this.a = jglVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            this.a.b(hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
