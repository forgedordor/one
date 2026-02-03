package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eehh {
    public static int a(int i, int i2) {
        int iD;
        double d;
        int iF;
        int iG;
        double[] dArr;
        double[] dArr2;
        double d2;
        double dSqrt;
        double[] dArrC;
        int i3 = eehi.b;
        int i4 = (i >> 16) & 255;
        eehm eehmVar = eehm.a;
        double dA = eehj.a(i4);
        int i5 = (i >> 8) & 255;
        double dA2 = eehj.a(i5);
        int i6 = i & 255;
        double dA3 = eehj.a(i6);
        double[][] dArr3 = eehi.a;
        double[] dArr4 = dArr3[0];
        double d3 = (0.41233895d * dA) + (0.35762064d * dA2) + (0.18051042d * dA3);
        double d4 = dArr4[0] * d3;
        double d5 = (0.2126d * dA) + (0.7152d * dA2) + (0.0722d * dA3);
        double d6 = dArr4[1] * d5;
        double d7 = (dA * 0.01932141d) + (dA2 * 0.11916382d) + (dA3 * 0.95034478d);
        double d8 = dArr4[2] * d7;
        double[] dArr5 = dArr3[1];
        double d9 = dArr5[0] * d3;
        double d10 = dArr5[1] * d5;
        double d11 = dArr5[2] * d7;
        double[] dArr6 = dArr3[2];
        double d12 = d3 * dArr6[0];
        double d13 = d5 * dArr6[1];
        double d14 = d7 * dArr6[2];
        double[] dArr7 = eehmVar.g;
        double d15 = dArr7[0] * (d4 + d6 + d8);
        double d16 = dArr7[1] * (d9 + d10 + d11);
        double d17 = dArr7[2] * (d12 + d13 + d14);
        double dPow = Math.pow((eehmVar.h * Math.abs(d15)) / 100.0d, 0.42d);
        double dPow2 = Math.pow((eehmVar.h * Math.abs(d16)) / 100.0d, 0.42d);
        double dPow3 = Math.pow((eehmVar.h * Math.abs(d17)) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d15) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d16) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d17) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d18 = (((dSignum * 11.0d) + ((-12.0d) * dSignum2)) + dSignum3) / 11.0d;
        double d19 = ((dSignum + dSignum2) - (dSignum3 + dSignum3)) / 9.0d;
        double degrees = Math.toDegrees(Math.atan2(d19, d18));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d20 = dSignum2 * 20.0d;
        double radians = Math.toRadians(degrees);
        double d21 = (((((40.0d * dSignum) + d20) + dSignum3) / 20.0d) * eehmVar.c) / eehmVar.b;
        double d22 = eehmVar.e;
        double dPow4 = Math.pow(d21, eehmVar.j * 0.69d) * 100.0d;
        double d23 = eehmVar.e;
        double d24 = dPow4 / 100.0d;
        Math.sqrt(d24);
        double d25 = eehmVar.b;
        double d26 = eehmVar.i;
        double dPow5 = Math.pow(1.64d - Math.pow(0.29d, eehmVar.f), 0.73d) * Math.pow((((((Math.cos(Math.toRadians(degrees < 20.14d ? degrees + 360.0d : degrees) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * eehmVar.d) * Math.hypot(d18, d19)) / (((((dSignum * 20.0d) + d20) + (dSignum3 * 21.0d)) / 20.0d) + 0.305d), 0.9d);
        double dSqrt2 = Math.sqrt(d24) * dPow5;
        double d27 = eehmVar.i * dSqrt2;
        double d28 = eehmVar.e;
        Math.sqrt((dPow5 * 0.69d) / (eehmVar.b + 4.0d));
        Math.log1p(d27 * 0.0228d);
        Math.cos(radians);
        Math.sin(radians);
        double d29 = eehl.c(new double[]{eehj.a(i4), eehj.a(i5), eehj.a(i6)}, eehj.a)[1] / 100.0d;
        double dPow6 = (d29 > 0.008856451679035631d ? Math.pow(d29, 0.3333333333333333d) : ((d29 * 903.2962962962963d) + 16.0d) / 116.0d) * 116.0d;
        int i7 = i2 & 255;
        int i8 = (i2 >> 16) & 255;
        eehm eehmVar2 = eehm.a;
        double dA4 = eehj.a(i8);
        int i9 = 1;
        int i10 = (i2 >> 8) & 255;
        double dA5 = eehj.a(i10);
        double dA6 = eehj.a(i7);
        double[][] dArr8 = eehi.a;
        double[] dArr9 = dArr8[0];
        double d30 = (0.41233895d * dA4) + (0.35762064d * dA5) + (0.18051042d * dA6);
        double d31 = dArr9[0] * d30;
        double d32 = (0.2126d * dA4) + (0.7152d * dA5) + (0.0722d * dA6);
        double d33 = dArr9[1] * d32;
        double d34 = (dA4 * 0.01932141d) + (dA5 * 0.11916382d) + (dA6 * 0.95034478d);
        double d35 = dArr9[2] * d34;
        double[] dArr10 = dArr8[1];
        double d36 = dArr10[0] * d30;
        double d37 = dArr10[1] * d32;
        double d38 = dArr10[2] * d34;
        double[] dArr11 = dArr8[2];
        double d39 = d30 * dArr11[0];
        double d40 = d32 * dArr11[1];
        double d41 = d34 * dArr11[2];
        double[] dArr12 = eehmVar2.g;
        double d42 = dArr12[0] * (d31 + d33 + d35);
        double d43 = dArr12[1] * (d36 + d37 + d38);
        double d44 = dArr12[2] * (d39 + d40 + d41);
        double dPow7 = Math.pow((eehmVar2.h * Math.abs(d42)) / 100.0d, 0.42d);
        double dPow8 = Math.pow((eehmVar2.h * Math.abs(d43)) / 100.0d, 0.42d);
        double dPow9 = Math.pow((eehmVar2.h * Math.abs(d44)) / 100.0d, 0.42d);
        double dSignum4 = ((Math.signum(d42) * 400.0d) * dPow7) / (dPow7 + 27.13d);
        double dSignum5 = ((Math.signum(d43) * 400.0d) * dPow8) / (dPow8 + 27.13d);
        double dSignum6 = ((Math.signum(d44) * 400.0d) * dPow9) / (dPow9 + 27.13d);
        double d45 = (((dSignum4 * 11.0d) + ((-12.0d) * dSignum5)) + dSignum6) / 11.0d;
        double d46 = ((dSignum4 + dSignum5) - (dSignum6 + dSignum6)) / 9.0d;
        double degrees2 = Math.toDegrees(Math.atan2(d46, d45));
        if (degrees2 < 0.0d) {
            degrees2 += 360.0d;
        } else if (degrees2 >= 360.0d) {
            degrees2 -= 360.0d;
        }
        double d47 = degrees2;
        double d48 = dSignum5 * 20.0d;
        double radians2 = Math.toRadians(d47);
        double d49 = (((((40.0d * dSignum4) + d48) + dSignum6) / 20.0d) * eehmVar2.c) / eehmVar2.b;
        double d50 = eehmVar2.e;
        double dPow10 = Math.pow(d49, eehmVar2.j * 0.69d) * 100.0d;
        double d51 = eehmVar2.e;
        double d52 = dPow10 / 100.0d;
        Math.sqrt(d52);
        double d53 = eehmVar2.b;
        double d54 = eehmVar2.i;
        double dPow11 = Math.pow(1.64d - Math.pow(0.29d, eehmVar2.f), 0.73d) * Math.pow((((((Math.cos(Math.toRadians(d47 < 20.14d ? d47 + 360.0d : d47) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * eehmVar2.d) * Math.hypot(d45, d46)) / (((((dSignum4 * 20.0d) + d48) + (dSignum6 * 21.0d)) / 20.0d) + 0.305d), 0.9d);
        double dSqrt3 = Math.sqrt(d52) * dPow11 * eehmVar2.i;
        double d55 = eehmVar2.e;
        Math.sqrt((dPow11 * 0.69d) / (eehmVar2.b + 4.0d));
        Math.log1p(dSqrt3 * 0.0228d);
        Math.cos(radians2);
        Math.sin(radians2);
        double d56 = eehl.c(new double[]{eehj.a(i8), eehj.a(i10), eehj.a(i7)}, eehj.a)[1] / 100.0d;
        if (d56 > 0.008856451679035631d) {
            Math.pow(d56, 0.3333333333333333d);
        }
        double d57 = dPow6 - 16.0d;
        double dMin = Math.min((180.0d - Math.abs(Math.abs(degrees - d47) - 180.0d)) * 0.5d, 15.0d) * (eehl.a(d47 - degrees) <= 180.0d ? 1.0d : -1.0d);
        int i11 = eehk.e;
        if (dSqrt2 < 1.0E-4d || d57 < 1.0E-4d || d57 > 99.9999d) {
            int iE = eehj.e(eehj.b(d57));
            iD = eehj.d(iE, iE, iE);
        } else {
            double dA7 = eehl.a(eehl.a(degrees + dMin)) / 180.0d;
            double dB = eehj.b(d57);
            double dSqrt4 = Math.sqrt(dB) * 11.0d;
            eehm eehmVar3 = eehm.a;
            double dPow12 = 1.0d / Math.pow(1.64d - Math.pow(0.29d, eehmVar3.f), 0.73d);
            double d58 = dA7 * 3.141592653589793d;
            double dCos = (Math.cos(d58 + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * eehmVar3.d;
            double dSin = Math.sin(d58);
            double dCos2 = Math.cos(d58);
            int i12 = 0;
            while (true) {
                if (i12 >= 5) {
                    d = dB;
                    break;
                }
                double d59 = dSin;
                double d60 = dSqrt4 / 100.0d;
                if (dSqrt2 == 0.0d || dSqrt4 == 0.0d) {
                    d2 = dCos;
                    dSqrt = 0.0d;
                } else {
                    dSqrt = dSqrt2 / Math.sqrt(d60);
                    d2 = dCos;
                }
                double d61 = dSqrt * dPow12;
                d = dB;
                double d62 = eehmVar3.b;
                double d63 = eehmVar3.e;
                double d64 = 1.4492753623188408d / eehmVar3.j;
                double d65 = dSqrt2;
                double dPow13 = Math.pow(d61, 1.1111111111111112d);
                double dPow14 = (Math.pow(d60, d64) * d62) / eehmVar3.c;
                double d66 = (((0.305d + dPow14) * 23.0d) * dPow13) / (((23.0d * d2) + ((dPow13 * 11.0d) * dCos2)) + ((dPow13 * 108.0d) * d59));
                double d67 = d66 * dCos2;
                double d68 = d66 * d59;
                double d69 = dPow14 * 460.0d;
                dArrC = eehl.c(new double[]{eehk.c((((451.0d * d67) + d69) + (288.0d * d68)) / 1403.0d), eehk.c(((d69 - (891.0d * d67)) - (261.0d * d68)) / 1403.0d), eehk.c(((d69 - (d67 * 220.0d)) - (d68 * 6300.0d)) / 1403.0d)}, eehk.b);
                double d70 = dArrC[0];
                if (d70 < 0.0d) {
                    break;
                }
                double d71 = dArrC[1];
                if (d71 < 0.0d) {
                    break;
                }
                double d72 = dArrC[2];
                if (d72 < 0.0d) {
                    break;
                }
                double[] dArr13 = eehk.c;
                double d73 = (dArr13[0] * d70) + (dArr13[1] * d71) + (dArr13[2] * d72);
                if (d73 <= 0.0d) {
                    break;
                }
                if (i12 == 4) {
                    break;
                }
                double d74 = d73 - d;
                if (Math.abs(d74) < 0.002d) {
                    break;
                }
                dSqrt4 -= (d74 * dSqrt4) / (d73 + d73);
                i12++;
                dSin = d59;
                dB = d;
                dCos = d2;
                dSqrt2 = d65;
            }
            iD = (dArrC[0] > 100.01d || dArrC[1] > 100.01d || dArrC[2] > 100.01d) ? 0 : eehj.c(dArrC);
            if (iD == 0) {
                double[] dArr14 = {-1.0d, -1.0d, -1.0d};
                double[] dArr15 = dArr14;
                boolean z = true;
                boolean z2 = false;
                int i13 = 0;
                double d75 = 0.0d;
                double d76 = 0.0d;
                while (i13 < 12) {
                    double[] dArr16 = eehk.c;
                    double d77 = dArr16[0];
                    double d78 = dArr16[i9];
                    double d79 = dArr16[2];
                    int i14 = i13 % 4;
                    double d80 = i13 % 2 == 0 ? 0.0d : 100.0d;
                    double d81 = i14 <= i9 ? 0.0d : 100.0d;
                    if (i13 < 4) {
                        double d82 = ((d - (d78 * d81)) - (d79 * d80)) / d77;
                        dArr = eehk.i(d82) ? new double[]{d82, d81, d80} : new double[]{-1.0d, -1.0d, -1.0d};
                    } else if (i13 < 8) {
                        double d83 = ((d - (d77 * d80)) - (d79 * d81)) / d78;
                        if (eehk.i(d83)) {
                            dArr2 = new double[]{d80, d83, d81};
                            dArr = dArr2;
                        } else {
                            dArr = new double[]{-1.0d, -1.0d, -1.0d};
                        }
                    } else {
                        double d84 = ((d - (d77 * d81)) - (d78 * d80)) / d79;
                        if (eehk.i(d84)) {
                            dArr2 = new double[]{d81, d80, d84};
                            dArr = dArr2;
                        } else {
                            dArr = new double[]{-1.0d, -1.0d, -1.0d};
                        }
                    }
                    if (dArr[0] >= 0.0d) {
                        double dB2 = eehk.b(dArr);
                        if (!z2) {
                            dArr14 = dArr;
                            dArr15 = dArr14;
                            d75 = dB2;
                            d76 = d75;
                        } else if (z || eehk.h(d75, dB2, d76)) {
                            double d85 = d75;
                            d75 = d85;
                            if (eehk.h(d85, d58, dB2)) {
                                dArr15 = dArr;
                                z = false;
                                d76 = dB2;
                            } else {
                                dArr14 = dArr;
                                z = false;
                                d75 = dB2;
                            }
                        } else {
                            z = false;
                        }
                        z2 = true;
                    }
                    i13++;
                    i9 = 1;
                }
                double[][] dArr17 = {dArr14, dArr15};
                double[] dArr18 = dArr17[0];
                double dB3 = eehk.b(dArr18);
                double[] dArr19 = dArr17[1];
                for (int i15 = 0; i15 < 3; i15++) {
                    double d86 = dArr18[i15];
                    double d87 = dArr19[i15];
                    if (d86 != d87) {
                        if (d86 < d87) {
                            iF = eehk.g(eehk.e(d86));
                            iG = eehk.f(eehk.e(dArr19[i15]));
                        } else {
                            iF = eehk.f(eehk.e(d86));
                            iG = eehk.g(eehk.e(dArr19[i15]));
                        }
                        double d88 = dB3;
                        for (int i16 = 0; i16 < 8 && Math.abs(iG - iF) > 1; i16++) {
                            int iFloor = (int) Math.floor((iF + iG) / 2.0d);
                            double d89 = eehk.d[iFloor];
                            double d90 = dArr18[i15];
                            double d91 = d89 - d90;
                            double d92 = dArr19[i15] - d90;
                            double d93 = dArr18[0];
                            double d94 = d91 / d92;
                            double d95 = dArr18[1];
                            double d96 = dArr18[2];
                            double[] dArr20 = {d93 + ((dArr19[0] - d93) * d94), d95 + ((dArr19[1] - d95) * d94), d96 + ((dArr19[2] - d96) * d94)};
                            double dB4 = eehk.b(dArr20);
                            boolean zH = eehk.h(d88, d58, dB4);
                            if (true == zH) {
                                iG = iFloor;
                            }
                            if (true != zH) {
                                iF = iFloor;
                            }
                            if (true == zH) {
                                dArr19 = dArr20;
                            }
                            if (true != zH) {
                                d88 = dB4;
                            }
                            if (true != zH) {
                                dArr18 = dArr20;
                            }
                        }
                        dB3 = d88;
                    }
                }
                iD = eehj.c(new double[]{(dArr18[0] + dArr19[0]) / 2.0d, (dArr18[1] + dArr19[1]) / 2.0d, (dArr18[2] + dArr19[2]) / 2.0d});
            }
        }
        int i17 = (iD >> 16) & 255;
        eehm eehmVar4 = eehm.a;
        double dA8 = eehj.a(i17);
        int i18 = (iD >> 8) & 255;
        double dA9 = eehj.a(i18);
        int i19 = iD & 255;
        double dA10 = eehj.a(i19);
        double[][] dArr21 = eehi.a;
        double[] dArr22 = dArr21[0];
        double d97 = (0.41233895d * dA8) + (0.35762064d * dA9) + (0.18051042d * dA10);
        double d98 = dArr22[0] * d97;
        double d99 = (0.2126d * dA8) + (0.7152d * dA9) + (0.0722d * dA10);
        double d100 = dArr22[1] * d99;
        double d101 = (dA8 * 0.01932141d) + (dA9 * 0.11916382d) + (dA10 * 0.95034478d);
        double d102 = dArr22[2] * d101;
        double[] dArr23 = dArr21[1];
        double d103 = dArr23[0] * d97;
        double d104 = dArr23[1] * d99;
        double d105 = dArr23[2] * d101;
        double[] dArr24 = dArr21[2];
        double d106 = d97 * dArr24[0];
        double d107 = d99 * dArr24[1];
        double d108 = d101 * dArr24[2];
        double[] dArr25 = eehmVar4.g;
        double d109 = dArr25[0] * (d98 + d100 + d102);
        double d110 = dArr25[1] * (d103 + d104 + d105);
        double d111 = dArr25[2] * (d106 + d107 + d108);
        double dPow15 = Math.pow((eehmVar4.h * Math.abs(d109)) / 100.0d, 0.42d);
        double dPow16 = Math.pow((eehmVar4.h * Math.abs(d110)) / 100.0d, 0.42d);
        double dPow17 = Math.pow((eehmVar4.h * Math.abs(d111)) / 100.0d, 0.42d);
        double dSignum7 = ((Math.signum(d109) * 400.0d) * dPow15) / (dPow15 + 27.13d);
        double dSignum8 = ((Math.signum(d110) * 400.0d) * dPow16) / (dPow16 + 27.13d);
        double dSignum9 = ((Math.signum(d111) * 400.0d) * dPow17) / (dPow17 + 27.13d);
        double d112 = (((dSignum7 * 11.0d) + ((-12.0d) * dSignum8)) + dSignum9) / 11.0d;
        double d113 = ((dSignum7 + dSignum8) - (dSignum9 + dSignum9)) / 9.0d;
        double degrees3 = Math.toDegrees(Math.atan2(d113, d112));
        if (degrees3 < 0.0d) {
            degrees3 += 360.0d;
        } else if (degrees3 >= 360.0d) {
            degrees3 -= 360.0d;
        }
        double d114 = dSignum8 * 20.0d;
        double radians3 = Math.toRadians(degrees3);
        int i20 = iD;
        double d115 = (((((40.0d * dSignum7) + d114) + dSignum9) / 20.0d) * eehmVar4.c) / eehmVar4.b;
        double d116 = degrees3;
        double d117 = eehmVar4.e;
        double dPow18 = Math.pow(d115, eehmVar4.j * 0.69d) * 100.0d;
        double d118 = eehmVar4.e;
        double d119 = dPow18 / 100.0d;
        Math.sqrt(d119);
        double d120 = eehmVar4.b;
        double d121 = eehmVar4.i;
        double dPow19 = Math.pow(1.64d - Math.pow(0.29d, eehmVar4.f), 0.73d) * Math.pow((((((Math.cos(Math.toRadians(d116 < 20.14d ? d116 + 360.0d : d116) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * eehmVar4.d) * Math.hypot(d112, d113)) / (((((dSignum7 * 20.0d) + d114) + (dSignum9 * 21.0d)) / 20.0d) + 0.305d), 0.9d);
        double dSqrt5 = Math.sqrt(d119) * dPow19 * eehmVar4.i;
        double d122 = eehmVar4.e;
        Math.sqrt((dPow19 * 0.69d) / (eehmVar4.b + 4.0d));
        Math.log1p(dSqrt5 * 0.0228d);
        Math.cos(radians3);
        Math.sin(radians3);
        double d123 = eehl.c(new double[]{eehj.a(i17), eehj.a(i18), eehj.a(i19)}, eehj.a)[1] / 100.0d;
        if (d123 > 0.008856451679035631d) {
            Math.pow(d123, 0.3333333333333333d);
        }
        return i20;
    }
}
