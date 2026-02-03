package defpackage;

import android.app.Notification;
import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caao extends cayv {
    public static final cczi a = cdag.j(cdag.b, "default_cms_work_handler_attempt_limit", 10);
    public static final cczi b = cdag.k(cdag.b, "default_cms_work_handler_retry_delay_millis", 10000);
    public final axlf c;
    public final caas d;
    public final apqc e;
    public final cden f;
    private final Context g;
    private final pzj h;
    private final fdjx i;
    private final caap j;
    private final Class k;
    private final Class l;
    private final evuo m;
    private final pza n;
    private final int o;
    private final long p;
    private final caze q;
    private final Optional r;
    private final Notification s;

    public caao(Context context, pzj pzjVar, fdjx fdjxVar, caap caapVar, Class cls, axlf axlfVar, caas caasVar, Class cls2, evuo evuoVar, pza pzaVar, apqc apqcVar, int i, long j, caze cazeVar, Optional optional, Notification notification, cden cdenVar) {
        pzjVar.getClass();
        pzaVar.getClass();
        cazeVar.getClass();
        this.g = context;
        this.h = pzjVar;
        this.i = fdjxVar;
        this.j = caapVar;
        this.k = cls;
        this.c = axlfVar;
        this.d = caasVar;
        this.l = cls2;
        this.m = evuoVar;
        this.n = pzaVar;
        this.e = apqcVar;
        this.o = i;
        this.p = j;
        this.q = cazeVar;
        this.r = optional;
        this.s = notification;
        this.f = cdenVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(this.o);
        caxzVarL.f(this.n);
        caxzVarL.g(this.p);
        caxk caxkVar = (caxk) caxzVarL;
        caxkVar.a = this.h;
        caxzVarL.b(this.q);
        caxkVar.e = this.r;
        caxkVar.b = this.s;
        caxzVarL.e(true);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("CmsSingleItemWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return this.m;
    }

    @Override // defpackage.cayv
    protected final eiju j(cayy cayyVar, evuh evuhVar) {
        evuhVar.getClass();
        return auvw.c(this.i, fcyi.a, fdjz.a, new caal(this, evuhVar, cayyVar, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r9 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r9 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.cayy r6, java.lang.Object r7, defpackage.evuh r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.caaj
            if (r0 == 0) goto L13
            r0 = r9
            caaj r0 = (defpackage.caaj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            caaj r0 = new caaj
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r9)
            goto L5e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r9)
            goto L49
        L36:
            defpackage.fctl.b(r9)
            caas r9 = r5.d
            boolean r2 = r9 instanceof defpackage.caar
            if (r2 == 0) goto L4c
            caar r9 = (defpackage.caar) r9
            r0.c = r4
            java.lang.Object r9 = r9.d(r7, r6, r8, r0)
            if (r9 == r1) goto L64
        L49:
            cbcw r9 = (defpackage.cbcw) r9
            return r9
        L4c:
            boolean r2 = r9 instanceof defpackage.caaq
            if (r2 == 0) goto L65
            caaq r9 = (defpackage.caaq) r9
            eiju r6 = r9.c(r6, r7, r8)
            r0.c = r3
            java.lang.Object r9 = defpackage.fdxs.c(r6, r0)
            if (r9 == r1) goto L64
        L5e:
            r9.getClass()
            cbcw r9 = (defpackage.cbcw) r9
            return r9
        L64:
            return r1
        L65:
            fctg r6 = new fctg
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caao.k(cayy, java.lang.Object, evuh, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.efwo r9, defpackage.evuh r10, defpackage.cayy r11, java.lang.Exception r12, defpackage.fcxy r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.caak
            if (r0 == 0) goto L13
            r0 = r13
            caak r0 = (defpackage.caak) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            caak r0 = new caak
            r0.<init>(r8, r13)
        L18:
            r7 = r0
            java.lang.Object r13 = r7.b
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            java.lang.Object r12 = r7.a
            defpackage.fctl.b(r13)
            goto L7c
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            defpackage.fctl.b(r13)
            caap r1 = r8.j
            cqce r13 = defpackage.cayv.E
            cqbd r13 = r13.e()
            java.lang.String r3 = "Queue hit a permanent failure. Calling the ErrorHandler."
            r13.I(r3)
            caas r5 = r8.d
            java.lang.Class r3 = r5.getClass()
            java.lang.String r4 = "processor"
            java.lang.String r3 = r3.getCanonicalName()
            r13.A(r4, r3)
            java.lang.Class r3 = r1.getClass()
            java.lang.String r4 = "errorHandler"
            java.lang.String r3 = r3.getCanonicalName()
            r13.A(r4, r3)
            r13.r()
            android.content.Context r13 = r8.g
            java.lang.Class r3 = r8.k
            java.lang.Object r9 = defpackage.ehlh.a(r13, r3, r9)
            r9.getClass()
            r7.a = r12
            r7.d = r2
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L7b
            return r0
        L7b:
            r12 = r6
        L7c:
            java.lang.Exception r12 = (java.lang.Exception) r12
            cbcw r9 = defpackage.cbcw.l(r12)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caao.l(efwo, evuh, cayy, java.lang.Exception, fcxy):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(2:64|(1:(1:(3:13|58|59)(2:14|15))(6:16|17|18|62|45|46))(3:19|20|21))(5:25|65|26|(1:29)|57)|61|30|(2:32|(1:34)(2:35|(2:37|(1:39))(4:41|42|(4:44|62|45|46)|57)))|40|(0)|57) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ce, code lost:
    
        r9 = r6;
        r5 = r3;
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dd, code lost:
    
        r10 = defpackage.eicg.a(defpackage.fdmk.a);
        r0 = new defpackage.caam(null, r12, r3, (defpackage.efwo) r11, r5, r6);
        r9.a = null;
        r9.b = null;
        r9.c = null;
        r9.f = 3;
        r0 = defpackage.fdin.a(r10, r0, r9);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f9, code lost:
    
        if (r0 == r7) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ff, code lost:
    
        throw r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0054: MOVE (r5 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:85), block:B:23:0x0054 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0055: MOVE (r11 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:86), block:B:23:0x0054 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.efwo r13, defpackage.cayy r14, defpackage.evuh r15, defpackage.fcxy r16) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caao.m(efwo, cayy, evuh, fcxy):java.lang.Object");
    }
}
