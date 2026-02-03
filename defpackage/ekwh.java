package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekwh {
    public final int a;
    public final eksu b;

    protected ekwh(eksu eksuVar, int i) {
        if (eksuVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(a.g(i, "invalid index: "));
        }
        this.a = i;
        this.b = eksuVar;
    }

    public abstract void a(ekwi ekwiVar, Object obj);
}
