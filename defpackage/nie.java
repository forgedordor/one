package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nie {
    public final mcm a;
    public final int[] b;

    public nie(mcm mcmVar, int... iArr) {
        this(mcmVar, iArr, null);
    }

    public nie(mcm mcmVar, int[] iArr, byte[] bArr) {
        if (iArr.length == 0) {
            mff.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = mcmVar;
        this.b = iArr;
    }
}
