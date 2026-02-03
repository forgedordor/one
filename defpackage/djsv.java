package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConfig;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djsv {
    /* JADX WARN: Removed duplicated region for block: B:100:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final android.net.Uri r29, final java.lang.String r30, final defpackage.ics r31, final android.net.Uri r32, android.net.Uri r33, final defpackage.iby r34, final defpackage.iva r35, final float r36, final java.lang.Integer r37, final java.lang.Integer r38, final j$.time.Duration r39, final java.lang.String r40, final java.lang.String r41, final defpackage.djse r42, final defpackage.rok r43, defpackage.hml r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djsv.a(android.net.Uri, java.lang.String, ics, android.net.Uri, android.net.Uri, iby, iva, float, java.lang.Integer, java.lang.Integer, j$.time.Duration, java.lang.String, java.lang.String, djse, rok, hml, int, int, int):void");
    }

    public static final void b(final Uri uri, final String str, final ics icsVar, final Uri uri2, final Uri uri3, final iby ibyVar, final iva ivaVar, final float f, final Integer num, final Integer num2, final Duration duration, final String str2, final String str3, final djse djseVar, final rok rokVar, hml hmlVar, final int i, final int i2) {
        int i3;
        int i4;
        boolean z;
        String str4;
        boolean z2;
        hml hmlVar2;
        hmw hmwVar;
        hml hmlVar3;
        int i5 = i & 6;
        hml hmlVarC = hmlVar.c(1543883858);
        if (i5 == 0) {
            i3 = (true != hmlVarC.F(uri) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.F(uri2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.F(uri3) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i3 |= true != hmlVarC.E(false) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i3 |= true != hmlVarC.D(ibyVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != hmlVarC.D(ivaVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((i & 100663296) == 0) {
            i3 |= true != hmlVarC.A(f) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((i & 805306368) == 0) {
            i3 |= true != hmlVarC.D(null) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = (true != hmlVarC.D(num) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i4;
        if ((i2 & 48) == 0) {
            i4 = i7 | (true == hmlVarC.D(num2) ? 32 : 16);
        }
        if ((i2 & 384) == 0) {
            z = true;
            i4 |= true == hmlVarC.F(duration) ? 256 : 128;
        } else {
            z = true;
        }
        int i8 = i4;
        if ((i2 & 3072) == 0) {
            i4 = i8 | (z == hmlVarC.E(false) ? 2048 : 1024);
        }
        if ((i2 & 24576) == 0) {
            i4 |= z == hmlVarC.D(str2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            str4 = str3;
            i4 |= z != hmlVarC.D(str4) ? 65536 : 131072;
        } else {
            str4 = str3;
        }
        if ((i2 & 1572864) == 0) {
            z2 = true;
            i4 |= true != ((i2 & 2097152) == 0 ? hmlVarC.D(djseVar) : hmlVarC.F(djseVar)) ? 524288 : 1048576;
        } else {
            z2 = true;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= z2 != hmlVarC.F(rokVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((i6 & 306783379) == 306783378 && (4793491 & i4) == 4793490 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar3 = hmlVarC;
        } else {
            final cqwi cqwiVar = (cqwi) hmlVarC.e(djrx.a);
            ics icsVarA = str2 != null ? icsVar.a(joj.a(ics.e, str2)) : icsVar;
            hmlVarC.v(-1224400529);
            boolean zF = ((3670016 & i4) == 1048576 || ((2097152 & i4) != 0 && hmlVarC.F(djseVar))) | ((i4 & 14) == 4) | ((i4 & 112) == 32) | hmlVarC.F(uri) | hmlVarC.F(duration) | ((i4 & 458752) == 131072) | hmlVarC.F(cqwiVar) | hmlVarC.F(uri3) | ((i6 & 458752) == 131072) | ((i4 & 7168) == 2048) | hmlVarC.F(uri2) | hmlVarC.F(rokVar);
            hmw hmwVar2 = (hmw) hmlVarC;
            Object objS = hmwVar2.S();
            if (zF || objS == hmk.a) {
                hmlVar2 = hmlVarC;
                final String str5 = str4;
                hmwVar = hmwVar2;
                fdap fdapVar = new fdap() { // from class: djsr
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        Integer num3;
                        rbr rbrVarA = (rbr) obj;
                        rbrVarA.getClass();
                        djse djseVar2 = djseVar;
                        Uri uri4 = uri;
                        Integer num4 = num;
                        if (num4 != null && (num3 = num2) != null) {
                            if (uri4 != null && djseVar2 != null) {
                                djseVar2.a(uri4, num4.intValue(), num3.intValue());
                            }
                            rta rtaVarQ = rbrVarA.Q(num4.intValue(), num3.intValue());
                            rtaVarQ.getClass();
                            rbrVarA = (rbr) rtaVarQ;
                        }
                        Duration duration2 = duration;
                        if (duration2 != null) {
                            rta rtaVarK = rbrVarA.K(duration2.toNanos() / 1000);
                            rtaVarK.getClass();
                            rbrVarA = (rbr) rtaVarK;
                        }
                        String str6 = str5;
                        if (str6 != null) {
                            rta rtaVarW = rbrVarA.W(new ruq(str6));
                            rtaVarW.getClass();
                            rbrVarA = (rbr) rtaVarW;
                        }
                        Uri uri5 = uri3;
                        if (uri5 != null) {
                            cqwi cqwiVar2 = cqwiVar;
                            ((ekrd) cqwi.a.e().h("com/google/android/apps/messaging/shared/util/media/image/TikTokGlideImageManager", "applyThumbnail", 45, "TikTokGlideImageManager.kt")).t("Applying thumbnail with uri: %s", uri5);
                            rbr rbrVarD = cqwiVar2.b.d(uri5);
                            rbrVarD.getClass();
                            rta rtaVarAf = rbrVarD.af();
                            rtaVarAf.getClass();
                            rbr rbrVar = (rbr) ((rbr) rtaVarAf).Q(Integer.MIN_VALUE, Integer.MIN_VALUE);
                            rbrVar.getClass();
                            rbrVarA = rbrVarA.o(rbrVar.a(null));
                            rbrVarA.getClass();
                        }
                        Uri uri6 = uri2;
                        if (uri6 != null) {
                            rbrVarA = rbrVarA.e(uri6);
                            rbrVarA.getClass();
                        }
                        if (djseVar2 != null) {
                            djseVar2.c(uri4);
                            rbrVarA = rbrVarA.a(new djsu(djseVar2));
                            rbrVarA.getClass();
                        }
                        rok rokVar2 = rokVar;
                        if (rokVar2 == null) {
                            return rbrVarA;
                        }
                        rta rtaVarF = rbrVarA.F(rokVar2);
                        rtaVarF.getClass();
                        return (rbr) rtaVarF;
                    }
                };
                hmwVar.af(fdapVar);
                objS = fdapVar;
            } else {
                hmwVar = hmwVar2;
                hmlVar2 = hmlVarC;
            }
            hmwVar.ab();
            int i9 = i6 >> 9;
            hmlVar3 = hmlVar2;
            rcy.a(uri, str, icsVarA, ibyVar, ivaVar, f, null, null, (fdap) objS, hmlVar3, (i9 & 57344) | (i9 & 7168) | (i6 & 126) | (i9 & 458752) | (3670016 & i9), 384);
        }
        hpx hpxVarL = hmlVar3.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djss
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Uri uri4 = uri;
                    String str6 = str;
                    ics icsVar2 = icsVar;
                    Uri uri5 = uri2;
                    Uri uri6 = uri3;
                    iby ibyVar2 = ibyVar;
                    iva ivaVar2 = ivaVar;
                    float f2 = f;
                    Integer num3 = num;
                    Integer num4 = num2;
                    Duration duration2 = duration;
                    String str7 = str2;
                    String str8 = str3;
                    djse djseVar2 = djseVar;
                    int i10 = i;
                    djsv.b(uri4, str6, icsVar2, uri5, uri6, ibyVar2, ivaVar2, f2, num3, num4, duration2, str7, str8, djseVar2, rokVar, (hml) obj, hpy.a(i10 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }
}
