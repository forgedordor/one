package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdo {
    public static final void a(final djgb djgbVar, ics icsVar, igr igrVar, hml hmlVar, final int i, final int i2) {
        int i3;
        djgbVar.getClass();
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(-11901093);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(djgbVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i6 = 128;
            if ((i2 & 4) == 0 && hmlVarC.D(igrVar)) {
                i6 = 256;
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i7 = i2 & 4;
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                if (i5 != 0) {
                    icsVar = ics.e;
                }
                if (i7 != 0) {
                    i3 &= -897;
                    igrVar = igr.a;
                }
            } else {
                hmlVarC.s();
                if (i7 != 0) {
                    i3 &= -897;
                }
            }
            hmlVarC.l();
            int i8 = i3 & 1022;
            if (djgbVar.f.a) {
                hmlVarC.v(1937013200);
                djbb.a(djgbVar, icsVar, igrVar, hmlVarC, i8);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(1937073712);
                djaw.a(djgbVar, icsVar, igrVar, hmlVarC, i8);
                ((hmw) hmlVarC).ab();
            }
        }
        final ics icsVar2 = icsVar;
        final igr igrVar2 = igrVar;
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djdn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djgb djgbVar2 = djgbVar;
                    ics icsVar3 = icsVar2;
                    djdo.a(djgbVar2, icsVar3, igrVar2, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }
}
