package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class czbb {
    public final int c;

    public czbb(int i) {
        this.c = i;
    }

    public abstract int a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof czbb) && this.c == ((czbb) obj).c;
    }

    public int hashCode() {
        throw null;
    }
}
