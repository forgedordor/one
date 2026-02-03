package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkd implements tkv {
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

    public tkd(Context context, fdjx fdjxVar, fcyh fcyhVar, afzc afzcVar, fcsu fcsuVar, tiy tiyVar) {
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
        this.i = cpef.a(context);
        String string = context.getString(R.string.action_report_spam);
        string.getClass();
        this.j = string;
        fcvo fcvoVar = fcvo.a;
        this.e = new djwc(string, "", fcvoVar, false, false, null, null, 0, 248);
        this.f = new djmn("", fcvoVar, null, null, null, null, null, null, null, 508);
    }

    @Override // defpackage.tkv
    public final djmy a(final ahat ahatVar, final tlk tlkVar) {
        String string;
        String string2;
        String string3;
        ResolvedRecipient resolvedRecipient = tlkVar.a;
        if (resolvedRecipient == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i = tlkVar.c;
        int i2 = i - 1;
        if (i2 == 0) {
            string = this.h.getString(R.string.report_spam_checkbox_body_2024_05_10, this.i);
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("Unexpected dialog type (" + ((Object) tls.a(i)) + ") in BlockAndReportDialog2BlockUiAdapter");
            }
            string = this.h.getString(R.string.rbm_report_spam_checkbox_body, this.i);
        }
        String str = string;
        str.getClass();
        djwc djwcVar = this.e;
        Object objE = tle.f.e();
        objE.getClass();
        String str2 = this.i;
        str2.getClass();
        int iO = fdgn.O(str, str2, 0, false, 6);
        str2.getClass();
        List listB = fcva.b(new diio((String) objE, iO, fdgn.O(str, str2, 0, false, 6) + str2.length(), new fdap() { // from class: tju
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Object objE2 = tle.g.e();
                objE2.getClass();
                this.a.c.h(new agcz((String) objE2, null, 2));
                return true;
            }
        }, 24));
        Object objE2 = tle.e.e();
        objE2.getClass();
        this.e = djwc.a(djwcVar, null, str, listB, ((Boolean) objE2).booleanValue(), new fdae() { // from class: tjw
            @Override // defpackage.fdae
            public final Object invoke() {
                tkd tkdVar = this.a;
                tkdVar.e = djwc.a(tkdVar.e, null, null, null, !r1.d, null, null, 247);
                djmn djmnVar = tkdVar.f;
                ResolvedRecipient resolvedRecipient2 = tlkVar.a;
                resolvedRecipient2.getClass();
                tkdVar.f = djmn.b(djmnVar, null, tkdVar.b(resolvedRecipient2.H().b()), null, null, null, null, 509);
                ahatVar.b(tkdVar.f);
                return fctx.a;
            }
        }, null, 209);
        djmn djmnVar = this.f;
        Context context = this.h;
        String string4 = context.getString(R.string.block_dialog_title_2024_05_10, cssf.c(resolvedRecipient.x(true)));
        string4.getClass();
        if (i2 == 0) {
            string2 = context.getString(R.string.block_dialog_body_2024_05_10);
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("Unexpected dialog type (" + ((Object) tls.a(i)) + ") in BlockAndReportDialog2BlockUiAdapter");
            }
            string2 = context.getString(R.string.rbm_block_dialog_body);
        }
        String str3 = string2;
        str3.getClass();
        if (i2 == 0) {
            string3 = context.getString(R.string.block_spam_dialog_positive_button_label);
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("Unexpected dialog type (" + ((Object) tls.a(i)) + ") in BlockAndReportDialog2BlockUiAdapter");
            }
            string3 = context.getString(R.string.rbm_block_dialog_positive_button_label);
        }
        string3.getClass();
        dktq dktqVar = new dktq(string3, new fdae() { // from class: tjv
            @Override // defpackage.fdae
            public final Object invoke() {
                tkd tkdVar = this.a;
                auvw.k(tkdVar.a, null, null, new tkb(tkdVar, tlkVar, ahatVar, null), 3);
                return fctx.a;
            }
        });
        String string5 = context.getString(android.R.string.cancel);
        string5.getClass();
        djmn djmnVarB = djmn.b(djmnVar, string4, b(resolvedRecipient.H().b()), str3, dktqVar, new dktq(string5, new fdae() { // from class: tjx
            @Override // defpackage.fdae
            public final Object invoke() {
                ahatVar.a();
                return fctx.a;
            }
        }), new fdae() { // from class: tjy
            @Override // defpackage.fdae
            public final Object invoke() {
                ahatVar.a();
                return fctx.a;
            }
        }, 52);
        this.f = djmnVarB;
        return djmnVarB;
    }

    public final List b(boolean z) {
        return z ? fcvo.a : fcva.b(this.e);
    }
}
