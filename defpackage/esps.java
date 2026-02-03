package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esps extends espv {
    public boolean a;
    public int b;
    public String c;
    public espx d;
    public int e;
    public byte f;

    @Override // defpackage.espv
    public final espw a() {
        if (this.f == -1) {
            return new espt(this.a, this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" enableQuic");
        }
        if ((this.f & 2) == 0) {
            sb.append(" enableBrotli");
        }
        if ((this.f & 4) == 0) {
            sb.append(" enableCertificateCache");
        }
        if ((this.f & 8) == 0) {
            sb.append(" enableHttpCache");
        }
        if ((this.f & 16) == 0) {
            sb.append(" enableNetworkQualityEstimator");
        }
        if ((this.f & 32) == 0) {
            sb.append(" diskCacheSizeBytes");
        }
        if ((this.f & 64) == 0) {
            sb.append(" inMemoryFallbackCacheSizeBytes");
        }
        if ((this.f & 128) == 0) {
            sb.append(" threadPriority");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
