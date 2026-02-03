package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgow extends fgna implements Serializable {
    public static final fgna a = new fgow();
    private static final long serialVersionUID = 2656707858124633367L;

    private fgow() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.fgna
    public final long a(long j, int i) {
        return fgot.b(j, i);
    }

    @Override // defpackage.fgna
    public final long b(long j, long j2) {
        return fgot.b(j, j2);
    }

    @Override // defpackage.fgna
    public final long c() {
        return 1L;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long jC = ((fgna) obj).c();
        if (jC == 1) {
            return 0;
        }
        return jC > 1 ? -1 : 1;
    }

    @Override // defpackage.fgna
    public final fgnc d() {
        return fgnc.l;
    }

    @Override // defpackage.fgna
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fgow)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.fgna
    public final boolean f() {
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "DurationField[millis]";
    }
}
