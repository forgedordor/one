package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fftu {
    public static final Map a;
    public final fftt b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final fftg g;

    static {
        HashMap map = new HashMap();
        map.put(1, new fftu(10, NISTObjectIdentifiers.c));
        map.put(2, new fftu(16, NISTObjectIdentifiers.c));
        map.put(3, new fftu(20, NISTObjectIdentifiers.c));
        map.put(4, new fftu(10, NISTObjectIdentifiers.e));
        map.put(5, new fftu(16, NISTObjectIdentifiers.e));
        map.put(6, new fftu(20, NISTObjectIdentifiers.e));
        map.put(7, new fftu(10, NISTObjectIdentifiers.m));
        map.put(8, new fftu(16, NISTObjectIdentifiers.m));
        map.put(9, new fftu(20, NISTObjectIdentifiers.m));
        map.put(10, new fftu(10, NISTObjectIdentifiers.n));
        map.put(11, new fftu(16, NISTObjectIdentifiers.n));
        map.put(12, new fftu(20, NISTObjectIdentifiers.n));
        a = DesugarCollections.unmodifiableMap(map);
    }

    public fftu(int i, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (i < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (aSN1ObjectIdentifier == null) {
            throw new NullPointerException("digest == null");
        }
        this.c = i;
        int i2 = 2;
        while (true) {
            int i3 = this.c;
            if (i2 > i3) {
                throw new IllegalStateException("should never happen...");
            }
            if ((i3 - i2) % 2 == 0) {
                this.d = i2;
                String str = (String) ffsw.a.get(aSN1ObjectIdentifier);
                if (str == null) {
                    throw new IllegalArgumentException("unrecognized digest oid: ".concat(aSN1ObjectIdentifier.toString()));
                }
                this.e = str;
                fftg fftgVar = new fftg(aSN1ObjectIdentifier);
                this.g = fftgVar;
                int i4 = fftgVar.a;
                this.f = i4;
                this.b = (ffsv) ffsv.a.get(ffsv.a(str, i4, fftgVar.b, i));
                return;
            }
            i2++;
        }
    }

    final ffte a() {
        return new ffte(this.g);
    }

    public fftu(int i, ffil ffilVar) {
        this(i, ffsw.a(ffilVar.c()));
    }
}
