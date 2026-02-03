package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lvx extends lvy {
    private final aku a;

    public lvx() {
        this.a = new aku();
    }

    @Override // defpackage.lvv
    protected void h() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lvw) ((akq) ((aks) it).next()).b).b();
        }
    }

    @Override // defpackage.lvv
    protected void i() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lvw) ((akq) ((aks) it).next()).b).c();
        }
    }

    public final void p(lvv lvvVar, lvz lvzVar) {
        if (lvvVar == null) {
            throw new NullPointerException("source cannot be null");
        }
        lvw lvwVar = new lvw(lvvVar, lvzVar);
        lvw lvwVar2 = (lvw) this.a.f(lvvVar, lvwVar);
        if (lvwVar2 != null && lvwVar2.b != lvzVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (lvwVar2 == null && n()) {
            lvwVar.b();
        }
    }

    public final void q(lvv lvvVar) {
        lvw lvwVar = (lvw) this.a.b(lvvVar);
        if (lvwVar != null) {
            lvwVar.c();
        }
    }

    public lvx(Object obj) {
        super(obj);
        this.a = new aku();
    }
}
