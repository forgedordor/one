package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekeu extends ekbn {
    final Object a;
    int b;
    final /* synthetic */ ekfd c;

    public ekeu(ekfd ekfdVar, int i) {
        this.c = ekfdVar;
        this.a = ekfdVar.a[i];
        this.b = i;
    }

    final void a() {
        int i = this.b;
        if (i != -1) {
            ekfd ekfdVar = this.c;
            if (i <= ekfdVar.c && ejwh.a(ekfdVar.a[i], this.a)) {
                return;
            }
        }
        this.b = this.c.b(this.a);
    }

    @Override // defpackage.ekbn, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.ekbn, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return this.c.b[i];
    }

    @Override // defpackage.ekbn, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.b;
        if (i == -1) {
            this.c.put(this.a, obj);
            return null;
        }
        ekfd ekfdVar = this.c;
        Object obj2 = ekfdVar.b[i];
        if (ejwh.a(obj2, obj)) {
            return obj;
        }
        ekfdVar.l(this.b, obj);
        return obj2;
    }
}
