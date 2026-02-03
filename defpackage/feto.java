package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feto extends feno {
    public static final feto b = new feto("THISANDPRIOR");
    public static final feto c = new feto("THISANDFUTURE");
    private static final long serialVersionUID = -3057531444558393776L;
    private final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feto(String str) {
        super("RANGE");
        int i = feop.a;
        String strE = fexb.e(str);
        this.d = strE;
        if (fewr.b("ical4j.compatibility.notes") || "THISANDPRIOR".equals(strE) || "THISANDFUTURE".equals(strE)) {
            return;
        }
        throw new IllegalArgumentException("Invalid value [" + strE + "]");
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.d;
    }
}
