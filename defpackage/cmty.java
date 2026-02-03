package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmty extends Exception {
    private static final long serialVersionUID = 1;

    public cmty() {
    }

    public cmty(String str) {
        super(str);
    }

    public cmty(Throwable th) {
        super("caught exception in sending ", th);
    }
}
