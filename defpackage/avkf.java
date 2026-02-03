package defpackage;

import android.net.Uri;
import android.provider.ContactsContract;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avkf {
    public static final egsn f(pzy pzyVar, String str) {
        egsj egsjVarN = egsn.n(avki.class);
        pza pzaVar = pza.a;
        Object objE = avbs.g.e();
        objE.getClass();
        egsjVarN.i(pzaVar, new egsa(((Number) objE).longValue(), TimeUnit.MILLISECONDS));
        egsjVarN.g(new egsb(str == null ? "DELETED_CONTACTS_OBSERVER" : str, pzyVar));
        if (str != null) {
            egsjVarN.f(fcwm.b("DELETED_CONTACTS_OBSERVER"));
        }
        pzh pzhVar = new pzh();
        Uri uri = ContactsContract.DeletedContacts.CONTENT_URI;
        uri.getClass();
        pzhVar.b(uri, false);
        egsjVarN.d(pzhVar.a());
        return egsjVarN.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r8 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (defpackage.fdxs.c(r7, r0) == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.egsh r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.avka
            if (r0 == 0) goto L13
            r0 = r8
            avka r0 = (defpackage.avka) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            avka r0 = new avka
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r8)
            goto L8b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r8)
            goto L58
        L3d:
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r8)
            goto L50
        L43:
            defpackage.fctl.b(r8)
            r0.a = r7
            r0.e = r5
            java.lang.Object r8 = r6.e(r7, r0)
            if (r8 == r1) goto L8e
        L50:
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r2 = r7
            r7 = r8
        L58:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L77
            java.lang.Object r8 = r7.next()
            qbp r8 = (defpackage.qbp) r8
            java.util.UUID r8 = r8.a
            com.google.common.util.concurrent.ListenableFuture r8 = r2.b(r8)
            r0.a = r2
            r0.b = r7
            r0.e = r4
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 != r1) goto L58
            goto L8e
        L77:
            java.lang.String r7 = "DELETED_CONTACTS_OBSERVER"
            com.google.common.util.concurrent.ListenableFuture r7 = r2.a(r7)
            r8 = 0
            r0.a = r8
            r0.b = r8
            r0.e = r3
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 != r1) goto L8b
            goto L8e
        L8b:
            fctx r7 = defpackage.fctx.a
            return r7
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avkf.a(egsh, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cmfo r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.avkb
            if (r0 == 0) goto L13
            r0 = r6
            avkb r0 = (defpackage.avkb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avkb r0 = new avkb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            r0.c = r3
            java.lang.Object r6 = r5.c(r0)
            if (r6 == r1) goto L4d
        L3a:
            avde r6 = (defpackage.avde) r6
            evvp r5 = r6.f
            if (r5 != 0) goto L42
            evvp r5 = defpackage.evvp.a
        L42:
            long r5 = defpackage.evxc.a(r5)
            java.lang.String r0 = "DELETED_CONTACTS_OBSERVER-"
            java.lang.String r5 = defpackage.a.u(r5, r0)
            return r5
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avkf.b(cmfo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r9 != r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.egsh r7, defpackage.cmfo r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.avkc
            if (r0 == 0) goto L13
            r0 = r9
            avkc r0 = (defpackage.avkc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            avkc r0 = new avkc
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r9)
            goto L6f
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            java.lang.Object r7 = r0.a
            pzy r8 = r0.e
            defpackage.fctl.b(r9)
            goto L51
        L3b:
            defpackage.fctl.b(r9)
            if (r8 == 0) goto L58
            avkf r9 = defpackage.avki.a
            pzy r2 = defpackage.pzy.b
            r0.e = r2
            r0.a = r7
            r0.d = r4
            java.lang.Object r9 = r9.b(r8, r0)
            if (r9 == r1) goto L6e
            r8 = r2
        L51:
            java.lang.String r9 = (java.lang.String) r9
            egsn r8 = f(r8, r9)
            goto L5e
        L58:
            pzy r8 = defpackage.pzy.d
            egsn r8 = f(r8, r5)
        L5e:
            com.google.common.util.concurrent.ListenableFuture r7 = r7.c(r8)
            r0.e = r5
            r0.a = r5
            r0.d = r3
            java.lang.Object r9 = defpackage.fdxs.c(r7, r0)
            if (r9 != r1) goto L6f
        L6e:
            return r1
        L6f:
            r9.getClass()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avkf.c(egsh, cmfo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.egsh r6, defpackage.cmfo r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.avkd
            if (r0 == 0) goto L13
            r0 = r8
            avkd r0 = (defpackage.avkd) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            avkd r0 = new avkd
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            goto L5e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r7 = r0.b
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r8)
            goto L49
        L3a:
            defpackage.fctl.b(r8)
            r0.a = r6
            r0.b = r7
            r0.e = r4
            java.lang.Object r8 = r5.e(r6, r0)
            if (r8 == r1) goto L62
        L49:
            java.util.List r8 = (java.util.List) r8
            boolean r8 = r8.isEmpty()
            r2 = 0
            if (r8 == 0) goto L61
            r0.a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r8 = r5.c(r6, r7, r0)
            if (r8 == r1) goto L62
        L5e:
            java.util.UUID r8 = (java.util.UUID) r8
            return r8
        L61:
            return r2
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avkf.d(egsh, cmfo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.egsh r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.avke
            if (r0 == 0) goto L13
            r0 = r8
            avke r0 = (defpackage.avke) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            avke r0 = new avke
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            java.lang.String r3 = "DELETED_CONTACTS_OBSERVER"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            defpackage.fctl.b(r8)
            goto L62
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r8)
            goto L4b
        L3a:
            defpackage.fctl.b(r8)
            com.google.common.util.concurrent.ListenableFuture r8 = r7.e(r3)
            r0.a = r7
            r0.d = r5
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 == r1) goto L8c
        L4b:
            java.util.List r8 = (java.util.List) r8
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L64
            com.google.common.util.concurrent.ListenableFuture r7 = r7.f(r3)
            r8 = 0
            r0.a = r8
            r0.d = r4
            java.lang.Object r8 = defpackage.fdxs.c(r7, r0)
            if (r8 == r1) goto L8c
        L62:
            java.util.List r8 = (java.util.List) r8
        L64:
            r8.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r8.iterator()
        L70:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r8.next()
            r1 = r0
            qbp r1 = (defpackage.qbp) r1
            qbo r1 = r1.b
            qbo r2 = defpackage.qbo.a
            if (r1 == r2) goto L87
            qbo r2 = defpackage.qbo.b
            if (r1 != r2) goto L70
        L87:
            r7.add(r0)
            goto L70
        L8b:
            return r7
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avkf.e(egsh, fcxy):java.lang.Object");
    }
}
