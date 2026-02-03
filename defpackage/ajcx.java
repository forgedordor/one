package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajcx implements fdap {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    public ajcx(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ajcn ajcnVar;
        ajcq ajcqVar = (ajcq) obj;
        ajcqVar.copyOnWrite();
        ajct ajctVar = (ajct) ajcqVar.instance;
        ajct ajctVar2 = ajct.a;
        ajctVar.b |= 1;
        int i = this.a;
        ajctVar.d = i;
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ajct) ajcqVar.instance).c));
        int i2 = this.b;
        ajcn ajcnVar2 = (ajcn) Map.EL.getOrDefault(mapUnmodifiableMap, Integer.valueOf(i2), ajcn.a);
        ajcp ajcpVar = (ajcp) DesugarCollections.unmodifiableMap(ajcnVar2.c).get(Integer.valueOf(i));
        if (ajcpVar == null) {
            ajcl ajclVar = (ajcl) ajcnVar2.toBuilder();
            ajclVar.copyOnWrite();
            ((ajcn) ajclVar.instance).a().clear();
            ajcnVar = (ajcn) ajclVar.build();
        } else {
            ajcl ajclVar2 = (ajcl) ajcnVar2.toBuilder();
            ajclVar2.copyOnWrite();
            ((ajcn) ajclVar2.instance).a().clear();
            ajclVar2.a(i, ajcpVar);
            ajcnVar = (ajcn) ajclVar2.build();
        }
        ajcqVar.a(i2, ajcnVar);
        return fctx.a;
    }
}
