package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erfw implements erga {
    public final erwn a;
    public final ermh b;

    private erfw(ermh ermhVar, erwn erwnVar) {
        this.b = ermhVar;
        this.a = erwnVar;
    }

    public static erfw a(ermh ermhVar) {
        return new erfw(ermhVar, ergh.a(ermhVar.b));
    }

    public static erfw b(ermh ermhVar) {
        return new erfw(ermhVar, ergh.b(ermhVar.b));
    }
}
