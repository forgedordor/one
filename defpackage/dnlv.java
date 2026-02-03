package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnlv implements dnky {
    public final ecjh a;
    public boolean b;
    public final Map c;
    public final Map d;
    private final fdjx e;
    private final dnkk f;
    private final dnkh g;
    private final fctc h;
    private fdlr i;
    private final CopyOnWriteArrayList j;

    public dnlv(final fcsu fcsuVar, ecjh ecjhVar, fdjx fdjxVar, dnkk dnkkVar, dnkh dnkhVar) {
        fcsuVar.getClass();
        ecjhVar.getClass();
        fdjxVar.getClass();
        dnkkVar.getClass();
        dnkhVar.getClass();
        this.a = ecjhVar;
        this.e = fdjxVar;
        this.f = dnkkVar;
        this.g = dnkhVar;
        this.h = fctd.a(new fdae() { // from class: dnlc
            @Override // defpackage.fdae
            public final Object invoke() {
                Object objB = fcsuVar.b();
                objB.getClass();
                Optional optional = (Optional) objB;
                return ((dnov) (optional.isPresent() ? optional.get() : new dnov(null, null, 255))).a;
            }
        });
        this.j = new CopyOnWriteArrayList();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    private final dnlw k() {
        return (dnlw) this.h.a();
    }

    private final Object l(fdap fdapVar, fcxy fcxyVar) {
        final dnlp dnlpVar = new dnlp(fdapVar);
        ListenableFuture listenableFutureB = this.a.b(new ejvr() { // from class: dnlt
            @Override // defpackage.ejvr
            public final /* synthetic */ Object apply(Object obj) {
                return dnlpVar.invoke(obj);
            }
        }, eoqg.a);
        fdkf fdkfVarC = fdil.c(this.e, null, new dnln(listenableFutureB, null), 3);
        fdkfVarC.hK(new dnlo(listenableFutureB));
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((dnkx) it.next()).b();
        }
        Object objC = fdkfVarC.c(fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    private final Object m(dnmj dnmjVar, final dnjw dnjwVar, fcxy fcxyVar) {
        return i(dnmjVar, new fdap() { // from class: dnlf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dnlh dnlhVar = (dnlh) obj;
                dnlhVar.getClass();
                return Boolean.valueOf(dnlhVar.a != dnjwVar);
            }
        }, new fdap() { // from class: dnlg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dnlh dnlhVar = (dnlh) obj;
                dnlhVar.getClass();
                dnjw dnjwVar2 = dnjwVar;
                if (dnjwVar2 == dnjw.b) {
                    dnjwVar2 = null;
                }
                dnlhVar.a = dnjwVar2;
                return fctx.a;
            }
        }, fcxyVar);
    }

    private final Object n(dnmj dnmjVar, final dnjw dnjwVar, final dnjz dnjzVar, fcxy fcxyVar) {
        return i(dnmjVar, new fdap() { // from class: dnld
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dnlh dnlhVar = (dnlh) obj;
                dnlhVar.getClass();
                boolean z = true;
                if (dnlhVar.a == dnjwVar) {
                    if (dnlhVar.b == dnjzVar) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        }, new fdap() { // from class: dnle
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dnlh dnlhVar = (dnlh) obj;
                dnlhVar.getClass();
                dnjw dnjwVar2 = dnjwVar;
                if (dnjwVar2 == dnjw.b) {
                    dnjwVar2 = null;
                }
                dnlhVar.a = dnjwVar2;
                dnjz dnjzVar2 = dnjzVar;
                dnlhVar.b = dnjzVar2 != dnjz.b ? dnjzVar2 : null;
                return fctx.a;
            }
        }, fcxyVar);
    }

    private final Object o(dnmj dnmjVar, final dnjz dnjzVar, fcxy fcxyVar) {
        return i(dnmjVar, new fdap() { // from class: dnkz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dnlh dnlhVar = (dnlh) obj;
                dnlhVar.getClass();
                return Boolean.valueOf(dnlhVar.b != dnjzVar);
            }
        }, new fdap() { // from class: dnla
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dnlh dnlhVar = (dnlh) obj;
                dnlhVar.getClass();
                dnjz dnjzVar2 = dnjzVar;
                if (dnjzVar2 == dnjz.b) {
                    dnjzVar2 = null;
                }
                dnlhVar.b = dnjzVar2;
                return fctx.a;
            }
        }, fcxyVar);
    }

    private final Object p(dnkf dnkfVar, fcxy fcxyVar) {
        final CharSequence charSequenceA = dnkfVar.b().a();
        final CharSequence charSequenceA2 = dnkfVar.a();
        if (fdbq.f(charSequenceA2, charSequenceA) ? this.c.remove(charSequenceA) != null : !fdbq.f(this.c.put(charSequenceA, charSequenceA2), charSequenceA2)) {
            Object objL = l(new fdap() { // from class: dnlb
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    dnne dnneVar = (dnne) obj;
                    dnneVar.getClass();
                    CharSequence charSequence = charSequenceA2;
                    String string = charSequenceA.toString();
                    String string2 = charSequence.toString();
                    string.getClass();
                    string2.getClass();
                    dnneVar.copyOnWrite();
                    dnnj dnnjVar = (dnnj) dnneVar.instance;
                    dnnj dnnjVar2 = dnnj.a;
                    evub evubVar = dnnjVar.b;
                    if (!evubVar.b) {
                        dnnjVar.b = evubVar.a();
                    }
                    dnnjVar.b.put(string, string2);
                    return fctx.a;
                }
            }, fcxyVar);
            if (objL == fcyl.a) {
                return objL;
            }
        }
        return fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e4, code lost:
    
        if (r10 != r1) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dnky
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dnmj r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnlv.a(dnmj, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (p((defpackage.dnkf) r6, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d3, code lost:
    
        if (p((defpackage.dnkf) r6, r0) != r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dnky
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.dnmj r5, defpackage.dnkf r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnlv.b(dnmj, dnkf, fcxy):java.lang.Object");
    }

    @Override // defpackage.dnky
    public final void c(dnkx dnkxVar) {
        dnkxVar.getClass();
        this.j.add(dnkxVar);
    }

    @Override // defpackage.dnky
    public final void d(dnkx dnkxVar) {
        dnkxVar.getClass();
        this.j.remove(dnkxVar);
    }

    @Override // defpackage.dnky
    public final Object e() {
        fdlr fdlrVar = this.i;
        if ((fdlrVar == null || fdlrVar.y()) && !this.b) {
            this.i = fdil.d(this.e, null, null, new dnli(this, null), 3);
        }
        return fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r6.o(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dnlj
            if (r0 == 0) goto L13
            r0 = r6
            dnlj r0 = (defpackage.dnlj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dnlj r0 = new dnlj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L4e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L41
        L36:
            defpackage.fctl.b(r6)
            r0.c = r4
            java.lang.Object r6 = r5.e()
            if (r6 == r1) goto L51
        L41:
            fdlr r6 = r5.i
            if (r6 == 0) goto L4e
            r0.c = r3
            java.lang.Object r6 = r6.o(r0)
            if (r6 != r1) goto L4e
            goto L51
        L4e:
            fctx r6 = defpackage.fctx.a
            return r6
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnlv.f(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r7 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.dnmj r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dnlk
            if (r0 == 0) goto L13
            r0 = r7
            dnlk r0 = (defpackage.dnlk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dnlk r0 = new dnlk
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            dnkg r6 = r0.d
            defpackage.fctl.b(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.fctl.b(r7)
            goto L50
        L38:
            defpackage.fctl.b(r7)
            dnlw r7 = r5.k()
            dnlw r2 = defpackage.dnlw.c
            if (r7 != r2) goto L46
            java.lang.String r6 = "__GLOBAL__"
            return r6
        L46:
            dnkh r7 = r5.g
            r0.c = r4
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 == r1) goto L75
        L50:
            r6 = r7
            dnkg r6 = (defpackage.dnkg) r6
            if (r6 != 0) goto L57
            r6 = 0
            return r6
        L57:
            dnkh r7 = r5.g
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 == r1) goto L75
        L63:
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = defpackage.fcva.N(r7)
            boolean r6 = defpackage.fdbq.f(r6, r7)
            if (r6 == 0) goto L72
            java.lang.String r6 = "body-parts"
            return r6
        L72:
            java.lang.String r6 = "person"
            return r6
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnlv.g(dnmj, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.dnmj r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dnlm
            if (r0 == 0) goto L13
            r0 = r7
            dnlm r0 = (defpackage.dnlm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dnlm r0 = new dnlm
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)
            goto L45
        L38:
            defpackage.fctl.b(r7)
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r5.f(r0)
            if (r7 == r1) goto L69
        L45:
            java.util.Map r7 = r5.c
            dnmj r6 = (defpackage.dnmj) r6
            dnjs r6 = r6.a()
            java.lang.CharSequence r6 = r6.a()
            java.lang.Object r6 = r7.get(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7 = 0
            if (r6 == 0) goto L68
            dnkk r2 = r5.f
            r0.a = r7
            r0.d = r3
            java.lang.Object r7 = r2.d(r6, r0)
            if (r7 == r1) goto L69
        L66:
            dnkf r7 = (defpackage.dnkf) r7
        L68:
            return r7
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnlv.h(dnmj, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        if (l(r8, r0) != r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.dnmj r8, defpackage.fdap r9, defpackage.fdap r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.dnlq
            if (r0 == 0) goto L13
            r0 = r11
            dnlq r0 = (defpackage.dnlq) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            dnlq r0 = new dnlq
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.d
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.fctl.b(r11)
            goto La3
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.b
            java.lang.Object r9 = r0.a
            fdap r9 = (defpackage.fdap) r9
            defpackage.fctl.b(r11)
            goto L6d
        L41:
            java.lang.Object r10 = r0.c
            java.lang.Object r9 = r0.b
            java.lang.Object r8 = r0.a
            dnmj r8 = (defpackage.dnmj) r8
            defpackage.fctl.b(r11)
            goto L5e
        L4d:
            defpackage.fctl.b(r11)
            r0.a = r8
            r0.b = r9
            r0.c = r10
            r0.f = r5
            java.lang.Object r11 = r7.f(r0)
            if (r11 == r1) goto La7
        L5e:
            r0.a = r9
            r0.b = r10
            r0.c = r6
            r0.f = r4
            java.lang.Object r11 = r7.g(r8, r0)
            if (r11 == r1) goto La7
            r8 = r10
        L6d:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto La6
            java.util.Map r10 = r7.d
            java.lang.Object r2 = r10.get(r11)
            if (r2 != 0) goto L81
            dnlh r2 = new dnlh
            r2.<init>(r6)
            r10.put(r11, r2)
        L81:
            dnlh r2 = (defpackage.dnlh) r2
            java.lang.Object r9 = r9.invoke(r2)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto La3
            r8.invoke(r2)
            dnlr r8 = new dnlr
            r8.<init>(r11, r2)
            r0.a = r6
            r0.b = r6
            r0.f = r3
            java.lang.Object r8 = r7.l(r8, r0)
            if (r8 == r1) goto La7
        La3:
            fctx r8 = defpackage.fctx.a
            return r8
        La6:
            return r6
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnlv.i(dnmj, fdap, fdap, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a4, code lost:
    
        if (p(r9, r0) != r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.dnmj r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.dnls
            if (r0 == 0) goto L13
            r0 = r10
            dnls r0 = (defpackage.dnls) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dnls r0 = new dnls
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L4e
            if (r2 == r7) goto L48
            if (r2 == r6) goto L44
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            defpackage.fctl.b(r10)
            goto La6
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            defpackage.fctl.b(r10)
            return r10
        L40:
            defpackage.fctl.b(r10)
            return r10
        L44:
            defpackage.fctl.b(r10)
            return r10
        L48:
            java.lang.Object r9 = r0.a
            defpackage.fctl.b(r10)
            goto L5b
        L4e:
            defpackage.fctl.b(r10)
            r0.a = r9
            r0.d = r7
            java.lang.Object r10 = r8.f(r0)
            if (r10 == r1) goto Lb6
        L5b:
            boolean r10 = r9 instanceof defpackage.dnmg
            r2 = 0
            if (r10 == 0) goto L6e
            r0.a = r2
            r0.d = r6
            dnmj r9 = (defpackage.dnmj) r9
            java.lang.Object r9 = r8.m(r9, r2, r0)
            if (r9 != r1) goto L6d
            goto Lb6
        L6d:
            return r9
        L6e:
            boolean r10 = r9 instanceof defpackage.dnmi
            if (r10 == 0) goto L80
            r0.a = r2
            r0.d = r5
            dnmj r9 = (defpackage.dnmj) r9
            java.lang.Object r9 = r8.o(r9, r2, r0)
            if (r9 != r1) goto L7f
            goto Lb6
        L7f:
            return r9
        L80:
            boolean r10 = r9 instanceof defpackage.dnme
            if (r10 == 0) goto L92
            r0.a = r2
            r0.d = r4
            dnmj r9 = (defpackage.dnmj) r9
            java.lang.Object r9 = r8.n(r9, r2, r2, r0)
            if (r9 != r1) goto L91
            goto Lb6
        L91:
            return r9
        L92:
            boolean r10 = r9 instanceof defpackage.dnmb
            if (r10 == 0) goto La9
            dnmb r9 = (defpackage.dnmb) r9
            dnjs r9 = r9.a()
            r0.a = r2
            r0.d = r3
            java.lang.Object r9 = r8.p(r9, r0)
            if (r9 == r1) goto Lb6
        La6:
            fctx r9 = defpackage.fctx.a
            return r9
        La9:
            boolean r9 = r9 instanceof defpackage.dnmh
            if (r9 == 0) goto Lb0
            fctx r9 = defpackage.fctx.a
            return r9
        Lb0:
            fctg r9 = new fctg
            r9.<init>()
            throw r9
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnlv.j(dnmj, fcxy):java.lang.Object");
    }
}
