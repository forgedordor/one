package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lvn extends lvc {
    public akn b = new akn();
    public lvb c;
    private final WeakReference d;
    private int e;
    private boolean f;
    private boolean g;
    private final ArrayList h;
    private final fduf i;

    public lvn(lvj lvjVar) {
        lvb lvbVar = lvb.b;
        this.c = lvbVar;
        this.h = new ArrayList();
        this.d = new WeakReference(lvjVar);
        this.i = fdvf.a(lvbVar);
    }

    public static final void g(String str) {
        if (!akj.a().c()) {
            throw new IllegalStateException(a.a(str, "Method ", " must be called on the main thread"));
        }
    }

    private final lvb h(lvi lviVar) {
        akn aknVar = this.b;
        akq akqVar = aknVar.c(lviVar) ? ((akq) aknVar.a.get(lviVar)).d : null;
        lvb lvbVar = akqVar != null ? ((lvm) akqVar.b).a : null;
        ArrayList arrayList = this.h;
        return lvl.a(lvl.a(this.c, lvbVar), arrayList.isEmpty() ? null : (lvb) arrayList.get(arrayList.size() - 1));
    }

    private final void i(lvb lvbVar) {
        if (this.c == lvbVar) {
            return;
        }
        lvj lvjVar = (lvj) this.d.get();
        lvb lvbVar2 = this.c;
        lvbVar2.getClass();
        lvbVar.getClass();
        if (lvbVar2 == lvb.b && lvbVar == lvb.a) {
            throw new IllegalStateException("State must be at least '" + lvb.c + "' to be moved to '" + lvbVar + "' in component " + lvjVar);
        }
        lvb lvbVar3 = lvb.a;
        if (lvbVar2 == lvbVar3 && lvbVar2 != lvbVar) {
            throw new IllegalStateException(a.t(lvjVar, lvbVar, lvbVar3, "State is '", "' and cannot be moved to `", "` in component "));
        }
        this.c = lvbVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        l();
        this.f = false;
        if (this.c == lvbVar3) {
            this.b = new akn();
        }
    }

    private final void j() {
        this.h.remove(r0.size() - 1);
    }

    private final void k(lvb lvbVar) {
        this.h.add(lvbVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r6.g = false;
        r6.i.f(r6.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void l() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvn.l():void");
    }

    @Override // defpackage.lvc
    public final lvb a() {
        return this.c;
    }

    @Override // defpackage.lvc
    public final fdvc b() {
        return new fduh(this.i);
    }

    @Override // defpackage.lvc
    public final void c(lvi lviVar) {
        Object obj;
        lvj lvjVar;
        lviVar.getClass();
        g("addObserver");
        lvb lvbVar = this.c;
        lvb lvbVar2 = lvb.a;
        if (lvbVar != lvbVar2) {
            lvbVar2 = lvb.b;
        }
        lvm lvmVar = new lvm(lviVar, lvbVar2);
        akn aknVar = this.b;
        akq akqVarA = aknVar.a(lviVar);
        if (akqVarA != null) {
            obj = akqVarA.b;
        } else {
            aknVar.a.put(lviVar, aknVar.d(lviVar, lvmVar));
            obj = null;
        }
        if (((lvm) obj) == null && (lvjVar = (lvj) this.d.get()) != null) {
            boolean z = this.e != 0 || this.f;
            lvb lvbVarH = h(lviVar);
            this.e++;
            while (lvmVar.a.compareTo(lvbVarH) < 0 && this.b.c(lviVar)) {
                k(lvmVar.a);
                luz luzVar = lva.Companion;
                lva lvaVarB = luz.b(lvmVar.a);
                if (lvaVarB == null) {
                    lvb lvbVar3 = lvmVar.a;
                    Objects.toString(lvbVar3);
                    throw new IllegalStateException("no event up from ".concat(String.valueOf(lvbVar3)));
                }
                lvmVar.a(lvjVar, lvaVarB);
                j();
                lvbVarH = h(lviVar);
            }
            if (!z) {
                l();
            }
            this.e--;
        }
    }

    @Override // defpackage.lvc
    public final void d(lvi lviVar) {
        lviVar.getClass();
        g("removeObserver");
        this.b.b(lviVar);
    }

    public void e(lva lvaVar) {
        lvaVar.getClass();
        g("handleLifecycleEvent");
        i(lvaVar.a());
    }

    public final void f(lvb lvbVar) {
        lvbVar.getClass();
        g("setCurrentState");
        i(lvbVar);
    }
}
