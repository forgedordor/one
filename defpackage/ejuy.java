package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejuy extends ejuz {
    public static final ejvf a = new ejuy();

    private ejuy() {
        super("CharMatcher.javaIsoControl()");
    }

    @Override // defpackage.ejvf
    public final boolean c(char c) {
        if (c > 31) {
            return c >= 127 && c <= 159;
        }
        return true;
    }
}
