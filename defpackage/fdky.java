package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdky extends fdkz {
    private final Runnable a;

    public fdky(long j, Runnable runnable) {
        super(j);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    @Override // defpackage.fdkz
    public final String toString() {
        String string = super.toString();
        Runnable runnable = this.a;
        Objects.toString(runnable);
        return string.concat(runnable.toString());
    }
}
