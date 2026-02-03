package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnov implements dpxp {
    public final dnlw a;
    public final boolean b;
    public final ejxr c;
    public final dnkf d;
    public final Integer e;
    public final boolean f;
    public final dnce g;
    public final dnfv h;

    /* JADX WARN: Multi-variable type inference failed */
    public dnov() {
        this(null, 0 == true ? 1 : 0, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnov)) {
            return false;
        }
        dnov dnovVar = (dnov) obj;
        if (this.a != dnovVar.a || this.b != dnovVar.b || !fdbq.f(this.c, dnovVar.c) || !fdbq.f(this.d, dnovVar.d) || !fdbq.f(this.e, dnovVar.e) || this.f != dnovVar.f || !fdbq.f(this.g, dnovVar.g)) {
            return false;
        }
        dnfv dnfvVar = dnovVar.h;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ejxr ejxrVar = this.c;
        int iA = (((iHashCode + dnou.a(this.b)) * 31) + (ejxrVar == null ? 0 : ejxrVar.hashCode())) * 31;
        dnkf dnkfVar = this.d;
        int iHashCode2 = (iA + (dnkfVar == null ? 0 : dnkfVar.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + dnou.a(this.f)) * 31;
        dnce dnceVar = this.g;
        return (iHashCode3 + (dnceVar != null ? dnceVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "EmojiConfiguration(preferencesStrategy=" + this.a + ", showVariantPickerOnFirstVariableEmojiUse=" + this.b + ", emojiSearchManifestFileFlagSupplier=" + this.c + ", selectedEmoji=" + this.d + ", selectedEmojiBackgroundResId=" + this.e + ", showBackspaceButton=" + this.f + ", emojiUsageUserContext=" + this.g + ", emojiUsageFrecencyFactors=null)";
    }

    public dnov(dnlw dnlwVar, boolean z, ejxr ejxrVar, dnkf dnkfVar, Integer num, boolean z2, dnce dnceVar) {
        dnlwVar.getClass();
        this.a = dnlwVar;
        this.b = z;
        this.c = ejxrVar;
        this.d = dnkfVar;
        this.e = num;
        this.f = z2;
        this.g = dnceVar;
        this.h = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dnov(dnlw dnlwVar, ejxr ejxrVar, int i) {
        dnlw dnlwVar2 = (i & 1) != 0 ? dnlw.b : dnlwVar;
        boolean z = false;
        if ((i & 2) != 0 && dnlwVar2 == dnlw.a) {
            z = true;
        }
        this(dnlwVar2, z, (i & 4) != 0 ? null : ejxrVar, null, null, true, null);
    }
}
