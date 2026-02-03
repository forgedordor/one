package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcf implements ixn {
    private final /* synthetic */ ixn a;
    private final int b;
    private final int c;

    public jcf(ixn ixnVar, jcg jcgVar) {
        this.a = ixnVar;
        jdf jdfVar = jcgVar.h;
        jdfVar.getClass();
        this.b = jdfVar.a;
        jdfVar.getClass();
        this.c = jdfVar.b;
    }

    @Override // defpackage.ixn
    public final int j() {
        return this.c;
    }

    @Override // defpackage.ixn
    public final int k() {
        return this.b;
    }

    @Override // defpackage.ixn
    public final Map m() {
        return this.a.m();
    }

    @Override // defpackage.ixn
    public final fdap n() {
        return this.a.n();
    }

    @Override // defpackage.ixn
    public final void o() {
        this.a.o();
    }
}
