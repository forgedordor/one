package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzov extends dzpi {
    public feeg a;
    public byte b;
    private String c;
    private dzfh d;
    private final ejwi e;
    private final ejwi f;

    public dzov() {
        ejud ejudVar = ejud.a;
        this.e = ejudVar;
        this.f = ejudVar;
    }

    @Override // defpackage.dzpi
    public final dzpj a() {
        String str;
        if (this.b == 1 && (str = this.c) != null) {
            return new dzow(str, this.d, this.a, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" eventName");
        }
        if (this.b == 0) {
            sb.append(" enablePerfettoTraceCollection");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzpi
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null eventName");
        }
        this.c = str;
    }

    @Override // defpackage.dzpi
    public final void c(dzfh dzfhVar) {
        this.d = dzfhVar;
    }
}
