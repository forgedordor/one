package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agiu implements vdy {
    public final Context a;
    public final ConversationId b;
    public final fdjx c;
    public final fcsu d;
    public final cogw e;
    public final fcsu f;
    public final fdpl g;
    public final Set h = fcwm.b(zqx.b);
    public final int i;
    private final fdpl j;
    private final ahax k;
    private final ardn l;

    public agiu(Context context, fdpl fdplVar, ConversationId conversationId, ahax ahaxVar, fdjx fdjxVar, fcsu fcsuVar, ardn ardnVar, cogw cogwVar, fcsu fcsuVar2, int i) {
        this.a = context;
        this.j = fdplVar;
        this.b = conversationId;
        this.k = ahaxVar;
        this.c = fdjxVar;
        this.d = fcsuVar;
        this.l = ardnVar;
        this.e = cogwVar;
        this.f = fcsuVar2;
        this.i = i;
        this.g = new agit(new fdpl[]{fdqq.a(fdplVar)}, this);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.h;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.g;
    }

    public final djmy c(final ahat ahatVar, final fduf fdufVar, final fduf fdufVar2) {
        fcww fcwwVar = new fcww((byte[]) null);
        Context context = this.a;
        String string = context.getString(R.string.snooze_radio_option_1_hour);
        string.getClass();
        Object objC = fdufVar.c();
        cgra cgraVar = cgra.b;
        fcwwVar.add(new djzw(string, null, objC == cgraVar, new fdae() { // from class: agid
            @Override // defpackage.fdae
            public final Object invoke() {
                fdufVar.f(cgra.b);
                return fctx.a;
            }
        }));
        String string2 = context.getString(R.string.snooze_radio_option_8_hours);
        string2.getClass();
        Object objC2 = fdufVar.c();
        cgra cgraVar2 = cgra.c;
        fcwwVar.add(new djzw(string2, null, objC2 == cgraVar2, new fdae() { // from class: agie
            @Override // defpackage.fdae
            public final Object invoke() {
                fdufVar.f(cgra.c);
                return fctx.a;
            }
        }));
        String string3 = context.getString(R.string.snooze_radio_option_24_hours);
        string3.getClass();
        Object objC3 = fdufVar.c();
        cgra cgraVar3 = cgra.d;
        fcwwVar.add(new djzw(string3, null, objC3 == cgraVar3, new fdae() { // from class: agif
            @Override // defpackage.fdae
            public final Object invoke() {
                fdufVar.f(cgra.d);
                return fctx.a;
            }
        }));
        String string4 = context.getString(R.string.snooze_radio_option_always);
        string4.getClass();
        Object objC4 = fdufVar.c();
        cgra cgraVar4 = cgra.e;
        fcwwVar.add(new djzw(string4, null, objC4 == cgraVar4, new fdae() { // from class: agig
            @Override // defpackage.fdae
            public final Object invoke() {
                fdufVar.f(cgra.e);
                return fctx.a;
            }
        }));
        List listA = fcva.a(fcwwVar);
        String string5 = context.getString(R.string.snooze_checkbox_mute_exception_option);
        string5.getClass();
        djwc djwcVar = new djwc(string5, null, null, ((Boolean) fdufVar2.c()).booleanValue(), false, new fdae() { // from class: agih
            @Override // defpackage.fdae
            public final Object invoke() {
                fdufVar2.f(Boolean.valueOf(!((Boolean) r0.c()).booleanValue()));
                return fctx.a;
            }
        }, null, 5, 86);
        djrr djrrVar = djrr.dP;
        String string6 = context.getString(R.string.action_snooze_alternative);
        string6.getClass();
        String string7 = context.getString(R.string.snooze_dialog_message);
        String string8 = context.getString(R.string.dialog_snooze_confirm);
        string8.getClass();
        dktq dktqVar = new dktq(string8, new fdae() { // from class: agii
            @Override // defpackage.fdae
            public final Object invoke() {
                agiu agiuVar = this.a;
                auvw.k(agiuVar.c, null, null, new agin(agiuVar, fdufVar, fdufVar2, ahatVar, null), 3);
                return fctx.a;
            }
        });
        String string9 = context.getString(R.string.snooze_cancel_button);
        string9.getClass();
        return new djmn(string6, listA, djrrVar, string7, null, djwcVar, dktqVar, new dktq(string9, new fdae() { // from class: agij
            @Override // defpackage.fdae
            public final Object invoke() {
                agiu agiuVar = this.a;
                if (agiuVar.i - 1 != 1) {
                    ((aghz) agiuVar.f.b()).b(3);
                } else {
                    ((aghz) agiuVar.f.b()).b(2);
                }
                ahatVar.a();
                return fctx.a;
            }
        }), null, 272);
    }

    public final void d() {
        final fduf fdufVarA = fdvf.a(cgra.c);
        final fduf fdufVarA2 = fdvf.a(Boolean.valueOf(this.l.a()));
        final fdua fduaVar = new fdua(fdufVarA, fdufVarA2, new agiq(null));
        this.k.d(true, new fdap() { // from class: agik
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ahat ahatVar = (ahat) obj;
                ahatVar.getClass();
                agiu agiuVar = this.a;
                if (agiuVar.i - 1 != 1) {
                    ((aghz) agiuVar.f.b()).c(3);
                } else {
                    ((aghz) agiuVar.f.b()).c(2);
                }
                fdpl fdplVar = fduaVar;
                fduf fdufVar = fdufVarA2;
                fduf fdufVar2 = fdufVarA;
                auvw.k(agiuVar.c, null, null, new agip(fdplVar, ahatVar, agiuVar, fdufVar2, fdufVar, null), 3);
                return agiuVar.c(ahatVar, fdufVar2, fdufVar);
            }
        });
    }
}
