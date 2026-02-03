package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class feug extends feou {
    public static final feug c = new feuf();
    private static final long serialVersionUID = 7446184786984981423L;
    private String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feug() {
        super("CALSCALE");
        fera feraVar = fera.a;
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.d;
    }

    @Override // defpackage.feou
    public void c(String str) {
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feug(feor feorVar) {
        super("CALSCALE", feorVar);
        fera feraVar = fera.a;
        this.d = "GREGORIAN";
    }
}
