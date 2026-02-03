package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kqh {
    kqj a;
    final /* synthetic */ kqi b;

    public kqh(kqi kqiVar) {
        this.b = kqiVar;
    }

    public final String toString() {
        String str = "[ ";
        if (this.a != null) {
            for (int i = 0; i < 9; i++) {
                str = str + this.a.i[i] + " ";
            }
        }
        return str + "] " + this.a;
    }
}
