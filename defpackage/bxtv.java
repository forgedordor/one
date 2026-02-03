package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxtv extends bxut {
    public final Cursor a;
    public final ekhx b;

    public bxtv(Cursor cursor, ekhx ekhxVar) {
        this.a = cursor;
        if (ekhxVar == null) {
            throw new NullPointerException("Null conversationsWithNoMatchingParts");
        }
        this.b = ekhxVar;
    }

    @Override // defpackage.bxut
    public final Cursor a() {
        return this.a;
    }

    @Override // defpackage.bxut
    public final ekhx b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxut) {
            bxut bxutVar = (bxut) obj;
            if (this.a.equals(bxutVar.a()) && this.b.equals(bxutVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ekhx ekhxVar = this.b;
        return "ConversationSearchResults{cursor=" + this.a.toString() + ", conversationsWithNoMatchingParts=" + ekhxVar.toString() + "}";
    }
}
