package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
@fcsv
/* loaded from: classes.dex */
public final class onv {
    public final mw a;
    public final mc b;
    public final Executor c = akj.a;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public oun e;
    public oun f;
    public int g;
    public final ouk h;
    public final fdea i;
    public final List j;
    public final ouh k;

    @fcsv
    public onv(mw mwVar, mc mcVar) {
        ont ontVar = new ont(this);
        this.h = ontVar;
        this.i = new ons(ontVar);
        this.j = new CopyOnWriteArrayList();
        this.k = new onu(this);
        this.a = mwVar;
        this.b = mcVar;
    }

    public final int a() {
        oun ounVarC = c();
        if (ounVarC != null) {
            return ounVarC.l();
        }
        return 0;
    }

    public final mw b() {
        mw mwVar = this.a;
        if (mwVar != null) {
            return mwVar;
        }
        fdbq.c("updateCallback");
        return null;
    }

    public final oun c() {
        oun ounVar = this.f;
        return ounVar == null ? this.e : ounVar;
    }

    public final void d(oun ounVar, oun ounVar2) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((onr) it.next()).a.a(ounVar, ounVar2);
        }
    }
}
