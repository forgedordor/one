package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffpm {
    public static final ffpm a;
    public static final ffpm b;
    public static final ffpm c;
    public static final ffpm d;
    public static final ffpm e;
    public static final ffpm f;
    public static final ffpm g;
    public static final ffpm h;
    public static final ffpm i;
    public static final ffpm j;
    public static final ffpm k;
    public static final ffpm l;
    public static final ffpm m;
    public static final ffpm n;
    public static final ffpm o;
    public static final ffpm p;
    private static final Map v;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final ASN1ObjectIdentifier u;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.c;
        a = new ffpm(1, 32, 1, 265, aSN1ObjectIdentifier);
        b = new ffpm(2, 32, 2, 133, aSN1ObjectIdentifier);
        c = new ffpm(3, 32, 4, 67, aSN1ObjectIdentifier);
        d = new ffpm(4, 32, 8, 34, aSN1ObjectIdentifier);
        e = new ffpm(5, 24, 1, BasePaymentResult.ERROR_REQUEST_FAILED, aSN1ObjectIdentifier);
        f = new ffpm(6, 24, 2, EnergyProfile.EVCONNECTOR_TYPE_OTHER, aSN1ObjectIdentifier);
        g = new ffpm(7, 24, 4, 51, aSN1ObjectIdentifier);
        h = new ffpm(8, 24, 8, 26, aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.o;
        i = new ffpm(9, 32, 1, 265, aSN1ObjectIdentifier2);
        j = new ffpm(10, 32, 2, 133, aSN1ObjectIdentifier2);
        k = new ffpm(11, 32, 4, 67, aSN1ObjectIdentifier2);
        l = new ffpm(12, 32, 8, 34, aSN1ObjectIdentifier2);
        m = new ffpm(13, 24, 1, BasePaymentResult.ERROR_REQUEST_FAILED, aSN1ObjectIdentifier2);
        n = new ffpm(14, 24, 2, EnergyProfile.EVCONNECTOR_TYPE_OTHER, aSN1ObjectIdentifier2);
        o = new ffpm(15, 24, 4, 51, aSN1ObjectIdentifier2);
        p = new ffpm(16, 24, 8, 26, aSN1ObjectIdentifier2);
        v = new ffpl();
    }

    protected ffpm(int i2, int i3, int i4, int i5, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.q = i2;
        this.r = i3;
        this.s = i4;
        this.t = i5;
        this.u = aSN1ObjectIdentifier;
    }

    public static ffpm a(int i2) {
        return (ffpm) v.get(Integer.valueOf(i2));
    }
}
