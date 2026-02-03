package defpackage;

import androidx.compose.foundation.selection.TriStateToggleableElement;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbv {
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c0, code lost:
    
        if (r15 == 2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e3, code lost:
    
        if (r13 == 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00eb, code lost:
    
        throw new defpackage.fctg();
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a0  */
    /* JADX WARN: Type inference failed for: r16v2, types: [dew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v3, types: [dew, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r25, final defpackage.jue r26, final defpackage.ics r27, final defpackage.gbn r28, final defpackage.ind r29, final defpackage.ind r30, defpackage.hml r31, final int r32) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gbv.a(boolean, jue, ics, gbn, ind, ind, hml, int):void");
    }

    public static final void b(final boolean z, final fdap fdapVar, final ics icsVar, final boolean z2, final gbn gbnVar, final ebk ebkVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        fdae fdaeVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1406741137);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(gbnVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.D(ebkVar) ? 65536 : 131072;
        }
        if (hmlVarC.J((74899 & i2) != 74898, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            float fFloor = (float) Math.floor(((kio) hmlVarC.e(jmh.e)).en(2.0f));
            jue jueVarA = juf.a(z);
            if (fdapVar != null) {
                hmlVarC.v(2066151958);
                boolean z3 = (i2 & 112) == 32;
                boolean z4 = (i2 & 14) == 4;
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                if ((z3 | z4) || objS == hmk.a) {
                    objS = new fdae() { // from class: gbr
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdapVar.invoke(Boolean.valueOf(!z));
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS);
                }
                fdaeVar = (fdae) objS;
                hmwVar.ab();
            } else {
                hmlVarC.v(2066217647);
                ((hmw) hmlVarC).ab();
                fdaeVar = null;
            }
            hmlVar2 = hmlVarC;
            c(jueVarA, fdaeVar, new ind(fFloor, 0.0f, 2, 0, 26), new ind(fFloor, 0.0f, 0, 0, 30), icsVar, z2, gbnVar, ebkVar, hmlVar2, (i2 << 6) & 33546240);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gbs
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z5 = z;
                    fdap fdapVar2 = fdapVar;
                    ics icsVar2 = icsVar;
                    boolean z6 = z2;
                    gbn gbnVar2 = gbnVar;
                    gbv.b(z5, fdapVar2, icsVar2, z6, gbnVar2, ebkVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final jue jueVar, final fdae fdaeVar, final ind indVar, final ind indVar2, final ics icsVar, final boolean z, final gbn gbnVar, final ebk ebkVar, hml hmlVar, final int i) {
        int i2;
        boolean z2;
        hml hmlVar2;
        ics triStateToggleableElement;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-406243761);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(jueVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(indVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(indVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            z2 = z;
            i2 |= true != hmlVarC.E(z2) ? 65536 : 131072;
        } else {
            z2 = z;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.D(gbnVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.D(ebkVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i4 = i2;
        if (hmlVarC.J((4793491 & i4) != 4793490, i4 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            if (fdaeVar != null) {
                ico icoVar = ics.e;
                float f = hlj.a;
                dnk dnkVarA = grb.a(false, hlj.a / 2.0f, 0L, 4);
                jrw jrwVar = new jrw(1);
                triStateToggleableElement = dnkVarA instanceof dnk ? new TriStateToggleableElement(jueVar, ebkVar, dnkVarA, z2, jrwVar, fdaeVar) : dnkVarA == null ? new TriStateToggleableElement(jueVar, ebkVar, null, z, jrwVar, fdaeVar) : ebkVar != null ? dnh.a(icoVar, ebkVar, dnkVarA).a(new TriStateToggleableElement(jueVar, ebkVar, null, z, jrwVar, fdaeVar)) : icj.g(icoVar, new eux(dnkVarA, jueVar, z, jrwVar, fdaeVar));
            } else {
                triStateToggleableElement = ics.e;
            }
            int i5 = i4 << 6;
            hmlVar2 = hmlVarC;
            a(z, jueVar, efy.d(icsVar.a(fdaeVar != null ? gks.a(ics.e) : ics.e).a(triStateToggleableElement), 2.0f), gbnVar, indVar, indVar2, hmlVar2, ((i4 >> 15) & 14) | ((i4 << 3) & 112) | ((i4 >> 9) & 7168) | (57344 & i5) | (458752 & i5));
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gbq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    jue jueVar2 = jueVar;
                    fdae fdaeVar2 = fdaeVar;
                    ind indVar3 = indVar;
                    ind indVar4 = indVar2;
                    ics icsVar2 = icsVar;
                    boolean z3 = z;
                    gbn gbnVar2 = gbnVar;
                    gbv.c(jueVar2, fdaeVar2, indVar3, indVar4, icsVar2, z3, gbnVar2, ebkVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
