package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jai extends fdbr implements fdap {
    final /* synthetic */ jaj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jai(jaj jajVar) {
        super(1);
        this.a = jajVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jak jakVar = (jak) obj;
        if (jakVar.n()) {
            if (jakVar.g().b) {
                jakVar.k();
            }
            Map map = jakVar.g().h;
            jaj jajVar = this.a;
            for (Map.Entry entry : map.entrySet()) {
                jajVar.d((itz) entry.getKey(), ((Number) entry.getValue()).intValue(), jakVar.i());
            }
            jer jerVar = jakVar.i().x;
            jerVar.getClass();
            while (!fdbq.f(jerVar, jajVar.a.i())) {
                for (itz itzVar : jajVar.c(jerVar).keySet()) {
                    jajVar.d(itzVar, jajVar.a(jerVar, itzVar), jerVar);
                }
                jerVar = jerVar.x;
                jerVar.getClass();
            }
        }
        return fctx.a;
    }
}
