package defpackage;

import android.view.View;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmt implements Comparator {
    public final cuz a;
    public final cva b;
    public final cuz c;
    public final cuq d;

    public jmt() {
        long[] jArr = cvp.a;
        this.a = new cuz((byte[]) null);
        int i = cvs.a;
        this.b = new cva((byte[]) null);
        this.c = new cuz((byte[]) null);
        int i2 = cvf.a;
        this.d = new cuq((byte[]) null);
    }

    public final void a() {
        this.c.d();
        this.b.a();
        this.d.a();
        this.a.d();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        cuz cuzVar = this.c;
        View view3 = (View) cuzVar.f(view);
        View view4 = (View) cuzVar.f(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.a.f(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        cuq cuqVar = this.d;
        return cuqVar.f(view) < cuqVar.f(view2) ? -1 : 1;
    }
}
