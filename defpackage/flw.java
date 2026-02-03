package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flw implements flr {
    public static final hyr a = new hyu(new fdat() { // from class: fls
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            return Long.valueOf(((flw) obj2).d.get());
        }
    }, new fdap() { // from class: flt
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            return new flw(((Long) obj).longValue());
        }
    });
    public final List b;
    public final cun c;
    public AtomicLong d;
    public fdap e;
    public fdav f;
    public fdax g;
    public fdae h;
    public fdap i;
    public fdap j;
    private boolean k;
    private final hox l;

    public flw() {
        this(1L);
    }

    @Override // defpackage.flr
    public final long a() {
        long andIncrement = this.d.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.d.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // defpackage.flr
    public final ctu b() {
        return (ctu) this.l.a();
    }

    @Override // defpackage.flr
    public final void c(long j) {
        this.k = false;
        fdap fdapVar = this.e;
        if (fdapVar != null) {
            fdapVar.invoke(Long.valueOf(j));
        }
    }

    @Override // defpackage.flr
    public final void d(long j) {
        fdap fdapVar = this.i;
        if (fdapVar != null) {
            fdapVar.invoke(Long.valueOf(j));
        }
    }

    @Override // defpackage.flr
    public final void e() {
        fdae fdaeVar = this.h;
        if (fdaeVar != null) {
            fdaeVar.invoke();
        }
    }

    @Override // defpackage.flr
    public final void f(ivy ivyVar, long j, fit fitVar, boolean z) {
        fdav fdavVar = this.f;
        if (fdavVar != null) {
            fdavVar.a(Boolean.valueOf(z), ivyVar, new ihs(j), fitVar);
        }
    }

    @Override // defpackage.flr
    public final void g(fii fiiVar) {
        cun cunVar = this.c;
        long j = ((fif) fiiVar).a;
        if (cunVar.b(j)) {
            this.b.remove(fiiVar);
            cunVar.d(j);
            fdap fdapVar = this.j;
            if (fdapVar != null) {
                fdapVar.invoke(Long.valueOf(j));
            }
        }
    }

    @Override // defpackage.flr
    public final boolean h(ivy ivyVar, long j, long j2, fit fitVar, boolean z) {
        fdax fdaxVar = this.g;
        if (fdaxVar != null) {
            return ((Boolean) fdaxVar.a(Boolean.valueOf(z), ivyVar, new ihs(j), new ihs(j2), false, fitVar)).booleanValue();
        }
        return true;
    }

    @Override // defpackage.flr
    public final void i(fii fiiVar) {
        long j = ((fif) fiiVar).a;
        if (j == 0) {
            ebs.c(a.u(0L, "The selectable contains an invalid id: "));
            j = 0;
        }
        cun cunVar = this.c;
        if (cunVar.b(j)) {
            ebs.c(a.h(fiiVar, "Another selectable with the id: ", ".selectableId has already subscribed."));
        }
        cunVar.f(j, fiiVar);
        this.b.add(fiiVar);
        this.k = false;
    }

    public final List j(final ivy ivyVar) {
        if (!this.k) {
            List list = this.b;
            final fdat fdatVar = new fdat() { // from class: flu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ivy ivyVarK = ((fii) obj).k();
                    ivy ivyVarK2 = ((fii) obj2).k();
                    ivy ivyVar2 = ivyVar;
                    long jH = ivyVarK != null ? ivyVar2.h(ivyVarK, 0L) : 0L;
                    long jH2 = ivyVarK2 != null ? ivyVar2.h(ivyVarK2, 0L) : 0L;
                    int i = (int) (jH & 4294967295L);
                    int i2 = (int) (4294967295L & jH2);
                    return Integer.valueOf(Float.intBitsToFloat(i) == Float.intBitsToFloat(i2) ? fcxl.a(Float.valueOf(Float.intBitsToFloat((int) (jH >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jH2 >> 32)))) : fcxl.a(Float.valueOf(Float.intBitsToFloat(i)), Float.valueOf(Float.intBitsToFloat(i2))));
                }
            };
            fcva.s(list, new Comparator() { // from class: flv
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Number) fdatVar.a(obj, obj2)).intValue();
                }
            });
            this.k = true;
        }
        return this.b;
    }

    public final void k(ctu ctuVar) {
        this.l.b(ctuVar);
    }

    public flw(long j) {
        this.b = new ArrayList();
        int i = ctv.a;
        this.c = new cun((byte[]) null);
        this.d = new AtomicLong(j);
        this.l = new hpl(ctv.a(), hsi.a);
    }
}
