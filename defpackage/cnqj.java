package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnqj implements Comparable {
    private final Optional a;

    public cnqj() {
        this.a = Optional.empty();
    }

    @Deprecated
    public static cnqj b(long j) {
        return j == -1 ? new cnqj() : new cnqj(j);
    }

    public final long a() {
        return ((Long) this.a.get()).longValue();
    }

    public final boolean c() {
        return !d();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Optional optional = this.a;
        cnqj cnqjVar = (cnqj) obj;
        if (optional.isPresent()) {
            Optional optional2 = cnqjVar.a;
            if (optional2.isPresent()) {
                return ((Long) optional.get()).compareTo((Long) optional2.get());
            }
        }
        if (optional.isPresent() == cnqjVar.a.isPresent()) {
            return 0;
        }
        return !optional.isPresent() ? -1 : 1;
    }

    public final boolean d() {
        Optional optional = this.a;
        return optional.isEmpty() || ((Long) optional.get()).longValue() < 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof cnqj)) {
            return this.a.equals(((cnqj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "threadId=".concat(this.a.toString());
    }

    public cnqj(long j) {
        this.a = Optional.of(Long.valueOf(j));
    }
}
