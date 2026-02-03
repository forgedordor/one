package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daym {
    private static final ekrg q = ekrg.c("com/google/android/apps/messaging/welcome/v1/ui/WelcomeScreenUiAdapter");
    public final Context a;
    public final dava b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final Optional i;
    public final fcsu j;
    public final fdjx k;
    public final fcsu l;
    public final fcsu m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;
    public final fdue p;
    private final dazt r;
    private final fcsu s;
    private final fdjx t;
    private final fcsu u;

    public daym(Context context, dava davaVar, dazt daztVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, Optional optional, fcsu fcsuVar8, fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11) {
        context.getClass();
        davaVar.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        fcsuVar11.getClass();
        this.a = context;
        this.b = davaVar;
        this.r = daztVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.h = fcsuVar6;
        this.s = fcsuVar7;
        this.i = optional;
        this.j = fcsuVar8;
        this.k = fdjxVar;
        this.t = fdjxVar2;
        this.l = fcsuVar9;
        this.m = fcsuVar10;
        this.u = fcsuVar11;
        this.n = new AtomicBoolean();
        this.o = new AtomicBoolean();
        auvw.k(fdjxVar, null, null, new dayd(this, null), 3);
        this.p = fdun.e(1, 0, 2, 2);
    }

    public final dayp a(final ctcj ctcjVar) {
        dloh dlohVar;
        if (ctcjVar == ctcj.WELCOME_FLOW_SETTINGS) {
            Context context = this.a;
            String string = context.getString(R.string.welcome_settings_app_bar_title);
            string.getClass();
            dlnp dlnpVar = new dlnp(string, null, null, false, null, null, null, 254);
            String string2 = context.getString(R.string.welcome_back_content_description);
            string2.getClass();
            dlohVar = new dloh(dlnpVar, new dihq(string2, djrr.q, false, false, false, false, null, false, null, new fdae() { // from class: daxv
                @Override // defpackage.fdae
                public final Object invoke() {
                    daym daymVar = this.a;
                    auvw.k(daymVar.k, null, null, new dayi(daymVar, null), 3);
                    return fctx.a;
                }
            }, 1020), null, false, false, null, null, 124);
        } else {
            dlohVar = null;
        }
        dava davaVar = this.b;
        fdvc fdvcVarA = davaVar.a();
        fdvc fdvcVarB = auyk.b(davaVar.a(), "AccountSelection");
        fcsu fcsuVar = this.g;
        fdvc fdvcVarB2 = auyk.b(((daxj) fcsuVar.b()).b, "ProfileSharing");
        fdjx fdjxVar = this.k;
        fdvc fdvcVarB3 = fdtg.b(avac.i(fdvcVarB, fdvcVarB2, fdjxVar, new dayg(this, ctcjVar, null)), fdjxVar, fdur.a(0L, 3), null);
        dazt daztVar = this.r;
        return new dayp(dlohVar, fdvcVarA, fdvcVarB3, auyf.c(daztVar.c.a(), daztVar.d, new fdap() { // from class: dazs
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dauz dauzVar = (dauz) obj;
                dazu dazuVar = dazt.a;
                dauzVar.getClass();
                if (dauzVar instanceof dauw) {
                    return null;
                }
                if (dauzVar instanceof daux) {
                    return dazt.a;
                }
                if (!(dauzVar instanceof dauy)) {
                    throw new fctg();
                }
                if (((dauy) dauzVar).c) {
                    return null;
                }
                return dazt.b;
            }
        }), fdtg.b(avac.i(auyk.b(davaVar.a(), "AccountSelection"), auyk.b(((daxj) fcsuVar.b()).b, "ProfileSharing"), fdjxVar, new dayh(this, ctcjVar, null)), fdjxVar, fdur.a(0L, 3), null), auyf.c(davaVar.a(), fdjxVar, new fdap() { // from class: dayb
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dauz dauzVar = (dauz) obj;
                dauzVar.getClass();
                if (dauzVar instanceof dauw) {
                    return null;
                }
                daym daymVar = this.a;
                if (dauzVar instanceof daux) {
                    String string3 = daymVar.a.getString(R.string.welcome_notice_without_reachability);
                    string3.getClass();
                    return new daxr(string3, ecr.d, (diio) null, 12);
                }
                if (!(dauzVar instanceof dauy)) {
                    throw new fctg();
                }
                if (ctcjVar == ctcj.WELCOME_FLOW_SETTINGS) {
                    String string4 = daymVar.a.getString(R.string.welcome_settings_learn_more);
                    string4.getClass();
                    Object objB = daymVar.l.b();
                    objB.getClass();
                    return new daxr(string4, ecr.c, new diio((String) objB, 0, string4.length(), null, 56), true);
                }
                Context context2 = daymVar.a;
                String string5 = context2.getString(R.string.welcome_features_help_center);
                string5.getClass();
                String string6 = context2.getString(R.string.welcome_reachability_notice_v2, string5);
                string6.getClass();
                int iO = fdgn.O(string6, string5, 0, false, 6);
                Object objB2 = daymVar.l.b();
                objB2.getClass();
                return new daxr(string6, ecr.d, new diio((String) objB2, iO, iO + string5.length(), null, 56), 8);
            }
        }), this.p, new dayo(true, ((aske) this.u.b()).a()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (r10 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v6, types: [fcsu, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.dayk
            if (r0 == 0) goto L13
            r0 = r10
            dayk r0 = (defpackage.dayk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dayk r0 = new dayk
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r10)
            goto L9e
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L32:
            defpackage.fctl.b(r10)
            goto L5d
        L36:
            defpackage.fctl.b(r10)
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.n
            boolean r10 = r10.getAndSet(r4)
            if (r10 == 0) goto L42
            goto La0
        L42:
            fcsu r10 = r9.s
            java.lang.Object r10 = r10.b()
            aofc r10 = (defpackage.aofc) r10
            anpj r10 = r10.a()
            eiju r10 = r10.b()
            r10.getClass()
            r0.c = r4
            java.lang.Object r10 = defpackage.fdxs.c(r10, r0)
            if (r10 == r1) goto La3
        L5d:
            r10.getClass()
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = defpackage.fcva.P(r10)
            aoer r10 = (defpackage.aoer) r10
            if (r10 == 0) goto La0
            ekrg r2 = defpackage.daym.q
            ekrw r2 = r2.h()
            ekrz r5 = defpackage.eksq.a
            java.lang.String r6 = "BugleProfiles"
            r2.X(r5, r6)
            r5 = 365(0x16d, float:5.11E-43)
            java.lang.String r6 = "WelcomeScreenUiAdapter.kt"
            java.lang.String r7 = "com/google/android/apps/messaging/welcome/v1/ui/WelcomeScreenUiAdapter"
            java.lang.String r8 = "invalidateSelfToken"
            ekrw r2 = r2.h(r7, r8, r5, r6)
            ekrd r2 = (defpackage.ekrd) r2
            java.lang.String r5 = "User selected more restrictive sharing preference, invalidating self token"
            r2.q(r5)
            j$.util.Optional r2 = r9.i
            java.lang.Object r2 = r2.get()
            java.lang.Object r2 = r2.b()
            ajmu r2 = (defpackage.ajmu) r2
            r0.c = r3
            java.lang.Object r10 = r2.c(r10, r4, r0)
            if (r10 == r1) goto La3
        L9e:
            antv r10 = (defpackage.antv) r10
        La0:
            fctx r10 = defpackage.fctx.a
            return r10
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.daym.b(fcxy):java.lang.Object");
    }

    public final String c(chnc chncVar) {
        int i;
        int iOrdinal = chncVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            i = R.string.welcome_settings_dialog_people_you_message;
        } else if (iOrdinal == 2) {
            i = R.string.welcome_settings_dialog_only_your_contacts;
        } else {
            if (iOrdinal != 3) {
                throw new fctg();
            }
            i = R.string.welcome_settings_dialog_no_one;
        }
        String string = this.a.getString(i);
        string.getClass();
        return string;
    }

    public final void d(chnc chncVar, ctcj ctcjVar) {
        auvw.k(this.t, null, null, new dayl(this, chncVar, ctcjVar, null), 3);
    }
}
