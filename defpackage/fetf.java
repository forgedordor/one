package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fetf extends feno {
    private static final long serialVersionUID = -795956139235258568L;
    private final femr b;

    public fetf(String str) {
        femr femrVar = new femr(fexb.e(str));
        int i = feop.a;
        super("DELEGATED-FROM");
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
