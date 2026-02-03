package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmj extends RuntimeException {
    public final Throwable a;
    public final int b;

    public tmj(int i, Throwable th) {
        super("Fi Account validation failure");
        this.b = i;
        this.a = th;
    }

    public /* synthetic */ tmj(int i) {
        this(i, null);
    }
}
