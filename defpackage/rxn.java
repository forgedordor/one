package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rxn extends rxp implements rxl {
    public Set h = null;
    public String i = null;
    public Set j = null;
    public Set k = null;
    public Set l = null;

    protected rxn() {
    }

    @Override // defpackage.rxl
    public final String c() {
        return this.i;
    }

    @Override // defpackage.rxl
    public final Set d() {
        return this.h;
    }

    @Override // defpackage.rxl
    public final Set e() {
        return this.l;
    }

    @Override // defpackage.rxl
    public final Set f() {
        return this.k;
    }

    @Override // defpackage.rxl
    public final Set g() {
        return this.j;
    }

    @Override // defpackage.rxl
    public final void h(String str) {
        this.i = str;
    }

    @Override // defpackage.rxl
    public final void i(Set set) {
        this.h = set;
    }

    @Override // defpackage.rxl
    public final void j(Set set) {
        this.l = set;
    }

    @Override // defpackage.rxl
    public final void k(Set set) {
        this.k = set;
    }

    @Override // defpackage.rxl
    public final void l(Set set) {
        this.j = set;
    }
}
