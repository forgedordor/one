package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwuk extends dwvg {
    private int a;
    private String b;
    private ekgb c;
    private byte d;

    @Override // defpackage.dwvg
    public final dwvh a() {
        if (this.d == 1 && this.b != null && this.c != null) {
            return new dwul(this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" cardWidth");
        }
        if (this.b == null) {
            sb.append(" jsonSource");
        }
        if (this.c == null) {
            sb.append(" cards");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwvg
    public final void b(int i) {
        this.a = i;
        this.d = (byte) 1;
    }

    @Override // defpackage.dwvg
    public final void c(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null cards");
        }
        this.c = ekgbVar;
    }

    @Override // defpackage.dwvg
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null jsonSource");
        }
        this.b = str;
    }
}
