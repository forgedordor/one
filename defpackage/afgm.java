package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afgm extends afhi {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public afgm(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // defpackage.afhi
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.afhi
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.afhi
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afhi) {
            afhi afhiVar = (afhi) obj;
            if (this.a == afhiVar.b() && this.b == afhiVar.a() && this.c == afhiVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "LinkPreviewSettingsData{linkPreviewEnabled=" + this.a + ", allRichCardsEnabled=" + this.b + ", richCardsWifiOnly=" + this.c + "}";
    }
}
