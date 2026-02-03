package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class feuj extends feou {
    public static final feuj c = new feui("PUBLIC");
    public static final feuj d = new feui("PRIVATE");
    public static final feuj e = new feui("CONFIDENTIAL");
    private static final long serialVersionUID = 4939943639175551481L;
    private String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feuj() {
        super("CLASS");
        fera feraVar = fera.a;
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.f;
    }

    @Override // defpackage.feou
    public void c(String str) {
        this.f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feuj(feor feorVar, String str) {
        super("CLASS", feorVar);
        fera feraVar = fera.a;
        this.f = str;
    }
}
