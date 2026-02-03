package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxzu {
    public dxzh a;
    public dxzh b;
    public Object c;
    private final dxze d;

    public dxzu(dxze dxzeVar) {
        this.d = dxzeVar;
    }

    public static ejwi a(dxzf dxzfVar) {
        dxzc dxzcVar = dxzfVar.a;
        return (dxzcVar == null || !dxzcVar.b().g()) ? ejud.a : dxzcVar.b();
    }

    public final void b(dxzh dxzhVar, Object obj) {
        if (obj == null || dxzhVar == null) {
            return;
        }
        dxzhVar.a(obj).a(this.d);
    }

    public final void c(dxzh dxzhVar, Object obj) {
        if (obj == null || dxzhVar == null) {
            return;
        }
        dxzhVar.a(obj).b(this.d);
    }
}
