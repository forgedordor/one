package androidx.compose.foundation;

import android.view.View;
import defpackage.dnq;
import defpackage.dot;
import defpackage.fdap;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jbg;
import defpackage.jbh;
import defpackage.jdy;
import defpackage.kio;
import defpackage.kir;
import defpackage.kiv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MagnifierElement extends jdy<dnq> {
    private final fdap a;
    private final fdap c;
    private final dot f;
    private final fdap b = null;
    private final float d = Float.NaN;

    public MagnifierElement(fdap fdapVar, fdap fdapVar2, dot dotVar) {
        this.a = fdapVar;
        this.c = fdapVar2;
        this.f = dotVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new dnq(this.a, this.c, this.f);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        dnq dnqVar = (dnq) icrVar;
        float f = dnqVar.c;
        long j = dnqVar.e;
        float f2 = dnqVar.f;
        boolean z = dnqVar.d;
        float f3 = dnqVar.g;
        boolean z2 = dnqVar.h;
        dot dotVar = dnqVar.i;
        View view = dnqVar.j;
        kio kioVar = dnqVar.k;
        dnqVar.a = this.a;
        dnqVar.c = Float.NaN;
        dnqVar.d = true;
        dnqVar.e = 9205357640488583168L;
        dnqVar.f = Float.NaN;
        dnqVar.g = Float.NaN;
        dnqVar.h = true;
        dnqVar.b = this.c;
        dot dotVar2 = this.f;
        dnqVar.i = dotVar2;
        View viewA = jbh.a(dnqVar);
        kio kioVarG = jbg.g(dnqVar);
        if (dnqVar.o != null && (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && f != Float.NaN && !dotVar2.a()) || j != 9205357640488583168L || !kir.b(Float.NaN, f2) || !kir.b(Float.NaN, f3) || !z || !z2 || !fdbq.f(dotVar2, dotVar) || !fdbq.f(viewA, view) || !fdbq.f(kioVarG, kioVar))) {
            dnqVar.a();
        }
        dnqVar.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        if (this.a != magnifierElement.a) {
            return false;
        }
        fdap fdapVar = magnifierElement.b;
        float f = magnifierElement.d;
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((this.a.hashCode() * 961) + Float.floatToIntBits(Float.NaN)) * 31) + 1231) * 31) + kiv.a(9205357640488583168L)) * 31) + Float.floatToIntBits(Float.NaN)) * 31) + Float.floatToIntBits(Float.NaN)) * 31) + 1231) * 31) + this.c.hashCode()) * 31) + this.f.hashCode();
    }
}
