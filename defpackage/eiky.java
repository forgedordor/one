package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiky implements fbso {
    private final eigp a;

    public eiky(eigp eigpVar) {
        this.a = eigpVar;
    }

    @Override // defpackage.fbso
    public final fbsl a(fbsm fbsmVar, fbrg fbrgVar, fbsn fbsnVar) {
        eikq eikqVar = (eikq) fbrgVar.c(eikr.a);
        eiik eiikVar = eikqVar != null ? eikqVar.a : null;
        eifp eifpVarA = eiikVar != null ? eiikVar.a() : this.a.h("com/google/apps/tiktok/tracing/contrib/grpc/OnDeviceServerPropagation$TracePropagationServerInterceptor", "restoreOrCreateRootTrace", 146, fbsmVar.d().b, eiey.a);
        try {
            eieu eieuVarK = eiiy.k(fbsmVar.d().b);
            try {
                eikv eikvVar = new eikv(fbsnVar.a(new eikw(fbsmVar, eieuVarK), fbrgVar), eiik.b());
                eieuVarK.close();
                eifpVarA.close();
                return eikvVar;
            } finally {
            }
        } finally {
        }
    }
}
