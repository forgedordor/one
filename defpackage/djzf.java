package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djzf implements fdat {
    final /* synthetic */ djzh a;
    final /* synthetic */ jyq b;

    public djzf(djzh djzhVar, jyq jyqVar) {
        this.a = djzhVar;
        this.b = jyqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djzg.c(this.a, this.b, hmlVar, 0);
        }
        return fctx.a;
    }
}
