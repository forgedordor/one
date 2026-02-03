package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckxj {
    private final ckmg a;

    public ckxj(ckmg ckmgVar) {
        this.a = ckmgVar;
    }

    public final ckmb a(String str, char c) {
        int iIndexOf = str.indexOf(8202, 1);
        int iIndexOf2 = str.indexOf(c) + 1;
        int iIndexOf3 = str.indexOf(c, iIndexOf2);
        if (iIndexOf3 != -1 && iIndexOf3 < iIndexOf) {
            return this.a.b(str.substring(iIndexOf2, iIndexOf3));
        }
        int iLastIndexOf = str.lastIndexOf(8202, str.length() - 2);
        int iLastIndexOf2 = str.lastIndexOf(c);
        int iLastIndexOf3 = str.lastIndexOf(c, iLastIndexOf2 - 1);
        if (iLastIndexOf3 == -1 || iLastIndexOf >= iLastIndexOf3) {
            return ckmg.a(ckml.REACTION_TYPE_UNSPECIFIED);
        }
        return this.a.b(str.substring(iLastIndexOf3 + 1, iLastIndexOf2));
    }
}
