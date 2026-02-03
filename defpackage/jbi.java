package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jbi extends icr {
    public final int D = jet.b(this);
    public icr E;

    private final void dO(int i, boolean z) {
        icr icrVar;
        int i2 = this.t;
        this.t = i;
        if (i2 != i) {
            if (D() == this) {
                this.u = i;
            }
            if (this.C) {
                icr icrVar2 = this.s;
                icr icrVar3 = this;
                while (icrVar3 != null) {
                    i |= icrVar3.t;
                    icrVar3.t = i;
                    if (icrVar3 == icrVar2) {
                        break;
                    } else {
                        icrVar3 = icrVar3.v;
                    }
                }
                if (z && icrVar3 == icrVar2) {
                    i = jet.c(icrVar2);
                    icrVar2.t = i;
                }
                int i3 = 0;
                if (icrVar3 != null && (icrVar = icrVar3.w) != null) {
                    i3 = icrVar.u;
                }
                int i4 = i | i3;
                while (icrVar3 != null) {
                    i4 |= icrVar3.t;
                    icrVar3.u = i4;
                    icrVar3 = icrVar3.v;
                }
            }
        }
    }

    @Override // defpackage.icr
    public final void F() {
        super.F();
        for (icr icrVar = this.E; icrVar != null; icrVar = icrVar.w) {
            icrVar.L(this.y);
            if (!icrVar.C) {
                icrVar.F();
            }
        }
    }

    @Override // defpackage.icr
    public final void G() {
        for (icr icrVar = this.E; icrVar != null; icrVar = icrVar.w) {
            icrVar.G();
        }
        super.G();
    }

    @Override // defpackage.icr
    public final void H() {
        super.H();
        for (icr icrVar = this.E; icrVar != null; icrVar = icrVar.w) {
            icrVar.H();
        }
    }

    @Override // defpackage.icr
    public final void I() {
        for (icr icrVar = this.E; icrVar != null; icrVar = icrVar.w) {
            icrVar.I();
        }
        super.I();
    }

    @Override // defpackage.icr
    public final void J() {
        super.J();
        for (icr icrVar = this.E; icrVar != null; icrVar = icrVar.w) {
            icrVar.J();
        }
    }

    @Override // defpackage.icr
    public final void K(icr icrVar) {
        this.s = icrVar;
        for (icr icrVar2 = this.E; icrVar2 != null; icrVar2 = icrVar2.w) {
            icrVar2.K(icrVar);
        }
    }

    @Override // defpackage.icr
    public final void L(jer jerVar) {
        this.y = jerVar;
        for (icr icrVar = this.E; icrVar != null; icrVar = icrVar.w) {
            icrVar.L(jerVar);
        }
    }

    public final void M(jbf jbfVar) {
        icr icrVar = null;
        for (icr icrVar2 = this.E; icrVar2 != null; icrVar2 = icrVar2.w) {
            if (icrVar2 == jbfVar) {
                if (icrVar2.C) {
                    jet.f(icrVar2);
                    icrVar2.J();
                    icrVar2.G();
                }
                icrVar2.K(icrVar2);
                icrVar2.u = 0;
                if (icrVar == null) {
                    this.E = icrVar2.w;
                } else {
                    icrVar.w = icrVar2.w;
                }
                icrVar2.w = null;
                icrVar2.v = null;
                int i = this.t;
                int iC = jet.c(this);
                dO(iC, true);
                if (this.C && (i & 2) != 0 && (iC & 2) == 0) {
                    jee jeeVar = jbg.d(this).v;
                    this.s.L(null);
                    jeeVar.i();
                    return;
                }
                return;
            }
            icrVar = icrVar2;
        }
        Objects.toString(jbfVar);
        throw new IllegalStateException("Could not find delegate: ".concat(String.valueOf(jbfVar)));
    }

    public final void N(jbf jbfVar) {
        icr icrVarD = jbfVar.D();
        if (icrVarD != jbfVar) {
            if (true != (jbfVar instanceof icr)) {
                jbfVar = null;
            }
            icr icrVar = jbfVar != null ? ((icr) jbfVar).v : null;
            if (icrVarD != this.s || !fdbq.f(icrVar, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (icrVarD.C) {
            itw.d("Cannot delegate to an already attached node");
        }
        icrVarD.K(this.s);
        int i = this.t;
        int iC = jet.c(icrVarD);
        icrVarD.t = iC;
        int i2 = iC & 2;
        int i3 = this.t;
        if (i2 != 0 && (i3 & 2) != 0 && !(this instanceof jcd)) {
            itw.d(a.i(icrVarD, this, "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ", "\nDelegate Node: "));
        }
        icrVarD.w = this.E;
        this.E = icrVarD;
        icrVarD.v = this;
        dO(iC | this.t, false);
        if (this.C) {
            if (i2 == 0 || (i & 2) != 0) {
                L(this.y);
            } else {
                jee jeeVar = jbg.d(this).v;
                this.s.L(null);
                jeeVar.i();
            }
            icrVarD.F();
            icrVarD.I();
            jet.d(icrVarD);
        }
    }
}
