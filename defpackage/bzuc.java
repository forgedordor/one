package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzuc extends Exception {
    public final bzud a;
    public final Integer b;

    public bzuc(bzud bzudVar) {
        super(bzudVar.i);
        this.a = bzudVar;
        this.b = null;
    }

    public bzuc(bzud bzudVar, int i) {
        super(bzudVar.i);
        this.b = Integer.valueOf(i);
        this.a = bzudVar;
    }
}
