package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class obs implements oag {
    public static final String a = ocw.a;
    public final oag b;

    public obs(oag oagVar) {
        this.b = oagVar;
    }

    @Override // defpackage.oag, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
