package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctot {
    public final boolean a;
    public final fdae b;

    public ctot() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctot)) {
            return false;
        }
        ctot ctotVar = (ctot) obj;
        return this.a == ctotVar.a && fdbq.f(this.b, ctotVar.b);
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ChatbotDirectoryUiData(shouldDisplay=" + this.a + ", onMessageToBusinessButtonClicked=" + this.b + ")";
    }

    public ctot(boolean z, fdae fdaeVar) {
        this.a = z;
        this.b = fdaeVar;
    }

    public /* synthetic */ ctot(byte[] bArr) {
        this(false, new fdae() { // from class: ctos
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        });
    }
}
