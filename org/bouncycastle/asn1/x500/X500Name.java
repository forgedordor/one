package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.style.BCStyle;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class X500Name extends ASN1Object implements ASN1Choice {
    public static final X500NameStyle a = BCStyle.N;
    public DERSequence b;
    private boolean c;
    private int d;
    private X500NameStyle e;
    private RDN[] f;

    public X500Name(X500NameStyle x500NameStyle, ASN1Sequence aSN1Sequence) {
        int iE = aSN1Sequence.e();
        this.e = x500NameStyle;
        this.f = new RDN[iE];
        boolean z = true;
        for (int i = 0; i < iE; i++) {
            ASN1Encodable aSN1EncodableH = aSN1Sequence.h(i);
            RDN rdn = aSN1EncodableH instanceof RDN ? (RDN) aSN1EncodableH : aSN1EncodableH != null ? new RDN(ASN1Set.g(aSN1EncodableH)) : null;
            z &= rdn == aSN1EncodableH;
            this.f[i] = rdn;
        }
        if (z) {
            this.b = (DERSequence) aSN1Sequence.k();
        } else {
            this.b = new DERSequence(this.f);
        }
    }

    public static X500Name b(Object obj) {
        if (obj instanceof X500Name) {
            return (X500Name) obj;
        }
        if (obj == null) {
            return null;
        }
        return new X500Name(a, ASN1Sequence.j(obj));
    }

    public final int a() {
        return this.f.length;
    }

    public final RDN[] c() {
        return (RDN[]) this.f.clone();
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X500Name) && !(obj instanceof ASN1Sequence)) {
            return false;
        }
        if (this.b.w(((ASN1Encodable) obj).p())) {
            return true;
        }
        try {
            return this.e.c(this, b(obj));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        if (this.c) {
            return this.d;
        }
        this.c = true;
        int iA = this.e.a(this);
        this.d = iA;
        return iA;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.b;
    }

    public final String toString() {
        return this.e.b(this);
    }

    public X500Name(X500NameStyle x500NameStyle, X500Name x500Name) {
        this.e = x500NameStyle;
        this.f = x500Name.f;
        this.b = x500Name.b;
    }

    public X500Name(X500NameStyle x500NameStyle, RDN[] rdnArr) {
        this.e = x500NameStyle;
        this.f = (RDN[]) rdnArr.clone();
        this.b = new DERSequence(this.f);
    }
}
