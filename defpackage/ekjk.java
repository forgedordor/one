package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekjk extends ekbn {
    final Object a;
    Object b;
    ekjk c;
    ekjk d;
    ekjk e;
    ekjk f;

    public ekjk(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.ekbn, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.ekbn, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // defpackage.ekbn, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }
}
