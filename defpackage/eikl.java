package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eikl implements rti {
    private final rti a;
    private final eigp b;

    public eikl(rti rtiVar, eigp eigpVar) {
        this.a = rtiVar;
        this.b = eigpVar;
    }

    @Override // defpackage.rti
    public final boolean a(rhs rhsVar, Object obj, rua ruaVar, boolean z) {
        if (eidc.v()) {
            this.a.a(rhsVar, obj, ruaVar, z);
            return true;
        }
        eieh eiehVarB = this.b.b("com/google/apps/tiktok/tracing/contrib/glide/TracedRequestListener", "onLoadFailed", 45, eikl.class, "onLoadFailed");
        try {
            this.a.a(rhsVar, obj, ruaVar, z);
            eiehVarB.close();
            return true;
        } finally {
        }
    }

    @Override // defpackage.rti
    public final boolean b(Object obj, Object obj2, rua ruaVar, reb rebVar, boolean z) {
        if (eidc.v()) {
            this.a.b(obj, obj2, ruaVar, rebVar, z);
            return false;
        }
        eieh eiehVarB = this.b.b("com/google/apps/tiktok/tracing/contrib/glide/TracedRequestListener", "onResourceReady", 58, eikl.class, "onResourceReady");
        try {
            this.a.b(obj, obj2, ruaVar, rebVar, z);
            eiehVarB.close();
            return false;
        } finally {
        }
    }
}
