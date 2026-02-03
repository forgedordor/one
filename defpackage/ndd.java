package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ndd implements nep {
    private Looper e;
    private mcl f;
    private mwx g;
    private final ArrayList d = new ArrayList(1);
    public final HashSet a = new HashSet(1);
    public final nex b = new nex(new CopyOnWriteArrayList(), null);
    public final nak c = new nak(new CopyOnWriteArrayList(), null);

    protected final mwx J() {
        mwx mwxVar = this.g;
        mee.g(mwxVar);
        return mwxVar;
    }

    protected final nak b(nen nenVar) {
        return this.c.f(nenVar);
    }

    protected final nex c(nen nenVar) {
        return this.b.g(nenVar);
    }

    @Override // defpackage.nep
    public final void d(Handler handler, nal nalVar) {
        this.c.c.add(new naj(handler, nalVar));
    }

    @Override // defpackage.nep
    public final void e(Handler handler, ney neyVar) {
        this.b.c.add(new C0186new(handler, neyVar));
    }

    @Override // defpackage.nep
    public final void f(neo neoVar) {
        HashSet hashSet = this.a;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(neoVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        g();
    }

    @Override // defpackage.nep
    public final void h(neo neoVar) {
        mee.f(this.e);
        HashSet hashSet = this.a;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(neoVar);
        if (zIsEmpty) {
            i();
        }
    }

    @Override // defpackage.nep
    public final void j(neo neoVar, min minVar, mwx mwxVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        mee.a(z);
        this.g = mwxVar;
        mcl mclVar = this.f;
        this.d.add(neoVar);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.a.add(neoVar);
            k(minVar);
        } else if (mclVar != null) {
            h(neoVar);
            neoVar.a(this, mclVar);
        }
    }

    protected abstract void k(min minVar);

    protected final void l(mcl mclVar) {
        this.f = mclVar;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((neo) arrayList.get(i)).a(this, mclVar);
        }
    }

    @Override // defpackage.nep
    public final void m(neo neoVar) {
        ArrayList arrayList = this.d;
        arrayList.remove(neoVar);
        if (!arrayList.isEmpty()) {
            f(neoVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.a.clear();
        n();
    }

    protected abstract void n();

    @Override // defpackage.nep
    public final void o(nal nalVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            naj najVar = (naj) it.next();
            if (najVar.b == nalVar) {
                copyOnWriteArrayList.remove(najVar);
            }
        }
    }

    @Override // defpackage.nep
    public final void p(ney neyVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.b.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C0186new c0186new = (C0186new) it.next();
            if (c0186new.b == neyVar) {
                copyOnWriteArrayList.remove(c0186new);
            }
        }
    }

    protected void g() {
    }

    protected void i() {
    }

    @Override // defpackage.nep
    public /* synthetic */ void r() {
    }

    @Override // defpackage.nep
    public /* synthetic */ void s() {
    }

    @Override // defpackage.nep
    public /* synthetic */ void q(mbo mboVar) {
    }
}
