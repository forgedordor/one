package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edqk extends edqy {
    public edra a;
    public ekgb b;
    private boolean c;
    private byte d;

    @Override // defpackage.edqy
    public final edrb a() {
        edra edraVar;
        ekgb ekgbVar;
        if (this.d == 1 && (edraVar = this.a) != null && (ekgbVar = this.b) != null) {
            return new edql(edraVar, this.c, ekgbVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" content");
        }
        if (this.d == 0) {
            sb.append(" hasMore");
        }
        if (this.b == null) {
            sb.append(" eventLogs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.edqy
    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }
}
