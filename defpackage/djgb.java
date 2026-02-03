package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djgb {
    public final djcy a;
    public final djfn b;
    public final djdm c;
    public final float d;
    public final boolean e;
    public final djga f;
    public final int g;

    public /* synthetic */ djgb(djcy djcyVar, djfn djfnVar, djdm djdmVar, int i, float f, boolean z, djga djgaVar, int i2) {
        this.a = djcyVar;
        this.b = djfnVar;
        this.c = djdmVar;
        this.g = (i2 & 8) != 0 ? 1 : i;
        this.d = (i2 & 16) != 0 ? 1.0f : f;
        this.e = ((i2 & 32) == 0) & z;
        this.f = djgaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djgb)) {
            return false;
        }
        djgb djgbVar = (djgb) obj;
        return fdbq.f(this.a, djgbVar.a) && fdbq.f(this.b, djgbVar.b) && fdbq.f(this.c, djgbVar.c) && this.g == djgbVar.g && Float.compare(this.d, djgbVar.d) == 0 && this.e == djgbVar.e && fdbq.f(this.f, djgbVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        djdm djdmVar = this.c;
        return (((((((((iHashCode * 31) + (djdmVar == null ? 0 : djdmVar.hashCode())) * 31) + this.g) * 31) + Float.floatToIntBits(this.d)) * 31) + (true != this.e ? 1237 : 1231)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComposeRowUiData(draft=");
        sb.append(this.a);
        sb.append(", simSelector=");
        sb.append(this.b);
        sb.append(", inputs=");
        sb.append(this.c);
        sb.append(", backgroundStyle=");
        int i = this.g;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? "BLUE_CHIP" : "WHITE" : "TONAL" : "NEUTRAL"));
        sb.append(", backgroundAlpha=");
        sb.append(this.d);
        sb.append(", showEmotiveNotificationDot=");
        sb.append(this.e);
        sb.append(", flags=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
