package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fevz extends feou {
    public static final fevz c = new fevy("TENTATIVE");
    public static final fevz d = new fevy("CONFIRMED");
    public static final fevz e = new fevy("CANCELLED");
    public static final fevz f = new fevy("NEEDS-ACTION");
    public static final fevz g = new fevy("COMPLETED");
    public static final fevz h = new fevy("IN-PROCESS");
    public static final fevz i = new fevy("CANCELLED");
    public static final fevz j = new fevy("DRAFT");
    public static final fevz k = new fevy("FINAL");
    public static final fevz l = new fevy("CANCELLED");
    private static final long serialVersionUID = 7401102230299289898L;
    private String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fevz() {
        super("STATUS");
        fera feraVar = fera.a;
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.m;
    }

    @Override // defpackage.feou
    public void c(String str) {
        this.m = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fevz(feor feorVar, String str) {
        super("STATUS", feorVar);
        fera feraVar = fera.a;
        this.m = str;
    }
}
