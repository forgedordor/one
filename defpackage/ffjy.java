package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.CRLReason;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.Time;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffjy extends X509CRLEntry {
    private TBSCertList.CRLEntry a;
    private X500Name b;
    private volatile boolean c;
    private volatile int d;

    protected ffjy(TBSCertList.CRLEntry cRLEntry, boolean z, X500Name x500Name) {
        this.a = cRLEntry;
        if (z) {
            Extension extensionB = b(Extension.j);
            if (extensionB != null) {
                try {
                    for (GeneralName generalName : GeneralNames.a(Extension.a(extensionB)).c()) {
                        if (generalName.b == 4) {
                            x500Name = X500Name.b(generalName.a);
                            break;
                        }
                    }
                } catch (Exception unused) {
                }
                x500Name = null;
            }
        } else {
            x500Name = null;
        }
        this.b = x500Name;
    }

    private final Set a(boolean z) {
        Extensions extensionsB = this.a.b();
        if (extensionsB == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationA = extensionsB.a();
        while (enumerationA.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationA.nextElement();
            if (z == extensionsB.b(aSN1ObjectIdentifier).w) {
                hashSet.add(aSN1ObjectIdentifier.e());
            }
        }
        return hashSet;
    }

    private final Extension b(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Extensions extensionsB = this.a.b();
        if (extensionsB != null) {
            return extensionsB.b(aSN1ObjectIdentifier);
        }
        return null;
    }

    @Override // java.security.cert.X509CRLEntry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ffjy)) {
            return super.equals(this);
        }
        ffjy ffjyVar = (ffjy) obj;
        if (this.c && ffjyVar.c && this.d != ffjyVar.d) {
            return false;
        }
        return this.a.equals(ffjyVar.a);
    }

    @Override // java.security.cert.X509CRLEntry
    public final X500Principal getCertificateIssuer() {
        X500Name x500Name = this.b;
        if (x500Name == null) {
            return null;
        }
        try {
            return new X500Principal(x500Name.s());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return a(true);
    }

    @Override // java.security.cert.X509CRLEntry
    public final byte[] getEncoded() throws CRLException {
        try {
            return this.a.u();
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        Extension extensionB = b(new ASN1ObjectIdentifier(str));
        if (extensionB == null) {
            return null;
        }
        try {
            return extensionB.x.s();
        } catch (Exception e) {
            throw new IllegalStateException("Exception encoding: ".concat(String.valueOf(e.toString())));
        }
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return a(false);
    }

    @Override // java.security.cert.X509CRLEntry
    public final Date getRevocationDate() {
        return Time.c(this.a.a.h(1)).b();
    }

    @Override // java.security.cert.X509CRLEntry
    public final BigInteger getSerialNumber() {
        return this.a.a().j();
    }

    @Override // java.security.cert.X509CRLEntry
    public final boolean hasExtensions() {
        return this.a.b() != null;
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return (criticalExtensionOIDs == null || criticalExtensionOIDs.isEmpty()) ? false : true;
    }

    @Override // java.security.cert.X509CRLEntry
    public final int hashCode() {
        if (!this.c) {
            this.d = super.hashCode();
            this.c = true;
        }
        return this.d;
    }

    @Override // java.security.cert.X509CRLEntry
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("      userCertificate: ");
        String str = ffwu.a;
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(str);
        stringBuffer.append("       revocationDate: ");
        stringBuffer.append(getRevocationDate());
        stringBuffer.append(str);
        stringBuffer.append("       certificateIssuer: ");
        stringBuffer.append(getCertificateIssuer());
        stringBuffer.append(str);
        Extensions extensionsB = this.a.b();
        if (extensionsB != null) {
            Enumeration enumerationA = extensionsB.a();
            if (enumerationA.hasMoreElements()) {
                stringBuffer.append("   crlEntryExtensions:");
                stringBuffer.append(str);
                while (enumerationA.hasMoreElements()) {
                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationA.nextElement();
                    Extension extensionB = extensionsB.b(aSN1ObjectIdentifier);
                    ASN1OctetString aSN1OctetString = extensionB.x;
                    if (aSN1OctetString != null) {
                        ASN1InputStream aSN1InputStream = new ASN1InputStream(aSN1OctetString.c);
                        stringBuffer.append("                       critical(");
                        stringBuffer.append(extensionB.w);
                        stringBuffer.append(") ");
                        try {
                            if (aSN1ObjectIdentifier.w(Extension.g)) {
                                ASN1Enumerated aSN1EnumeratedH = ASN1Enumerated.h(aSN1InputStream.f());
                                int i = CRLReason.a;
                                stringBuffer.append(aSN1EnumeratedH != null ? CRLReason.a(ASN1Enumerated.h(aSN1EnumeratedH).e()) : null);
                                stringBuffer.append(str);
                            } else if (aSN1ObjectIdentifier.w(Extension.j)) {
                                stringBuffer.append("Certificate issuer: ");
                                stringBuffer.append(GeneralNames.a(aSN1InputStream.f()));
                                stringBuffer.append(str);
                            } else {
                                stringBuffer.append(aSN1ObjectIdentifier.e());
                                stringBuffer.append(" value = ");
                                stringBuffer.append(ASN1Dump.a(aSN1InputStream.f()));
                                stringBuffer.append(str);
                            }
                        } catch (Exception unused) {
                            stringBuffer.append(aSN1ObjectIdentifier.e());
                            stringBuffer.append(" value = *****");
                            stringBuffer.append(str);
                        }
                    } else {
                        stringBuffer.append(str);
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
