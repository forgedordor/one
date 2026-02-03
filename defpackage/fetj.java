package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fetj extends feno {
    public static final fetj b = new fetj("FREE");
    public static final fetj c = new fetj("BUSY");
    public static final fetj d = new fetj("BUSY-UNAVAILABLE");
    public static final fetj e = new fetj("BUSY-TENTATIVE");
    private static final long serialVersionUID = -2217689716824679375L;
    private final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fetj(String str) {
        super("FBTYPE");
        int i = feop.a;
        this.f = fexb.e(str);
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.f;
    }
}
