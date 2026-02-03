package defpackage;

import android.util.Log;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbxs extends fbzf {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0);

    @Deprecated
    static final fbnb b = new fbnb("cronet-annotation", null);
    public static final fbnb c = new fbnb("cronet-annotations", null);
    public final String d;
    public final String e;
    public final fcmm f;
    public final Executor g;
    public final fbrg h;
    public final fbxv i;
    public final Runnable j;
    public BidirectionalStream k;
    public final boolean l;
    public final Object m;
    public final Collection n;
    public final fbxr o;
    public fbxl p;
    private final fbxq u;

    public fbxs(String str, String str2, Executor executor, fbrg fbrgVar, fbxv fbxvVar, Runnable runnable, Object obj, int i, fbrk fbrkVar, fcmm fcmmVar, fbnc fbncVar, fcmu fcmuVar) {
        super(new fbxx(), fcmmVar, fcmuVar, fbrgVar, fbncVar);
        this.u = new fbxq(this);
        this.d = str;
        this.e = str2;
        this.f = fcmmVar;
        this.g = executor;
        this.h = fbrgVar;
        this.i = fbxvVar;
        this.j = runnable;
        this.l = fbrkVar.a == fbrj.UNARY;
        this.m = fbncVar.h(b);
        this.n = (Collection) fbncVar.h(c);
        this.o = new fbxr(this, i, fcmmVar, obj, fcmuVar);
        f();
    }

    @Override // defpackage.fcan
    public final fbmw a() {
        return fbmw.a;
    }

    @Override // defpackage.fbzf
    protected final /* synthetic */ fbzc p() {
        return this.u;
    }

    @Override // defpackage.fbzf
    protected final /* synthetic */ fbze q() {
        return this.o;
    }

    @Override // defpackage.fbzf, defpackage.fbzj
    protected final /* synthetic */ fbzi r() {
        return this.o;
    }

    public final void s(Status status) {
        this.i.a(this, status);
    }

    public final void t(ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (this.k == null) {
            return;
        }
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "BidirectionalStream.write");
        }
        this.k.write(byteBuffer, z);
        if (z2) {
            if (Log.isLoggable("grpc-java-cronet", 2)) {
                Log.v("grpc-java-cronet", "BidirectionalStream.flush");
            }
            this.k.flush();
        }
    }
}
