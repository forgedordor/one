package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngo {
    public static final ngo a = new ngo(new mcm[0]);
    public final int b;
    public final ekgb c;
    private int d;

    static {
        mgb.O(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ngo(mcm... mcmVarArr) {
        this.c = ekgb.p(mcmVarArr);
        this.b = mcmVarArr.length;
        int i = 0;
        while (i < ((ekoe) this.c).c) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                ekgb ekgbVar = this.c;
                if (i3 < ((ekoe) ekgbVar).c) {
                    if (((mcm) ekgbVar.get(i)).equals(this.c.get(i3))) {
                        mff.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i3++;
                }
            }
            i = i2;
        }
    }

    public final int a(mcm mcmVar) {
        int iIndexOf = this.c.indexOf(mcmVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final mcm b(int i) {
        return (mcm) this.c.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ngo ngoVar = (ngo) obj;
            if (this.b == ngoVar.b && ekjz.h(this.c, ngoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.c.hashCode();
        this.d = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.c.toString();
    }
}
