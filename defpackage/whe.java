package defpackage;

import android.content.Context;
import android.provider.Telephony;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whe {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/AttachmentSecurityFilter");
    private static final String e;
    private static final cczi f;
    public final Context b;
    public final fcyh c;
    public final cqmr d;
    private final fcyh g;
    private final bxle h;
    private final Set i;

    static {
        String authority = Telephony.Mms.CONTENT_URI.getAuthority();
        authority.getClass();
        e = authority;
        f = cdag.h(cdag.b, "allow_forwarding_and_sharing_authority_kill_switch", false);
    }

    public whe(Context context, fcyh fcyhVar, fcyh fcyhVar2, cqmr cqmrVar, bxle bxleVar) {
        context.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        cqmrVar.getClass();
        bxleVar.getClass();
        this.b = context;
        this.g = fcyhVar;
        this.c = fcyhVar2;
        this.d = cqmrVar;
        this.h = bxleVar;
        fcxk fcxkVar = new fcxk();
        fcxkVar.add(e);
        fcxkVar.add(bxlg.a(context));
        fcxkVar.add(bxlk.a(context));
        fcxkVar.add(amsx.a(context));
        if (!((Boolean) f.e()).booleanValue()) {
            fcxkVar.add(bxleVar.a);
        }
        this.i = fcwm.a(fcxkVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b8, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() != false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00af -> B:36:0x00b2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dltd r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.whb
            if (r0 == 0) goto L13
            r0 = r7
            whb r0 = (defpackage.whb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            whb r0 = new whb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)
            goto Lb2
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.fctl.b(r7)
            boolean r7 = r6 instanceof defpackage.dltn
            if (r7 == 0) goto L47
            java.lang.String r6 = r6.f()
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.util.List r6 = defpackage.fcva.b(r6)
            goto L8c
        L47:
            boolean r7 = r6 instanceof defpackage.dohq
            if (r7 == 0) goto L5a
            dohq r6 = (defpackage.dohq) r6
            java.lang.String r6 = r6.f()
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.util.List r6 = defpackage.fcva.b(r6)
            goto L8c
        L5a:
            boolean r7 = r6 instanceof defpackage.dohr
            if (r7 == 0) goto Lbf
            dohr r6 = (defpackage.dohr) r6
            java.lang.Iterable r6 = r6.c()
            java.util.ArrayList r7 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.fcva.p(r6, r2)
            r7.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L73:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r6.next()
            dohq r2 = (defpackage.dohq) r2
            java.lang.String r2 = r2.f()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r7.add(r2)
            goto L73
        L8b:
            r6 = r7
        L8c:
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L94
        L92:
            r3 = r4
            goto Lba
        L94:
            java.util.Iterator r6 = r6.iterator()
        L98:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L92
            java.lang.Object r7 = r6.next()
            android.net.Uri r7 = (android.net.Uri) r7
            r7.getClass()
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r5.b(r7, r0)
            if (r7 != r1) goto Lb2
            return r1
        Lb2:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L98
        Lba:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        Lbf:
            ekrg r7 = defpackage.whe.a
            ekrw r7 = r7.i()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleComposeRow2"
            r7.X(r0, r1)
            r0 = 102(0x66, float:1.43E-43)
            java.lang.String r1 = "AttachmentSecurityFilter.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/AttachmentSecurityFilter"
            java.lang.String r4 = "isAllowed"
            ekrw r7 = r7.h(r2, r4, r0, r1)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r0 = "AttachmentSecurityFilter unable to inspect URI for %s"
            r7.t(r0, r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whe.a(dltd, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.net.Uri r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.whc
            if (r0 == 0) goto L13
            r0 = r9
            whc r0 = (defpackage.whc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            whc r0 = new whc
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            eieu r8 = r0.d
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2a
            goto L75
        L2a:
            r9 = move-exception
            goto L89
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.fctl.b(r9)
            java.lang.String r9 = "AttachmentSecurityFilter#isAllowedUri"
            eieu r9 = defpackage.eiiy.h(r9)
            java.lang.String r2 = r8.getScheme()     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = "content"
            boolean r2 = defpackage.fdbq.f(r2, r5)     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L5d
            java.util.Set r2 = r7.i     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = r8.getAuthority()     // Catch: java.lang.Throwable -> L85
            boolean r2 = defpackage.fcva.az(r2, r5)     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L5d
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L85
            defpackage.fczl.a(r9, r3)
            return r8
        L5d:
            fcyh r2 = r7.g     // Catch: java.lang.Throwable -> L85
            fcyh r2 = defpackage.eicg.a(r2)     // Catch: java.lang.Throwable -> L85
            whd r5 = new whd     // Catch: java.lang.Throwable -> L85
            r5.<init>(r3, r7, r8)     // Catch: java.lang.Throwable -> L85
            r0.d = r9     // Catch: java.lang.Throwable -> L85
            r0.c = r4     // Catch: java.lang.Throwable -> L85
            java.lang.Object r8 = defpackage.fdin.a(r2, r5, r0)     // Catch: java.lang.Throwable -> L85
            if (r8 == r1) goto L84
            r6 = r9
            r9 = r8
            r8 = r6
        L75:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2a
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2a
            r9 = r9 ^ r4
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L2a
            defpackage.fczl.a(r8, r3)
            return r9
        L84:
            return r1
        L85:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L89:
            throw r9     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            defpackage.fczl.a(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whe.b(android.net.Uri, fcxy):java.lang.Object");
    }
}
