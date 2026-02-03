package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dndk {
    public static final fctc a = fctd.a(new fdae() { // from class: dncq
        @Override // defpackage.fdae
        public final Object invoke() {
            fctc fctcVar = dndk.a;
            return ebsu.a("com.android.providers.telephony");
        }
    });
    public static final fctc b = fctd.a(new fdae() { // from class: dncr
        @Override // defpackage.fdae
        public final Object invoke() {
            fctc fctcVar = dndk.a;
            return new dncy();
        }
    });
    public static final fctc c = fctd.a(new fdae() { // from class: dncs
        @Override // defpackage.fdae
        public final Object invoke() {
            fctc fctcVar = dndk.a;
            return new dncx();
        }
    });
    public static final fctc d = fctd.a(new fdae() { // from class: dnct
        @Override // defpackage.fdae
        public final Object invoke() {
            fctc fctcVar = dndk.a;
            return new dncw();
        }
    });
    public static final fctc e = fctd.a(new fdae() { // from class: dncu
        @Override // defpackage.fdae
        public final Object invoke() {
            fctc fctcVar = dndk.a;
            return fcva.g("MOTOROLA", "LGE", "HUAWEI", "VIVO");
        }
    });
    public static final fctc f = fctd.a(new fdae() { // from class: dncv
        @Override // defpackage.fdae
        public final Object invoke() {
            fctc fctcVar = dndk.a;
            ebsu ebsuVar = ebsu.a;
            ebst ebstVar = new ebst();
            ebstVar.d();
            ebstVar.c();
            ebstVar.b((ebsz) dndk.b.a());
            ebstVar.b((ebsz) dndk.c.a());
            Iterator it = ((List) dndk.e.a()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (fdgn.j(Build.MANUFACTURER, (String) it.next(), true)) {
                    ebstVar.b((ebsz) dndk.d.a());
                    break;
                }
            }
            return ebstVar.a();
        }
    });
    public final Context g;
    private final fdjx h;
    private final fctc i;

    public dndk(Context context, fdjx fdjxVar, final fcsu fcsuVar) {
        context.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        this.g = context;
        this.h = fdjxVar;
        this.i = fctd.a(new fdae() { // from class: dncp
            @Override // defpackage.fdae
            public final Object invoke() {
                fctc fctcVar = dndk.a;
                Object objB = fcsuVar.b();
                objB.getClass();
                Boolean bool = (Boolean) fdct.a((Optional) objB, false);
                bool.booleanValue();
                return bool;
            }
        });
    }

    private final Object h(Uri uri, fcxy fcxyVar) {
        return fdin.a(this.h.hE(), new dncz(uri, this, null), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dnda
            if (r0 == 0) goto L13
            r0 = r7
            dnda r0 = (defpackage.dnda) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dnda r0 = new dnda
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            dndk r2 = r0.e
            defpackage.fctl.b(r7)
            goto L4a
        L3a:
            defpackage.fctl.b(r7)
            r0.e = r5
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r5.g(r6, r0)
            if (r7 == r1) goto L5d
            r2 = r5
        L4a:
            ebsu r7 = (defpackage.ebsu) r7
            r4 = 0
            r0.e = r4
            r0.a = r4
            r0.d = r3
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.Object r6 = r2.b(r6, r7, r0)
            if (r6 != r1) goto L5c
            goto L5d
        L5c:
            return r6
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dndk.a(android.net.Uri, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.net.Uri r6, defpackage.ebsu r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dndb
            if (r0 == 0) goto L13
            r0 = r8
            dndb r0 = (defpackage.dndb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dndb r0 = new dndb
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r8)
            fdjx r8 = r5.h
            fcyh r8 = r8.hE()
            dndc r2 = new dndc
            r4 = 0
            r2.<init>(r5, r6, r7, r4)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dndk.b(android.net.Uri, ebsu, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.net.Uri r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dndd
            if (r0 == 0) goto L13
            r0 = r7
            dndd r0 = (defpackage.dndd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dndd r0 = new dndd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            dndk r2 = r0.e
            defpackage.fctl.b(r7)
            goto L4a
        L3a:
            defpackage.fctl.b(r7)
            r0.e = r5
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r5.g(r6, r0)
            if (r7 == r1) goto L5d
            r2 = r5
        L4a:
            ebsu r7 = (defpackage.ebsu) r7
            r4 = 0
            r0.e = r4
            r0.a = r4
            r0.d = r3
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.Object r6 = r2.d(r6, r7, r0)
            if (r6 != r1) goto L5c
            goto L5d
        L5c:
            return r6
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dndk.c(android.net.Uri, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.net.Uri r6, defpackage.ebsu r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dnde
            if (r0 == 0) goto L13
            r0 = r8
            dnde r0 = (defpackage.dnde) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dnde r0 = new dnde
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r8)
            fdjx r8 = r5.h
            fcyh r8 = r8.hE()
            dndf r2 = new dndf
            r4 = 0
            r2.<init>(r5, r6, r7, r4)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dndk.d(android.net.Uri, ebsu, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.net.Uri r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dndg
            if (r0 == 0) goto L13
            r0 = r7
            dndg r0 = (defpackage.dndg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dndg r0 = new dndg
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            dndk r2 = r0.e
            defpackage.fctl.b(r7)
            goto L4a
        L3a:
            defpackage.fctl.b(r7)
            r0.e = r5
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r5.g(r6, r0)
            if (r7 == r1) goto L5d
            r2 = r5
        L4a:
            ebsu r7 = (defpackage.ebsu) r7
            r4 = 0
            r0.e = r4
            r0.a = r4
            r0.d = r3
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.Object r6 = r2.f(r6, r7, r0)
            if (r6 != r1) goto L5c
            goto L5d
        L5c:
            return r6
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dndk.e(android.net.Uri, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(android.net.Uri r6, defpackage.ebsu r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dndh
            if (r0 == 0) goto L13
            r0 = r8
            dndh r0 = (defpackage.dndh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dndh r0 = new dndh
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r8)
            fdjx r8 = r5.h
            fcyh r8 = r8.hE()
            dndi r2 = new dndi
            r4 = 0
            r2.<init>(r5, r6, r7, r4)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dndk.f(android.net.Uri, ebsu, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r7 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (r7 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.net.Uri r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dndj
            if (r0 == 0) goto L13
            r0 = r7
            dndj r0 = (defpackage.dndj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dndj r0 = new dndj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L72
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L4f
        L36:
            defpackage.fctl.b(r7)
            fctc r7 = r5.i
            java.lang.Object r7 = r7.a()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L6a
            r0.c = r4
            java.lang.Object r7 = r5.h(r6, r0)
            if (r7 == r1) goto Lc5
        L4f:
            android.content.Context r6 = r5.g
            java.lang.String r6 = r6.getPackageName()
            boolean r6 = defpackage.fdbq.f(r7, r6)
            if (r6 == 0) goto L5e
            ebsu r6 = defpackage.ebsu.c
            goto L66
        L5e:
            fctc r6 = defpackage.dndk.f
            java.lang.Object r6 = r6.a()
            ebsu r6 = (defpackage.ebsu) r6
        L66:
            r6.getClass()
            return r6
        L6a:
            r0.c = r3
            java.lang.Object r7 = r5.h(r6, r0)
            if (r7 == r1) goto Lc5
        L72:
            android.content.Context r6 = r5.g
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = r6.getPackageName()
            boolean r0 = defpackage.fdbq.f(r7, r0)
            if (r0 == 0) goto L83
            ebsu r6 = defpackage.ebsu.c
            goto Lc1
        L83:
            java.lang.String r0 = "com.android.providers.telephony"
            boolean r7 = defpackage.fdbq.f(r7, r0)
            if (r7 == 0) goto Lbf
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r7 < r0) goto La4
            java.lang.Class r7 = defpackage.abo$$ExternalSyntheticApiModelOutline0.m42m()
            java.lang.Object r6 = r6.getSystemService(r7)
            android.app.role.RoleManager r6 = defpackage.abo$$ExternalSyntheticApiModelOutline0.m(r6)
            java.lang.String r7 = "android.app.role.SMS"
            boolean r6 = defpackage.abo$$ExternalSyntheticApiModelOutline0.m46m(r6, r7)
            goto Lb4
        La4:
            java.lang.String r7 = android.provider.Telephony.Sms.getDefaultSmsPackage(r6)
            android.content.Context r6 = r6.getApplicationContext()
            java.lang.String r6 = r6.getPackageName()
            boolean r6 = defpackage.fdbq.f(r7, r6)
        Lb4:
            if (r6 == 0) goto Lbf
            fctc r6 = defpackage.dndk.a
            java.lang.Object r6 = r6.a()
            ebsu r6 = (defpackage.ebsu) r6
            goto Lc1
        Lbf:
            ebsu r6 = defpackage.ebsu.a
        Lc1:
            r6.getClass()
            return r6
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dndk.g(android.net.Uri, fcxy):java.lang.Object");
    }
}
