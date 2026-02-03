package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxmj implements dxlw {
    public static final eksp a = eksp.c("GnpSdk");
    private static final long h = TimeUnit.MINUTES.toMillis(5);
    private static final long i = TimeUnit.HOURS.toMillis(1);
    public final Context b;
    public final fdjx c;
    public final Map d;
    public final feav e;
    public final Map f;
    public final feav g;
    private final diep j;

    public dxmj(Context context, diep diepVar, fdjx fdjxVar) {
        context.getClass();
        diepVar.getClass();
        fdjxVar.getClass();
        this.b = context;
        this.j = diepVar;
        this.c = fdjxVar;
        this.d = new LinkedHashMap();
        this.e = new feaz();
        this.f = new LinkedHashMap();
        this.g = new feaz();
    }

    public static final dxfo k(Throwable th, int i2) {
        return th instanceof UserRecoverableAuthException ? new dxls((UserRecoverableAuthException) th, i2) : th instanceof IOException ? new dxlt((IOException) th, i2) : new dxlr(th, i2);
    }

    private final dxlz l(Account account, String str) throws Exception {
        Bundle bundle = Bundle.EMPTY;
        bundle.getClass();
        str.getClass();
        int i2 = dbmj.a;
        TokenData tokenDataB = dbmq.b(this.b, account, str, bundle);
        tokenDataB.getClass();
        String str2 = tokenDataB.b;
        str2.getClass();
        return new dxlz(str2, this.j.f().toEpochMilli(), tokenDataB.c);
    }

    private final boolean m(dxlz dxlzVar) {
        Long l = dxlzVar.c;
        return l != null ? TimeUnit.SECONDS.toMillis(l.longValue()) - this.j.f().toEpochMilli() > h : this.j.f().toEpochMilli() - dxlzVar.b < i - h;
    }

    @Override // defpackage.dxlw
    public final /* synthetic */ dxft a(String str) {
        if (fbce.b()) {
            return (dxft) fdim.a(fcyi.a, new dxlu(this, str, null));
        }
        try {
            return new dxfx(dxmk.a(this.b, str));
        } catch (Exception e) {
            return k(e, 41);
        }
    }

    @Override // defpackage.dxlw
    public final Object b(String str, String str2, fcxy fcxyVar) {
        return fdin.a(this.c.hE(), new dxmi(this, str, str2, null), fcxyVar);
    }

    @Override // defpackage.dxlw
    public final Object c(String str, fcxy fcxyVar) {
        return fdin.a(this.c.hE(), new dxma(this, str, null), fcxyVar);
    }

    @Override // defpackage.dxlw
    public final /* synthetic */ dxft d() {
        if (fbce.b()) {
            return (dxft) fdim.a(fcyi.a, new dxlv(this, null));
        }
        try {
            return new dxfx(dxmk.b(this.b));
        } catch (Exception e) {
            return k(e, 40);
        }
    }

    public final dxft e(String str, String str2) {
        Account account = new Account(str, "com.google");
        try {
            dxlz dxlzVarL = l(account, str2);
            if (!m(dxlzVarL)) {
                a.o().I("Token for [%s, %s] is invalid with expiration %s, refreshing...", account.name, str2, dxlzVarL.c);
                j(dxlzVarL);
                dxlzVarL = l(account, str2);
            }
            a.o().I("Returning valid token for [%s, %s] with expiration %s", account.name, str2, dxlzVarL.c);
            return new dxfx(dxlzVarL.a);
        } catch (Exception e) {
            return k(e, 43);
        }
    }

    public final dxlz f(dxly dxlyVar) throws Exception {
        dxlz dxlzVarL = l(dxlyVar.a, dxlyVar.b);
        this.d.put(dxlyVar, dxlzVarL);
        return dxlzVarL;
    }

    public final dxlz g(dxly dxlyVar) throws Exception {
        dxlz dxlzVar = (dxlz) this.d.get(dxlyVar);
        if (dxlzVar != null) {
            if (m(dxlzVar)) {
                return dxlzVar;
            }
            j(dxlzVar);
        }
        return f(dxlyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r8, java.lang.String r9, defpackage.fcxy r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.dxmb
            if (r0 == 0) goto L13
            r0 = r10
            dxmb r0 = (defpackage.dxmb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxmb r0 = new dxmb
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r10)
            goto L6d
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.fctl.b(r10)
            java.lang.String r10 = "com.google"
            dxly r2 = new dxly
            android.accounts.Account r4 = new android.accounts.Account
            r4.<init>(r8, r10)
            r2.<init>(r4, r9)
            fdci r8 = new fdci
            r8.<init>()
            java.util.Map r9 = r7.f
            monitor-enter(r9)
            java.lang.Object r10 = r9.get(r2)     // Catch: java.lang.Throwable -> L89
            fdkf r10 = (defpackage.fdkf) r10     // Catch: java.lang.Throwable -> L89
            if (r10 != 0) goto L5e
            fdjx r10 = r7.c     // Catch: java.lang.Throwable -> L89
            dxmc r4 = new dxmc     // Catch: java.lang.Throwable -> L89
            r5 = 0
            r4.<init>(r7, r2, r5)     // Catch: java.lang.Throwable -> L89
            r6 = 3
            fdkf r10 = defpackage.fdil.c(r10, r5, r4, r6)     // Catch: java.lang.Throwable -> L89
            r9.put(r2, r10)     // Catch: java.lang.Throwable -> L89
        L5e:
            r8.a = r10     // Catch: java.lang.Throwable -> L89
            monitor-exit(r9)
            java.lang.Object r8 = r8.a
            fdkf r8 = (defpackage.fdkf) r8
            r0.c = r3
            java.lang.Object r10 = r8.c(r0)
            if (r10 == r1) goto L88
        L6d:
            fctk r10 = (defpackage.fctk) r10
            java.lang.Object r8 = r10.a
            java.lang.Throwable r9 = defpackage.fctk.c(r8)
            if (r9 != 0) goto L81
            dxlz r8 = (defpackage.dxlz) r8
            java.lang.String r8 = r8.a
            dxfx r9 = new dxfx
            r9.<init>(r8)
            return r9
        L81:
            r8 = 42
            dxfo r8 = k(r9, r8)
            return r8
        L88:
            return r1
        L89:
            r8 = move-exception
            monitor-exit(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxmj.h(java.lang.String, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        if (r11 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r9, java.lang.String r10, defpackage.fcxy r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.dxmd
            if (r0 == 0) goto L13
            r0 = r11
            dxmd r0 = (defpackage.dxmd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxmd r0 = new dxmd
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r11)
            goto L97
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            feaz r9 = r0.f
            fdci r10 = r0.e
            dxly r2 = r0.d
            defpackage.fctl.b(r11)
            goto L63
        L3c:
            defpackage.fctl.b(r11)
            dxly r2 = new dxly
            android.accounts.Account r11 = new android.accounts.Account
            java.lang.String r5 = "com.google"
            r11.<init>(r9, r5)
            r2.<init>(r11, r10)
            fdci r10 = new fdci
            r10.<init>()
            feav r9 = r8.g
            r0.d = r2
            r0.e = r10
            r11 = r9
            feaz r11 = (defpackage.feaz) r11
            r0.f = r11
            r0.c = r4
            java.lang.Object r11 = r9.b(r0)
            if (r11 == r1) goto Lb7
        L63:
            java.util.Map r11 = r8.f     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r4 = r11.get(r2)     // Catch: java.lang.Throwable -> Lb2
            fdkf r4 = (defpackage.fdkf) r4     // Catch: java.lang.Throwable -> Lb2
            r5 = 0
            if (r4 != 0) goto L80
            fdjx r4 = r8.c     // Catch: java.lang.Throwable -> Lb2
            dxmf r6 = new dxmf     // Catch: java.lang.Throwable -> Lb2
            r6.<init>(r8, r2, r5)     // Catch: java.lang.Throwable -> Lb2
            r7 = 3
            fdkf r4 = defpackage.fdil.c(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb2
            r11.put(r2, r4)     // Catch: java.lang.Throwable -> Lb2
            r10.a = r4     // Catch: java.lang.Throwable -> Lb2
            goto L82
        L80:
            r10.a = r4     // Catch: java.lang.Throwable -> Lb2
        L82:
            r9.d()
            java.lang.Object r9 = r10.a
            fdkf r9 = (defpackage.fdkf) r9
            r0.d = r5
            r0.e = r5
            r0.f = r5
            r0.c = r3
            java.lang.Object r11 = r9.c(r0)
            if (r11 == r1) goto Lb7
        L97:
            fctk r11 = (defpackage.fctk) r11
            java.lang.Object r9 = r11.a
            java.lang.Throwable r10 = defpackage.fctk.c(r9)
            if (r10 != 0) goto Lab
            dxlz r9 = (defpackage.dxlz) r9
            java.lang.String r9 = r9.a
            dxfx r10 = new dxfx
            r10.<init>(r9)
            return r10
        Lab:
            r9 = 42
            dxfo r9 = k(r10, r9)
            return r9
        Lb2:
            r10 = move-exception
            r9.d()
            throw r10
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxmj.i(java.lang.String, java.lang.String, fcxy):java.lang.Object");
    }

    public final void j(dxlz dxlzVar) throws Exception {
        int i2 = dbmj.a;
        dbmq.f(this.b, dxlzVar.a);
    }
}
