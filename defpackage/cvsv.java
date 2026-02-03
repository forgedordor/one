package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvsv extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvta b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvsv(cvta cvtaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvtaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvsv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final cvta cvtaVar = this.b;
            Context context = cvtaVar.a;
            String string = context.getString(R.string.unarchive_conversation_snackbar);
            string.getClass();
            aafw aafwVar = new aafw(string, context.getString(R.string.unblock_unspam_snack_bar_undo), false, 0, new fdae() { // from class: cvsu
                @Override // defpackage.fdae
                public final Object invoke() {
                    cvta cvtaVar2 = cvtaVar;
                    cvtf cvtfVar = cvtaVar2.f;
                    auvw.k(cvtfVar.c, null, null, new cvtd(cvtfVar, cvtaVar2.d, null), 3);
                    return fctx.a;
                }
            }, 57);
            this.a = 1;
            if (cvtaVar.e.a(aafwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvsv(this.b, fcxyVar);
    }
}
