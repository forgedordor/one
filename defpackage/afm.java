package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afm {
    private final String a;
    private int b = 2;
    private int c = 0;
    private int d = 0;
    private int e = 0;

    public afm(String str) {
        lcg.i(str);
        this.a = str;
    }

    public final afn a() {
        if (this.d == 0) {
            lcg.d(this.c == 0, "Cannot set TOKENIZER_TYPE_NONE with an indexing type other than INDEXING_TYPE_NONE.");
        } else {
            lcg.d(this.c != 0, "Cannot set TOKENIZER_TYPE_PLAIN with INDEXING_TYPE_NONE.");
        }
        if (this.e == 1) {
            lcg.d(this.b != 1, "Cannot set JOINABLE_VALUE_TYPE_QUALIFIED_ID with CARDINALITY_REPEATED.");
        }
        return new afn(new ajy(this.a, 1, this.b, null, new ajx(this.c, this.d), null, null, new ajw(this.e), null));
    }

    public final void b(int i) {
        lcg.f(i, 1, 3, "cardinality");
        this.b = i;
    }

    public final void c(int i) {
        lcg.f(i, 0, 2, "indexingType");
        this.c = i;
    }

    public final void d(int i) {
        lcg.f(i, 0, 1, "joinableValueType");
        this.e = i;
    }

    public final void e(int i) {
        lcg.f(i, 0, 3, "tokenizerType");
        this.d = i;
    }
}
