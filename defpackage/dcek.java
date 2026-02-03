package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcek extends dcel {
    private final Callable e;

    public dcek(Callable callable) {
        super(false, null, null);
        this.e = callable;
    }

    @Override // defpackage.dcel
    public final String a() {
        try {
            return (String) this.e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
