package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fflm extends fflk {
    final BigInteger e;
    final BigInteger f;
    final BigInteger g;

    public fflm(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.e = bigInteger;
        this.f = bigInteger2;
        this.g = bigInteger3;
    }

    private final ffln w(ffln fflnVar) {
        if (fflnVar.n().equals(this)) {
            return fflnVar;
        }
        return null;
    }

    protected final BigInteger a(BigInteger bigInteger) {
        BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(1);
        BigInteger bigInteger2 = this.e;
        return bigIntegerShiftLeft.compareTo(bigInteger2) >= 0 ? bigIntegerShiftLeft.subtract(bigInteger2) : bigIntegerShiftLeft;
    }

    @Override // defpackage.ffln
    public final int c() {
        return this.e.bitLength();
    }

    @Override // defpackage.ffln
    public final BigInteger d() {
        return this.g;
    }

    @Override // defpackage.ffln
    public final ffln e(ffln fflnVar) {
        BigInteger bigIntegerAdd = this.g.add(fflnVar.d());
        BigInteger bigInteger = this.e;
        if (bigIntegerAdd.compareTo(bigInteger) >= 0) {
            bigIntegerAdd = bigIntegerAdd.subtract(bigInteger);
        }
        return new fflm(bigInteger, this.f, bigIntegerAdd);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fflm)) {
            return false;
        }
        fflm fflmVar = (fflm) obj;
        return this.e.equals(fflmVar.e) && this.g.equals(fflmVar.g);
    }

    @Override // defpackage.ffln
    public final ffln f() {
        BigInteger bigIntegerAdd = this.g.add(ffld.b);
        BigInteger bigInteger = this.e;
        if (bigIntegerAdd.compareTo(bigInteger) == 0) {
            bigIntegerAdd = ffld.a;
        }
        return new fflm(bigInteger, this.f, bigIntegerAdd);
    }

    @Override // defpackage.ffln
    public final ffln g(ffln fflnVar) {
        return new fflm(this.e, this.f, u(this.g, t(fflnVar.d())));
    }

    @Override // defpackage.ffln
    public final ffln h() {
        return new fflm(this.e, this.f, t(this.g));
    }

    public final int hashCode() {
        return this.e.hashCode() ^ this.g.hashCode();
    }

    @Override // defpackage.ffln
    public final ffln i(ffln fflnVar) {
        return new fflm(this.e, this.f, u(this.g, fflnVar.d()));
    }

    @Override // defpackage.ffln
    public final ffln j(ffln fflnVar, ffln fflnVar2, ffln fflnVar3) {
        return new fflm(this.e, this.f, v(this.g.multiply(fflnVar.d()).subtract(fflnVar2.d().multiply(fflnVar3.d()))));
    }

    @Override // defpackage.ffln
    public final ffln k(ffln fflnVar, ffln fflnVar2, ffln fflnVar3) {
        return new fflm(this.e, this.f, v(this.g.multiply(fflnVar.d()).add(fflnVar2.d().multiply(fflnVar3.d()))));
    }

    @Override // defpackage.ffln
    public final ffln l() {
        BigInteger bigInteger = this.g;
        if (bigInteger.signum() == 0) {
            return this;
        }
        BigInteger bigInteger2 = this.e;
        return new fflm(bigInteger2, this.f, bigInteger2.subtract(bigInteger));
    }

    @Override // defpackage.ffln
    public final ffln m() {
        Random random;
        if (s() || r()) {
            return this;
        }
        BigInteger bigInteger = this.e;
        int i = 0;
        if (!bigInteger.testBit(0)) {
            throw new RuntimeException("not done yet");
        }
        char c = 2;
        if (bigInteger.testBit(1)) {
            return w(new fflm(bigInteger, this.f, this.g.modPow(bigInteger.shiftRight(2).add(ffld.b), bigInteger)));
        }
        if (bigInteger.testBit(2)) {
            BigInteger bigInteger2 = this.g;
            BigInteger bigIntegerModPow = bigInteger2.modPow(bigInteger.shiftRight(3), bigInteger);
            BigInteger bigIntegerU = u(bigIntegerModPow, bigInteger2);
            if (u(bigIntegerU, bigIntegerModPow).equals(ffld.b)) {
                return w(new fflm(bigInteger, this.f, bigIntegerU));
            }
            return w(new fflm(bigInteger, this.f, u(bigIntegerU, ffld.c.modPow(bigInteger.shiftRight(2), bigInteger))));
        }
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(1);
        BigInteger bigInteger3 = this.g;
        BigInteger bigIntegerModPow2 = bigInteger3.modPow(bigIntegerShiftRight, bigInteger);
        BigInteger bigInteger4 = ffld.b;
        ffln fflnVar = null;
        if (!bigIntegerModPow2.equals(bigInteger4)) {
            return null;
        }
        BigInteger bigIntegerA = a(a(bigInteger3));
        BigInteger bigIntegerAdd = bigIntegerShiftRight.add(bigInteger4);
        BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger4);
        Random random2 = new Random();
        while (true) {
            BigInteger bigInteger5 = new BigInteger(bigInteger.bitLength(), random2);
            if (bigInteger5.compareTo(bigInteger) >= 0 || !v(bigInteger5.multiply(bigInteger5).subtract(bigIntegerA)).modPow(bigIntegerShiftRight, bigInteger).equals(bigIntegerSubtract)) {
                c = c;
                i = i;
            } else {
                int iBitLength = bigIntegerAdd.bitLength();
                int lowestSetBit = bigIntegerAdd.getLowestSetBit();
                int i2 = iBitLength - 1;
                ffln fflnVar2 = fflnVar;
                BigInteger bigIntegerV = ffld.c;
                int i3 = i;
                BigInteger bigInteger6 = bigIntegerShiftRight;
                BigInteger bigIntegerU2 = bigInteger4;
                BigInteger bigIntegerV2 = bigIntegerU2;
                BigInteger bigIntegerU3 = bigIntegerV2;
                BigInteger bigIntegerV3 = bigInteger5;
                while (true) {
                    random = random2;
                    if (i2 < lowestSetBit + 1) {
                        break;
                    }
                    bigIntegerU2 = u(bigIntegerU2, bigIntegerU3);
                    if (bigIntegerAdd.testBit(i2)) {
                        bigIntegerU3 = u(bigIntegerU2, bigInteger3);
                        BigInteger bigIntegerU4 = u(bigIntegerV2, bigIntegerV3);
                        bigIntegerV = v(bigIntegerV3.multiply(bigIntegerV).subtract(bigInteger5.multiply(bigIntegerU2)));
                        bigIntegerV3 = v(bigIntegerV3.multiply(bigIntegerV3).subtract(bigIntegerU3.shiftLeft(1)));
                        bigIntegerV2 = bigIntegerU4;
                    } else {
                        bigIntegerV2 = v(bigIntegerV2.multiply(bigIntegerV).subtract(bigIntegerU2));
                        bigIntegerV3 = v(bigIntegerV3.multiply(bigIntegerV).subtract(bigInteger5.multiply(bigIntegerU2)));
                        bigIntegerV = v(bigIntegerV.multiply(bigIntegerV).subtract(bigIntegerU2.shiftLeft(1)));
                        bigIntegerU3 = bigIntegerU2;
                    }
                    i2--;
                    random2 = random;
                }
                BigInteger bigIntegerU5 = u(bigIntegerU2, bigIntegerU3);
                BigInteger bigIntegerU6 = u(bigIntegerU5, bigInteger3);
                BigInteger bigIntegerV4 = v(bigIntegerV2.multiply(bigIntegerV).subtract(bigIntegerU5));
                BigInteger bigIntegerV5 = v(bigIntegerV3.multiply(bigIntegerV).subtract(bigInteger5.multiply(bigIntegerU5)));
                BigInteger bigIntegerU7 = u(bigIntegerU5, bigIntegerU6);
                for (int i4 = 1; i4 <= lowestSetBit; i4++) {
                    bigIntegerV4 = u(bigIntegerV4, bigIntegerV5);
                    bigIntegerV5 = v(bigIntegerV5.multiply(bigIntegerV5).subtract(bigIntegerU7.shiftLeft(1)));
                    bigIntegerU7 = u(bigIntegerU7, bigIntegerU7);
                }
                BigInteger[] bigIntegerArr = new BigInteger[2];
                bigIntegerArr[i3] = bigIntegerV4;
                bigIntegerArr[1] = bigIntegerV5;
                BigInteger bigInteger7 = bigIntegerArr[i3];
                if (u(bigIntegerV5, bigIntegerV5).equals(bigIntegerA)) {
                    BigInteger bigInteger8 = this.f;
                    if (bigIntegerV5.testBit(i3)) {
                        bigIntegerV5 = bigInteger.subtract(bigIntegerV5);
                    }
                    return new fflm(bigInteger, bigInteger8, bigIntegerV5.shiftRight(1));
                }
                if (!bigInteger7.equals(bigInteger4) && !bigInteger7.equals(bigIntegerSubtract)) {
                    return fflnVar2;
                }
                c = 2;
                i = i3;
                fflnVar = fflnVar2;
                bigIntegerShiftRight = bigInteger6;
                random2 = random;
            }
        }
    }

    @Override // defpackage.ffln
    public final ffln n() {
        BigInteger bigInteger = this.e;
        BigInteger bigInteger2 = this.f;
        BigInteger bigInteger3 = this.g;
        return new fflm(bigInteger, bigInteger2, u(bigInteger3, bigInteger3));
    }

    @Override // defpackage.ffln
    public final ffln o(ffln fflnVar, ffln fflnVar2) {
        BigInteger bigInteger = this.g;
        return new fflm(this.e, this.f, v(bigInteger.multiply(bigInteger).add(fflnVar.d().multiply(fflnVar2.d()))));
    }

    @Override // defpackage.ffln
    public final ffln q(ffln fflnVar) {
        BigInteger bigIntegerSubtract = this.g.subtract(fflnVar.d());
        if (bigIntegerSubtract.signum() < 0) {
            bigIntegerSubtract = bigIntegerSubtract.add(this.e);
        }
        return new fflm(this.e, this.f, bigIntegerSubtract);
    }

    protected final BigInteger t(BigInteger bigInteger) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        BigInteger bigInteger2 = ffwm.a;
        BigInteger bigInteger3 = this.e;
        int i6 = 0;
        if (!bigInteger3.testBit(0)) {
            throw new IllegalArgumentException("'M' must be odd");
        }
        int i7 = 1;
        if (bigInteger3.signum() != 1) {
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
        BigInteger bigIntegerMod = (bigInteger.signum() < 0 || bigInteger.bitLength() > bigInteger3.bitLength()) ? bigInteger.mod(bigInteger3) : bigInteger;
        int iBitLength = bigInteger3.bitLength();
        int[] iArrA = ffmc.a(iBitLength, bigInteger3);
        int[] iArrA2 = ffmc.a(iBitLength, bigIntegerMod);
        int length = iArrA.length;
        int[] iArr = new int[length];
        int i8 = length - 1;
        int iNumberOfLeadingZeros = (length << 5) - Integer.numberOfLeadingZeros(iArrA[i8]);
        int i9 = 30;
        int i10 = (iNumberOfLeadingZeros + 29) / 30;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        int[] iArr4 = new int[i10];
        int[] iArr5 = new int[i10];
        int[] iArr6 = new int[i10];
        iArr3[0] = 1;
        ffmb.c(iNumberOfLeadingZeros, iArrA2, iArr5);
        ffmb.c(iNumberOfLeadingZeros, iArrA, iArr6);
        System.arraycopy(iArr6, 0, iArr4, 0, i10);
        int iB = ffmb.b(iArr6[0]);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i = i6;
            i2 = i10 - 1;
            i3 = i7;
            i4 = length;
            if (i11 >= ((int) (((iNumberOfLeadingZeros * 150964) + 99243) >>> 16))) {
                break;
            }
            int i13 = iArr4[i];
            int i14 = iArr5[i];
            int i15 = iB;
            int i16 = i11;
            int i17 = i13;
            int i18 = i;
            int i19 = i18;
            int i20 = i19;
            int i21 = 1073741824;
            int i22 = 1073741824;
            while (i18 < i9) {
                int i23 = i9;
                int i24 = i12 >> 31;
                int i25 = i18;
                int i26 = -(i14 & 1);
                int i27 = i14 - ((i17 ^ i24) & i26);
                int i28 = i20 - ((i22 ^ i24) & i26);
                int i29 = i21 - ((i19 ^ i24) & i26);
                int i30 = i26 & (~i24);
                i12 = (i12 ^ i30) + 1;
                i17 += i27 & i30;
                i22 += i28 & i30;
                i19 += i30 & i29;
                i14 = i27 >> 1;
                i20 = i28 >> 1;
                i21 = i29 >> 1;
                i18 = i25 + 1;
                i9 = i23;
            }
            int i31 = i9;
            int[] iArr7 = {i22, i19, i20, i21};
            int i32 = iArr7[i];
            int i33 = iArr7[i3];
            int i34 = iArr7[2];
            int i35 = iArr2[i2] >> 31;
            int i36 = iArr3[i2] >> 31;
            int i37 = iArr6[i];
            int[] iArr8 = iArr;
            int i38 = i8;
            int i39 = iNumberOfLeadingZeros;
            long j = i32;
            long j2 = iArr2[i];
            long j3 = i33;
            long j4 = iArr3[i];
            long j5 = i34;
            long j6 = i21;
            long j7 = (j * j2) + (j3 * j4);
            long j8 = (j2 * j5) + (j6 * j4);
            long j9 = i37;
            int i40 = (i35 & i34) + (i21 & i36);
            long j10 = i40 - (((((int) j8) * i15) + i40) & 1073741823);
            long j11 = (j8 + (j9 * j10)) >> i31;
            int i41 = (i32 & i35) + (i33 & i36);
            long j12 = i41 - (((((int) j7) * i15) + i41) & 1073741823);
            long j13 = (j7 + (j9 * j12)) >> i31;
            int i42 = i3;
            while (i42 < i10) {
                int i43 = iArr6[i42];
                long j14 = j12;
                int[] iArr9 = iArr2;
                int[] iArr10 = iArr3;
                long j15 = iArr2[i42];
                long j16 = iArr3[i42];
                long j17 = i43;
                long j18 = j13 + (j * j15) + (j3 * j16) + (j17 * j14);
                long j19 = j11 + (j15 * j5) + (j16 * j6) + (j17 * j10);
                int i44 = i42 - 1;
                iArr9[i44] = ((int) j18) & 1073741823;
                j13 = j18 >> i31;
                iArr10[i44] = ((int) j19) & 1073741823;
                j11 = j19 >> i31;
                i42++;
                iArr2 = iArr9;
                iArr3 = iArr10;
                j12 = j14;
            }
            int[] iArr11 = iArr2;
            int[] iArr12 = iArr3;
            iArr11[i2] = (int) j13;
            iArr12[i2] = (int) j11;
            int i45 = iArr7[i];
            int i46 = iArr7[i3];
            int i47 = iArr7[2];
            int i48 = iArr7[3];
            long j20 = i45;
            long j21 = iArr4[i];
            long j22 = i46;
            long j23 = iArr5[i];
            long j24 = i47;
            long j25 = i48;
            long j26 = ((j24 * j21) + (j25 * j23)) >> i31;
            long j27 = ((j21 * j20) + (j23 * j22)) >> i31;
            long j28 = j26;
            int i49 = i3;
            while (i49 < i10) {
                long j29 = j25;
                long j30 = j20;
                long j31 = iArr4[i49];
                long j32 = iArr5[i49];
                long j33 = j27 + (j30 * j31) + (j22 * j32);
                long j34 = j28 + (j31 * j24) + (j32 * j29);
                int i50 = i49 - 1;
                iArr4[i50] = ((int) j33) & 1073741823;
                j27 = j33 >> i31;
                iArr5[i50] = ((int) j34) & 1073741823;
                j28 = j34 >> i31;
                i49++;
                j25 = j29;
                j20 = j30;
            }
            iArr4[i2] = (int) j27;
            iArr5[i2] = (int) j28;
            i11 = i16 + 30;
            length = i4;
            iArr2 = iArr11;
            i6 = i;
            i7 = i3;
            iArr3 = iArr12;
            iB = i15;
            i9 = i31;
            iArr = iArr8;
            i8 = i38;
            iNumberOfLeadingZeros = i39;
        }
        int[] iArr13 = iArr;
        int i51 = i8;
        int i52 = iNumberOfLeadingZeros;
        int[] iArr14 = iArr2;
        int i53 = iArr4[i2] >> 31;
        int i54 = i;
        int i55 = i54;
        while (i54 < i2) {
            int i56 = i55 + ((iArr4[i54] ^ i53) - i53);
            iArr4[i54] = i56 & 1073741823;
            i55 = i56 >> 30;
            i54++;
        }
        iArr4[i2] = i55 + ((iArr4[i2] ^ i53) - i53);
        int i57 = iArr14[i2] >> 31;
        int i58 = i;
        int i59 = i58;
        while (i58 < i2) {
            int i60 = i59 + (((iArr14[i58] + (iArr6[i58] & i57)) ^ i53) - i53);
            iArr14[i58] = i60 & 1073741823;
            i59 = i60 >> 30;
            i58++;
        }
        int i61 = i59 + (((iArr14[i2] + (i57 & iArr6[i2])) ^ i53) - i53);
        iArr14[i2] = i61;
        int i62 = i61 >> 31;
        int i63 = i;
        int i64 = i63;
        while (i63 < i2) {
            int i65 = i64 + iArr14[i63] + (iArr6[i63] & i62);
            iArr14[i63] = i65 & 1073741823;
            i64 = i65 >> 30;
            i63++;
        }
        iArr14[i2] = i64 + iArr14[i2] + (i62 & iArr6[i2]);
        long j35 = 0;
        int i66 = i;
        int i67 = i66;
        int i68 = i67;
        int i69 = i52;
        while (i69 > 0) {
            int i70 = i3;
            while (true) {
                i5 = i4;
                if (i66 < Math.min(32, i69)) {
                    i4 = i5;
                    j35 |= iArr14[i67] << i66;
                    i66 += 30;
                    i67++;
                }
            }
            i4 = i5;
            iArr13[i68] = (int) j35;
            j35 >>>= 32;
            i69 -= 32;
            i66 -= 32;
            i68++;
            i3 = i70;
            i = 0;
        }
        int i71 = i;
        if ((ffmb.a(i10, iArr4, i3) & ffmb.a(i10, iArr5, i71)) == 0) {
            throw new ArithmeticException("BigInteger not invertible.");
        }
        byte[] bArr = new byte[i4 << 2];
        int i72 = i4;
        for (int i73 = i71; i73 < i72; i73++) {
            int i74 = iArr13[i73];
            if (i74 != 0) {
                ffwp.e(i74, bArr, (i51 - i73) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    protected final BigInteger u(BigInteger bigInteger, BigInteger bigInteger2) {
        return v(bigInteger.multiply(bigInteger2));
    }

    protected final BigInteger v(BigInteger bigInteger) {
        BigInteger bigInteger2 = this.f;
        if (bigInteger2 == null) {
            return bigInteger.mod(this.e);
        }
        boolean z = bigInteger.signum() < 0;
        if (z) {
            bigInteger = bigInteger.abs();
        }
        BigInteger bigInteger3 = this.e;
        int iBitLength = bigInteger3.bitLength();
        boolean zEquals = bigInteger2.equals(ffld.b);
        while (bigInteger.bitLength() > iBitLength + 1) {
            BigInteger bigIntegerShiftRight = bigInteger.shiftRight(iBitLength);
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
            if (!zEquals) {
                bigIntegerShiftRight = bigIntegerShiftRight.multiply(bigInteger2);
            }
            bigInteger = bigIntegerShiftRight.add(bigIntegerSubtract);
        }
        while (bigInteger.compareTo(bigInteger3) >= 0) {
            bigInteger = bigInteger.subtract(bigInteger3);
        }
        return (!z || bigInteger.signum() == 0) ? bigInteger : bigInteger3.subtract(bigInteger);
    }
}
