package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdg {
    public static final void a(final djdh djdhVar, ije ijeVar, ije ijeVar2, final boolean z, hml hmlVar, final int i, final int i2) {
        int i3;
        djdhVar.getClass();
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(1089545809);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(djdhVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(ijeVar) ? 16 : 32;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != hmlVarC.D(ijeVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (i5 != 0) {
                ijeVar = null;
            }
            if (i6 != 0) {
                ijeVar2 = null;
            }
            djuo.a(Integer.valueOf(R.id.compose_header_growthkit_view), hxe.d(1578440336, new djde(ijeVar, djdhVar, ijeVar2, z), hmlVarC), hmlVarC, 48);
        }
        final ije ijeVar3 = ijeVar;
        final ije ijeVar4 = ijeVar2;
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djda
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djdh djdhVar2 = djdhVar;
                    ije ijeVar5 = ijeVar3;
                    ije ijeVar6 = ijeVar4;
                    djdg.a(djdhVar2, ijeVar5, ijeVar6, z, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(fdae fdaeVar, final String str, final boolean z, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-133568541);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            ics icsVarJ = ics.e;
            if (z) {
                icsVarJ = efy.j(icsVarJ, 0.0f, 0.0f, 4.0f, 0.0f, 11);
            }
            fdaeVar2 = fdaeVar;
            dtfk.b(fdaeVar2, icsVarJ, false, null, null, hxe.d(-1098929663, new djdf(str), hmlVarC), hmlVarC, (i2 & 14) | 1572864, 60);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djdb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar3 = fdaeVar2;
                    String str2 = str;
                    int i4 = i;
                    djdg.b(fdaeVar3, str2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ije ijeVar, fdae fdaeVar, fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        final fdat fdatVar2 = fdatVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1883948669);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ijeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            ics icsVarU = egq.u(egq.d(ics.e, 1.0f), 48.0f, 0.0f, 2);
            hmlVarC.v(2001535638);
            long j = ijeVar == null ? glz.a(hmlVarC).c : ijeVar.i;
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            evm evmVarD = evn.d(24.0f, 24.0f, 0.0f, 0.0f, 12);
            if (fdaeVar != null) {
                hmlVarC.v(1918281062);
                gvk.e(fdaeVar, icsVarU, false, evmVarD, j, 0L, 0.0f, null, null, fdatVar2, hmlVarC, 996);
                hmlVarC = hmlVarC;
                fdaeVar2 = fdaeVar;
                hmwVar.ab();
                fdatVar2 = fdatVar;
            } else {
                fdaeVar2 = fdaeVar;
                hmlVarC.v(1918437054);
                gvk.c(icsVarU, evmVarD, j, 0L, 0.0f, 0.0f, null, fdatVar, hmlVarC, 120);
                fdatVar2 = fdatVar;
                hmwVar.ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djdc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ije ijeVar2 = ijeVar;
                    fdae fdaeVar3 = fdaeVar2;
                    int i4 = i;
                    djdg.c(ijeVar2, fdaeVar3, fdatVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final ego egoVar, final String str, final ije ijeVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1960382197);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(egoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(ijeVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ics icsVarA = joj.a(egoVar.a(efy.j(ics.e, 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f, true), "Compose:Draft:Header:Text");
            jyq jyqVar = glz.d(hmlVarC).n;
            hmlVarC.v(1563362453);
            long j = ijeVar == null ? glz.a(hmlVarC).a : ijeVar.i;
            ((hmw) hmlVarC).ab();
            hmlVar2 = hmlVarC;
            dthx.b(str, icsVarA, j, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, jyqVar, hmlVar2, (i2 >> 3) & 14, 3120, 55288);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djcz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ego egoVar2 = egoVar;
                    String str2 = str;
                    int i4 = i;
                    djdg.d(egoVar2, str2, ijeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
