package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekdg extends ekbn {
    final /* synthetic */ ekdi a;
    private final Object b;
    private int c;

    public ekdg(ekdi ekdiVar, int i) {
        this.a = ekdiVar;
        this.b = ekdiVar.g(i);
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            ekdi ekdiVar = this.a;
            if (i < ekdiVar.size() && ejwh.a(this.b, ekdiVar.g(this.c))) {
                return;
            }
        }
        this.c = this.a.f(this.b);
    }

    @Override // defpackage.ekbn, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.ekbn, java.util.Map.Entry
    public final Object getValue() {
        ekdi ekdiVar = this.a;
        Map mapN = ekdiVar.n();
        if (mapN != null) {
            return mapN.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return ekdiVar.j(i);
    }

    @Override // defpackage.ekbn, java.util.Map.Entry
    public final Object setValue(Object obj) {
        ekdi ekdiVar = this.a;
        Map mapN = ekdiVar.n();
        if (mapN != null) {
            return mapN.put(this.b, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            ekdiVar.put(this.b, obj);
            return null;
        }
        Object objJ = ekdiVar.j(i);
        ekdiVar.t(this.c, obj);
        return objJ;
    }
}
