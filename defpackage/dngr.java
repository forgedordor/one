package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngr<K, V> implements fdap<K, V> {
    private final fdap a;
    private Object b;
    private Object c;

    public dngr(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.fdap
    public final V invoke(K k) {
        if (!fdbq.f(this.b, k)) {
            this.b = k;
            this.c = null;
        }
        V v = (V) this.c;
        if (v != null) {
            return v;
        }
        V v2 = (V) this.a.invoke(k);
        this.c = v2;
        return v2;
    }
}
