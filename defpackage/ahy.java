package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahy extends Exception {
    public final int a;

    public ahy(int i, String str) {
        this(i, str, null);
    }

    public ahy(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
