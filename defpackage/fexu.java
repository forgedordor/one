package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fexu {
    public static final fexu a;
    public static final fexu b;
    private static final fexq[] g;
    private static final fexq[] h;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final String[] f;

    static {
        fexq fexqVar = fexq.q;
        fexq fexqVar2 = fexq.r;
        fexq fexqVar3 = fexq.s;
        fexq fexqVar4 = fexq.k;
        fexq fexqVar5 = fexq.m;
        fexq fexqVar6 = fexq.l;
        fexq fexqVar7 = fexq.n;
        fexq fexqVar8 = fexq.p;
        fexq fexqVar9 = fexq.o;
        fexq[] fexqVarArr = {fexqVar, fexqVar2, fexqVar3, fexqVar4, fexqVar5, fexqVar6, fexqVar7, fexqVar8, fexqVar9};
        g = fexqVarArr;
        fexq[] fexqVarArr2 = {fexqVar, fexqVar2, fexqVar3, fexqVar4, fexqVar5, fexqVar6, fexqVar7, fexqVar8, fexqVar9, fexq.i, fexq.j, fexq.g, fexq.h, fexq.e, fexq.f, fexq.d};
        h = fexqVarArr2;
        fext fextVar = new fext(true);
        fextVar.e((fexq[]) Arrays.copyOf(fexqVarArr, 9));
        fextVar.f(fezn.a, fezn.b);
        fextVar.c();
        fextVar.a();
        fext fextVar2 = new fext(true);
        fextVar2.e((fexq[]) Arrays.copyOf(fexqVarArr2, 16));
        fextVar2.f(fezn.a, fezn.b);
        fextVar2.c();
        a = fextVar2.a();
        fext fextVar3 = new fext(true);
        fextVar3.e((fexq[]) Arrays.copyOf(fexqVarArr2, 16));
        fextVar3.f(fezn.a, fezn.b, fezn.c, fezn.d);
        fextVar3.c();
        fextVar3.a();
        b = new fext(false).a();
    }

    public fexu(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = strArr2;
    }

    public final List a() {
        String[] strArr = this.e;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(fexq.a.a(str));
        }
        return fcva.ao(arrayList);
    }

    public final List b() {
        String[] strArr = this.f;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            fezn feznVar = fezn.a;
            arrayList.add(fezm.a(str));
        }
        return fcva.ao(arrayList);
    }

    public final boolean c(SSLSocket sSLSocket) {
        if (!this.c) {
            return false;
        }
        String[] strArr = this.f;
        if (strArr != null && !fezr.v(strArr, sSLSocket.getEnabledProtocols(), fcxq.a)) {
            return false;
        }
        String[] strArr2 = this.e;
        return strArr2 == null || fezr.v(strArr2, sSLSocket.getEnabledCipherSuites(), fexq.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fexu)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.c;
        fexu fexuVar = (fexu) obj;
        if (z != fexuVar.c) {
            return false;
        }
        return !z || (Arrays.equals(this.e, fexuVar.e) && Arrays.equals(this.f, fexuVar.f) && this.d == fexuVar.d);
    }

    public final int hashCode() {
        if (!this.c) {
            return 17;
        }
        String[] strArr = this.e;
        int iHashCode = strArr != null ? Arrays.hashCode(strArr) : 0;
        String[] strArr2 = this.f;
        return ((((iHashCode + 527) * 31) + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.d ? 1 : 0);
    }

    public final String toString() {
        if (!this.c) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(b(), "[all enabled]") + ", supportsTlsExtensions=" + this.d + ")";
    }
}
