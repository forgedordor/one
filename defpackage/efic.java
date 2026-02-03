package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efic extends efko {
    public final String a;
    public final ekgb b;

    public efic(String str, ekgb ekgbVar) {
        this.a = str;
        this.b = ekgbVar;
    }

    @Override // defpackage.efko
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.efko
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efko) {
            efko efkoVar = (efko) obj;
            if (this.a.equals(efkoVar.b()) && ekjz.h(this.b, efkoVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RbmSpamReport{rcsBotId=" + this.a + ", rcsMessageIds=" + this.b.toString() + "}";
    }
}
