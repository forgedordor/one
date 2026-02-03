package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagu {
    public final fdat a;
    public final boolean b;
    public final boolean c;

    public aagu(fdat fdatVar, boolean z, boolean z2) {
        this.a = fdatVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aagu)) {
            return false;
        }
        aagu aaguVar = (aagu) obj;
        return fdbq.f(this.a, aaguVar.a) && this.b == aaguVar.b && this.c == aaguVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + aagt.a(this.b)) * 31) + aagt.a(this.c);
    }

    public final String toString() {
        return "ThemeUiData(tonalPaletteProvider=" + this.a + ", richConversationTheme=" + this.b + ", forceDarkTheme=" + this.c + ")";
    }
}
