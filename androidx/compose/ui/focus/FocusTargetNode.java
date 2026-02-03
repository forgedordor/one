package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.fctg;
import defpackage.fdat;
import defpackage.fdbq;
import defpackage.fdci;
import defpackage.hum;
import defpackage.icr;
import defpackage.ift;
import defpackage.ige;
import defpackage.igl;
import defpackage.igo;
import defpackage.igp;
import defpackage.igx;
import defpackage.igz;
import defpackage.iha;
import defpackage.ihe;
import defpackage.ihg;
import defpackage.iqd;
import defpackage.iqe;
import defpackage.itw;
import defpackage.iuo;
import defpackage.iuq;
import defpackage.izv;
import defpackage.izw;
import defpackage.jaa;
import defpackage.jab;
import defpackage.jac;
import defpackage.jbd;
import defpackage.jbe;
import defpackage.jbg;
import defpackage.jbi;
import defpackage.jcr;
import defpackage.jdy;
import defpackage.jee;
import defpackage.jew;
import defpackage.jex;
import defpackage.jmh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusTargetNode extends icr implements jbd, igz, jew, jac {
    public boolean a;
    public boolean b;
    private final fdat c;
    private final int d;

    /* compiled from: PG */
    public static final class FocusTargetElement extends jdy<FocusTargetNode> {
        public static final FocusTargetElement a = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // defpackage.jdy
        public final /* synthetic */ icr d() {
            return new FocusTargetNode(0, null, 7);
        }

        @Override // defpackage.jdy
        public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return 1739042953;
        }
    }

    public /* synthetic */ FocusTargetNode(int i, fdat fdatVar, int i2) {
        this.c = (i2 & 2) != 0 ? null : fdatVar;
        this.d = 1 == (i2 & 1) ? 1 : i;
    }

    @Override // defpackage.igz
    public final boolean a(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zA = false;
            if (((igo) e()).a) {
                int iD = ihe.d(this, i);
                int i2 = iD - 1;
                if (iD == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    zA = ihe.a(this);
                } else if (i2 != 1) {
                    if (i2 != 2) {
                        throw new fctg();
                    }
                    zA = true;
                }
            }
            return zA;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.icr
    public final boolean dN() {
        return false;
    }

    @Override // defpackage.icr
    public final void dT() {
        if (f().b()) {
            ((AndroidComposeView) jbg.f(this)).i.g(true, true, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [icr] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [icr] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [hum] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [hum] */
    public final igl e() {
        boolean z;
        jee jeeVar;
        igo igoVar = new igo();
        int i = this.d;
        if (ihg.a(i, 1)) {
            z = true;
        } else if (ihg.a(i, 0)) {
            z = !iqd.a(((iqd) ((iqe) jbe.a(this, jmh.i)).a.a()).a, 1);
        } else {
            if (!ihg.a(i, 2)) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z = false;
        }
        igoVar.a = z;
        icr icrVar = this.s;
        if (!icrVar.C) {
            itw.d("visitAncestors called on an unattached node");
        }
        icr icrVar2 = this.s;
        jcr jcrVarD = jbg.d(this);
        loop0: while (jcrVarD != null) {
            if ((jcrVarD.v.f.u & 3072) != 0) {
                while (icrVar2 != null) {
                    int i2 = icrVar2.t;
                    if ((i2 & 3072) != 0) {
                        if (icrVar2 != icrVar && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            jbi jbiVarA = icrVar2;
                            ?? humVar = 0;
                            while (jbiVarA != 0) {
                                if (jbiVarA instanceof igp) {
                                    ((igp) jbiVarA).v(igoVar);
                                } else if ((jbiVarA.t & 2048) != 0 && (jbiVarA instanceof jbi)) {
                                    icr icrVar3 = jbiVarA.E;
                                    int i3 = 0;
                                    jbiVarA = jbiVarA;
                                    humVar = humVar;
                                    while (icrVar3 != null) {
                                        if ((icrVar3.t & 2048) != 0) {
                                            i3++;
                                            humVar = humVar;
                                            if (i3 == 1) {
                                                jbiVarA = icrVar3;
                                            } else {
                                                if (humVar == 0) {
                                                    humVar = new hum(new icr[16]);
                                                }
                                                if (jbiVarA != 0) {
                                                    humVar.n(jbiVarA);
                                                }
                                                humVar.n(icrVar3);
                                                jbiVarA = 0;
                                            }
                                        }
                                        icrVar3 = icrVar3.w;
                                        jbiVarA = jbiVarA;
                                        humVar = humVar;
                                    }
                                    if (i3 != 1) {
                                    }
                                }
                                jbiVarA = jbg.a(humVar);
                            }
                        }
                    }
                    icrVar2 = icrVar2.v;
                }
            }
            jcrVarD = jcrVarD.s();
            icrVar2 = (jcrVarD == null || (jeeVar = jcrVarD.v) == null) ? null : jeeVar.e;
        }
        return igoVar;
    }

    public final igx f() {
        FocusTargetNode focusTargetNode;
        jee jeeVar;
        if (!this.C || (focusTargetNode = ((FocusOwnerImpl) ((AndroidComposeView) jbg.f(this)).i).h) == null) {
            return igx.d;
        }
        if (this == focusTargetNode) {
            return igx.a;
        }
        if (focusTargetNode.C) {
            if (!focusTargetNode.s.C) {
                itw.d("visitAncestors called on an unattached node");
            }
            icr icrVar = focusTargetNode.s.v;
            jcr jcrVarD = jbg.d(focusTargetNode);
            while (jcrVarD != null) {
                if ((jcrVarD.v.f.u & 1024) != 0) {
                    while (icrVar != null) {
                        if ((icrVar.t & 1024) != 0) {
                            icr icrVarA = icrVar;
                            hum humVar = null;
                            while (icrVarA != null) {
                                if (icrVarA instanceof FocusTargetNode) {
                                    if (this == ((FocusTargetNode) icrVarA)) {
                                        return igx.b;
                                    }
                                } else if ((icrVarA.t & 1024) != 0 && (icrVarA instanceof jbi)) {
                                    int i = 0;
                                    for (icr icrVar2 = ((jbi) icrVarA).E; icrVar2 != null; icrVar2 = icrVar2.w) {
                                        if ((icrVar2.t & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                icrVarA = icrVar2;
                                            } else {
                                                if (humVar == null) {
                                                    humVar = new hum(new icr[16]);
                                                }
                                                if (icrVarA != null) {
                                                    humVar.n(icrVarA);
                                                }
                                                humVar.n(icrVar2);
                                                icrVarA = null;
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                icrVarA = jbg.a(humVar);
                            }
                        }
                        icrVar = icrVar.v;
                    }
                }
                jcrVarD = jcrVarD.s();
                icrVar = (jcrVarD == null || (jeeVar = jcrVarD.v) == null) ? null : jeeVar.e;
            }
        }
        return igx.d;
    }

    public final iuo g() {
        return (iuo) jab.a(this, iuq.a);
    }

    public final void h() {
        igl iglVar;
        int iOrdinal = f().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new fctg();
                }
                return;
            }
        }
        fdci fdciVar = new fdci();
        jex.a(this, new iha(fdciVar, this));
        Object obj = fdciVar.a;
        if (obj == null) {
            fdbq.c("focusProperties");
            iglVar = null;
        } else {
            iglVar = (igl) obj;
        }
        if (iglVar.d()) {
            return;
        }
        ((AndroidComposeView) jbg.f(this)).i.a(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [icr] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [icr] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [hum] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [hum] */
    public final void i(igx igxVar, igx igxVar2) {
        jee jeeVar;
        fdat fdatVar;
        FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) ((AndroidComposeView) jbg.f(this)).i;
        FocusTargetNode focusTargetNode = focusOwnerImpl.h;
        if (!fdbq.f(igxVar, igxVar2) && (fdatVar = this.c) != null) {
            fdatVar.a(igxVar, igxVar2);
        }
        icr icrVar = this.s;
        if (!icrVar.C) {
            itw.d("visitAncestors called on an unattached node");
        }
        icr icrVar2 = this.s;
        jcr jcrVarD = jbg.d(this);
        while (jcrVarD != null) {
            if ((jcrVarD.v.f.u & 5120) != 0) {
                while (icrVar2 != null) {
                    int i = icrVar2.t;
                    if ((i & 5120) != 0) {
                        if (icrVar2 != icrVar && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            jbi jbiVarA = icrVar2;
                            ?? humVar = 0;
                            while (jbiVarA != 0) {
                                if (jbiVarA instanceof ift) {
                                    ift iftVar = (ift) jbiVarA;
                                    if (focusTargetNode == focusOwnerImpl.h) {
                                        iftVar.n(igxVar2);
                                    }
                                } else if ((jbiVarA.t & 4096) != 0 && (jbiVarA instanceof jbi)) {
                                    icr icrVar3 = jbiVarA.E;
                                    int i2 = 0;
                                    jbiVarA = jbiVarA;
                                    humVar = humVar;
                                    while (icrVar3 != null) {
                                        if ((icrVar3.t & 4096) != 0) {
                                            i2++;
                                            humVar = humVar;
                                            if (i2 == 1) {
                                                jbiVarA = icrVar3;
                                            } else {
                                                if (humVar == 0) {
                                                    humVar = new hum(new icr[16]);
                                                }
                                                if (jbiVarA != 0) {
                                                    humVar.n(jbiVarA);
                                                }
                                                humVar.n(icrVar3);
                                                jbiVarA = 0;
                                            }
                                        }
                                        icrVar3 = icrVar3.w;
                                        jbiVarA = jbiVarA;
                                        humVar = humVar;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                jbiVarA = jbg.a(humVar);
                            }
                        }
                    }
                    icrVar2 = icrVar2.v;
                }
            }
            jcrVarD = jcrVarD.s();
            icrVar2 = (jcrVarD == null || (jeeVar = jcrVarD.v) == null) ? null : jeeVar.e;
        }
    }

    @Override // defpackage.jew
    public final void n() {
        h();
    }

    @Override // defpackage.jac
    public final /* synthetic */ jaa p() {
        return izv.a;
    }

    @Override // defpackage.jaf
    public final /* synthetic */ Object q(izw izwVar) {
        return jab.a(this, izwVar);
    }

    @Override // defpackage.icr
    public final void s() {
        int iOrdinal = f().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new fctg();
                }
                return;
            }
        }
        ige igeVar = ((AndroidComposeView) jbg.f(this)).i;
        igeVar.g(true, false, 8);
        ((FocusOwnerImpl) igeVar).d.b();
    }

    @Override // defpackage.icr
    public final void dU() {
    }
}
