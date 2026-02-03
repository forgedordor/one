package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eycx extends Exception {
    public final eycw a;

    public eycx(eycw eycwVar, String str) {
        this(eycwVar, str, null);
    }

    public final boolean a() {
        return this.a.g;
    }

    public eycx(eycw eycwVar, String str, Throwable th) {
        super(str, th);
        this.a = eycwVar;
    }

    public eycx(eycw eycwVar, Throwable th) {
        this(eycwVar, null, th);
    }
}
