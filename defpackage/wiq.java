package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wiq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController");
    public static final wlk b = new wlk(true, 104857600, true, true, 10, eoob.e(6));
    private final fctc A;
    public final fcyh c;
    public final fdjx d;
    public final fdjx e;
    public final wre f;
    public final wli g;
    public final wjc h;
    public final xee i;
    public final fcsu j;
    public final whk k;
    public final aqdn l;
    public final ejya m;
    public final fcsu n;
    public final fcsu o;
    public final fdvc p;
    public final dnib q;
    public final whw r;
    private final wmp s;
    private final fduj t;
    private final wob u;
    private final whe v;
    private final fcsu w;
    private final woh x;
    private final wkt y;
    private final dlvl z;

    public wiq(fcyh fcyhVar, fdjx fdjxVar, fdjx fdjxVar2, wre wreVar, wmp wmpVar, wli wliVar, wjc wjcVar, fduj fdujVar, wob wobVar, whe wheVar, xee xeeVar, final fcsu fcsuVar, fcsu fcsuVar2, whk whkVar, aqdn aqdnVar, fcsu fcsuVar3, ejya ejyaVar, woh wohVar, wkt wktVar, fcsu fcsuVar4, dlvl dlvlVar, vuc vucVar, fcsu fcsuVar5) {
        fcyhVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        wreVar.getClass();
        wjcVar.getClass();
        fdujVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        wohVar.getClass();
        wktVar.getClass();
        fcsuVar4.getClass();
        dlvlVar.getClass();
        vucVar.getClass();
        this.c = fcyhVar;
        this.d = fdjxVar;
        this.e = fdjxVar2;
        this.f = wreVar;
        this.s = wmpVar;
        this.g = wliVar;
        this.h = wjcVar;
        this.t = fdujVar;
        this.u = wobVar;
        this.v = wheVar;
        this.i = xeeVar;
        this.j = fcsuVar2;
        this.k = whkVar;
        this.l = aqdnVar;
        this.w = fcsuVar3;
        this.m = ejyaVar;
        this.x = wohVar;
        this.y = wktVar;
        this.n = fcsuVar4;
        this.z = dlvlVar;
        this.o = fcsuVar5;
        this.A = fctd.a(new fdae() { // from class: whm
            @Override // defpackage.fdae
            public final Object invoke() {
                ekrg ekrgVar = wiq.a;
                return (vwj) fcsuVar.b();
            }
        });
        this.p = fdtg.b(new wip(new wim(fdujVar)), fdjxVar2, fdur.a, b);
        this.r = new whw(this);
        this.q = new wig(this);
    }

    public final vwj a() {
        Object objA = this.A.a();
        objA.getClass();
        return (vwj) objA;
    }

    public final Object b(vvs vvsVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.c), new whr(null, this, vvsVar), fcxyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.vvs r21, defpackage.wlk r22, defpackage.fcxy r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wiq.c(vvs, wlk, fcxy):java.lang.Object");
    }

    public final Object d(vvs vvsVar, fcxy fcxyVar) {
        Object obj;
        Object objF;
        if (vvsVar instanceof vvr) {
            vvr vvrVar = (vvr) vvsVar;
            this.x.a(vvrVar);
            obj = vvrVar.a;
        } else if (vvsVar instanceof vvn) {
            obj = ((vvn) vvsVar).b;
        } else {
            if (!(vvsVar instanceof vvo)) {
                boolean z = vvsVar instanceof vvm;
                if (!z) {
                    throw new fctg();
                }
                if (!z) {
                    throw new fctg();
                }
            }
            obj = null;
        }
        if (obj instanceof dlto) {
            ekrw ekrwVarG = a.g();
            ekrwVarG.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController", "cleanUpRemovedAttachment", 350, "DraftAttachmentController.kt")).t("Removing from vCardFlowCache for %s", obj);
        }
        return ((vvsVar instanceof vvp) || (objF = f(vvsVar, fcxyVar)) != fcyl.a) ? fctx.a : objF;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.vvs r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wiq.e(vvs, fcxy):java.lang.Object");
    }

    public final Object f(vvs vvsVar, fcxy fcxyVar) {
        Object objB;
        vvr vvrVar = vvsVar instanceof vvr ? (vvr) vvsVar : null;
        Uri uri = vvrVar != null ? vvrVar.b.c : null;
        if (uri != null) {
            wob wobVar = this.u;
            if (wobVar.c(uri) && (objB = wobVar.b(uri, fcxyVar)) == fcyl.a) {
                return objB;
            }
        }
        return fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.vvs r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.wij
            if (r0 == 0) goto L13
            r0 = r15
            wij r0 = (defpackage.wij) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            wij r0 = new wij
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            java.lang.String r3 = "shouldRejectAttachmentEarly"
            java.lang.String r4 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController"
            java.lang.String r5 = "BugleComposeRow2"
            r6 = 1
            java.lang.String r7 = "DraftAttachmentController.kt"
            if (r2 == 0) goto L39
            if (r2 != r6) goto L31
            java.lang.Object r14 = r0.a
            defpackage.fctl.b(r15)
            goto L5c
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L39:
            defpackage.fctl.b(r15)
            boolean r15 = r14 instanceof defpackage.vvp
            if (r15 == 0) goto L82
            whe r15 = r13.v
            r2 = r14
            vvp r2 = (defpackage.vvp) r2
            r0.a = r14
            r0.d = r6
            fcyh r8 = r15.c
            fcyh r8 = defpackage.eicg.a(r8)
            wha r9 = new wha
            r10 = 0
            r9.<init>(r10, r2, r15)
            java.lang.Object r15 = defpackage.fdin.a(r8, r9, r0)
            if (r15 != r1) goto L5c
            return r1
        L5c:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L65
            goto L82
        L65:
            ekrg r15 = defpackage.wiq.a
            ekrw r15 = r15.i()
            ekrz r0 = defpackage.eksq.a
            r15.X(r0, r5)
            r0 = 178(0xb2, float:2.5E-43)
            ekrw r15 = r15.h(r4, r3, r0, r7)
            ekrd r15 = (defpackage.ekrd) r15
            java.lang.String r0 = "Attachment blocked by security filter: silently rejecting %s"
            r15.t(r0, r14)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r6)
            return r14
        L82:
            wre r15 = r13.f
            fdvc r15 = r15.a
            java.lang.Object r15 = r15.c()
            vvw r15 = (defpackage.vvw) r15
            com.google.android.apps.messaging.shared.conversation.draft.EditingData r15 = r15.f
            fcsu r0 = r13.w
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lcc
            if (r15 == 0) goto Lcc
            ekrg r0 = defpackage.wiq.a
            ekrw r0 = r0.h()
            ekrz r1 = defpackage.eksq.a
            r0.X(r1, r5)
            r1 = 186(0xba, float:2.6E-43)
            ekrw r0 = r0.h(r4, r3, r1, r7)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "Skipping addAttachment because draft is editing message: %s, %s"
            r0.D(r1, r14, r15)
            wmp r7 = r13.s
            r14 = 2132084237(0x7f15060d, float:1.9808639E38)
            java.lang.String r8 = defpackage.wmp.n(r7, r14)
            r11 = 0
            r12 = 14
            r9 = 0
            r10 = 0
            defpackage.wmp.m(r7, r8, r9, r10, r11, r12)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r6)
            return r14
        Lcc:
            r14 = 0
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wiq.g(vvs, fcxy):java.lang.Object");
    }

    public final void h(fdap fdapVar) {
        auvw.k(this.e, null, null, new wii(this, fdapVar, null), 3);
    }
}
