package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etj implements eti {
    private final int a = 1;

    @Override // defpackage.eti
    public final int a(int i, int i2) {
        long j = i;
        return fddu.i(i2, (int) fddu.j(j - 1, 0L), (int) fddu.k(1 + j, 2147483647L));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof etj)) {
            return false;
        }
        int i = ((etj) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1;
    }
}
