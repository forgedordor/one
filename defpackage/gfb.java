package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfb {
    public static final egc a = efy.h(0.0f, 0.0f, 6.0f, 8.0f, 3);
    public static final float b = 8.0f;
    public static final float c = 12.0f;

    public static final void a(final fdae fdaeVar, final fdat fdatVar, final ics icsVar, final fdat fdatVar2, final ikp ikpVar, final float f, final geq geqVar, final knl knlVar, final fdau fdauVar, hml hmlVar, final int i) {
        fdae fdaeVar2;
        int i2;
        fdat fdatVar3;
        ikp ikpVar2;
        geq geqVar2;
        knl knlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(219718641);
        if (i3 == 0) {
            fdaeVar2 = fdaeVar;
            i2 = (true != hmlVarC.F(fdaeVar2) ? 2 : 4) | i;
        } else {
            fdaeVar2 = fdaeVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            fdatVar3 = fdatVar2;
            i2 |= true != hmlVarC.F(fdatVar3) ? 1024 : 2048;
        } else {
            fdatVar3 = fdatVar2;
        }
        if ((i & 24576) == 0) {
            ikpVar2 = ikpVar;
            i2 |= true != hmlVarC.D(ikpVar2) ? 8192 : 16384;
        } else {
            ikpVar2 = ikpVar;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.A(f) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            geqVar2 = geqVar;
            i2 |= true != hmlVarC.D(geqVar2) ? 524288 : 1048576;
        } else {
            geqVar2 = geqVar;
        }
        if ((12582912 & i) == 0) {
            knlVar2 = knlVar;
            i2 |= true != hmlVarC.D(knlVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            knlVar2 = knlVar;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if (hmlVarC.J((38347923 & i2) != 38347922, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            fyb.c(fdaeVar2, egq.y(icsVar), knlVar2, hxe.d(1108953335, new gfa(ikpVar2, geqVar2, f, fdauVar, fdatVar3, fdatVar), hmlVarC), hmlVarC, (i2 & 14) | 3072 | ((i2 >> 15) & 896));
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gew
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    fdae fdaeVar3 = fdaeVar;
                    fdat fdatVar4 = fdatVar;
                    ics icsVar2 = icsVar;
                    fdat fdatVar5 = fdatVar2;
                    ikp ikpVar3 = ikpVar;
                    float f2 = f;
                    geq geqVar3 = geqVar;
                    int i4 = i;
                    gfb.a(fdaeVar3, fdatVar4, icsVar2, fdatVar5, ikpVar3, f2, geqVar3, knlVar, fdauVar, hmlVar2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
