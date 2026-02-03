package androidx.compose.material3.internal;

import defpackage.fctr;
import defpackage.fcts;
import defpackage.fdbq;
import defpackage.hgr;
import defpackage.icr;
import defpackage.ije;
import defpackage.ind;
import defpackage.jdy;
import defpackage.kir;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class BaseCircularWavyProgressElement<N extends hgr> extends jdy<N> {
    @Override // defpackage.jdy
    public /* bridge */ /* synthetic */ void e(icr icrVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCircularWavyProgressElement)) {
            return false;
        }
        long jI = i();
        BaseCircularWavyProgressElement baseCircularWavyProgressElement = (BaseCircularWavyProgressElement) obj;
        long jI2 = baseCircularWavyProgressElement.i();
        long j = ije.a;
        return fcts.a(jI, jI2) && fcts.a(j(), baseCircularWavyProgressElement.j()) && fdbq.f(k(), baseCircularWavyProgressElement.k()) && fdbq.f(l(), baseCircularWavyProgressElement.l()) && kir.b(f(), baseCircularWavyProgressElement.f()) && kir.b(h(), baseCircularWavyProgressElement.h()) && kir.b(g(), baseCircularWavyProgressElement.g());
    }

    public float f() {
        throw null;
    }

    public float g() {
        throw null;
    }

    public float h() {
        throw null;
    }

    public int hashCode() {
        long jI = i();
        long j = ije.a;
        int iA = fctr.a(jI);
        return (((((((((((iA * 31) + fctr.a(j())) * 31) + k().hashCode()) * 31) + l().hashCode()) * 31) + Float.floatToIntBits(f())) * 31) + Float.floatToIntBits(h())) * 31) + Float.floatToIntBits(g());
    }

    public long i() {
        throw null;
    }

    public long j() {
        throw null;
    }

    public ind k() {
        throw null;
    }

    public ind l() {
        throw null;
    }
}
