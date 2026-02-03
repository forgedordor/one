package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avit implements avii {
    public static final eksp a = eksp.c("BugleContacts");
    public final cmfo b;
    public final avdr c;
    public final avdm d;
    public final fcsu e;
    public final avkx f;
    public final avlc g;
    private final fcyh h;
    private final fcyh i;
    private final cogw j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final bvwk p;
    private final aqvc q;
    private final byeq r;

    public avit(fcyh fcyhVar, fcyh fcyhVar2, cogw cogwVar, byeq byeqVar, cmfo cmfoVar, avdr avdrVar, avdm avdmVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, avkx avkxVar, avlc avlcVar, fcsu fcsuVar6, bvwk bvwkVar, aqvc aqvcVar) {
        fcyhVar.getClass();
        fcyhVar2.getClass();
        cogwVar.getClass();
        byeqVar.getClass();
        cmfoVar.getClass();
        avdrVar.getClass();
        avdmVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        avkxVar.getClass();
        avlcVar.getClass();
        fcsuVar6.getClass();
        aqvcVar.getClass();
        this.h = fcyhVar;
        this.i = fcyhVar2;
        this.j = cogwVar;
        this.r = byeqVar;
        this.b = cmfoVar;
        this.c = avdrVar;
        this.d = avdmVar;
        this.k = fcsuVar;
        this.l = fcsuVar2;
        this.m = fcsuVar3;
        this.e = fcsuVar4;
        this.n = fcsuVar5;
        this.f = avkxVar;
        this.g = avlcVar;
        this.o = fcsuVar6;
        this.p = bvwkVar;
        this.q = aqvcVar;
    }

    @Override // defpackage.avii
    public final Object a(int i, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.h), new avis(null, this, i), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0118, code lost:
    
        if (defpackage.fdkj.c(r5, r1) == r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0118 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r21, double r23, defpackage.fdap r25, defpackage.fcxy r26) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avit.b(long, double, fdap, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.avin
            if (r0 == 0) goto L13
            r0 = r8
            avin r0 = (defpackage.avin) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avin r0 = new avin
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            eieu r7 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L62
        L29:
            r8 = move-exception
            goto L6e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.fctl.b(r8)
            java.lang.String r8 = "ContactsChangeSync#sync"
            eieu r8 = defpackage.eiiy.h(r8)
            eksp r2 = defpackage.avit.a     // Catch: java.lang.Throwable -> L6a
            ekrw r2 = r2.e()     // Catch: java.lang.Throwable -> L6a
            eksl r2 = (defpackage.eksl) r2     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "Syncing changed contacts"
            r2.q(r4)     // Catch: java.lang.Throwable -> L6a
            fcsu r2 = r6.m     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L6a
            r2.getClass()     // Catch: java.lang.Throwable -> L6a
            ains r2 = (defpackage.ains) r2     // Catch: java.lang.Throwable -> L6a
            defpackage.avbu.b(r2, r3)     // Catch: java.lang.Throwable -> L6a
            r0.d = r8     // Catch: java.lang.Throwable -> L6a
            r0.c = r3     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r7 = r6.d(r7, r0)     // Catch: java.lang.Throwable -> L6a
            if (r7 == r1) goto L69
            r7 = r8
        L62:
            r8 = 0
            defpackage.fczl.a(r7, r8)
            fctx r7 = defpackage.fctx.a
            return r7
        L69:
            return r1
        L6a:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L6e:
            fcsu r0 = r6.m     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L7e
            r0.getClass()     // Catch: java.lang.Throwable -> L7e
            ains r0 = (defpackage.ains) r0     // Catch: java.lang.Throwable -> L7e
            r1 = 3
            defpackage.avbu.b(r0, r1)     // Catch: java.lang.Throwable -> L7e
            throw r8     // Catch: java.lang.Throwable -> L7e
        L7e:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L80
        L80:
            r0 = move-exception
            defpackage.fczl.a(r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avit.c(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0515, code lost:
    
        if (defpackage.fdin.a(r2, r3, r11) != r8) goto L175;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0295 A[LOOP:12: B:70:0x028f->B:72:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x034e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r28, defpackage.fcxy r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avit.d(int, fcxy):java.lang.Object");
    }
}
