package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fddj implements Iterable, fdcn {
    public final char a;
    public final char b;
    private final int c = 1;

    public fddj(char c, char c2) {
        this.a = c;
        this.b = (char) fczg.a(c, c2, 1);
    }

    public boolean a() {
        return fdbq.a(this.a, this.b) > 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof fddj) {
            if (a() && ((fddj) obj).a()) {
                return true;
            }
            fddj fddjVar = (fddj) obj;
            if (this.a != fddjVar.a || this.b != fddjVar.b) {
                return false;
            }
            int i = fddjVar.c;
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (a()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + 1;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new fddk(this.a, this.b);
    }

    public String toString() {
        return this.a + ".." + this.b + " step 1";
    }
}
