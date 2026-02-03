package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class davx implements davp {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/welcome/v1/consent/AsterismProfilesConsentClientProxyImpl");
    public final fcsu a;
    public final fcsu b;
    private final Context d;
    private final fcyh e;
    private final efwo f;
    private final egej g;
    private final fcsu h;
    private final fcsu i;
    private final AtomicInteger j;
    private final fctc k;

    public davx(Context context, fcyh fcyhVar, fcsu fcsuVar, efwo efwoVar, egej egejVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        context.getClass();
        fcyhVar.getClass();
        efwoVar.getClass();
        egejVar.getClass();
        this.d = context;
        this.e = fcyhVar;
        this.a = fcsuVar;
        this.f = efwoVar;
        this.g = egejVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
        this.b = fcsuVar4;
        this.j = new AtomicInteger();
        this.k = fctd.a(new fdae() { // from class: davq
            @Override // defpackage.fdae
            public final Object invoke() {
                ethu ethuVar = (ethu) ethv.a.createBuilder();
                etie etieVar = (etie) etif.a.createBuilder();
                etih etihVarA = dblt.a();
                etieVar.copyOnWrite();
                etif etifVar = (etif) etieVar.instance;
                etihVarA.getClass();
                etifVar.c = etihVarA;
                etifVar.b |= 1;
                ethuVar.copyOnWrite();
                ethv ethvVar = (ethv) ethuVar.instance;
                etif etifVar2 = (etif) etieVar.build();
                etifVar2.getClass();
                ethvVar.c = etifVar2;
                ethvVar.b |= 1;
                return Base64.encodeToString(((ethv) ethuVar.build()).toByteArray(), 0);
            }
        });
    }

    private final Long f() {
        UserManager userManager = (UserManager) this.d.getSystemService("user");
        if (userManager != null) {
            return Long.valueOf(userManager.getSerialNumberForUser(Process.myUserHandle()));
        }
        return null;
    }

    private final Object g(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.e), new davt(null, this), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.davp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, defpackage.davo r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.davw
            if (r0 == 0) goto L13
            r0 = r8
            davw r0 = (defpackage.davw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            davw r0 = new davw
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.d
            defpackage.fctl.b(r8)
            goto L6e
        L38:
            defpackage.fctl.b(r8)
            r0.d = r6
            r0.c = r4
            fcsu r8 = r5.i
            java.lang.Object r2 = r8.b()
            dawd r2 = (defpackage.dawd) r2
            java.lang.String r2 = r2.a()
            boolean r2 = defpackage.fdbq.f(r6, r2)
            if (r2 == 0) goto L57
            java.lang.Object r7 = r5.c(r6, r4, r7, r0)
        L55:
            r8 = r7
            goto L6c
        L57:
            java.lang.Object r8 = r8.b()
            dawd r8 = (defpackage.dawd) r8
            java.lang.String r8 = r8.b()
            boolean r8 = defpackage.fdbq.f(r6, r8)
            if (r8 == 0) goto L83
            java.lang.Object r7 = r5.b(r4, r7, r0)
            goto L55
        L6c:
            if (r8 == r1) goto L82
        L6e:
            com.google.android.gms.asterism.SetAsterismConsentRequest r8 = (com.google.android.gms.asterism.SetAsterismConsentRequest) r8
            r8.getClass()
            r7 = 0
            r0.d = r7
            r0.c = r3
            java.lang.String r7 = "setConsented"
            java.lang.Object r6 = r5.d(r8, r6, r7, r0)
            if (r6 != r1) goto L81
            goto L82
        L81:
            return r6
        L82:
            return r1
        L83:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "ToS Message ID is unknown: "
            java.lang.String r6 = r8.concat(r6)
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.davx.a(java.lang.String, davo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r8, defpackage.davo r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.davx.b(int, davo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r9, int r10, defpackage.davo r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.davx.c(java.lang.String, int, davo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.gms.asterism.SetAsterismConsentRequest r17, java.lang.String r18, java.lang.String r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.davx.d(com.google.android.gms.asterism.SetAsterismConsentRequest, java.lang.String, java.lang.String, fcxy):java.lang.Object");
    }

    public final String e() {
        return (String) this.k.a();
    }
}
