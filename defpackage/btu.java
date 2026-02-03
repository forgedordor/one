package defpackage;

import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btu extends bjz {
    final ListenableFuture a;
    kog o;
    public bjz p;
    public bty q;

    public btu(Size size, int i) {
        super(size, i);
        this.a = kol.a(new koi() { // from class: btt
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                btu btuVar = this.a;
                btuVar.o = kogVar;
                return "SettableFuture hashCode: " + btuVar.hashCode();
            }
        });
    }

    @Override // defpackage.bjz
    protected final ListenableFuture a() {
        return this.a;
    }

    @Override // defpackage.bjz
    public final void d() {
        super.d();
        box.c(new Runnable() { // from class: btr
            @Override // java.lang.Runnable
            public final void run() {
                btu btuVar = this.a;
                bty btyVar = btuVar.q;
                if (btyVar != null) {
                    btyVar.e();
                }
                if (btuVar.p == null) {
                    btuVar.o.d();
                }
            }
        });
    }

    public final boolean i(final bjz bjzVar, Runnable runnable) {
        box.b();
        lcg.i(bjzVar);
        bjz bjzVar2 = this.p;
        if (bjzVar2 == bjzVar) {
            return false;
        }
        lcg.d(bjzVar2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
        Size size = this.l;
        Size size2 = bjzVar.l;
        lcg.b(size.equals(size2), String.format("The provider's size(%s) must match the parent(%s)", size, size2));
        int i = this.m;
        int i2 = bjzVar.m;
        lcg.b(i == i2, String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(i), Integer.valueOf(i2)));
        lcg.d(!h(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
        this.p = bjzVar;
        bqk.j(bjzVar.b(), this.o);
        bjzVar.f();
        ListenableFuture listenableFutureC = c();
        bjzVar.getClass();
        listenableFutureC.b(new Runnable() { // from class: bts
            @Override // java.lang.Runnable
            public final void run() {
                bjzVar.e();
            }
        }, bpc.a());
        bqk.d(bjzVar.k).b(runnable, bpn.a());
        return true;
    }
}
