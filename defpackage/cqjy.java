package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqjy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/debug/DebugFileUtils");
    public static final cczv b = cdag.h(cdag.b, "enable_debug_values_from_settings_store", false);
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final eygg f;
    public volatile boolean g;
    public volatile boolean h;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public volatile int l;
    public volatile int m;
    public volatile boolean n;
    public volatile boolean o;
    public volatile boolean p;
    public volatile boolean q;
    public volatile boolean r;
    public volatile boolean s;
    public volatile boolean t;
    private final fdjx u;

    public cqjy(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eygg eyggVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        eyggVar.getClass();
        fdjxVar.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = eyggVar;
        this.u = fdjxVar;
        this.l = -1;
        this.m = -2;
        if (((Boolean) b.e()).booleanValue()) {
            auvw.k(fdjxVar, null, null, new cqjn(this, null), 3);
        }
    }

    public final File a(String str, boolean z, Context context) {
        context.getClass();
        File file = new File(b(context), str);
        if (z && file.exists()) {
            file.delete();
        }
        return file;
    }

    public final File b(Context context) {
        context.getClass();
        File file = new File(context.getCacheDir() + File.separator + "Debug");
        if (!file.exists() && !file.isDirectory() && !file.mkdirs()) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/shared/util/debug/DebugFileUtils", "getDebugFilesDir", 162, "DebugFileUtils.kt")).t("getDebugFilesDir: couldn't create dir: %s", file.getPath());
        }
        return file;
    }

    public final void c() {
        k(-1);
    }

    public final void d() {
        l(-2);
    }

    public final void e(boolean z) {
        if (this.g != z && ((Boolean) b.e()).booleanValue()) {
            auvw.k(this.u, null, null, new cqjp(null, this, z), 3);
        }
        this.g = z;
    }

    public final void f(boolean z) {
        if (this.o != z && ((Boolean) b.e()).booleanValue()) {
            auvw.k(this.u, null, null, new cqjx(null, this, z), 3);
        }
        this.o = z;
    }

    public final void g(boolean z) {
        if (this.k != z && ((Boolean) b.e()).booleanValue()) {
            auvw.k(this.u, null, null, new cqjt(null, this, z), 3);
        }
        this.k = z;
    }

    public final void h(boolean z) {
        if (this.j != z && ((Boolean) b.e()).booleanValue()) {
            auvw.k(this.u, null, null, new cqjs(null, this, z), 3);
        }
        this.j = z;
    }

    public final void i(boolean z) {
        if (this.n != z && ((Boolean) b.e()).booleanValue()) {
            auvw.k(this.u, null, null, new cqjw(null, this, z), 3);
        }
        this.n = z;
    }

    public final void j(boolean z) {
        if (this.i != z && ((Boolean) b.e()).booleanValue()) {
            auvw.k(this.u, null, null, new cqjr(null, this, z), 3);
        }
        this.i = z;
    }

    public final void k(int i) {
        if (this.l != i && ((Boolean) b.e()).booleanValue()) {
            auvw.k(this.u, null, null, new cqju(null, this, i), 3);
        }
        this.l = i;
    }

    public final void l(int i) {
        if (this.m != i && ((Boolean) b.e()).booleanValue()) {
            auvw.k(this.u, null, null, new cqjv(null, this, i), 3);
        }
        this.m = i;
    }

    public final void m(boolean z) {
        if (this.h != z && ((Boolean) b.e()).booleanValue()) {
            auvw.k(this.u, null, null, new cqjq(null, this, z), 3);
        }
        this.h = z;
    }

    public final void n() {
        e(!this.g);
    }

    public final void o() {
        m(!this.h);
        if (this.h) {
            clcv.b.k(0L);
        } else {
            clcv.b.m();
        }
    }

    public final boolean p() {
        return this.l != -1;
    }

    public final boolean q() {
        return ((cqky) this.c.b()).a();
    }

    public final boolean r() {
        return ((cqky) this.c.b()).b();
    }

    public final byte[] s(String str, Context context) {
        str.getClass();
        context.getClass();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(a(str, false, context)));
            try {
                byte[] bArrB = elec.b(bufferedInputStream);
                bArrB.getClass();
                if (bArrB.length == 0) {
                    ekrw ekrwVarI = a.i();
                    ekrwVarI.X(eksq.a, "Bugle");
                    ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/shared/util/debug/DebugFileUtils", "receiveFromDumpFile", 197, "DebugFileUtils.kt")).q("receiveFromDumpFile: empty data");
                }
                fczl.a(bufferedInputStream, null);
                return bArrB;
            } finally {
            }
        } catch (IOException e) {
            ekrw ekrwVarI2 = a.i();
            ekrwVarI2.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarI2).g(e).h("com/google/android/apps/messaging/shared/util/debug/DebugFileUtils", "receiveFromDumpFile", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "DebugFileUtils.kt")).q("receiveFromDumpFile:");
            return null;
        }
    }
}
