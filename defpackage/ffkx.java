package defpackage;

import java.security.PrivilegedAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffkx implements PrivilegedAction {
    final /* synthetic */ ffla a;

    public ffkx(ffla fflaVar) {
        this.a = fflaVar;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        ffla.f("org.bouncycastle.jcajce.provider.digest.", ffla.i);
        ffla.f("org.bouncycastle.jcajce.provider.symmetric.", ffla.d);
        ffla.f("org.bouncycastle.jcajce.provider.symmetric.", ffla.e);
        ffie[] ffieVarArr = ffla.f;
        int i = 0;
        while (true) {
            int length = ffieVarArr.length;
            if (i == 38) {
                break;
            }
            ffie ffieVar = ffieVarArr[i];
            try {
                ffij.b();
                ffla.e("org.bouncycastle.jcajce.provider.symmetric.", ffieVar.a());
            } catch (ffid unused) {
                Logger logger = ffla.a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.logp(Level.FINE, "org.bouncycastle.jce.provider.BouncyCastleProvider", "loadAlgorithms", "service for " + ffieVar.a() + " ignored due to constraints");
                }
            }
            i++;
        }
        ffla.f("org.bouncycastle.jcajce.provider.asymmetric.", ffla.g);
        ffla.f("org.bouncycastle.jcajce.provider.asymmetric.", ffla.h);
        ffla.f("org.bouncycastle.jcajce.provider.keystore.", ffla.j);
        ffla.f("org.bouncycastle.jcajce.provider.drbg.", ffla.k);
        ffla.d(BCObjectIdentifiers.n, new ffvk());
        ffla.d(BCObjectIdentifiers.o, new ffvk());
        ffla.d(BCObjectIdentifiers.p, new ffvk());
        ffla.d(BCObjectIdentifiers.q, new ffvk());
        ffla.d(BCObjectIdentifiers.r, new ffvk());
        ffla.d(BCObjectIdentifiers.s, new ffvk());
        ffla.d(BCObjectIdentifiers.t, new ffvk());
        ffla.d(BCObjectIdentifiers.u, new ffvk());
        ffla.d(BCObjectIdentifiers.v, new ffvk());
        ffla.d(BCObjectIdentifiers.w, new ffvk());
        ffla.d(BCObjectIdentifiers.x, new ffvk());
        ffla.d(BCObjectIdentifiers.y, new ffvk());
        ffla.d(BCObjectIdentifiers.z, new ffvk());
        ffla.d(BCObjectIdentifiers.A, new ffvk());
        ffla.d(BCObjectIdentifiers.B, new ffvk());
        ffla.d(BCObjectIdentifiers.C, new ffvk());
        ffla.d(BCObjectIdentifiers.D, new ffvk());
        ffla.d(BCObjectIdentifiers.E, new ffvk());
        ffla.d(BCObjectIdentifiers.F, new ffvk());
        ffla.d(BCObjectIdentifiers.G, new ffvk());
        ffla.d(BCObjectIdentifiers.H, new ffvk());
        ffla.d(BCObjectIdentifiers.I, new ffvk());
        ffla.d(BCObjectIdentifiers.J, new ffvk());
        ffla.d(BCObjectIdentifiers.K, new ffvk());
        ffla.d(BCObjectIdentifiers.L, new ffvk());
        ffla.d(BCObjectIdentifiers.M, new ffvk());
        ffla.d(BCObjectIdentifiers.N, new ffvk());
        ffla.d(BCObjectIdentifiers.O, new ffvk());
        ffla.d(BCObjectIdentifiers.P, new ffvk());
        ffla.d(BCObjectIdentifiers.Q, new ffvk());
        ffla.d(BCObjectIdentifiers.R, new ffvk());
        ffla.d(BCObjectIdentifiers.S, new ffvk());
        ffla.d(BCObjectIdentifiers.T, new ffvk());
        ffla.d(BCObjectIdentifiers.U, new ffvk());
        ffla.d(BCObjectIdentifiers.V, new ffvk());
        ffla.d(BCObjectIdentifiers.W, new ffvk());
        ffla.d(BCObjectIdentifiers.X, new ffvk());
        ffla.d(BCObjectIdentifiers.aa, new ffvk());
        ffla.d(BCObjectIdentifiers.ac, new ffvk());
        ffla.d(BCObjectIdentifiers.ae, new ffvk());
        ffla.d(new ASN1ObjectIdentifier("1.3.9999.6.4.10"), new ffvk());
        ffla.d(BCObjectIdentifiers.af, new ffvk());
        ffla.d(BCObjectIdentifiers.ah, new ffvk());
        ffla.d(BCObjectIdentifiers.aj, new ffvk());
        ffla.d(ffni.d, new ffvh());
        ffla.d(ffni.e, new ffuy());
        ffla.d(ffni.f, new ffvs());
        ffla.d(ffjh.a, new ffvs());
        ffla.d(ffni.g, new ffvt());
        ffla.d(ffjh.b, new ffvt());
        ffla.d(PKCSObjectIdentifiers.F, new ffuv());
        ffla.d(BCObjectIdentifiers.am, new ffve());
        ffla.d(BCObjectIdentifiers.aA, new ffum());
        ffla.d(BCObjectIdentifiers.aB, new ffum());
        ffla.d(BCObjectIdentifiers.aC, new ffuj());
        ffla.d(BCObjectIdentifiers.aD, new ffuj());
        ffla.d(BCObjectIdentifiers.aE, new ffuj());
        ffla.d(BCObjectIdentifiers.aF, new ffuj());
        ffla.d(BCObjectIdentifiers.aG, new ffuj());
        ffla.d(BCObjectIdentifiers.aH, new ffuj());
        ffla.d(BCObjectIdentifiers.bN, new ffus());
        ffla.d(BCObjectIdentifiers.bO, new ffus());
        ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.bP;
        ffla.d(aSN1ObjectIdentifier, new ffus());
        ffla.d(BCObjectIdentifiers.aU, new ffug());
        ffla.d(BCObjectIdentifiers.aW, new ffug());
        ffla.d(BCObjectIdentifiers.aY, new ffug());
        ffla.d(BCObjectIdentifiers.ba, new ffug());
        ffla.d(BCObjectIdentifiers.bc, new ffug());
        ffla.d(BCObjectIdentifiers.cj, new ffud());
        ffla.d(BCObjectIdentifiers.ck, new ffud());
        ffla.d(BCObjectIdentifiers.cl, new ffud());
        ffla fflaVar = this.a;
        ffla.d(BCObjectIdentifiers.cn, new ffup());
        ffla.d(BCObjectIdentifiers.co, new ffup());
        ffla.d(BCObjectIdentifiers.cp, new ffup());
        ffla.d(aSN1ObjectIdentifier, new ffus());
        ffla.d(BCObjectIdentifiers.bQ, new ffus());
        ffla.d(BCObjectIdentifiers.bR, new ffus());
        ffla.d(BCObjectIdentifiers.bS, new ffus());
        ffla.d(BCObjectIdentifiers.bG, new ffvb());
        ffla.d(BCObjectIdentifiers.bH, new ffvb());
        ffla.d(BCObjectIdentifiers.bI, new ffvb());
        ffla.d(BCObjectIdentifiers.bJ, new ffvb());
        fflaVar.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        fflaVar.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        fflaVar.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        fflaVar.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        fflaVar.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        fflaVar.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        fflaVar.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        fflaVar.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        fflaVar.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        fflaVar.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        fflaVar.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        fflaVar.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        fflaVar.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        fflaVar.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        fflaVar.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        if (ffla.c != null) {
            fflaVar.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            fflaVar.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            fflaVar.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            fflaVar.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
            fflaVar.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            fflaVar.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
        } else {
            fflaVar.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            fflaVar.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            fflaVar.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            fflaVar.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
            fflaVar.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            fflaVar.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        }
        fflaVar.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        fflaVar.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        fflaVar.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        fflaVar.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
        return null;
    }
}
