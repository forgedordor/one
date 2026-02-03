package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dozv extends fcyz implements fdat {
    int a;
    final /* synthetic */ dpao b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dozv(dpao dpaoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dpaoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dozv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Exception {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                dpao dpaoVar = this.b;
                this.a = 1;
                if (dpaoVar.bV(true, this) == fcylVar) {
                    return fcylVar;
                }
            }
        } catch (Exception e) {
            if (!(e instanceof RuntimeException) && (!(e instanceof IOException) || !dpao.bo(this.b).b)) {
                throw e;
            }
            ((ekrd) ((ekrd) dpao.a.i()).g(e).h("com/google/android/libraries/compose/sticker/ui/screen/StickerScreen$onViewCreated$10$onStickerPackFavoriteOrdered$1", "invokeSuspend", 209, "StickerScreen.kt")).q("Unable to update favorites ordering.");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dozv(this.b, fcxyVar);
    }
}
