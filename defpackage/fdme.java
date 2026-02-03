package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
@fcsv
/* loaded from: classes6.dex */
public class fdme implements fdlr, fdjb, fdmn {
    private final fdhz a;
    public final fdhz d;

    public fdme(boolean z) {
        fdkv fdkvVar = z ? fdmf.g : fdmf.f;
        fdia fdiaVar = fdia.a;
        this.d = new fdhz(fdkvVar, fdiaVar);
        this.a = new fdhz(null, fdiaVar);
    }

    public static final fdja U(fdyw fdywVar) {
        while (fdywVar.hB()) {
            fdywVar = fdywVar.i();
        }
        while (true) {
            fdywVar = fdywVar.h();
            if (!fdywVar.hB()) {
                if (fdywVar instanceof fdja) {
                    return (fdja) fdywVar;
                }
                if (fdywVar instanceof fdmj) {
                    return null;
                }
            }
        }
    }

    public static /* synthetic */ CancellationException V(fdme fdmeVar, Throwable th) {
        return fdmeVar.H(th, null);
    }

    private final boolean W(Throwable th) {
        if (hD()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        fdiz fdizVarI = I();
        return (fdizVarI == null || fdizVarI == fdml.a) ? z : fdizVarI.d(th) || z;
    }

    private static final String X(Object obj) {
        if (!(obj instanceof fdma)) {
            return obj instanceof fdll ? ((fdll) obj).hA() ? "Active" : "New" : obj instanceof fdjg ? "Cancelled" : "Completed";
        }
        fdma fdmaVar = (fdma) obj;
        return fdmaVar.g() ? "Cancelling" : fdmaVar.h() ? "Completing" : "Active";
    }

    private final Object d(Object obj, Object obj2) throws Throwable {
        if (!(obj instanceof fdll)) {
            return fdmf.a;
        }
        if (((obj instanceof fdkv) || (obj instanceof fdlx)) && !(obj instanceof fdja) && !(obj2 instanceof fdjg)) {
            fdll fdllVar = (fdll) obj;
            boolean z = fdkb.a;
            if (!this.d.d(fdllVar, fdmf.a(obj2))) {
                return fdmf.c;
            }
            hI(obj2);
            k(fdllVar, obj2);
            return obj2;
        }
        fdll fdllVar2 = (fdll) obj;
        fdmj fdmjVarI = i(fdllVar2);
        if (fdmjVarI == null) {
            return fdmf.c;
        }
        Throwable th = null;
        fdma fdmaVar = fdllVar2 instanceof fdma ? (fdma) fdllVar2 : null;
        if (fdmaVar == null) {
            fdmaVar = new fdma(fdmjVarI, null);
        }
        fdci fdciVar = new fdci();
        synchronized (fdmaVar) {
            if (fdmaVar.h()) {
                return fdmf.a;
            }
            fdmaVar.b.c = 1;
            if (fdmaVar != fdllVar2 && !this.d.d(fdllVar2, fdmaVar)) {
                return fdmf.c;
            }
            boolean z2 = fdkb.a;
            boolean zG = fdmaVar.g();
            fdjg fdjgVar = obj2 instanceof fdjg ? (fdjg) obj2 : null;
            if (fdjgVar != null) {
                fdmaVar.e(fdjgVar.b);
            }
            Throwable thD = fdmaVar.d();
            boolean z3 = !zG;
            Boolean.valueOf(z3).getClass();
            if (true == z3) {
                th = thD;
            }
            fdciVar.a = th;
            Throwable th2 = (Throwable) fdciVar.a;
            if (th2 != null) {
                l(fdmjVarI, th2);
            }
            fdja fdjaVarU = U(fdmjVarI);
            if (fdjaVarU != null && S(fdmaVar, fdjaVarU, obj2)) {
                return fdmf.b;
            }
            fdmjVarI.j(2);
            fdja fdjaVarU2 = U(fdmjVarI);
            return (fdjaVarU2 == null || !S(fdmaVar, fdjaVarU2, obj2)) ? C(fdmaVar, obj2) : fdmf.b;
        }
    }

    private final Throwable f(Object obj) {
        if (obj != null && !(obj instanceof Throwable)) {
            return ((fdmn) obj).G();
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : new fdls(g(), null, this);
    }

    private final fdmj i(fdll fdllVar) {
        fdmj fdmjVarHy = fdllVar.hy();
        if (fdmjVarHy != null) {
            return fdmjVarHy;
        }
        if (fdllVar instanceof fdkv) {
            return new fdmj();
        }
        if (fdllVar instanceof fdlx) {
            w((fdlx) fdllVar);
            return null;
        }
        Objects.toString(fdllVar);
        throw new IllegalStateException("State should have list: ".concat(String.valueOf(fdllVar)));
    }

    private final void k(fdll fdllVar, Object obj) throws Throwable {
        fdiz fdizVarI = I();
        if (fdizVarI != null) {
            fdizVarI.hz();
            N(fdml.a);
        }
        fdjh fdjhVar = null;
        fdjg fdjgVar = obj instanceof fdjg ? (fdjg) obj : null;
        Throwable th = fdjgVar != null ? fdjgVar.b : null;
        if (fdllVar instanceof fdlx) {
            try {
                ((fdlx) fdllVar).a(th);
                return;
            } catch (Throwable th2) {
                hH(new fdjh(a.i(this, fdllVar, "Exception in completion handler ", " for "), th2));
                return;
            }
        }
        fdmj fdmjVarHy = fdllVar.hy();
        if (fdmjVarHy != null) {
            fdmjVarHy.j(1);
            Object objF = fdmjVarHy.f();
            objF.getClass();
            for (fdyw fdywVarH = (fdyw) objF; !fdbq.f(fdywVarH, fdmjVarHy); fdywVarH = fdywVarH.h()) {
                if (fdywVarH instanceof fdlx) {
                    try {
                        ((fdlx) fdywVarH).a(th);
                    } catch (Throwable th3) {
                        if (fdjhVar != null) {
                            fcsw.a(fdjhVar, th3);
                        } else {
                            fdjhVar = new fdjh(a.i(this, fdywVarH, "Exception in completion handler ", " for "), th3);
                        }
                    }
                }
            }
            if (fdjhVar != null) {
                hH(fdjhVar);
            }
        }
    }

    private final void l(fdmj fdmjVar, Throwable th) throws Throwable {
        fdmjVar.j(4);
        Object objF = fdmjVar.f();
        objF.getClass();
        fdjh fdjhVar = null;
        for (fdyw fdywVarH = (fdyw) objF; !fdbq.f(fdywVarH, fdmjVar); fdywVarH = fdywVarH.h()) {
            if (fdywVarH instanceof fdlx) {
                fdlx fdlxVar = (fdlx) fdywVarH;
                if (fdlxVar.b()) {
                    try {
                        fdlxVar.a(th);
                    } catch (Throwable th2) {
                        if (fdjhVar != null) {
                            fcsw.a(fdjhVar, th2);
                        } else {
                            fdjhVar = new fdjh(a.i(this, fdywVarH, "Exception in completion handler ", " for "), th2);
                        }
                    }
                }
            }
        }
        if (fdjhVar != null) {
            hH(fdjhVar);
        }
        W(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [fdlk] */
    private final void u(fdkv fdkvVar) {
        fdmj fdmjVar = new fdmj();
        if (!fdkvVar.a) {
            fdmjVar = new fdlk(fdmjVar);
        }
        this.d.d(fdkvVar, fdmjVar);
    }

    private final void w(fdlx fdlxVar) {
        fdmj fdmjVar = new fdmj();
        fdmjVar.f.b(fdlxVar);
        fdmjVar.e.b(fdlxVar);
        while (true) {
            if (fdlxVar.f() != fdlxVar) {
                break;
            } else if (fdlxVar.e.d(fdlxVar, fdmjVar)) {
                fdmjVar.k(fdlxVar);
                break;
            }
        }
        this.d.d(fdlxVar, fdlxVar.h());
    }

    public final int A(Object obj) {
        if (obj instanceof fdkv) {
            if (((fdkv) obj).a) {
                return 0;
            }
            if (!this.d.d(obj, fdmf.g)) {
                return -1;
            }
            M();
            return 1;
        }
        if (!(obj instanceof fdlk)) {
            return 0;
        }
        if (!this.d.d(obj, ((fdlk) obj).a)) {
            return -1;
        }
        M();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object C(fdma fdmaVar, Object obj) throws Throwable {
        ArrayList<Throwable> arrayList;
        Object next;
        Throwable fdlsVar;
        boolean z = fdkb.a;
        Throwable th = null;
        fdjg fdjgVar = obj instanceof fdjg ? (fdjg) obj : null;
        Throwable th2 = fdjgVar != null ? fdjgVar.b : null;
        synchronized (fdmaVar) {
            fdmaVar.g();
            Object objC = fdmaVar.c();
            if (objC == null) {
                arrayList = new ArrayList(4);
            } else if (objC instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(objC);
                arrayList = arrayList2;
            } else {
                if (!(objC instanceof ArrayList)) {
                    Objects.toString(objC);
                    throw new IllegalStateException("State is ".concat(objC.toString()));
                }
                arrayList = (ArrayList) objC;
            }
            Throwable thD = fdmaVar.d();
            if (thD != null) {
                arrayList.add(0, thD);
            }
            if (th2 != null && !fdbq.f(th2, thD)) {
                arrayList.add(th2);
            }
            fdmaVar.f(fdmf.e);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        break;
                    }
                }
                Throwable th3 = (Throwable) next;
                if (th3 == null) {
                    fdlsVar = (Throwable) arrayList.get(0);
                    if (fdlsVar instanceof fdmx) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next2 = it2.next();
                            Throwable th4 = (Throwable) next2;
                            if (th4 != fdlsVar && (th4 instanceof fdmx)) {
                                th = next2;
                                break;
                            }
                        }
                        th = th;
                        if (th == null) {
                            th = fdlsVar;
                        }
                    } else {
                        th = fdlsVar;
                    }
                } else {
                    th = th3;
                }
            } else if (fdmaVar.g()) {
                fdlsVar = new fdls(g(), null, this);
                th = fdlsVar;
            }
            if (th != null && arrayList.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayList.size()));
                boolean z2 = fdkb.b;
                Throwable thC = !z2 ? th : fdzh.c(th);
                for (Throwable thC2 : arrayList) {
                    if (z2) {
                        thC2 = fdzh.c(thC2);
                    }
                    if (thC2 != th && thC2 != thC && !(thC2 instanceof CancellationException) && setNewSetFromMap.add(thC2)) {
                        fcsw.a(th, thC2);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new fdjg(th);
        }
        if (th != null && (W(th) || Q(th))) {
            obj.getClass();
            ((fdjg) obj).a();
        }
        hI(obj);
        this.d.d(fdmaVar, fdmf.a(obj));
        k(fdmaVar, obj);
        return obj;
    }

    public final Object D() throws Throwable {
        Object objE = E();
        if (objE instanceof fdll) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objE instanceof fdjg) {
            throw ((fdjg) objE).b;
        }
        return fdmf.b(objE);
    }

    public final Object E() {
        return this.d.a;
    }

    public final Object F(Object obj) throws Throwable {
        Object objD;
        do {
            objD = d(E(), obj);
            if (objD == fdmf.a) {
                String strI = a.i(obj, this, "Job ", " is already complete or completing, but is being completed with ");
                fdjg fdjgVar = obj instanceof fdjg ? (fdjg) obj : null;
                throw new IllegalStateException(strI, fdjgVar != null ? fdjgVar.b : null);
            }
        } while (objD == fdmf.c);
        return objD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // defpackage.fdmn
    public final CancellationException G() {
        CancellationException cancellationExceptionD;
        Object objE = E();
        if (objE instanceof fdma) {
            cancellationExceptionD = ((fdma) objE).d();
        } else if (objE instanceof fdjg) {
            cancellationExceptionD = ((fdjg) objE).b;
        } else {
            if (objE instanceof fdll) {
                Objects.toString(objE);
                throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(objE)));
            }
            cancellationExceptionD = null;
        }
        CancellationException cancellationException = cancellationExceptionD instanceof CancellationException ? cancellationExceptionD : null;
        return cancellationException == null ? new fdls("Parent job is ".concat(X(objE)), cancellationExceptionD, this) : cancellationException;
    }

    protected final CancellationException H(Throwable th, String str) {
        CancellationException fdlsVar = th instanceof CancellationException ? (CancellationException) th : null;
        if (fdlsVar == null) {
            if (str == null) {
                str = g();
            }
            fdlsVar = new fdls(str, th, this);
        }
        return fdlsVar;
    }

    public final fdiz I() {
        return (fdiz) this.a.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0076, code lost:
    
        return defpackage.fdml.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fdks J(boolean r5, defpackage.fdlx r6) {
        /*
            r4 = this;
            r6.d = r4
        L2:
            java.lang.Object r0 = r4.E()
            boolean r1 = r0 instanceof defpackage.fdkv
            if (r1 == 0) goto L1e
            r1 = r0
            fdkv r1 = (defpackage.fdkv) r1
            boolean r2 = r1.a
            if (r2 == 0) goto L1a
            fdhz r1 = r4.d
            boolean r0 = r1.d(r0, r6)
            if (r0 == 0) goto L2
            goto L5e
        L1a:
            r4.u(r1)
            goto L2
        L1e:
            boolean r1 = r0 instanceof defpackage.fdll
            r2 = 0
            if (r1 == 0) goto L5f
            r1 = r0
            fdll r1 = (defpackage.fdll) r1
            fdmj r3 = r1.hy()
            if (r3 != 0) goto L35
            r0.getClass()
            fdlx r0 = (defpackage.fdlx) r0
            r4.w(r0)
            goto L2
        L35:
            boolean r0 = r6.b()
            if (r0 == 0) goto L57
            boolean r0 = r1 instanceof defpackage.fdma
            if (r0 == 0) goto L42
            fdma r1 = (defpackage.fdma) r1
            goto L43
        L42:
            r1 = r2
        L43:
            if (r1 == 0) goto L49
            java.lang.Throwable r2 = r1.d()
        L49:
            if (r2 != 0) goto L51
            r0 = 5
            boolean r0 = r3.l(r6, r0)
            goto L5c
        L51:
            if (r5 == 0) goto L74
            r6.a(r2)
            goto L74
        L57:
            r0 = 1
            boolean r0 = r3.l(r6, r0)
        L5c:
            if (r0 == 0) goto L2
        L5e:
            return r6
        L5f:
            if (r5 == 0) goto L74
            java.lang.Object r5 = r4.E()
            boolean r0 = r5 instanceof defpackage.fdjg
            if (r0 == 0) goto L6c
            fdjg r5 = (defpackage.fdjg) r5
            goto L6d
        L6c:
            r5 = r2
        L6d:
            if (r5 == 0) goto L71
            java.lang.Throwable r2 = r5.b
        L71:
            r6.a(r2)
        L74:
            fdml r5 = defpackage.fdml.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdme.J(boolean, fdlx):fdks");
    }

    public void K(Throwable th) throws Throwable {
        O(th);
    }

    protected final void L(fdlr fdlrVar) {
        boolean z = fdkb.a;
        if (fdlrVar == null) {
            N(fdml.a);
            return;
        }
        fdlrVar.z();
        fdiz fdizVarQ = fdlrVar.q(this);
        N(fdizVarQ);
        if (y()) {
            fdizVarQ.hz();
            N(fdml.a);
        }
    }

    public final void N(fdiz fdizVar) {
        this.a.c(fdizVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean O(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdme.O(java.lang.Object):boolean");
    }

    public boolean P(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return O(th) && hx();
    }

    protected boolean Q(Throwable th) {
        return false;
    }

    public final boolean R(Object obj) throws Throwable {
        while (true) {
            Object objD = d(E(), obj);
            if (objD == fdmf.a) {
                return false;
            }
            if (objD == fdmf.b) {
                break;
            }
            if (objD != fdmf.c) {
                hC(objD);
                break;
            }
        }
        return true;
    }

    public final boolean S(fdma fdmaVar, fdja fdjaVar, Object obj) {
        while (fdlw.b(fdjaVar.a, false, new fdlz(this, fdmaVar, fdjaVar, obj)) == fdml.a) {
            fdjaVar = U(fdjaVar);
            if (fdjaVar == null) {
                return false;
            }
        }
        return true;
    }

    public final feam T() {
        fdmc fdmcVar = fdmc.a;
        fdcm.e(fdmcVar, 3);
        fdmd fdmdVar = fdmd.a;
        fdcm.e(fdmdVar, 3);
        return new feam(this, fdmcVar, fdmdVar);
    }

    @Override // defpackage.fcyh
    public final <R> R fold(R r, fdat<? super R, ? super fcyf, ? extends R> fdatVar) {
        return (R) fcye.a(this, r, fdatVar);
    }

    protected String g() {
        return "Job was cancelled";
    }

    @Override // defpackage.fcyf, defpackage.fcyh
    public final <E extends fcyf> E get(fcyg<E> fcygVar) {
        return (E) fcye.b(this, fcygVar);
    }

    @Override // defpackage.fcyf
    public final fcyg<?> getKey() {
        return fdlr.c;
    }

    public String h() {
        return fdkc.a(this);
    }

    protected boolean hD() {
        return false;
    }

    public final Object hJ(fcxy fcxyVar) throws Throwable {
        Object objE;
        do {
            objE = E();
            if (!(objE instanceof fdll)) {
                if (!(objE instanceof fdjg)) {
                    return fdmf.b(objE);
                }
                Throwable th = ((fdjg) objE).b;
                if (fdkb.b && (fcxyVar instanceof fcyw)) {
                    throw fdzh.a(th, (fcyw) fcxyVar);
                }
                throw th;
            }
        } while (A(objE) < 0);
        fdly fdlyVar = new fdly(fcym.c(fcxyVar), this);
        fdlyVar.B();
        fdiw.b(fdlyVar, fdlw.b(this, true, new fdmo(fdlyVar)));
        Object objM = fdlyVar.m();
        if (objM == fcyl.a) {
            fcxyVar.getClass();
        }
        return objM;
    }

    @Override // defpackage.fdlr
    public final fdks hK(fdap fdapVar) {
        return J(true, new fdlo(fdapVar));
    }

    public boolean hL() {
        return false;
    }

    public boolean hx() {
        return true;
    }

    @Override // defpackage.fcyh
    public final fcyh minusKey(fcyg<?> fcygVar) {
        return fcye.c(this, fcygVar);
    }

    @Override // defpackage.fdjb
    public final void n(fdmn fdmnVar) throws Throwable {
        O(fdmnVar);
    }

    @Override // defpackage.fdlr
    public final Object o(fcxy fcxyVar) {
        Object objE;
        do {
            objE = E();
            if (!(objE instanceof fdll)) {
                fdlw.f(fcxyVar.u());
                return fctx.a;
            }
        } while (A(objE) < 0);
        fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar.B();
        fdiw.b(fdiuVar, fdlw.b(this, true, new fdmp(fdiuVar)));
        Object objM = fdiuVar.m();
        fcyl fcylVar = fcyl.a;
        if (objM == fcylVar) {
            fcxyVar.getClass();
        }
        if (objM != fcylVar) {
            objM = fctx.a;
        }
        return objM == fcylVar ? objM : fctx.a;
    }

    @Override // defpackage.fdlr
    public final CancellationException p() {
        Object objE = E();
        if (!(objE instanceof fdma)) {
            if (!(objE instanceof fdll)) {
                return objE instanceof fdjg ? V(this, ((fdjg) objE).b) : new fdls(String.valueOf(fdkc.a(this)).concat(" has completed normally"), null, this);
            }
            toString();
            throw new IllegalStateException("Job is still new or active: ".concat(toString()));
        }
        Throwable thD = ((fdma) objE).d();
        if (thD != null) {
            return H(thD, String.valueOf(fdkc.a(this)).concat(" is cancelling"));
        }
        toString();
        throw new IllegalStateException("Job is still new or active: ".concat(toString()));
    }

    @Override // defpackage.fcyh
    public final fcyh plus(fcyh fcyhVar) {
        return fcye.d(this, fcyhVar);
    }

    @Override // defpackage.fdlr
    public final fdiz q(fdjb fdjbVar) {
        fdja fdjaVar = new fdja(fdjbVar);
        fdjaVar.d = this;
        while (true) {
            Object objE = E();
            if (objE instanceof fdkv) {
                fdkv fdkvVar = (fdkv) objE;
                if (!fdkvVar.a) {
                    u(fdkvVar);
                } else if (this.d.d(objE, fdjaVar)) {
                    break;
                }
            } else {
                if (!(objE instanceof fdll)) {
                    Object objE2 = E();
                    fdjg fdjgVar = objE2 instanceof fdjg ? (fdjg) objE2 : null;
                    fdjaVar.a(fdjgVar != null ? fdjgVar.b : null);
                    return fdml.a;
                }
                fdmj fdmjVarHy = ((fdll) objE).hy();
                if (fdmjVarHy == null) {
                    objE.getClass();
                    w((fdlx) objE);
                } else if (!fdmjVarHy.l(fdjaVar, 7)) {
                    boolean zL = fdmjVarHy.l(fdjaVar, 3);
                    Object objE3 = E();
                    if (objE3 instanceof fdma) {
                        thD = ((fdma) objE3).d();
                    } else {
                        boolean z = fdkb.a;
                        fdjg fdjgVar2 = objE3 instanceof fdjg ? (fdjg) objE3 : null;
                        if (fdjgVar2 != null) {
                            thD = fdjgVar2.b;
                        }
                    }
                    fdjaVar.a(thD);
                    if (!zL) {
                        return fdml.a;
                    }
                    boolean z2 = fdkb.a;
                    return fdjaVar;
                }
            }
        }
        return fdjaVar;
    }

    @Override // defpackage.fdlr
    public final fdks s(boolean z, boolean z2, fdap fdapVar) {
        return J(z2, z ? new fdln(fdapVar) : new fdlo(fdapVar));
    }

    @Override // defpackage.fdlr
    public void t(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new fdls(g(), null, this);
        }
        K(cancellationException);
    }

    public final String toString() {
        return (h() + "{" + X(E()) + "}") + "@" + fdkc.b(this);
    }

    @Override // defpackage.fdlr
    public final boolean v() {
        Object objE = E();
        return (objE instanceof fdll) && ((fdll) objE).hA();
    }

    @Override // defpackage.fdlr
    public final boolean x() {
        Object objE = E();
        if (objE instanceof fdjg) {
            return true;
        }
        return (objE instanceof fdma) && ((fdma) objE).g();
    }

    @Override // defpackage.fdlr
    public final boolean y() {
        return !(E() instanceof fdll);
    }

    @Override // defpackage.fdlr
    public final boolean z() {
        int iA;
        do {
            iA = A(E());
            if (iA == 0) {
                return false;
            }
        } while (iA != 1);
        return true;
    }

    protected void M() {
    }

    protected void hC(Object obj) {
    }

    public void hH(Throwable th) throws Throwable {
        throw th;
    }

    protected void hI(Object obj) {
    }
}
