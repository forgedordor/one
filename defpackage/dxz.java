package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxz extends duu implements iql, jfy, jbd, dwl {
    public final iqt a;
    public final dyk b;
    public final dss c;
    private dop d;
    private dvj l;
    private final dxa m;
    private final dsz n;
    private final dxm o;
    private fdat p;
    private fdat q;
    private dwj r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [dvj] */
    /* JADX WARN: Type inference failed for: r9v0, types: [dwl, dxz, jbi] */
    public dxz(dyb dybVar, dop dopVar, dvj dvjVar, dwm dwmVar, boolean z, boolean z2, ebk ebkVar, dsj dsjVar) {
        super(dxk.a, z, ebkVar, dwmVar);
        this.d = dopVar;
        this.l = dvjVar;
        iqt iqtVar = new iqt();
        this.a = iqtVar;
        dxa dxaVar = new dxa(z);
        N(dxaVar);
        this.m = dxaVar;
        dsz dszVar = new dsz(ddg.a(dxk.d));
        this.n = dszVar;
        dop dopVar2 = this.d;
        ?? r1 = this.l;
        dyk dykVar = new dyk(dybVar, dopVar2, r1 == 0 ? dszVar : r1, dwmVar, z2, iqtVar, this, new fdae() { // from class: dxn
            @Override // defpackage.fdae
            public final Object invoke() {
                return Boolean.valueOf(this.a.C);
            }
        });
        this.b = dykVar;
        dxm dxmVar = new dxm(dykVar, z);
        this.o = dxmVar;
        dss dssVar = new dss(dwmVar, dykVar, z2, dsjVar);
        N(dssVar);
        this.c = dssVar;
        N(new iqy(dxmVar, iqtVar));
        N(new FocusTargetNode(2, null, 4));
        N(new euo(dssVar));
        N(new dmo(new fdap() { // from class: dxo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ihu ihuVarF;
                dss dssVar2 = this.a.c;
                dssVar2.f = (ivy) obj;
                if (dssVar2.h && (ihuVarF = dssVar2.f()) != null && !dssVar2.j(ihuVarF, dssVar2.i)) {
                    dssVar2.g = true;
                    dssVar2.g();
                }
                dssVar2.h = false;
                return fctx.a;
            }
        }));
    }

    private final void j() {
        if (this.C) {
            kio kioVarG = jbg.g(this);
            this.n.b = ddg.a(kioVarG);
        }
    }

    @Override // defpackage.duu, defpackage.icr
    public final void dM() {
        dV();
        j();
        dwj dwjVar = this.r;
        if (dwjVar != null) {
            dwjVar.b = jbg.g(this);
        }
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
        if (this.g && (this.p == null || this.q == null)) {
            this.p = new fdat() { // from class: dxp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    float fFloatValue = ((Float) obj).floatValue();
                    float fFloatValue2 = ((Float) obj2).floatValue();
                    dxz dxzVar = this.a;
                    fdil.d(dxzVar.E(), null, null, new dxx(dxzVar, fFloatValue, fFloatValue2, null), 3);
                    return true;
                }
            };
            this.q = new dxy(this, null);
        }
        fdat fdatVar = this.p;
        if (fdatVar != null) {
            fdeh[] fdehVarArr = jtk.a;
            jtoVar.e(jsa.d, new jrn(null, fdatVar));
        }
        fdat fdatVar2 = this.q;
        if (fdatVar2 != null) {
            fdeh[] fdehVarArr2 = jtk.a;
            jtoVar.e(jsa.e, fdatVar2);
        }
    }

    @Override // defpackage.icr
    public final void dU() {
        j();
        dwj dwjVar = this.r;
        if (dwjVar != null) {
            dwjVar.b = jbg.g(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x014a  */
    @Override // defpackage.duu, defpackage.jfv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dW(defpackage.irs r10, defpackage.iru r11, long r12) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxz.dW(irs, iru, long):void");
    }

    @Override // defpackage.duu
    public final Object e(fdat fdatVar, fcxy fcxyVar) {
        dyk dykVar = this.b;
        Object objI = dykVar.i(dod.b, new dxr(fdatVar, dykVar, null), fcxyVar);
        return objI == fcyl.a ? objI : fctx.a;
    }

    public final void g(dyb dybVar, dwm dwmVar, dop dopVar, boolean z, boolean z2, dvj dvjVar, ebk ebkVar, dsj dsjVar) {
        boolean z3;
        boolean z4 = false;
        boolean z5 = true;
        if (this.g != z) {
            this.o.a = z;
            this.m.b = z;
            z3 = true;
        } else {
            z3 = false;
        }
        dvj dvjVar2 = dvjVar == null ? this.n : dvjVar;
        dyk dykVar = this.b;
        iqt iqtVar = this.a;
        if (!fdbq.f(dykVar.a, dybVar)) {
            dykVar.a = dybVar;
            z4 = true;
        }
        dykVar.b = dopVar;
        if (dykVar.d != dwmVar) {
            dykVar.d = dwmVar;
            z4 = true;
        }
        if (dykVar.e != z2) {
            dykVar.e = z2;
        } else {
            z5 = z4;
        }
        dykVar.c = dvjVar2;
        dykVar.f = iqtVar;
        dss dssVar = this.c;
        dssVar.a = dwmVar;
        dssVar.c = z2;
        dssVar.d = dsjVar;
        this.d = dopVar;
        this.l = dvjVar;
        C(dxk.a, z, ebkVar, dykVar.k() ? dwm.a : dwm.b, z5);
        if (z3) {
            this.p = null;
            this.q = null;
            jfz.a(this);
        }
    }

    @Override // defpackage.duu
    public final void i(long j) {
        fdil.d(this.a.f(), null, null, new dxt(this, j, null), 3);
    }

    @Override // defpackage.duu
    public final boolean n() {
        dyk dykVar = this.b;
        if (dykVar.a.i()) {
            return true;
        }
        dop dopVar = dykVar.b;
        return dopVar != null && dopVar.g();
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.iql
    public final boolean w(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.g || ((!iqg.a(iqj.b(keyEvent), iqg.s) && !iqg.a(iqj.b(keyEvent), iqg.r)) || !iqi.a(iqj.a(keyEvent), 2) || keyEvent.isCtrlPressed())) {
            return false;
        }
        if (this.b.k()) {
            float f = (int) (this.c.i & 4294967295L);
            if (!iqg.a(iqj.b(keyEvent), iqg.r)) {
                f = -f;
            }
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f);
        } else {
            float f2 = (int) (this.c.i >> 32);
            if (!iqg.a(iqj.b(keyEvent), iqg.r)) {
                f2 = -f2;
            }
            jFloatToRawIntBits = Float.floatToRawIntBits(f2);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        }
        fdil.d(E(), null, null, new dxv(this, (iFloatToRawIntBits & 4294967295L) | (jFloatToRawIntBits << 32), null), 3);
        return true;
    }

    @Override // defpackage.iql
    public final boolean x(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.duu
    public final void h(long j) {
    }
}
