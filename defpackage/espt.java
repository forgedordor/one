package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class espt extends espw {
    private final boolean a;
    private final int b;
    private final String c;
    private final espx d;
    private final int e;

    public espt(boolean z, int i, String str, espx espxVar, int i2) {
        this.a = z;
        this.b = i;
        this.c = str;
        this.d = espxVar;
        this.e = i2;
    }

    @Override // defpackage.espw
    public final int a() {
        return this.b;
    }

    @Override // defpackage.espw
    public final int b() {
        return this.e;
    }

    @Override // defpackage.espw
    public final espx c() {
        return this.d;
    }

    @Override // defpackage.espw
    public final String d() {
        return this.c;
    }

    @Override // defpackage.espw
    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof espw) {
            espw espwVar = (espw) obj;
            espwVar.g();
            espwVar.m();
            if (this.a == espwVar.e()) {
                espwVar.h();
                espwVar.i();
                espwVar.j();
                espwVar.k();
                if (this.b == espwVar.a()) {
                    espwVar.f();
                    espwVar.l();
                    String str = this.c;
                    if (str != null ? str.equals(espwVar.d()) : espwVar.d() == null) {
                        espx espxVar = this.d;
                        if (espxVar != null ? espxVar.equals(espwVar.c()) : espwVar.c() == null) {
                            if (this.e == espwVar.b()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = (str == null ? 0 : str.hashCode()) ^ (((((((((((((true != this.a ? 1237 : 1231) ^ 583896283) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.b) * 583896283);
        espx espxVar = this.d;
        return (((iHashCode * 1000003) ^ (espxVar != null ? espxVar.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public final String toString() {
        return "CronetConfig{context=null, storagePath=null, enableQuic=" + this.a + ", enableBrotli=false, enableCertificateCache=false, enableHttpCache=false, enableNetworkQualityEstimator=false, diskCacheSizeBytes=" + this.b + ", inMemoryFallbackCacheSizeBytes=0, libraryLoader=null, experimentalOptions=" + this.c + ", cronetEngineBuilderFactory=" + String.valueOf(this.d) + ", threadPriority=" + this.e + "}";
    }

    @Override // defpackage.espw
    public final void f() {
    }

    @Override // defpackage.espw
    public final void g() {
    }

    @Override // defpackage.espw
    public final void h() {
    }

    @Override // defpackage.espw
    public final void i() {
    }

    @Override // defpackage.espw
    public final void j() {
    }

    @Override // defpackage.espw
    public final void k() {
    }

    @Override // defpackage.espw
    public final void l() {
    }

    @Override // defpackage.espw
    public final void m() {
    }
}
