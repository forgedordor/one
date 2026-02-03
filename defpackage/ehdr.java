package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehdr {
    public static final ehds a(final boolean z) {
        return new ehds(new fdae() { // from class: ehdp
            @Override // defpackage.fdae
            public final Object invoke() {
                return Boolean.valueOf(z);
            }
        }, 2);
    }

    public static final ehds b(final double d) {
        return new ehds(new fdae() { // from class: ehdo
            @Override // defpackage.fdae
            public final Object invoke() {
                return Double.valueOf(d);
            }
        }, 3);
    }

    public static final ehds c(final long j) {
        return new ehds(new fdae() { // from class: ehdn
            @Override // defpackage.fdae
            public final Object invoke() {
                return Long.valueOf(j);
            }
        }, 1);
    }

    public static final ehds d(fdae fdaeVar, evuh evuhVar) {
        evuhVar.getClass();
        return new ehds(fdaeVar, 6, evuhVar);
    }

    public static final ehds e(final String str) {
        return new ehds(new fdae() { // from class: ehdq
            @Override // defpackage.fdae
            public final Object invoke() {
                return str;
            }
        }, 4);
    }
}
