package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuj implements ixn {
    final /* synthetic */ fdap a;
    final /* synthetic */ iuk b;
    private final int c;
    private final int d;
    private final Map e;
    private final fdap f;

    public iuj(int i, int i2, Map map, fdap fdapVar, fdap fdapVar2, iuk iukVar) {
        this.a = fdapVar2;
        this.b = iukVar;
        this.c = i;
        this.d = i2;
        this.e = map;
        this.f = fdapVar;
    }

    @Override // defpackage.ixn
    public final int j() {
        return this.d;
    }

    @Override // defpackage.ixn
    public final int k() {
        return this.c;
    }

    @Override // defpackage.ixn
    public final Map m() {
        return this.e;
    }

    @Override // defpackage.ixn
    public final fdap n() {
        return this.f;
    }

    @Override // defpackage.ixn
    public final void o() {
        this.a.invoke(this.b.a.m);
    }
}
