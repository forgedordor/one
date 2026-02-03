package defpackage;

import java.io.DataInput;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgql {
    final fgqj a;
    final String b;
    final int c;

    public fgql(fgqj fgqjVar, String str, int i) {
        this.a = fgqjVar;
        this.b = str;
        this.c = i;
    }

    static fgql c(DataInput dataInput) {
        return new fgql(new fgqj((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) fgqm.a(dataInput)), dataInput.readUTF(), (int) fgqm.a(dataInput));
    }

    public final long a(long j, int i, int i2) {
        fgqj fgqjVar = this.a;
        char c = fgqjVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        fgoi fgoiVar = fgoi.o;
        fgms fgmsVar = fgoiVar.m;
        int i3 = fgqjVar.b;
        long jH = fgoiVar.i.h(fgmsVar.h(j3, i3), 0);
        fgms fgmsVar2 = fgoiVar.i;
        int i4 = fgqjVar.f;
        long jA = fgqjVar.a(fgoiVar, fgmsVar2.e(jH, Math.min(i4, 86399999)));
        if (fgqjVar.d != 0) {
            jA = fgqjVar.c(fgoiVar, jA);
            if (jA <= j3) {
                jA = fgqjVar.c(fgoiVar, fgqjVar.a(fgoiVar, fgoiVar.m.h(fgoiVar.n.e(jA, 1), i3)));
            }
        } else if (jA <= j3) {
            jA = fgqjVar.a(fgoiVar, fgoiVar.n.e(jA, 1));
        }
        return fgoiVar.i.e(fgoiVar.i.h(jA, 0), i4) - j2;
    }

    public final long b(long j, int i, int i2) {
        fgqj fgqjVar = this.a;
        char c = fgqjVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        fgoi fgoiVar = fgoi.o;
        fgms fgmsVar = fgoiVar.m;
        int i3 = fgqjVar.b;
        long jH = fgoiVar.i.h(fgmsVar.h(j3, i3), 0);
        fgms fgmsVar2 = fgoiVar.i;
        int i4 = fgqjVar.f;
        long jB = fgqjVar.b(fgoiVar, fgmsVar2.e(jH, i4));
        if (fgqjVar.d != 0) {
            jB = fgqjVar.c(fgoiVar, jB);
            if (jB >= j3) {
                jB = fgqjVar.c(fgoiVar, fgqjVar.b(fgoiVar, fgoiVar.m.h(fgoiVar.n.e(jB, -1), i3)));
            }
        } else if (jB >= j3) {
            jB = fgqjVar.b(fgoiVar, fgoiVar.n.e(jB, -1));
        }
        return fgoiVar.i.e(fgoiVar.i.h(jB, 0), i4) - j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fgql) {
            fgql fgqlVar = (fgql) obj;
            if (this.c == fgqlVar.c && this.b.equals(fgqlVar.b) && this.a.equals(fgqlVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.b, this.a});
    }

    public final String toString() {
        return this.a.toString() + " named " + this.b + " at " + this.c;
    }
}
