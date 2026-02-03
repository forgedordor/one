package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvsh extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvsi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvsh(cvsi cvsiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvsiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvsh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final cvsi cvsiVar = this.b;
            aaft aaftVar = (aaft) cvsiVar.d.b();
            Context context = cvsiVar.a;
            String string = context.getString(R.string.cross_country_banner_confirm_snackbar_to_inbox);
            string.getClass();
            aafw aafwVar = new aafw(string, context.getString(R.string.cross_country_banner_confirm_snackbar_undo_label), false, 0, new fdae() { // from class: cvsg
                @Override // defpackage.fdae
                public final Object invoke() {
                    cvsi cvsiVar2 = cvsiVar;
                    ((cvsn) cvsiVar2.b.b()).a(cvsiVar2.e, bvdk.CROSS_COUNTRY_FOLDER);
                    return fctx.a;
                }
            }, 57);
            this.a = 1;
            if (aaftVar.a(aafwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvsh(this.b, fcxyVar);
    }
}
