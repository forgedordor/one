package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bash {
    public static final bash a = new bash(-1);
    private final bars b;

    public bash(long j) {
        this.b = new bars(j);
    }

    public static long a(bash bashVar) {
        if (bashVar == null) {
            return -1L;
        }
        Optional optional = bashVar.b.a;
        if (optional.isPresent()) {
            return ((Long) optional.get()).longValue();
        }
        return -1L;
    }
}
