package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emi implements dyb {
    public static final hyr a = hxu.a(new fdat() { // from class: emb
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            emi emiVar = (emi) obj2;
            hyr hyrVar = emi.a;
            return fcva.g(Integer.valueOf(emiVar.b()), Integer.valueOf(emiVar.c()));
        }
    }, new fdap() { // from class: emc
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            List list = (List) obj;
            return new emi(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    });
    public boolean b;
    public elm c;
    public final elt d;
    public final hox e;
    public float f;
    public iyq g;
    public final iyr h;
    public final emt i;
    public final LazyLayoutItemAnimator j;
    public final enc k;
    public final epj l;
    public final epf m;
    public final hox n;
    public final hox o;
    public final epm p;
    public final eke q;
    public final ebk r;
    private final dyb s;
    private int t;
    private boolean u;
    private final hox v;
    private final hox w;
    private final eme x;

    public emi() {
        this(0, 0, new eke(null));
    }

    @Override // defpackage.dyb
    public final float a(float f) {
        return this.s.a(f);
    }

    public final int b() {
        return this.d.a();
    }

    public final int c() {
        return this.d.b();
    }

    public final elf d() {
        return (elf) this.e.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r8.e(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.dod r6, defpackage.fdat r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.emg
            if (r0 == 0) goto L13
            r0 = r8
            emg r0 = (defpackage.emg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            emg r0 = new emg
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r7 = r0.a
            dod r6 = r0.e
            defpackage.fctl.b(r8)
            goto L4b
        L3a:
            defpackage.fctl.b(r8)
            emt r8 = r5.i
            r0.e = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.d(r0)
            if (r8 == r1) goto L5e
        L4b:
            dyb r8 = r5.s
            r2 = 0
            r0.e = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L5b
            goto L5e
        L5b:
            fctx r6 = defpackage.fctx.a
            return r6
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emi.e(dod, fdat, fcxy):java.lang.Object");
    }

    public final void f(elm elmVar, boolean z, boolean z2) {
        eln elnVar;
        int i;
        eln elnVar2;
        List list = elmVar.i;
        this.l.e = list.size();
        if (!z && this.b) {
            this.c = elmVar;
            return;
        }
        if (z) {
            this.b = true;
        }
        this.f -= elmVar.d;
        this.e.b(elmVar);
        elp elpVar = elmVar.a;
        this.w.b(Boolean.valueOf(((elpVar == null || elpVar.a == 0) && elmVar.b == 0) ? false : true));
        this.v.b(Boolean.valueOf(elmVar.c));
        if (z2) {
            elt eltVar = this.d;
            int i2 = elmVar.b;
            if (i2 < 0.0f) {
                ebs.d("scrollOffset should be non-negative");
            }
            eltVar.d(i2);
        } else {
            elt eltVar2 = this.d;
            Object obj = null;
            if (elpVar != null && (elnVar2 = (eln) fcur.I(elpVar.b)) != null) {
                obj = elnVar2.b;
            }
            eltVar2.b = obj;
            if (eltVar2.a || elmVar.j > 0) {
                eltVar2.a = true;
                int i3 = elmVar.b;
                if (i3 < 0.0f) {
                    ebs.d("scrollOffset should be non-negative (" + i3 + ')');
                }
                eltVar2.e((elpVar == null || (elnVar = (eln) fcur.I(elpVar.b)) == null) ? 0 : elnVar.a, i3);
            }
            if (this.u) {
                eke ekeVar = this.q;
                if (ekeVar.a != -1 && !list.isEmpty()) {
                    if (ekeVar.c) {
                        eln elnVar3 = (eln) fcva.S(list);
                        i = (elmVar.k == dwm.a ? elnVar3.l : elnVar3.m) + 1;
                    } else {
                        eln elnVar4 = (eln) fcva.N(list);
                        i = (elmVar.k == dwm.a ? elnVar4.l : elnVar4.m) - 1;
                    }
                    if (ekeVar.a != i) {
                        ekeVar.a = -1;
                        hum humVar = ekeVar.b;
                        Object[] objArr = humVar.a;
                        int i4 = humVar.b;
                        for (int i5 = 0; i5 < i4; i5++) {
                            ((epi) objArr[i5]).a();
                        }
                        humVar.g();
                    }
                }
            }
        }
        if (z) {
            this.p.b(elmVar.e, elmVar.g, elmVar.f);
        }
        this.t++;
    }

    @Override // defpackage.dyb
    public final boolean g() {
        return ((Boolean) this.w.a()).booleanValue();
    }

    @Override // defpackage.dyb
    public final boolean h() {
        return ((Boolean) this.v.a()).booleanValue();
    }

    @Override // defpackage.dyb
    public final boolean i() {
        return this.s.i();
    }

    /* JADX WARN: Finally extract failed */
    public final void j(float f, elf elfVar) {
        int i;
        int i2;
        boolean z;
        if (this.u) {
            eke ekeVar = this.q;
            eme emeVar = this.x;
            if (elfVar.i().isEmpty()) {
                return;
            }
            boolean z2 = f < 0.0f;
            if (z2) {
                eln elnVar = (eln) fcva.S(elfVar.i());
                i2 = (elfVar.h() == dwm.a ? elnVar.l : elnVar.m) + 1;
                i = ((eln) fcva.S(elfVar.i())).a + 1;
            } else {
                eln elnVar2 = (eln) fcva.N(elfVar.i());
                int i3 = elfVar.h() == dwm.a ? elnVar2.l : elnVar2.m;
                i = ((eln) fcva.N(elfVar.i())).a - 1;
                i2 = i3 - 1;
            }
            if (i < 0 || i >= elfVar.d()) {
                return;
            }
            if (i2 == ekeVar.a || i2 < 0) {
                z = z2;
            } else {
                if (ekeVar.c != z2) {
                    hum humVar = ekeVar.b;
                    Object[] objArr = humVar.a;
                    int i4 = humVar.b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ((epi) objArr[i5]).a();
                    }
                }
                ekeVar.c = z2;
                ekeVar.a = i2;
                hum humVar2 = ekeVar.b;
                humVar2.g();
                ArrayList arrayList = new ArrayList();
                emi emiVar = emeVar.a;
                hzg hzgVarA = hzf.a();
                fdap fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
                hzg hzgVarB = hzf.b(hzgVarA);
                try {
                    final elm elmVar = emiVar.b ? emiVar.c : (elm) emiVar.e.a();
                    if (elmVar != null) {
                        final fdcg fdcgVar = new fdcg();
                        fdcgVar.a = 1;
                        final List list = (List) elmVar.h.invoke(Integer.valueOf(i2));
                        int size = list.size();
                        int i6 = 0;
                        while (i6 < size) {
                            fcti fctiVar = (fcti) list.get(i6);
                            epj epjVar = emiVar.l;
                            int iIntValue = ((Number) fctiVar.a).intValue();
                            kil kilVar = (kil) fctiVar.b;
                            emi emiVar2 = emiVar;
                            boolean z3 = z2;
                            arrayList.add(epjVar.a(iIntValue, kilVar.a, false, new fdap() { // from class: emd
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj) {
                                    epg epgVar = (epg) obj;
                                    int iC = epgVar.c();
                                    for (int i7 = 0; i7 < iC; i7++) {
                                        if (elmVar.k == dwm.a) {
                                            epgVar.d(i7);
                                        } else {
                                            epgVar.d(i7);
                                        }
                                    }
                                    List list2 = list;
                                    fdcg fdcgVar2 = fdcgVar;
                                    if (fdcgVar2.a != list2.size()) {
                                        fdcgVar2.a++;
                                    }
                                    return fctx.a;
                                }
                            }));
                            i6++;
                            z2 = z3;
                            emiVar = emiVar2;
                        }
                    }
                    z = z2;
                    hzf.e(hzgVarA, hzgVarB, fdapVarK);
                    humVar2.p(humVar2.b, arrayList);
                } catch (Throwable th) {
                    hzf.e(hzgVarA, hzgVarB, fdapVarK);
                    throw th;
                }
            }
            if (!z) {
                if (elfVar.f() - eac.a((eln) fcva.N(elfVar.i()), elfVar.h()) < f) {
                    hum humVar3 = ekeVar.b;
                    Object[] objArr2 = humVar3.a;
                    int i7 = humVar3.b;
                    for (int i8 = 0; i8 < i7; i8++) {
                        ((epi) objArr2[i8]).b();
                    }
                    return;
                }
                return;
            }
            eln elnVar3 = (eln) fcva.S(elfVar.i());
            if (((eac.a(elnVar3, elfVar.h()) + ((int) (elfVar.h() == dwm.a ? elnVar3.j & 4294967295L : elnVar3.j >> 32))) + elfVar.c()) - elfVar.e() < (-f)) {
                hum humVar4 = ekeVar.b;
                Object[] objArr3 = humVar4.a;
                int i9 = humVar4.b;
                for (int i10 = 0; i10 < i9; i10++) {
                    ((epi) objArr3[i10]).b();
                }
            }
        }
    }

    public emi(int i, int i2) {
        this(i, i2, new eke(null));
    }

    public emi(final int i, int i2, eke ekeVar) {
        this.q = ekeVar;
        this.d = new elt(i, i2);
        elm elmVar = emm.a;
        hpb hpbVar = hpb.a;
        this.e = new hpl(elmVar, hpbVar);
        this.r = new ebk();
        this.s = new dtd(new fdap() { // from class: elz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                elm elmVar2;
                float f = -((Float) obj).floatValue();
                emi emiVar = this.a;
                if ((f >= 0.0f || emiVar.h()) && (f <= 0.0f || emiVar.g())) {
                    if (Math.abs(emiVar.f) > 0.5f) {
                        ebs.d("entered drag with non-zero pending scroll");
                    }
                    float f2 = emiVar.f + f;
                    emiVar.f = f2;
                    if (Math.abs(f2) > 0.5f) {
                        float f3 = emiVar.f;
                        int iB = fdcu.b(f3);
                        elm elmVarL = ((elm) emiVar.e.a()).l(iB, !emiVar.b);
                        if (elmVarL != null && (elmVar2 = emiVar.c) != null) {
                            elm elmVarL2 = elmVar2.l(iB, true);
                            if (elmVarL2 != null) {
                                emiVar.c = elmVarL2;
                            } else {
                                elmVarL = null;
                            }
                        }
                        if (elmVarL != null) {
                            emiVar.f(elmVarL, emiVar.b, true);
                            eqs.b(emiVar.n);
                            emiVar.j(f3 - emiVar.f, elmVarL);
                        } else {
                            iyq iyqVar = emiVar.g;
                            if (iyqVar != null) {
                                iyqVar.g();
                            }
                            emiVar.j(f3 - emiVar.f, emiVar.d());
                        }
                    }
                    if (Math.abs(emiVar.f) > 0.5f) {
                        f -= emiVar.f;
                        emiVar.f = 0.0f;
                    }
                } else {
                    f = 0.0f;
                }
                return Float.valueOf(-f);
            }
        });
        this.u = true;
        this.h = new emf(this);
        this.i = new emt();
        this.j = new LazyLayoutItemAnimator();
        this.k = new enc();
        this.l = new epj(new fdap() { // from class: ema
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                eph ephVar = (eph) obj;
                hzg hzgVarA = hzf.a();
                hzf.e(hzgVarA, hzf.b(hzgVarA), hzgVarA != null ? hzgVarA.k() : null);
                int i3 = ephVar.a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    ephVar.a(i + i4);
                }
                return fctx.a;
            }
        });
        this.x = new eme(this);
        this.m = new epf();
        fctx fctxVar = fctx.a;
        this.n = new hpl(fctxVar, hpbVar);
        this.o = new hpl(fctxVar, hpbVar);
        hsi hsiVar = hsi.a;
        this.v = new hpl(false, hsiVar);
        this.w = new hpl(false, hsiVar);
        this.p = new epm();
    }
}
