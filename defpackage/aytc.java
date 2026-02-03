package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aytc {
    public final boolean a;
    public final List b;
    public final List c;
    private final Integer d;

    public /* synthetic */ aytc(boolean z, List list, List list2, int i) {
        list = (i & 2) != 0 ? fcvo.a : list;
        list2 = (i & 4) != 0 ? fcvo.a : list2;
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = list;
        this.c = list2;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aytc)) {
            return false;
        }
        aytc aytcVar = (aytc) obj;
        if (this.a != aytcVar.a || !fdbq.f(this.b, aytcVar.b) || !fdbq.f(this.c, aytcVar.c)) {
            return false;
        }
        Integer num = aytcVar.d;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
    }

    public final String toString() {
        return "BackupParameters(includeC2pData=" + this.a + ", excludedTableWriters=" + this.b + ", excludedBackupTables=" + this.c + ", messageCountLimit=null)";
    }
}
