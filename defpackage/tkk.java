package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkk implements tkv {
    public final fdjx a;
    public final fcyh b;
    public final afzc c;
    public final fcsu d;
    public final tiy e;
    private final Context f;

    public tkk(Context context, fdjx fdjxVar, fcyh fcyhVar, afzc afzcVar, fcsu fcsuVar, tiy tiyVar) {
        context.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        afzcVar.getClass();
        fcsuVar.getClass();
        tiyVar.getClass();
        this.f = context;
        this.a = fdjxVar;
        this.b = fcyhVar;
        this.c = afzcVar;
        this.d = fcsuVar;
        this.e = tiyVar;
    }

    @Override // defpackage.tkv
    public final djmy a(ahat ahatVar, final tlk tlkVar) {
        Context context = this.f;
        String strA = cpef.a(context);
        String string = context.getString(R.string.report_group_spam_body_2024_05_10, strA);
        string.getClass();
        Object objE = tle.b.e();
        objE.getClass();
        strA.getClass();
        diio diioVar = new diio((String) objE, fdgn.O(string, strA, 0, false, 6), fdgn.O(string, strA, 0, false, 6) + strA.length(), new fdap() { // from class: tkf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Object objE2 = tle.c.e();
                objE2.getClass();
                this.a.c.h(new agcz((String) objE2, null, 2));
                return true;
            }
        }, 24);
        String string2 = context.getString(R.string.spam_dialog_title_2024_05_10);
        List listB = fcva.b(diioVar);
        String string3 = context.getString(R.string.block_spam_dialog_positive_button_label);
        string3.getClass();
        dktq dktqVar = new dktq(string3, new fdae() { // from class: tke
            @Override // defpackage.fdae
            public final Object invoke() {
                tkk tkkVar = this.a;
                auvw.k(tkkVar.a, null, null, new tki(tkkVar, tlkVar, null), 3);
                return fctx.a;
            }
        });
        String string4 = context.getString(android.R.string.cancel);
        string4.getClass();
        return new djmj(string, listB, null, string2, false, false, dktqVar, new dktq(string4, new fdae() { // from class: tkg
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }), null, 308);
    }
}
