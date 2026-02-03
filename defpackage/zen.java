package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zen implements zeb {
    public final Context a;
    public final fdpl b;
    public final fcsu c;
    public final fdjx d;
    public final zqz e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final Conversation j;
    public final arvu k;
    private final fcsu l;
    private final ajlu m;

    public zen(Context context, fdpl fdplVar, fcsu fcsuVar, fdjx fdjxVar, zqz zqzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, Conversation conversation, ajlu ajluVar, arvu arvuVar) {
        context.getClass();
        fdplVar.getClass();
        fdjxVar.getClass();
        fcsuVar3.getClass();
        conversation.getClass();
        ajluVar.getClass();
        arvuVar.getClass();
        this.a = context;
        this.b = fdplVar;
        this.c = fcsuVar;
        this.d = fdjxVar;
        this.e = zqzVar;
        this.f = fcsuVar2;
        this.l = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = conversation;
        this.m = ajluVar;
        this.k = arvuVar;
    }

    private static final djrr c(int i) {
        int i2 = i - 1;
        return crtr.f() ? i2 != 1 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? djrr.eI : djrr.aH : djrr.bp : djrr.dY : djrr.Q : i2 != 1 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? djrr.eE : djrr.aG : djrr.bo : djrr.dV : djrr.P;
    }

    @Override // defpackage.zeb
    public final dkkt a(final amwc amwcVar, final MessageId messageId) {
        if (amwcVar instanceof anmo) {
            Context context = this.a;
            djrr djrrVarC = c(2);
            String string = context.getString(R.string.conversation_suggestion_launch_calendar_action);
            string.getClass();
            return new dkkt(2, djrrVarC, string, new fdae() { // from class: zec
                @Override // defpackage.fdae
                public final Object invoke() {
                    amwc amwcVar2 = amwcVar;
                    long j = ((anmo) amwcVar2).a;
                    zen zenVar = this.a;
                    Context context2 = zenVar.a;
                    zenVar.e.a(Long.valueOf(j), null, null, null, context2.getString(R.string.calendar_suggestion_event_description), new zeh(zenVar, amwcVar2));
                    zenVar.b(amwcVar2.a());
                    return fctx.a;
                }
            });
        }
        int iB = amwcVar.b() - 1;
        if (iB == 2) {
            Context context2 = this.a;
            djrr djrrVarC2 = c(3);
            String string2 = context2.getString(R.string.p2p_conversation_suggestion_duo_call_action_text);
            string2.getClass();
            final String strA = amwcVar.a();
            return new dkkt(3, djrrVarC2, string2, new fdae() { // from class: zee
                @Override // defpackage.fdae
                public final Object invoke() {
                    zen zenVar = this.a;
                    auvw.m(zenVar.d, null, new zem(zenVar, null), 3);
                    zenVar.b(strA);
                    return fctx.a;
                }
            });
        }
        if (iB == 3) {
            Context context3 = this.a;
            djrr djrrVarC3 = c(4);
            String string3 = context3.getString(R.string.conversation_suggestion_star_action);
            string3.getClass();
            return new dkkt(4, djrrVarC3, string3, new fdae() { // from class: zed
                @Override // defpackage.fdae
                public final Object invoke() {
                    zen zenVar = this.a;
                    ((ajmh) zenVar.c.b()).Q(messageId, 6);
                    zenVar.b(amwcVar.a());
                    return fctx.a;
                }
            });
        }
        if (iB == 4) {
            Context context4 = this.a;
            djrr djrrVarC4 = c(5);
            String string4 = context4.getString(R.string.forward_activity_label);
            string4.getClass();
            return new dkkt(5, djrrVarC4, string4, new fdae() { // from class: zeg
                @Override // defpackage.fdae
                public final Object invoke() {
                    zen zenVar = this.a;
                    auvw.m(zenVar.d, null, new zel(zenVar, messageId, null), 3);
                    return fctx.a;
                }
            });
        }
        if (iB != 5) {
            return null;
        }
        Context context5 = this.a;
        djrr djrrVarC5 = c(6);
        String string5 = context5.getString(R.string.action_delete_message);
        string5.getClass();
        return new dkkt(6, djrrVarC5, string5, new fdae() { // from class: zef
            @Override // defpackage.fdae
            public final Object invoke() {
                zen zenVar = this.a;
                auvw.m(zenVar.d, null, new zek(zenVar, messageId, null), 3);
                return fctx.a;
            }
        });
    }

    public final void b(String str) {
        if (str == null) {
            return;
        }
        this.m.i(str, null, null, ((daoe) this.l.b()).b, true);
    }
}
