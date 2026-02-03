package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bgv {
    public int a;
    private final Map b;

    public bgv() {
        this.a = ((CaptureFailedRetryQuirk) brt.a(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        this.b = new HashMap();
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract Matrix d();

    public abstract Rect e();

    public abstract bba f();

    public abstract bbb g();

    public abstract List h();

    public abstract Executor i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    final void m(final bbg bbgVar) {
        i().execute(new Runnable() { // from class: bgt
            @Override // java.lang.Runnable
            public final void run() {
                this.a.f().a(bbgVar);
            }
        });
    }

    final boolean n() {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    final void o(int i) {
        Map map = this.b;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            map.put(numValueOf, true);
        } else {
            bbs.c("TakePictureRequest", "The format is not supported in simultaneous capture");
        }
    }
}
