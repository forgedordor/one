package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esu implements eoi {
    public final enm a;
    public final ete b = ete.a;
    private final etv c;
    private final eqr d;

    public esu(etv etvVar, enm enmVar, eqr eqrVar) {
        this.c = etvVar;
        this.a = enmVar;
        this.d = eqrVar;
    }

    @Override // defpackage.eoi
    public final int a(Object obj) {
        return this.d.a(obj);
    }

    @Override // defpackage.eoi
    public final int b() {
        return this.a.c();
    }

    @Override // defpackage.eoi
    public final /* synthetic */ Object c(int i) {
        return null;
    }

    @Override // defpackage.eoi
    public final Object d(int i) {
        Object objB = this.d.b(i);
        return objB == null ? this.a.e(i) : objB;
    }

    @Override // defpackage.eoi
    public final void e(int i, Object obj, hml hmlVar, final int i2) {
        int i3;
        final int i4;
        final Object obj2;
        int i5 = i2 & 6;
        hml hmlVarC = hmlVar.c(-1201380429);
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
            epe.a(obj2, i4, this.c.v, hxe.d(1142237095, new est(this, i), hmlVarC), hmlVarC, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            i4 = i;
            obj2 = obj;
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ess
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    esu esuVar = this.a;
                    int i6 = i4;
                    int i7 = i2;
                    esuVar.e(i6, obj2, (hml) obj3, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof esu) {
            return fdbq.f(this.a, ((esu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
