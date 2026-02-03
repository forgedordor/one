package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class extq extends extv {
    public final long a;

    public extq(long j) {
        this.a = j;
    }

    @Override // defpackage.extv
    protected final int a() {
        return c(this.a >= 0 ? (byte) 0 : (byte) 32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        extv extvVar = (extv) obj;
        return a() != extvVar.a() ? a() - extvVar.a() : Long.compare(Math.abs(this.a), Math.abs(((extq) extvVar).a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((extq) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
