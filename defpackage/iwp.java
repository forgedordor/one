package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwp implements ixn {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ Map c;
    final /* synthetic */ fdap d;
    final /* synthetic */ iwq e;
    final /* synthetic */ iwy f;
    final /* synthetic */ fdap g;

    public iwp(int i, int i2, Map map, fdap fdapVar, iwq iwqVar, iwy iwyVar, fdap fdapVar2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = fdapVar;
        this.e = iwqVar;
        this.f = iwyVar;
        this.g = fdapVar2;
    }

    @Override // defpackage.ixn
    public final int j() {
        return this.b;
    }

    @Override // defpackage.ixn
    public final int k() {
        return this.a;
    }

    @Override // defpackage.ixn
    public final Map m() {
        return this.c;
    }

    @Override // defpackage.ixn
    public final fdap n() {
        return this.d;
    }

    @Override // defpackage.ixn
    public final void o() {
        jdf jdfVar;
        if (!this.e.ev() || (jdfVar = ((jbx) this.f.a.w()).g) == null) {
            this.g.invoke(this.f.a.w().m);
        } else {
            this.g.invoke(jdfVar.m);
        }
    }
}
