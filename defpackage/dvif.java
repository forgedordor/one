package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvif extends dvil {
    private String a;
    private ekgb b;

    @Override // defpackage.dvil
    public final dvim a() {
        ekgb ekgbVar;
        String str = this.a;
        if (str != null && (ekgbVar = this.b) != null) {
            return new dvig(str, ekgbVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" nextPageToken");
        }
        if (this.b == null) {
            sb.append(" conversationIds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dvil
    public final void b(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null conversationIds");
        }
        this.b = ekgbVar;
    }

    @Override // defpackage.dvil
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null nextPageToken");
        }
        this.a = str;
    }
}
