package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecia extends ecjj {
    public final Uri a;
    public final evuh b;
    public final ejwi c;
    public final ekgb d;
    public final eclb e;
    public final boolean f;

    public ecia(Uri uri, evuh evuhVar, ejwi ejwiVar, ekgb ekgbVar, eclb eclbVar, boolean z) {
        this.a = uri;
        this.b = evuhVar;
        this.c = ejwiVar;
        this.d = ekgbVar;
        this.e = eclbVar;
        this.f = z;
    }

    @Override // defpackage.ecjj
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.ecjj
    public final eclb b() {
        return this.e;
    }

    @Override // defpackage.ecjj
    public final ejwi c() {
        return this.c;
    }

    @Override // defpackage.ecjj
    public final ekgb d() {
        return this.d;
    }

    @Override // defpackage.ecjj
    public final evuh e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecjj) {
            ecjj ecjjVar = (ecjj) obj;
            if (this.a.equals(ecjjVar.a()) && this.b.equals(ecjjVar.e()) && this.c.equals(ecjjVar.c()) && ekjz.h(this.d, ecjjVar.d()) && this.e.equals(ecjjVar.b()) && this.f == ecjjVar.f()) {
                ecjjVar.g();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ecjj
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        eclb eclbVar = this.e;
        ekgb ekgbVar = this.d;
        ejwi ejwiVar = this.c;
        evuh evuhVar = this.b;
        return "ProtoDataStoreConfig{uri=" + this.a.toString() + ", schema=" + evuhVar.toString() + ", handler=" + String.valueOf(ejwiVar) + ", migrations=" + String.valueOf(ekgbVar) + ", variantConfig=" + eclbVar.toString() + ", useGeneratedExtensionRegistry=" + this.f + ", enableTracing=false}";
    }

    @Override // defpackage.ecjj
    public final void g() {
    }
}
