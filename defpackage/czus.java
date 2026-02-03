package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.rcs.setup.success.RcsSuccessMultiSimPopup;
import com.google.android.apps.messaging.ui.rcs.setup.success.RcsSuccessSingleSimPopup;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czus implements agzt, czuh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public czqr j;
    public CharSequence k;
    public CharSequence l;
    public CharSequence m;
    public CharSequence n;
    public cjxj o;
    private final eosc q;
    private final eosc r;
    private final fcsu s;
    private final fcsu t;
    private final fcsu u;
    private final fcsu v;
    private agzy w;
    private cpdw x;
    private cpdw y;
    private boolean z = false;
    public Optional p = Optional.empty();

    public czus(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.q = eoscVar;
        this.r = eoscVar2;
        this.g = fcsuVar6;
        this.s = fcsuVar7;
        this.t = fcsuVar8;
        this.u = fcsuVar9;
        this.h = fcsuVar10;
        this.v = fcsuVar11;
        this.i = fcsuVar12;
    }

    private final CharSequence m(Context context, String str) throws Resources.NotFoundException {
        String string = context.getResources().getString(true != l(str) ? R.string.rcs_success_popup_setting : R.string.rcs_success_popup_setting_rcs_default_on_oob);
        String string2 = context.getResources().getString(true != l(str) ? R.string.rcs_success_popup_body_v2 : R.string.rcs_success_popup_body_rcs_default_on_oob, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        int iLastIndexOf = string2.lastIndexOf(string);
        spannableStringBuilder.setSpan(new czur(this, context), iLastIndexOf, string.length() + iLastIndexOf, 17);
        return spannableStringBuilder;
    }

    @Override // defpackage.agzt
    public final eiju b() {
        return ((cmlb) this.t.b()).d().h(new ejvr() { // from class: czul
            /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
            @Override // defpackage.ejvr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.String r0 = "wantsToShowForAnySim"
                    java.lang.String r1 = "com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter"
                    java.util.Set r12 = (java.util.Set) r12
                    java.util.Iterator r12 = r12.iterator()
                    czus r2 = r11.a
                    java.lang.String r3 = "RcsSuccessPopupPresenter.java"
                Le:
                    boolean r4 = r12.hasNext()
                    r5 = 0
                    if (r4 == 0) goto Led
                    java.lang.Object r4 = r12.next()
                    cmmh r4 = (defpackage.cmmh) r4
                    java.lang.String r6 = r4.c
                    fcsu r7 = r2.f     // Catch: defpackage.evtj -> Lc9
                    java.lang.Object r7 = r7.b()     // Catch: defpackage.evtj -> Lc9
                    cjxi r7 = (defpackage.cjxi) r7     // Catch: defpackage.evtj -> Lc9
                    cmfo r8 = r7.d     // Catch: defpackage.evtj -> Lc9
                    evuh r8 = r8.l()     // Catch: defpackage.evtj -> Lc9
                    cjuu r8 = (defpackage.cjuu) r8     // Catch: defpackage.evtj -> Lc9
                    evtf r9 = new evtf     // Catch: defpackage.evtj -> Lc9
                    evub r8 = r8.s     // Catch: defpackage.evtj -> Lc9
                    evtb r10 = defpackage.cjuu.u     // Catch: defpackage.evtj -> Lc9
                    r9.<init>(r8, r10)     // Catch: defpackage.evtj -> Lc9
                    java.util.Map r8 = j$.util.DesugarCollections.unmodifiableMap(r9)     // Catch: defpackage.evtj -> Lc9
                    boolean r9 = r8.containsKey(r6)     // Catch: defpackage.evtj -> Lc9
                    if (r9 == 0) goto L47
                    java.lang.Object r7 = r8.get(r6)     // Catch: defpackage.evtj -> Lc9
                    cjxp r7 = (defpackage.cjxp) r7     // Catch: defpackage.evtj -> Lc9
                    goto L81
                L47:
                    fcsu r8 = r7.h     // Catch: defpackage.evtj -> Lc9
                    java.lang.Object r8 = r8.b()     // Catch: defpackage.evtj -> Lc9
                    crqu r8 = (defpackage.crqu) r8     // Catch: defpackage.evtj -> Lc9
                    r9 = -1
                    crqv r8 = r8.a(r9)     // Catch: defpackage.evtj -> Lc9
                    java.lang.String r10 = "buglesub_rcs_provision_info_state"
                    int r8 = r8.d(r10, r9)     // Catch: defpackage.evtj -> Lc9
                    cjxp r9 = defpackage.cjxp.RCS_SUCCESS_NOTIFICATION_STATE_UNSPECIFIED     // Catch: defpackage.evtj -> Lc9
                    fcsu r10 = r7.i     // Catch: defpackage.evtj -> Lc9
                    java.lang.Object r10 = r10.b()     // Catch: defpackage.evtj -> Lc9
                    cmlb r10 = (defpackage.cmlb) r10     // Catch: defpackage.evtj -> Lc9
                    cmmb r10 = r10.a()     // Catch: defpackage.evtj -> Lc9
                    java.lang.String r10 = r10.f     // Catch: defpackage.evtj -> Lc9
                    boolean r10 = r10.equals(r6)     // Catch: defpackage.evtj -> Lc9
                    if (r10 == 0) goto L7c
                    r10 = 2
                    if (r8 != r10) goto L76
                    cjxp r8 = defpackage.cjxp.RCS_SUCCESS_NOTIFICATION_STATE_SUCCESS_AWAITING_NOTIFY     // Catch: defpackage.evtj -> Lc9
                    goto L7d
                L76:
                    r10 = 4
                    if (r8 != r10) goto L7c
                    cjxp r8 = defpackage.cjxp.RCS_SUCCESS_NOTIFICATION_STATE_NOTIFIED     // Catch: defpackage.evtj -> Lc9
                    goto L7d
                L7c:
                    r8 = r9
                L7d:
                    r7.i(r6, r8)     // Catch: defpackage.evtj -> Lc9
                    r7 = r8
                L81:
                    cjxp r8 = defpackage.cjxp.RCS_SUCCESS_NOTIFICATION_STATE_SUCCESS_AWAITING_NOTIFY     // Catch: defpackage.evtj -> Lc9
                    boolean r9 = r2.k(r6)     // Catch: defpackage.evtj -> Lc9
                    r10 = 1
                    if (r9 != 0) goto L90
                    boolean r9 = defpackage.dfpi.O()     // Catch: defpackage.evtj -> Lc9
                    if (r9 == 0) goto L91
                L90:
                    r5 = r10
                L91:
                    if (r7 != r8) goto Le
                    if (r5 == 0) goto Le
                    boolean r5 = r2.j(r6)     // Catch: defpackage.evtj -> Lc9
                    if (r5 == 0) goto La3
                    czqr r5 = r2.j     // Catch: defpackage.evtj -> Lc9
                    cjxj r5 = r5.a()     // Catch: defpackage.evtj -> Lc9
                    r2.o = r5     // Catch: defpackage.evtj -> Lc9
                La3:
                    ekrg r5 = defpackage.czus.a     // Catch: defpackage.evtj -> Lc9
                    ekrw r5 = r5.e()     // Catch: defpackage.evtj -> Lc9
                    ekrd r5 = (defpackage.ekrd) r5     // Catch: defpackage.evtj -> Lc9
                    r7 = 201(0xc9, float:2.82E-43)
                    ekrw r5 = r5.h(r1, r0, r7, r3)     // Catch: defpackage.evtj -> Lc9
                    ekrd r5 = (defpackage.ekrd) r5     // Catch: defpackage.evtj -> Lc9
                    java.lang.String r7 = "wantsToShowForAnySim: setting popupSimInfo for simId: %s"
                    dhiz r8 = defpackage.dhiz.SIM_ID     // Catch: defpackage.evtj -> Lc9
                    java.lang.String r8 = r8.c(r6)     // Catch: defpackage.evtj -> Lc9
                    r5.t(r7, r8)     // Catch: defpackage.evtj -> Lc9
                    j$.util.Optional r4 = j$.util.Optional.of(r4)     // Catch: defpackage.evtj -> Lc9
                    r2.p = r4     // Catch: defpackage.evtj -> Lc9
                    java.lang.Boolean r12 = java.lang.Boolean.valueOf(r10)     // Catch: defpackage.evtj -> Lc9
                    goto Lf1
                Lc9:
                    r4 = move-exception
                    ekrg r5 = defpackage.czus.a
                    ekrw r5 = r5.j()
                    ekrd r5 = (defpackage.ekrd) r5
                    ekrw r4 = r5.g(r4)
                    ekrd r4 = (defpackage.ekrd) r4
                    r5 = 208(0xd0, float:2.91E-43)
                    ekrw r4 = r4.h(r1, r0, r5, r3)
                    ekrd r4 = (defpackage.ekrd) r4
                    dhiz r5 = defpackage.dhiz.SIM_ID
                    java.lang.String r5 = r5.c(r6)
                    java.lang.String r6 = "wantsToShowForAnySim: failed to get rcsSuccessNotificationState for simId: %s"
                    r4.t(r6, r5)
                    goto Le
                Led:
                    java.lang.Boolean r12 = java.lang.Boolean.valueOf(r5)
                Lf1:
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.czul.apply(java.lang.Object):java.lang.Object");
            }
        }, this.r);
    }

    @Override // defpackage.agzt
    public final void c(agzy agzyVar, ViewGroup viewGroup) {
        this.w = agzyVar;
        this.x = new cpdw(viewGroup, R.id.conversation_list_rcs_success_single_sim_popup_stub, R.id.conversation_list_rcs_success_single_sim_popup);
        this.y = new cpdw(viewGroup, R.id.conversation_list_rcs_success_multi_sim_popup_stub, R.id.conversation_list_rcs_success_multi_sim_popup);
        this.j = ((czqs) this.s.b()).a(emfe.PROVISIONING_UI_TYPE_RCS_SUCCESS, 5);
    }

    @Override // defpackage.agzt
    public final void d() {
        this.x.e();
        this.y.e();
        this.w.b();
    }

    @Override // defpackage.agzt
    public final boolean e(final Context context, ViewGroup viewGroup, boolean z) {
        fcsu fcsuVar = this.d;
        int iE = ((crny) fcsuVar.b()).e();
        final cmmh cmmhVar = (cmmh) this.p.orElse(null);
        if (cmmhVar == null) {
            ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter", "show", 224, "RcsSuccessPopupPresenter.java")).q("popupSimInfo is empty");
            return false;
        }
        if (iE > 1) {
            cqca.c("BugleRcs", "prepareMultiSimPopup");
            cmmh cmmhVar2 = (cmmh) this.p.orElse(null);
            if (cmmhVar2 == null) {
                ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter", "prepareMultiSimPopup", 381, "RcsSuccessPopupPresenter.java")).q("popupSimInfo is empty");
            } else {
                String str = cmmhVar2.u;
                this.l = str;
                if (TextUtils.isEmpty(str)) {
                    ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter", "prepareMultiSimPopup", 386, "RcsSuccessPopupPresenter.java")).q("preferredSubscriptionName is empty");
                } else {
                    this.k = context.getString(R.string.rcs_success_popup_sim_slot_identifier, Integer.valueOf(cmmhVar2.e + 1));
                    this.m = (CharSequence) ((Optional) ((dghj) this.v.b()).f(new dggp(cmmhVar2.c)).map(new Function() { // from class: czun
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Optional.of(((alrj) this.a.i.b()).r(((dggk) obj).a));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse(((crny) fcsuVar.b()).h(cmmhVar2.d).i(true))).map(new Function() { // from class: czuo
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return context.getString(R.string.rcs_success_popup_title_multi_sim_v2, ((cpga) this.a.g.b()).b(((alqm) obj).F().toString().replaceAll("\\s", " ")));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse(context.getString(R.string.rcs_success_popup_title_single_sim_v2));
                    this.n = m(context, cmmhVar2.c);
                    this.z = true;
                }
            }
            ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter", "show", 231, "RcsSuccessPopupPresenter.java")).q("show: returning false, multiSimEnabled but failed to prepare multi sim popup");
            return false;
        }
        this.z = false;
        String str2 = cmmhVar.c;
        cqca.c("BugleRcs", "prepareSingleSimPopup");
        this.m = context.getString(R.string.rcs_success_popup_title_single_sim_v2);
        this.n = m(context, str2);
        eijx.f(new Runnable() { // from class: czup
            @Override // java.lang.Runnable
            public final void run() {
                cmmh cmmhVar3 = cmmhVar;
                czus czusVar = this.a;
                String str3 = cmmhVar3.c;
                ((cjya) czusVar.h.b()).f(czusVar.l(str3), emfc.RCS_PROVISIONING_SUCCESS_POPUP_SEEN, str3);
                if (czusVar.k(str3) || dfpi.O()) {
                    ((ains) czusVar.c.b()).c("Bugle.FastTrack.Provisioning.SuccessPopup.Seen");
                    ((crqx) czusVar.b.b()).s(61);
                }
            }
        }, this.q).k(auvh.b(), eoqg.a);
        if (l(cmmhVar.c)) {
            final czqr czqrVar = this.j;
            czqrVar.getClass();
            auvh.h(eijx.f(new Runnable() { // from class: czuq
                @Override // java.lang.Runnable
                public final void run() {
                    czqrVar.e();
                }
            }, this.r));
        }
        if (this.z) {
            cqca.c("BugleRcs", "show: Show MultiSim rcs success popup");
            RcsSuccessMultiSimPopup rcsSuccessMultiSimPopup = (RcsSuccessMultiSimPopup) this.y.b();
            rcsSuccessMultiSimPopup.a = this;
            rcsSuccessMultiSimPopup.c();
            return true;
        }
        cqca.c("BugleRcs", "show: Show SingleSim rcs success popup");
        RcsSuccessSingleSimPopup rcsSuccessSingleSimPopup = (RcsSuccessSingleSimPopup) this.x.b();
        rcsSuccessSingleSimPopup.a = this;
        rcsSuccessSingleSimPopup.c();
        return true;
    }

    @Override // defpackage.agzt
    public final int f() {
        return 4;
    }

    @Override // defpackage.agzt
    public final void g() {
        cqca.c("BugleRcs", "provision notification: notified. user ignored.");
        ((cjya) this.h.b()).f(false, emfc.RCS_PROVISIONING_SUCCESS_POPUP_IGNORED, ((cmmh) this.p.orElseThrow(new Supplier() { // from class: czum
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException("popupSimInfo should not be empty");
            }
        })).c);
        i();
    }

    @Override // defpackage.czuh
    public final void h(TextView textView) {
        eebt.b(textView);
        eebt.c(textView);
    }

    @Override // defpackage.czuh
    public final void i() {
        cqca.c("BugleRcs", "provision notification: notified. user clicked.");
        final String str = ((cmmh) this.p.orElseThrow(new Supplier() { // from class: czuj
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException("popupSimInfo should not be empty");
            }
        })).c;
        ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter", "onDismissClicked", 310, "RcsSuccessPopupPresenter.java")).t("onDismissClicked: dismissed popup for simId: %s", dhiz.SIM_ID.c(str));
        eiju eijuVarF = eijx.f(new Runnable() { // from class: czuk
            @Override // java.lang.Runnable
            public final void run() {
                ((cjxi) this.a.f.b()).i(str, cjxp.RCS_SUCCESS_NOTIFICATION_STATE_NOTIFIED);
            }
        }, this.r);
        eora eoraVarB = auvh.b();
        eoqg eoqgVar = eoqg.a;
        eijuVarF.k(eoraVarB, eoqgVar);
        ((cjya) this.h.b()).f(false, emfc.RCS_PROVISIONING_SUCCESS_POPUP_DISMISSED, str);
        if (dfpi.V()) {
            ((cjxi) this.f.b()).d.j(new ejvr() { // from class: cjvd
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    cjub cjubVar = (cjub) ((cjuu) obj).toBuilder();
                    cjubVar.copyOnWrite();
                    ((cjuu) cjubVar.instance).o = true;
                    return (cjuu) cjubVar.build();
                }
            }).h(new ejvr() { // from class: cjvk
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return null;
                }
            }, eoqgVar).k(auvh.b(), eoqgVar);
        }
        d();
    }

    public final boolean j(String str) {
        return dfpi.z() ? ((cebq) this.u.b()).c(str).s : dfpi.J();
    }

    public final boolean k(String str) {
        return dfpi.z() ? ((cebq) this.u.b()).c(str).n : dfar.b();
    }

    public final boolean l(String str) {
        cjxj cjxjVar;
        return j(str) && (cjxjVar = this.o) != null && cjxjVar.equals(cjxj.OOB_CONSENT);
    }

    @Override // defpackage.agzt
    public final /* synthetic */ int n() {
        return agzs.a();
    }
}
