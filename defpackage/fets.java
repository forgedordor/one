package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fets extends feno {
    public static final fets b = new fets("TRUE");
    public static final fets c = new fets("FALSE");
    private static final long serialVersionUID = -5381653882942018012L;
    private final Boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fets(String str) {
        super("RSVP");
        Boolean boolValueOf = Boolean.valueOf(str);
        int i = feop.a;
        this.d = boolValueOf;
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.d.booleanValue() ? "TRUE" : "FALSE";
    }
}
