package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwoo extends dwsh {
    private String a;
    private ekgb b;

    @Override // defpackage.dwsh
    public final dwsk a() {
        ekgb ekgbVar;
        String str = this.a;
        if (str != null && (ekgbVar = this.b) != null) {
            return new dwop(str, ekgbVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" url");
        }
        if (this.b == null) {
            sb.append(" replacements");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwsh
    public final void b(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null replacements");
        }
        this.b = ekgbVar;
    }

    @Override // defpackage.dwsh
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.a = str;
    }
}
