package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djxy implements fdat {
    final /* synthetic */ djyr a;

    public djxy(djyr djyrVar) {
        this.a = djyrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djyr djyrVar = this.a;
            djyg.k(djyrVar.c, djyrVar.d, null, hmlVar, 0, 4);
        }
        return fctx.a;
    }
}
