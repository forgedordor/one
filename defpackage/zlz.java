package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zlz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/tombstone/TombstoneUiAdapter");
    public final Context b;
    public final fdjx c;
    public final fdpl d;
    public final ConversationId e;
    public final fcsu f;
    public final ahax g;
    public final afzc h;
    public final zea i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    private final fdpl m;
    private final ajlu n;
    private final fcsu o;
    private final fcsu p;
    private final fduj q;
    private final fcsu r;

    public zlz(Context context, fdjx fdjxVar, fdpl fdplVar, fdpl fdplVar2, ajlu ajluVar, ConversationId conversationId, fcsu fcsuVar, ahax ahaxVar, afzc afzcVar, fcsu fcsuVar2, aptw aptwVar, zea zeaVar, fcsu fcsuVar3, fcsu fcsuVar4, fduj fdujVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        context.getClass();
        fdjxVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        ajluVar.getClass();
        conversationId.getClass();
        fcsuVar.getClass();
        ahaxVar.getClass();
        afzcVar.getClass();
        aptwVar.getClass();
        fcsuVar3.getClass();
        fdujVar.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.m = fdplVar;
        this.d = fdplVar2;
        this.n = ajluVar;
        this.e = conversationId;
        this.f = fcsuVar;
        this.g = ahaxVar;
        this.h = afzcVar;
        this.o = fcsuVar2;
        this.i = zeaVar;
        this.p = fcsuVar3;
        this.j = fcsuVar4;
        this.q = fdujVar;
        this.k = fcsuVar5;
        this.r = fcsuVar6;
        this.l = fcsuVar7;
    }

    private final diip e(String str) {
        ((crwg) this.l.b()).f(1);
        String string = this.b.getString(R.string.tombstone_chatbot_unsubscribe_link);
        string.getClass();
        return new diin(dijs.h, fdgn.O(str, string, 0, false, 6), fdgn.O(str, string, 0, false, 6) + string.length(), string, new fdap() { // from class: zkt
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                zlz zlzVar = this.a;
                ((crwg) zlzVar.l.b()).f(3);
                auvw.k(zlzVar.c, null, null, new zlm(zlzVar, null), 3);
                return true;
            }
        });
    }

    private final diip f(String str) {
        ((crwg) this.l.b()).f(2);
        String string = this.b.getString(R.string.tombstone_chatbot_subscribe_link);
        string.getClass();
        return new diin(dijs.h, fdgn.O(str, string, 0, false, 6), fdgn.O(str, string, 0, false, 6) + string.length(), string, new fdap() { // from class: zkz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                zlz zlzVar = this.a;
                ((crwg) zlzVar.l.b()).f(4);
                auvw.k(zlzVar.c, null, null, new zlp(zlzVar, null), 3);
                return true;
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final dlkv a(amwg amwgVar) {
        diip diipVarF;
        diip diinVar;
        String strM;
        int iO;
        diin diinVar2;
        String strU;
        int iO2;
        String string = Html.fromHtml(fdgn.q(amwgVar.a(), "\n", "<br/>"), 63).toString();
        switch (amwgVar.b() - 1) {
            case 0:
            case 7:
                diipVarF = null;
                break;
            case 1:
                String string2 = this.b.getString(R.string.settings_link_text);
                string2.getClass();
                int iO3 = fdgn.O(string, string2, 0, false, 6);
                if (iO3 >= 0) {
                    diinVar = new diin(dijs.h, iO3, iO3 + string2.length(), string2, new fdap() { // from class: zku
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            zlz zlzVar = this.a;
                            auvw.k(zlzVar.c, null, null, new zlr(zlzVar, null), 3);
                            return true;
                        }
                    });
                    diipVarF = diinVar;
                    break;
                }
                diipVarF = null;
                break;
            case 2:
                Context context = this.b;
                String string3 = context.getString(R.string.how_it_works);
                string3.getClass();
                final String strB = new fdgl("\\s").b(string3, " ");
                final String string4 = context.getString(R.string.e2ee_description, strB);
                string4.getClass();
                String string5 = context.getString(R.string.tombstone_learn_more_link);
                string5.getClass();
                int iO4 = fdgn.O(string, string5, 0, false, 6);
                if (iO4 >= 0) {
                    final String str = (String) bvur.b.e();
                    diinVar = new diin(dijs.h, iO4, iO4 + string5.length(), string5, new fdap() { // from class: zkv
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            final zlz zlzVar = this.a;
                            final String str2 = str;
                            final String str3 = string4;
                            final String str4 = strB;
                            zlzVar.g.d(true, new fdap() { // from class: zld
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj2) {
                                    final ahat ahatVar = (ahat) obj2;
                                    ahatVar.getClass();
                                    final zlz zlzVar2 = zlzVar;
                                    Context context2 = zlzVar2.b;
                                    djrr djrrVar = djrr.cj;
                                    String string6 = context2.getString(R.string.user_toggle_for_etouffee);
                                    final String str5 = str2;
                                    str5.getClass();
                                    fdap fdapVar = new fdap() { // from class: zkw
                                        @Override // defpackage.fdap
                                        public final Object invoke(Object obj3) {
                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str5));
                                            intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                                            zlzVar2.b.startActivity(intent);
                                            return true;
                                        }
                                    };
                                    String str6 = str3;
                                    List listB = fcva.b(new diio(str5, str6.length() - str4.length(), str6.length(), fdapVar, 24));
                                    String string7 = context2.getString(android.R.string.ok);
                                    string7.getClass();
                                    return new djmj(str6, listB, djrrVar, string6, false, false, new dktq(string7, new fdae() { // from class: zkx
                                        @Override // defpackage.fdae
                                        public final Object invoke() {
                                            ahatVar.a();
                                            return fctx.a;
                                        }
                                    }), null, null, 432);
                                }
                            });
                            return true;
                        }
                    });
                    diipVarF = diinVar;
                    break;
                }
                diipVarF = null;
                break;
            case 3:
                String string6 = this.b.getString(R.string.details_link);
                string6.getClass();
                int iO5 = fdgn.O(string, string6, 0, false, 6);
                if (iO5 >= 0) {
                    diinVar = new diin(dijs.h, iO5, iO5 + string6.length(), string6, new fdap() { // from class: zle
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            ((ekrd) zlz.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/tombstone/TombstoneUiAdapter", "createDetailsLinkAnnotation$lambda$10", 295, "TombstoneUiAdapter.kt")).q("Open conversation detail from tombstone link.");
                            zlz zlzVar = this.a;
                            auvw.k(zlzVar.c, null, null, new zlq(zlzVar, null), 3);
                            return true;
                        }
                    });
                    diipVarF = diinVar;
                    break;
                }
                diipVarF = null;
                break;
            case 4:
                String string7 = this.b.getString(R.string.tombstone_learn_more_link);
                string7.getClass();
                int iO6 = fdgn.O(string, string7, 0, false, 6);
                if (iO6 >= 0) {
                    diinVar = new diin(dijs.h, iO6, iO6 + string7.length(), string7, new fdap() { // from class: zla
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            zlz zlzVar = this.a;
                            auvw.k(zlzVar.c, null, null, new zls(zlzVar, null), 3);
                            return true;
                        }
                    });
                    diipVarF = diinVar;
                    break;
                }
                diipVarF = null;
                break;
            case 5:
                Optional optional = (Optional) this.o.b();
                if (!optional.isEmpty() && (iO = fdgn.O(string, (strM = ((cgsa) optional.get()).m()), 0, false, 6)) >= 0) {
                    final String strL = ((cgsa) optional.get()).l();
                    diinVar = new diio(((cgsa) optional.get()).l(), iO, iO + strM.length(), new fdap() { // from class: zlg
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            Uri uri = Uri.parse(strL);
                            uri.getClass();
                            this.a.h.h(new agdi(uri));
                            return true;
                        }
                    }, 24);
                    diipVarF = diinVar;
                    break;
                }
                diipVarF = null;
                break;
            case 6:
                final Optional optional2 = (Optional) this.p.b();
                if (!optional2.isEmpty()) {
                    Context context2 = this.b;
                    String string8 = context2.getString(R.string.change_link);
                    string8.getClass();
                    int iO7 = fdgn.O(string, string8, 0, false, 6);
                    if (iO7 >= 0) {
                        diinVar2 = new diin(dijs.h, iO7, iO7 + string8.length(), context2.getString(R.string.custom_theme_plugin_title), new fdap() { // from class: zlh
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                zlz zlzVar = this.a;
                                auvw.k(zlzVar.c, null, null, new zlv(zlzVar, optional2, null), 3);
                                return true;
                            }
                        });
                        diipVarF = diinVar2;
                        break;
                    } else {
                        ((ekrd) a.j().h("com/google/android/apps/messaging/conversation2/messagelist/message/tombstone/TombstoneUiAdapter", "createThemeChangeLinkAnnotation", 391, "TombstoneUiAdapter.kt")).q("Change link not found.");
                    }
                } else {
                    ((ekrd) a.j().h("com/google/android/apps/messaging/conversation2/messagelist/message/tombstone/TombstoneUiAdapter", "createThemeChangeLinkAnnotation", 385, "TombstoneUiAdapter.kt")).q("Unable to linkify. Custom theme uiAdapter not present");
                }
                diipVarF = null;
                break;
            case 8:
                Optional optional3 = (Optional) this.o.b();
                if (!optional3.isEmpty() && (iO2 = fdgn.O(string, (strU = ((cgsa) optional3.get()).u()), 0, false, 6)) >= 0) {
                    diinVar = new diin(dijs.h, iO2, iO2 + strU.length(), new fdap() { // from class: zky
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            zlz zlzVar = this.a;
                            auvw.l(zlzVar.c, new zlt(zlzVar, null));
                            return true;
                        }
                    }, 8);
                    diipVarF = diinVar;
                    break;
                }
                diipVarF = null;
                break;
            case 9:
                diipVarF = f(string);
                break;
            case 10:
                diipVarF = e(string);
                break;
            case 11:
            default:
                Context context3 = this.b;
                String string9 = context3.getString(R.string.tombstone_active_self_identity_changed, "");
                string9.getClass();
                if (!fdgn.G(string, string9, false)) {
                    String string10 = context3.getString(R.string.rbm_sim_change, "__");
                    string10.getClass();
                    List listS = fdgn.S(string10, new String[]{"__"}, 0, 6);
                    if (listS.size() == 2 && fdgn.G(string, (CharSequence) fcva.N(listS), false)) {
                        String strQ = fdgn.q(fdgn.q(string, (String) listS.get(0), ""), (String) listS.get(1), "");
                        int iO8 = fdgn.O(string, strQ, 0, false, 6);
                        diinVar2 = new diin(dijs.h, iO8, iO8 + strQ.length(), context3.getString(R.string.active_sim_changed_click_label), new fdap() { // from class: zlc
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                zlz zlzVar = this.a;
                                auvw.k(zlzVar.c, null, null, new zlj(zlzVar, null), 3);
                                return true;
                            }
                        });
                    }
                    diipVarF = null;
                    break;
                } else {
                    String strQ2 = fdgn.q(string, string9, "");
                    int iO9 = fdgn.O(string, strQ2, 0, false, 6);
                    diinVar2 = new diin(dijs.h, iO9, iO9 + strQ2.length(), context3.getString(R.string.active_sim_changed_click_label), new fdap() { // from class: zlb
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            zlz zlzVar = this.a;
                            auvw.k(zlzVar.c, null, null, new zli(zlzVar, null), 3);
                            return true;
                        }
                    });
                }
                diipVarF = diinVar2;
                break;
            case 12:
                String string11 = this.b.getString(R.string.tombstone_chatbot_subscription_error_link);
                string11.getClass();
                diinVar = new diin(dijs.h, fdgn.O(string, string11, 0, false, 6), fdgn.O(string, string11, 0, false, 6) + string11.length(), string11, new fdap() { // from class: zks
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        zlz zlzVar = this.a;
                        auvw.k(zlzVar.c, null, null, new zlo(zlzVar, null), 3);
                        return true;
                    }
                });
                diipVarF = diinVar;
                break;
            case 13:
                String string12 = this.b.getString(R.string.tombstone_chatbot_subscription_error_link);
                string12.getClass();
                diinVar = new diin(dijs.h, fdgn.O(string, string12, 0, false, 6), fdgn.O(string, string12, 0, false, 6) + string12.length(), string12, new fdap() { // from class: zlf
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        zlz zlzVar = this.a;
                        auvw.k(zlzVar.c, null, null, new zlk(zlzVar, null), 3);
                        return true;
                    }
                });
                diipVarF = diinVar;
                break;
            case 14:
                diipVarF = f(string);
                break;
            case 15:
                diipVarF = e(string);
                break;
        }
        return new dlkv(string, diipVarF != null ? fcva.b(diipVarF) : fcvo.a, amwgVar.b() + (-1) == 2 ? djrr.cj : null, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.zlw
            if (r0 == 0) goto L13
            r0 = r7
            zlw r0 = (defpackage.zlw) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            zlw r0 = new zlw
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r6 = r0.a
            java.lang.Object r0 = r0.b
            defpackage.fctl.b(r7)
            goto L49
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.fctl.b(r7)
            afzc r7 = r5.h
            fdpl r2 = r5.m
            r0.b = r7
            r0.a = r6
            r0.e = r3
            java.lang.Object r0 = defpackage.fdtc.a(r2, r0)
            if (r0 == r1) goto L59
            r4 = r0
            r0 = r7
            r7 = r4
        L49:
            ajlu r1 = r5.n
            ajlk r7 = (defpackage.ajlk) r7
            agbt r2 = new agbt
            r3 = 2
            r2.<init>(r7, r1, r6, r3)
            r0.h(r2)
            fctx r6 = defpackage.fctx.a
            return r6
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zlz.b(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.zlx
            if (r0 == 0) goto L13
            r0 = r5
            zlx r0 = (defpackage.zlx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zlx r0 = new zlx
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L5c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r4.e
            boolean r5 = r5 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId
            if (r5 != 0) goto L52
            ekrg r5 = defpackage.zlz.a
            ekrw r5 = r5.j()
            r0 = 316(0x13c, float:4.43E-43)
            java.lang.String r1 = "TombstoneUiAdapter.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/messagelist/message/tombstone/TombstoneUiAdapter"
            java.lang.String r3 = "launchInfoAndOptions"
            ekrw r5 = r5.h(r2, r3, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "Attempted to launch info and options from non-RBM conversation."
            r5.q(r0)
            goto L8f
        L52:
            fdpl r5 = r4.d
            r0.c = r3
            java.lang.Object r5 = defpackage.fdtc.a(r5, r0)
            if (r5 == r1) goto L92
        L5c:
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = defpackage.fcva.Y(r5)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            r0 = 0
            if (r5 == 0) goto L71
            alqm r5 = r5.g()
            if (r5 == 0) goto L71
            java.lang.String r0 = r5.l()
        L71:
            if (r0 == 0) goto L8f
            fcsu r5 = r4.r
            java.lang.Object r5 = r5.b()
            ajhd r5 = (defpackage.ajhd) r5
            r1 = 2
            elrk r2 = defpackage.elrk.BIZINFO_SOURCE_SIM_SWITCHED_TOMBSTONE
            r5.am(r1, r2, r0)
            afzc r5 = r4.h
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r4.e
            com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId r1 = (com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId) r1
            agde r2 = new agde
            r2.<init>(r1, r0)
            r5.h(r2)
        L8f:
            fctx r5 = defpackage.fctx.a
            return r5
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zlz.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.zly
            if (r0 == 0) goto L13
            r0 = r5
            zly r0 = (defpackage.zly) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zly r0 = new zly
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fduj r5 = r4.q
            r0.c = r3
            java.lang.Object r5 = defpackage.fdtc.a(r5, r0)
            if (r5 == r1) goto L54
        L3c:
            boolean r0 = r5 instanceof defpackage.wab
            if (r0 == 0) goto L43
            wab r5 = (defpackage.wab) r5
            goto L44
        L43:
            r5 = 0
        L44:
            r0 = 0
            if (r5 == 0) goto L4e
            boolean r5 = r5.w()
            if (r5 != r3) goto L4e
            goto L4f
        L4e:
            r3 = r0
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zlz.d(fcxy):java.lang.Object");
    }
}
