package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eleq extends eles {
    final /* synthetic */ char a;

    public eleq(char c) {
        this.a = c;
    }

    @Override // defpackage.eles
    public final eler a(String str) {
        int iIndexOf = str.indexOf(this.a, 0);
        if (iIndexOf >= 0) {
            return new eler(str, iIndexOf, 1, Math.max(1, 1) + iIndexOf);
        }
        return null;
    }

    public final String toString() {
        return "first('" + this.a + "')";
    }
}
