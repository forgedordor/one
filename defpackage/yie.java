package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yie implements fdat {
    final /* synthetic */ yhz a;

    public yie(yhz yhzVar) {
        this.a = yhzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            yhz yhzVar = this.a;
            if (!yhzVar.f.b) {
                Optional optional = yhzVar.d;
                if (optional.isPresent()) {
                    ((zty) optional.get()).b().a(hmlVar, 0);
                }
            }
        }
        return fctx.a;
    }
}
