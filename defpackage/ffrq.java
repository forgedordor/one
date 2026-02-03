package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffrq {
    public static ffiz a(PrivateKeyInfo privateKeyInfo) throws Throwable {
        if (privateKeyInfo == null) {
            throw new IllegalArgumentException("keyInfo array null");
        }
        AlgorithmIdentifier algorithmIdentifier = privateKeyInfo.a;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = algorithmIdentifier.a;
        if (aSN1ObjectIdentifier.m(ffni.h)) {
            return new ffvx(ffsq.a(algorithmIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
        }
        if (aSN1ObjectIdentifier.w(ffni.d)) {
            return new ffre(ASN1OctetString.f(privateKeyInfo.a()).c, ffsq.c(ffnj.a(algorithmIdentifier.b)));
        }
        int i = 0;
        int i2 = 1;
        if (aSN1ObjectIdentifier.w(ffni.e)) {
            byte[] bArr = ASN1OctetString.f(privateKeyInfo.a()).c;
            int length = bArr.length >> 1;
            short[] sArr = new short[length];
            while (i != length) {
                sArr[i] = ffwp.d(bArr, i + i);
                i++;
            }
            return new ffpw(sArr);
        }
        if (aSN1ObjectIdentifier.w(PKCSObjectIdentifiers.F)) {
            byte[] bArr2 = ASN1OctetString.f(privateKeyInfo.a()).c;
            ASN1BitString aSN1BitString = privateKeyInfo.c;
            if (ffwp.a(bArr2, 0) != 1) {
                if (aSN1BitString == null) {
                    return ffpj.a(ffwk.g(bArr2, 4, bArr2.length));
                }
                byte[] bArrN = aSN1BitString.n();
                ffpj ffpjVarA = ffpj.a(ffwk.g(bArr2, 4, bArr2.length));
                ffpjVarA.c = ffpk.a(bArrN);
                return ffpjVarA;
            }
            if (aSN1BitString == null) {
                return ffpq.a(ffwk.g(bArr2, 4, bArr2.length));
            }
            byte[] bArrN2 = aSN1BitString.n();
            byte[] bArrG = ffwk.g(bArr2, 4, bArr2.length);
            byte[] bArrG2 = ffwk.g(bArrN2, 4, bArrN2.length);
            ffpq ffpqVarA = ffpq.a(bArrG);
            ffpqVarA.b = ffpr.a(bArrG2);
            return ffpqVarA;
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.n) || aSN1ObjectIdentifier.m(BCObjectIdentifiers.Y)) {
            ffrn ffrnVarJ = ffsq.J(aSN1ObjectIdentifier);
            ASN1Encodable aSN1EncodableA = privateKeyInfo.a();
            if (!(aSN1EncodableA instanceof ASN1Sequence)) {
                return new ffro(ffrnVarJ, ASN1OctetString.f(aSN1EncodableA).c);
            }
            ffnk ffnkVar = aSN1EncodableA != null ? new ffnk(ASN1Sequence.j(aSN1EncodableA)) : null;
            ffnl ffnlVar = ffnkVar.c;
            return new ffro(ffrnVarJ, ffwk.c(ffnkVar.a), ffwk.c(ffnkVar.b), ffnlVar.b(), ffnlVar.a());
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.al)) {
            return new ffqm(ffsq.G(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.aT)) {
            ASN1Encodable aSN1EncodableA2 = privateKeyInfo.a();
            ffnb ffnbVar = aSN1EncodableA2 != null ? new ffnb(ASN1Sequence.j(aSN1EncodableA2)) : null;
            return new ffoa(ffsq.x(aSN1ObjectIdentifier), ffwk.c(ffnbVar.a), ffwk.c(ffnbVar.b), ffwk.c(ffnbVar.c), ffwk.c(ffnbVar.d), ffwk.c(ffnbVar.e));
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.be)) {
            return new ffpa(ffsq.B(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.bl)) {
            return new ffqz(ffsq.I(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.bF)) {
            return new ffqa(ffsq.D(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.bM)) {
            return new ffoq(ffsq.z(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.bU)) {
            ASN1Sequence aSN1SequenceJ = ASN1Sequence.j(privateKeyInfo.a());
            return new ffqe(ffsq.E(aSN1ObjectIdentifier), ASN1OctetString.f(aSN1SequenceJ.h(0)).c, ASN1OctetString.f(aSN1SequenceJ.h(1)).c, ASN1OctetString.f(aSN1SequenceJ.h(2)).c, ASN1OctetString.f(aSN1SequenceJ.h(3)).c);
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.cb)) {
            ASN1Sequence aSN1SequenceJ2 = ASN1Sequence.j(privateKeyInfo.a());
            return new ffqi(ffsq.F(aSN1ObjectIdentifier), ASN1OctetString.f(aSN1SequenceJ2.h(0)).c, ASN1OctetString.f(aSN1SequenceJ2.h(1)).c, ASN1OctetString.f(aSN1SequenceJ2.h(2)).c, ASN1OctetString.f(aSN1SequenceJ2.h(3)).c, ASN1OctetString.f(aSN1SequenceJ2.h(4)).c);
        }
        if (aSN1ObjectIdentifier.w(BCObjectIdentifiers.aC) || aSN1ObjectIdentifier.w(BCObjectIdentifiers.aD) || aSN1ObjectIdentifier.w(BCObjectIdentifiers.aE)) {
            ASN1Encodable aSN1EncodableA3 = privateKeyInfo.a();
            ffoi ffoiVarY = ffsq.y(aSN1ObjectIdentifier);
            if (!(aSN1EncodableA3 instanceof ASN1Sequence)) {
                if (!(aSN1EncodableA3 instanceof DEROctetString)) {
                    throw new IOException("not supported");
                }
                byte[] bArr3 = ASN1OctetString.f(aSN1EncodableA3).c;
                ASN1BitString aSN1BitString2 = privateKeyInfo.c;
                return aSN1BitString2 != null ? new ffoj(ffoiVarY, bArr3, ffru.b(ffoiVarY, aSN1BitString2)) : new ffoj(ffoiVarY, bArr3, null);
            }
            ASN1Sequence aSN1SequenceJ3 = ASN1Sequence.j(aSN1EncodableA3);
            int iF = ASN1Integer.m(aSN1SequenceJ3.h(0)).f();
            if (iF != 0) {
                throw new IOException(a.g(iF, "unknown private key version: "));
            }
            ASN1BitString aSN1BitString3 = privateKeyInfo.c;
            return aSN1BitString3 != null ? new ffoj(ffoiVarY, ASN1BitString.i(aSN1SequenceJ3.h(1)).n(), ASN1BitString.i(aSN1SequenceJ3.h(2)).n(), ASN1BitString.i(aSN1SequenceJ3.h(3)).n(), ASN1BitString.i(aSN1SequenceJ3.h(4)).n(), ASN1BitString.i(aSN1SequenceJ3.h(5)).n(), ASN1BitString.i(aSN1SequenceJ3.h(6)).n(), ffru.b(ffoiVarY, aSN1BitString3).b()) : new ffoj(ffoiVarY, ASN1BitString.i(aSN1SequenceJ3.h(1)).n(), ASN1BitString.i(aSN1SequenceJ3.h(2)).n(), ASN1BitString.i(aSN1SequenceJ3.h(3)).n(), ASN1BitString.i(aSN1SequenceJ3.h(4)).n(), ASN1BitString.i(aSN1SequenceJ3.h(5)).n(), ASN1BitString.i(aSN1SequenceJ3.h(6)).n(), null);
        }
        if (aSN1ObjectIdentifier.w(BCObjectIdentifiers.aA) || aSN1ObjectIdentifier.w(BCObjectIdentifiers.aB)) {
            ASN1Encodable aSN1EncodableA4 = privateKeyInfo.a();
            ffnd ffndVar = aSN1EncodableA4 != null ? new ffnd(ASN1Sequence.j(aSN1EncodableA4)) : null;
            return new ffow(ffsq.A(aSN1ObjectIdentifier), ffwk.c(ffndVar.a), ffwk.c(ffndVar.b), ffwk.c(ffndVar.c), ffndVar.d.a);
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.ci)) {
            byte[] bArr4 = ASN1OctetString.f(privateKeyInfo.a()).c;
            ffnt ffntVarW = ffsq.w(aSN1ObjectIdentifier);
            byte[] bArrG3 = ffwk.g(bArr4, 0, ffntVarW.a());
            int iA = ffntVarW.a();
            int iA2 = ffntVarW.a();
            byte[] bArrG4 = ffwk.g(bArr4, iA, iA2 + iA2);
            int iA3 = ffntVarW.a();
            return new ffnu(ffntVarW, bArrG3, bArrG4, ffwk.g(bArr4, iA3 + iA3, bArr4.length));
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.cm)) {
            return new ffpe(ffsq.C(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.aI)) {
            return new ffqt(ffsq.H(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
        }
        if (aSN1ObjectIdentifier.w(ffni.f)) {
            ffnm ffnmVarA = ffnm.a(algorithmIdentifier.b);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = ffnmVarA.b.a;
            ASN1Encodable aSN1EncodableA5 = privateKeyInfo.a();
            ffnq ffnqVar = aSN1EncodableA5 != null ? new ffnq(ASN1Sequence.j(aSN1EncodableA5)) : null;
            try {
                fftv fftvVar = new fftv(new fftu(ffnmVarA.a, ffsq.v(aSN1ObjectIdentifier2)));
                fftvVar.b = ffnqVar.b;
                fftvVar.d = ffua.g(ffwk.c(ffnqVar.c));
                fftvVar.e = ffua.g(ffwk.c(ffnqVar.d));
                fftvVar.f = ffua.g(ffwk.c(ffnqVar.e));
                fftvVar.g = ffua.g(ffwk.c(ffnqVar.f));
                if (ffnqVar.a != 0) {
                    fftvVar.c = ffnqVar.g;
                }
                if (ffnqVar.a() != null) {
                    fftvVar.h = new ffsr((ffsr) ffua.c(ffnqVar.a(), ffsr.class), aSN1ObjectIdentifier2);
                }
                return new fftw(fftvVar);
            } catch (ClassNotFoundException e) {
                throw new IOException("ClassNotFoundException processing BDS state: ".concat(String.valueOf(e.getMessage())));
            }
        }
        if (aSN1ObjectIdentifier.w(ffni.g)) {
            ffnn ffnnVarA = ffnn.a(algorithmIdentifier.b);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = ffnnVarA.c.a;
            try {
                ASN1Encodable aSN1EncodableA6 = privateKeyInfo.a();
                ffno ffnoVar = aSN1EncodableA6 != null ? new ffno(ASN1Sequence.j(aSN1EncodableA6)) : null;
                fftn fftnVar = new fftn(new fftm(ffnnVarA.a, ffnnVarA.b, ffsq.v(aSN1ObjectIdentifier3)));
                fftnVar.b = ffnoVar.b;
                fftnVar.d = ffua.g(ffwk.c(ffnoVar.d));
                fftnVar.e = ffua.g(ffwk.c(ffnoVar.e));
                fftnVar.f = ffua.g(ffwk.c(ffnoVar.f));
                fftnVar.g = ffua.g(ffwk.c(ffnoVar.g));
                if (ffnoVar.a != 0) {
                    fftnVar.c = ffnoVar.c;
                }
                if (ffnoVar.a() != null) {
                    ffss ffssVar = (ffss) ffua.c(ffnoVar.a(), ffss.class);
                    ffss ffssVar2 = new ffss(ffssVar.b);
                    Map map = ffssVar.a;
                    for (Integer num : map.keySet()) {
                        ffssVar2.a.put(num, new ffsr((ffsr) map.get(num), aSN1ObjectIdentifier3));
                    }
                    if (ffssVar2.b == 0) {
                        fftnVar.h = new ffss(ffssVar2, (1 << fftnVar.a.d) - 1);
                    } else {
                        fftnVar.h = ffssVar2;
                    }
                }
                return new ffto(fftnVar);
            } catch (ClassNotFoundException e2) {
                throw new IOException("ClassNotFoundException processing BDS state: ".concat(String.valueOf(e2.getMessage())));
            }
        }
        if (!aSN1ObjectIdentifier.w(ffni.c)) {
            throw new RuntimeException("algorithm identifier in private key not recognised");
        }
        ASN1Encodable aSN1EncodableA7 = privateKeyInfo.a();
        ffng ffngVar = aSN1EncodableA7 != null ? new ffng(ASN1Sequence.j(aSN1EncodableA7)) : null;
        int i3 = ffngVar.a;
        int i4 = ffngVar.b;
        ffwa ffwaVarA = ffngVar.a();
        ffwg ffwgVar = new ffwg(ffngVar.a(), ffngVar.c);
        ffwf ffwfVar = new ffwf(ffngVar.d);
        String strB = ffsq.b(ffngVar.e.a);
        int i5 = ffwaVarA.a;
        int i6 = 1 << i5;
        int iC = ffwgVar.c();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iC, i6);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iC, i6);
        int i7 = 0;
        while (i7 < i6) {
            int[] iArr3 = iArr2[i];
            int[] iArr4 = ffwgVar.c;
            int i8 = i2;
            int i9 = ffwgVar.b;
            int iB = iArr4[i9];
            int i10 = i9 - 1;
            while (i10 >= 0) {
                iB = ffwgVar.c[i10] ^ ffwgVar.a.b(iB, i7);
                i10--;
                i = i;
            }
            iArr3[i7] = ffwaVarA.a(iB);
            i7++;
            i2 = i8;
            i = i;
        }
        int i11 = i;
        int i12 = i2;
        for (int i13 = i12; i13 < iC; i13++) {
            for (int i14 = i11; i14 < i6; i14++) {
                iArr2[i13][i14] = ffwaVarA.b(iArr2[i13 - 1][i14], i14);
            }
        }
        for (int i15 = i11; i15 < iC; i15++) {
            for (int i16 = i11; i16 < i6; i16++) {
                int i17 = i11;
                while (i17 <= i15) {
                    int[] iArr5 = iArr[i15];
                    iArr5[i16] = iArr5[i16] ^ ffwaVarA.b(iArr2[i17][i16], ffwgVar.b((iC + i17) - i15));
                    i17++;
                    ffwfVar = ffwfVar;
                }
            }
        }
        ffwf ffwfVar2 = ffwfVar;
        int[] iArr6 = new int[2];
        iArr6[i12] = (i6 + 31) >>> 5;
        iArr6[i11] = iC * i5;
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr6);
        for (int i18 = i11; i18 < i6; i18++) {
            int i19 = i18 >>> 5;
            int i20 = i12 << (i18 & 31);
            int i21 = i11;
            while (i21 < iC) {
                int i22 = i21 + 1;
                int i23 = iArr[i21][i18];
                for (int i24 = i11; i24 < i5; i24++) {
                    if (((i23 >>> i24) & 1) != 0) {
                        int[] iArr8 = iArr7[((i22 * i5) - i24) - 1];
                        iArr8[i19] = iArr8[i19] ^ i20;
                    }
                }
                i21 = i22;
            }
        }
        new ffvz(i6, iArr7);
        return new ffvv(i3, i4, ffwaVarA, ffwgVar, ffwfVar2, strB);
    }
}
