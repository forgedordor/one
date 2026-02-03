package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afzi implements afzd {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/navigation/NavigationRouterControllerImpl");
    public final afza b;
    public final lvc c;
    private final fdjx d;
    private final Map e;
    private final Map f;
    private boolean g;

    public afzi(afza afzaVar, fdjx fdjxVar, lvc lvcVar, Map map, Map map2) {
        afzaVar.getClass();
        fdjxVar.getClass();
        lvcVar.getClass();
        this.b = afzaVar;
        this.d = fdjxVar;
        this.c = lvcVar;
        this.e = map;
        this.f = map2;
    }

    @Override // defpackage.afzd
    public final void a() {
        ((ekrd) a.e().h("com/google/android/apps/messaging/navigation/NavigationRouterControllerImpl", "initialize", 33, "NavigationRouterControllerImpl.kt")).q("Initializing navigation controller.");
        if (this.g) {
            return;
        }
        auvw.k(this.d, null, null, new afzh(this, null), 3);
        this.g = true;
    }

    @Override // defpackage.afzd
    public final void b(afzy afzyVar, boolean z) {
        ((ekrd) a.e().h("com/google/android/apps/messaging/navigation/NavigationRouterControllerImpl", "setCanNavigateToTarget", 56, "NavigationRouterControllerImpl.kt")).D("%s navigation to target: %s.", true != z ? "Disabling" : "Enabling", afzyVar);
        this.b.e(afzyVar, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.afzu r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.afze
            if (r0 == 0) goto L13
            r0 = r10
            afze r0 = (defpackage.afze) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            afze r0 = new afze
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            java.lang.String r4 = "handleUpdatedState"
            java.lang.String r5 = "com/google/android/apps/messaging/navigation/NavigationRouterControllerImpl"
            java.lang.String r6 = "NavigationRouterControllerImpl.kt"
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.b
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r10)
            goto L9d
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.fctl.b(r10)
            java.util.Map r10 = r8.f
            java.lang.Class r2 = r9.getClass()
            java.lang.Object r10 = r10.get(r2)
            agak r10 = (defpackage.agak) r10
            if (r10 != 0) goto L5e
            ekrg r10 = defpackage.afzi.a
            ekrw r10 = r10.f()
            r0 = 63
            ekrw r10 = r10.h(r5, r4, r0, r6)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "No navigation operation for state %s"
            r10.t(r0, r9)
            goto Lb0
        L5e:
            ekrg r2 = defpackage.afzi.a
            ekrw r2 = r2.h()
            r7 = 65
            ekrw r2 = r2.h(r5, r4, r7, r6)
            ekrd r2 = (defpackage.ekrd) r2
            java.lang.String r7 = "Invoking operation %s for state %s"
            r2.D(r7, r10, r9)
            r0.a = r9
            r0.b = r10
            r0.e = r3
            afzy r2 = r9.b()
            java.util.Map r3 = r8.e
            java.lang.Class r7 = r2.getClass()
            java.lang.Object r3 = r3.get(r7)
            afyz r3 = (defpackage.afyz) r3
            if (r3 == 0) goto Lb4
            int r2 = r9.a()
            afzy r7 = r9.b()
            java.lang.Object r0 = r10.a(r2, r7, r3, r0)
            if (r0 == r1) goto L99
            fctx r0 = defpackage.fctx.a
        L99:
            if (r0 == r1) goto Lb3
            r0 = r9
            r9 = r10
        L9d:
            ekrg r10 = defpackage.afzi.a
            ekrw r10 = r10.f()
            r1 = 67
            ekrw r10 = r10.h(r5, r4, r1, r6)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r1 = "Finished invoking operation %s for state %s"
            r10.D(r1, r9, r0)
        Lb0:
            fctx r9 = defpackage.fctx.a
            return r9
        Lb3:
            return r1
        Lb4:
            java.lang.Class r9 = r2.getClass()
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            int r0 = defpackage.fdcj.a
            fdbi r0 = new fdbi
            r0.<init>(r9)
            java.lang.String r9 = r0.c()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "A navigation handler has not been provided for "
            java.lang.String r9 = r0.concat(r9)
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afzi.c(afzu, fcxy):java.lang.Object");
    }
}
