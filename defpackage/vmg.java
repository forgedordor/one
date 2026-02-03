package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmg implements vdy {
    public final Context a;
    private final fdjx b;
    private final crma c;
    private final srw d;
    private final afzc e;
    private final eksp f;
    private final fdpl g;
    private final Set h;

    public vmg(Context context, fdjx fdjxVar, zqm zqmVar, crma crmaVar, srw srwVar, afzc afzcVar) {
        context.getClass();
        fdjxVar.getClass();
        zqmVar.getClass();
        crmaVar.getClass();
        srwVar.getClass();
        afzcVar.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.c = crmaVar;
        this.d = srwVar;
        this.e = afzcVar;
        this.f = eksp.c("Bugle");
        this.g = new vmf(zqmVar.a(), this);
        this.h = fcwm.d(zqx.b, zqx.c);
    }

    private final Object f(fcxy fcxyVar) {
        if (craf.c || this.c.q()) {
            return true;
        }
        return this.e.f(new agff(crmc.STORAGE_PERMISSIONS), fcxyVar);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.h;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.vmb
            if (r0 == 0) goto L13
            r0 = r8
            vmb r0 = (defpackage.vmb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            vmb r0 = new vmb
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r8)
            goto L3e
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.fctl.b(r8)
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.f(r0)
            if (r8 == r1) goto L9a
        L3e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L8a
            srw r8 = r6.d
            java.lang.String r0 = "Bugle.Async.ConversationFragment.ActionMode.Callback.onActionItemClicked.Duration"
            srv r8 = r8.a(r0)
            java.util.Iterator r7 = r7.iterator()
        L52:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r7.next()
            ajlt r0 = (defpackage.ajlt) r0
            amvr r0 = r0.g()
            amsv r0 = (defpackage.amsv) r0
            android.net.Uri r1 = r0.e()
            java.lang.String r2 = r0.b()
            android.net.Uri r3 = r0.c()
            boolean r4 = r0 instanceof defpackage.amvp
            r5 = 0
            if (r4 == 0) goto L78
            amvp r0 = (defpackage.amvp) r0
            goto L79
        L78:
            r0 = r5
        L79:
            if (r0 == 0) goto L7f
            java.lang.String r5 = r0.g()
        L7f:
            r8.b(r1, r2, r3, r5)
            goto L52
        L83:
            r7 = 0
            java.lang.Void[] r7 = new java.lang.Void[r7]
            r8.e(r7)
            goto L97
        L8a:
            eksp r7 = r6.f
            java.util.logging.Level r8 = java.util.logging.Level.WARNING
            eksl r7 = r7.a(r8)
            java.lang.String r8 = "Unable to obtain storage permission. Attachment will not be saved."
            r7.q(r8)
        L97:
            fctx r7 = defpackage.fctx.a
            return r7
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vmg.c(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        if (r10 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a0 -> B:34:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.vmc
            if (r0 == 0) goto L13
            r0 = r10
            vmc r0 = (defpackage.vmc) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            vmc r0 = new vmc
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.b
            java.lang.Object r2 = r0.a
            java.util.Iterator r2 = (java.util.Iterator) r2
            defpackage.fctl.b(r10)
            goto La2
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.Object r9 = r0.a
            java.util.List r9 = (java.util.List) r9
            defpackage.fctl.b(r10)
            goto L4e
        L41:
            defpackage.fctl.b(r10)
            r0.a = r9
            r0.e = r4
            java.lang.Object r10 = r8.f(r0)
            if (r10 == r1) goto Ld0
        L4e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lc0
            java.util.Iterator r9 = r9.iterator()
            r2 = r9
        L5b:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto Lcd
            java.lang.Object r9 = r2.next()
            ajlt r9 = (defpackage.ajlt) r9
            amvr r9 = r9.g()
            amsv r9 = (defpackage.amsv) r9
            r0.a = r2
            r0.b = r9
            r0.e = r3
            boolean r10 = r9 instanceof defpackage.amvp
            r4 = 0
            if (r10 == 0) goto L7c
            r10 = r9
            amvp r10 = (defpackage.amvp) r10
            goto L7d
        L7c:
            r10 = r4
        L7d:
            if (r10 == 0) goto L83
            java.lang.String r4 = r10.g()
        L83:
            afzc r10 = r8.e
            agau r5 = new agau
            ady r6 = new ady
            java.lang.String r7 = r9.b()
            r7.getClass()
            r6.<init>(r7)
            if (r4 != 0) goto L97
            java.lang.String r4 = ""
        L97:
            java.lang.String r7 = "save_action_plugin"
            r5.<init>(r7, r6, r4)
            java.lang.Object r10 = r10.f(r5, r0)
            if (r10 == r1) goto Ld0
        La2:
            android.net.Uri r10 = (android.net.Uri) r10
            if (r10 == 0) goto L5b
            srw r4 = r8.d
            java.lang.String r5 = "Bugle.Async.ConversationFragment.ActionMode.Callback.onActionItemClicked.Duration"
            srv r4 = r4.a(r5)
            android.net.Uri r5 = r9.e()
            java.lang.String r9 = r9.b()
            r4.c(r5, r10, r9)
            r9 = 0
            java.lang.Void[] r9 = new java.lang.Void[r9]
            r4.e(r9)
            goto L5b
        Lc0:
            eksp r9 = r8.f
            java.util.logging.Level r10 = java.util.logging.Level.WARNING
            eksl r9 = r9.a(r10)
            java.lang.String r10 = "Unable to obtain storage permission. Attachment will not be saved."
            r9.q(r10)
        Lcd:
            fctx r9 = defpackage.fctx.a
            return r9
        Ld0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vmg.d(java.util.List, fcxy):java.lang.Object");
    }

    public final void e(List list) {
        auvw.k(this.b, null, null, new vma(list, this, null), 3);
    }
}
