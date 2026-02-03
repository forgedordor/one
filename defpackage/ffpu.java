package defpackage;

import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffpu {
    public static final ffpu a;
    public static final ffpu b;
    public static final ffpu c;
    public static final ffpu d;
    public static final ffpu e;
    public static final ffpu f;
    public static final ffpu g;
    public static final ffpu h;
    public static final ffpu i;
    public static final ffpu j;
    public static final ffpu k;
    public static final ffpu l;
    public static final ffpu m;
    public static final ffpu n;
    public static final ffpu o;
    public static final ffpu p;
    public static final ffpu q;
    public static final ffpu r;
    public static final ffpu s;
    public static final ffpu t;
    private static final Map y;
    public final int u;
    public final int v;
    public final int w;
    public final ASN1ObjectIdentifier x;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.c;
        a = new ffpu(5, 32, 5, aSN1ObjectIdentifier);
        b = new ffpu(6, 32, 10, aSN1ObjectIdentifier);
        c = new ffpu(7, 32, 15, aSN1ObjectIdentifier);
        d = new ffpu(8, 32, 20, aSN1ObjectIdentifier);
        e = new ffpu(9, 32, 25, aSN1ObjectIdentifier);
        f = new ffpu(10, 24, 5, aSN1ObjectIdentifier);
        g = new ffpu(11, 24, 10, aSN1ObjectIdentifier);
        h = new ffpu(12, 24, 15, aSN1ObjectIdentifier);
        i = new ffpu(13, 24, 20, aSN1ObjectIdentifier);
        j = new ffpu(14, 24, 25, aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.o;
        k = new ffpu(15, 32, 5, aSN1ObjectIdentifier2);
        l = new ffpu(16, 32, 10, aSN1ObjectIdentifier2);
        m = new ffpu(17, 32, 15, aSN1ObjectIdentifier2);
        n = new ffpu(18, 32, 20, aSN1ObjectIdentifier2);
        o = new ffpu(19, 32, 25, aSN1ObjectIdentifier2);
        p = new ffpu(20, 24, 5, aSN1ObjectIdentifier2);
        q = new ffpu(21, 24, 10, aSN1ObjectIdentifier2);
        r = new ffpu(22, 24, 15, aSN1ObjectIdentifier2);
        s = new ffpu(23, 24, 20, aSN1ObjectIdentifier2);
        t = new ffpu(24, 24, 25, aSN1ObjectIdentifier2);
        y = new ffpt();
    }

    protected ffpu(int i2, int i3, int i4, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.u = i2;
        this.v = i3;
        this.w = i4;
        this.x = aSN1ObjectIdentifier;
    }

    static ffpu a(int i2) {
        return (ffpu) y.get(Integer.valueOf(i2));
    }
}
