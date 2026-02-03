package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avlr {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncEligibilityChecker");
    private final fcsu b;
    private final fcsu c;

    public avlr(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar2.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.avlq
            if (r0 == 0) goto L13
            r0 = r10
            avlq r0 = (defpackage.avlq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avlq r0 = new avlq
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            java.lang.String r4 = "hasWorkProfileContacts"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncEligibilityChecker"
            java.lang.String r6 = "BugleContacts"
            r7 = 1
            java.lang.String r8 = "WorkProfileContactsSyncEligibilityChecker.kt"
            if (r2 == 0) goto L3a
            if (r2 != r7) goto L32
            defpackage.fctl.b(r10)     // Catch: defpackage.egrk -> L30
            goto L4e
        L30:
            r10 = move-exception
            goto L76
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3a:
            defpackage.fctl.b(r10)
            fcsu r10 = r9.c     // Catch: defpackage.egrk -> L30
            java.lang.Object r10 = r10.b()     // Catch: defpackage.egrk -> L30
            avdr r10 = (defpackage.avdr) r10     // Catch: defpackage.egrk -> L30
            r0.c = r7     // Catch: defpackage.egrk -> L30
            java.lang.Object r10 = r10.a(r0)     // Catch: defpackage.egrk -> L30
            if (r10 != r1) goto L4e
            return r1
        L4e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: defpackage.egrk -> L30
            boolean r0 = r10.booleanValue()     // Catch: defpackage.egrk -> L30
            if (r0 != 0) goto L6e
            ekrg r0 = defpackage.avlr.a     // Catch: defpackage.egrk -> L30
            ekrw r0 = r0.h()     // Catch: defpackage.egrk -> L30
            ekrz r1 = defpackage.eksq.a     // Catch: defpackage.egrk -> L30
            r0.X(r1, r6)     // Catch: defpackage.egrk -> L30
            r1 = 49
            ekrw r0 = r0.h(r5, r4, r1, r8)     // Catch: defpackage.egrk -> L30
            ekrd r0 = (defpackage.ekrd) r0     // Catch: defpackage.egrk -> L30
            java.lang.String r1 = "Does not have Managed Work Profile contacts to sync."
            r0.q(r1)     // Catch: defpackage.egrk -> L30
        L6e:
            boolean r10 = r10.booleanValue()     // Catch: defpackage.egrk -> L30
            if (r10 == 0) goto L94
            r3 = r7
            goto L94
        L76:
            ekrg r0 = defpackage.avlr.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            r0.X(r1, r6)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r10 = r0.g(r10)
            r0 = 56
            ekrw r10 = r10.h(r5, r4, r0, r8)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "Failed to check for Managed Work Profile contact directory."
            r10.q(r0)
        L94:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avlr.a(fcxy):java.lang.Object");
    }

    public final Object b(fcxy fcxyVar) {
        if (((avbt) this.b.b()).a()) {
            if (Build.VERSION.SDK_INT >= 34) {
                return a(fcxyVar);
            }
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleContacts");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncEligibilityChecker", "meetsAndroidApiLevelRequirements", 41, "WorkProfileContactsSyncEligibilityChecker.kt")).q("Fails minimum API level requirements for Managed Work Profile syncing.");
        }
        return false;
    }
}
