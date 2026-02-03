package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fetp extends feno {
    public static final fetp b = new fetp("PARENT");
    public static final fetp c = new fetp("CHILD");
    public static final fetp d = new fetp("SIBLING");
    private static final long serialVersionUID = 5346030888832899016L;
    private final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fetp(String str) {
        super("RELTYPE");
        int i = feop.a;
        this.e = fexb.e(str);
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.e;
    }
}
