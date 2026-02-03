package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsn {
    public final fdae a;
    public final fdis b;

    public dsn(fdae fdaeVar, fdis fdisVar) {
        this.a = fdaeVar;
        this.b = fdisVar;
    }

    public final String toString() {
        String str;
        fdis fdisVar = this.b;
        fdjw fdjwVar = (fdjw) ((fdiu) fdisVar).b.get(fdjw.a);
        String str2 = fdjwVar != null ? fdjwVar.b : null;
        StringBuilder sb = new StringBuilder("Request@");
        String string = Integer.toString(hashCode(), 16);
        string.getClass();
        sb.append(string);
        if (str2 != null) {
            str = "[" + str2 + "](";
        } else {
            str = "(";
        }
        sb.append(str);
        sb.append("currentBounds()=");
        sb.append(this.a.invoke());
        sb.append(", continuation=");
        sb.append(fdisVar);
        sb.append(')');
        return sb.toString();
    }
}
