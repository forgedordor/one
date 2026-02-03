package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcc {
    public static final /* synthetic */ int b = 0;
    public final mar a;

    static {
        mcb.a(new maq());
        mgb.O(0);
    }

    public mcc(mar marVar) {
        this.a = marVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mcc) {
            return this.a.equals(((mcc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
