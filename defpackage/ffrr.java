package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffrr {
    public static PrivateKeyInfo a(ffiz ffizVar, ASN1Set aSN1Set) throws IOException {
        int i;
        int i2;
        int i3;
        byte[][] bArr;
        int i4;
        int i5;
        long jC;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ffnz ffnzVar;
        if (ffizVar instanceof ffvx) {
            ffvx ffvxVar = (ffvx) ffizVar;
            return new PrivateKeyInfo(ffsq.s(ffvxVar.b), new DEROctetString(ffwk.c(ffvxVar.c)), aSN1Set);
        }
        if (ffizVar instanceof ffre) {
            ffre ffreVar = (ffre) ffizVar;
            return new PrivateKeyInfo(new AlgorithmIdentifier(ffni.d, new ffnj(ffsq.t(ffreVar.b))), new DEROctetString(ffreVar.a()));
        }
        if (ffizVar instanceof ffpw) {
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(ffni.e);
            short[] sArrA = ((ffpw) ffizVar).a();
            int length = sArrA.length;
            byte[] bArr2 = new byte[length + length];
            for (int i12 = 0; i12 != sArrA.length; i12++) {
                short s = sArrA[i12];
                int i13 = i12 + i12;
                bArr2[i13] = (byte) s;
                bArr2[i13 + 1] = (byte) (s >>> 8);
            }
            return new PrivateKeyInfo(algorithmIdentifier, new DEROctetString(bArr2));
        }
        if (ffizVar instanceof ffpq) {
            ffpq ffpqVar = (ffpq) ffizVar;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ffpg.d(1, byteArrayOutputStream);
            ffpg.a(ffpqVar, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            ffpg.d(1, byteArrayOutputStream2);
            ffpg.a(ffpqVar.b(), byteArrayOutputStream2);
            return new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.F), new DEROctetString(byteArray), aSN1Set, byteArrayOutputStream2.toByteArray());
        }
        if (ffizVar instanceof ffpj) {
            ffpj ffpjVar = (ffpj) ffizVar;
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = ffpjVar.b;
            ffpg.d(i14, byteArrayOutputStream3);
            ffpg.a(ffpjVar, byteArrayOutputStream3);
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            ffpg.d(i14, byteArrayOutputStream4);
            ffpg.a(ffpjVar.b().c, byteArrayOutputStream4);
            return new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.F), new DEROctetString(byteArray2), aSN1Set, byteArrayOutputStream4.toByteArray());
        }
        if (ffizVar instanceof ffro) {
            ffro ffroVar = (ffro) ffizVar;
            AlgorithmIdentifier algorithmIdentifier2 = new AlgorithmIdentifier(ffsq.q(ffroVar.b));
            DEROctetString dEROctetString = new DEROctetString(ffroVar.a());
            ffrg ffrgVar = ffroVar.d;
            return new PrivateKeyInfo(algorithmIdentifier2, dEROctetString, aSN1Set, ffwk.e(ffrgVar.a, ffrgVar.b));
        }
        if (ffizVar instanceof ffqm) {
            ffqm ffqmVar = (ffqm) ffizVar;
            return new PrivateKeyInfo(new AlgorithmIdentifier(ffsq.m(ffqmVar.b)), new DEROctetString(ffqmVar.a()), aSN1Set);
        }
        if (!(ffizVar instanceof ffoa)) {
            if (ffizVar instanceof fftw) {
                fftw fftwVar = (fftw) ffizVar;
                fftu fftuVar = fftwVar.c;
                int i15 = fftuVar.c;
                AlgorithmIdentifier algorithmIdentifier3 = new AlgorithmIdentifier(ffni.f, new ffnm(i15, ffsq.u(fftwVar.b)));
                byte[] bArrS = fftwVar.s();
                int i16 = fftuVar.f;
                int iL = (int) ffua.l(bArrS, 4);
                if (!ffua.f(i15, iL)) {
                    throw new IllegalArgumentException("index out of bounds");
                }
                byte[] bArrH = ffua.h(bArrS, 4, i16);
                int i17 = i16 + 4;
                byte[] bArrH2 = ffua.h(bArrS, i17, i16);
                int i18 = i17 + i16;
                byte[] bArrH3 = ffua.h(bArrS, i18, i16);
                int i19 = i18 + i16;
                byte[] bArrH4 = ffua.h(bArrS, i19, i16);
                int i20 = i19 + i16;
                byte[] bArrH5 = ffua.h(bArrS, i20, bArrS.length - i20);
                try {
                    int i21 = ((ffsr) ffua.c(bArrH5, ffsr.class)).b;
                    return new PrivateKeyInfo(algorithmIdentifier3, i21 != (1 << i15) + (-1) ? new ffnq(iL, bArrH, bArrH2, bArrH3, bArrH4, bArrH5, i21) : new ffnq(iL, bArrH, bArrH2, bArrH3, bArrH4, bArrH5), aSN1Set);
                } catch (ClassNotFoundException e) {
                    throw new IOException("cannot parse BDS: ".concat(String.valueOf(e.getMessage())));
                }
            }
            if (ffizVar instanceof ffto) {
                ffto fftoVar = (ffto) ffizVar;
                fftm fftmVar = fftoVar.c;
                int i22 = fftmVar.d;
                AlgorithmIdentifier algorithmIdentifier4 = new AlgorithmIdentifier(ffni.g, new ffnn(i22, fftmVar.e, ffsq.u(fftoVar.b)));
                byte[] bArrS2 = fftoVar.s();
                int iA = fftmVar.a();
                int i23 = (i22 + 7) / 8;
                long jL = (int) ffua.l(bArrS2, i23);
                if (!ffua.f(i22, jL)) {
                    throw new IllegalArgumentException("index out of bounds");
                }
                byte[] bArrH6 = ffua.h(bArrS2, i23, iA);
                int i24 = i23 + iA;
                byte[] bArrH7 = ffua.h(bArrS2, i24, iA);
                int i25 = i24 + iA;
                byte[] bArrH8 = ffua.h(bArrS2, i25, iA);
                int i26 = i25 + iA;
                byte[] bArrH9 = ffua.h(bArrS2, i26, iA);
                int i27 = i26 + iA;
                byte[] bArrH10 = ffua.h(bArrS2, i27, bArrS2.length - i27);
                try {
                    long j = ((ffss) ffua.c(bArrH10, ffss.class)).b;
                    return new PrivateKeyInfo(algorithmIdentifier4, j != (1 << i22) + (-1) ? new ffno(jL, bArrH6, bArrH7, bArrH8, bArrH9, bArrH10, j) : new ffno(jL, bArrH6, bArrH7, bArrH8, bArrH9, bArrH10), aSN1Set);
                } catch (ClassNotFoundException e2) {
                    throw new IOException("cannot parse BDSStateMap: ".concat(String.valueOf(e2.getMessage())));
                }
            }
            if (ffizVar instanceof ffvv) {
                ffvv ffvvVar = (ffvv) ffizVar;
                return new PrivateKeyInfo(new AlgorithmIdentifier(ffni.c), new ffng(ffvvVar.c, ffvvVar.d, ffvvVar.e, ffvvVar.f, ffvvVar.g, ffsq.r(ffvvVar.b)));
            }
            if (ffizVar instanceof ffpa) {
                ffpa ffpaVar = (ffpa) ffizVar;
                return new PrivateKeyInfo(new AlgorithmIdentifier(ffsq.g(ffpaVar.b)), new DEROctetString(ffwk.c(ffpaVar.c)), aSN1Set);
            }
            if (ffizVar instanceof ffqz) {
                ffqz ffqzVar = (ffqz) ffizVar;
                return new PrivateKeyInfo(new AlgorithmIdentifier(ffsq.o(ffqzVar.b)), new DEROctetString(ffwk.c(ffqzVar.c)), aSN1Set);
            }
            if (ffizVar instanceof ffqa) {
                ffqa ffqaVar = (ffqa) ffizVar;
                return new PrivateKeyInfo(new AlgorithmIdentifier(ffsq.k(ffqaVar.b)), new DEROctetString(ffqaVar.a()), aSN1Set);
            }
            if (ffizVar instanceof ffow) {
                ffow ffowVar = (ffow) ffizVar;
                return new PrivateKeyInfo(new AlgorithmIdentifier(ffsq.f(ffowVar.b)), new ffnd(ffwk.c(ffowVar.d), ffwk.c(ffowVar.e), ffwk.c(ffowVar.f), new ffne(ffwk.c(ffowVar.c))), aSN1Set);
            }
            if (ffizVar instanceof ffoq) {
                ffoq ffoqVar = (ffoq) ffizVar;
                return new PrivateKeyInfo(new AlgorithmIdentifier(ffsq.i(ffoqVar.b)), new DEROctetString(ffwk.d(new byte[][]{ffoqVar.c, ffoqVar.f, ffoqVar.g, ffoqVar.d, ffoqVar.e})), aSN1Set);
            }
            if (ffizVar instanceof ffqe) {
                ffqe ffqeVar = (ffqe) ffizVar;
                ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                aSN1EncodableVector.b(new DEROctetString(ffwk.c(ffqeVar.c)));
                aSN1EncodableVector.b(new DEROctetString(ffwk.c(ffqeVar.d)));
                aSN1EncodableVector.b(new DEROctetString(ffwk.c(ffqeVar.e)));
                aSN1EncodableVector.b(new DEROctetString(ffwk.c(ffqeVar.f)));
                return new PrivateKeyInfo(new AlgorithmIdentifier(ffsq.l(ffqeVar.b)), new DERSequence(aSN1EncodableVector), aSN1Set);
            }
            if (ffizVar instanceof ffqi) {
                ffqi ffqiVar = (ffqi) ffizVar;
                ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                aSN1EncodableVector2.b(new DEROctetString(ffwk.c(ffqiVar.c)));
                aSN1EncodableVector2.b(new DEROctetString(ffwk.c(ffqiVar.d)));
                aSN1EncodableVector2.b(new DEROctetString(ffwk.c(ffqiVar.e)));
                aSN1EncodableVector2.b(new DEROctetString(ffwk.c(ffqiVar.f)));
                aSN1EncodableVector2.b(new DEROctetString(ffwk.c(ffqiVar.g)));
                return new PrivateKeyInfo(new AlgorithmIdentifier(ffsq.p(ffqiVar.b)), new DERSequence(aSN1EncodableVector2), aSN1Set);
            }
            if (ffizVar instanceof ffoj) {
                ffoj ffojVar = (ffoj) ffizVar;
                ffoi ffoiVar = ffojVar.b;
                AlgorithmIdentifier algorithmIdentifier5 = new AlgorithmIdentifier(ffsq.e(ffoiVar));
                byte[] bArr3 = ffojVar.c;
                return new PrivateKeyInfo(algorithmIdentifier5, new DEROctetString(ffwk.d(new byte[][]{bArr3, ffojVar.d, ffojVar.e, ffojVar.f, ffojVar.g, ffojVar.h})), aSN1Set, new ffok(ffoiVar, bArr3, ffojVar.i).a());
            }
            if (ffizVar instanceof ffnu) {
                ffnu ffnuVar = (ffnu) ffizVar;
                return new PrivateKeyInfo(new AlgorithmIdentifier(ffsq.d(ffnuVar.b)), new DEROctetString(ffnuVar.a()), aSN1Set);
            }
            if (ffizVar instanceof ffpe) {
                ffpe ffpeVar = (ffpe) ffizVar;
                return new PrivateKeyInfo(new AlgorithmIdentifier(ffsq.h(ffpeVar.b)), new DEROctetString(ffpeVar.a()), aSN1Set);
            }
            if (!(ffizVar instanceof ffqt)) {
                throw new IOException("key parameters not recognized");
            }
            ffqt ffqtVar = (ffqt) ffizVar;
            ffqs ffqsVar = ffqtVar.b;
            return new PrivateKeyInfo(new AlgorithmIdentifier(ffsq.n(ffqsVar)), new DEROctetString(ffqsVar.m == 3 ? ffwk.e(ffqtVar.o, ffqtVar.c) : ffwk.e(ffwk.e(ffwk.e(ffwk.e(ffwk.e(ffwk.e(ffwk.e(ffwk.e(ffwk.e(ffwk.e(ffwk.e(ffwk.e(ffqtVar.c, ffqv.c(ffqtVar.d)), ffqv.c(ffqtVar.e)), ffqv.c(ffqtVar.g)), ffqv.c(ffqtVar.f)), ffqv.d(ffqtVar.h, true)), ffqv.d(ffqtVar.i, false)), ffqv.d(ffqtVar.j, true)), ffqv.d(ffqtVar.k, false)), ffqv.d(ffqtVar.l, false)), ffqv.d(ffqtVar.m, true)), ffqv.d(ffqtVar.n, false)), ffqtVar.p)), aSN1Set);
        }
        ffoa ffoaVar = (ffoa) ffizVar;
        ffnz ffnzVar2 = ffoaVar.b;
        AlgorithmIdentifier algorithmIdentifier6 = new AlgorithmIdentifier(ffsq.j(ffnzVar2));
        ffnx ffnxVar = ffnzVar2.m;
        byte[] bArr4 = new byte[ffnxVar.a()];
        byte[] bArr5 = ffoaVar.c;
        byte[] bArr6 = new byte[ffnxVar.a()];
        int i28 = ffnxVar.c;
        int i29 = 1 << i28;
        short[] sArr = new short[i29];
        long[] jArr = {0};
        int i30 = ffnxVar.a;
        int i31 = 8;
        int i32 = i30 >> 3;
        int[] iArr = new int[i29];
        int i33 = i29 * 4;
        int i34 = i32 + i33;
        byte[] bArr7 = new byte[i34];
        int i35 = ffnxVar.d;
        ffiv ffivVar = new ffiv(256);
        ffivVar.f((byte) 64);
        ffivVar.g(bArr5, 0, 32);
        ffivVar.l(bArr7, 0, i34);
        for (int i36 = 0; i36 < i29; i36++) {
            iArr[i36] = ffwp.b(bArr7, (((i34 - 32) - i35) - i33) + (i36 * 4));
        }
        int i37 = ffnxVar.b;
        short[] sArr2 = new short[i37 + 1];
        sArr2[i37] = 1;
        for (int i38 = 0; i38 < i37; i38++) {
            sArr2[i38] = (short) (ffwp.d(bArr5, i38 + i38 + 40) & ffnxVar.f);
        }
        long[] jArr2 = new long[i29];
        int i39 = 0;
        while (i39 < i29) {
            long[] jArr3 = jArr2;
            long j2 = iArr[i39];
            jArr3[i39] = j2;
            long j3 = j2 << 31;
            jArr3[i39] = j3;
            long j4 = j3 | i39;
            jArr3[i39] = j4;
            jArr3[i39] = j4 & Long.MAX_VALUE;
            i39++;
            jArr2 = jArr3;
        }
        long[] jArr4 = jArr2;
        int i40 = 1;
        while (i40 < i29 - i40) {
            i40 += i40;
        }
        int i41 = i40;
        while (i41 > 0) {
            short[] sArr3 = sArr2;
            int i42 = 0;
            while (i42 < i29 - i41) {
                if ((i42 & i41) == 0) {
                    int i43 = i42 + i41;
                    long j5 = jArr4[i43];
                    long j6 = jArr4[i42];
                    i11 = i42;
                    ffnzVar = ffnzVar2;
                    long j7 = (-((j5 - j6) >>> 63)) & (j6 ^ j5);
                    jArr4[i11] = j6 ^ j7;
                    jArr4[i43] = jArr4[i43] ^ j7;
                } else {
                    i11 = i42;
                    ffnzVar = ffnzVar2;
                }
                i42 = i11 + 1;
                ffnzVar2 = ffnzVar;
            }
            ffnz ffnzVar3 = ffnzVar2;
            int i44 = 0;
            for (int i45 = i40; i45 > i41; i45 >>>= 1) {
                while (i44 < i29 - i45) {
                    if ((i44 & i41) == 0) {
                        int i46 = i44 + i41;
                        long j8 = jArr4[i46];
                        i8 = i44;
                        int i47 = i45;
                        while (i47 > i41) {
                            int i48 = i8 + i47;
                            long j9 = jArr4[i48];
                            int i49 = i40;
                            long j10 = (-((j9 - j8) >>> 63)) & (j8 ^ j9);
                            j8 ^= j10;
                            jArr4[i48] = j9 ^ j10;
                            i47 >>>= 1;
                            i40 = i49;
                            i41 = i41;
                        }
                        i9 = i40;
                        i10 = i41;
                        jArr4[i46] = j8;
                    } else {
                        i8 = i44;
                        i9 = i40;
                        i10 = i41;
                    }
                    i44 = i8 + 1;
                    i40 = i9;
                    i41 = i10;
                }
            }
            i41 >>>= 1;
            sArr2 = sArr3;
            ffnzVar2 = ffnzVar3;
        }
        short[] sArr4 = sArr2;
        ffnz ffnzVar4 = ffnzVar2;
        int i50 = 1;
        while (true) {
            if (i50 >= i29) {
                short[] sArr5 = new short[i30];
                int i51 = 0;
                while (i51 < i29) {
                    int i52 = i51;
                    sArr[i52] = (short) (ffnxVar.f & jArr4[i51]);
                    i51 = i52 + 1;
                    i29 = i29;
                }
                for (int i53 = 0; i53 < i30; i53++) {
                    short s2 = sArr[i53];
                    short s3 = (short) (((s2 >> 8) & 255) | ((s2 & 255) << 8));
                    short s4 = (short) (((s3 & 3855) << 4) | ((s3 >> 4) & 3855));
                    short s5 = (short) (((s4 & 13107) << 2) | ((s4 >> 2) & 13107));
                    int i54 = s5 >> 1;
                    int i55 = s5 & 21845;
                    short s6 = (short) ((i55 + i55) | (i54 & 21845));
                    sArr5[i53] = (short) (i28 == 12 ? s6 >> 4 : s6 >> 3);
                }
                short[] sArr6 = new short[i30];
                for (int i56 = 0; i56 < i30; i56++) {
                    short s7 = sArr5[i56];
                    short sB = sArr4[i37];
                    int i57 = i37 - 1;
                    while (i57 >= 0) {
                        sB = (short) (ffnxVar.g.b(sB, s7) ^ sArr4[i57]);
                        i57--;
                        sArr5 = sArr5;
                    }
                    sArr6[i56] = sB;
                }
                short[] sArr7 = sArr5;
                for (int i58 = 0; i58 < i30; i58++) {
                    sArr6[i58] = ffnxVar.g.a(sArr6[i58]);
                }
                int i59 = ffnxVar.e;
                byte b = 0;
                byte[][] bArr8 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i59, i32);
                int i60 = 0;
                while (i60 < i59) {
                    int i61 = b;
                    while (i61 < i32) {
                        bArr8[i60][i61] = b;
                        i61++;
                        b = 0;
                    }
                    i60++;
                    b = 0;
                }
                int i62 = 0;
                while (i62 < i37) {
                    for (int i63 = 0; i63 < i30; i63 += 8) {
                        int i64 = 0;
                        while (i64 < i28) {
                            int i65 = (sArr6[i63 + 7] >>> i64) & 1;
                            int i66 = (sArr6[i63 + 6] >>> i64) & 1;
                            int i67 = (i65 + i65) | i66;
                            int i68 = (i67 + i67) | ((sArr6[i63 + 5] >>> i64) & 1);
                            int i69 = (i68 + i68) | ((sArr6[i63 + 4] >>> i64) & 1);
                            int i70 = (i69 + i69) | ((sArr6[i63 + 3] >>> i64) & 1);
                            int i71 = (i70 + i70) | ((sArr6[i63 + 2] >>> i64) & 1);
                            int i72 = (i71 + i71) | ((sArr6[i63 + 1] >>> i64) & 1);
                            bArr8[(i62 * i28) + i64][i63 / 8] = (byte) (((byte) (i72 + i72)) | ((sArr6[i63] >>> i64) & 1));
                            i64++;
                            i37 = i37;
                        }
                    }
                    int i73 = i37;
                    int i74 = 0;
                    while (i74 < i30) {
                        int i75 = i74;
                        sArr6[i75] = ffnxVar.g.b(sArr6[i74], sArr7[i75]);
                        i74 = i75 + 1;
                    }
                    i62++;
                    i37 = i73;
                }
                int i76 = 0;
                loop22: while (true) {
                    if (i76 < i59) {
                        int i77 = i76 >>> 3;
                        int i78 = i76 & 7;
                        if (ffnxVar.i && i76 == i59 - 32) {
                            long[] jArr5 = new long[64];
                            i2 = i30;
                            long[] jArr6 = new long[32];
                            boolean z = ffnxVar.h;
                            int i79 = i5 & 7;
                            int i80 = i5 >> 3;
                            i3 = i78;
                            byte[] bArr9 = new byte[9];
                            if (z) {
                                bArr = bArr8;
                                int i81 = 0;
                                while (i81 < 32) {
                                    int i82 = i81;
                                    for (int i83 = 0; i83 < 9; i83++) {
                                        bArr9[i83] = bArr[i5 + i82][i80 + i83];
                                    }
                                    int i84 = 0;
                                    for (int i85 = i31; i84 < i85; i85 = 8) {
                                        int i86 = i84;
                                        int i87 = i86 + 1;
                                        bArr9[i86] = (byte) (((bArr9[i86] & 255) >> i79) | (bArr9[i87] << (8 - i79)));
                                        i84 = i87;
                                    }
                                    jArr5[i82] = ffwp.c(bArr9, 0);
                                    i81 = i82 + 1;
                                    i31 = 8;
                                }
                            } else {
                                bArr = bArr8;
                                for (int i88 = 0; i88 < 32; i88++) {
                                    jArr5[i88] = ffwp.c(bArr[i5 + i88], i80);
                                }
                            }
                            jArr[0] = 0;
                            int i89 = 0;
                            int i90 = 32;
                            while (i89 < i90) {
                                int i91 = i89 + 1;
                                int i92 = i77;
                                int i93 = i5;
                                long j11 = jArr5[i89];
                                int i94 = i89;
                                int i95 = i91;
                                while (i95 < i90) {
                                    j11 |= jArr5[i95];
                                    i95++;
                                    i90 = 32;
                                }
                                if (j11 == 0) {
                                    break loop22;
                                }
                                long j12 = ~j11;
                                long j13 = 72340172838076673L;
                                long j14 = 0;
                                for (int i96 = 0; i96 < 8; i96++) {
                                    j13 &= j12 >>> i96;
                                    j14 += j13;
                                }
                                long j15 = j14 & 578721382704613384L;
                                long j16 = j15 | (j15 >>> 1);
                                long j17 = j14 >>> 8;
                                long j18 = j16 | (j16 >>> 2);
                                long j19 = j18;
                                long j20 = j14 + (j17 & j18);
                                int i97 = 2;
                                for (int i98 = 8; i97 < i98; i98 = 8) {
                                    j19 &= j19 >>> i98;
                                    j17 >>>= i98;
                                    j20 += j17 & j19;
                                    i97++;
                                }
                                int i99 = ((int) j20) & 255;
                                long j21 = i99;
                                jArr6[i94] = j21;
                                jArr[0] = jArr[0] | (1 << ((int) j21));
                                int i100 = i91;
                                while (true) {
                                    i7 = 32;
                                    if (i100 >= 32) {
                                        break;
                                    }
                                    jArr5[i94] = jArr5[i94] ^ (jArr5[i100] & (((r11 >> i99) & 1) - 1));
                                    i100++;
                                }
                                int i101 = i91;
                                while (i101 < i7) {
                                    long j22 = jArr5[i101];
                                    int i102 = i101;
                                    jArr5[i102] = j22 ^ (jArr5[i94] & (-((j22 >> i99) & 1)));
                                    i101 = i102 + 1;
                                    i7 = 32;
                                }
                                i90 = i7;
                                i89 = i91;
                                i77 = i92;
                                i5 = i93;
                            }
                            i4 = i77;
                            int i103 = i5;
                            int i104 = 0;
                            while (i104 < i90) {
                                int i105 = i104 + 1;
                                int i106 = i105;
                                while (i106 < 64) {
                                    int i107 = i103 + i104;
                                    short s8 = sArr[i107];
                                    int i108 = i105;
                                    long j23 = (-(((((short) i106) ^ ((short) jArr6[r43])) - 1) >>> 63)) & (s8 ^ sArr[r40]);
                                    sArr[i107] = (short) (s8 ^ j23);
                                    sArr[i103 + i106] = (short) (j23 ^ sArr[r40]);
                                    i106++;
                                    i105 = i108;
                                    i104 = i104;
                                    z = z;
                                }
                                i104 = i105;
                                i90 = 32;
                            }
                            boolean z2 = z;
                            int i109 = 0;
                            while (i109 < i59) {
                                if (z2) {
                                    for (int i110 = 0; i110 < 9; i110++) {
                                        bArr9[i110] = bArr[i109][i80 + i110];
                                    }
                                    int i111 = 0;
                                    while (i111 < 8) {
                                        int i112 = i111 + 1;
                                        bArr9[i111] = (byte) ((bArr9[i112] << (8 - i79)) | ((bArr9[i111] & 255) >> i79));
                                        i111 = i112;
                                    }
                                    jC = ffwp.c(bArr9, 0);
                                } else {
                                    jC = ffwp.c(bArr[i109], i80);
                                }
                                int i113 = 0;
                                while (i113 < 32) {
                                    long j24 = jC >> i113;
                                    int i114 = i113;
                                    int i115 = (int) jArr6[i114];
                                    long j25 = (j24 ^ (jC >> i115)) & 1;
                                    long j26 = ((j25 << i115) ^ jC) ^ (j25 << i114);
                                    i113 = i114 + 1;
                                    jC = j26;
                                }
                                if (z2) {
                                    int i116 = 8 - i79;
                                    ffof.a(bArr9, 0, jC);
                                    byte[] bArr10 = bArr[i109];
                                    int i117 = i80 + 8;
                                    i6 = i109;
                                    bArr10[i117] = (byte) (((bArr9[7] & 255) >>> i116) | (((bArr10[i117] & 255) >>> i79) << i79));
                                    bArr10[i80] = (byte) (((bArr9[0] & 255) << i79) | (((bArr10[i80] & 255) << i116) >>> i116));
                                    int i118 = 7;
                                    while (i118 > 0) {
                                        byte[] bArr11 = bArr[i6];
                                        int i119 = i80 + i118;
                                        int i120 = (bArr9[i118] & 255) << i79;
                                        int i121 = i118 - 1;
                                        bArr11[i119] = (byte) (((bArr9[i121] & 255) >>> i116) | i120);
                                        i118 = i121;
                                    }
                                } else {
                                    i6 = i109;
                                    ffof.a(bArr[i6], i80, jC);
                                }
                                i109 = i6 + 1;
                            }
                        } else {
                            i2 = i30;
                            i3 = i78;
                            bArr = bArr8;
                            i4 = i77;
                        }
                        int i122 = i76 + 1;
                        for (int i123 = i122; i123 < i59; i123++) {
                            int i124 = (((byte) (bArr[i76][i4] ^ bArr[i123][i4])) >> i3) & 1;
                            for (int i125 = 0; i125 < i32; i125++) {
                                byte[] bArr12 = bArr[i76];
                                bArr12[i125] = (byte) ((bArr[i123][i125] & (-i124)) ^ bArr12[i125]);
                            }
                        }
                        if (((bArr[i76][i4] >> i3) & 1) == 0) {
                            break;
                        }
                        for (int i126 = 0; i126 < i59; i126++) {
                            if (i126 != i76) {
                                int i127 = (bArr[i126][i4] >> i3) & 1;
                                for (int i128 = 0; i128 < i32; i128++) {
                                    byte[] bArr13 = bArr[i126];
                                    bArr13[i128] = (byte) ((bArr[i76][i128] & (-i127)) ^ bArr13[i128]);
                                }
                            }
                        }
                        i76 = i122;
                        i30 = i2;
                        bArr8 = bArr;
                        i62 = i4;
                        i31 = 8;
                    } else {
                        int i129 = i30;
                        byte[][] bArr14 = bArr8;
                        if (ffnxVar.h) {
                            int i130 = i59 & 7;
                            if (i130 == 0) {
                                System.arraycopy(bArr14[i62], (i59 - 1) >> 3, bArr6, 0, i32);
                            } else {
                                int i131 = 0;
                                int i132 = 0;
                                while (i131 < i59) {
                                    int i133 = (i59 - 1) >> 3;
                                    while (true) {
                                        i = i132 + 1;
                                        if (i133 < i32 - 1) {
                                            byte[] bArr15 = bArr14[i131];
                                            int i134 = (bArr15[i133] & 255) >>> i130;
                                            i133++;
                                            bArr6[i132] = (byte) ((bArr15[i133] << (8 - i130)) | i134);
                                            i132 = i;
                                        }
                                    }
                                    bArr6[i132] = (byte) ((bArr14[i131][i133] & 255) >>> i130);
                                    i131++;
                                    i132 = i;
                                }
                            }
                        } else {
                            int i135 = ((i129 - i59) + 7) >> 3;
                            for (int i136 = 0; i136 < i59; i136++) {
                                System.arraycopy(bArr14[i136], i59 >> 3, bArr6, i135 * i136, i135);
                            }
                        }
                    }
                }
            } else {
                if ((jArr4[i50 - 1] >> 31) == (jArr4[i50] >> 31)) {
                    break;
                }
                i50++;
            }
        }
        ffnc ffncVar = new ffnc(bArr4);
        byte[] bArrG = ffwk.g(bArr5, 0, 32);
        byte[] bArrG2 = ffwk.g(bArr5, 32, 40);
        int i137 = ffnzVar4.l;
        int i138 = i137 + i137 + 40;
        byte[] bArrG3 = ffwk.g(bArr5, 40, i138);
        int length2 = bArr5.length;
        int i139 = length2 - 32;
        return new PrivateKeyInfo(algorithmIdentifier6, new ffnb(bArrG, bArrG2, bArrG3, ffwk.g(bArr5, i138, i139), ffwk.g(bArr5, i139, length2), ffncVar), aSN1Set);
    }
}
