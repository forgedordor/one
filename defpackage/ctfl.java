package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctfl implements ctez {
    public final Context a;
    public final fdjx b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fduf g;
    public final String h;
    public final String i;
    public final List j;
    public djwc k;
    public String l;
    private final String m;
    private dkep n;
    private aabu o;

    public ctfl(Context context, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        context.getClass();
        fdjxVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        fduf fdufVarA = fdvf.a(null);
        this.g = fdufVarA;
        String strA = cpef.a(context);
        strA.getClass();
        this.m = strA;
        String string = context.getString(R.string.unsubscribe_bottomsheet_spam_2024_11_26);
        string.getClass();
        this.h = string;
        String string2 = context.getString(R.string.unsubscribe_bottomsheet_other_2024_11_26);
        string2.getClass();
        this.i = string2;
        this.j = fcva.g(context.getString(R.string.unsubscribe_bottomsheet_unwanted_2024_11_26), context.getString(R.string.unsubscribe_bottomsheet_noisy_2024_11_26), context.getString(R.string.unsubscribe_bottomsheet_uninterested_2024_11_26), string, string2);
        String string3 = context.getString(R.string.report_spam_checkbox_title_2024_11_26);
        string3.getClass();
        this.k = new djwc(string3, null, null, false, false, null, null, 0, 254);
        String string4 = context.getString(R.string.other_reason_text_field_hint);
        string4.getClass();
        this.n = new dkep(string4, "", new fdae() { // from class: ctfc
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, new fdap() { // from class: ctfd
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((String) obj).getClass();
                return fctx.a;
            }
        });
        this.l = "";
        String string5 = context.getString(R.string.unsubscribe_bottomsheet_title_2024_11_26);
        string5.getClass();
        fcvo fcvoVar = fcvo.a;
        this.o = new aabu(string5, "", fcvoVar, fdufVarA, fcvoVar, null, this.k, null, this.n, null, true, true, new fdae() { // from class: aabt
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        });
    }

    private final String e() {
        Context context = this.a;
        String string = context.getString(R.string.unsubscribe_bottomsheet_spam_2024_11_26);
        string.getClass();
        if (this.k.d) {
            Integer num = (Integer) this.g.c();
            int iIndexOf = this.j.indexOf(string);
            if (num != null && num.intValue() == iIndexOf) {
                String string2 = context.getString(R.string.unsubscribe_and_report_confirm_button_label);
                string2.getClass();
                return string2;
            }
        }
        String string3 = context.getString(R.string.unsubscribe_confirm_button_label);
        string3.getClass();
        return string3;
    }

    @Override // defpackage.ctez
    public final aabu a(final ahat ahatVar, final ResolvedRecipient resolvedRecipient, final ConversationId conversationId, final crvz crvzVar) {
        String string;
        ahatVar.getClass();
        resolvedRecipient.getClass();
        crvzVar.getClass();
        boolean z = true;
        String string2 = resolvedRecipient.D() ? this.a.getString(R.string.rbm_report_spam_checkbox_body_2024_11_26, this.m) : this.a.getString(R.string.xms_report_spam_checkbox_body_2024_11_26, this.m);
        string2.getClass();
        cczi ccziVar = crvx.d;
        Object objE = ccziVar.e();
        objE.getClass();
        String str = this.m;
        this.k = djwc.a(this.k, null, string2, fcva.b(new diio((String) objE, fdgn.O(string2, str, 0, false, 6), fdgn.O(string2, str, 0, false, 6) + str.length(), new fdap() { // from class: ctfe
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                afzc afzcVar = (afzc) this.a.c.b();
                Object objE2 = crvx.e.e();
                objE2.getClass();
                afzcVar.h(new agcz((String) objE2, null, 2));
                return true;
            }
        }, 24)), false, new fdae() { // from class: ctff
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.b(ahatVar, !r0.k.d);
                return fctx.a;
            }
        }, null, 217);
        this.n = dkep.a(this.n, null, new fdae() { // from class: ctfh
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.c(ahatVar, "", true);
                return fctx.a;
            }
        }, new fdap() { // from class: ctfi
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str2 = (String) obj;
                str2.getClass();
                this.a.c(ahatVar, str2, true);
                return fctx.a;
            }
        }, 19);
        aabu aabuVar = this.o;
        Context context = this.a;
        String string3 = context.getString(R.string.unsubscribe_bottomsheet_title_2024_11_26);
        string3.getClass();
        if (resolvedRecipient.D()) {
            string = context.getString(R.string.rbm_unsubscribe_bottomsheet_body_2024_11_26, str);
            string.getClass();
        } else {
            string = context.getString(R.string.xms_unsubscribe_bottomsheet_body_2024_11_26, str);
            string.getClass();
        }
        String str2 = string;
        String string4 = resolvedRecipient.D() ? context.getString(R.string.rbm_unsubscribe_bottomsheet_body_2024_11_26, str) : context.getString(R.string.xms_unsubscribe_bottomsheet_body_2024_11_26, str);
        string4.getClass();
        Object objE2 = ccziVar.e();
        objE2.getClass();
        List listB = fcva.b(new diio((String) objE2, fdgn.O(string4, str, 0, false, 6), fdgn.O(string4, str, 0, false, 6) + str.length(), new fdap() { // from class: ctfa
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                afzc afzcVar = (afzc) this.a.c.b();
                Object objE3 = crvx.e.e();
                objE3.getClass();
                afzcVar.h(new agcz((String) objE3, null, 2));
                return true;
            }
        }, 24));
        List list = this.j;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        final int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                fcva.m();
            }
            String str3 = (String) obj;
            str3.getClass();
            Integer num = (Integer) this.g.c();
            arrayList.add(new djzw(str3, null, (num != null && i == num.intValue()) ? z : false, new fdae() { // from class: ctfj
                @Override // defpackage.fdae
                public final Object invoke() {
                    ctfl ctflVar = this.a;
                    fduf fdufVar = ctflVar.g;
                    fdufVar.f(Integer.valueOf(i));
                    String string5 = ctflVar.a.getString(R.string.unsubscribe_bottomsheet_spam_2024_11_26);
                    string5.getClass();
                    boolean z2 = false;
                    if (((Boolean) crvx.i.e()).booleanValue()) {
                        Integer num2 = (Integer) fdufVar.c();
                        int iIndexOf = ctflVar.j.indexOf(string5);
                        if (num2 != null && num2.intValue() == iIndexOf) {
                            z2 = true;
                        }
                    }
                    ctflVar.b(ahatVar, z2);
                    return fctx.a;
                }
            }));
            i = i2;
            z = true;
        }
        this.o = aabu.d(aabuVar, string3, str2, listB, null, arrayList, Integer.valueOf(list.indexOf(this.h)), this.k, Integer.valueOf(list.indexOf(this.i)), this.n, new dktq(e(), new fdae() { // from class: ctfb
            /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
            @Override // defpackage.fdae
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instructions count: 283
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ctfb.invoke():java.lang.Object");
            }
        }), false, false, new fdae() { // from class: ctfg
            @Override // defpackage.fdae
            public final Object invoke() {
                ctfl ctflVar = this.a;
                ((crwg) ctflVar.f.b()).e(4);
                ahat ahatVar2 = ahatVar;
                ahatVar2.a();
                ctflVar.c(ahatVar2, "", false);
                ctflVar.g.f(null);
                return fctx.a;
            }
        }, 7176);
        ((crwg) this.f.b()).e(1);
        return this.o;
    }

    public final void b(ahat ahatVar, boolean z) {
        this.k = djwc.a(this.k, null, null, null, z, null, null, 247);
        aabu aabuVar = this.o;
        dktq dktqVar = aabuVar.j;
        aabu aabuVarD = aabu.d(aabuVar, null, null, null, null, null, null, this.k, null, null, dktqVar != null ? dktq.a(dktqVar, e(), null, 6) : null, false, false, null, 15807);
        this.o = aabuVarD;
        ahatVar.b(aabuVarD);
    }

    public final void c(ahat ahatVar, String str, boolean z) {
        this.l = str;
        dkep dkepVarA = dkep.a(this.n, str, null, null, 29);
        this.n = dkepVarA;
        aabu aabuVarD = aabu.d(this.o, null, null, null, null, null, null, null, null, dkepVarA, null, false, false, null, 16127);
        this.o = aabuVarD;
        if (z) {
            ahatVar.b(aabuVarD);
        }
    }
}
