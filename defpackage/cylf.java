package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cylf implements cykn {
    private static final cqce b = cqce.g("BugleWorkQueue", "WorkQueueDebugMenuProviderImpl");
    public final fdjx a;
    private final cogw c;
    private final cbkq d;
    private final fcsu e;
    private final cazj f;
    private final Context g;

    public cylf(cogw cogwVar, cyfw cyfwVar, cbkq cbkqVar, fcsu fcsuVar, cazj cazjVar, Context context, fdjx fdjxVar) {
        cogwVar.getClass();
        cyfwVar.getClass();
        cbkqVar.getClass();
        fcsuVar.getClass();
        cazjVar.getClass();
        context.getClass();
        fdjxVar.getClass();
        this.c = cogwVar;
        this.d = cbkqVar;
        this.e = fcsuVar;
        this.f = cazjVar;
        this.g = context;
        this.a = fdjxVar;
    }

    private final void e(MenuItem menuItem, final Activity activity, final fdat fdatVar) {
        menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: cyks
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem2) {
                menuItem2.getClass();
                auvw.k(this.a.a, null, null, new cykx(fdatVar, cyfw.a(activity, Optional.empty(), Optional.empty()), null), 3);
                return false;
            }
        });
    }

    @Override // defpackage.cykn
    public final void a(Menu menu, Activity activity) {
        menu.getClass();
        activity.getClass();
        SubMenu subMenuAddSubMenu = menu.addSubMenu("PWQ");
        subMenuAddSubMenu.getClass();
        MenuItem menuItemAdd = subMenuAddSubMenu.add("PWQ Inspector");
        menuItemAdd.getClass();
        e(menuItemAdd, activity, new cyky(this, null));
        MenuItem menuItemAdd2 = subMenuAddSubMenu.add("Run Janitor Job");
        menuItemAdd2.getClass();
        e(menuItemAdd2, activity, new cykz(this, null));
        MenuItem menuItemAdd3 = subMenuAddSubMenu.add("Check Constraints");
        menuItemAdd3.getClass();
        e(menuItemAdd3, activity, new cyla(this, null));
        MenuItem menuItemAdd4 = subMenuAddSubMenu.add("Dump PWQ Table");
        menuItemAdd4.getClass();
        e(menuItemAdd4, activity, new cylb(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cyfv r17, defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cylf.b(cyfv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(final defpackage.cyfv r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cyld
            if (r0 == 0) goto L13
            r0 = r9
            cyld r0 = (defpackage.cyld) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cyld r0 = new cyld
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cyfv r8 = r0.d
            defpackage.fctl.b(r9)
            goto L4d
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.fctl.b(r9)
            cbkq r9 = r7.d
            cbjz r2 = new cbjz
            r4 = 0
            r2.<init>(r9, r4)
            fdjx r9 = r9.h
            eiju r9 = defpackage.auvw.h(r9, r2)
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)
            if (r9 != r1) goto L4d
            return r1
        L4d:
            cbjw r9 = (defpackage.cbjw) r9
            cqce r0 = defpackage.cylf.b
            cqbd r0 = r0.c()
            java.lang.String r1 = "Completed Janitor Job"
            r0.I(r1)
            java.lang.String r1 = "result"
            r0.A(r1, r9)
            r0.r()
            java.util.Map r0 = r9.a
            java.util.Set r1 = r0.entrySet()
            cykv r5 = new cykv
            r5.<init>()
            r4 = 0
            r6 = 30
            java.lang.String r2 = "\n"
            r3 = 0
            java.lang.String r0 = defpackage.fcva.aF(r1, r2, r3, r4, r5, r6)
            j$.time.Duration r9 = r9.b
            long r1 = r9.toMillis()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r3 = "Rescheduling took "
            r9.<init>(r3)
            r9.append(r1)
            java.lang.String r1 = "ms"
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            cykw r1 = new cykw
            r1.<init>()
            defpackage.ecem.e(r1)
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cylf.c(cyfv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(final defpackage.cyfv r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.cyle
            if (r0 == 0) goto L13
            r0 = r10
            cyle r0 = (defpackage.cyle) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cyle r0 = new cyle
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            fdci r9 = r0.d
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L29
            goto L6a
        L29:
            r10 = move-exception
            goto L7c
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            defpackage.fctl.b(r10)
            fdci r10 = new fdci
            r10.<init>()
            cykp r2 = new cykp
            r2.<init>()
            defpackage.ecem.e(r2)
            cykm r2 = new cykm     // Catch: java.lang.Throwable -> L78
            cogw r4 = r8.c     // Catch: java.lang.Throwable -> L78
            android.content.Context r5 = r8.g     // Catch: java.lang.Throwable -> L78
            cykq r6 = new cykq     // Catch: java.lang.Throwable -> L78
            r6.<init>()     // Catch: java.lang.Throwable -> L78
            r2.<init>(r4, r5, r9, r6)     // Catch: java.lang.Throwable -> L78
            cazj r9 = r8.f     // Catch: java.lang.Throwable -> L78
            java.lang.Class<cazh> r4 = defpackage.cazh.class
            java.util.EnumSet r4 = java.util.EnumSet.allOf(r4)     // Catch: java.lang.Throwable -> L78
            eiju r9 = r9.i(r2, r4)     // Catch: java.lang.Throwable -> L78
            r0.d = r10     // Catch: java.lang.Throwable -> L78
            r0.c = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)     // Catch: java.lang.Throwable -> L78
            if (r9 == r1) goto L77
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            java.lang.Void r10 = (java.lang.Void) r10     // Catch: java.lang.Throwable -> L29
            cykr r10 = new cykr
            r10.<init>()
            defpackage.ecem.e(r10)
            fctx r9 = defpackage.fctx.a
            return r9
        L77:
            return r1
        L78:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L7c:
            cykr r0 = new cykr
            r0.<init>()
            defpackage.ecem.e(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cylf.d(cyfv, fcxy):java.lang.Object");
    }
}
