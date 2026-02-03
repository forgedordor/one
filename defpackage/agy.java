package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agy extends ajn {
    final String a;
    final int b;
    private final String c;
    private final String d;
    private final String e;

    public agy(String str, String str2, String str3, aew aewVar) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        lcg.b(!aewVar.b(), "failedResult was actually successful");
        this.a = aewVar.c;
        this.b = aewVar.a;
    }

    public final String toString() {
        return "MigrationFailure { schemaType: " + this.e + ", namespace: " + this.c + ", documentId: " + this.d + ", appSearchResult: " + new aew(this.b, null, this.a).toString() + "}";
    }
}
