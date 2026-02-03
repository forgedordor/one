package org.bouncycastle.asn1;

import defpackage.ffwj;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ASN1Set extends ASN1Primitive implements Iterable<ASN1Encodable> {
    static final ASN1UniversalType a = new ASN1UniversalType(ASN1Set.class) { // from class: org.bouncycastle.asn1.ASN1Set.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive b(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.n();
        }
    };
    protected final ASN1Encodable[] b;
    protected ASN1Encodable[] c;

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1Set$2, reason: invalid class name */
    public class AnonymousClass2 implements Enumeration {
        private int b = 0;

        public AnonymousClass2() {
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return this.b < ASN1Set.this.b.length;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            ASN1Encodable[] aSN1EncodableArr = ASN1Set.this.b;
            int i = this.b;
            if (i >= aSN1EncodableArr.length) {
                throw new NoSuchElementException();
            }
            this.b = i + 1;
            return aSN1EncodableArr[i];
        }
    }

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1Set$3, reason: invalid class name */
    class AnonymousClass3 implements ASN1SetParser {
        @Override // org.bouncycastle.asn1.InMemoryRepresentable
        public final ASN1Primitive j() {
            throw null;
        }

        @Override // org.bouncycastle.asn1.ASN1Encodable
        public final ASN1Primitive p() {
            throw null;
        }
    }

    public ASN1Set() {
        ASN1Encodable[] aSN1EncodableArr = ASN1EncodableVector.a;
        this.b = aSN1EncodableArr;
        this.c = aSN1EncodableArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ASN1Set g(Object obj) {
        if (obj == 0 || (obj instanceof ASN1Set)) {
            return (ASN1Set) obj;
        }
        ASN1Primitive aSN1PrimitiveP = obj.p();
        if (aSN1PrimitiveP instanceof ASN1Set) {
            return (ASN1Set) aSN1PrimitiveP;
        }
        throw new IllegalArgumentException("unknown object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
    }

    public static ASN1Set i(ASN1TaggedObject aSN1TaggedObject) {
        return (ASN1Set) a.d(aSN1TaggedObject, false);
    }

    private static void j(ASN1Encodable[] aSN1EncodableArr) {
        int i;
        int length = aSN1EncodableArr.length;
        if (length < 2) {
            return;
        }
        ASN1Encodable aSN1Encodable = aSN1EncodableArr[0];
        ASN1Encodable aSN1Encodable2 = aSN1EncodableArr[1];
        byte[] bArrN = n(aSN1Encodable);
        byte[] bArrN2 = n(aSN1Encodable2);
        boolean zM = m(bArrN2, bArrN);
        byte[] bArr = true != zM ? bArrN2 : bArrN;
        if (true == zM) {
            bArrN = bArrN2;
        }
        ASN1Encodable aSN1Encodable3 = true != zM ? aSN1Encodable2 : aSN1Encodable;
        if (true == zM) {
            aSN1Encodable = aSN1Encodable2;
        }
        for (int i2 = 2; i2 < length; i2++) {
            ASN1Encodable aSN1Encodable4 = aSN1EncodableArr[i2];
            byte[] bArrN3 = n(aSN1Encodable4);
            if (m(bArr, bArrN3)) {
                aSN1EncodableArr[i2 - 2] = aSN1Encodable;
                aSN1Encodable = aSN1Encodable3;
                bArrN = bArr;
                aSN1Encodable3 = aSN1Encodable4;
                bArr = bArrN3;
            } else if (m(bArrN, bArrN3)) {
                aSN1EncodableArr[i2 - 2] = aSN1Encodable;
                aSN1Encodable = aSN1Encodable4;
                bArrN = bArrN3;
            } else {
                int i3 = i2 - 1;
                while (true) {
                    i = i3 - 1;
                    if (i <= 0) {
                        break;
                    }
                    ASN1Encodable aSN1Encodable5 = aSN1EncodableArr[i3 - 2];
                    if (m(n(aSN1Encodable5), bArrN3)) {
                        break;
                    }
                    aSN1EncodableArr[i] = aSN1Encodable5;
                    i3 = i;
                }
                aSN1EncodableArr[i] = aSN1Encodable4;
            }
        }
        aSN1EncodableArr[length - 2] = aSN1Encodable;
        aSN1EncodableArr[length - 1] = aSN1Encodable3;
    }

    private static boolean m(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & 223;
        int i2 = bArr2[0] & 223;
        if (i != i2) {
            return i < i2;
        }
        int iMin = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < iMin; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return (bArr[iMin] & 255) <= (bArr2[iMin] & 255);
    }

    private static byte[] n(ASN1Encodable aSN1Encodable) {
        try {
            return aSN1Encodable.p().u();
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1Set)) {
            return false;
        }
        ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
        int iE = e();
        if (aSN1Set.e() != iE) {
            return false;
        }
        ASN1Primitive aSN1PrimitiveK = k();
        ASN1Primitive aSN1PrimitiveK2 = aSN1Set.k();
        for (int i = 0; i < iE; i++) {
            ASN1Primitive aSN1PrimitiveP = ((DERSet) aSN1PrimitiveK).b[i].p();
            ASN1Primitive aSN1PrimitiveP2 = ((DERSet) aSN1PrimitiveK2).b[i].p();
            if (aSN1PrimitiveP != aSN1PrimitiveP2 && !aSN1PrimitiveP.c(aSN1PrimitiveP2)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return true;
    }

    public final int e() {
        return this.b.length;
    }

    public final ASN1Encodable f(int i) {
        return this.b[i];
    }

    public final ASN1Encodable[] h() {
        return ASN1EncodableVector.c(this.b);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        ASN1Encodable[] aSN1EncodableArr = this.b;
        int length = aSN1EncodableArr.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode += aSN1EncodableArr[length].p().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<ASN1Encodable> iterator() {
        return new ffwj(h());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive k() {
        if (this.c == null) {
            ASN1Encodable[] aSN1EncodableArr = (ASN1Encodable[]) this.b.clone();
            this.c = aSN1EncodableArr;
            j(aSN1EncodableArr);
        }
        return new DERSet(this.c);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive l() {
        return new DLSet(this.b, this.c);
    }

    public final String toString() {
        int iE = e();
        if (iE == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(this.b[i]);
            i++;
            if (i >= iE) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    protected ASN1Set(ASN1Encodable aSN1Encodable) {
        ASN1Encodable[] aSN1EncodableArr = {aSN1Encodable};
        this.b = aSN1EncodableArr;
        this.c = aSN1EncodableArr;
    }

    public ASN1Set(ASN1Encodable[] aSN1EncodableArr, ASN1Encodable[] aSN1EncodableArr2) {
        this.b = aSN1EncodableArr;
        this.c = aSN1EncodableArr2;
    }

    protected ASN1Set(ASN1EncodableVector aSN1EncodableVector, boolean z) {
        ASN1Encodable[] aSN1EncodableArrD;
        int i;
        if (z && (i = aSN1EncodableVector.c) >= 2) {
            aSN1EncodableArrD = new ASN1Encodable[i];
            System.arraycopy(aSN1EncodableVector.b, 0, aSN1EncodableArrD, 0, i);
            j(aSN1EncodableArrD);
        } else {
            aSN1EncodableArrD = aSN1EncodableVector.d();
        }
        this.b = aSN1EncodableArrD;
        if (!z && aSN1EncodableArrD.length >= 2) {
            aSN1EncodableArrD = null;
        }
        this.c = aSN1EncodableArrD;
    }

    public ASN1Set(boolean z, ASN1Encodable[] aSN1EncodableArr) {
        this.b = aSN1EncodableArr;
        if (!z && aSN1EncodableArr.length >= 2) {
            aSN1EncodableArr = null;
        }
        this.c = aSN1EncodableArr;
    }
}
