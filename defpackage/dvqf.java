package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvqf extends dvqs {
    private final String a;
    private final ekgb b;

    public dvqf(String str, ekgb ekgbVar) {
        this.a = str;
        this.b = ekgbVar;
    }

    @Override // defpackage.dvqs
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.dvqs
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvqs) {
            dvqs dvqsVar = (dvqs) obj;
            if (this.a.equals(dvqsVar.b()) && ekjz.h(this.b, dvqsVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ListConversationsResult{nextPageToken=" + this.a + ", conversations=" + this.b.toString() + "}";
    }
}
