package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fftm {
    public static final Map a;
    public final fftt b;
    public final fftu c;
    public final int d;
    public final int e;

    static {
        HashMap map = new HashMap();
        map.put(1, new fftm(20, 2, NISTObjectIdentifiers.c));
        map.put(2, new fftm(20, 4, NISTObjectIdentifiers.c));
        map.put(3, new fftm(40, 2, NISTObjectIdentifiers.c));
        map.put(4, new fftm(40, 4, NISTObjectIdentifiers.c));
        map.put(5, new fftm(40, 8, NISTObjectIdentifiers.c));
        map.put(6, new fftm(60, 3, NISTObjectIdentifiers.c));
        map.put(7, new fftm(60, 6, NISTObjectIdentifiers.c));
        map.put(8, new fftm(60, 12, NISTObjectIdentifiers.c));
        map.put(9, new fftm(20, 2, NISTObjectIdentifiers.e));
        map.put(10, new fftm(20, 4, NISTObjectIdentifiers.e));
        map.put(11, new fftm(40, 2, NISTObjectIdentifiers.e));
        map.put(12, new fftm(40, 4, NISTObjectIdentifiers.e));
        map.put(13, new fftm(40, 8, NISTObjectIdentifiers.e));
        map.put(14, new fftm(60, 3, NISTObjectIdentifiers.e));
        map.put(15, new fftm(60, 6, NISTObjectIdentifiers.e));
        map.put(16, new fftm(60, 12, NISTObjectIdentifiers.e));
        map.put(17, new fftm(20, 2, NISTObjectIdentifiers.m));
        map.put(18, new fftm(20, 4, NISTObjectIdentifiers.m));
        map.put(19, new fftm(40, 2, NISTObjectIdentifiers.m));
        map.put(20, new fftm(40, 4, NISTObjectIdentifiers.m));
        map.put(21, new fftm(40, 8, NISTObjectIdentifiers.m));
        map.put(22, new fftm(60, 3, NISTObjectIdentifiers.m));
        map.put(23, new fftm(60, 6, NISTObjectIdentifiers.m));
        map.put(24, new fftm(60, 12, NISTObjectIdentifiers.m));
        map.put(25, new fftm(20, 2, NISTObjectIdentifiers.n));
        map.put(26, new fftm(20, 4, NISTObjectIdentifiers.n));
        map.put(27, new fftm(40, 2, NISTObjectIdentifiers.n));
        map.put(28, new fftm(40, 4, NISTObjectIdentifiers.n));
        map.put(29, new fftm(40, 8, NISTObjectIdentifiers.n));
        map.put(30, new fftm(60, 3, NISTObjectIdentifiers.n));
        map.put(31, new fftm(60, 6, NISTObjectIdentifiers.n));
        map.put(32, new fftm(60, 12, NISTObjectIdentifiers.n));
        a = DesugarCollections.unmodifiableMap(map);
    }

    public fftm(int i, int i2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.d = i;
        this.e = i2;
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i % i2 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i3 = i / i2;
        if (i3 == 1) {
            throw new IllegalArgumentException("height / layers must be greater than 1");
        }
        fftu fftuVar = new fftu(i3, aSN1ObjectIdentifier);
        this.c = fftuVar;
        this.b = (ffsu) ffsu.a.get(ffsu.a(b(), a(), fftuVar.g.b, i, i2));
    }

    public final int a() {
        return this.c.f;
    }

    protected final String b() {
        return this.c.e;
    }

    public fftm(int i, int i2, ffil ffilVar) {
        this(i, i2, ffsw.a(ffilVar.c()));
    }
}
