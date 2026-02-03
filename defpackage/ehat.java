package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehat extends ehcg {
    private final ejwi a;
    private final ejwi b;
    private final ejwi c;
    private final ejwi d;

    public ehat(ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
        this.c = ejwiVar3;
        this.d = ejwiVar4;
    }

    @Override // defpackage.ehcg
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.ehcg
    public final ejwi b() {
        return this.a;
    }

    @Override // defpackage.ehcg
    public final ejwi c() {
        return this.c;
    }

    @Override // defpackage.ehcg
    public final ejwi d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehcg) {
            ehcg ehcgVar = (ehcg) obj;
            if (this.a.equals(ehcgVar.b()) && this.b.equals(ehcgVar.a()) && this.c.equals(ehcgVar.c()) && this.d.equals(ehcgVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.d;
        ejwi ejwiVar2 = this.c;
        ejwi ejwiVar3 = this.b;
        return "LocalSubscriptionState{maybeLocalDataSource=" + this.a.toString() + ", executingLoad=" + ejwiVar3.toString() + ", pendingTopicResult=" + ejwiVar2.toString() + ", publishedTopicResult=" + ejwiVar.toString() + "}";
    }
}
