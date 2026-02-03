package defpackage;

import android.content.Context;
import java.net.URL;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxrh implements dxqr {
    public static final eksp a = eksp.c("GnpSdk");
    private static final dxju b = dxju.b("X-Goog-Api-Key");
    private static final dxju c = dxju.b("X-Android-Cert");
    private static final dxju d = dxju.b("X-Android-Package");
    private static final dxju e = dxju.b("Authorization");
    private static final dxju f = dxju.b("Cookie");
    private final dxjt g;
    private final dxgy h;
    private final String i;
    private final dxlw j;
    private final Context k;
    private final String l;
    private final fcyh m;

    static {
        dxju.b("X-Goog-Visitor-Id");
        dxju.b("X-Goog-Fitbit-Oauth-Token");
    }

    public dxrh(dxjt dxjtVar, dxgy dxgyVar, String str, dxlw dxlwVar, Context context, String str2, fcyh fcyhVar, fdjx fdjxVar) {
        dxlwVar.getClass();
        context.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        this.g = dxjtVar;
        this.h = dxgyVar;
        this.i = str;
        this.j = dxlwVar;
        this.k = context;
        this.l = str2;
        this.m = fcyhVar;
    }

    @Override // defpackage.dxqr
    public final Object a(List list, String str, evfy evfyVar, fcxy fcxyVar) {
        return fdin.a(this.m, new dxrf(this, list, str, evfyVar, null), fcxyVar);
    }

    @Override // defpackage.dxqr
    public final Object b(dxvi dxviVar, String str, evgj evgjVar, fcxy fcxyVar) {
        return fdin.a(this.m, new dxrg(this, dxviVar, str, evgjVar, null), fcxyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ea, code lost:
    
        if (r13 == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0204, code lost:
    
        if (r10 != r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.evfx r9, java.lang.String r10, defpackage.dxhe r11, boolean r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxrh.c(evfx, java.lang.String, dxhe, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ee -> B:36:0x00f2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r19, java.lang.String r20, defpackage.evfy r21, boolean r22, defpackage.fcxy r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxrh.d(java.util.List, java.lang.String, evfy, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.dxjv r6, defpackage.dxvi r7, java.lang.String r8, boolean r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxrh.e(dxjv, dxvi, java.lang.String, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.dxvi r5, java.lang.String r6, java.net.URL r7, defpackage.evuh r8, boolean r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r10 instanceof defpackage.dxra
            if (r0 == 0) goto L13
            r0 = r10
            dxra r0 = (defpackage.dxra) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxra r0 = new dxra
            r0.<init>(r4, r10)
        L18:
            r10 = r0
            java.lang.Object r0 = r10.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r10.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            dxjp r5 = r10.d
            defpackage.fctl.b(r0)
            goto L63
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.fctl.b(r0)
            r0 = r8
            r8 = r6
            dxjp r6 = new dxjp
            r6.<init>()
            r6.e = r3
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r6.c = r2
            r2 = 2
            r6.e = r2
            if (r7 == 0) goto L7c
            r6.a = r7
            java.lang.String r7 = "application/x-protobuf"
            r6.b = r7
            byte[] r7 = r0.toByteArray()
            r6.d = r7
            r10.d = r6
            r10.c = r3
            r7 = r5
            r5 = r4
            java.lang.Object r0 = r5.e(r6, r7, r8, r9, r10)
            if (r0 == r1) goto L7b
            r5 = r6
        L63:
            dxft r0 = (defpackage.dxft) r0
            boolean r6 = r0.g()
            if (r6 == 0) goto L71
            r0.getClass()
            dxfo r0 = (defpackage.dxfo) r0
            return r0
        L71:
            dxfx r6 = new dxfx
            dxjx r5 = r5.a()
            r6.<init>(r5)
            return r6
        L7b:
            return r1
        L7c:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Null url"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxrh.f(dxvi, java.lang.String, java.net.URL, evuh, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List r10, java.lang.String r11, defpackage.evfy r12, boolean r13, defpackage.fcxy r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof defpackage.dxrb
            if (r0 == 0) goto L13
            r0 = r14
            dxrb r0 = (defpackage.dxrb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dxrb r0 = new dxrb
            r0.<init>(r9, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.c
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.e
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L37
            if (r1 != r7) goto L2f
            java.lang.Object r10 = r6.b
            evfy r11 = r6.f
            defpackage.fctl.b(r14)
            goto L82
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            boolean r13 = r6.a
            defpackage.fctl.b(r14)
            r1 = r9
            goto L51
        L3e:
            defpackage.fctl.b(r14)
            r6.a = r13
            r6.e = r2
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.Object r14 = r1.d(r2, r3, r4, r5, r6)
            if (r14 == r0) goto La8
            r13 = r5
        L51:
            dxft r14 = (defpackage.dxft) r14
            java.lang.String r10 = "/v1/multiloginupdate"
            java.net.URL r4 = r9.k(r10)
            boolean r10 = r14 instanceof defpackage.dxfx
            if (r10 == 0) goto La2
            dxfx r14 = (defpackage.dxfx) r14
            java.lang.Object r10 = r14.a
            fcti r10 = (defpackage.fcti) r10
            java.lang.Object r11 = r10.a
            r5 = r11
            evfy r5 = (defpackage.evfy) r5
            java.lang.Object r10 = r10.b
            java.util.Map r10 = (java.util.Map) r10
            r8 = r6
            evgg r6 = defpackage.evgg.a
            r6.getClass()
            r8.f = r5
            r8.b = r10
            r8.e = r7
            r2 = 0
            r3 = 0
            r7 = r13
            java.lang.Object r14 = r1.h(r2, r3, r4, r5, r6, r7, r8)
            if (r14 == r0) goto La8
            r11 = r5
        L82:
            dxft r14 = (defpackage.dxft) r14
            boolean r12 = r14 instanceof defpackage.dxfx
            if (r12 == 0) goto L9c
            dxfx r12 = new dxfx
            dxnq r13 = new dxnq
            dxfx r14 = (defpackage.dxfx) r14
            java.lang.Object r14 = r14.a
            r14.getClass()
            evgg r14 = (defpackage.evgg) r14
            r13.<init>(r11, r14, r10)
            r12.<init>(r13)
            return r12
        L9c:
            r14.getClass()
            dxfo r14 = (defpackage.dxfo) r14
            return r14
        La2:
            r14.getClass()
            dxfo r14 = (defpackage.dxfo) r14
            return r14
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxrh.g(java.util.List, java.lang.String, evfy, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.dxvi r12, java.lang.String r13, java.net.URL r14, defpackage.evuh r15, defpackage.evuh r16, boolean r17, defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxrh.h(dxvi, java.lang.String, java.net.URL, evuh, evuh, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.dxvi r12, java.lang.String r13, java.net.URL r14, defpackage.evuh r15, defpackage.evuh r16, defpackage.fcxy r17) {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.dxrd
            if (r1 == 0) goto L15
            r1 = r0
            dxrd r1 = (defpackage.dxrd) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            dxrd r1 = new dxrd
            r1.<init>(r11, r0)
        L1a:
            r9 = r1
            java.lang.Object r0 = r9.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r9.d
            r10 = 2
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 == r3) goto L35
            if (r2 != r10) goto L2d
            defpackage.fctl.b(r0)
            return r0
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            evgm r12 = r9.h
            evgj r13 = r9.g
            java.net.URL r14 = r9.f
            java.lang.String r2 = r9.e
            java.lang.Object r3 = r9.a
            defpackage.fctl.b(r0)
            r7 = r12
            r6 = r13
            r4 = r2
            goto L6f
        L46:
            defpackage.fctl.b(r0)
            r9.a = r12
            r9.e = r13
            r9.f = r14
            r0 = r15
            evgj r0 = (defpackage.evgj) r0
            r9.g = r0
            r0 = r16
            evgm r0 = (defpackage.evgm) r0
            r9.h = r0
            r9.d = r3
            r8 = 0
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            java.lang.Object r0 = r2.h(r3, r4, r5, r6, r7, r8, r9)
            if (r0 == r1) goto L8e
            r3 = r12
            r4 = r13
            r6 = r15
            r7 = r16
        L6f:
            r5 = r14
            dxft r0 = (defpackage.dxft) r0
            boolean r12 = r0 instanceof defpackage.dxqm
            if (r12 == 0) goto L8d
            r12 = 0
            r9.a = r12
            r9.e = r12
            r9.f = r12
            r9.g = r12
            r9.h = r12
            r9.d = r10
            r8 = 1
            r2 = r11
            java.lang.Object r12 = r2.h(r3, r4, r5, r6, r7, r8, r9)
            if (r12 != r1) goto L8c
            goto L8e
        L8c:
            return r12
        L8d:
            return r0
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxrh.i(dxvi, java.lang.String, java.net.URL, evuh, evuh, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r6, defpackage.dxvi r7, boolean r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.dxre
            if (r0 == 0) goto L13
            r0 = r9
            dxre r0 = (defpackage.dxre) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dxre r0 = new dxre
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r9)
            goto L5e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r9)
            goto L4c
        L3a:
            defpackage.fctl.b(r9)
            if (r8 == 0) goto L4f
            dxlw r8 = r5.j
            r0.a = r7
            r0.d = r4
            java.lang.Object r9 = r8.c(r6, r0)
            if (r9 != r1) goto L4c
            goto L5d
        L4c:
            dxft r9 = (defpackage.dxft) r9
            goto L60
        L4f:
            dxlw r8 = r5.j
            r0.a = r7
            r0.d = r3
            java.lang.String r9 = "oauth2:https://www.googleapis.com/auth/notifications"
            java.lang.Object r9 = r8.b(r6, r9, r0)
            if (r9 != r1) goto L5e
        L5d:
            return r1
        L5e:
            dxft r9 = (defpackage.dxft) r9
        L60:
            boolean r6 = r9 instanceof defpackage.dxlt
            if (r6 == 0) goto L70
            dxqj r6 = new dxqj
            dxlt r9 = (defpackage.dxlt) r9
            java.io.IOException r8 = r9.a
            int r9 = r9.b
            r6.<init>(r8, r7, r9)
            return r6
        L70:
            boolean r6 = r9 instanceof defpackage.dxlr
            if (r6 == 0) goto L80
            dxqh r6 = new dxqh
            dxlr r9 = (defpackage.dxlr) r9
            java.lang.Throwable r8 = r9.a
            int r9 = r9.b
            r6.<init>(r8, r7, r9)
            return r6
        L80:
            boolean r6 = r9 instanceof defpackage.dxls
            if (r6 == 0) goto L90
            dxqh r6 = new dxqh
            dxls r9 = (defpackage.dxls) r9
            com.google.android.gms.auth.UserRecoverableAuthException r8 = r9.a
            int r9 = r9.b
            r6.<init>(r8, r7, r9)
            return r6
        L90:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxrh.j(java.lang.String, dxvi, boolean, fcxy):java.lang.Object");
    }

    public final URL k(String str) {
        return new URL(this.i.concat(str));
    }
}
