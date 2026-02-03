package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ddak {
    public abstract int a();

    public final boolean b() {
        return a() == 1;
    }

    public final String toString() {
        int iA = a();
        return iA != 1 ? iA != 2 ? iA != 3 ? "DO_NOT_ENFORCE" : "UNKNOWN" : "NOT_SET" : "ENFORCE";
    }
}
