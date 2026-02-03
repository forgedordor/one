package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esuw implements eyif {
    public static esue a(Map map, final eigp eigpVar) {
        ekgi ekgiVar = new ekgi();
        for (final Map.Entry entry : map.entrySet()) {
            ekgiVar.i((String) entry.getKey(), new fcsu() { // from class: eiks
                @Override // defpackage.fcsu
                public final Object b() {
                    Map.Entry entry2 = entry;
                    eifm eifmVarH = eigpVar.h("com/google/apps/tiktok/tracing/contrib/grpc/OnDeviceServerPropagation", "traceServiceConstruction", 103, "Create gRPC Service Impl ".concat(String.valueOf((String) entry2.getKey())), eiey.a);
                    try {
                        fbmx fbmxVar = (fbmx) ((fcsu) entry2.getValue()).b();
                        eifmVarH.close();
                        return fbmxVar;
                    } finally {
                    }
                }
            });
        }
        return new esue(ekgiVar.c());
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
