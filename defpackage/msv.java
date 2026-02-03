package defpackage;

import android.util.Pair;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class msv implements ney, nal {
    final /* synthetic */ msz a;
    private final msx b;

    public msv(msz mszVar, msx msxVar) {
        this.a = mszVar;
        this.b = msxVar;
    }

    private final Pair k(nen nenVar) {
        nen nenVarA;
        nen nenVar2 = null;
        if (nenVar != null) {
            msx msxVar = this.b;
            int i = 0;
            while (true) {
                List list = msxVar.c;
                if (i >= list.size()) {
                    nenVarA = null;
                    break;
                }
                if (((nen) list.get(i)).d == nenVar.d) {
                    Object obj = nenVar.a;
                    Object obj2 = msxVar.b;
                    int i2 = mtg.e;
                    nenVarA = nenVar.a(Pair.create(obj2, obj));
                    break;
                }
                i++;
            }
            if (nenVarA == null) {
                return null;
            }
            nenVar2 = nenVarA;
        }
        return Pair.create(Integer.valueOf(this.b.d), nenVar2);
    }

    @Override // defpackage.ney
    public final void eB(int i, nen nenVar, final nej nejVar) {
        final Pair pairK = k(nenVar);
        if (pairK != null) {
            msz mszVar = this.a;
            mszVar.h.b(new Runnable() { // from class: msp
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairK;
                    this.a.a.g.eB(((Integer) pair.first).intValue(), (nen) pair.second, nejVar);
                }
            });
        }
    }

    @Override // defpackage.ney
    public final void eC(int i, nen nenVar, final nee neeVar, final nej nejVar) {
        final Pair pairK = k(nenVar);
        if (pairK != null) {
            msz mszVar = this.a;
            mszVar.h.b(new Runnable() { // from class: msn
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairK;
                    this.a.a.g.eC(((Integer) pair.first).intValue(), (nen) pair.second, neeVar, nejVar);
                }
            });
        }
    }

    @Override // defpackage.ney
    public final void eD(int i, nen nenVar, final nee neeVar, final nej nejVar) {
        final Pair pairK = k(nenVar);
        if (pairK != null) {
            msz mszVar = this.a;
            mszVar.h.b(new Runnable() { // from class: mss
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairK;
                    this.a.a.g.eD(((Integer) pair.first).intValue(), (nen) pair.second, neeVar, nejVar);
                }
            });
        }
    }

    @Override // defpackage.ney
    public final void eE(int i, nen nenVar, final nee neeVar, final nej nejVar, final IOException iOException, final boolean z) {
        final Pair pairK = k(nenVar);
        if (pairK != null) {
            msz mszVar = this.a;
            mszVar.h.b(new Runnable() { // from class: msm
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairK;
                    this.a.a.g.eE(((Integer) pair.first).intValue(), (nen) pair.second, neeVar, nejVar, iOException, z);
                }
            });
        }
    }

    @Override // defpackage.ney
    public final void eF(int i, nen nenVar, final nee neeVar, final nej nejVar, final int i2) {
        final Pair pairK = k(nenVar);
        if (pairK != null) {
            msz mszVar = this.a;
            mszVar.h.b(new Runnable() { // from class: msl
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairK;
                    this.a.a.g.eF(((Integer) pair.first).intValue(), (nen) pair.second, neeVar, nejVar, i2);
                }
            });
        }
    }

    @Override // defpackage.nal
    public final void eG(int i, nen nenVar) {
        final Pair pairK = k(nenVar);
        if (pairK != null) {
            msz mszVar = this.a;
            mszVar.h.b(new Runnable() { // from class: msu
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairK;
                    this.a.a.g.eG(((Integer) pair.first).intValue(), (nen) pair.second);
                }
            });
        }
    }

    @Override // defpackage.nal
    public final void eH(int i, nen nenVar) {
        final Pair pairK = k(nenVar);
        if (pairK != null) {
            msz mszVar = this.a;
            mszVar.h.b(new Runnable() { // from class: msq
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairK;
                    this.a.a.g.eH(((Integer) pair.first).intValue(), (nen) pair.second);
                }
            });
        }
    }

    @Override // defpackage.nal
    public final void eI(int i, nen nenVar, final int i2) {
        final Pair pairK = k(nenVar);
        if (pairK != null) {
            msz mszVar = this.a;
            mszVar.h.b(new Runnable() { // from class: mst
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairK;
                    this.a.a.g.eI(((Integer) pair.first).intValue(), (nen) pair.second, i2);
                }
            });
        }
    }

    @Override // defpackage.nal
    public final void eJ(int i, nen nenVar, final Exception exc) {
        final Pair pairK = k(nenVar);
        if (pairK != null) {
            msz mszVar = this.a;
            mszVar.h.b(new Runnable() { // from class: mso
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairK;
                    this.a.a.g.eJ(((Integer) pair.first).intValue(), (nen) pair.second, exc);
                }
            });
        }
    }

    @Override // defpackage.nal
    public final void eK(int i, nen nenVar) {
        final Pair pairK = k(nenVar);
        if (pairK != null) {
            msz mszVar = this.a;
            mszVar.h.b(new Runnable() { // from class: msr
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairK;
                    this.a.a.g.eK(((Integer) pair.first).intValue(), (nen) pair.second);
                }
            });
        }
    }
}
