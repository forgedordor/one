package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xqi implements xpo {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardUiAdapterImpl");
    public final Context b;
    public final ConversationId c;
    public final fdpl d;
    public final fcsu e;
    public final fcsu f;
    public final String g;
    public final fctc h;
    public final fctc i;
    public final fctc j;
    private final fdjx k;
    private final xpi l;
    private final fcsu m;
    private final anoo n;
    private final fcsu o;
    private final fduf p;

    public xqi(Context context, fdjx fdjxVar, ConversationId conversationId, fdpl fdplVar, xpi xpiVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, anoo anooVar, fcsu fcsuVar4) {
        context.getClass();
        fdjxVar.getClass();
        conversationId.getClass();
        fdplVar.getClass();
        xpiVar.getClass();
        fcsuVar.getClass();
        fcsuVar3.getClass();
        anooVar.getClass();
        fcsuVar4.getClass();
        this.b = context;
        this.k = fdjxVar;
        this.c = conversationId;
        this.d = fdplVar;
        this.l = xpiVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.m = fcsuVar3;
        this.n = anooVar;
        this.o = fcsuVar4;
        this.p = fdvf.a(true);
        this.g = (String) crbf.bA.e();
        this.h = fctd.a(new fdae() { // from class: xpq
            @Override // defpackage.fdae
            public final Object invoke() {
                final xqi xqiVar = this.a;
                Context context2 = xqiVar.b;
                String string = context2.getString(R.string.suspected_messages_toolstone_card_text);
                string.getClass();
                String string2 = context2.getString(R.string.suspected_messages_toolstone_link_pattern);
                string2.getClass();
                String string3 = context2.getString(R.string.suspected_messages_toolstone_title);
                string3.getClass();
                String string4 = context2.getString(R.string.suspected_messages_toolstone_description);
                string4.getClass();
                String string5 = context2.getString(R.string.suspected_messages_toolstone_primary_button);
                string5.getClass();
                String string6 = context2.getString(R.string.suspected_messages_toolstone_secondary_button);
                string6.getClass();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                djrr djrrVar = djrr.dJ;
                String string7 = spannableStringBuilder.toString();
                String str = xqiVar.g;
                str.getClass();
                return new dlax(djrrVar, string3, string7, string4, fcva.b(new diio(str, fdgn.O(string4, string2, 0, false, 6), fdgn.O(string4, string2, 0, false, 6) + string2.length(), new fdap() { // from class: xpp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) throws IOException {
                        xqiVar.g();
                        return true;
                    }
                }, 24)), new dlad(string5, new xpu(xqiVar)), new dlad(string6, new xpv(xqiVar)), new xpw(xqiVar), false, null, 1664);
            }
        });
        this.i = fctd.a(new fdae() { // from class: xpr
            @Override // defpackage.fdae
            public final Object invoke() {
                return this.a.b(false);
            }
        });
        this.j = fctd.a(new fdae() { // from class: xps
            @Override // defpackage.fdae
            public final Object invoke() {
                return this.a.b(true);
            }
        });
    }

    private final void h() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSpam");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardUiAdapterImpl", "dismissAlertCard", 277, "PenpalScamAlertCardUiAdapterImpl.kt")).q("Penpal alert card dismissed.");
        if (((arql) this.o.b()).a()) {
            this.p.f(false);
        }
        if (this.c instanceof BugleConversationId) {
            auvw.m(this.k, null, new xqb(this, null), 3);
        }
    }

    @Override // defpackage.xpo
    public final fdvc a() {
        if (!((arql) this.o.b()).a()) {
            return fdtg.b(new xpz(this.l.a(), this), this.k, fdur.b, null);
        }
        xpi xpiVar = this.l;
        return fdtg.b(new fdua(xpiVar.a(), this.p, new xqa(this, null)), this.k, fdur.b, null);
    }

    public final dlax b(boolean z) {
        Context context = this.b;
        String string = context.getString(R.string.suspected_messages_toolstone_card_text);
        string.getClass();
        String string2 = context.getString(R.string.suspected_messages_toolstone_link_pattern);
        string2.getClass();
        String string3 = context.getString(R.string.suspected_messages_toolstone_title);
        string3.getClass();
        String string4 = context.getString(R.string.suspected_messages_toolstone_description);
        string4.getClass();
        String string5 = context.getString(R.string.suspected_messages_toolstone_primary_button);
        string5.getClass();
        String string6 = context.getString(R.string.suspected_messages_toolstone_secondary_button);
        string6.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        djrr djrrVar = djrr.dJ;
        String string7 = spannableStringBuilder.toString();
        String str = this.g;
        str.getClass();
        return new dlax(djrrVar, string3, string7, string4, fcva.b(new diio(str, fdgn.O(string4, string2, 0, false, 6), fdgn.O(string4, string2, 0, false, 6) + string2.length(), new fdap() { // from class: xpt
            @Override // defpackage.fdap
            public final Object invoke(Object obj) throws IOException {
                this.a.g();
                return true;
            }
        }, 24)), new dlad(string5, new xqc(this)), new dlad(string6, new xqd(this)), new xqe(this), z, context.getString(R.string.suspected_messages_toolstone_talk_back_description), 128);
    }

    public final Object c(ResolvedRecipient resolvedRecipient, eofr eofrVar, fcxy fcxyVar) {
        Object objC = ((cpjw) this.m.b()).c(cpkg.a(1 == (9069 & 1) ? null : null, (9069 & 2) != 0 ? null : false, (9069 & 4) != 0 ? csdl.b : null, (9069 & 16) != 0 ? null : this.c, null, (9069 & 128) != 0 ? null : resolvedRecipient, (!((9069 & 512) == 0)) | false, (9069 & 1024) != 0 ? null : elka.CONVERSATION_FROM_UNSPAM_ACTION, 3, 9, (9069 & 8192) != 0 ? 2 : 0, (9069 & 16384) != 0 ? null : eofrVar), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    public final void d() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSpam");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardUiAdapterImpl", "onCloseClick", 254, "PenpalScamAlertCardUiAdapterImpl.kt")).q("Penpal alert card closed.");
        h();
        auvw.m(this.k, null, new xqf(this, null), 3);
        if (((Boolean) ((cczi) anoo.a.get()).e()).booleanValue()) {
            this.n.c(2, this.c);
            return;
        }
        anoo anooVar = this.n;
        enkj enkjVar = (enkj) enkm.a.createBuilder();
        enkjVar.getClass();
        eobv.c(enkjVar);
        eobv.b(2, enkjVar);
        anooVar.a(eobv.a(enkjVar), null);
    }

    public final void e() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSpam");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardUiAdapterImpl", "onNegativeButtonClicked", 231, "PenpalScamAlertCardUiAdapterImpl.kt")).q("Penpal alert card report not spamclicked.");
        h();
        auvw.m(this.k, null, new xqg(this, null), 3);
        if (((Boolean) ((cczi) anoo.a.get()).e()).booleanValue()) {
            this.n.c(3, this.c);
            return;
        }
        anoo anooVar = this.n;
        enkj enkjVar = (enkj) enkm.a.createBuilder();
        enkjVar.getClass();
        eobv.c(enkjVar);
        eobv.b(3, enkjVar);
        anooVar.a(eobv.a(enkjVar), null);
    }

    public final void f() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSpam");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardUiAdapterImpl", "onPositiveButtonClick", 193, "PenpalScamAlertCardUiAdapterImpl.kt")).q("Penpal alert card report clicked.");
        auvw.m(this.k, null, new xqh(this, null), 3);
        if (((Boolean) ((cczi) anoo.a.get()).e()).booleanValue()) {
            this.n.c(4, this.c);
            return;
        }
        anoo anooVar = this.n;
        enkj enkjVar = (enkj) enkm.a.createBuilder();
        enkjVar.getClass();
        eobv.c(enkjVar);
        eobv.b(4, enkjVar);
        anooVar.a(eobv.a(enkjVar), null);
    }

    public final void g() throws IOException {
        if (((Boolean) ((cczi) anoo.a.get()).e()).booleanValue()) {
            this.n.c(5, this.c);
        } else {
            anoo anooVar = this.n;
            enkj enkjVar = (enkj) enkm.a.createBuilder();
            enkjVar.getClass();
            eobv.c(enkjVar);
            eobv.b(5, enkjVar);
            anooVar.a(eobv.a(enkjVar), null);
        }
        String str = this.g;
        if (str == null || fdgn.H(str)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        eiid.o(this.b, intent);
    }
}
