package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cav {
    public final bxk c;

    public cav(bxk bxkVar) {
        lcg.i(bxkVar);
        this.c = bxkVar;
    }

    static caq b(bxk bxkVar, int i, Throwable th) {
        lcg.b(i != 0, "An error type is required.");
        return new caq(bxkVar, i, th);
    }
}
