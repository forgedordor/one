package defpackage;

import android.os.health.HealthStats;
import android.os.health.TimerStat;
import com.android.vcard.VCardConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzkq {
    public static long a(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            return 0L;
        }
        return healthStats.getMeasurement(i);
    }

    public static List b(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasTimers(i)) ? Collections.EMPTY_LIST : dzkp.a.d(healthStats.getTimers(i));
    }

    public static Map c(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasStats(i)) ? Collections.EMPTY_MAP : healthStats.getStats(i);
    }

    public static fecy d(String str) {
        fecx fecxVar = (fecx) fecy.a.createBuilder();
        fecxVar.copyOnWrite();
        fecy fecyVar = (fecy) fecxVar.instance;
        fecyVar.b |= 2;
        fecyVar.d = str;
        return (fecy) fecxVar.build();
    }

    public static fedi e(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return g(null, healthStats.getTimer(i));
    }

    static fedi f(fedi fediVar, fedi fediVar2) {
        if (fediVar == null || fediVar2 == null) {
            return fediVar;
        }
        int i = fediVar.c - fediVar2.c;
        long j = fediVar.d - fediVar2.d;
        if (i == 0) {
            if (j == 0) {
                return null;
            }
            i = 0;
        }
        fedh fedhVar = (fedh) fedi.a.createBuilder();
        if ((fediVar.b & 4) != 0) {
            fecy fecyVar = fediVar.e;
            if (fecyVar == null) {
                fecyVar = fecy.a;
            }
            fedhVar.copyOnWrite();
            fedi fediVar3 = (fedi) fedhVar.instance;
            fecyVar.getClass();
            fediVar3.e = fecyVar;
            fediVar3.b |= 4;
        }
        fedhVar.copyOnWrite();
        fedi fediVar4 = (fedi) fedhVar.instance;
        fediVar4.b |= 1;
        fediVar4.c = i;
        fedhVar.copyOnWrite();
        fedi fediVar5 = (fedi) fedhVar.instance;
        fediVar5.b |= 2;
        fediVar5.d = j;
        return (fedi) fedhVar.build();
    }

    public static fedi g(String str, TimerStat timerStat) {
        fedh fedhVar = (fedh) fedi.a.createBuilder();
        int count = timerStat.getCount();
        fedhVar.copyOnWrite();
        fedi fediVar = (fedi) fedhVar.instance;
        fediVar.b |= 1;
        fediVar.c = count;
        long time = timerStat.getTime();
        fedhVar.copyOnWrite();
        fedi fediVar2 = (fedi) fedhVar.instance;
        fediVar2.b |= 2;
        fediVar2.d = time;
        if (fediVar2.c < 0) {
            fedhVar.copyOnWrite();
            fedi fediVar3 = (fedi) fedhVar.instance;
            fediVar3.b |= 1;
            fediVar3.c = 0;
        }
        if (str != null) {
            fecy fecyVarD = d(str);
            fedhVar.copyOnWrite();
            fedi fediVar4 = (fedi) fedhVar.instance;
            fecyVarD.getClass();
            fediVar4.e = fecyVarD;
            fediVar4.b |= 4;
        }
        fedi fediVar5 = (fedi) fedhVar.instance;
        if (fediVar5.c == 0 && fediVar5.d == 0) {
            return null;
        }
        return (fedi) fedhVar.build();
    }

    static fedk h(fedk fedkVar, fedk fedkVar2) {
        fedi fediVar;
        fedi fediVar2;
        fedi fediVar3;
        fedi fediVar4;
        fedi fediVar5;
        fedi fediVar6;
        fedi fediVar7;
        fedi fediVar8;
        fedi fediVar9;
        fedi fediVar10;
        fedi fediVar11;
        fedi fediVar12;
        fedi fediVar13;
        fedi fediVar14;
        fedi fediVar15;
        fedi fediVar16;
        fedi fediVar17;
        fedi fediVar18;
        fedi fediVar19;
        fedi fediVar20;
        fedi fediVar21;
        fedi fediVar22;
        fedi fediVar23;
        fedi fediVar24;
        fedi fediVar25;
        fedi fediVar26;
        fedi fediVar27;
        fedi fediVar28;
        fedi fediVar29;
        fedi fediVar30;
        fedi fediVar31;
        fedi fediVar32;
        if (fedkVar == null || fedkVar2 == null) {
            return fedkVar;
        }
        fedj fedjVar = (fedj) fedk.a.createBuilder();
        if ((fedkVar.b & 1) != 0) {
            long j = fedkVar.d - fedkVar2.d;
            if (j != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar3 = (fedk) fedjVar.instance;
                fedkVar3.b |= 1;
                fedkVar3.d = j;
            }
        }
        if ((fedkVar.b & 2) != 0) {
            long j2 = fedkVar.e - fedkVar2.e;
            if (j2 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar4 = (fedk) fedjVar.instance;
                fedkVar4.b |= 2;
                fedkVar4.e = j2;
            }
        }
        if ((fedkVar.b & 4) != 0) {
            long j3 = fedkVar.f - fedkVar2.f;
            if (j3 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar5 = (fedk) fedjVar.instance;
                fedkVar5.b |= 4;
                fedkVar5.f = j3;
            }
        }
        if ((fedkVar.b & 8) != 0) {
            long j4 = fedkVar.g - fedkVar2.g;
            if (j4 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar6 = (fedk) fedjVar.instance;
                fedkVar6.b |= 8;
                fedkVar6.g = j4;
            }
        }
        dzkp dzkpVar = dzkp.a;
        fedjVar.n(dzkpVar.e(fedkVar.h, fedkVar2.h));
        fedjVar.o(dzkpVar.e(fedkVar.i, fedkVar2.i));
        fedjVar.p(dzkpVar.e(fedkVar.j, fedkVar2.j));
        fedjVar.m(dzkpVar.e(fedkVar.k, fedkVar2.k));
        fedjVar.l(dzkpVar.e(fedkVar.l, fedkVar2.l));
        fedjVar.h(dzkpVar.e(fedkVar.m, fedkVar2.m));
        if ((fedkVar.b & 16) != 0) {
            fediVar = fedkVar.n;
            if (fediVar == null) {
                fediVar = fedi.a;
            }
        } else {
            fediVar = null;
        }
        if ((fedkVar2.b & 16) != 0) {
            fediVar2 = fedkVar2.n;
            if (fediVar2 == null) {
                fediVar2 = fedi.a;
            }
        } else {
            fediVar2 = null;
        }
        fedi fediVarF = f(fediVar, fediVar2);
        if (fediVarF != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar7 = (fedk) fedjVar.instance;
            fedkVar7.n = fediVarF;
            fedkVar7.b |= 16;
        }
        fedjVar.i(dzkpVar.e(fedkVar.o, fedkVar2.o));
        fedjVar.k(dzkm.a.e(fedkVar.q, fedkVar2.q));
        fedjVar.j(dzkl.a.e(fedkVar.r, fedkVar2.r));
        if ((fedkVar.b & 32) != 0) {
            long j5 = fedkVar.s - fedkVar2.s;
            if (j5 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar8 = (fedk) fedjVar.instance;
                fedkVar8.b |= 32;
                fedkVar8.s = j5;
            }
        }
        if ((fedkVar.b & 64) != 0) {
            long j6 = fedkVar.t - fedkVar2.t;
            if (j6 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar9 = (fedk) fedjVar.instance;
                fedkVar9.b |= 64;
                fedkVar9.t = j6;
            }
        }
        if ((fedkVar.b & 128) != 0) {
            long j7 = fedkVar.u - fedkVar2.u;
            if (j7 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar10 = (fedk) fedjVar.instance;
                fedkVar10.b |= 128;
                fedkVar10.u = j7;
            }
        }
        if ((fedkVar.b & 256) != 0) {
            long j8 = fedkVar.v - fedkVar2.v;
            if (j8 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar11 = (fedk) fedjVar.instance;
                fedkVar11.b |= 256;
                fedkVar11.v = j8;
            }
        }
        if ((fedkVar.b & 512) != 0) {
            long j9 = fedkVar.w - fedkVar2.w;
            if (j9 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar12 = (fedk) fedjVar.instance;
                fedkVar12.b |= 512;
                fedkVar12.w = j9;
            }
        }
        if ((fedkVar.b & 1024) != 0) {
            long j10 = fedkVar.x - fedkVar2.x;
            if (j10 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar13 = (fedk) fedjVar.instance;
                fedkVar13.b |= 1024;
                fedkVar13.x = j10;
            }
        }
        if ((fedkVar.b & 2048) != 0) {
            long j11 = fedkVar.y - fedkVar2.y;
            if (j11 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar14 = (fedk) fedjVar.instance;
                fedkVar14.b |= 2048;
                fedkVar14.y = j11;
            }
        }
        if ((fedkVar.b & 4096) != 0) {
            long j12 = fedkVar.z - fedkVar2.z;
            if (j12 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar15 = (fedk) fedjVar.instance;
                fedkVar15.b |= 4096;
                fedkVar15.z = j12;
            }
        }
        if ((fedkVar.b & 8192) != 0) {
            long j13 = fedkVar.A - fedkVar2.A;
            if (j13 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar16 = (fedk) fedjVar.instance;
                fedkVar16.b |= 8192;
                fedkVar16.A = j13;
            }
        }
        if ((fedkVar.b & 16384) != 0) {
            long j14 = fedkVar.B - fedkVar2.B;
            if (j14 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar17 = (fedk) fedjVar.instance;
                fedkVar17.b |= 16384;
                fedkVar17.B = j14;
            }
        }
        if ((fedkVar.b & 32768) != 0) {
            long j15 = fedkVar.C - fedkVar2.C;
            if (j15 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar18 = (fedk) fedjVar.instance;
                fedkVar18.b |= 32768;
                fedkVar18.C = j15;
            }
        }
        if ((fedkVar.b & 65536) != 0) {
            long j16 = fedkVar.D - fedkVar2.D;
            if (j16 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar19 = (fedk) fedjVar.instance;
                fedkVar19.b |= 65536;
                fedkVar19.D = j16;
            }
        }
        if ((fedkVar.b & 131072) != 0) {
            long j17 = fedkVar.E - fedkVar2.E;
            if (j17 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar20 = (fedk) fedjVar.instance;
                fedkVar20.b |= 131072;
                fedkVar20.E = j17;
            }
        }
        if ((fedkVar.b & 262144) != 0) {
            long j18 = fedkVar.F - fedkVar2.F;
            if (j18 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar21 = (fedk) fedjVar.instance;
                fedkVar21.b |= 262144;
                fedkVar21.F = j18;
            }
        }
        if ((fedkVar.b & 524288) != 0) {
            fediVar3 = fedkVar.G;
            if (fediVar3 == null) {
                fediVar3 = fedi.a;
            }
        } else {
            fediVar3 = null;
        }
        if ((fedkVar2.b & 524288) != 0) {
            fediVar4 = fedkVar2.G;
            if (fediVar4 == null) {
                fediVar4 = fedi.a;
            }
        } else {
            fediVar4 = null;
        }
        fedi fediVarF2 = f(fediVar3, fediVar4);
        if (fediVarF2 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar22 = (fedk) fedjVar.instance;
            fedkVar22.G = fediVarF2;
            fedkVar22.b |= 524288;
        }
        if ((fedkVar.b & 1048576) != 0) {
            long j19 = fedkVar.H - fedkVar2.H;
            if (j19 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar23 = (fedk) fedjVar.instance;
                fedkVar23.b |= 1048576;
                fedkVar23.H = j19;
            }
        }
        if ((fedkVar.b & 2097152) != 0) {
            fediVar5 = fedkVar.I;
            if (fediVar5 == null) {
                fediVar5 = fedi.a;
            }
        } else {
            fediVar5 = null;
        }
        if ((fedkVar2.b & 2097152) != 0) {
            fediVar6 = fedkVar2.I;
            if (fediVar6 == null) {
                fediVar6 = fedi.a;
            }
        } else {
            fediVar6 = null;
        }
        fedi fediVarF3 = f(fediVar5, fediVar6);
        if (fediVarF3 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar24 = (fedk) fedjVar.instance;
            fedkVar24.I = fediVarF3;
            fedkVar24.b |= 2097152;
        }
        if ((fedkVar.b & 4194304) != 0) {
            fediVar7 = fedkVar.J;
            if (fediVar7 == null) {
                fediVar7 = fedi.a;
            }
        } else {
            fediVar7 = null;
        }
        if ((fedkVar2.b & 4194304) != 0) {
            fediVar8 = fedkVar2.J;
            if (fediVar8 == null) {
                fediVar8 = fedi.a;
            }
        } else {
            fediVar8 = null;
        }
        fedi fediVarF4 = f(fediVar7, fediVar8);
        if (fediVarF4 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar25 = (fedk) fedjVar.instance;
            fedkVar25.J = fediVarF4;
            fedkVar25.b |= 4194304;
        }
        if ((fedkVar.b & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) != 0) {
            fediVar9 = fedkVar.K;
            if (fediVar9 == null) {
                fediVar9 = fedi.a;
            }
        } else {
            fediVar9 = null;
        }
        if ((fedkVar2.b & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) != 0) {
            fediVar10 = fedkVar2.K;
            if (fediVar10 == null) {
                fediVar10 = fedi.a;
            }
        } else {
            fediVar10 = null;
        }
        fedi fediVarF5 = f(fediVar9, fediVar10);
        if (fediVarF5 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar26 = (fedk) fedjVar.instance;
            fedkVar26.K = fediVarF5;
            fedkVar26.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((fedkVar.b & 16777216) != 0) {
            fediVar11 = fedkVar.L;
            if (fediVar11 == null) {
                fediVar11 = fedi.a;
            }
        } else {
            fediVar11 = null;
        }
        if ((fedkVar2.b & 16777216) != 0) {
            fediVar12 = fedkVar2.L;
            if (fediVar12 == null) {
                fediVar12 = fedi.a;
            }
        } else {
            fediVar12 = null;
        }
        fedi fediVarF6 = f(fediVar11, fediVar12);
        if (fediVarF6 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar27 = (fedk) fedjVar.instance;
            fedkVar27.L = fediVarF6;
            fedkVar27.b |= 16777216;
        }
        if ((fedkVar.b & VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) != 0) {
            fediVar13 = fedkVar.M;
            if (fediVar13 == null) {
                fediVar13 = fedi.a;
            }
        } else {
            fediVar13 = null;
        }
        if ((fedkVar2.b & VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) != 0) {
            fediVar14 = fedkVar2.M;
            if (fediVar14 == null) {
                fediVar14 = fedi.a;
            }
        } else {
            fediVar14 = null;
        }
        fedi fediVarF7 = f(fediVar13, fediVar14);
        if (fediVarF7 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar28 = (fedk) fedjVar.instance;
            fedkVar28.M = fediVarF7;
            fedkVar28.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        if ((fedkVar.b & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0) {
            fediVar15 = fedkVar.N;
            if (fediVar15 == null) {
                fediVar15 = fedi.a;
            }
        } else {
            fediVar15 = null;
        }
        if ((fedkVar2.b & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0) {
            fediVar16 = fedkVar2.N;
            if (fediVar16 == null) {
                fediVar16 = fedi.a;
            }
        } else {
            fediVar16 = null;
        }
        fedi fediVarF8 = f(fediVar15, fediVar16);
        if (fediVarF8 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar29 = (fedk) fedjVar.instance;
            fedkVar29.N = fediVarF8;
            fedkVar29.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((fedkVar.b & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0) {
            fediVar17 = fedkVar.O;
            if (fediVar17 == null) {
                fediVar17 = fedi.a;
            }
        } else {
            fediVar17 = null;
        }
        if ((fedkVar2.b & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0) {
            fediVar18 = fedkVar2.O;
            if (fediVar18 == null) {
                fediVar18 = fedi.a;
            }
        } else {
            fediVar18 = null;
        }
        fedi fediVarF9 = f(fediVar17, fediVar18);
        if (fediVarF9 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar30 = (fedk) fedjVar.instance;
            fedkVar30.O = fediVarF9;
            fedkVar30.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        }
        if ((fedkVar.b & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0) {
            fediVar19 = fedkVar.P;
            if (fediVar19 == null) {
                fediVar19 = fedi.a;
            }
        } else {
            fediVar19 = null;
        }
        if ((fedkVar2.b & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0) {
            fediVar20 = fedkVar2.P;
            if (fediVar20 == null) {
                fediVar20 = fedi.a;
            }
        } else {
            fediVar20 = null;
        }
        fedi fediVarF10 = f(fediVar19, fediVar20);
        if (fediVarF10 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar31 = (fedk) fedjVar.instance;
            fedkVar31.P = fediVarF10;
            fedkVar31.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        }
        if ((fedkVar.b & 536870912) != 0) {
            fediVar21 = fedkVar.Q;
            if (fediVar21 == null) {
                fediVar21 = fedi.a;
            }
        } else {
            fediVar21 = null;
        }
        if ((fedkVar2.b & 536870912) != 0) {
            fediVar22 = fedkVar2.Q;
            if (fediVar22 == null) {
                fediVar22 = fedi.a;
            }
        } else {
            fediVar22 = null;
        }
        fedi fediVarF11 = f(fediVar21, fediVar22);
        if (fediVarF11 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar32 = (fedk) fedjVar.instance;
            fedkVar32.Q = fediVarF11;
            fedkVar32.b |= 536870912;
        }
        if ((fedkVar.b & 1073741824) != 0) {
            fediVar23 = fedkVar.R;
            if (fediVar23 == null) {
                fediVar23 = fedi.a;
            }
        } else {
            fediVar23 = null;
        }
        if ((fedkVar2.b & 1073741824) != 0) {
            fediVar24 = fedkVar2.R;
            if (fediVar24 == null) {
                fediVar24 = fedi.a;
            }
        } else {
            fediVar24 = null;
        }
        fedi fediVarF12 = f(fediVar23, fediVar24);
        if (fediVarF12 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar33 = (fedk) fedjVar.instance;
            fedkVar33.R = fediVarF12;
            fedkVar33.b |= 1073741824;
        }
        if ((fedkVar.b & Integer.MIN_VALUE) != 0) {
            fediVar25 = fedkVar.S;
            if (fediVar25 == null) {
                fediVar25 = fedi.a;
            }
        } else {
            fediVar25 = null;
        }
        if ((fedkVar2.b & Integer.MIN_VALUE) != 0) {
            fediVar26 = fedkVar2.S;
            if (fediVar26 == null) {
                fediVar26 = fedi.a;
            }
        } else {
            fediVar26 = null;
        }
        fedi fediVarF13 = f(fediVar25, fediVar26);
        if (fediVarF13 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar34 = (fedk) fedjVar.instance;
            fedkVar34.S = fediVarF13;
            fedkVar34.b |= Integer.MIN_VALUE;
        }
        if ((fedkVar.c & 1) != 0) {
            fediVar27 = fedkVar.T;
            if (fediVar27 == null) {
                fediVar27 = fedi.a;
            }
        } else {
            fediVar27 = null;
        }
        if ((fedkVar2.c & 1) != 0) {
            fediVar28 = fedkVar2.T;
            if (fediVar28 == null) {
                fediVar28 = fedi.a;
            }
        } else {
            fediVar28 = null;
        }
        fedi fediVarF14 = f(fediVar27, fediVar28);
        if (fediVarF14 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar35 = (fedk) fedjVar.instance;
            fedkVar35.T = fediVarF14;
            fedkVar35.c |= 1;
        }
        if ((fedkVar.c & 2) != 0) {
            fediVar29 = fedkVar.U;
            if (fediVar29 == null) {
                fediVar29 = fedi.a;
            }
        } else {
            fediVar29 = null;
        }
        if ((fedkVar2.c & 2) != 0) {
            fediVar30 = fedkVar2.U;
            if (fediVar30 == null) {
                fediVar30 = fedi.a;
            }
        } else {
            fediVar30 = null;
        }
        fedi fediVarF15 = f(fediVar29, fediVar30);
        if (fediVarF15 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar36 = (fedk) fedjVar.instance;
            fedkVar36.U = fediVarF15;
            fedkVar36.c |= 2;
        }
        if ((fedkVar.c & 4) != 0) {
            long j20 = fedkVar.V - fedkVar2.V;
            if (j20 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar37 = (fedk) fedjVar.instance;
                fedkVar37.c |= 4;
                fedkVar37.V = j20;
            }
        }
        if ((fedkVar.c & 8) != 0) {
            long j21 = fedkVar.W - fedkVar2.W;
            if (j21 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar38 = (fedk) fedjVar.instance;
                fedkVar38.c |= 8;
                fedkVar38.W = j21;
            }
        }
        if ((fedkVar.c & 16) != 0) {
            long j22 = fedkVar.X - fedkVar2.X;
            if (j22 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar39 = (fedk) fedjVar.instance;
                fedkVar39.c |= 16;
                fedkVar39.X = j22;
            }
        }
        if ((fedkVar.c & 32) != 0) {
            long j23 = fedkVar.Y - fedkVar2.Y;
            if (j23 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar40 = (fedk) fedjVar.instance;
                fedkVar40.c |= 32;
                fedkVar40.Y = j23;
            }
        }
        if ((fedkVar.c & 64) != 0) {
            long j24 = fedkVar.Z - fedkVar2.Z;
            if (j24 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar41 = (fedk) fedjVar.instance;
                fedkVar41.c |= 64;
                fedkVar41.Z = j24;
            }
        }
        if ((fedkVar.c & 128) != 0) {
            long j25 = fedkVar.aa - fedkVar2.aa;
            if (j25 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar42 = (fedk) fedjVar.instance;
                fedkVar42.c |= 128;
                fedkVar42.aa = j25;
            }
        }
        if ((fedkVar.c & 256) != 0) {
            long j26 = fedkVar.ab - fedkVar2.ab;
            if (j26 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar43 = (fedk) fedjVar.instance;
                fedkVar43.c |= 256;
                fedkVar43.ab = j26;
            }
        }
        if ((fedkVar.c & 512) != 0) {
            long j27 = fedkVar.ac - fedkVar2.ac;
            if (j27 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar44 = (fedk) fedjVar.instance;
                fedkVar44.c |= 512;
                fedkVar44.ac = j27;
            }
        }
        if ((fedkVar.c & 1024) != 0) {
            long j28 = fedkVar.ad - fedkVar2.ad;
            if (j28 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar45 = (fedk) fedjVar.instance;
                fedkVar45.c |= 1024;
                fedkVar45.ad = j28;
            }
        }
        if ((fedkVar.c & 2048) != 0) {
            long j29 = fedkVar.ae - fedkVar2.ae;
            if (j29 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar46 = (fedk) fedjVar.instance;
                fedkVar46.c |= 2048;
                fedkVar46.ae = j29;
            }
        }
        if ((fedkVar.c & 4096) != 0) {
            long j30 = fedkVar.af - fedkVar2.af;
            if (j30 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar47 = (fedk) fedjVar.instance;
                fedkVar47.c |= 4096;
                fedkVar47.af = j30;
            }
        }
        if ((fedkVar.c & 8192) != 0) {
            long j31 = fedkVar.ag - fedkVar2.ag;
            if (j31 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar48 = (fedk) fedjVar.instance;
                fedkVar48.c |= 8192;
                fedkVar48.ag = j31;
            }
        }
        if ((fedkVar.c & 16384) != 0) {
            long j32 = fedkVar.ah - fedkVar2.ah;
            if (j32 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar49 = (fedk) fedjVar.instance;
                fedkVar49.c |= 16384;
                fedkVar49.ah = j32;
            }
        }
        if ((fedkVar.c & 32768) != 0) {
            long j33 = fedkVar.ai - fedkVar2.ai;
            if (j33 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar50 = (fedk) fedjVar.instance;
                fedkVar50.c = 32768 | fedkVar50.c;
                fedkVar50.ai = j33;
            }
        }
        if ((fedkVar.c & 65536) != 0) {
            long j34 = fedkVar.aj - fedkVar2.aj;
            if (j34 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar51 = (fedk) fedjVar.instance;
                fedkVar51.c |= 65536;
                fedkVar51.aj = j34;
            }
        }
        if ((fedkVar.c & 131072) != 0) {
            fediVar31 = fedkVar.ak;
            if (fediVar31 == null) {
                fediVar31 = fedi.a;
            }
        } else {
            fediVar31 = null;
        }
        if ((fedkVar2.c & 131072) != 0) {
            fediVar32 = fedkVar2.ak;
            if (fediVar32 == null) {
                fediVar32 = fedi.a;
            }
        } else {
            fediVar32 = null;
        }
        fedi fediVarF16 = f(fediVar31, fediVar32);
        if (fediVarF16 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar52 = (fedk) fedjVar.instance;
            fedkVar52.ak = fediVarF16;
            fedkVar52.c |= 131072;
        }
        if ((fedkVar.c & 262144) != 0) {
            long j35 = fedkVar.al - fedkVar2.al;
            if (j35 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar53 = (fedk) fedjVar.instance;
                fedkVar53.c |= 262144;
                fedkVar53.al = j35;
            }
        }
        if ((fedkVar.c & 524288) != 0) {
            long j36 = fedkVar.am - fedkVar2.am;
            if (j36 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar54 = (fedk) fedjVar.instance;
                fedkVar54.c |= 524288;
                fedkVar54.am = j36;
            }
        }
        if ((fedkVar.c & 1048576) != 0) {
            long j37 = fedkVar.an - fedkVar2.an;
            if (j37 != 0) {
                fedjVar.copyOnWrite();
                fedk fedkVar55 = (fedk) fedjVar.instance;
                fedkVar55.c |= 1048576;
                fedkVar55.an = j37;
            }
        }
        fedk fedkVar56 = (fedk) fedjVar.build();
        if (fedkVar56 == null || (fedkVar56.d <= 0 && fedkVar56.e <= 0 && fedkVar56.f <= 0 && fedkVar56.g <= 0 && fedkVar56.h.size() == 0 && fedkVar56.i.size() == 0 && fedkVar56.j.size() == 0 && fedkVar56.k.size() == 0 && fedkVar56.l.size() == 0 && fedkVar56.m.size() == 0 && fedkVar56.o.size() == 0 && fedkVar56.p.size() == 0 && fedkVar56.q.size() == 0 && fedkVar56.r.size() == 0 && fedkVar56.s <= 0 && fedkVar56.t <= 0 && fedkVar56.u <= 0 && fedkVar56.v <= 0 && fedkVar56.w <= 0 && fedkVar56.x <= 0 && fedkVar56.y <= 0 && fedkVar56.z <= 0 && fedkVar56.A <= 0 && fedkVar56.B <= 0 && fedkVar56.C <= 0 && fedkVar56.D <= 0 && fedkVar56.E <= 0 && fedkVar56.F <= 0 && fedkVar56.H <= 0 && fedkVar56.V <= 0 && fedkVar56.W <= 0 && fedkVar56.X <= 0 && fedkVar56.Y <= 0 && fedkVar56.Z <= 0 && fedkVar56.aa <= 0 && fedkVar56.ab <= 0 && fedkVar56.ac <= 0 && fedkVar56.ad <= 0 && fedkVar56.ae <= 0 && fedkVar56.af <= 0 && fedkVar56.ag <= 0 && fedkVar56.ah <= 0 && fedkVar56.ai <= 0 && fedkVar56.aj <= 0 && fedkVar56.al <= 0 && fedkVar56.am <= 0 && fedkVar56.an <= 0)) {
            return null;
        }
        return fedkVar56;
    }

    static boolean i(feda fedaVar) {
        if (fedaVar != null) {
            return fedaVar.c.size() == 0 && fedaVar.d.size() == 0;
        }
        return true;
    }

    static boolean j(fede fedeVar) {
        if (fedeVar != null) {
            return fedeVar.c <= 0 && fedeVar.d <= 0 && fedeVar.e <= 0 && fedeVar.f <= 0 && fedeVar.g <= 0 && fedeVar.h <= 0;
        }
        return true;
    }

    static boolean k(fedg fedgVar) {
        if (fedgVar != null) {
            return ((long) fedgVar.c) <= 0 && ((long) fedgVar.d) <= 0;
        }
        return true;
    }
}
