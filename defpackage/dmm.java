package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmm extends jbi implements jfy, jbr, jbd, jew, jgg {
    private static final dmh f = new dmh();
    public final fdap a;
    public ebc b;
    public final igz c;
    public ebk d;
    public epa e;
    private ivy g;

    public dmm(ebk ebkVar, int i, fdap fdapVar) {
        this.d = ebkVar;
        this.a = fdapVar;
        FocusTargetNode focusTargetNode = new FocusTargetNode(i, new dmk(this), 4);
        N(focusTargetNode);
        this.c = focusTargetNode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [icr] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [icr] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [hum] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [hum] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final dmo a() {
        jgg jggVar;
        jee jeeVar;
        if (this.C) {
            dmn dmnVar = dmo.a;
            if (!this.s.C) {
                itw.d("visitAncestors called on an unattached node");
            }
            icr icrVar = this.s.v;
            jcr jcrVarD = jbg.d(this);
            loop0: while (true) {
                if (jcrVarD == null) {
                    jggVar = null;
                    break;
                }
                if ((jcrVarD.v.f.u & 262144) != 0) {
                    while (icrVar != null) {
                        if ((icrVar.t & 262144) != 0) {
                            ?? humVar = 0;
                            jbi jbiVarA = icrVar;
                            while (jbiVarA != 0) {
                                if (jbiVarA instanceof jgg) {
                                    jggVar = (jgg) jbiVarA;
                                    if (fdbq.f(dmnVar, jggVar.dZ())) {
                                        break loop0;
                                    }
                                } else if ((jbiVarA.t & 262144) != 0 && (jbiVarA instanceof jbi)) {
                                    icr icrVar2 = jbiVarA.E;
                                    int i = 0;
                                    jbiVarA = jbiVarA;
                                    humVar = humVar;
                                    while (icrVar2 != null) {
                                        if ((icrVar2.t & 262144) != 0) {
                                            i++;
                                            humVar = humVar;
                                            if (i == 1) {
                                                jbiVarA = icrVar2;
                                            } else {
                                                if (humVar == 0) {
                                                    humVar = new hum(new icr[16]);
                                                }
                                                if (jbiVarA != 0) {
                                                    humVar.n(jbiVarA);
                                                }
                                                humVar.n(icrVar2);
                                                jbiVarA = 0;
                                            }
                                        }
                                        icrVar2 = icrVar2.w;
                                        jbiVarA = jbiVarA;
                                        humVar = humVar;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                jbiVarA = jbg.a(humVar);
                            }
                        }
                        icrVar = icrVar.v;
                    }
                }
                jcrVarD = jcrVarD.s();
                icrVar = (jcrVarD == null || (jeeVar = jcrVarD.v) == null) ? null : jeeVar.e;
            }
            if (jggVar instanceof dmo) {
                return (dmo) jggVar;
            }
        }
        return null;
    }

    public final void b() {
        dmo dmoVarA;
        ivy ivyVar = this.g;
        if (ivyVar == null || !ivyVar.u() || (dmoVarA = a()) == null) {
            return;
        }
        dmoVarA.a(this.g);
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
        boolean zB = ((FocusTargetNode) this.c).f().b();
        fdeh[] fdehVarArr = jtk.a;
        jtn jtnVar = jte.k;
        fdeh fdehVar = jtk.a[4];
        jtnVar.a(jtoVar, Boolean.valueOf(zB));
        jtoVar.e(jsa.v, new jrn(null, new dmi(this)));
    }

    @Override // defpackage.jbr
    public final void dR(ivy ivyVar) {
        this.g = ivyVar;
        if (((FocusTargetNode) this.c).f().b()) {
            if (ivyVar.u()) {
                b();
                return;
            }
            dmo dmoVarA = a();
            if (dmoVarA != null) {
                dmoVarA.a(null);
            }
        }
    }

    @Override // defpackage.icr
    public final void dT() {
        epa epaVar = this.e;
        if (epaVar != null) {
            epaVar.a();
        }
        this.e = null;
    }

    @Override // defpackage.jgg
    public final Object dZ() {
        return f;
    }

    public final epa g() {
        final fdci fdciVar = new fdci();
        jex.a(this, new fdae() { // from class: dmg
            @Override // defpackage.fdae
            public final Object invoke() {
                fdciVar.a = jbe.a(this, iyj.a);
                return fctx.a;
            }
        });
        return (epa) fdciVar.a;
    }

    public final void i(final ebk ebkVar, final ebj ebjVar) {
        if (!this.C) {
            ebkVar.b(ebjVar);
        } else {
            fdlr fdlrVar = (fdlr) ((fdxz) E()).a.get(fdlr.c);
            fdil.d(E(), null, null, new dmj(ebkVar, ebjVar, fdlrVar != null ? fdlrVar.hK(new fdap() { // from class: dmf
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ebkVar.b(ebjVar);
                    return fctx.a;
                }
            }) : null, null), 3);
        }
    }

    public final void j(ebk ebkVar) {
        ebc ebcVar;
        if (fdbq.f(this.d, ebkVar)) {
            return;
        }
        ebk ebkVar2 = this.d;
        if (ebkVar2 != null && (ebcVar = this.b) != null) {
            ebkVar2.b(new ebd(ebcVar));
        }
        this.b = null;
        this.d = ebkVar;
    }

    @Override // defpackage.jew
    public final void n() {
        epa epaVarG = g();
        if (((FocusTargetNode) this.c).f().b()) {
            epa epaVar = this.e;
            if (epaVar != null) {
                epaVar.a();
            }
            if (epaVarG != null) {
                epaVarG.c();
            } else {
                epaVarG = null;
            }
            this.e = epaVarG;
        }
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean u() {
        return false;
    }
}
