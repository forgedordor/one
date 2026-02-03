package org.bouncycastle.asn1.x509;

import defpackage.ffws;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class Extensions extends ASN1Object {
    private Hashtable a = new Hashtable();
    private Vector b = new Vector();

    private Extensions(ASN1Sequence aSN1Sequence) {
        Enumeration enumerationF = aSN1Sequence.f();
        while (enumerationF.hasMoreElements()) {
            Object objNextElement = enumerationF.nextElement();
            boolean z = objNextElement instanceof Extension;
            ASN1ObjectIdentifier aSN1ObjectIdentifier = Extension.a;
            Extension extension = z ? (Extension) objNextElement : objNextElement != null ? new Extension(ASN1Sequence.j(objNextElement)) : null;
            if (this.a.containsKey(extension.v) && !ffws.c("org.bouncycastle.x509.ignore_repeated_extensions")) {
                throw new IllegalArgumentException("repeated extension found: ".concat(String.valueOf(String.valueOf(extension.v))));
            }
            this.a.put(extension.v, extension);
            this.b.addElement(extension.v);
        }
    }

    public static Extensions c(Object obj) {
        if (obj instanceof Extensions) {
            return (Extensions) obj;
        }
        if (obj != null) {
            return new Extensions(ASN1Sequence.j(obj));
        }
        return null;
    }

    public final Enumeration a() {
        return this.b.elements();
    }

    public final Extension b(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (Extension) this.a.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(this.b.size());
        Enumeration enumerationElements = this.b.elements();
        while (enumerationElements.hasMoreElements()) {
            aSN1EncodableVector.b((Extension) this.a.get((ASN1ObjectIdentifier) enumerationElements.nextElement()));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
