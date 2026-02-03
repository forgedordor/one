package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dabn extends dabu {
    private ekgb a;
    private ekgb b;
    private ekhx c;

    @Override // defpackage.dabu
    public final dabv a() {
        ekgb ekgbVar;
        ekhx ekhxVar;
        ekgb ekgbVar2 = this.a;
        if (ekgbVar2 != null && (ekgbVar = this.b) != null && (ekhxVar = this.c) != null) {
            return new dabo(ekgbVar2, ekgbVar, ekhxVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" starredTextResultItemData");
        }
        if (this.b == null) {
            sb.append(" conversationListViewData");
        }
        if (this.c == null) {
            sb.append(" conversationsWithNoMatchingParts");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dabu
    public final void b(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null conversationListViewData");
        }
        this.b = ekgbVar;
    }

    @Override // defpackage.dabu
    public final void c(ekhx ekhxVar) {
        if (ekhxVar == null) {
            throw new NullPointerException("Null conversationsWithNoMatchingParts");
        }
        this.c = ekhxVar;
    }

    @Override // defpackage.dabu
    public final void d(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null starredTextResultItemData");
        }
        this.a = ekgbVar;
    }
}
