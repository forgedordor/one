package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejld extends ejlw {
    private final ekgp a;
    private final ekgp b;

    public ejld(ekgp ekgpVar, ekgp ekgpVar2) {
        this.a = ekgpVar;
        this.b = ekgpVar2;
    }

    @Override // defpackage.ejlw
    public final ekgp a() {
        return this.a;
    }

    @Override // defpackage.ejlw
    public final ekgp b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejlw) {
            ejlw ejlwVar = (ejlw) obj;
            if (this.a.equals(ejlwVar.a()) && this.b.equals(ejlwVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ekgp ekgpVar = this.b;
        return "StickerProviderMaps{emotionToStickerNameMap=" + this.a.toString() + ", stickerNameToStickerMap=" + ekgpVar.toString() + "}";
    }
}
