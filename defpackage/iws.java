package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iws implements ixn {
    final /* synthetic */ iwy a;
    final /* synthetic */ int b;
    final /* synthetic */ ixn c;
    private final /* synthetic */ ixn d;

    public iws(ixn ixnVar, iwy iwyVar, int i, ixn ixnVar2) {
        this.a = iwyVar;
        this.b = i;
        this.c = ixnVar2;
        this.d = ixnVar;
    }

    @Override // defpackage.ixn
    public final int j() {
        return this.d.j();
    }

    @Override // defpackage.ixn
    public final int k() {
        return this.d.k();
    }

    @Override // defpackage.ixn
    public final Map m() {
        return this.d.m();
    }

    @Override // defpackage.ixn
    public final fdap n() {
        return this.d.n();
    }

    @Override // defpackage.ixn
    public final void o() {
        iwy iwyVar = this.a;
        iwyVar.d = this.b;
        this.c.o();
        iwyVar.g(iwyVar.d);
    }
}
