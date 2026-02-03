package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekev extends ekbn {
    final ekfd a;
    final Object b;
    int c;

    public ekev(ekfd ekfdVar, int i) {
        this.a = ekfdVar;
        this.b = ekfdVar.b[i];
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            ekfd ekfdVar = this.a;
            if (i <= ekfdVar.c && ejwh.a(this.b, ekfdVar.b[i])) {
                return;
            }
        }
        this.c = this.a.d(this.b);
    }

    @Override // defpackage.ekbn, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.ekbn, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return this.a.a[i];
    }

    @Override // defpackage.ekbn, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.c;
        if (i == -1) {
            this.a.j(this.b, obj);
            return null;
        }
        ekfd ekfdVar = this.a;
        Object obj2 = ekfdVar.a[i];
        if (ejwh.a(obj2, obj)) {
            return obj;
        }
        ekfdVar.k(this.c, obj);
        return obj2;
    }
}
