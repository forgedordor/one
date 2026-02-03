package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejuq extends ejuz {
    public static final ejvf a = new ejuq();

    public ejuq() {
        super("CharMatcher.ascii()");
    }

    @Override // defpackage.ejvf
    public final boolean c(char c) {
        return c <= 127;
    }
}
