package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovf extends ovg {
    public final owg a;
    public final owg b;

    public ovf(owg owgVar, owg owgVar2) {
        this.a = owgVar;
        this.b = owgVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ovf)) {
            return false;
        }
        owg owgVar = this.a;
        ouc oucVar = (ouc) owgVar;
        int i = oucVar.d;
        ovf ovfVar = (ovf) obj;
        owg owgVar2 = ovfVar.a;
        ouc oucVar2 = (ouc) owgVar2;
        if (i != oucVar2.d || oucVar.e != oucVar2.e || owgVar.f() != owgVar2.f() || oucVar.c != oucVar2.c) {
            return false;
        }
        owg owgVar3 = this.b;
        ouc oucVar3 = (ouc) owgVar3;
        int i2 = oucVar3.d;
        owg owgVar4 = ovfVar.b;
        ouc oucVar4 = (ouc) owgVar4;
        return i2 == oucVar4.d && oucVar3.e == oucVar4.e && owgVar3.f() == owgVar4.f() && oucVar3.c == oucVar4.c;
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: ");
        owg owgVar = this.a;
        ouc oucVar = (ouc) owgVar;
        sb.append(oucVar.d);
        sb.append("\n                    |       placeholdersAfter: ");
        sb.append(oucVar.e);
        sb.append("\n                    |       size: ");
        sb.append(owgVar.f());
        sb.append("\n                    |       dataCount: ");
        sb.append(oucVar.c);
        sb.append("\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: ");
        owg owgVar2 = this.b;
        ouc oucVar2 = (ouc) owgVar2;
        sb.append(oucVar2.d);
        sb.append("\n                    |       placeholdersAfter: ");
        sb.append(oucVar2.e);
        sb.append("\n                    |       size: ");
        sb.append(owgVar2.f());
        sb.append("\n                    |       dataCount: ");
        sb.append(oucVar2.c);
        sb.append("\n                    |   )\n                    |");
        return fdgn.c(sb.toString(), "|");
    }
}
