package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwoi extends dwro {
    private String a;

    @Override // defpackage.dwro
    public final dwrp a() {
        String str = this.a;
        if (str != null) {
            return new dwoj(str);
        }
        throw new IllegalStateException("Missing required properties: url");
    }

    @Override // defpackage.dwro
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.a = str;
    }
}
