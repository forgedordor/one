package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdiu extends fdkn implements fdis, fcyw, fdne {
    public final fcxy a;
    public final fcyh b;
    public final fdhx c;
    public final fdhz d;
    private final fdhz f;

    public fdiu(fcxy fcxyVar, int i) {
        super(i);
        this.a = fcxyVar;
        boolean z = fdkb.a;
        this.b = fcxyVar.u();
        fdia fdiaVar = fdia.a;
        this.c = new fdhx(536870911, fdiaVar);
        this.d = new fdhz(fdid.a, fdiaVar);
        this.f = new fdhz(null, fdiaVar);
    }

    private final fdks L() {
        fdlr fdlrVar = (fdlr) this.b.get(fdlr.c);
        if (fdlrVar == null) {
            return null;
        }
        fdks fdksVarB = fdlw.b(fdlrVar, true, new fdiy(this));
        this.f.d(null, fdksVarB);
        return fdksVarB;
    }

    private final void M(int i) {
        fdhx fdhxVar;
        int i2;
        do {
            fdhxVar = this.c;
            i2 = fdhxVar.c;
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = fdkb.a;
                fcxy fcxyVarT = t();
                boolean z2 = i == 4;
                if (z2 || !(fcxyVarT instanceof fdye) || fdko.b(i) != fdko.b(this.e)) {
                    fdko.a(this, fcxyVarT, z2);
                    return;
                }
                fdye fdyeVar = (fdye) fcxyVarT;
                fdjq fdjqVar = fdyeVar.a;
                fcyh fcyhVarU = fdyeVar.u();
                if (fdyf.c(fdjqVar, fcyhVarU)) {
                    fdyf.b(fdjqVar, fcyhVarU, this);
                    return;
                }
                ThreadLocal threadLocal = fdmw.a;
                fdkw fdkwVarA = fdmw.a();
                if (fdkwVarA.q()) {
                    fdkwVarA.o(this);
                    return;
                }
                fdkwVarA.p(true);
                try {
                    fdko.a(this, t(), true);
                    do {
                    } while (fdkwVarA.s());
                    return;
                } catch (Throwable th) {
                    try {
                        K(th);
                        return;
                    } finally {
                        fdkwVarA.n(true);
                    }
                }
            }
        } while (!fdhxVar.c(i2, (536870911 & i2) + 1073741824));
    }

    private static final void N(Object obj, Object obj2) {
        throw new IllegalStateException(a.i(obj2, obj, "It's prohibited to register multiple handlers, tried to register ", ", already has "));
    }

    private static final Object O(fdmm fdmmVar, Object obj, int i, fdau fdauVar) {
        fdau fdauVar2;
        if (obj instanceof fdjg) {
            boolean z = fdkb.a;
            return obj;
        }
        if (fdko.b(i)) {
            if (fdauVar != null) {
                fdauVar2 = fdauVar;
            } else if (fdmmVar instanceof fdiq) {
                fdauVar2 = null;
            }
            return new fdjf(obj, fdmmVar instanceof fdiq ? (fdiq) fdmmVar : null, fdauVar2, null, 16);
        }
        return obj;
    }

    private final void P(fdzf fdzfVar) {
        int i = this.c.c & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            fdzfVar.l(i);
        } catch (Throwable th) {
            fcyh fcyhVar = this.b;
            toString();
            fdjs.b(fcyhVar, new fdjh("Exception in invokeOnCancellation handler for ".concat(toString()), th));
        }
    }

    public final void A() {
        if (G()) {
            return;
        }
        z();
    }

    public final void B() {
        fdks fdksVarL = L();
        if (fdksVarL != null && k()) {
            fdksVarL.hz();
            this.f.c(fdml.a);
        }
    }

    @Override // defpackage.fdne
    public final void C(fdzf fdzfVar, int i) {
        fdhx fdhxVar;
        int i2;
        do {
            fdhxVar = this.c;
            i2 = fdhxVar.c;
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!fdhxVar.c(i2, ((i2 >> 29) << 29) + i));
        D(fdzfVar);
    }

    public final void D(Object obj) {
        boolean z = fdkb.a;
        while (true) {
            fdhz fdhzVar = this.d;
            Object obj2 = fdhzVar.a;
            if (obj2 instanceof fdid) {
                if (fdhzVar.d(obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof fdiq) || (obj2 instanceof fdzf)) {
                N(obj, obj2);
            } else {
                if (obj2 instanceof fdjg) {
                    fdjg fdjgVar = (fdjg) obj2;
                    if (!fdjgVar.a()) {
                        N(obj, obj2);
                    }
                    if (obj2 instanceof fdix) {
                        Throwable th = fdjgVar != null ? fdjgVar.b : null;
                        if (obj instanceof fdiq) {
                            x((fdiq) obj, th);
                            return;
                        } else {
                            obj.getClass();
                            P((fdzf) obj);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof fdjf) {
                    fdjf fdjfVar = (fdjf) obj2;
                    if (fdjfVar.b != null) {
                        N(obj, obj2);
                    }
                    if (obj instanceof fdzf) {
                        return;
                    }
                    obj.getClass();
                    fdiq fdiqVar = (fdiq) obj;
                    if (fdjfVar.a()) {
                        x(fdiqVar, fdjfVar.e);
                        return;
                    } else if (fdhzVar.d(obj2, fdjf.b(fdjfVar, fdiqVar, null, 29))) {
                        return;
                    }
                } else {
                    if (obj instanceof fdzf) {
                        return;
                    }
                    obj.getClass();
                    if (fdhzVar.d(obj2, new fdjf(obj2, (fdiq) obj, null, null, 28))) {
                        return;
                    }
                }
            }
        }
    }

    public final void E() {
        fcxy fcxyVar = this.a;
        Throwable th = null;
        fdye fdyeVar = fcxyVar instanceof fdye ? (fdye) fcxyVar : null;
        if (fdyeVar != null) {
            while (true) {
                fdhz fdhzVar = fdyeVar.f;
                Object obj = fdhzVar.a;
                fdzi fdziVar = fdyf.b;
                if (obj == fdziVar) {
                    if (fdhzVar.d(fdziVar, this)) {
                        break;
                    }
                } else {
                    if (!(obj instanceof Throwable)) {
                        Objects.toString(obj);
                        throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)));
                    }
                    if (!fdhzVar.d(obj, null)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            z();
            h(th);
        }
    }

    public final void F(Object obj, int i, fdau fdauVar) {
        fdhz fdhzVar;
        Object obj2;
        do {
            fdhzVar = this.d;
            obj2 = fdhzVar.a;
            if (!(obj2 instanceof fdmm)) {
                if (obj2 instanceof fdix) {
                    fdix fdixVar = (fdix) obj2;
                    if (fdixVar.a.a(false, true)) {
                        if (fdauVar != null) {
                            y(fdauVar, fdixVar.b, obj);
                            return;
                        }
                        return;
                    }
                }
                Objects.toString(obj);
                throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(obj)));
            }
        } while (!fdhzVar.d(obj2, O((fdmm) obj2, obj, i, fdauVar)));
        A();
        M(i);
    }

    public final boolean G() {
        return this.e == 2 && ((fdye) this.a).f.a != null;
    }

    @Override // defpackage.fdkn
    public final void H(Throwable th) {
        while (true) {
            fdhz fdhzVar = this.d;
            Object obj = fdhzVar.a;
            if (obj instanceof fdmm) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof fdjg) {
                return;
            }
            if (obj instanceof fdjf) {
                fdjf fdjfVar = (fdjf) obj;
                if (fdjfVar.a()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (fdhzVar.d(obj, fdjf.b(fdjfVar, null, th, 15))) {
                    fdiq fdiqVar = fdjfVar.b;
                    if (fdiqVar != null) {
                        x(fdiqVar, th);
                    }
                    fdau fdauVar = fdjfVar.c;
                    if (fdauVar != null) {
                        y(fdauVar, th, fdjfVar.a);
                        return;
                    }
                    return;
                }
            } else {
                Throwable th2 = th;
                if (fdhzVar.d(obj, new fdjf(obj, null, null, th2, 14))) {
                    return;
                } else {
                    th = th2;
                }
            }
        }
    }

    public final fdzi J(Object obj, fdau fdauVar) {
        fdhz fdhzVar;
        Object obj2;
        do {
            fdhzVar = this.d;
            obj2 = fdhzVar.a;
            if (!(obj2 instanceof fdmm)) {
                return null;
            }
        } while (!fdhzVar.d(obj2, O((fdmm) obj2, obj, this.e, fdauVar)));
        A();
        return fdiv.a;
    }

    @Override // defpackage.fdis
    public final void c(Object obj) {
        boolean z = fdkb.a;
        M(this.e);
    }

    @Override // defpackage.fdis
    public final void d(fdap fdapVar) {
        D(new fdip(fdapVar));
    }

    @Override // defpackage.fcyw
    public final fcyw dJ() {
        fcxy fcxyVar = this.a;
        if (fcxyVar instanceof fcyw) {
            return (fcyw) fcxyVar;
        }
        return null;
    }

    @Override // defpackage.fdis
    public final void e(Object obj, final fdap fdapVar) {
        F(obj, this.e, fdapVar != null ? new fdau() { // from class: fdit
            @Override // defpackage.fdau
            public final Object a(Object obj2, Object obj3, Object obj4) {
                fdapVar.invoke((Throwable) obj2);
                return fctx.a;
            }
        } : null);
    }

    @Override // defpackage.fdis
    public final void f(Object obj, fdau fdauVar) {
        F(obj, this.e, fdauVar);
    }

    @Override // defpackage.fdis
    public final void g(fdjq fdjqVar, Object obj) {
        fcxy fcxyVar = this.a;
        fdye fdyeVar = fcxyVar instanceof fdye ? (fdye) fcxyVar : null;
        F(obj, (fdyeVar != null ? fdyeVar.a : null) == fdjqVar ? 4 : this.e, null);
    }

    @Override // defpackage.fdis
    public final boolean h(Throwable th) {
        fdhz fdhzVar;
        Object obj;
        do {
            fdhzVar = this.d;
            obj = fdhzVar.a;
            if (!(obj instanceof fdmm)) {
                return false;
            }
        } while (!fdhzVar.d(obj, new fdix(this, th, (obj instanceof fdiq) || (obj instanceof fdzf))));
        fdmm fdmmVar = (fdmm) obj;
        if (fdmmVar instanceof fdiq) {
            x((fdiq) obj, th);
        } else if (fdmmVar instanceof fdzf) {
            P((fdzf) obj);
        }
        A();
        M(this.e);
        return true;
    }

    @Override // defpackage.fdis
    public final boolean i() {
        return n() instanceof fdmm;
    }

    @Override // defpackage.fdis
    public final boolean j() {
        return n() instanceof fdix;
    }

    @Override // defpackage.fdis
    public final boolean k() {
        return !(n() instanceof fdmm);
    }

    @Override // defpackage.fdis
    public final Object l(Object obj, fdau fdauVar) {
        return J(obj, fdauVar);
    }

    public final Object m() {
        fdhx fdhxVar;
        int i;
        fdlr fdlrVar;
        boolean zG = G();
        do {
            fdhxVar = this.c;
            i = fdhxVar.c;
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zG) {
                    E();
                }
                Object objN = n();
                if (objN instanceof fdjg) {
                    Throwable th = ((fdjg) objN).b;
                    if (fdkb.b) {
                        throw fdzh.a(th, this);
                    }
                    throw th;
                }
                if (!fdko.b(this.e) || (fdlrVar = (fdlr) this.b.get(fdlr.c)) == null || fdlrVar.v()) {
                    return o(objN);
                }
                CancellationException cancellationExceptionP = fdlrVar.p();
                H(cancellationExceptionP);
                if (fdkb.b) {
                    throw fdzh.a(cancellationExceptionP, this);
                }
                throw cancellationExceptionP;
            }
        } while (!fdhxVar.c(i, (536870911 & i) + 536870912));
        if (v() == null) {
            L();
        }
        if (zG) {
            E();
        }
        return fcyl.a;
    }

    public final Object n() {
        return this.d.a;
    }

    @Override // defpackage.fdkn
    public final Object o(Object obj) {
        return obj instanceof fdjf ? ((fdjf) obj).a : obj;
    }

    @Override // defpackage.fdkn
    public final Object p() {
        return n();
    }

    protected String q() {
        return "CancellableContinuation";
    }

    public Throwable r(fdlr fdlrVar) {
        return fdlrVar.p();
    }

    @Override // defpackage.fdkn
    public final Throwable s(Object obj) {
        Throwable thS = super.s(obj);
        if (thS == null) {
            return null;
        }
        fcxy fcxyVar = this.a;
        return (fdkb.b && (fcxyVar instanceof fcyw)) ? fdzh.a(thS, (fcyw) fcxyVar) : thS;
    }

    @Override // defpackage.fdkn
    public final fcxy t() {
        return this.a;
    }

    public final String toString() {
        String strC = fdkc.c(this.a);
        Object objN = n();
        String str = objN instanceof fdmm ? "Active" : objN instanceof fdix ? "Cancelled" : "Completed";
        return q() + "(" + strC + "){" + str + "}@" + fdkc.b(this);
    }

    @Override // defpackage.fcxy
    public final fcyh u() {
        return this.b;
    }

    public final fdks v() {
        return (fdks) this.f.a;
    }

    @Override // defpackage.fcxy
    public final void w(Object obj) {
        Throwable thC = fctk.c(obj);
        if (thC != null) {
            if (fdkb.b) {
                thC = fdzh.a(thC, this);
            }
            obj = new fdjg(thC);
        }
        F(obj, this.e, null);
    }

    public final void x(fdiq fdiqVar, Throwable th) {
        try {
            fdiqVar.b(th);
        } catch (Throwable th2) {
            fcyh fcyhVar = this.b;
            toString();
            fdjs.b(fcyhVar, new fdjh("Exception in invokeOnCancellation handler for ".concat(toString()), th2));
        }
    }

    public final void y(fdau fdauVar, Throwable th, Object obj) {
        try {
            fdauVar.a(th, obj, this.b);
        } catch (Throwable th2) {
            fcyh fcyhVar = this.b;
            toString();
            fdjs.b(fcyhVar, new fdjh("Exception in resume onCancellation handler for ".concat(toString()), th2));
        }
    }

    public final void z() {
        fdks fdksVarV = v();
        if (fdksVarV == null) {
            return;
        }
        fdksVarV.hz();
        this.f.c(fdml.a);
    }

    @Override // defpackage.fcyw
    public final void dK() {
    }
}
