package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vkv implements vdy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/actions/leavegroup/LeaveGroupSnoozeExtension");
    public final Context b;
    public final ConversationId c;
    public final ahax d;
    public final fdjx e;
    public final arpr f;
    public final cogw g;
    public final vkk h;
    public final cssw i;
    public final dalj j;
    public final eigp k;
    public final agic l;
    public final fcsu m;
    public final fdpl n;
    private final fdpl o;
    private final fduf p;
    private final Set q;

    public vkv(Context context, fdpl fdplVar, ConversationId conversationId, ahax ahaxVar, fdjx fdjxVar, arpr arprVar, cogw cogwVar, vkk vkkVar, cssw csswVar, dalj daljVar, eigp eigpVar, agic agicVar, fcsu fcsuVar) {
        context.getClass();
        fdplVar.getClass();
        conversationId.getClass();
        ahaxVar.getClass();
        fdjxVar.getClass();
        arprVar.getClass();
        cogwVar.getClass();
        vkkVar.getClass();
        csswVar.getClass();
        daljVar.getClass();
        eigpVar.getClass();
        this.b = context;
        this.o = fdplVar;
        this.c = conversationId;
        this.d = ahaxVar;
        this.e = fdjxVar;
        this.f = arprVar;
        this.g = cogwVar;
        this.h = vkkVar;
        this.i = csswVar;
        this.j = daljVar;
        this.k = eigpVar;
        this.l = agicVar;
        this.m = fcsuVar;
        fduf fdufVarA = fdvf.a(false);
        this.p = fdufVarA;
        this.n = avac.h(auyk.a(fdplVar, "ConversationProperties"), auyk.a(vkkVar.l, "LeaveAction"), auyk.a(agicVar.b, "MuteAction"), new auyh("ShowSnooze", fdufVarA), fdjxVar, new vks(this, null));
        this.q = fcwm.b(zqx.b);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.q;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.n;
    }

    public final djmy c(final ahat ahatVar, final fduf fdufVar) {
        dktq dktqVar;
        fcww fcwwVar = new fcww((byte[]) null);
        Context context = this.b;
        String string = context.getString(R.string.action_snooze_alternative);
        string.getClass();
        fcwwVar.add(new djzw(string, null, !((Boolean) fdufVar.c()).booleanValue(), new fdae() { // from class: vkm
            @Override // defpackage.fdae
            public final Object invoke() {
                fdufVar.f(false);
                return fctx.a;
            }
        }));
        String string2 = context.getString(R.string.leave_group);
        string2.getClass();
        fcwwVar.add(new djzw(string2, null, ((Boolean) fdufVar.c()).booleanValue(), new fdae() { // from class: vkn
            @Override // defpackage.fdae
            public final Object invoke() {
                fdufVar.f(true);
                return fctx.a;
            }
        }));
        List listA = fcva.a(fcwwVar);
        djrr djrrVar = djrr.cn;
        String string3 = context.getString(R.string.leave_menu_leave_confirmation_title_single_v2);
        string3.getClass();
        String string4 = ((Boolean) fdufVar.c()).booleanValue() ? context.getString(R.string.leave_confirmation_text) : context.getString(R.string.leave_menu_leave_confirmation_text_single_v2);
        if (((Boolean) fdufVar.c()).booleanValue()) {
            String string5 = context.getString(android.R.string.ok);
            string5.getClass();
            dktqVar = new dktq(string5, new fdae() { // from class: vko
                @Override // defpackage.fdae
                public final Object invoke() throws IOException {
                    vkv vkvVar = this.a;
                    eieh eiehVarA = vkvVar.k.a("LeaveGroupConversationActionPlugin: Leave group Conversation");
                    try {
                        ((aghz) vkvVar.m.b()).a(2);
                        vkvVar.h.e(vkvVar.c);
                        fczl.a(eiehVarA, null);
                        return fctx.a;
                    } finally {
                    }
                }
            });
        } else {
            String string6 = context.getString(R.string.dialog_snooze_instead_confirm);
            string6.getClass();
            dktqVar = new dktq(string6, new fdae() { // from class: vkp
                @Override // defpackage.fdae
                public final Object invoke() {
                    ahatVar.a();
                    vkv vkvVar = this;
                    ((aghz) vkvVar.m.b()).a(3);
                    vkvVar.l.a.d();
                    return fctx.a;
                }
            });
        }
        String string7 = context.getString(R.string.snooze_cancel_button);
        string7.getClass();
        return new djmn(string3, listA, djrrVar, string4, null, null, dktqVar, new dktq(string7, new fdae() { // from class: vkq
            @Override // defpackage.fdae
            public final Object invoke() {
                ahatVar.a();
                return fctx.a;
            }
        }), null, 304);
    }
}
