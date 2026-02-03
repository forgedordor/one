package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dqwr {
    private final dqpo a;
    private final boolean b;

    protected dqwr(dqpo dqpoVar, boolean z) {
        this.a = dqpoVar;
        this.b = z;
    }

    public final String a() {
        return this.a.toString().concat(true != this.b ? " DESC" : " ASC");
    }
}
