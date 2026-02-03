package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvzu extends dwaq {
    private final boolean a;
    private final int b;

    public dvzu(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // defpackage.dwaq
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dwaq
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwaq) {
            dwaq dwaqVar = (dwaq) obj;
            if (this.a == dwaqVar.b() && this.b == dwaqVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "CloudBootstrapDownloadConversationResult{isSuccessful=" + this.a + ", conversationsDownloaded=" + this.b + "}";
    }
}
