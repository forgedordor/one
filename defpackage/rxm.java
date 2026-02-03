package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rxm extends rxp implements rxo, rxl {
    public List i = new ArrayList();
    public Set j = null;
    public String k = null;
    public Set l = null;
    public Set m = null;

    protected rxm() {
    }

    @Override // defpackage.rxo
    public void b(rxs rxsVar) {
        this.i.add(rxsVar);
    }

    @Override // defpackage.rxl
    public final String c() {
        return this.k;
    }

    @Override // defpackage.rxl
    public final Set d() {
        return this.j;
    }

    @Override // defpackage.rxl
    public final Set e() {
        return this.m;
    }

    @Override // defpackage.rxl
    public final Set f() {
        return this.l;
    }

    @Override // defpackage.rxl
    public final Set g() {
        return null;
    }

    @Override // defpackage.rxl
    public final void h(String str) {
        this.k = str;
    }

    @Override // defpackage.rxl
    public final void i(Set set) {
        this.j = set;
    }

    @Override // defpackage.rxl
    public final void j(Set set) {
        this.m = set;
    }

    @Override // defpackage.rxl
    public final void k(Set set) {
        this.l = set;
    }

    @Override // defpackage.rxo
    public final List n() {
        return this.i;
    }

    @Override // defpackage.rxl
    public final void l(Set set) {
    }
}
