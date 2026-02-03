package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgqj {
    final char a;
    final int b;
    final int c;
    final int d;
    final boolean e;
    final int f;

    public fgqj(char c, int i, int i2, int i3, boolean z, int i4) {
        if (c != 'u' && c != 'w' && c != 's') {
            throw new IllegalArgumentException("Unknown mode: " + c);
        }
        this.a = c;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    private final long d(fgmq fgmqVar, long j) {
        int i = this.c;
        if (i >= 0) {
            return ((fgnp) fgmqVar).k.h(j, i);
        }
        fgnp fgnpVar = (fgnp) fgmqVar;
        return fgnpVar.k.e(fgnpVar.m.e(fgnpVar.k.h(j, 1), 1), i);
    }

    public final long a(fgmq fgmqVar, long j) {
        try {
            return d(fgmqVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                fgnp fgnpVar = (fgnp) fgmqVar;
                if (fgnpVar.n.t(j)) {
                    return d(fgmqVar, j);
                }
                j = fgnpVar.n.e(j, 1);
            }
        }
    }

    public final long b(fgmq fgmqVar, long j) {
        try {
            return d(fgmqVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                fgnp fgnpVar = (fgnp) fgmqVar;
                if (fgnpVar.n.t(j)) {
                    return d(fgmqVar, j);
                }
                j = fgnpVar.n.e(j, -1);
            }
        }
    }

    public final long c(fgmq fgmqVar, long j) {
        fgnp fgnpVar = (fgnp) fgmqVar;
        int iA = this.d - fgnpVar.j.a(j);
        if (iA == 0) {
            return j;
        }
        if (this.e) {
            if (iA < 0) {
                iA += 7;
            }
        } else if (iA > 0) {
            iA -= 7;
        }
        return fgnpVar.j.e(j, iA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fgqj) {
            fgqj fgqjVar = (fgqj) obj;
            if (this.a == fgqjVar.a && this.b == fgqjVar.b && this.c == fgqjVar.c && this.d == fgqjVar.d && this.e == fgqjVar.e && this.f == fgqjVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Character.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f)});
    }

    public final String toString() {
        return "[OfYear]\nMode: " + this.a + "\nMonthOfYear: " + this.b + "\nDayOfMonth: " + this.c + "\nDayOfWeek: " + this.d + "\nAdvanceDayOfWeek: " + this.e + "\nMillisOfDay: " + this.f + "\n";
    }
}
