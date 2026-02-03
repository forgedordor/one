package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqu extends Exception {
    private final String a;
    private final String b;

    public kqu(String str, kqp kqpVar) {
        super(str);
        this.a = str;
        this.b = kqpVar.w();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("CLParsingException (");
        sb.append(hashCode());
        sb.append(") : ");
        sb.append(this.a + " (" + this.b + " at line 0)");
        return sb.toString();
    }
}
