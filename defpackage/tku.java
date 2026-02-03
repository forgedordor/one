package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tku implements tkv {
    public final fdjx a;
    public final fcyh b;
    public final afzc c;
    public final fcsu d;
    public djwc e;
    public djmn f;
    public final tiy g;
    private final Context h;
    private final String i;
    private final String j;
    private final diio k;
    private final String l;

    public tku(Context context, fdjx fdjxVar, fcyh fcyhVar, afzc afzcVar, fcsu fcsuVar, tiy tiyVar) {
        context.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        afzcVar.getClass();
        fcsuVar.getClass();
        tiyVar.getClass();
        this.h = context;
        this.a = fdjxVar;
        this.b = fcyhVar;
        this.c = afzcVar;
        this.d = fcsuVar;
        this.g = tiyVar;
        String strA = cpef.a(context);
        strA.getClass();
        this.i = strA;
        String string = context.getString(R.string.spam_dialog_body_2024_05_10, strA);
        string.getClass();
        this.j = string;
        Object objE = tle.f.e();
        objE.getClass();
        diio diioVar = new diio((String) objE, fdgn.O(string, strA, 0, false, 6), fdgn.O(string, strA, 0, false, 6) + strA.length(), new fdap() { // from class: tkp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Object objE2 = tle.g.e();
                objE2.getClass();
                this.a.c.h(new agcz((String) objE2, null, 2));
                return true;
            }
        }, 24);
        this.k = diioVar;
        String string2 = context.getString(R.string.block_spam_dialog_positive_button_label);
        string2.getClass();
        this.l = string2;
        this.e = new djwc("", context.getString(R.string.spam_dialog_block_checkbox_body), null, false, false, null, null, 0, 252);
        String string3 = context.getString(R.string.spam_dialog_title_2024_05_10);
        string3.getClass();
        this.f = new djmn(string3, fcvo.a, null, string, fcva.b(diioVar), null, null, null, null, 484);
    }

    @Override // defpackage.tkv
    public final djmy a(final ahat ahatVar, final tlk tlkVar) {
        ResolvedRecipient resolvedRecipient = tlkVar.a;
        if (resolvedRecipient == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        djwc djwcVar = this.e;
        Context context = this.h;
        String string = context.getString(R.string.spam_dialog_block_checkbox_title, resolvedRecipient.g().G(true).toString());
        string.getClass();
        this.e = djwc.a(djwcVar, string, null, null, false, new fdae() { // from class: tkm
            @Override // defpackage.fdae
            public final Object invoke() {
                tku tkuVar = this.a;
                tkuVar.e = djwc.a(tkuVar.e, null, null, null, !r1.d, null, null, 247);
                djmn djmnVar = tkuVar.f;
                tlk tlkVar2 = tlkVar;
                ResolvedRecipient resolvedRecipient2 = tlkVar2.a;
                resolvedRecipient2.getClass();
                List listC = tkuVar.c(resolvedRecipient2.z());
                ahat ahatVar2 = ahatVar;
                tkuVar.f = djmn.b(djmnVar, null, listC, null, tkuVar.b(ahatVar2, tlkVar2), null, null, 445);
                ahatVar2.b(tkuVar.f);
                return fctx.a;
            }
        }, null, 222);
        djmn djmnVar = this.f;
        List listC = c(resolvedRecipient.z());
        dktq dktqVarB = b(ahatVar, tlkVar);
        String string2 = context.getString(android.R.string.cancel);
        string2.getClass();
        djmn djmnVarB = djmn.b(djmnVar, null, listC, null, dktqVarB, new dktq(string2, new fdae() { // from class: tkn
            @Override // defpackage.fdae
            public final Object invoke() {
                ahatVar.a();
                return fctx.a;
            }
        }), new fdae() { // from class: tko
            @Override // defpackage.fdae
            public final Object invoke() {
                ahatVar.a();
                return fctx.a;
            }
        }, 61);
        this.f = djmnVarB;
        return djmnVarB;
    }

    public final dktq b(final ahat ahatVar, final tlk tlkVar) {
        return new dktq(this.l, new fdae() { // from class: tkl
            @Override // defpackage.fdae
            public final Object invoke() {
                tku tkuVar = this.a;
                auvw.k(tkuVar.a, null, null, new tks(tkuVar, tlkVar, ahatVar, null), 3);
                return fctx.a;
            }
        });
    }

    public final List c(boolean z) {
        return z ? fcvo.a : fcva.b(this.e);
    }
}
