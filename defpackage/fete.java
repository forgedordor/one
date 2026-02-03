package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fete extends feno {
    public static final fete b = new fete("INDIVIDUAL");
    public static final fete c = new fete("GROUP");
    public static final fete d = new fete("RESOURCE");
    public static final fete e = new fete("ROOM");
    public static final fete f = new fete("UNKNOWN");
    private static final long serialVersionUID = -3134064324693983052L;
    private final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fete(String str) {
        super("CUTYPE");
        int i = feop.a;
        this.g = fexb.e(str);
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.g;
    }
}
