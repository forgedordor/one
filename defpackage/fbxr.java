package defpackage;

import android.util.Log;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbxr extends fceb {
    public static final /* synthetic */ int i = 0;
    public final Object a;
    public final Collection b;
    public boolean c;
    public boolean d;
    public Status e;
    public boolean f;
    public boolean g;
    final /* synthetic */ fbxs h;
    private int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbxr(fbxs fbxsVar, int i2, fcmm fcmmVar, Object obj, fcmu fcmuVar) {
        super(i2, fcmmVar, fcmuVar);
        this.h = fbxsVar;
        this.b = new ArrayList();
        this.d = false;
        this.a = obj;
    }

    static /* bridge */ /* synthetic */ void f(fbxr fbxrVar, ByteBuffer byteBuffer) {
        fbxrVar.u += byteBuffer.remaining();
        fcix fcixVar = fcjb.a;
        super.o(new fcja(byteBuffer), false);
    }

    @Override // defpackage.fchn
    public final void a(int i2) {
        fbxs fbxsVar = this.h;
        fbxsVar.k.getClass();
        int i3 = this.u - i2;
        this.u = i3;
        if (i3 != 0 || this.f) {
            return;
        }
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "BidirectionalStream.read");
        }
        fbxsVar.k.read(ByteBuffer.allocateDirect(4096));
    }

    @Override // defpackage.fchn
    public final void b(Throwable th) {
        c(Status.c(th), true, new fbrg());
    }

    @Override // defpackage.fceb
    protected final void c(Status status, boolean z, fbrg fbrgVar) {
        BidirectionalStream bidirectionalStream = this.h.k;
        bidirectionalStream.getClass();
        bidirectionalStream.cancel();
        j(status, z, fbrgVar);
    }

    @Override // defpackage.fbzi
    protected final void d() {
        super.d();
    }

    @Override // defpackage.fbzl
    public final void e(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }
}
