package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqip extends cqjc {
    public final Cursor a;
    private final cqjb b;

    public cqip(cqjb cqjbVar, Cursor cursor) {
        if (cqjbVar == null) {
            throw new NullPointerException("Null directory");
        }
        this.b = cqjbVar;
        this.a = cursor;
    }

    @Override // defpackage.cqjc
    public final Cursor a() {
        return this.a;
    }

    @Override // defpackage.cqjc
    public final cqjb b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Cursor cursor;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqjc) {
            cqjc cqjcVar = (cqjc) obj;
            if (this.b.equals(cqjcVar.b()) && ((cursor = this.a) != null ? cursor.equals(cqjcVar.a()) : cqjcVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() ^ 1000003;
        Cursor cursor = this.a;
        return (iHashCode * 1000003) ^ (cursor == null ? 0 : cursor.hashCode());
    }

    public final String toString() {
        Cursor cursor = this.a;
        return "ContactsDirectoryFilterResult{directory=" + this.b.toString() + ", filterCursor=" + String.valueOf(cursor) + "}";
    }
}
