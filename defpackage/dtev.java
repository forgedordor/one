package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtev {
    public static final void a(ics icsVar, float f, long j, hml hmlVar, final int i, final int i2) {
        int i3;
        final ics icsVar2;
        final float f2;
        final long j2;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(964649005);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.A(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i6 = 128;
            if ((i2 & 4) == 0 && hmlVarC.C(j)) {
                i6 = 256;
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            j2 = j;
            f2 = f;
            icsVar2 = icsVar;
        } else {
            int i7 = i2 & 4;
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                if (i4 != 0) {
                    icsVar = ics.e;
                }
                if (i5 != 0) {
                    f = 1.0f;
                }
                if (i7 != 0) {
                    i3 &= -897;
                    j = dtes.a(hmlVarC);
                }
            } else {
                hmlVarC.s();
                if (i7 != 0) {
                    i3 &= -897;
                }
            }
            ics icsVar3 = icsVar;
            float f3 = f;
            long j3 = j;
            hmlVarC.l();
            gjd.a(icsVar3, f3, j3, hmlVarC, i3 & 1022, 0);
            icsVar2 = icsVar3;
            f2 = f3;
            j2 = j3;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dteu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar4 = icsVar2;
                    float f4 = f2;
                    dtev.a(icsVar4, f4, j2, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final ics icsVar, final long j, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(634017535);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.A(1.0f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.C(j) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            gjd.b(icsVar, j, hmlVarC, i2 & 1022);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dtet
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    dtev.b(icsVar2, j, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
