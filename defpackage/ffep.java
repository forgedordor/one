package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffep extends IOException {
    static final feyr a = new feyr() { // from class: ffeo
        @Override // defpackage.feyr
        public final fezh a(ffba ffbaVar) {
            return ffep.a(ffbaVar);
        }
    };

    public ffep(Throwable th) {
        super(th);
    }

    static /* synthetic */ fezh a(ffba ffbaVar) throws ffep {
        try {
            return ffbaVar.b(ffbaVar.c);
        } catch (Error | RuntimeException e) {
            throw new ffep(e);
        }
    }
}
