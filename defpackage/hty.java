package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hty {
    public final int b;
    public final int c;

    public hty(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    protected abstract void a(hud hudVar, hlw hlwVar, hre hreVar, hqs hqsVar, htz htzVar);

    protected hlv b(hud hudVar) {
        return null;
    }

    public final String toString() {
        int i = fdcj.a;
        String strC = new fdbi(getClass()).c();
        return strC == null ? "" : strC;
    }

    public /* synthetic */ hty(int i, int i2, int i3) {
        this(1 == (i3 & 1) ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
