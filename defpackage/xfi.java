package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfi implements xeg, vwg, dpyu {
    private final Optional A;
    private final xlm B;
    private final xfx C;
    private final fcsu D;
    private final fcsu E;
    private final fcsu F;
    private final fcsu G;
    private final ccyf H;
    private final boolean I;
    private final aisp J;
    private final fcsu K;
    private final fcsu L;
    private final fcsu M;
    private final fcsu N;
    private final fcsu O;
    private final fcsu P;
    private final fdpl Q;
    private final fduj R;
    private final fduf S;
    private dpzj T;
    private final fdvc U;
    private final fdap V;
    private dpyt W;
    private final fdpl X;
    private final fdvc Y;
    private final fdvc Z;
    private final fdpl aa;
    private final ahnz ab;
    public final fdjx c;
    public final fdjx d;
    public final fcsu e;
    public final Context f;
    public final ConversationId g;
    public final aqbh h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final cogw l;
    public final vuq m;
    public final aqkd n;
    public final arjw o;
    public final dnuy p;
    public final dnhl q;
    public fduf r;
    public fdkf s;
    public fdkf t;
    public AtomicBoolean u;
    public final aaft v;
    private final dnih x;
    private final fcsu y;
    private final fcsu z;
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl");
    private static final fdap w = new fdap() { // from class: xej
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            ekrg ekrgVar = xfi.a;
            ((Context) obj).getClass();
            return 0;
        }
    };
    public static final fctc b = fctd.a(new fdae() { // from class: xek
        @Override // defpackage.fdae
        public final Object invoke() {
            ekrg ekrgVar = xfi.a;
            return fcwm.d(dpxe.h, dpxe.g);
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:48:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xfi(defpackage.fdjx r17, defpackage.fdjx r18, defpackage.dnih r19, defpackage.dnhq r20, defpackage.fcsu r21, defpackage.fcsu r22, defpackage.fcsu r23, j$.util.Optional r24, defpackage.xlm r25, defpackage.xfx r26, defpackage.fcsu r27, defpackage.lwn r28, @defpackage.apnu defpackage.fcsu r29, @defpackage.aoow defpackage.fcsu r30, defpackage.fcsu r31, j$.util.Optional r32, defpackage.ccyf r33, boolean r34, defpackage.aisp r35, defpackage.fcsu r36, defpackage.fcsu r37, android.content.Context r38, defpackage.aaft r39, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r40, defpackage.aqbh r41, defpackage.fcsu r42, defpackage.fcsu r43, defpackage.fcsu r44, defpackage.ahnz r45, defpackage.fcsu r46, defpackage.fcsu r47, defpackage.fcsu r48, defpackage.fcsu r49, defpackage.fdpl r50, defpackage.fcsu r51, defpackage.fduj r52, defpackage.cogw r53, defpackage.vuq r54, defpackage.aqkd r55, defpackage.arjw r56, defpackage.asgk r57) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xfi.<init>(fdjx, fdjx, dnih, dnhq, fcsu, fcsu, fcsu, j$.util.Optional, xlm, xfx, fcsu, lwn, fcsu, fcsu, fcsu, j$.util.Optional, ccyf, boolean, aisp, fcsu, fcsu, android.content.Context, aaft, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, aqbh, fcsu, fcsu, fcsu, ahnz, fcsu, fcsu, fcsu, fcsu, fdpl, fcsu, fduj, cogw, vuq, aqkd, arjw, asgk):void");
    }

    private final djdi k(dpxe dpxeVar) {
        switch (dpxeVar.ordinal()) {
            case 0:
                return djdi.c;
            case 1:
            case 2:
            case 5:
            case 8:
                return djdi.d;
            case 3:
            default:
                return null;
            case 4:
                return djdi.e;
            case 6:
                return djdi.f;
            case 7:
                return ((dofj) ((dofb) this.A.get()).a.c()).p + (-1) != 0 ? djdi.a : djdi.b;
        }
    }

    private final djdk l(dpzi dpziVar) {
        if (dpziVar instanceof dpzd) {
            return djdj.a;
        }
        if (dpziVar instanceof dpzb) {
            return djdi.e;
        }
        if (dpziVar instanceof dpzf) {
            return k(((dpzf) dpziVar).a.a);
        }
        if (dpziVar instanceof dpzh) {
            return k(((dpzh) dpziVar).b);
        }
        throw new fctg();
    }

    @Override // defpackage.vwg
    public final dpzj a() {
        return (dpzj) this.r.c();
    }

    @Override // defpackage.vwg
    public final fdpl b() {
        return this.aa;
    }

    @Override // defpackage.vwg
    public final void c(vwf vwfVar) {
        if (this.u.get()) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 603, "InputsUiAdapterImpl.kt")).q("Ignoring selectInput as we are still processing a prior input change.");
            return;
        }
        this.u.set(true);
        if (fdbq.f(vwfVar, vvz.a)) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 609, "InputsUiAdapterImpl.kt")).q("AI input selected");
        } else if (fdbq.f(vwfVar, vwa.a)) {
            ekrw ekrwVarH2 = a.h();
            ekrwVarH2.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 610, "InputsUiAdapterImpl.kt")).q("Audio input selected");
        } else if (vwfVar instanceof vwb) {
            vvy vvyVar = ((vwb) vwfVar).a;
            dpxe dpxeVar = dpxe.a;
            int iOrdinal = vvyVar.ordinal();
            if (iOrdinal == 0) {
                ekrw ekrwVarE2 = a.e();
                ekrwVarE2.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 614, "InputsUiAdapterImpl.kt")).q("Emotive input selected with emoji screen");
            } else if (iOrdinal == 1) {
                ekrw ekrwVarE3 = a.e();
                ekrwVarE3.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarE3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 616, "InputsUiAdapterImpl.kt")).q("Emotive input selected with GIF screen");
            } else if (iOrdinal == 2) {
                ekrw ekrwVarE4 = a.e();
                ekrwVarE4.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarE4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 618, "InputsUiAdapterImpl.kt")).q("Emotive input selected with Stickers screen");
            } else {
                if (iOrdinal != 3) {
                    throw new fctg();
                }
                ekrw ekrwVarE5 = a.e();
                ekrwVarE5.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarE5.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 620, "InputsUiAdapterImpl.kt")).q("Emotive input selected with custom sticker screen");
            }
        } else if (fdbq.f(vwfVar, vwc.a)) {
            ekrw ekrwVarE6 = a.e();
            ekrwVarE6.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarE6.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 622, "InputsUiAdapterImpl.kt")).q("Gallery input selected");
        } else if (vwfVar instanceof vwe) {
            xhh xhhVar = ((vwe) vwfVar).a;
            if (xhhVar != null) {
                ekrw ekrwVarE7 = a.e();
                ekrwVarE7.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarE7.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 627, "InputsUiAdapterImpl.kt")).t("Shortcut %s selected.", xhhVar);
            } else {
                ekrw ekrwVarE8 = a.e();
                ekrwVarE8.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarE8.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 630, "InputsUiAdapterImpl.kt")).q("Shortcuts input selected");
            }
        } else if (fdbq.f(vwfVar, vwd.a)) {
            ekrw ekrwVarE9 = a.e();
            ekrwVarE9.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarE9.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 634, "InputsUiAdapterImpl.kt")).q("Opening keyboard programmatically");
        } else {
            if (vwfVar != null) {
                throw new fctg();
            }
            ekrw ekrwVarE10 = a.e();
            ekrwVarE10.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarE10.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 635, "InputsUiAdapterImpl.kt")).q("Closing all inputs");
        }
        auvw.k(this.d, null, null, new xfb(this, vwfVar, null), 3);
    }

    @Override // defpackage.xeg
    public final fdvc d() {
        xlm xlmVar = this.B;
        dqgm dqgmVarB = ((xmd) xlmVar.e.a.b()).b();
        xkv xkvVar = new xkv(dqgmVarB.d, (Duration) dqgmVarB.b.invoke());
        fdvc fdvcVar = ((xmd) xlmVar.d.b()).b().f;
        fdvc fdvcVarH = ((cliy) xlmVar.k.b()).h();
        xli xliVar = new xli(xlmVar, null);
        xfx xfxVar = this.C;
        fdvc fdvcVar2 = (fdvc) xfxVar.k.a();
        xfo xfoVar = new xfo(null, xfxVar);
        int i = fdsn.a;
        xer xerVar = new xer(new fdpl[]{this.S, this.r, fdud.c(xkvVar, fdvcVar, fdvcVarH, xlmVar.l, xlmVar.n, xliVar), fdtg.b(new fdwg(xfoVar, fdvcVar2), xfxVar.c, fdur.a(0L, 3), null), this.U, this.X, this.Y, this.Q, this.R, this.Z}, this);
        fdus fdusVar = fdur.b;
        dpzj dpzjVar = this.T;
        return fdtg.b(xerVar, this.d, fdusVar, new xef(new dpdy(dpzjVar, this.q, this, ((aqhd) this.j.b()).a(), 72), new djdm(null, null, null, null, false, null, null, new xeu(this), 252)));
    }

    public final dpyz e(dpxe dpxeVar) {
        return new dpyz(dpxeVar, i(dpxeVar), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r6 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.xev
            if (r0 == 0) goto L13
            r0 = r6
            xev r0 = (defpackage.xev) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xev r0 = new xev
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L62
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L4f
        L36:
            defpackage.fctl.b(r6)
            boolean r6 = defpackage.crbf.e()
            if (r6 == 0) goto L6e
            boolean r6 = r5.I
            if (r6 == 0) goto L6e
            dnuy r6 = r5.p
            if (r6 == 0) goto L6e
            r0.c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto L6d
        L4f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != r4) goto L6e
            ccyf r6 = r5.H
            r0.c = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L62
            goto L6d
        L62:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L6e
            vvy r6 = defpackage.vvy.d
            return r6
        L6d:
            return r1
        L6e:
            vvy r6 = defpackage.vwh.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xfi.f(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.vwf r6, defpackage.fcxy r7) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xfi.g(vwf, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.djdk r7, defpackage.fcxy r8) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xfi.h(djdk, fcxy):java.lang.Object");
    }

    public final fdap i(dpxe dpxeVar) {
        dpxeVar.getClass();
        return ((Set) b.a()).contains(dpxeVar) ? w : this.V;
    }

    public final void j(final djdi djdiVar) {
        if (this.u.get()) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onClick", 463, "InputsUiAdapterImpl.kt")).q("Ignoring onClick as we are still processing a prior input change.");
            return;
        }
        cogw cogwVar = this.l;
        fdvc fdvcVar = this.Y;
        final Instant instantF = cogwVar.f();
        if (((cljh) fdvcVar.c()).b() && !((aqts) this.O.b()).a() && !((aqtr) this.P.b()).a()) {
            dpxe dpxeVar = dpxe.a;
            int iOrdinal = djdiVar.ordinal();
            if (iOrdinal == 2 || iOrdinal == 5) {
                auvw.k(this.d, null, null, new xey(null), 3);
                return;
            }
        }
        this.u.set(true);
        djdk djdkVar = this.S.c() != djdiVar ? djdiVar : djdj.a;
        if (fdbq.f(djdkVar, djdj.a)) {
            ekrw ekrwVarE2 = a.e();
            ekrwVarE2.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onClick", 486, "InputsUiAdapterImpl.kt")).q("Closing input in Compose Row and opening keyboard.");
        } else {
            ekrw ekrwVarE3 = a.e();
            ekrwVarE3.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarE3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onClick", 488, "InputsUiAdapterImpl.kt")).t("%s input clicked", djdkVar);
        }
        if (((Boolean) this.E.b()).booleanValue() && djdkVar == djdi.c) {
            ((acgu) this.K.b()).a(33);
        }
        if (!((aqgu) this.L.b()).a() || !((aqgw) this.M.b()).a() || djdkVar != djdi.c) {
            if (((Boolean) this.F.b()).booleanValue() || djdkVar != djdi.f) {
                auvw.k(this.d, null, null, new xez(this, djdkVar, djdiVar, null), 3);
                return;
            } else {
                this.u.set(false);
                return;
            }
        }
        wdq wdqVarA = this.ab.a(emsj.CAMERA_GALLERY_BUTTON, new fdae() { // from class: xei
            @Override // defpackage.fdae
            public final Object invoke() {
                xfi xfiVar = this.a;
                xfiVar.u.set(false);
                Instant instantF2 = xfiVar.l.f();
                instantF2.getClass();
                Instant instant = instantF;
                instant.getClass();
                auvw.k(xfiVar.c, null, null, new xfa(xfiVar, djdiVar, eooc.a(instantF2, instant), null), 3);
                return fctx.a;
            }
        });
        if (wdqVarA.h()) {
            ((dpnt) this.N.b()).b(wdqVarA);
        } else {
            wdqVarA.g();
            this.u.set(false);
        }
    }

    @Override // defpackage.dpyu
    public final Object m(dpyt dpytVar) {
        if (fdbq.f(dpytVar, dpyk.a)) {
            if (!fdbq.f(dpytVar, this.W)) {
                ekrw ekrwVarE = a.e();
                ekrwVarE.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onStateChanged", 658, "InputsUiAdapterImpl.kt")).q("Compose Row input state is now closed");
            }
            this.S.f(null);
            this.r.f(dpyw.a);
        } else if (dpytVar instanceof dpyl) {
            dpzi dpziVar = ((dpyl) dpytVar).a;
            djdk djdkVarL = l(dpziVar);
            dpyt dpytVar2 = this.W;
            dpyl dpylVar = dpytVar2 instanceof dpyl ? (dpyl) dpytVar2 : null;
            if (!fdbq.f(dpylVar != null ? l(dpylVar.a) : null, djdkVarL)) {
                ekrw ekrwVarE2 = a.e();
                ekrwVarE2.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onStateChanged", 669, "InputsUiAdapterImpl.kt")).t("Compose Row now showing input %s without keyboard", djdkVarL);
            }
            this.S.f(djdkVarL);
            this.r.f(dpziVar);
        } else if (dpytVar instanceof dpym) {
            dpzi dpziVar2 = ((dpym) dpytVar).a;
            djdk djdkVarL2 = l(dpziVar2);
            dpyt dpytVar3 = this.W;
            dpym dpymVar = dpytVar3 instanceof dpym ? (dpym) dpytVar3 : null;
            if (!fdbq.f(dpymVar != null ? l(dpymVar.a) : null, djdkVarL2)) {
                ekrw ekrwVarE3 = a.e();
                ekrwVarE3.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarE3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onStateChanged", 680, "InputsUiAdapterImpl.kt")).t("Compose Row now showing input %s over keyboard", djdkVarL2);
            }
            this.S.f(djdkVarL2);
            this.r.f(dpziVar2);
        } else {
            if (!(dpytVar instanceof dpys)) {
                throw new fctg();
            }
            dpyt dpytVar4 = this.W;
            dpys dpysVar = dpytVar4 instanceof dpys ? (dpys) dpytVar4 : null;
            dplj dpljVar = dpysVar != null ? dpysVar.a : null;
            if (((dpys) dpytVar).a instanceof dplg) {
                if (dpljVar == null || !(dpljVar instanceof dplg)) {
                    ekrw ekrwVarE4 = a.e();
                    ekrwVarE4.X(eksq.a, "BugleComposeRow2");
                    ((ekrd) ekrwVarE4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onStateChanged", 690, "InputsUiAdapterImpl.kt")).q("Compose Row keyboard is closing");
                }
                this.S.f(null);
                this.r.f(dpyw.a);
            } else {
                if (dpljVar == null || (dpljVar instanceof dplg)) {
                    this.J.a(197874, null);
                    ekrw ekrwVarE5 = a.e();
                    ekrwVarE5.X(eksq.a, "BugleComposeRow2");
                    ((ekrd) ekrwVarE5.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onStateChanged", 698, "InputsUiAdapterImpl.kt")).q("Compose Row now showing keyboard without input");
                }
                this.S.f(djdj.a);
                this.r.f(new dpzd(dnii.a(this.x)));
            }
        }
        this.W = dpytVar;
        this.u.set(false);
        return fctx.a;
    }
}
