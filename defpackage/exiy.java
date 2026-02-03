package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class exiy extends exka {
    public ekgb a;
    private long b;
    private byte c;

    @Override // defpackage.exka
    public final exkb a() {
        ekgb ekgbVar;
        if (this.c == 1 && (ekgbVar = this.a) != null) {
            return new exiz(this.b, ekgbVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" parentGlContextHandle");
        }
        if (this.a == null) {
            sb.append(" servicePacketHandles");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.exka
    public final void b(long j) {
        this.b = j;
        this.c = (byte) 1;
    }
}
