package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffsp {
    public static SubjectPublicKeyInfo a(ffiz ffizVar) throws IOException {
        if (ffizVar instanceof ffvy) {
            ffvy ffvyVar = (ffvy) ffizVar;
            return new SubjectPublicKeyInfo(ffsq.s(ffvyVar.b), ffwk.c(ffvyVar.c));
        }
        if (ffizVar instanceof ffrf) {
            ffrf ffrfVar = (ffrf) ffizVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffni.d, new ffnj(ffsq.t(ffrfVar.b))), ffrfVar.a());
        }
        if (ffizVar instanceof ffpx) {
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffni.e), ((ffpx) ffizVar).a());
        }
        if (ffizVar instanceof ffpr) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ffpg.d(1, byteArrayOutputStream);
            ffpg.a((ffpr) ffizVar, byteArrayOutputStream);
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.F), new DEROctetString(byteArrayOutputStream.toByteArray()));
        }
        if (ffizVar instanceof ffpk) {
            ffpk ffpkVar = (ffpk) ffizVar;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            ffpg.d(ffpkVar.b, byteArrayOutputStream2);
            ffpg.a(ffpkVar.c, byteArrayOutputStream2);
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.F), new DEROctetString(byteArrayOutputStream2.toByteArray()));
        }
        if (ffizVar instanceof ffrp) {
            ffrp ffrpVar = (ffrp) ffizVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffsq.q(ffrpVar.b)), ffrpVar.a());
        }
        if (ffizVar instanceof ffob) {
            ffob ffobVar = (ffob) ffizVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffsq.j(ffobVar.b)), ffobVar.a());
        }
        if (ffizVar instanceof ffty) {
            ffty fftyVar = (ffty) ffizVar;
            byte[] bArrG = ffua.g(fftyVar.e);
            byte[] bArrG2 = ffua.g(fftyVar.d);
            byte[] bArrA = fftyVar.a();
            if (bArrA.length > bArrG.length + bArrG2.length) {
                return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffjh.a), new DEROctetString(bArrA));
            }
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffni.f, new ffnm(fftyVar.c.c, ffsq.u(fftyVar.b))), new ffnr(bArrG, bArrG2));
        }
        if (ffizVar instanceof fftq) {
            fftq fftqVar = (fftq) ffizVar;
            byte[] bArrA2 = fftqVar.a();
            byte[] bArrB = fftqVar.b();
            byte[] bArrC = fftqVar.c();
            if (bArrC.length > bArrA2.length + bArrB.length) {
                return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffjh.b), new DEROctetString(bArrC));
            }
            fftm fftmVar = fftqVar.c;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffni.g, new ffnn(fftmVar.d, fftmVar.e, ffsq.u(fftqVar.b))), new ffnp(fftqVar.a(), fftqVar.b()));
        }
        if (ffizVar instanceof ffvw) {
            ffvw ffvwVar = (ffvw) ffizVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffni.c), new ffnh(ffvwVar.c, ffvwVar.d, ffvwVar.e, ffsq.r(ffvwVar.b)));
        }
        if (ffizVar instanceof ffpb) {
            ffpb ffpbVar = (ffpb) ffizVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffsq.g(ffpbVar.b)), new DEROctetString(ffwk.c(ffpbVar.c)));
        }
        if (ffizVar instanceof ffra) {
            ffra ffraVar = (ffra) ffizVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffsq.o(ffraVar.b)), new DERSequence(new DEROctetString(ffwk.c(ffraVar.c))));
        }
        if (ffizVar instanceof ffqn) {
            ffqn ffqnVar = (ffqn) ffizVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffsq.m(ffqnVar.b)), new DEROctetString(ffqnVar.a()));
        }
        if (ffizVar instanceof ffqb) {
            ffqb ffqbVar = (ffqb) ffizVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffsq.k(ffqbVar.b)), new DEROctetString(ffqbVar.a()));
        }
        if (ffizVar instanceof ffox) {
            ffox ffoxVar = (ffox) ffizVar;
            byte[] bArrC2 = ffwk.c(ffoxVar.c);
            ffov ffovVar = ffoxVar.b;
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(ffsq.f(ffovVar));
            int length = bArrC2.length;
            byte[] bArr = new byte[length + 1];
            bArr[0] = (byte) ffovVar.d;
            System.arraycopy(bArrC2, 0, bArr, 1, length);
            return new SubjectPublicKeyInfo(algorithmIdentifier, bArr);
        }
        if (ffizVar instanceof ffor) {
            ffor fforVar = (ffor) ffizVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffsq.i(fforVar.b)), ffwk.e(fforVar.c, fforVar.d));
        }
        if (ffizVar instanceof ffqf) {
            ffqf ffqfVar = (ffqf) ffizVar;
            ffqd ffqdVar = ffqfVar.b;
            byte[] bArr2 = new byte[ffqdVar.g];
            byte[] bArr3 = ffqfVar.c;
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, 0, length2);
            byte[] bArr4 = ffqfVar.d;
            System.arraycopy(bArr4, 0, bArr2, length2, bArr4.length);
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffsq.l(ffqdVar)), new DEROctetString(bArr2));
        }
        if (ffizVar instanceof ffqj) {
            ffqj ffqjVar = (ffqj) ffizVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffsq.p(ffqjVar.b)), new DEROctetString(ffwk.c(ffqjVar.c)));
        }
        if (ffizVar instanceof ffok) {
            ffok ffokVar = (ffok) ffizVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffsq.e(ffokVar.b)), ffokVar.a());
        }
        if (ffizVar instanceof ffnv) {
            ffnv ffnvVar = (ffnv) ffizVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffsq.d(ffnvVar.b)), ffnvVar.a());
        }
        if (ffizVar instanceof ffpf) {
            ffpf ffpfVar = (ffpf) ffizVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffsq.h(ffpfVar.b)), ffpfVar.a());
        }
        if (!(ffizVar instanceof ffqu)) {
            throw new IOException("key parameters not recognized");
        }
        ffqu ffquVar = (ffqu) ffizVar;
        ffqs ffqsVar = ffquVar.b;
        return new SubjectPublicKeyInfo(new AlgorithmIdentifier(ffsq.n(ffqsVar)), new DEROctetString(ffqsVar.m != 1 ? ffwk.e(ffwk.e(ffwk.e(ffwk.e(ffwk.e(ffquVar.d, ffqv.d(ffquVar.e, false)), ffqv.d(ffquVar.f, true)), ffqv.d(ffquVar.g, false)), ffqv.d(ffquVar.h, true)), ffqv.d(ffquVar.i, true)) : ffqv.d(ffquVar.c, true)));
    }
}
