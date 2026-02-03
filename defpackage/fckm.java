package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fckm implements fcap {
    final fckn a;
    final /* synthetic */ fckp b;

    public fckm(fckp fckpVar, fckn fcknVar) {
        this.b = fckpVar;
        this.a = fcknVar;
    }

    private static final Integer b(fbrg fbrgVar) {
        String str = (String) fbrgVar.c(fckp.f);
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @Override // defpackage.fcap
    public final void a(Status status, fcao fcaoVar, fbrg fbrgVar) {
        int i;
        int i2;
        fcjz fcjzVar;
        fckp fckpVar = this.b;
        synchronized (fckpVar.q) {
            fcke fckeVar = fckpVar.w;
            fckn fcknVar = this.a;
            fcknVar.b = true;
            Collection collection = fckeVar.c;
            if (collection.contains(fcknVar)) {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.remove(fcknVar);
                fckeVar = new fcke(fckeVar.b, DesugarCollections.unmodifiableCollection(arrayList), fckeVar.d, fckeVar.f, fckeVar.g, fckeVar.a, fckeVar.h, fckeVar.e);
            }
            fckpVar.w = fckeVar;
            fckpVar.v.a(status.getCode());
        }
        fckp fckpVar2 = this.b;
        if (fckpVar2.z.decrementAndGet() == Integer.MIN_VALUE) {
            fckpVar2.l.execute(new fcki(this));
            return;
        }
        fckn fcknVar2 = this.a;
        if (fcknVar2.c) {
            fckpVar2.u(fcknVar2);
            if (fckpVar2.w.f == fcknVar2) {
                fckpVar2.y(status, fcaoVar, fbrgVar);
                return;
            }
            return;
        }
        fcao fcaoVar2 = fcao.MISCARRIED;
        if (fcaoVar == fcaoVar2 && fckpVar2.y.incrementAndGet() > 1000) {
            fckp fckpVar3 = this.b;
            fckn fcknVar3 = this.a;
            fckpVar3.u(fcknVar3);
            if (fckpVar3.w.f == fcknVar3) {
                fckpVar3.y(Status.o.withDescription("Too many transparent retries. Might be a bug in gRPC").d(new fbtf(status)), fcaoVar, fbrgVar);
                return;
            }
            return;
        }
        if (fckpVar2.w.f == null) {
            if (fcaoVar == fcaoVar2 || (fcaoVar == fcao.REFUSED && fckpVar2.x.compareAndSet(false, true))) {
                fckp fckpVar4 = this.b;
                fckn fcknVar4 = this.a;
                fckn fcknVarS = fckpVar4.s(fcknVar4.d, true);
                if (fcknVarS != null) {
                    if (fckpVar4.p) {
                        synchronized (fckpVar4.q) {
                            fcke fckeVar2 = fckpVar4.w;
                            ArrayList arrayList2 = new ArrayList(fckeVar2.d);
                            arrayList2.remove(fcknVar4);
                            arrayList2.add(fcknVarS);
                            fckpVar4.w = new fcke(fckeVar2.b, fckeVar2.c, DesugarCollections.unmodifiableCollection(arrayList2), fckeVar2.f, fckeVar2.g, fckeVar2.a, fckeVar2.h, fckeVar2.e);
                        }
                    }
                    this.b.k.execute(new fckj(this, fcknVarS));
                    return;
                }
                return;
            }
            if (fcaoVar != fcao.DROPPED) {
                fckpVar2.x.set(true);
                if (fckpVar2.p) {
                    Integer numB = b(fbrgVar);
                    fckp fckpVar5 = this.b;
                    boolean zContains = fckpVar5.o.c.contains(status.getCode());
                    boolean z = (fckpVar5.u == null || (!zContains && (numB == null || numB.intValue() >= 0))) ? false : !r9.b();
                    if (zContains && !z && !status.f() && numB != null && numB.intValue() > 0) {
                        numB = 0;
                    }
                    boolean z2 = zContains && !z;
                    if (z2 && numB != null) {
                        if (numB.intValue() < 0) {
                            fckpVar5.x();
                        } else {
                            Object obj = fckpVar5.q;
                            synchronized (obj) {
                                fcjz fcjzVar2 = fckpVar5.E;
                                if (fcjzVar2 != null) {
                                    Future futureA = fcjzVar2.a();
                                    fcjz fcjzVar3 = new fcjz(obj);
                                    fckpVar5.E = fcjzVar3;
                                    if (futureA != null) {
                                        futureA.cancel(false);
                                    }
                                    fcjzVar3.b(fckpVar5.m.schedule(new fckb(fckpVar5, fcjzVar3), numB.intValue(), TimeUnit.MILLISECONDS));
                                }
                            }
                        }
                    }
                    fckp fckpVar6 = this.b;
                    synchronized (fckpVar6.q) {
                        fcke fckeVar3 = fckpVar6.w;
                        fckn fcknVar5 = this.a;
                        ArrayList arrayList3 = new ArrayList(fckeVar3.d);
                        arrayList3.remove(fcknVar5);
                        fckpVar6.w = new fcke(fckeVar3.b, fckeVar3.c, DesugarCollections.unmodifiableCollection(arrayList3), fckeVar3.f, fckeVar3.g, fckeVar3.a, fckeVar3.h, fckeVar3.e);
                        if (z2 && (fckpVar6.z(fckpVar6.w) || !fckpVar6.w.d.isEmpty())) {
                            return;
                        }
                    }
                } else {
                    fckq fckqVar = fckpVar2.n;
                    long j = 0;
                    if (fckqVar == null) {
                        i2 = 0;
                        i = 1;
                    } else {
                        boolean zContains2 = fckqVar.f.contains(status.getCode());
                        Integer numB2 = b(fbrgVar);
                        boolean z3 = (fckpVar2.u == null || (!zContains2 && (numB2 == null || numB2.intValue() >= 0))) ? false : !r13.b();
                        if (fckqVar.a <= fcknVar2.d + 1 || z3) {
                            i = 1;
                            i2 = 0;
                        } else {
                            if (numB2 == null) {
                                if (zContains2) {
                                    long j2 = fckpVar2.F;
                                    double dNextDouble = fckp.i ? (fckp.h.nextDouble() * 0.8d) + 0.4d : fckp.h.nextDouble();
                                    i = 1;
                                    fckpVar2.F = Math.min((long) (fckpVar2.F * fckqVar.d), fckqVar.c);
                                    j = (long) (j2 * dNextDouble);
                                }
                                i = 1;
                                i2 = 0;
                            } else {
                                i = 1;
                                if (numB2.intValue() >= 0) {
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(numB2.intValue());
                                    fckpVar2.F = fckqVar.b;
                                    j = nanos;
                                }
                                i2 = 0;
                            }
                            i2 = i;
                        }
                    }
                    if (i2 != 0) {
                        fckn fcknVarS2 = fckpVar2.s(fcknVar2.d + i, false);
                        if (fcknVarS2 != null) {
                            Object obj2 = fckpVar2.q;
                            synchronized (obj2) {
                                fcjzVar = new fcjz(obj2);
                                fckpVar2.D = fcjzVar;
                            }
                            fcjzVar.b(this.b.m.schedule(new fckh(this, fcjzVar, fcknVarS2), j, TimeUnit.NANOSECONDS));
                            return;
                        }
                        return;
                    }
                }
            } else if (fckpVar2.p) {
                fckpVar2.x();
            }
        }
        fckp fckpVar7 = this.b;
        fckn fcknVar6 = this.a;
        fckpVar7.u(fcknVar6);
        if (fckpVar7.w.f == fcknVar6) {
            fckpVar7.y(status, fcaoVar, fbrgVar);
        }
    }

    @Override // defpackage.fcap
    public final void c(fbrg fbrgVar) {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        fckn fcknVar = this.a;
        int i3 = fcknVar.d;
        if (i3 > 0) {
            fbrb fbrbVar = fckp.e;
            fbrgVar.f(fbrbVar);
            fbrgVar.h(fbrbVar, String.valueOf(i3));
        }
        fckp fckpVar = this.b;
        fckpVar.u(fcknVar);
        if (fckpVar.w.f == fcknVar) {
            fcko fckoVar = fckpVar.u;
            if (fckoVar != null) {
                do {
                    atomicInteger = fckoVar.d;
                    i = atomicInteger.get();
                    i2 = fckoVar.a;
                    if (i == i2) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i, Math.min(fckoVar.c + i, i2)));
            }
            fckpVar.l.execute(new fckf(this, fbrgVar));
        }
    }

    @Override // defpackage.fcmp
    public final void d(fcmo fcmoVar) throws IOException {
        fckp fckpVar = this.b;
        fckn fcknVar = fckpVar.w.f;
        ejwl.m(fcknVar != null, "Headers should be received prior to messages.");
        if (fcknVar != this.a) {
            fcdy.g(fcmoVar);
        } else {
            fckpVar.l.execute(new fckk(this, fcmoVar));
        }
    }

    @Override // defpackage.fcmp
    public final void e() {
        fckp fckpVar = this.b;
        if (fckpVar.o()) {
            fckpVar.l.execute(new fckl(this));
        }
    }
}
