package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iug implements iui, iue {
    private final /* synthetic */ iue a;
    private final kji b;

    public iug(iue iueVar, kji kjiVar) {
        this.a = iueVar;
        this.b = kjiVar;
    }

    @Override // defpackage.kio
    public final float ed() {
        return this.a.ed();
    }

    @Override // defpackage.kiy
    public final float ee() {
        return this.a.ee();
    }

    @Override // defpackage.kiy
    public final float eg(long j) {
        return this.a.eg(j);
    }

    @Override // defpackage.kio
    public final float eh(float f) {
        return this.a.eh(f);
    }

    @Override // defpackage.ixp
    public final /* synthetic */ ixn ej(int i, int i2, Map map, fdap fdapVar) {
        return ixo.a(this, i, i2, map, fdapVar);
    }

    @Override // defpackage.kio
    public final float el(int i) {
        return this.a.el(i);
    }

    @Override // defpackage.kio
    public final float em(long j) {
        return this.a.em(j);
    }

    @Override // defpackage.kio
    public final float en(float f) {
        return this.a.en(f);
    }

    @Override // defpackage.kio
    public final int eo(long j) {
        return this.a.eo(j);
    }

    @Override // defpackage.kio
    public final int ep(float f) {
        return this.a.ep(f);
    }

    @Override // defpackage.kio
    public final long eq(long j) {
        return this.a.eq(j);
    }

    @Override // defpackage.kio
    public final long er(long j) {
        return this.a.er(j);
    }

    @Override // defpackage.kiy
    public final long es(float f) {
        return this.a.es(f);
    }

    @Override // defpackage.kio
    public final long et(float f) {
        return this.a.et(f);
    }

    @Override // defpackage.ixp
    public final ixn eu(int i, int i2, Map map, fdap fdapVar, fdap fdapVar2) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i < 0) {
            i = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            itw.d(a.z(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new iuf(i, i2, map, fdapVar);
    }

    @Override // defpackage.ivu
    public final boolean ev() {
        return false;
    }

    @Override // defpackage.ivu
    public final kji q() {
        return this.b;
    }
}
