package defpackage;

import android.os.SystemClock;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drgq extends fbnm {
    public final Object a = new Object();
    public final dzrm b;
    public boolean c;
    public int d;
    public int e;

    public drgq(dzrm dzrmVar) {
        this.b = dzrmVar;
    }

    @Override // defpackage.fbnm
    public final void a() {
        synchronized (this.a) {
            if (!this.c) {
                dzrm dzrmVar = this.b;
                dzrmVar.b = SystemClock.elapsedRealtime() - dzrmVar.a;
            }
        }
    }

    @Override // defpackage.fbtg
    public final void b(long j) {
        synchronized (this.a) {
            this.d += (int) j;
        }
    }

    @Override // defpackage.fbtg
    public final void c(long j) {
        synchronized (this.a) {
            this.e += (int) j;
        }
    }

    @Override // defpackage.fbnm
    public final void d(fbmw fbmwVar) {
        synchronized (this.a) {
            dzrm dzrmVar = this.b;
            SocketAddress socketAddress = (SocketAddress) fbmwVar.a(fbpb.a);
            if (!(socketAddress instanceof InetSocketAddress)) {
                if (socketAddress instanceof fbyf) {
                    dzrmVar.v = 2;
                } else if (socketAddress instanceof fbty) {
                    dzrmVar.v = 3;
                }
            }
        }
    }
}
