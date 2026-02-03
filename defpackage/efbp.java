package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbp extends efde {
    public String a;
    public String b;
    public ekgp c;

    @Override // defpackage.efde
    public final void a(String str) {
        if (str == null) {
            throw new NullPointerException("Null subType");
        }
        this.b = str;
    }

    @Override // defpackage.efde
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.a = str;
    }
}
