package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyio extends eyiq {
    private final Throwable a;

    public eyio(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.eyiq
    public final Object a() throws ExecutionException {
        throw new ExecutionException(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eyio) {
            return this.a.equals(((eyio) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Produced[failed with " + this.a.getClass().getCanonicalName() + "]";
    }
}
