package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuh {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.ics r24, defpackage.ikp r25, long r26, long r28, float r30, final defpackage.fdat r31, defpackage.hml r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fuh.a(ics, ikp, long, long, float, fdat, hml, int, int):void");
    }

    public static final /* synthetic */ long c(long j, fos fosVar, float f, hml hmlVar) {
        long jL = fqq.a(hmlVar).l();
        long j2 = ije.a;
        if (!fcts.a(j, jL) || fosVar == null) {
            hmlVar.v(-1124527499);
            hmlVar.o();
            return j;
        }
        hmlVar.v(-1124595606);
        hmlVar.v(-1687113661);
        fod fodVarA = fqq.a(hmlVar);
        if (Float.compare(f, 0.0f) <= 0 || fodVarA.m()) {
            hmlVar.v(-1095440862);
            hmlVar.o();
        } else {
            hmlVar.v(-1095579370);
            hpt hptVar = fpt.a;
            float fLog = (float) Math.log(f + 1.0f);
            long jA = fof.a(j, hmlVar);
            j = ijg.h(ijg.f(ije.d(jA), ije.c(jA), ije.b(jA), ((fLog * 4.5f) + 2.0f) / 100.0f, ije.f(jA)), j);
            hmlVar.o();
        }
        hmlVar.o();
        hmlVar.o();
        return j;
    }

    public static final void d(final fdae fdaeVar, final ics icsVar, boolean z, final ikp ikpVar, final long j, final long j2, final float f, final ebk ebkVar, final fdat fdatVar, hml hmlVar, final int i) {
        fdae fdaeVar2;
        int i2;
        ikp ikpVar2;
        ebk ebkVar2;
        fdat fdatVar2;
        boolean z2;
        final boolean z3;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2141308794);
        if (i3 == 0) {
            fdaeVar2 = fdaeVar;
            i2 = (true != hmlVarC.F(fdaeVar2) ? 2 : 4) | i;
        } else {
            fdaeVar2 = fdaeVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            ikpVar2 = ikpVar;
            i4 |= true != hmlVarC.D(ikpVar2) ? 1024 : 2048;
        } else {
            ikpVar2 = ikpVar;
        }
        if ((i & 24576) == 0) {
            i4 |= true != hmlVarC.C(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i4 |= true != hmlVarC.C(j2) ? 65536 : 131072;
        }
        int i5 = i4 | 1572864;
        if ((12582912 & i) == 0) {
            i5 |= true != hmlVarC.A(f) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            ebkVar2 = ebkVar;
            i5 |= true != hmlVarC.D(ebkVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            ebkVar2 = ebkVar;
        }
        if ((805306368 & i) == 0) {
            fdatVar2 = fdatVar;
            i5 |= true != hmlVarC.F(fdatVar2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            fdatVar2 = fdatVar;
        }
        if ((i5 & 306783379) == 306783378 && hmlVarC.I()) {
            hmlVarC.s();
            z3 = z;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                z2 = true;
            } else {
                hmlVarC.s();
                z2 = z;
            }
            hmlVarC.l();
            hpt hptVar = fpt.b;
            float f2 = ((kir) hmlVarC.e(hptVar)).a + f;
            hnj.b(new hpu[]{C0001for.a.c(new ije(j2)), hptVar.c(new kir(f2))}, hxe.d(-1766606150, new fug(icsVar, ikpVar2, j, f2, f, ebkVar2, z2, fdaeVar2, fdatVar2), hmlVarC), hmlVarC, 56);
            z3 = z2;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fuc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar3 = fdaeVar;
                    ics icsVar2 = icsVar;
                    boolean z4 = z3;
                    ikp ikpVar3 = ikpVar;
                    long j3 = j;
                    long j4 = j2;
                    float f3 = f;
                    ebk ebkVar3 = ebkVar;
                    fuh.d(fdaeVar3, icsVar2, z4, ikpVar3, j3, j4, f3, ebkVar3, fdatVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
