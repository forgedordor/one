package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdds extends fcvz {
    private boolean a = true;
    private long b = -4611686018427387903L;

    @Override // defpackage.fcvz
    public final long a() {
        long j = this.b;
        if (j != 4611686018427387903L) {
            this.b = 1 + j;
            return j;
        }
        if (!this.a) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a;
    }
}
