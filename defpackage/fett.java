package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fett extends feno {
    public static final fett b = new fett("SERVER");
    public static final fett c = new fett("CLIENT");
    public static final fett d = new fett("NONE");
    private final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fett(String str) {
        super("SCHEDULE-AGENT");
        int i = feop.a;
        this.e = fexb.e(str);
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.e;
    }
}
