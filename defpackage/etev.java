package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class etev {
    public abstract int a();

    public abstract etes b();

    public final String toString() {
        int iA = a();
        StringBuilder sb = new StringBuilder(a.D(iA, " :: [ "));
        etes etesVarB = b();
        while (iA > 0) {
            sb.append(Integer.toHexString(etesVarB.b()));
            sb.append(", ");
            iA--;
        }
        sb.setLength(sb.length() - 2);
        sb.append(" ]");
        return sb.toString();
    }
}
