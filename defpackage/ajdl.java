package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajdl implements fdap {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    public ajdl(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ajcq ajcqVar = (ajcq) obj;
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ajct) ajcqVar.instance).c));
        int i = this.a;
        ajcn ajcnVar = (ajcn) Map.EL.getOrDefault(mapUnmodifiableMap, Integer.valueOf(i), ajcn.a);
        if (ajcnVar.e == 0) {
            ajcl ajclVar = (ajcl) ajcnVar.toBuilder();
            int i2 = this.b;
            ajclVar.copyOnWrite();
            ajcn ajcnVar2 = (ajcn) ajclVar.instance;
            ajcnVar2.b |= 2;
            ajcnVar2.e = i2;
            ajcqVar.a(i, (ajcn) ajclVar.build());
        }
        return fctx.a;
    }
}
