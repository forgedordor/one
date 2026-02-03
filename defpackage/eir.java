package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eir implements eoi {
    public final eio a;
    public final eih b;
    public final eqr c;
    private final ejy d;

    public eir(ejy ejyVar, eio eioVar, eih eihVar, eqr eqrVar) {
        this.d = ejyVar;
        this.a = eioVar;
        this.b = eihVar;
        this.c = eqrVar;
    }

    @Override // defpackage.eoi
    public final int a(Object obj) {
        return this.c.a(obj);
    }

    @Override // defpackage.eoi
    public final int b() {
        return this.a.c();
    }

    @Override // defpackage.eoi
    public final Object c(int i) {
        return this.a.d(i);
    }

    @Override // defpackage.eoi
    public final Object d(int i) {
        Object objB = this.c.b(i);
        return objB == null ? this.a.e(i) : objB;
    }

    @Override // defpackage.eoi
    public final void e(int i, Object obj, hml hmlVar, final int i2) {
        int i3;
        final int i4;
        final Object obj2;
        int i5 = i2 & 6;
        hml hmlVarC = hmlVar.c(-462424778);
        if (i5 == 0) {
            i3 = (true != hmlVarC.B(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.F(obj) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.D(this) ? 128 : 256;
        }
        if (hmlVarC.J((i3 & 147) != 146, i3 & 1)) {
            i4 = i;
            obj2 = obj;
            epe.a(obj2, i4, this.d.n, hxe.d(-824725566, new eiq(this, i), hmlVarC), hmlVarC, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            i4 = i;
            obj2 = obj;
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: eip
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    eir eirVar = this.a;
                    int i6 = i4;
                    int i7 = i2;
                    eirVar.e(i6, obj2, (hml) obj3, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eir) {
            return fdbq.f(this.a, ((eir) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
