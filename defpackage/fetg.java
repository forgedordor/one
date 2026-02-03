package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fetg extends feno {
    private static final long serialVersionUID = 567577003350648021L;
    private final femr b;

    public fetg(String str) {
        femr femrVar = new femr(fexb.e(str));
        int i = feop.a;
        super("DELEGATED-TO");
        this.b = femrVar;
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.b.toString();
    }

    @Override // defpackage.feno
    protected final boolean b() {
        return false;
    }
}
