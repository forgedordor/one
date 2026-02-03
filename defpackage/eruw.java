package defpackage;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eruw implements eqsw {
    private final erwn a;
    private final byte[] b;
    private final byte[] c;

    private eruw(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!eqza.a(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.a = erwn.b(bArr);
        this.b = bArr2;
        this.c = bArr3;
        erdp erdpVar = erds.a;
        if (erdu.a == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }

    public static eqsw b(erox eroxVar) throws GeneralSecurityException {
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            int i = errn.a;
            Provider providerA = erdl.a();
            if (providerA == null) {
                throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
            }
            if (eqza.a(1)) {
                return new errn(eroxVar.b.c(), eroxVar.c.c(), eroxVar.a.a.equals(erop.c) ? new byte[]{0} : new byte[0], providerA);
            }
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        } catch (GeneralSecurityException unused) {
            return new eruw(eroxVar.b.c(), eroxVar.c.c(), eroxVar.a.a.equals(erop.c) ? new byte[]{0} : new byte[0]);
        }
    }

    private final void c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte b;
        byte[] bArr3 = bArr;
        if (bArr3.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
        }
        byte[] bArrC = this.a.c();
        erdp erdpVar = erds.a;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
        int i = 31;
        while (true) {
            if (i < 0) {
                break;
            }
            int i2 = bArrCopyOfRange[i] & 255;
            int i3 = erds.b[i] & 255;
            if (i2 == i3) {
                i--;
                bArr3 = bArr;
            } else if (i2 < i3) {
                MessageDigest messageDigest = (MessageDigest) ervg.d.a("SHA-512");
                messageDigest.update(bArr3, 0, 32);
                messageDigest.update(bArrC);
                messageDigest.update(bArr2);
                byte[] bArrDigest = messageDigest.digest();
                long jB = erds.b(bArrDigest, 0) & 2097151;
                long jC = erds.c(bArrDigest, 2) >> 5;
                long jB2 = erds.b(bArrDigest, 5) >> 2;
                long jC2 = erds.c(bArrDigest, 7) >> 7;
                long jC3 = erds.c(bArrDigest, 10) >> 4;
                long jB3 = erds.b(bArrDigest, 13) >> 1;
                long jC4 = erds.c(bArrDigest, 15) >> 6;
                long jB4 = erds.b(bArrDigest, 18) >> 3;
                long jB5 = erds.b(bArrDigest, 21) & 2097151;
                long jC5 = erds.c(bArrDigest, 23) >> 5;
                long jB6 = erds.b(bArrDigest, 26) >> 2;
                long jC6 = erds.c(bArrDigest, 28) >> 7;
                long jC7 = erds.c(bArrDigest, 31) >> 4;
                long jB7 = erds.b(bArrDigest, 34) >> 1;
                long jC8 = erds.c(bArrDigest, 36) >> 6;
                long jB8 = erds.b(bArrDigest, 39) >> 3;
                long jB9 = erds.b(bArrDigest, 42) & 2097151;
                long jC9 = erds.c(bArrDigest, 44) >> 5;
                long jB10 = (erds.b(bArrDigest, 47) >> 2) & 2097151;
                long jC10 = (erds.c(bArrDigest, 49) >> 7) & 2097151;
                long jC11 = (erds.c(bArrDigest, 52) >> 4) & 2097151;
                long jB11 = (erds.b(bArrDigest, 55) >> 1) & 2097151;
                long jC12 = (erds.c(bArrDigest, 57) >> 6) & 2097151;
                long jC13 = erds.c(bArrDigest, 60) >> 3;
                long j = (jC4 & 2097151) + (jB10 * 666643);
                long j2 = (j + 1048576) >> 21;
                long j3 = j2 << 21;
                long j4 = jB5 + (jC11 * 666643) + (jC10 * 470296) + (jB10 * 654183);
                long j5 = (j4 + 1048576) >> 21;
                long j6 = j5 << 21;
                long j7 = (((((jB6 & 2097151) + (jC12 * 666643)) + (jB11 * 470296)) + (jC11 * 654183)) - (jC10 * 997805)) + (jB10 * 136657);
                long j8 = (j7 + 1048576) >> 21;
                long j9 = j8 << 21;
                long j10 = (((((jC7 & 2097151) + (jC13 * 470296)) + (jC12 * 654183)) - (jB11 * 997805)) + (jC11 * 136657)) - (jC10 * 683901);
                long j11 = (j10 + 1048576) >> 21;
                long j12 = (((jC8 & 2097151) - (jC13 * 997805)) + (jC12 * 136657)) - (jB11 * 683901);
                long j13 = (j12 + 1048576) >> 21;
                long j14 = jB9 - (jC13 * 683901);
                long j15 = (j14 + 1048576) >> 21;
                long j16 = jB4 + (jC10 * 666643) + (jB10 * 470296) + j2;
                long j17 = (j16 + 1048576) >> 21;
                long j18 = j17 << 21;
                long j19 = (((((jC5 & 2097151) + (jB11 * 666643)) + (jC11 * 470296)) + (jC10 * 654183)) - (jB10 * 997805)) + j5;
                long j20 = (j19 + 1048576) >> 21;
                long j21 = j20 << 21;
                long j22 = (((((((jC6 & 2097151) + (jC13 * 666643)) + (jC12 * 470296)) + (jB11 * 654183)) - (jC11 * 997805)) + (jC10 * 136657)) - (jB10 * 683901)) + j8;
                long j23 = (j22 + 1048576) >> 21;
                long j24 = j23 << 21;
                long j25 = (((((jB7 & 2097151) + (jC13 * 654183)) - (jC12 * 997805)) + (jB11 * 136657)) - (jC11 * 683901)) + j11;
                long j26 = (j25 + 1048576) >> 21;
                long j27 = ((jB8 + (jC13 * 136657)) - (jC12 * 683901)) + j13;
                long j28 = (j27 + 1048576) >> 21;
                long j29 = (j10 - (j11 << 21)) + j23;
                long j30 = jB + (j29 * 666643);
                long j31 = (j30 + 1048576) >> 21;
                long j32 = j31 << 21;
                long j33 = (j12 - (j13 << 21)) + j26;
                long j34 = j25 - (j26 << 21);
                long j35 = (jB2 & 2097151) + (j33 * 666643) + (j34 * 470296) + (j29 * 654183);
                long j36 = (j35 + 1048576) >> 21;
                long j37 = j36 << 21;
                long j38 = (j14 - (j15 << 21)) + j28;
                long j39 = j27 - (j28 << 21);
                long j40 = (((((jC3 & 2097151) + (j38 * 666643)) + (j39 * 470296)) + (j33 * 654183)) - (j34 * 997805)) + (j29 * 136657);
                long j41 = (j40 + 1048576) >> 21;
                long j42 = j41 << 21;
                long j43 = (jC9 & 2097151) + j15;
                long j44 = (((((j - j3) + (j43 * 470296)) + (j38 * 654183)) - (j39 * 997805)) + (j33 * 136657)) - (j34 * 683901);
                long j45 = (j44 + 1048576) >> 21;
                long j46 = j45 << 21;
                long j47 = ((((j4 - j6) + j17) - (j43 * 997805)) + (j38 * 136657)) - (j39 * 683901);
                long j48 = (j47 + 1048576) >> 21;
                long j49 = j48 << 21;
                long j50 = ((j7 - j9) + j20) - (j43 * 683901);
                long j51 = (j50 + 1048576) >> 21;
                long j52 = (jC & 2097151) + (j34 * 666643) + (j29 * 470296) + j31;
                long j53 = (j52 + 1048576) >> 21;
                long j54 = (((((jC2 & 2097151) + (j39 * 666643)) + (j33 * 470296)) + (j34 * 654183)) - (j29 * 997805)) + j36;
                long j55 = (j54 + 1048576) >> 21;
                long j56 = (((((((jB3 & 2097151) + (j43 * 666643)) + (j38 * 470296)) + (j39 * 654183)) - (j33 * 997805)) + (j34 * 136657)) - (j29 * 683901)) + j41;
                long j57 = (j56 + 1048576) >> 21;
                long j58 = (((((j16 - j18) + (j43 * 654183)) - (j38 * 997805)) + (j39 * 136657)) - (j33 * 683901)) + j45;
                long j59 = (j58 + 1048576) >> 21;
                long j60 = (((j19 - j21) + (j43 * 136657)) - (j38 * 683901)) + j48;
                long j61 = (j60 + 1048576) >> 21;
                long j62 = (j22 - j24) + j51;
                long j63 = (j62 + 1048576) >> 21;
                long j64 = j63 << 21;
                long j65 = (j30 - j32) + (j63 * 666643);
                long j66 = j65 >> 21;
                long j67 = j66 << 21;
                long j68 = (j52 - (j53 << 21)) + (j63 * 470296) + j66;
                long j69 = j68 >> 21;
                long j70 = j69 << 21;
                long j71 = (j35 - j37) + j53 + (j63 * 654183) + j69;
                long j72 = j71 >> 21;
                long j73 = j72 << 21;
                long j74 = ((j54 - (j55 << 21)) - (j63 * 997805)) + j72;
                long j75 = j74 >> 21;
                long j76 = j75 << 21;
                long j77 = (j40 - j42) + j55 + (j63 * 136657) + j75;
                long j78 = j77 >> 21;
                long j79 = j78 << 21;
                long j80 = ((j56 - (j57 << 21)) - (j63 * 683901)) + j78;
                long j81 = j80 >> 21;
                long j82 = j81 << 21;
                long j83 = (j44 - j46) + j57 + j81;
                long j84 = j83 >> 21;
                long j85 = j84 << 21;
                long j86 = (j58 - (j59 << 21)) + j84;
                long j87 = j86 >> 21;
                long j88 = j87 << 21;
                long j89 = (j47 - j49) + j59 + j87;
                long j90 = j89 >> 21;
                long j91 = j90 << 21;
                long j92 = (j60 - (j61 << 21)) + j90;
                long j93 = j92 >> 21;
                long j94 = j93 << 21;
                long j95 = (j50 - (j51 << 21)) + j61 + j93;
                long j96 = j95 >> 21;
                long j97 = j96 << 21;
                long j98 = (j62 - j64) + j96;
                long j99 = j98 >> 21;
                long j100 = j99 << 21;
                long j101 = (j65 - j67) + (666643 * j99);
                long j102 = j101 >> 21;
                long j103 = j102 << 21;
                long j104 = (j68 - j70) + (470296 * j99) + j102;
                long j105 = j104 >> 21;
                long j106 = j105 << 21;
                long j107 = (j71 - j73) + (654183 * j99) + j105;
                long j108 = j107 >> 21;
                long j109 = j108 << 21;
                long j110 = ((j74 - j76) - (997805 * j99)) + j108;
                long j111 = j110 >> 21;
                long j112 = j111 << 21;
                long j113 = (j77 - j79) + (136657 * j99) + j111;
                long j114 = j113 >> 21;
                long j115 = ((j80 - j82) - (j99 * 683901)) + j114;
                long j116 = j115 >> 21;
                long j117 = j116 << 21;
                long j118 = (j83 - j85) + j116;
                long j119 = j118 >> 21;
                long j120 = j119 << 21;
                long j121 = (j86 - j88) + j119;
                long j122 = j121 >> 21;
                long j123 = j122 << 21;
                long j124 = (j89 - j91) + j122;
                long j125 = j124 >> 21;
                long j126 = j125 << 21;
                long j127 = (j92 - j94) + j125;
                long j128 = j127 >> 21;
                long j129 = j128 << 21;
                long j130 = (j95 - j97) + j128;
                long j131 = j130 >> 21;
                bArrDigest[0] = (byte) (j101 - j103);
                long j132 = j121 - j123;
                long j133 = j118 - j120;
                long j134 = j115 - j117;
                long j135 = j113 - (j114 << 21);
                long j136 = j110 - j112;
                long j137 = j107 - j109;
                long j138 = j104 - j106;
                bArrDigest[1] = (byte) (r10 >> 8);
                bArrDigest[2] = (byte) ((r10 >> 16) | (j138 << 5));
                bArrDigest[3] = (byte) (j138 >> 3);
                bArrDigest[4] = (byte) (j138 >> 11);
                bArrDigest[5] = (byte) ((j138 >> 19) | (j137 << 2));
                bArrDigest[6] = (byte) (j137 >> 6);
                bArrDigest[7] = (byte) ((j137 >> 14) | (j136 << 7));
                bArrDigest[8] = (byte) (j136 >> 1);
                bArrDigest[9] = (byte) (j136 >> 9);
                bArrDigest[10] = (byte) ((j136 >> 17) | (j135 << 4));
                bArrDigest[11] = (byte) (j135 >> 4);
                bArrDigest[12] = (byte) (j135 >> 12);
                bArrDigest[13] = (byte) ((j135 >> 20) | (j134 + j134));
                bArrDigest[14] = (byte) (j134 >> 7);
                bArrDigest[15] = (byte) ((j134 >> 15) | (j133 << 6));
                bArrDigest[16] = (byte) (j133 >> 2);
                bArrDigest[17] = (byte) (j133 >> 10);
                bArrDigest[18] = (byte) ((j133 >> 18) | (j132 << 3));
                long j139 = j130 - (j131 << 21);
                long j140 = (j98 - j100) + j131;
                long j141 = j127 - j129;
                bArrDigest[19] = (byte) (j132 >> 5);
                bArrDigest[20] = (byte) (j132 >> 13);
                bArrDigest[21] = (byte) (j124 - j126);
                bArrDigest[22] = (byte) (r6 >> 8);
                bArrDigest[23] = (byte) ((r6 >> 16) | (j141 << 5));
                bArrDigest[24] = (byte) (j141 >> 3);
                bArrDigest[25] = (byte) (j141 >> 11);
                bArrDigest[26] = (byte) ((j141 >> 19) | (j139 << 2));
                bArrDigest[27] = (byte) (j139 >> 6);
                bArrDigest[28] = (byte) ((j139 >> 14) | (j140 << 7));
                bArrDigest[29] = (byte) (j140 >> 1);
                bArrDigest[30] = (byte) (j140 >> 9);
                bArrDigest[31] = (byte) (j140 >> 17);
                long[] jArr = new long[10];
                long[] jArrL = erdz.l(bArrC);
                long[] jArr2 = new long[10];
                jArr2[0] = 1;
                long[] jArr3 = new long[10];
                long[] jArr4 = new long[10];
                long[] jArr5 = new long[10];
                long[] jArr6 = new long[10];
                long[] jArr7 = new long[10];
                erdz.h(jArr4, jArrL);
                erdz.b(jArr5, jArr4, erdu.a);
                erdz.i(jArr4, jArr4, jArr2);
                erdz.j(jArr5, jArr5, jArr2);
                long[] jArr8 = new long[10];
                erdz.h(jArr8, jArr5);
                erdz.b(jArr8, jArr8, jArr5);
                erdz.h(jArr, jArr8);
                erdz.b(jArr, jArr, jArr5);
                erdz.b(jArr, jArr, jArr4);
                long[] jArr9 = new long[10];
                long[] jArr10 = new long[10];
                long[] jArr11 = new long[10];
                erdz.h(jArr9, jArr);
                erdz.h(jArr10, jArr9);
                erdz.h(jArr10, jArr10);
                erdz.b(jArr10, jArr, jArr10);
                erdz.b(jArr9, jArr9, jArr10);
                erdz.h(jArr9, jArr9);
                erdz.b(jArr9, jArr10, jArr9);
                erdz.h(jArr10, jArr9);
                for (int i4 = 1; i4 < 5; i4++) {
                    erdz.h(jArr10, jArr10);
                }
                erdz.b(jArr9, jArr10, jArr9);
                erdz.h(jArr10, jArr9);
                for (int i5 = 1; i5 < 10; i5++) {
                    erdz.h(jArr10, jArr10);
                }
                erdz.b(jArr10, jArr10, jArr9);
                erdz.h(jArr11, jArr10);
                for (int i6 = 1; i6 < 20; i6++) {
                    erdz.h(jArr11, jArr11);
                }
                erdz.b(jArr10, jArr11, jArr10);
                erdz.h(jArr10, jArr10);
                for (int i7 = 1; i7 < 10; i7++) {
                    erdz.h(jArr10, jArr10);
                }
                erdz.b(jArr9, jArr10, jArr9);
                erdz.h(jArr10, jArr9);
                for (int i8 = 1; i8 < 50; i8++) {
                    erdz.h(jArr10, jArr10);
                }
                erdz.b(jArr10, jArr10, jArr9);
                erdz.h(jArr11, jArr10);
                for (int i9 = 1; i9 < 100; i9++) {
                    erdz.h(jArr11, jArr11);
                }
                erdz.b(jArr10, jArr11, jArr10);
                erdz.h(jArr10, jArr10);
                for (int i10 = 1; i10 < 50; i10++) {
                    erdz.h(jArr10, jArr10);
                }
                erdz.b(jArr9, jArr10, jArr9);
                erdz.h(jArr9, jArr9);
                erdz.h(jArr9, jArr9);
                erdz.b(jArr, jArr9, jArr);
                erdz.b(jArr, jArr, jArr8);
                erdz.b(jArr, jArr, jArr4);
                erdz.h(jArr6, jArr);
                erdz.b(jArr6, jArr6, jArr5);
                erdz.i(jArr7, jArr6, jArr4);
                if (erds.h(jArr7)) {
                    erdz.j(jArr7, jArr6, jArr4);
                    if (erds.h(jArr7)) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                    }
                    erdz.b(jArr, jArr, erdu.c);
                }
                if (erds.h(jArr)) {
                    b = 255;
                } else {
                    b = 255;
                    if (((bArrC[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                }
                if (erds.a(jArr) == ((bArrC[31] & b) >> 7)) {
                    erds.f(jArr, jArr);
                }
                erdz.b(jArr3, jArr, jArrL);
                erdr erdrVar = new erdr(new erdq(jArr, jArrL, jArr2), jArr3);
                erdo[] erdoVarArr = new erdo[8];
                erdoVarArr[0] = new erdo(erdrVar);
                erdp erdpVar2 = new erdp(new erdq(), new long[10]);
                erds.e(erdpVar2, erdrVar.a);
                erdr erdrVar2 = new erdr(erdpVar2);
                for (int i11 = 1; i11 < 8; i11++) {
                    erds.d(erdpVar2, erdrVar2, erdoVarArr[i11 - 1]);
                    erdoVarArr[i11] = new erdo(new erdr(erdpVar2));
                }
                byte[] bArrK = erds.k(bArrDigest);
                byte[] bArrK2 = erds.k(bArrCopyOfRange);
                erdp erdpVar3 = new erdp(erds.a);
                erdr erdrVar3 = new erdr();
                int i12 = b;
                while (i12 >= 0 && bArrK[i12] == 0 && bArrK2[i12] == 0) {
                    i12--;
                }
                while (i12 >= 0) {
                    erds.e(erdpVar3, new erdq(erdpVar3));
                    byte b2 = bArrK[i12];
                    if (b2 > 0) {
                        erdr.a(erdrVar3, erdpVar3);
                        erds.d(erdpVar3, erdrVar3, erdoVarArr[bArrK[i12] / 2]);
                    } else if (b2 < 0) {
                        erdr.a(erdrVar3, erdpVar3);
                        erds.g(erdpVar3, erdrVar3, erdoVarArr[(-bArrK[i12]) / 2]);
                    }
                    byte b3 = bArrK2[i12];
                    if (b3 > 0) {
                        erdr.a(erdrVar3, erdpVar3);
                        erds.d(erdpVar3, erdrVar3, erdu.e[bArrK2[i12] / 2]);
                    } else if (b3 < 0) {
                        erdr.a(erdrVar3, erdpVar3);
                        erds.g(erdpVar3, erdrVar3, erdu.e[(-bArrK2[i12]) / 2]);
                    }
                    i12--;
                }
                byte[] bArrA = new erdq(erdpVar3).a();
                for (int i13 = 0; i13 < 32; i13++) {
                    if (bArrA[i13] == bArr[i13]) {
                    }
                }
                return;
            }
        }
        throw new GeneralSecurityException("Signature check failed.");
    }

    @Override // defpackage.eqsw
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        if (length == 0 && this.c.length == 0) {
            c(bArr, bArr2);
        } else {
            if (!ergh.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.c;
            if (bArr4.length != 0) {
                bArr2 = erup.b(bArr2, bArr4);
            }
            c(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
