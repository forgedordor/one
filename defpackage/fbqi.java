package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fbqi {
    public static final fbmv a = new fbmv("internal:health-checking-config");
    public static final fbpw b = new fbpw("internal:health-check-consumer-listener", null);
    public static final fbpw c = new fbpw("internal:disable-subchannel-reconnect", Boolean.FALSE);
    public static final fbmv d = new fbmv("internal:has-health-check-producer-listener");
    public static final fbmv e = new fbmv("io.grpc.IS_PETIOLE_POLICY");

    public Status a(fbqe fbqeVar) {
        throw null;
    }

    public abstract void b(Status status);

    public abstract void d();

    public void c() {
    }
}
