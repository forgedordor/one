package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fea {
    public static final kel a = new fdz(kek.a, 0, 0);

    public static final kfm a(kfp kfpVar, juo juoVar) {
        kfm kfmVarA = kfpVar.a(juoVar);
        juo juoVar2 = kfmVarA.a;
        int iA = juoVar.a();
        int iA2 = juoVar2.a();
        int iMin = Math.min(iA, 100);
        for (int i = 0; i < iMin; i++) {
            b(kfmVarA.b.a(i), iA2, i);
        }
        kel kelVar = kfmVarA.b;
        b(kelVar.a(iA), iA2, iA);
        int iMin2 = Math.min(iA2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            c(kelVar.b(i2), iA, i2);
        }
        c(kelVar.b(iA2), iA, iA2);
        return new kfm(juoVar2, new fdz(kelVar, juoVar.a(), juoVar2.a()));
    }

    public static final void b(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            ebs.d("OffsetMapping.originalToTransformed returned invalid mapping: " + i3 + " -> " + i + " is not in range of transformed text [0, " + i2 + ']');
        }
    }

    public static final void c(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            ebs.d("OffsetMapping.transformedToOriginal returned invalid mapping: " + i3 + " -> " + i + " is not in range of original text [0, " + i2 + ']');
        }
    }
}
