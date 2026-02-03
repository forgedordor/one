package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bdr {
    private bni b;
    private bni c;
    private bni d;
    private biu e;
    public Set k;
    public bni l;
    public bms m;
    public Rect n;
    public ayy p;
    public final Set j = new HashSet();
    private final Object a = new Object();
    public int s = 2;
    public Matrix o = new Matrix();
    public bml q = bml.d();
    public bml r = bml.d();

    protected bdr(bni bniVar) {
        this.c = bniVar;
        this.l = bniVar;
    }

    protected final int A(biu biuVar) {
        return B(biuVar, false);
    }

    protected final int B(biu biuVar, boolean z) {
        int iC = biuVar.f().c(C());
        return (biuVar.H() || !z) ? iC : boy.b(-iC);
    }

    public final int C() {
        return ((bku) this.l).C(0);
    }

    public final Size D() {
        bms bmsVar = this.m;
        if (bmsVar != null) {
            return bmsVar.d();
        }
        return null;
    }

    public final bin E() {
        synchronized (this.a) {
            biu biuVar = this.e;
            if (biuVar == null) {
                return bin.m;
            }
            return biuVar.e();
        }
    }

    public final biu F() {
        biu biuVar;
        synchronized (this.a) {
            biuVar = this.e;
        }
        return biuVar;
    }

    public final bni G(bir birVar, bni bniVar, bni bniVar2) {
        bli bliVarA;
        if (bniVar2 != null) {
            bliVarA = bli.b(bniVar2);
            bliVarA.e(brm.m);
        } else {
            bliVarA = bli.a();
        }
        bni bniVar3 = this.c;
        bjo bjoVar = bku.F;
        if (bniVar3.t(bjoVar) || this.c.t(bku.J)) {
            bjo bjoVar2 = bku.N;
            if (bliVarA.t(bjoVar2)) {
                bliVarA.e(bjoVar2);
            }
        }
        bni bniVar4 = this.c;
        bjo bjoVar3 = bku.N;
        if (bniVar4.t(bjoVar3)) {
            bjo bjoVar4 = bku.L;
            if (bliVarA.t(bjoVar4) && ((bvc) this.c.m(bjoVar3)).b != null) {
                bliVarA.e(bjoVar4);
            }
        }
        Iterator it = this.c.s().iterator();
        while (it.hasNext()) {
            bjn.b(bliVarA, bliVarA, this.c, (bjo) it.next());
        }
        if (bniVar != null) {
            for (bjo bjoVar5 : bniVar.s()) {
                if (!bjoVar5.c().equals(((bhd) brm.m).a)) {
                    bjn.b(bliVarA, bliVarA, bniVar, bjoVar5);
                }
            }
        }
        if (bliVarA.t(bku.J) && bliVarA.t(bjoVar)) {
            bliVarA.e(bjoVar);
        }
        if (bliVarA.t(bjoVar3)) {
        }
        bbs.a("UseCase", "applyFeaturesToConfig: mFeatures = " + this.k + ", this = " + this);
        if (this.k != null) {
            azv azvVar = bdz.a;
            Range range = bea.a;
            int i = bec.a;
            for (bdy bdyVar : this.k) {
                if (bdyVar instanceof bdz) {
                    throw null;
                }
                if (bdyVar instanceof bea) {
                    range = new Range(60, 60);
                } else if (bdyVar instanceof bec) {
                    throw null;
                }
            }
            if ((this instanceof bch) || brb.k(this)) {
                bliVarA.c(bkr.o, azvVar);
            }
            bliVarA.c(bni.u, range);
            bjo bjoVar6 = bni.z;
            bliVarA.c(bjoVar6, 1);
            bjo bjoVar7 = bni.A;
            bliVarA.c(bjoVar7, 1);
            bliVarA.c(bjoVar6, 1);
            bliVarA.c(bjoVar7, 1);
        }
        return g(birVar, e(bliVarA));
    }

    protected final String H() {
        biu biuVarF = F();
        toString();
        lcg.j(biuVarF, "No camera attached to use case: ".concat(toString()));
        return biuVarF.f().l();
    }

    public final String I() {
        String strQ = this.l.q("<UnknownUseCase-" + hashCode() + ">");
        strQ.getClass();
        return strQ;
    }

    protected final void J(bmd bmdVar, bms bmsVar) {
        if (!bms.h.equals(bmsVar.b())) {
            bmdVar.q(bmsVar.b());
            return;
        }
        synchronized (this.a) {
            biu biuVar = this.e;
            lcg.i(biuVar);
            List listC = biuVar.f().h().c(AeFpsRangeQuirk.class);
            boolean z = true;
            if (listC.size() > 1) {
                z = false;
            }
            lcg.b(z, "There should not have more than one AeFpsRangeQuirk.");
            if (!listC.isEmpty()) {
                bmdVar.q(((AeFpsRangeQuirk) listC.get(0)).a());
            }
        }
    }

    protected final void K() {
        this.s = 1;
        M();
    }

    public final void L() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((bdq) it.next()).w(this);
        }
    }

    public final void M() {
        int i = this.s;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((bdq) it.next()).u(this);
            }
        } else {
            if (i2 != 1) {
                return;
            }
            Iterator it2 = this.j.iterator();
            while (it2.hasNext()) {
                ((bdq) it2.next()).v(this);
            }
        }
    }

    public final void O(ayy ayyVar) {
        boolean z = true;
        if (ayyVar != null && !T(ayyVar.a)) {
            z = false;
        }
        lcg.a(z);
        this.p = ayyVar;
    }

    public final void P(Set set) {
        this.k = set != null ? new HashSet(set) : null;
    }

    public final void Q(biu biuVar) {
        j();
        synchronized (this.a) {
            biu biuVar2 = this.e;
            if (biuVar == biuVar2) {
                this.j.remove(biuVar2);
                this.e = null;
            }
        }
        this.m = null;
        this.n = null;
        this.l = this.c;
        this.b = null;
        this.d = null;
    }

    public final void R(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.q = (bml) list.get(0);
        if (list.size() > 1) {
            this.r = (bml) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (bjz bjzVar : ((bml) it.next()).f()) {
                if (bjzVar.n == null) {
                    bjzVar.n = getClass();
                }
            }
        }
    }

    public final void S(bms bmsVar, bms bmsVar2) {
        p(bmsVar, null);
        this.m = bmsVar;
    }

    public final boolean T(int i) {
        Iterator it = ag().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if ((i & iIntValue) == iIntValue) {
                return true;
            }
        }
        return false;
    }

    public final boolean U(biu biuVar) {
        int iZ = z();
        if (iZ == -1 || iZ == 0) {
            return false;
        }
        if (iZ == 1) {
            return true;
        }
        if (iZ == 2) {
            return biuVar.I();
        }
        throw new AssertionError(a.g(iZ, "Unknown mirrorMode: "));
    }

    public final boolean V(int i) {
        Size sizeO;
        int iC = ((bku) this.l).C(-1);
        if (iC != -1 && iC == i) {
            return false;
        }
        bnh bnhVarE = e(this.c);
        bku bkuVar = (bku) bnhVarE.c();
        int iC2 = bkuVar.C(-1);
        if (iC2 == -1 || iC2 != i) {
            ((bkt) bnhVarE).h(i);
        }
        if (iC2 != -1 && iC2 != i) {
            if (Math.abs(bnq.b(i) - bnq.b(iC2)) % 180 == 90 && (sizeO = bkuVar.O()) != null) {
                ((bkt) bnhVarE).g(new Size(sizeO.getHeight(), sizeO.getWidth()));
            }
        }
        this.c = bnhVarE.c();
        biu biuVarF = F();
        if (biuVarF == null) {
            this.l = this.c;
            return true;
        }
        this.l = G(biuVarF.f(), this.b, this.d);
        return true;
    }

    public final void W(biu biuVar, bni bniVar, bni bniVar2) {
        synchronized (this.a) {
            this.e = biuVar;
            this.j.add(biuVar);
        }
        this.b = bniVar;
        this.d = bniVar2;
        this.l = G(biuVar.f(), this.b, this.d);
        ah();
    }

    public final void X() {
        synchronized (this.a) {
        }
    }

    protected Set ag() {
        return Collections.EMPTY_SET;
    }

    public bms d(bjq bjqVar) {
        throw null;
    }

    public abstract bnh e(bjq bjqVar);

    public abstract bni f(boolean z, bnm bnmVar);

    protected bni g(bir birVar, bnh bnhVar) {
        throw null;
    }

    public void k(Matrix matrix) {
        this.o = new Matrix(matrix);
    }

    public void l(Rect rect) {
        this.n = rect;
    }

    protected void p(bms bmsVar, bms bmsVar2) {
        throw null;
    }

    protected final int x() {
        return ((bku) this.l).G();
    }

    public final int y() {
        return this.l.a();
    }

    protected final int z() {
        return ((bku) this.l).L();
    }

    public void N() {
    }

    public void ah() {
    }

    public void ai() {
    }

    public void j() {
    }

    public void q() {
    }
}
