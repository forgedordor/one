package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwms extends dwpa {
    private final dwpx a;
    private final dwpb b;
    private final ekgb c;

    public dwms(dwpx dwpxVar, dwpb dwpbVar, ekgb ekgbVar) {
        this.a = dwpxVar;
        this.b = dwpbVar;
        this.c = ekgbVar;
    }

    @Override // defpackage.dwpa
    public final dwpb a() {
        return this.b;
    }

    @Override // defpackage.dwpa
    public final dwpx b() {
        return this.a;
    }

    @Override // defpackage.dwpa
    public final ekgb c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwpa) {
            dwpa dwpaVar = (dwpa) obj;
            if (this.a.equals(dwpaVar.b()) && this.b.equals(dwpaVar.a()) && ekjz.h(this.c, dwpaVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ekgb ekgbVar = this.c;
        dwpb dwpbVar = this.b;
        return "CloudConversation{conversationId=" + this.a.toString() + ", cloudConversationMetadata=" + dwpbVar.toString() + ", annotations=" + ekgbVar.toString() + "}";
    }
}
