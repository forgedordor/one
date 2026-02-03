package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbqp extends RuntimeException {
    private static final long serialVersionUID = 1;

    public fbqp() {
        super("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }
}
