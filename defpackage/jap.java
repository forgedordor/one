package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jap extends icr implements jcd, jbp, jfy, jfv, jac, jaf, jfs, jcb, jbr, ift, igp, igu, jfi, ier {
    public icq a;
    public boolean b;
    public final HashSet c;
    public ivy d;
    private izu e;

    public jap(icq icqVar) {
        this.t = jet.a(icqVar);
        this.a = icqVar;
        this.b = true;
        this.c = new HashSet();
    }

    @Override // defpackage.jfv
    public final void A() {
        icq icqVar = this.a;
        icqVar.getClass();
    }

    @Override // defpackage.jfi
    public final boolean B() {
        return this.C;
    }

    @Override // defpackage.jfv
    public final /* synthetic */ long a() {
        return jge.a;
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        icq icqVar = this.a;
        icqVar.getClass();
        return ((iwj) icqVar).i(ixpVar, ixkVar, j);
    }

    @Override // defpackage.ier
    public final long c() {
        return kjh.d(jbg.e(this, 128).c);
    }

    @Override // defpackage.icr
    public final void dM() {
        if (this.a instanceof iss) {
            dV();
        }
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean dP() {
        return false;
    }

    @Override // defpackage.jfy
    public final void dQ(jto jtoVar) {
        int i;
        char c;
        icq icqVar = this.a;
        icqVar.getClass();
        jsc jscVarF = ((jsg) icqVar).f();
        jtoVar.getClass();
        jsc jscVar = (jsc) jtoVar;
        if (jscVarF.b) {
            jscVar.b = true;
        }
        if (jscVarF.c) {
            jscVar.c = true;
        }
        cuz cuzVar = jscVarF.a;
        Object[] objArr = cuzVar.b;
        Object[] objArr2 = cuzVar.c;
        long[] jArr = cuzVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        jtn jtnVar = (jtn) obj;
                        cuz cuzVar2 = jscVar.a;
                        if (!cuzVar2.g(jtnVar)) {
                            cuzVar2.e(jtnVar, obj2);
                        } else if (obj2 instanceof jrn) {
                            Object objF = cuzVar2.f(jtnVar);
                            objF.getClass();
                            jrn jrnVar = (jrn) objF;
                            c = '\b';
                            String str = jrnVar.a;
                            if (str == null) {
                                str = ((jrn) obj2).a;
                            }
                            cuzVar2.e(jtnVar, new jrn(str, jrnVar.b));
                        }
                        c = '\b';
                    } else {
                        c = '\b';
                    }
                    j >>= c;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.jbr
    public final void dR(ivy ivyVar) {
        icq icqVar = this.a;
        icqVar.getClass();
        ((ixx) icqVar).e();
    }

    @Override // defpackage.icr
    public final void dU() {
        w(true);
    }

    @Override // defpackage.jfv
    public final void dV() {
        icq icqVar = this.a;
        icqVar.getClass();
        isr isrVar = (isr) ((iss) icqVar).c;
        if (isrVar.d == 2) {
            iss issVar = isrVar.c;
            long jUptimeMillis = SystemClock.uptimeMillis();
            isp ispVar = new isp(issVar);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            ispVar.invoke(motionEventObtain);
            motionEventObtain.recycle();
            isrVar.b();
        }
    }

    @Override // defpackage.jfv
    public final void dW(irs irsVar, iru iruVar, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        icq icqVar = this.a;
        icqVar.getClass();
        isl islVar = ((iss) icqVar).c;
        List list = irsVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ise iseVar = (ise) list.get(i);
            if (irt.d(iseVar) || irt.f(iseVar)) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((ise) list.get(i2)).c()) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        isr isrVar = (isr) islVar;
        iss issVar = isrVar.c;
        if (issVar.b) {
            z3 = true;
        } else {
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                if (i3 < size3) {
                    ise iseVar2 = (ise) list.get(i3);
                    if (irt.d(iseVar2) || irt.f(iseVar2)) {
                        break;
                    } else {
                        i3++;
                    }
                } else if (z2) {
                    break;
                } else {
                    z3 = false;
                }
            }
            z3 = true;
        }
        if (isrVar.d != 3) {
            if (iruVar == iru.a && z3) {
                isrVar.b = irsVar;
                isrVar.a(irsVar, !z || issVar.b);
            }
            if (iruVar == iru.b && z && fdbq.f(irsVar, isrVar.b) && issVar.b) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((ise) list.get(i4)).b();
                }
            }
            if (iruVar == iru.c && !z3 && !fdbq.f(irsVar, isrVar.b)) {
                isrVar.a(irsVar, true);
            }
        }
        if (iruVar == iru.c) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    isrVar.b();
                    break;
                } else if (!irt.f((ise) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (fdbq.f(irsVar, isrVar.b) && z) {
                int size6 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        break;
                    }
                    if (!((ise) list.get(i6)).c()) {
                        i6++;
                    } else if (!issVar.b) {
                        isrVar.c(irsVar);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((ise) list.get(i7)).b();
                }
            }
        }
    }

    @Override // defpackage.jcd
    public final int e(ivu ivuVar, ivt ivtVar, int i) {
        icq icqVar = this.a;
        icqVar.getClass();
        return ((iwj) icqVar).e(ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcb
    public final void ea(ivy ivyVar) {
        this.d = ivyVar;
        icq icqVar = this.a;
        if (icqVar instanceof iya) {
            ((iya) icqVar).d();
        }
    }

    @Override // defpackage.jfv
    public final /* synthetic */ void eb() {
        jfu.b(this);
    }

    @Override // defpackage.jfs
    public final Object ec(Object obj) {
        icq icqVar = this.a;
        icqVar.getClass();
        return ((iyh) icqVar).d();
    }

    @Override // defpackage.jcd
    public final int f(ivu ivuVar, ivt ivtVar, int i) {
        icq icqVar = this.a;
        icqVar.getClass();
        return ((iwj) icqVar).f(ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final int g(ivu ivuVar, ivt ivtVar, int i) {
        icq icqVar = this.a;
        icqVar.getClass();
        return ((iwj) icqVar).g(ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final int h(ivu ivuVar, ivt ivtVar, int i) {
        icq icqVar = this.a;
        icqVar.getClass();
        return ((iwj) icqVar).h(ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcb
    public final void i(long j) {
        icq icqVar = this.a;
        if (icqVar instanceof iyd) {
            ((iyd) icqVar).d();
        }
    }

    @Override // defpackage.ier
    public final kio j() {
        return jbg.d(this).r;
    }

    @Override // defpackage.ier
    public final kji k() {
        return jbg.d(this).s;
    }

    @Override // defpackage.ift
    public final void n(igx igxVar) {
        icq icqVar = this.a;
        if (!(icqVar instanceof ifr)) {
            itw.d("onFocusEvent called on wrong node");
        }
        ((ifr) icqVar).d();
    }

    @Override // defpackage.jac
    public final jaa p() {
        izu izuVar = this.e;
        return izuVar != null ? izuVar : izv.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [icr] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [icr] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [hum] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [hum] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.jaf
    public final Object q(izw izwVar) {
        jee jeeVar;
        this.c.add(izwVar);
        if (!this.s.C) {
            itw.d("visitAncestors called on an unattached node");
        }
        icr icrVar = this.s.v;
        jcr jcrVarD = jbg.d(this);
        while (jcrVarD != null) {
            if ((jcrVarD.v.f.u & 32) != 0) {
                while (icrVar != null) {
                    if ((icrVar.t & 32) != 0) {
                        jbi jbiVarA = icrVar;
                        ?? humVar = 0;
                        while (jbiVarA != 0) {
                            if (jbiVarA instanceof jac) {
                                jac jacVar = (jac) jbiVarA;
                                if (jacVar.p().c(izwVar)) {
                                    return jacVar.p().a(izwVar);
                                }
                            } else if ((jbiVarA.t & 32) != 0 && (jbiVarA instanceof jbi)) {
                                icr icrVar2 = jbiVarA.E;
                                int i = 0;
                                jbiVarA = jbiVarA;
                                humVar = humVar;
                                while (icrVar2 != null) {
                                    if ((icrVar2.t & 32) != 0) {
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
        return izwVar.a.invoke();
    }

    @Override // defpackage.jbp
    public final void r(imw imwVar) {
        icq icqVar = this.a;
        icqVar.getClass();
        ifa ifaVar = (ifa) icqVar;
        if (this.b && (icqVar instanceof iez)) {
            ((AndroidComposeView) jbg.f(this)).A.d(this, jat.b, new jan(icqVar));
            this.b = false;
        }
        ifaVar.d(imwVar);
    }

    @Override // defpackage.icr
    public final void s() {
        x();
    }

    @Override // defpackage.jbp
    public final void t() {
        this.b = true;
        jbq.a(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.igp
    public final void v(igl iglVar) {
        icq icqVar = this.a;
        if (!(icqVar instanceof igc)) {
            itw.d("applyFocusProperties called on wrong node");
        }
        ((igc) icqVar).d();
    }

    public final void w(boolean z) {
        if (!this.C) {
            itw.d("initializeModifier called on unattached node");
        }
        icq icqVar = this.a;
        if ((this.t & 32) != 0) {
            if (icqVar instanceof izx) {
                jbg.f(this).x(new jal(this));
            }
            if (icqVar instanceof jae) {
                jae jaeVar = (jae) icqVar;
                izu izuVar = this.e;
                if (izuVar == null || !izuVar.c(jaeVar.m())) {
                    this.e = new izu(jaeVar);
                    if (jat.a(this)) {
                        izz izzVar = ((AndroidComposeView) jbg.f(this)).M;
                        jag jagVarM = jaeVar.m();
                        izzVar.a.n(this);
                        izzVar.b.n(jagVarM);
                        izzVar.a();
                    }
                } else {
                    izuVar.a = jaeVar;
                    izz izzVar2 = ((AndroidComposeView) jbg.f(this)).M;
                    jag jagVarM2 = jaeVar.m();
                    izzVar2.a.n(this);
                    izzVar2.b.n(jagVarM2);
                    izzVar2.a();
                }
            }
        }
        if ((this.t & 4) != 0) {
            if (icqVar instanceof iez) {
                this.b = true;
            }
            if (!z) {
                jci.a(this);
            }
        }
        if ((this.t & 2) != 0) {
            if (jat.a(this)) {
                jer jerVar = this.y;
                jerVar.getClass();
                ((jcg) jerVar).H(this);
                jerVar.aq();
            }
            if (!z) {
                jci.a(this);
                jbg.d(this).Q();
            }
        }
        if (icqVar instanceof iyr) {
            ((iyr) icqVar).d(jbg.d(this));
        }
        if ((this.t & 128) != 0) {
            if ((icqVar instanceof iyd) && jat.a(this)) {
                jbg.d(this).Q();
            }
            if (icqVar instanceof iya) {
                this.d = null;
                if (jat.a(this)) {
                    jfh jfhVarF = jbg.f(this);
                    AndroidComposeView androidComposeView = (AndroidComposeView) jfhVarF;
                    androidComposeView.D.f.n(new jam(this));
                    androidComposeView.ab(null);
                }
            }
        }
        if ((this.t & 256) != 0 && (icqVar instanceof ixx) && jat.a(this)) {
            jbg.d(this).Q();
        }
        if (icqVar instanceof igs) {
            ((igs) icqVar).d().d.n(this);
        }
        int i = this.t;
        if ((i & 16) != 0 && (icqVar instanceof iss)) {
            ((iss) icqVar).c.a = this.y;
        }
        if ((i & 8) != 0) {
            jbg.f(this).w();
        }
    }

    public final void x() {
        if (!this.C) {
            itw.d("unInitializeModifier called on unattached node");
        }
        icq icqVar = this.a;
        if ((this.t & 32) != 0) {
            if (icqVar instanceof jae) {
                izz izzVar = ((AndroidComposeView) jbg.f(this)).M;
                jag jagVarM = ((jae) icqVar).m();
                izzVar.c.n(jbg.d(this));
                izzVar.d.n(jagVarM);
                izzVar.a();
            }
            if (icqVar instanceof izx) {
                ((izx) icqVar).d(jat.a);
            }
        }
        if ((this.t & 8) != 0) {
            jbg.f(this).w();
        }
        if (icqVar instanceof igs) {
            ((igs) icqVar).d().d.m(this);
        }
    }

    @Override // defpackage.jfv
    public final boolean y() {
        icq icqVar = this.a;
        icqVar.getClass();
        return true;
    }

    public final void z() {
        if (this.C) {
            this.c.clear();
            ((AndroidComposeView) jbg.f(this)).A.d(this, jat.c, new jao(this));
        }
    }
}
