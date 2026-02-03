package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fetn extends feno {
    public static final fetn b = new fetn("NEEDS-ACTION");
    public static final fetn c = new fetn("ACCEPTED");
    public static final fetn d = new fetn("DECLINED");
    public static final fetn e = new fetn("TENTATIVE");
    public static final fetn f = new fetn("DELEGATED");
    public static final fetn g = new fetn("COMPLETED");
    public static final fetn h = new fetn("IN-PROCESS");
    private static final long serialVersionUID = -7856347127343842441L;
    private final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fetn(String str) {
        super("PARTSTAT");
        int i = feop.a;
        this.i = fexb.e(str);
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.i;
    }
}
