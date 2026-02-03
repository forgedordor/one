package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyrs extends dyud {
    public final dyuc a;
    public final dyuo b;

    public dyrs(dyuc dyucVar, dyuo dyuoVar) {
        this.a = dyucVar;
        this.b = dyuoVar;
    }

    @Override // defpackage.dyud
    public final dyuc a() {
        return this.a;
    }

    @Override // defpackage.dyud
    public final dyuo b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyud) {
            dyud dyudVar = (dyud) obj;
            if (this.a.equals(dyudVar.a()) && this.b.equals(dyudVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        dyuo dyuoVar = this.b;
        return "ExpressSignInSpec{onContinueWithAccountListenerWithAsyncCallback=" + this.a.toString() + ", features=" + dyuoVar.toString() + "}";
    }
}
