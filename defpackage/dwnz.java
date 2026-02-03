package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwnz extends dwrf {
    private ekgb a;
    private int b;
    private ejwi c = ejud.a;
    private byte d;

    @Override // defpackage.dwrf
    public final dwri a() {
        if (this.d == 1 && this.a != null) {
            return new dwoa(this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" buttons");
        }
        if (this.d == 0) {
            sb.append(" orientation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwrf
    public final void b(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null buttons");
        }
        this.a = ekgbVar;
    }

    @Override // defpackage.dwrf
    public final void c(int i) {
        this.c = ejwi.j(Integer.valueOf(i));
    }

    @Override // defpackage.dwrf
    public final void d(int i) {
        this.b = i;
        this.d = (byte) 1;
    }
}
