package defpackage;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fftg {
    public final int a;
    public final int b;
    public final ASN1ObjectIdentifier c;
    private final fftt d;
    private final int e;

    protected fftg(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier == null) {
            throw new NullPointerException("treeDigest == null");
        }
        this.c = aSN1ObjectIdentifier;
        ffil ffilVarB = ffsw.b(aSN1ObjectIdentifier);
        String strC = ffilVarB.c();
        int iB = strC.equals("SHAKE128") ? 32 : strC.equals("SHAKE256") ? 64 : ffilVarB.b();
        this.a = iB;
        int iCeil = (int) Math.ceil((iB * 8) / ffua.b(16));
        this.e = iCeil;
        int iFloor = iCeil + ((int) Math.floor(ffua.b(iCeil * 15) / ffua.b(16))) + 1;
        this.b = iFloor;
        fftf fftfVar = (fftf) fftf.a.get(fftf.a(ffilVarB.c(), iB, iFloor));
        this.d = fftfVar;
        if (fftfVar == null) {
            throw new IllegalArgumentException("cannot find OID for digest algorithm: ".concat(ffilVarB.c()));
        }
    }
}
