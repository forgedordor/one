package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djvb implements fdat {
    final /* synthetic */ djvm a;

    public djvb(djvm djvmVar) {
        this.a = djvmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djvm djvmVar = this.a;
            if (djvmVar instanceof djvh) {
                hmlVar.v(1522970811);
                djvc.b((djvh) djvmVar, hmlVar, 0);
                hmlVar.o();
            } else if (djvmVar instanceof djvl) {
                hmlVar.v(1522973144);
                djvc.d(hmlVar, 0);
                hmlVar.o();
            } else if (djvmVar instanceof djve) {
                hmlVar.v(1522975252);
                djvc.a(hmlVar, 0);
                hmlVar.o();
            } else {
                if (!(djvmVar instanceof djvj)) {
                    hmlVar.v(1522969372);
                    hmlVar.o();
                    throw new fctg();
                }
                hmlVar.v(1522977302);
                djvc.c(hmlVar, 0);
                hmlVar.o();
            }
        }
        return fctx.a;
    }
}
