package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elfj extends Exception {
    private static final long serialVersionUID = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elfj(Exception exc) {
        super(exc);
        exc.getClass();
    }

    @Override // java.lang.Throwable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Exception getCause() {
        Throwable cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }
}
