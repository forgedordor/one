package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdd implements ixn {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ Map c;
    final /* synthetic */ fdap d;
    final /* synthetic */ fdap e;
    final /* synthetic */ jde f;

    public jdd(int i, int i2, Map map, fdap fdapVar, fdap fdapVar2, jde jdeVar) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = fdapVar;
        this.e = fdapVar2;
        this.f = jdeVar;
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
        this.e.invoke(this.f.m);
    }
}
