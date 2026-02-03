package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ydd extends fcyz implements fdat {
    int a;
    final /* synthetic */ yek b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydd(yek yekVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = yekVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ydd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final yek yekVar = this.b;
            aaft aaftVar = (aaft) yekVar.w.b();
            Context context = yekVar.n;
            String string = context.getString(R.string.message_list_paging_error_title);
            string.getClass();
            aafw aafwVar = new aafw(string, context.getString(R.string.message_list_paging_error_action_label), true, 3, new fdae() { // from class: ydc
                @Override // defpackage.fdae
                public final Object invoke() {
                    yekVar.x.h(agfq.a);
                    return fctx.a;
                }
            }, 33);
            this.a = 1;
            if (aaftVar.a(aafwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ydd(this.b, fcxyVar);
    }
}
