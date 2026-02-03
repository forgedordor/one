package defpackage;

import java.net.InetSocketAddress;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbxn extends fboq {
    public ScheduledExecutorService a;
    public final CronetEngine b;
    public final fcmt c = fcmu.a;
    public int d = 4194304;
    public boolean e;
    public int f;
    public boolean g;
    public int h;
    private final fchf i;

    private fbxn(String str, int i, CronetEngine cronetEngine) {
        this.i = new fchf(InetSocketAddress.createUnresolved(str, i), fcdy.d(str, i), new fbxj(this));
        this.b = cronetEngine;
    }

    public static fbxn m(String str, int i, CronetEngine cronetEngine) {
        cronetEngine.getClass();
        return new fbxn(str, i, cronetEngine);
    }

    @Override // defpackage.fboq
    protected final fbqo b() {
        return this.i;
    }

    public final void n(int i) {
        this.e = true;
        this.f = i;
    }
}
