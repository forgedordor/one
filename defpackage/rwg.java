package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rwg {
    public static final rwg a = new rwg(rwf.None, 0);
    public static final rwg b = new rwg(rwf.XMidYMid, 1);
    public final rwf c;
    public final int d;

    public rwg(rwf rwfVar, int i) {
        this.c = rwfVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rwg rwgVar = (rwg) obj;
        return this.c == rwgVar.c && this.d == rwgVar.d;
    }
}
