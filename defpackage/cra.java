package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cra {
    public final Object a;
    public final String b;

    public cra(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    final String a() {
        return "[" + this.b + ", " + crd.e(this.a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
