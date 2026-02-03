package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chuf extends chvf {
    public final int a;
    public final int b;
    public final bvec c;
    public final Uri d;
    public final int e;
    public final enxu f;
    public final Optional g;
    public final int h;

    public chuf(int i, int i2, bvec bvecVar, Uri uri, int i3, enxu enxuVar, int i4, Optional optional) {
        this.a = i;
        this.b = i2;
        this.c = bvecVar;
        this.d = uri;
        this.e = i3;
        this.f = enxuVar;
        this.h = i4;
        this.g = optional;
    }

    @Override // defpackage.chvf
    public final int a() {
        return this.b;
    }

    @Override // defpackage.chvf
    public final int b() {
        return this.e;
    }

    @Override // defpackage.chvf
    public final int c() {
        return this.a;
    }

    @Override // defpackage.chvf
    public final Uri d() {
        return this.d;
    }

    @Override // defpackage.chvf
    public final bvec e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        enxu enxuVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof chvf) {
            chvf chvfVar = (chvf) obj;
            if (this.a == chvfVar.c() && this.b == chvfVar.a() && this.c.equals(chvfVar.e()) && ((uri = this.d) != null ? uri.equals(chvfVar.d()) : chvfVar.d() == null) && this.e == chvfVar.b() && ((enxuVar = this.f) != null ? enxuVar.equals(chvfVar.g()) : chvfVar.g() == null)) {
                int i = this.h;
                int i2 = chvfVar.i();
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1 && this.g.equals(chvfVar.h())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.chvf
    public final chve f() {
        return new chue(this);
    }

    @Override // defpackage.chvf
    public final enxu g() {
        return this.f;
    }

    @Override // defpackage.chvf
    public final Optional h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
        Uri uri = this.d;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (uri == null ? 0 : uri.hashCode())) * 1000003) ^ this.e) * 1000003;
        enxu enxuVar = this.f;
        int iHashCode3 = enxuVar != null ? enxuVar.hashCode() : 0;
        elow.c(this.h);
        return ((((iHashCode2 ^ iHashCode3) * 1000003) ^ 1) * 1000003) ^ this.g.hashCode();
    }

    @Override // defpackage.chvf
    public final int i() {
        return this.h;
    }

    public final String toString() {
        enxu enxuVar = this.f;
        Uri uri = this.d;
        return "MessageStatusPlusUri{status=" + this.a + ", rawStatus=" + this.b + ", xmsTransportType=" + String.valueOf(this.c) + ", uri=" + String.valueOf(uri) + ", resultCode=" + this.e + ", rcsDiagnostics=" + String.valueOf(enxuVar) + ", mmsApi=" + (this.h != 0 ? elow.b(1) : "null") + ", retryStrategy=" + String.valueOf(this.g) + "}";
    }
}
