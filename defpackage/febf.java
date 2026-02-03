package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class febf {
    private final fdhz a;
    public final int b;
    public final fdhx c;
    private final fdhy d;
    private final fdhz e;
    private final fdhy f;
    private final fdau g;

    public febf(int i) {
        this.b = i;
        fdia fdiaVar = fdia.a;
        this.d = new fdhy(0L, fdiaVar);
        this.f = new fdhy(0L, fdiaVar);
        if (i <= 0) {
            throw new IllegalArgumentException(a.g(i, "Semaphore should have at least 1 permit, but had "));
        }
        febi febiVar = new febi(0L, null, 2);
        this.a = new fdhz(febiVar, fdiaVar);
        this.e = new fdhz(febiVar, fdiaVar);
        this.c = new fdhx(i, fdiaVar);
        this.g = new fdau() { // from class: febc
            @Override // defpackage.fdau
            public final Object a(Object obj, Object obj2, Object obj3) {
                this.a.h();
                return fctx.a;
            }
        };
    }

    private final int c() {
        int andDecrement;
        do {
            andDecrement = fdhx.a.getAndDecrement(this.c);
        } while (andDecrement > this.b);
        return andDecrement;
    }

    private final boolean d(fdne fdneVar) {
        Object objA;
        long j;
        febi febiVar;
        fdhz fdhzVar = this.e;
        febi febiVar2 = (febi) fdhzVar.a;
        long jB = this.f.b();
        febd febdVar = febd.a;
        long j2 = febh.f;
        long j3 = jB / j2;
        loop0: while (true) {
            objA = fdxx.a(febiVar2, j3, febdVar);
            if (!fdzg.b(objA)) {
                fdzf fdzfVarA = fdzg.a(objA);
                while (true) {
                    fdzf fdzfVar = (fdzf) fdhzVar.a;
                    febiVar = febiVar2;
                    j = jB;
                    if (fdzfVar.b >= fdzfVarA.b) {
                        break loop0;
                    }
                    if (fdzfVarA.v()) {
                        if (!fdhzVar.d(fdzfVar, fdzfVarA)) {
                            if (fdzfVarA.u()) {
                                fdzfVarA.q();
                            }
                            febiVar2 = febiVar;
                            jB = j;
                        } else if (fdzfVar.u()) {
                            fdzfVar.q();
                        }
                    }
                }
            } else {
                j = jB;
                break;
            }
            febiVar2 = febiVar;
            jB = j;
        }
        febi febiVar3 = (febi) fdzg.a(objA);
        int i = (int) (j % j2);
        fdhv fdhvVar = febiVar3.c;
        if (fdhvVar.a(i).d(null, fdneVar)) {
            fdneVar.C(febiVar3, i);
            return true;
        }
        if (!fdhvVar.a(i).d(febh.b, febh.c)) {
            boolean z = fdkb.a;
            return false;
        }
        if (fdneVar instanceof fdis) {
            ((fdis) fdneVar).f(fctx.a, this.g);
        } else {
            if (!(fdneVar instanceof fear)) {
                Objects.toString(fdneVar);
                throw new IllegalStateException("unexpected: ".concat(fdneVar.toString()));
            }
            ((fear) fdneVar).i(fctx.a);
        }
        return true;
    }

    protected final void e(fdis fdisVar) {
        while (c() <= 0) {
            if (d((fdne) fdisVar)) {
                return;
            }
        }
        fdisVar.f(fctx.a, this.g);
    }

    public final void f() {
        fdhx fdhxVar;
        int i;
        int i2;
        do {
            fdhxVar = this.c;
            i = this.b;
            i2 = fdhxVar.c;
            if (i2 <= i) {
                return;
            }
        } while (!fdhxVar.c(i2, i));
    }

    public final Object g(fcxy fcxyVar) {
        if (c() <= 0) {
            fdiu fdiuVarA = fdiw.a(fcym.c(fcxyVar));
            try {
                if (!d(fdiuVarA)) {
                    e(fdiuVarA);
                }
                Object objM = fdiuVarA.m();
                fcyl fcylVar = fcyl.a;
                if (objM == fcylVar) {
                    fcxyVar.getClass();
                }
                if (objM != fcylVar) {
                    objM = fctx.a;
                }
                if (objM == fcylVar) {
                    return objM;
                }
            } catch (Throwable th) {
                fdiuVarA.E();
                throw th;
            }
        }
        return fctx.a;
    }

    public final void h() {
        Object objA;
        long j;
        febi febiVar;
        while (true) {
            fdhx fdhxVar = this.c;
            int i = this.b;
            int andIncrement = fdhx.a.getAndIncrement(fdhxVar);
            if (andIncrement >= i) {
                f();
                throw new IllegalStateException(a.g(i, "The number of released permits cannot be greater than "));
            }
            if (andIncrement >= 0) {
                return;
            }
            fdhz fdhzVar = this.a;
            febi febiVar2 = (febi) fdhzVar.a;
            long jB = this.d.b();
            long j2 = febh.f;
            long j3 = jB / j2;
            febe febeVar = febe.a;
            while (true) {
                objA = fdxx.a(febiVar2, j3, febeVar);
                if (fdzg.b(objA)) {
                    j = jB;
                    break;
                }
                fdzf fdzfVarA = fdzg.a(objA);
                while (true) {
                    fdzf fdzfVar = (fdzf) fdhzVar.a;
                    febiVar = febiVar2;
                    j = jB;
                    if (fdzfVar.b >= fdzfVarA.b) {
                        break;
                    }
                    if (fdzfVarA.v()) {
                        if (!fdhzVar.d(fdzfVar, fdzfVarA)) {
                            if (fdzfVarA.u()) {
                                fdzfVarA.q();
                            }
                            febiVar2 = febiVar;
                            jB = j;
                        } else if (fdzfVar.u()) {
                            fdzfVar.q();
                        }
                    }
                }
                febiVar2 = febiVar;
                jB = j;
            }
            febi febiVar3 = (febi) fdzg.a(objA);
            febiVar3.p();
            if (febiVar3.b <= j3) {
                int i2 = (int) (j % j2);
                fdhv fdhvVar = febiVar3.c;
                fdzi fdziVar = febh.b;
                Object objA2 = fdhvVar.a(i2).a(fdziVar);
                if (objA2 == null) {
                    int i3 = febh.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (fdhvVar.a(i2).a == febh.c) {
                            return;
                        }
                    }
                    if (!fdhvVar.a(i2).d(fdziVar, febh.d)) {
                        return;
                    }
                } else if (objA2 == febh.e) {
                    continue;
                } else if (objA2 instanceof fdis) {
                    fdis fdisVar = (fdis) objA2;
                    Object objL = fdisVar.l(fctx.a, this.g);
                    if (objL != null) {
                        fdisVar.c(objL);
                        return;
                    }
                } else {
                    if (!(objA2 instanceof fear)) {
                        Objects.toString(objA2);
                        throw new IllegalStateException("unexpected: ".concat(objA2.toString()));
                    }
                    if (((fear) objA2).j(this, fctx.a)) {
                        return;
                    }
                }
            }
        }
    }
}
