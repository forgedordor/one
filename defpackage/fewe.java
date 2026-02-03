package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fewe extends feou {
    public static final fewe c = new fewd("OPAQUE");
    public static final fewe d = new fewd("TRANSPARENT");
    private static final long serialVersionUID = 3801479657311785518L;
    private String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fewe() {
        super("TRANSP");
        fera feraVar = fera.a;
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.e;
    }

    @Override // defpackage.feou
    public void c(String str) {
        this.e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fewe(feor feorVar, String str) {
        super("TRANSP", feorVar);
        fera feraVar = fera.a;
        this.e = str;
    }
}
