package defpackage;

import android.content.Context;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afqm implements afpv {
    public static final eksp a = eksp.c("BugleMultiShare");
    public final fdjx b;
    public final fdjx c;
    public final envd d;
    public final Context e;
    public final eigp f;
    public final ynm g;
    public final afps h;
    public final afmz i;
    public final ajln j;
    public final anty k;
    public final fcsu l;
    public final wms m;
    public final afpo n;
    public final fcsu o;
    public final dzuc p;
    public final fcsu q;
    public final feav r;
    public final cujd s;
    private final fcsu t;
    private final fcsu u;
    private final fcsu v;
    private final fcsu w;
    private final fdvc x;

    public afqm(fdjx fdjxVar, fdjx fdjxVar2, envd envdVar, Context context, eigp eigpVar, ynm ynmVar, afps afpsVar, afmz afmzVar, ajln ajlnVar, anty antyVar, cqdr cqdrVar, fcsu fcsuVar, wms wmsVar, afpo afpoVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, cujd cujdVar, fcsu fcsuVar5, dzuc dzucVar, final aqhb aqhbVar, fcsu fcsuVar6, fcsu fcsuVar7) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        envdVar.getClass();
        context.getClass();
        eigpVar.getClass();
        ynmVar.getClass();
        afpsVar.getClass();
        afmzVar.getClass();
        ajlnVar.getClass();
        antyVar.getClass();
        cqdrVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        cujdVar.getClass();
        fcsuVar5.getClass();
        dzucVar.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        this.b = fdjxVar;
        this.c = fdjxVar2;
        this.d = envdVar;
        this.e = context;
        this.f = eigpVar;
        this.g = ynmVar;
        this.h = afpsVar;
        this.i = afmzVar;
        this.j = ajlnVar;
        this.k = antyVar;
        this.l = fcsuVar;
        this.m = wmsVar;
        this.n = afpoVar;
        this.o = fcsuVar2;
        this.t = fcsuVar3;
        this.u = fcsuVar4;
        this.s = cujdVar;
        this.v = fcsuVar5;
        this.p = dzucVar;
        this.w = fcsuVar6;
        this.q = fcsuVar7;
        this.r = new feaz();
        this.x = auyf.c(afpsVar.a(), fdjxVar, new fdap() { // from class: afpz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                final afpr afprVar = (afpr) obj;
                afprVar.getClass();
                boolean z = afprVar instanceof afpq;
                aqhb aqhbVar2 = aqhbVar;
                if (z) {
                    final afqm afqmVar = this;
                    return new djew(djrr.dA, new fdae() { // from class: afpx
                        @Override // defpackage.fdae
                        public final Object invoke() throws IOException {
                            vvw vvwVar = ((afpq) afprVar).a;
                            afqm afqmVar2 = afqmVar;
                            eieh eiehVarA = afqmVar2.f.a("MultiShare SendButtonUiAdapterImpl#onSend");
                            try {
                                if (afqmVar2.r.c()) {
                                    try {
                                        dzub dzubVarD = afqmVar2.p.d();
                                        afqmVar2.g.c();
                                        auvw.k(afqmVar2.b, null, null, new afqg(afqmVar2, auvw.k(afqmVar2.c, null, null, new afqk(afqmVar2, dzubVarD, cqdr.a(), vvwVar, null), 3), null), 3);
                                    } catch (Throwable th) {
                                        afqmVar2.r.d();
                                        throw th;
                                    }
                                } else {
                                    ((eksl) afqm.a.e()).q("Failed to acquire send mutex");
                                }
                                fczl.a(eiehVarA, null);
                                return fctx.a;
                            } finally {
                            }
                        }
                    }, (fdae) null, (String) null, true, new djev(aqhbVar2.a(), 1), 28);
                }
                if (!(afprVar instanceof afpp)) {
                    throw new fctg();
                }
                return new djew(djrr.dA, new fdae() { // from class: afpy
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        eksp ekspVar = afqm.a;
                        return fctx.a;
                    }
                }, (fdae) null, ((afpp) afprVar).a, false, new djev(aqhbVar2.a(), 1), 20);
            }
        });
    }

    @Override // defpackage.afpv
    public final fdvc a() {
        return this.x;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.afqf
            if (r0 == 0) goto L13
            r0 = r6
            afqf r0 = (defpackage.afqf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            afqf r0 = new afqf
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L4d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            ajln r6 = r4.j
            ekgb r5 = defpackage.ekgb.r(r5)
            r2 = 0
            eiju r5 = r6.m(r5, r2)
            r5.getClass()
            fdkf r5 = defpackage.auvw.e(r5)
            r0.c = r3
            java.lang.Object r6 = r5.c(r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afqm.b(com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0220, code lost:
    
        if (r0.a(r15, r4, r2) != r3) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0124 A[Catch: ajlf -> 0x00af, TryCatch #1 {ajlf -> 0x00af, blocks: (B:24:0x0069, B:33:0x00a9, B:46:0x0100, B:48:0x011b, B:52:0x0124, B:54:0x012b), top: B:83:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [afpw] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.api.messaging.Conversation r28, defpackage.vvw r29, defpackage.fhaz r30, defpackage.fcxy r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afqm.c(com.google.android.apps.messaging.shared.api.messaging.Conversation, vvw, fhaz, fcxy):java.lang.Object");
    }
}
