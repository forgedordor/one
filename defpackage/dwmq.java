package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwmq extends dwox {
    public final dwsa a;
    public final ekgb b;

    public dwmq(dwsa dwsaVar, ekgb ekgbVar) {
        this.a = dwsaVar;
        this.b = ekgbVar;
    }

    @Override // defpackage.dwox
    public final dwsa a() {
        return this.a;
    }

    @Override // defpackage.dwox
    public final ekgb b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwox) {
            dwox dwoxVar = (dwox) obj;
            if (this.a.equals(dwoxVar.a()) && ekjz.h(this.b, dwoxVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ekgb ekgbVar = this.b;
        return "ButtonPrompt{promptText=" + this.a.toString() + ", buttons=" + ekgbVar.toString() + "}";
    }
}
