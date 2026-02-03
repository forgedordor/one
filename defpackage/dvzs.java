package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzs extends dwao {
    public final ejwi a;
    public final boolean b;
    public final ejwi c;

    public dvzs(ejwi ejwiVar, boolean z, ejwi ejwiVar2) {
        this.a = ejwiVar;
        this.b = z;
        this.c = ejwiVar2;
    }

    @Override // defpackage.dwao
    public final ejwi a() {
        return this.a;
    }

    @Override // defpackage.dwao
    public final ejwi b() {
        return this.c;
    }

    @Override // defpackage.dwao
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwao) {
            dwao dwaoVar = (dwao) obj;
            if (this.a.equals(dwaoVar.a()) && this.b == dwaoVar.c() && this.c.equals(dwaoVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.c;
        return "ChangeGroupProfile{conversationId=" + String.valueOf(this.a) + ", syncBlockStatus=" + this.b + ", profileInfo=" + String.valueOf(ejwiVar) + "}";
    }
}
