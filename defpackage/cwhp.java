package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwhp implements cwhh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/conversation/details/screen/ConversationDetailsUiAdapterImpl");
    public final fdjx b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final asgm l;
    public final aqhc m;
    public final aqkp n;
    public final fdpl o;
    public final fdpl p;
    public final fdpl q;
    private final Optional r;
    private final Optional s;

    /* JADX WARN: Type inference failed for: r1v14, types: [cwfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [cwec, java.lang.Object] */
    public cwhp(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, Optional optional, Optional optional2, fcsu fcsuVar9, asgm asgmVar, aqhc aqhcVar, aqkp aqkpVar, Optional optional3) {
        cvwx cvwxVar;
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar9.getClass();
        asgmVar.getClass();
        aqhcVar.getClass();
        this.b = fdjxVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.h = fcsuVar6;
        this.i = fcsuVar7;
        this.j = fcsuVar8;
        this.r = optional;
        this.s = optional2;
        this.k = fcsuVar9;
        this.l = asgmVar;
        this.m = aqhcVar;
        this.n = aqkpVar;
        optional3.isPresent();
        cwev cwevVar = (cwev) optional3.get();
        if (cwevVar.b instanceof PenpalBotConversationId) {
            String string = cwevVar.a.getString(R.string.penpal_contact_details_page_description_header1, cwevVar.e);
            string.getClass();
            String string2 = cwevVar.a.getString(R.string.penpal_contact_details_page_description_body1, cwevVar.e);
            string2.getClass();
            String string3 = cwevVar.a.getString(R.string.penpal_contact_details_page_description_header2, cwevVar.e);
            string3.getClass();
            String string4 = cwevVar.a.getString(R.string.penpal_contact_details_page_faq, cwevVar.e);
            string4.getClass();
            String string5 = cwevVar.a.getString(R.string.penpal_contact_details_page_description_body2, cwevVar.e, string4);
            string5.getClass();
            String string6 = cwevVar.a.getString(R.string.penpal_contact_details_page_description_header3, cwevVar.e);
            string6.getClass();
            String string7 = cwevVar.a.getString(R.string.penpal_in_message_learn_more, cwevVar.e);
            string7.getClass();
            String string8 = cwevVar.a.getString(R.string.penpal_contact_details_page_description_body3, cwevVar.e, string7);
            string8.getClass();
            int iO = fdgn.O(string8, string7, 0, false, 6);
            String string9 = ((cgsa) cwevVar.d.b()).b().toString();
            string9.getClass();
            int iO2 = fdgn.O(string5, string4, 0, false, 6);
            String string10 = cwevVar.a.getString(R.string.penpal_contact_details_page_faq_link);
            string10.getClass();
            ekgb ekgbVarW = ekgb.w(new dkeg(string, null, null, fcva.b(cwev.b(string.length())), null, null, null, new fdae() { // from class: cweo
                @Override // defpackage.fdae
                public final Object invoke() {
                    return fctx.a;
                }
            }, 118), new dkeg(string2, null, null, fcvo.a, null, null, null, new fdae() { // from class: cwep
                @Override // defpackage.fdae
                public final Object invoke() {
                    return fctx.a;
                }
            }, 118), new dkeg(string3, null, null, fcva.b(cwev.b(string3.length())), null, null, null, new fdae() { // from class: cweq
                @Override // defpackage.fdae
                public final Object invoke() {
                    return fctx.a;
                }
            }, 118), new dkeg(string5, null, null, fcva.b(cwevVar.a(string10, iO2, string4.length() + iO2)), null, null, null, new fdae() { // from class: cwer
                @Override // defpackage.fdae
                public final Object invoke() {
                    return fctx.a;
                }
            }, 118), new dkeg(string6, null, null, fcva.b(cwev.b(string6.length())), null, null, null, new fdae() { // from class: cwes
                @Override // defpackage.fdae
                public final Object invoke() {
                    return fctx.a;
                }
            }, 118), new dkeg(string8, null, null, fcva.b(cwevVar.a(string9, iO, iO + string7.length())), null, null, null, new fdae() { // from class: cwet
                @Override // defpackage.fdae
                public final Object invoke() {
                    return fctx.a;
                }
            }, 118));
            ekgbVarW.getClass();
            cvwxVar = new cvwx(ekgbVarW);
        } else {
            cvwxVar = new cvwx((byte[]) null);
        }
        this.o = fdvf.a(cvwxVar);
        optional.isPresent();
        this.p = optional.get().a();
        optional2.isPresent();
        this.q = optional2.get().a(new cwdf(4));
    }
}
