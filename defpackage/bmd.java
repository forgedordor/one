package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmd extends bmc {
    public static bmd a(bni bniVar, Size size) {
        bmg bmgVarX = bniVar.x();
        if (bmgVarX == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for ".concat(String.valueOf(bniVar.q(bniVar.toString()))));
        }
        bmd bmdVar = new bmd();
        bmgVarX.a(size, bniVar, bmdVar);
        return bmdVar;
    }

    public final bml b() {
        return new bml(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.b(), this.f, this.g, this.h, this.i);
    }

    public final void c(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            g((CameraDevice.StateCallback) it.next());
        }
    }

    public final void d(Collection collection) {
        this.b.c(collection);
    }

    public final void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l((CameraCaptureSession.StateCallback) it.next());
        }
    }

    public final void f(bhr bhrVar) {
        this.b.d(bhrVar);
        List list = this.e;
        if (list.contains(bhrVar)) {
            return;
        }
        list.add(bhrVar);
    }

    public final void g(CameraDevice.StateCallback stateCallback) {
        List list = this.c;
        if (list.contains(stateCallback)) {
            return;
        }
        list.add(stateCallback);
    }

    public final void h(bjq bjqVar) {
        this.b.f(bjqVar);
    }

    public final void i(bjz bjzVar) {
        j(bjzVar, azv.b);
    }

    public final void j(bjz bjzVar, azv azvVar) {
        bmh bmhVarG = bmi.g(bjzVar);
        bmhVarG.b(azvVar);
        this.a.add(bmhVarG.a());
    }

    public final void k(bhr bhrVar) {
        this.b.d(bhrVar);
    }

    public final void l(CameraCaptureSession.StateCallback stateCallback) {
        List list = this.d;
        if (list.contains(stateCallback)) {
            return;
        }
        list.add(stateCallback);
    }

    public final void m(bjz bjzVar) {
        n(bjzVar, azv.b, -1);
    }

    public final void n(bjz bjzVar, azv azvVar, int i) {
        bmh bmhVarG = bmi.g(bjzVar);
        bmhVarG.b(azvVar);
        bmhVarG.c(i);
        this.a.add(bmhVarG.a());
        this.b.g(bjzVar);
    }

    public final void o(String str, Object obj) {
        this.b.h(str, obj);
    }

    public final void p(bhr bhrVar) {
        this.b.d.remove(bhrVar);
        this.e.remove(bhrVar);
    }

    public final void q(Range range) {
        this.b.j(range);
    }

    public final void r(bjq bjqVar) {
        this.b.k(bjqVar);
    }

    public final void s(int i) {
        if (i != 0) {
            this.b.l(i);
        }
    }

    public final void t(int i) {
        this.b.b = i;
    }

    public final void u(int i) {
        if (i != 0) {
            this.b.m(i);
        }
    }
}
