package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amtg extends amul {
    private String a;
    private ekgb b;

    @Override // defpackage.amul
    public final amum a() {
        ekgb ekgbVar;
        String str = this.a;
        if (str != null && (ekgbVar = this.b) != null) {
            return new amth(str, ekgbVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" text");
        }
        if (this.b == null) {
            sb.append(" annotations");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.amul
    public final void b(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null annotations");
        }
        this.b = ekgbVar;
    }

    @Override // defpackage.amul
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.a = str;
    }
}
