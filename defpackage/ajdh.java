package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajdh implements fdap {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    public ajdh(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ajcq ajcqVar = (ajcq) obj;
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ajct) ajcqVar.instance).c));
        int i = this.a;
        ajcn ajcnVar = (ajcn) Map.EL.getOrDefault(mapUnmodifiableMap, Integer.valueOf(i), ajcn.a);
        java.util.Map mapUnmodifiableMap2 = DesugarCollections.unmodifiableMap(ajcnVar.c);
        int i2 = this.b;
        ajcp ajcpVar = (ajcp) Map.EL.getOrDefault(mapUnmodifiableMap2, Integer.valueOf(i2), ajcp.a);
        ajcl ajclVar = (ajcl) ajcnVar.toBuilder();
        ajco ajcoVar = (ajco) ajcpVar.toBuilder();
        int i3 = ajcpVar.i + 1;
        ajcoVar.copyOnWrite();
        ajcp ajcpVar2 = (ajcp) ajcoVar.instance;
        ajcpVar2.b |= 64;
        ajcpVar2.i = i3;
        ajclVar.a(i2, (ajcp) ajcoVar.build());
        ajcqVar.a(i, (ajcn) ajclVar.build());
        return fctx.a;
    }
}
