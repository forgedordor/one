package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xtp extends fcyz implements fdat {
    int a;
    final /* synthetic */ xtq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtp(xtq xtqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xtqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xtp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final xtq xtqVar = this.b;
            Context context = xtqVar.a;
            String string = context.getResources().getString(R.string.data_required_download_snackbar_message);
            string.getClass();
            aafw aafwVar = new aafw(string, context.getResources().getString(R.string.data_required_snackbar_action), false, 0, new fdae() { // from class: xto
                @Override // defpackage.fdae
                public final Object invoke() {
                    xtqVar.b.h(new agcf());
                    return fctx.a;
                }
            }, 57);
            this.a = 1;
            if (xtqVar.f.a(aafwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xtp(this.b, fcxyVar);
    }
}
