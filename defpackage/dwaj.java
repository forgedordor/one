package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwaj extends dwbk {
    public final dwsg a;
    public final boolean b;
    public final dwbj c;

    public dwaj(dwsg dwsgVar, boolean z, dwbj dwbjVar) {
        this.a = dwsgVar;
        this.b = z;
        this.c = dwbjVar;
    }

    @Override // defpackage.dwbk
    public final dwbj a() {
        return this.c;
    }

    @Override // defpackage.dwbk
    public final dwsg b() {
        return this.a;
    }

    @Override // defpackage.dwbk
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwbk) {
            dwbk dwbkVar = (dwbk) obj;
            dwsg dwsgVar = this.a;
            if (dwsgVar != null ? dwsgVar.equals(dwbkVar.b()) : dwbkVar.b() == null) {
                if (this.b == dwbkVar.c() && this.c.equals(dwbkVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        dwsg dwsgVar = this.a;
        return (((((dwsgVar == null ? 0 : dwsgVar.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        dwbj dwbjVar = this.c;
        return "TachyonMessage{suggestionList=" + String.valueOf(this.a) + ", skipNotification=" + this.b + ", oneOfType=" + dwbjVar.toString() + "}";
    }
}
