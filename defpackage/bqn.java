package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqn extends bqo {
    static final bqo a = new bqn(null);
    public final Object b;

    public bqn(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.bqo, java.util.concurrent.Future
    public final Object get() {
        return this.b;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.b + "]]";
    }
}
