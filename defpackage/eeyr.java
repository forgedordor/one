package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeyr extends eeyf {
    public int a;
    public byte b;

    @Override // defpackage.eeyf
    public final eeyg a() {
        if (this.b == 3) {
            return new eeys(this.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((this.b & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eeyf
    public final void b() {
        this.b = (byte) (this.b | 2);
    }
}
