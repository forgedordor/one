package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class como extends cona {
    private String a;

    @Override // defpackage.cona
    public final conb a() {
        String str = this.a;
        if (str != null) {
            return new comp(str);
        }
        throw new IllegalStateException("Missing required properties: downloadId");
    }

    @Override // defpackage.cona
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null downloadId");
        }
        this.a = str;
    }
}
