package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vnb extends fcyz implements fdat {
    int a;
    final /* synthetic */ vnh b;
    final /* synthetic */ ajlt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnb(vnh vnhVar, ajlt ajltVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vnhVar;
        this.c = ajltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vnb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final vnh vnhVar = this.b;
            Context context = vnhVar.a;
            String string = context.getString(R.string.star_badge_on_click_snackbar_message);
            string.getClass();
            final ajlt ajltVar = this.c;
            aafw aafwVar = new aafw(string, context.getString(R.string.star_badge_on_click_snackbar_action), false, 0, new fdae() { // from class: vna
                @Override // defpackage.fdae
                public final Object invoke() {
                    vnhVar.c(ajltVar);
                    return fctx.a;
                }
            }, 57);
            this.a = 1;
            if (vnhVar.e.a(aafwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vnb(this.b, this.c, fcxyVar);
    }
}
