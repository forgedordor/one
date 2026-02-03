package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqpc extends dqyg {
    public final Cursor a;
    public final ekgb b;
    public final dqxe c;

    public dqpc(Cursor cursor, ekgb ekgbVar, dqxe dqxeVar) {
        this.a = cursor;
        this.b = ekgbVar;
        this.c = dqxeVar;
    }

    @Override // defpackage.dqyg
    public final Cursor a() {
        return this.a;
    }

    @Override // defpackage.dqyg
    public final dqxe b() {
        return this.c;
    }

    @Override // defpackage.dqyg
    public final ekgb c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        ekgb ekgbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqyg) {
            dqyg dqygVar = (dqyg) obj;
            dqygVar.d();
            if (this.a.equals(dqygVar.a()) && ((ekgbVar = this.b) != null ? ekjz.h(ekgbVar, dqygVar.c()) : dqygVar.c() == null) && this.c.equals(dqygVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ (-721379959);
        ekgb ekgbVar = this.b;
        return (((iHashCode * 1000003) ^ (ekgbVar == null ? 0 : ekgbVar.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        dqxe dqxeVar = this.c;
        ekgb ekgbVar = this.b;
        return "ValuesExpression{sqlExpression=null, cursor=" + this.a.toString() + ", columnsToUpdate=" + String.valueOf(ekgbVar) + ", whereClause=" + dqxeVar.toString() + "}";
    }

    @Override // defpackage.dqyg
    public final void d() {
    }
}
