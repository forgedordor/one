package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dabo extends dabv {
    public final ekgb a;
    public final ekgb b;
    public final ekhx c;

    public dabo(ekgb ekgbVar, ekgb ekgbVar2, ekhx ekhxVar) {
        this.a = ekgbVar;
        this.b = ekgbVar2;
        this.c = ekhxVar;
    }

    @Override // defpackage.dabv
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.dabv
    public final ekgb b() {
        return this.a;
    }

    @Override // defpackage.dabv
    public final ekhx c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dabv) {
            dabv dabvVar = (dabv) obj;
            if (ekjz.h(this.a, dabvVar.b()) && ekjz.h(this.b, dabvVar.a()) && this.c.equals(dabvVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ekhx ekhxVar = this.c;
        ekgb ekgbVar = this.b;
        return "ConversationSearchViewData{starredTextResultItemData=" + this.a.toString() + ", conversationListViewData=" + ekgbVar.toString() + ", conversationsWithNoMatchingParts=" + ekhxVar.toString() + "}";
    }
}
