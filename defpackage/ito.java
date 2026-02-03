package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ito extends icr implements ith, isn, kio {
    public Object a;
    public Object b;
    public Object[] c;
    public PointerInputEventHandler d;
    public irs e = itf.a;
    public final hum f;
    public final Object g;
    public long h;
    private fdlr i;
    private final hum j;
    private irs k;

    public ito(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.a = obj;
        this.b = obj2;
        this.c = objArr;
        this.d = pointerInputEventHandler;
        hum humVar = new hum(new itl[16]);
        this.f = humVar;
        this.g = humVar;
        this.j = new hum(new itl[16]);
        this.h = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:6:0x000d, B:13:0x001a, B:14:0x001f, B:15:0x0020, B:18:0x002d, B:19:0x0037, B:21:0x0040), top: B:31:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void t(defpackage.irs r5, defpackage.iru r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.g
            monitor-enter(r0)
            hum r1 = r4.j     // Catch: java.lang.Throwable -> L57
            hum r2 = r4.f     // Catch: java.lang.Throwable -> L57
            int r3 = r1.b     // Catch: java.lang.Throwable -> L57
            r1.o(r3, r2)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r0)
            int r0 = r6.ordinal()     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L37
            r1 = 1
            if (r0 == r1) goto L20
            r1 = 2
            if (r0 != r1) goto L1a
            goto L37
        L1a:
            fctg r5 = new fctg     // Catch: java.lang.Throwable -> L50
            r5.<init>()     // Catch: java.lang.Throwable -> L50
            throw r5     // Catch: java.lang.Throwable -> L50
        L20:
            hum r0 = r4.j     // Catch: java.lang.Throwable -> L50
            int r1 = r0.b     // Catch: java.lang.Throwable -> L50
            int r1 = r1 + (-1)
            java.lang.Object[] r0 = r0.a     // Catch: java.lang.Throwable -> L50
            int r2 = r0.length     // Catch: java.lang.Throwable -> L50
            if (r1 >= r2) goto L4a
        L2b:
            if (r1 < 0) goto L4a
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L50
            itl r2 = (defpackage.itl) r2     // Catch: java.lang.Throwable -> L50
            r2.v(r5, r6)     // Catch: java.lang.Throwable -> L50
            int r1 = r1 + (-1)
            goto L2b
        L37:
            hum r0 = r4.j     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r1 = r0.a     // Catch: java.lang.Throwable -> L50
            int r0 = r0.b     // Catch: java.lang.Throwable -> L50
            r2 = 0
        L3e:
            if (r2 >= r0) goto L4a
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L50
            itl r3 = (defpackage.itl) r3     // Catch: java.lang.Throwable -> L50
            r3.v(r5, r6)     // Catch: java.lang.Throwable -> L50
            int r2 = r2 + 1
            goto L3e
        L4a:
            hum r5 = r4.j
            r5.g()
            return
        L50:
            r5 = move-exception
            hum r6 = r4.j
            r6.g()
            throw r5
        L57:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ito.t(irs, iru):void");
    }

    @Override // defpackage.jfv
    public final /* synthetic */ long a() {
        return jge.a;
    }

    @Override // defpackage.isn
    public final jou b() {
        return jbg.d(this).t;
    }

    @Override // defpackage.icr
    public final void dM() {
        r();
    }

    @Override // defpackage.jfv
    public final void dV() {
        irs irsVar = this.k;
        if (irsVar == null) {
            return;
        }
        List list = irsVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((ise) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ise iseVar = (ise) list.get(i2);
                    long j = iseVar.a;
                    long j2 = iseVar.c;
                    long j3 = iseVar.b;
                    float f = iseVar.e;
                    boolean z = iseVar.d;
                    arrayList.add(new ise(j, j3, j2, false, f, j3, j2, z, z, iseVar.i, 0L));
                }
                irs irsVar2 = new irs(arrayList);
                this.e = irsVar2;
                t(irsVar2, iru.a);
                t(irsVar2, iru.b);
                t(irsVar2, iru.c);
                this.k = null;
                return;
            }
        }
    }

    @Override // defpackage.jfv
    public final void dW(irs irsVar, iru iruVar, long j) {
        this.h = j;
        if (iruVar == iru.a) {
            this.e = irsVar;
        }
        if (this.i == null) {
            this.i = fdil.d(E(), null, fdjz.d, new itn(this, null), 1);
        }
        t(irsVar, iruVar);
        List list = irsVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                irsVar = null;
                break;
            } else if (!irt.f((ise) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.k = irsVar;
    }

    @Override // defpackage.jfv
    public final void eb() {
        r();
    }

    @Override // defpackage.kio
    public final float ed() {
        return jbg.d(this).r.ed();
    }

    @Override // defpackage.kiy
    public final float ee() {
        return jbg.d(this).r.ee();
    }

    @Override // defpackage.kiy
    public final /* synthetic */ float eg(long j) {
        return kix.a(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float eh(float f) {
        return kin.a(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float el(int i) {
        return kin.b(this, i);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float em(long j) {
        return kin.c(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float en(float f) {
        return kin.d(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ int eo(long j) {
        return kin.e(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ int ep(float f) {
        return kin.f(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long eq(long j) {
        return kin.g(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long er(long j) {
        return kin.h(this, j);
    }

    @Override // defpackage.kiy
    public final /* synthetic */ long es(float f) {
        return kix.b(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long et(float f) {
        return kin.i(this, f);
    }

    @Override // defpackage.isn
    public final Object q(fdat fdatVar, fcxy fcxyVar) {
        fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar.B();
        itl itlVar = new itl(this, fdiuVar);
        synchronized (this.g) {
            this.f.n(itlVar);
            new fcyk(fcym.c(fcym.b(fdatVar, itlVar, itlVar)), fcyl.a).w(fctx.a);
        }
        fdiuVar.d(new itm(itlVar));
        return fdiuVar.m();
    }

    @Override // defpackage.ith
    public final void r() {
        fdlr fdlrVar = this.i;
        if (fdlrVar != null) {
            fdlrVar.t(new ism());
            this.i = null;
        }
    }

    @Override // defpackage.icr
    public final void s() {
        r();
    }

    @Override // defpackage.jfv
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.jfv
    public final /* synthetic */ void A() {
    }
}
