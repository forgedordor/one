package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdlb extends fdlc implements fdkh {
    private final fdhw a;
    public final fdhz c;
    public final fdhz d;

    public fdlb() {
        fdia fdiaVar = fdia.a;
        this.c = new fdhz(null, fdiaVar);
        this.d = new fdhz(null, fdiaVar);
        this.a = new fdhw(false, fdiaVar);
    }

    private final void A() {
        fdzr fdzrVarD;
        fdla fdlaVar = (fdla) this.d.a;
        if (fdlaVar == null || fdlaVar.g()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (fdlaVar) {
                fdzr fdzrVarB = fdlaVar.b();
                fdzrVarD = null;
                if (fdzrVarB != null) {
                    fdkz fdkzVar = (fdkz) fdzrVarB;
                    if (jNanoTime - fdkzVar.b >= 0 && B(fdkzVar)) {
                        fdzrVarD = fdlaVar.d(0);
                    }
                }
            }
        } while (((fdkz) fdzrVarD) != null);
    }

    private final boolean B(Runnable runnable) {
        while (true) {
            fdhz fdhzVar = this.c;
            Object obj = fdhzVar.a;
            if (x()) {
                return false;
            }
            if (obj == null) {
                if (fdhzVar.d(null, runnable)) {
                    return true;
                }
            } else if (obj instanceof fdza) {
                fdza fdzaVar = (fdza) obj;
                int iA = fdzaVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA != 1) {
                    return false;
                }
                fdhzVar.d(obj, fdzaVar.c());
            } else {
                if (obj == fdld.b) {
                    return false;
                }
                fdza fdzaVar2 = new fdza(8, true);
                fdzaVar2.a((Runnable) obj);
                fdzaVar2.a(runnable);
                if (fdhzVar.d(obj, fdzaVar2)) {
                    return true;
                }
            }
        }
    }

    @Override // defpackage.fdjq
    public final void a(fcyh fcyhVar, Runnable runnable) {
        j(runnable);
    }

    public fdks c(long j, Runnable runnable, fcyh fcyhVar) {
        return fdke.a.c(j, runnable, fcyhVar);
    }

    @Override // defpackage.fdkh
    public final void d(long j, fdis fdisVar) {
        long jA = fdld.a(j);
        if (jA < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            fdkx fdkxVar = new fdkx(this, jA + jNanoTime, fdisVar);
            w(jNanoTime, fdkxVar);
            fdiw.b(fdisVar, fdkxVar);
        }
    }

    public void j(Runnable runnable) {
        A();
        if (B(runnable)) {
            z();
        } else {
            fdkd.a.j(runnable);
        }
    }

    @Override // defpackage.fdkw
    public void l() {
        fdzr fdzrVarD;
        ThreadLocal threadLocal = fdmw.a;
        fdmw.a.set(null);
        this.a.c = 1;
        boolean z = fdkb.a;
        while (true) {
            fdhz fdhzVar = this.c;
            Object obj = fdhzVar.a;
            if (obj == null) {
                if (fdhzVar.d(null, fdld.b)) {
                    break;
                }
            } else if (obj instanceof fdza) {
                ((fdza) obj).d();
                break;
            } else {
                if (obj == fdld.b) {
                    break;
                }
                fdza fdzaVar = new fdza(8, true);
                fdzaVar.a((Runnable) obj);
                if (fdhzVar.d(obj, fdzaVar)) {
                    break;
                }
            }
        }
        while (m() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            fdla fdlaVar = (fdla) this.d.a;
            if (fdlaVar == null) {
                return;
            }
            synchronized (fdlaVar) {
                fdzrVarD = fdlaVar.a() > 0 ? fdlaVar.d(0) : null;
            }
            fdkz fdkzVar = (fdkz) fdzrVarD;
            if (fdkzVar == null) {
                return;
            } else {
                k(jNanoTime, fdkzVar);
            }
        }
    }

    @Override // defpackage.fdkw
    public final long m() {
        Runnable runnable;
        fdkz fdkzVar;
        if (s()) {
            return 0L;
        }
        A();
        fdhz fdhzVar = this.c;
        while (true) {
            Object obj = fdhzVar.a;
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof fdza)) {
                if (obj == fdld.b) {
                    break;
                }
                if (fdhzVar.d(obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            } else {
                fdza fdzaVar = (fdza) obj;
                Object objB = fdzaVar.b();
                if (objB != fdza.a) {
                    runnable = (Runnable) objB;
                    break;
                }
                fdhzVar.d(obj, fdzaVar.c());
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        fcuq fcuqVar = this.b;
        if (((fcuqVar == null || fcuqVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = fdhzVar.a;
        if (obj2 != null) {
            if (!(obj2 instanceof fdza)) {
                return obj2 == fdld.b ? Long.MAX_VALUE : 0L;
            }
            if (!((fdza) obj2).e()) {
                return 0L;
            }
        }
        fdla fdlaVar = (fdla) this.d.a;
        if (fdlaVar == null || (fdkzVar = (fdkz) fdlaVar.c()) == null) {
            return Long.MAX_VALUE;
        }
        return fddu.j(fdkzVar.b - System.nanoTime(), 0L);
    }

    protected final fdks v(long j, Runnable runnable) {
        long jA = fdld.a(j);
        if (jA >= 4611686018427387903L) {
            return fdml.a;
        }
        long jNanoTime = System.nanoTime();
        fdky fdkyVar = new fdky(jA + jNanoTime, runnable);
        w(jNanoTime, fdkyVar);
        return fdkyVar;
    }

    public final void w(long j, fdkz fdkzVar) {
        if (!x()) {
            fdhz fdhzVar = this.d;
            fdla fdlaVar = (fdla) fdhzVar.a;
            if (fdlaVar == null) {
                fdhzVar.d(null, new fdla(j));
                Object obj = fdhzVar.a;
                obj.getClass();
                fdlaVar = (fdla) obj;
            }
            synchronized (fdkzVar) {
                if (fdkzVar._heap == fdld.a) {
                    return;
                }
                synchronized (fdlaVar) {
                    fdkz fdkzVar2 = (fdkz) fdlaVar.b();
                    if (!x()) {
                        if (fdkzVar2 == null) {
                            fdlaVar.a = j;
                        } else {
                            long j2 = fdkzVar2.b;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            long j3 = fdlaVar.a;
                            if (j - j3 > 0) {
                                fdlaVar.a = j;
                            } else {
                                j = j3;
                            }
                        }
                        if (fdkzVar.b - j < 0) {
                            fdkzVar.b = j;
                        }
                        boolean z = fdkb.a;
                        fdkzVar.d(fdlaVar);
                        fdzr[] fdzrVarArr = fdlaVar.b;
                        if (fdzrVarArr == null) {
                            fdzrVarArr = new fdzr[4];
                            fdlaVar.b = fdzrVarArr;
                        } else if (fdlaVar.a() >= fdzrVarArr.length) {
                            int iA = fdlaVar.a();
                            Object[] objArrCopyOf = Arrays.copyOf(fdzrVarArr, iA + iA);
                            objArrCopyOf.getClass();
                            fdzrVarArr = (fdzr[]) objArrCopyOf;
                            fdlaVar.b = fdzrVarArr;
                        }
                        int iA2 = fdlaVar.a();
                        fdlaVar.e(iA2 + 1);
                        fdzrVarArr[iA2] = fdkzVar;
                        fdkzVar.e(iA2);
                        fdlaVar.f(iA2);
                        fdla fdlaVar2 = (fdla) fdhzVar.a;
                        if ((fdlaVar2 != null ? (fdkz) fdlaVar2.c() : null) == fdkzVar) {
                            z();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        k(j, fdkzVar);
    }

    public final boolean x() {
        return this.a.b();
    }

    protected final boolean y() {
        if (!r()) {
            return false;
        }
        fdla fdlaVar = (fdla) this.d.a;
        if (fdlaVar != null && !fdlaVar.g()) {
            return false;
        }
        Object obj = this.c.a;
        if (obj == null) {
            return true;
        }
        return obj instanceof fdza ? ((fdza) obj).e() : obj == fdld.b;
    }
}
