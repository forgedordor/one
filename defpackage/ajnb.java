package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajnb extends ajnt {
    private final ajnq a;
    private final ajnr b;
    private final ajns c;

    public ajnb(ajnq ajnqVar, ajnr ajnrVar, ajns ajnsVar) {
        this.a = ajnqVar;
        this.b = ajnrVar;
        this.c = ajnsVar;
    }

    @Override // defpackage.ajnt
    public final ajnq a() {
        return this.a;
    }

    @Override // defpackage.ajnt
    public final ajnr b() {
        return this.b;
    }

    @Override // defpackage.ajnt
    public final ajns c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajnt) {
            ajnt ajntVar = (ajnt) obj;
            if (this.a.equals(ajntVar.a()) && this.b.equals(ajntVar.b()) && this.c.equals(ajntVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ajns ajnsVar = this.c;
        ajnr ajnrVar = this.b;
        return "GlobalConfiguration{rcsSetting=" + this.a.toString() + ", readReceiptBehavior=" + ajnrVar.toString() + ", typingIndicatorBehavior=" + ajnsVar.toString() + "}";
    }
}
