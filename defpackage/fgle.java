package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgle {
    public fgle e = null;
    public fgle f = null;
    public fgle g = null;
    public fgle h = null;
    public fgle i = null;
    private List a = null;

    public fgle b() {
        return this.e;
    }

    protected void c(fgle fgleVar) {
        this.e = fgleVar;
    }

    public abstract void d(fglq fglqVar);

    public final List f() {
        List list = this.a;
        return list != null ? DesugarCollections.unmodifiableList(list) : Collections.EMPTY_LIST;
    }

    public final void g(fgll fgllVar) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(fgllVar);
    }

    public final void h(fgle fgleVar) {
        fgleVar.k();
        fgleVar.c(this);
        fgle fgleVar2 = this.g;
        if (fgleVar2 != null) {
            fgleVar2.i = fgleVar;
            fgleVar.h = fgleVar2;
        } else {
            this.f = fgleVar;
        }
        this.g = fgleVar;
    }

    public final void i(fgle fgleVar) {
        fgleVar.k();
        fgle fgleVar2 = this.i;
        fgleVar.i = fgleVar2;
        if (fgleVar2 != null) {
            fgleVar2.h = fgleVar;
        }
        fgleVar.h = this;
        this.i = fgleVar;
        fgle fgleVar3 = this.e;
        fgleVar.e = fgleVar3;
        if (fgleVar.i == null) {
            fgleVar3.g = fgleVar;
        }
    }

    public final void j(List list) {
        if (list.isEmpty()) {
            this.a = null;
        } else {
            this.a = new ArrayList(list);
        }
    }

    public final void k() {
        fgle fgleVar = this.h;
        if (fgleVar != null) {
            fgleVar.i = this.i;
        } else {
            fgle fgleVar2 = this.e;
            if (fgleVar2 != null) {
                fgleVar2.f = this.i;
            }
        }
        fgle fgleVar3 = this.i;
        if (fgleVar3 != null) {
            fgleVar3.h = fgleVar;
        } else {
            fgle fgleVar4 = this.e;
            if (fgleVar4 != null) {
                fgleVar4.g = fgleVar;
            }
        }
        this.e = null;
        this.i = null;
        this.h = null;
    }

    protected String l() {
        return "";
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + l() + "}";
    }
}
