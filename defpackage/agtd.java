package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agtd implements agrx {
    public final Context a;
    public final fcsu b;
    public final fcsu c;
    public final cgte d;
    public final agwv e;
    public final fcsu f;
    public final agtg g;
    public final cgsa h;
    public final fcsu i;
    public final cgus j;
    public final agtf k;
    public final fdjx l;
    public final String m;
    private final fcsu n;
    private final ahax o;
    private final fcsu p;

    public agtd(Context context, fcsu fcsuVar, fcsu fcsuVar2, cgte cgteVar, agwv agwvVar, fcsu fcsuVar3, fcsu fcsuVar4, ahax ahaxVar, agtg agtgVar, fcsu fcsuVar5, cgsa cgsaVar, fcsu fcsuVar6, cgus cgusVar, agtf agtfVar, fdjx fdjxVar) {
        context.getClass();
        fcsuVar2.getClass();
        cgteVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        ahaxVar.getClass();
        agtgVar.getClass();
        fcsuVar5.getClass();
        cgsaVar.getClass();
        fcsuVar6.getClass();
        agtfVar.getClass();
        fdjxVar.getClass();
        this.a = context;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = cgteVar;
        this.e = agwvVar;
        this.f = fcsuVar3;
        this.n = fcsuVar4;
        this.o = ahaxVar;
        this.g = agtgVar;
        this.p = fcsuVar5;
        this.h = cgsaVar;
        this.i = fcsuVar6;
        this.j = cgusVar;
        this.k = agtfVar;
        this.l = fdjxVar;
        this.m = cgsaVar.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.agrx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdae r10, defpackage.fdae r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.agtb
            if (r0 == 0) goto L13
            r0 = r12
            agtb r0 = (defpackage.agtb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            agtb r0 = new agtb
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.String r10 = r0.d
            agrw r11 = r0.f
            agtt r0 = r0.e
            defpackage.fctl.b(r12)
            r4 = r10
            r6 = r0
        L31:
            r7 = r11
            goto L9a
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            agrw r11 = r0.f
            agtt r10 = r0.e
            defpackage.fctl.b(r12)
            goto L6c
        L43:
            defpackage.fctl.b(r12)
            fcsu r12 = r9.n
            java.lang.Object r12 = r12.b()
            egej r12 = (defpackage.egej) r12
            fcsu r2 = r9.f
            java.lang.Object r2 = r2.b()
            efwo r2 = (defpackage.efwo) r2
            com.google.common.util.concurrent.ListenableFuture r12 = r12.b(r2)
            r2 = r10
            agtt r2 = (defpackage.agtt) r2
            r0.e = r2
            r2 = r11
            agrw r2 = (defpackage.agrw) r2
            r0.f = r2
            r0.c = r4
            java.lang.Object r12 = defpackage.fdxs.c(r12, r0)
            if (r12 == r1) goto Lcc
        L6c:
            fcsu r2 = r9.p
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r2.b()
            egbf r2 = (defpackage.egbf) r2
            fcsu r4 = r9.f
            java.lang.Object r4 = r4.b()
            efwo r4 = (defpackage.efwo) r4
            com.google.common.util.concurrent.ListenableFuture r2 = r2.c(r4)
            r4 = r10
            agtt r4 = (defpackage.agtt) r4
            r0.e = r4
            r4 = r11
            agrw r4 = (defpackage.agrw) r4
            r0.f = r4
            r0.d = r12
            r0.c = r3
            java.lang.Object r0 = defpackage.fdxs.c(r2, r0)
            if (r0 == r1) goto Lcc
            r6 = r10
            r4 = r12
            r12 = r0
            goto L31
        L9a:
            egbe r12 = (defpackage.egbe) r12
            egbs r8 = r12.b()
            java.lang.String r5 = r8.h
            r5.getClass()
            fcsu r10 = r9.i
            java.lang.Object r10 = r10.b()
            agxn r10 = (defpackage.agxn) r10
            r10.g()
            java.lang.String r10 = "PenpalOnboarding"
            java.lang.String r11 = "PenpalConsentServiceImpl - tos is showing to user."
            android.util.Log.d(r10, r11)
            ahax r10 = r9.o
            agsj r2 = new agsj
            r3 = r9
            r2.<init>()
            r10.b(r2)
            agtg r10 = r3.g
            r11 = 0
            r10.a = r11
            r10.b = r11
            fctx r10 = defpackage.fctx.a
            return r10
        Lcc:
            r3 = r9
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agtd.a(fdae, fdae, fcxy):java.lang.Object");
    }

    public final dkdi b(final String str, int i, int i2) {
        return new dkdi(1, fcva.b(new diio(str, i, i + i2, new fdap() { // from class: agsp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                afzc afzcVar = (afzc) this.a.b.b();
                Uri uri = Uri.parse(str);
                uri.getClass();
                afzcVar.h(new agdi(uri));
                return true;
            }
        }, 24)));
    }
}
