package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtyy extends dtzg {
    public ejwi a = ejud.a;
    private String b;

    @Override // defpackage.dtzg
    public final dtzh a() {
        String str = this.b;
        if (str != null) {
            return new dtyz(str, this.a);
        }
        throw new IllegalStateException("Missing required properties: url");
    }

    @Override // defpackage.dtzg
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.b = str;
    }
}
