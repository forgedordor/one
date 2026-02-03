package defpackage;

import android.view.KeyEvent;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dkd extends jbi implements jfv, iql, jfy, jgg, jbd, jew {
    public static final djr a = new djr();
    private ebk F;
    public boolean b;
    public fdae c;
    public dnk d;
    public ith e;
    public ebm f;
    public ebh g;
    public final cun h;
    public ebk i;
    private dnk j;
    private boolean k;
    private String l;
    private jrw m;
    private final dmm n;
    private jbf o;
    private long p;
    private boolean q;
    private final Object r;

    public dkd(ebk ebkVar, dnk dnkVar, boolean z, boolean z2, String str, jrw jrwVar, fdae fdaeVar) {
        this.i = ebkVar;
        this.j = dnkVar;
        this.k = z;
        this.l = str;
        this.m = jrwVar;
        this.b = z2;
        this.c = fdaeVar;
        this.n = new dmm(this.i, 0, new dju(this));
        int i = ctv.a;
        this.h = new cun((byte[]) null);
        this.p = 0L;
        this.F = this.i;
        this.q = C();
        this.r = a;
    }

    private final boolean C() {
        return this.F == null;
    }

    protected abstract void B(KeyEvent keyEvent);

    @Override // defpackage.jfv
    public final /* synthetic */ long a() {
        return jge.a;
    }

    public abstract Object b(isn isnVar, fcxy fcxyVar);

    @Override // defpackage.icr
    public final /* synthetic */ void dM() {
        jfu.a(this);
    }

    @Override // defpackage.icr
    public final boolean dN() {
        return false;
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean dP() {
        return false;
    }

    @Override // defpackage.jfy
    public final void dQ(jto jtoVar) {
        jrw jrwVar = this.m;
        if (jrwVar != null) {
            jtk.q(jtoVar, jrwVar.a);
        }
        jtk.h(jtoVar, this.l, new fdae() { // from class: djq
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.c.invoke();
                return true;
            }
        });
        if (this.b) {
            this.n.dQ(jtoVar);
        } else {
            jtk.c(jtoVar);
        }
        g(jtoVar);
    }

    @Override // defpackage.icr
    public final void dU() {
        n();
        if (!this.q) {
            j();
        }
        if (this.b) {
            N(this.n);
        }
    }

    @Override // defpackage.jfv
    public final void dV() {
        ebh ebhVar;
        ebk ebkVar = this.i;
        if (ebkVar != null && (ebhVar = this.g) != null) {
            ebkVar.b(new ebi(ebhVar));
        }
        this.g = null;
        ith ithVar = this.e;
        if (ithVar != null) {
            ithVar.dV();
        }
    }

    @Override // defpackage.jfv
    public final void dW(irs irsVar, iru iruVar, long j) {
        long jB = kjh.b(j);
        this.p = (Float.floatToRawIntBits(kjb.b(jB)) & 4294967295L) | (Float.floatToRawIntBits(kjb.a(jB)) << 32);
        j();
        if (this.b && iruVar == iru.b) {
            int i = irsVar.e;
            if (irw.a(i, 4)) {
                fdil.d(E(), null, null, new dka(this, null), 3);
            } else if (irw.a(i, 5)) {
                fdil.d(E(), null, null, new dkb(this, null), 3);
            }
        }
        if (this.e == null) {
            dkc dkcVar = new dkc(this);
            irs irsVar2 = itf.a;
            ito itoVar = new ito(null, null, null, dkcVar);
            N(itoVar);
            this.e = itoVar;
        }
        ith ithVar = this.e;
        if (ithVar != null) {
            ithVar.dW(irsVar, iruVar, j);
        }
    }

    @Override // defpackage.jgg
    public final Object dZ() {
        return this.r;
    }

    @Override // defpackage.jfv
    public final /* synthetic */ void eb() {
        jfu.b(this);
    }

    protected final Object f(dwn dwnVar, long j, fcxy fcxyVar) {
        Object objA;
        ebk ebkVar = this.i;
        return (ebkVar == null || (objA = fdjy.a(new djw(dwnVar, j, ebkVar, this, null), fcxyVar)) != fcyl.a) ? fctx.a : objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r17 = this;
            r0 = r17
            ebk r1 = r0.i
            if (r1 == 0) goto L6a
            ebm r2 = r0.f
            if (r2 == 0) goto L12
            ebl r3 = new ebl
            r3.<init>(r2)
            r1.b(r3)
        L12:
            ebh r2 = r0.g
            if (r2 == 0) goto L1e
            ebi r3 = new ebi
            r3.<init>(r2)
            r1.b(r3)
        L1e:
            cun r2 = r0.h
            java.lang.Object[] r3 = r2.c
            long[] r2 = r2.a
            int r4 = r2.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L6a
            r5 = 0
            r6 = r5
        L2b:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L65
            int r9 = r6 - r4
            r10 = r5
        L3e:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L63
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.32E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L5f
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            ebm r11 = (defpackage.ebm) r11
            ebl r13 = new ebl
            r13.<init>(r11)
            r1.b(r13)
        L5f:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L3e
        L63:
            if (r11 != r12) goto L6a
        L65:
            if (r6 == r4) goto L6a
            int r6 = r6 + 1
            goto L2b
        L6a:
            r1 = 0
            r0.f = r1
            r0.g = r1
            cun r1 = r0.h
            r1.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkd.i():void");
    }

    public final void j() {
        if (this.o != null) {
            return;
        }
        dnk dnkVar = this.k ? this.d : this.j;
        if (dnkVar != null) {
            if (this.i == null) {
                this.i = new ebk();
            }
            this.n.j(this.i);
            ebk ebkVar = this.i;
            ebkVar.getClass();
            jbf jbfVarA = dnkVar.a(ebkVar);
            N(jbfVarA);
            this.o = jbfVarA;
        }
    }

    @Override // defpackage.jew
    public final void n() {
        if (this.k) {
            jex.a(this, new fdae() { // from class: djp
                @Override // defpackage.fdae
                public final Object invoke() {
                    dkd dkdVar = this.a;
                    dne dneVar = (dne) jbe.a(dkdVar, dnh.a);
                    if (!(dneVar instanceof dnk)) {
                        Objects.toString(dneVar);
                        ebs.c("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. You can also use ComposeFoundationFlags.isNonComposedClickableEnabled to temporarily opt-out; note that this flag will be removed in a future release and is only intended to be a temporary migration aid. The Indication instance provided here was: ".concat(String.valueOf(dneVar)));
                    }
                    dnk dnkVar = dkdVar.d;
                    dkdVar.d = (dnk) dneVar;
                    if (dnkVar != null && !fdbq.f(dkdVar.d, dnkVar)) {
                        dkdVar.q();
                    }
                    return fctx.a;
                }
            });
        }
    }

    public final void q() {
        jbf jbfVar = this.o;
        if (jbfVar == null && this.q) {
            return;
        }
        if (jbfVar != null) {
            M(jbfVar);
        }
        this.o = null;
        j();
    }

    @Override // defpackage.icr
    public final void s() {
        i();
        if (this.F == null) {
            this.i = null;
        }
        jbf jbfVar = this.o;
        if (jbfVar != null) {
            M(jbfVar);
        }
        this.o = null;
    }

    @Override // defpackage.jfy
    public final boolean u() {
        return true;
    }

    protected abstract boolean v(KeyEvent keyEvent);

    @Override // defpackage.iql
    public final boolean w(KeyEvent keyEvent) {
        boolean z;
        j();
        long jB = iqj.b(keyEvent);
        if (this.b && iqi.a(iqj.a(keyEvent), 2) && dli.a(keyEvent)) {
            cun cunVar = this.h;
            if (cunVar.b(jB)) {
                z = false;
            } else {
                ebm ebmVar = new ebm(this.p);
                cunVar.f(jB, ebmVar);
                if (this.i != null) {
                    fdil.d(E(), null, null, new djy(this, ebmVar, null), 3);
                }
                z = true;
            }
            return v(keyEvent) || z;
        }
        if (!this.b || !iqi.a(iqj.a(keyEvent), 1) || !dli.a(keyEvent)) {
            return false;
        }
        ebm ebmVar2 = (ebm) this.h.d(jB);
        if (ebmVar2 != null) {
            if (this.i != null) {
                fdil.d(E(), null, null, new djz(this, ebmVar2, null), 3);
            }
            B(keyEvent);
        }
        return ebmVar2 != null;
    }

    @Override // defpackage.iql
    public final boolean x(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.jfv
    public final /* synthetic */ boolean y() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(defpackage.ebk r3, defpackage.dnk r4, boolean r5, boolean r6, java.lang.String r7, defpackage.jrw r8, defpackage.fdae r9) {
        /*
            r2 = this;
            ebk r0 = r2.F
            boolean r0 = defpackage.fdbq.f(r0, r3)
            r1 = 1
            if (r0 != 0) goto L12
            r2.i()
            r2.F = r3
            r2.i = r3
            r3 = r1
            goto L13
        L12:
            r3 = 0
        L13:
            dnk r0 = r2.j
            boolean r0 = defpackage.fdbq.f(r0, r4)
            if (r0 != 0) goto L1e
            r2.j = r4
            r3 = r1
        L1e:
            boolean r4 = r2.k
            if (r4 == r5) goto L2a
            r2.k = r5
            if (r5 == 0) goto L2b
            r2.n()
            goto L2b
        L2a:
            r1 = r3
        L2b:
            boolean r3 = r2.b
            if (r3 == r6) goto L44
            if (r6 == 0) goto L37
            dmm r3 = r2.n
            r2.N(r3)
            goto L3f
        L37:
            dmm r3 = r2.n
            r2.M(r3)
            r2.i()
        L3f:
            defpackage.jfz.a(r2)
            r2.b = r6
        L44:
            java.lang.String r3 = r2.l
            boolean r3 = defpackage.fdbq.f(r3, r7)
            if (r3 != 0) goto L51
            r2.l = r7
            defpackage.jfz.a(r2)
        L51:
            jrw r3 = r2.m
            boolean r3 = defpackage.fdbq.f(r3, r8)
            if (r3 != 0) goto L5e
            r2.m = r8
            defpackage.jfz.a(r2)
        L5e:
            r2.c = r9
            boolean r3 = r2.q
            boolean r4 = r2.C()
            if (r3 == r4) goto L75
            boolean r3 = r2.C()
            r2.q = r3
            if (r3 != 0) goto L75
            jbf r3 = r2.o
            if (r3 != 0) goto L75
            goto L77
        L75:
            if (r1 == 0) goto L7a
        L77:
            r2.q()
        L7a:
            dmm r3 = r2.n
            ebk r4 = r2.i
            r3.j(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkd.z(ebk, dnk, boolean, boolean, java.lang.String, jrw, fdae):void");
    }

    @Override // defpackage.jfv
    public final /* synthetic */ void A() {
    }

    protected void k() {
    }

    public void g(jto jtoVar) {
    }
}
