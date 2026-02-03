package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efzn {
    private final Set b;
    private final Random c = new Random();
    public final ArrayList a = new ArrayList(2);

    public efzn(Set set) {
        this.b = set;
    }

    public final void a(efzm efzmVar) {
        ArrayList arrayList = this.a;
        arrayList.add(efzmVar);
        Collections.shuffle(arrayList, this.c);
    }

    public final void b(egbs egbsVar) {
        ejwl.l(egbsVar != null);
        ejwl.l(!egbsVar.equals(egbs.a));
        ejwl.l((egbsVar.b & 256) != 0);
        String str = egbsVar.k;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((efzm) it.next()).d();
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((efzm) arrayList.get(i)).d();
        }
    }

    public final void c(egbs egbsVar) {
        eieu eieuVarK = eiiy.k("onBeforeActivityAccountReady");
        try {
            String str = egbsVar.k;
            for (efzm efzmVar : this.b) {
                if (efzmVar instanceof efzo) {
                    ((efzo) efzmVar).g();
                }
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                efzm efzmVar2 = (efzm) it.next();
                if (efzmVar2 instanceof efzo) {
                    ((efzo) efzmVar2).g();
                }
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d() {
        eieu eieuVarK = eiiy.k("onBeforeNoAccountAvailable");
        try {
            for (efzm efzmVar : this.b) {
                if (efzmVar instanceof efzo) {
                    ((efzo) efzmVar).f();
                }
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                efzm efzmVar2 = (efzm) it.next();
                if (efzmVar2 instanceof efzo) {
                    ((efzo) efzmVar2).f();
                }
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e() {
        eieu eieuVarK = eiiy.k("onBeforeAccountLoading");
        try {
            for (efzm efzmVar : this.b) {
                if (efzmVar instanceof efzo) {
                    ((efzo) efzmVar).e();
                }
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                efzm efzmVar2 = (efzm) it.next();
                if (efzmVar2 instanceof efzo) {
                    ((efzo) efzmVar2).e();
                }
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(efyg efygVar) {
        eieu eieuVarK = eiiy.k("onNoAccountAvailable");
        try {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((efzm) it.next()).c(efygVar);
            }
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((efzm) it2.next()).c(efygVar);
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g() {
        eieu eieuVarK = eiiy.k("onAccountLoading");
        try {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((efzm) it.next()).b();
            }
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((efzm) it2.next()).b();
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(efwo efwoVar, egbs egbsVar) {
        ejwl.l(egbsVar != null);
        ejwl.l(!egbsVar.equals(egbs.a));
        ejwl.l((egbsVar.b & 256) != 0);
        eieu eieuVarK = eiiy.k("onAccountReady");
        try {
            efzk efzkVar = new efzk(new efzl(efwoVar, egbsVar.k));
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((efzm) it.next()).a(efzkVar);
            }
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((efzm) it2.next()).a(efzkVar);
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
