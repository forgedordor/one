package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccak extends ccan {
    public final ccam a;
    private final cbwd b;
    private final String c;

    public ccak(cbwd cbwdVar, ccam ccamVar, String str) {
        cbwdVar.getClass();
        ccamVar.getClass();
        this.b = cbwdVar;
        this.a = ccamVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccak)) {
            return false;
        }
        ccak ccakVar = (ccak) obj;
        return fdbq.f(this.b, ccakVar.b) && this.a == ccakVar.a && fdbq.f(this.c, ccakVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() * 31) + this.a.hashCode();
        String str = this.c;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MessageSent(mlsContext=" + this.b + ", resultStatus=" + this.a + ", sentRcsMessageId=" + this.c + ")";
    }

    public /* synthetic */ ccak(cbwd cbwdVar, ccam ccamVar) {
        this(cbwdVar, ccamVar, null);
    }
}
