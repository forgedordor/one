package androidx.compose.material3.internal;

import defpackage.fcts;
import defpackage.fdbq;
import defpackage.fddu;
import defpackage.hgr;
import defpackage.hiz;
import defpackage.icr;
import defpackage.ije;
import defpackage.ind;
import defpackage.kir;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class IndeterminateCircularWavyProgressElement extends BaseCircularWavyProgressElement<hiz> {
    private final long a;
    private final long b;
    private final ind c;
    private final ind d;
    private final float f;
    private final float g;
    private final float h;
    private final float i;

    public IndeterminateCircularWavyProgressElement(long j, long j2, ind indVar, ind indVar2, float f, float f2, float f3, float f4) {
        this.a = j;
        this.b = j2;
        this.c = indVar;
        this.d = indVar2;
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new hiz(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i);
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement, defpackage.jdy
    public final /* synthetic */ void e(icr icrVar) {
        hiz hizVar = (hiz) icrVar;
        long j = ((hgr) hizVar).a;
        long j2 = ije.a;
        long j3 = this.a;
        if (!fcts.a(j, j3)) {
            ((hgr) hizVar).a = j3;
            hizVar.a();
        }
        long j4 = this.b;
        if (!fcts.a(((hgr) hizVar).b, j4)) {
            ((hgr) hizVar).b = j4;
            hizVar.a();
        }
        ind indVar = this.c;
        if (!fdbq.f(((hgr) hizVar).c, indVar)) {
            ((hgr) hizVar).c = indVar;
            hizVar.e();
        }
        ind indVar2 = this.d;
        if (!fdbq.f(hizVar.d, indVar2)) {
            hizVar.d = indVar2;
            hizVar.e();
        }
        float f = this.f;
        if (!kir.b(hizVar.e, f)) {
            hizVar.e = f;
            hizVar.e();
        }
        float f2 = this.h;
        if (!kir.b(hizVar.f, f2)) {
            hizVar.f = f2;
            hizVar.f();
        }
        float f3 = this.i;
        if (!kir.b(hizVar.g, f3)) {
            hizVar.g = f3;
            hizVar.f();
        }
        float fE = fddu.e(this.g, 0.0f, 1.0f);
        float f4 = hizVar.q;
        if (f4 == fE) {
            return;
        }
        hizVar.q = fE;
        if (fE > 0.0f && f4 == 0.0f) {
            hizVar.f();
        } else if (fE == 0.0f) {
            hizVar.g();
        }
        hizVar.r.a();
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IndeterminateCircularWavyProgressElement) && super.equals(obj) && this.g == ((IndeterminateCircularWavyProgressElement) obj).g;
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement
    public final float f() {
        return this.f;
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement
    public final float g() {
        return this.i;
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement
    public final float h() {
        return this.h;
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement
    public final int hashCode() {
        return (super.hashCode() * 31) + Float.floatToIntBits(this.g);
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement
    public final long i() {
        return this.a;
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement
    public final long j() {
        return this.b;
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement
    public final ind k() {
        return this.c;
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressElement
    public final ind l() {
        return this.d;
    }
}
