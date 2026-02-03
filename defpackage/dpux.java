package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpux {
    public final boolean a;
    public final fdae b;
    public final ViewGroup c;
    public final Consumer d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public dpgl k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    private final fdae o;
    private final boolean p;

    public dpux(boolean z, fdae fdaeVar, ViewGroup viewGroup, Consumer consumer, int i, boolean z2, boolean z3, boolean z4, boolean z5, dpgl dpglVar, boolean z6, boolean z7) {
        this.a = z;
        this.o = null;
        this.b = fdaeVar;
        this.c = viewGroup;
        this.d = consumer;
        this.e = i;
        this.f = z2;
        this.p = false;
        this.g = z3;
        this.h = z4;
        this.i = false;
        this.j = z5;
        this.k = dpglVar;
        this.l = false;
        this.m = z6;
        this.n = z7;
    }

    public final int a() {
        return ((Number) this.b.invoke()).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpux)) {
            return false;
        }
        dpux dpuxVar = (dpux) obj;
        if (this.a != dpuxVar.a) {
            return false;
        }
        fdae fdaeVar = dpuxVar.o;
        if (!fdbq.f(null, null) || !fdbq.f(this.b, dpuxVar.b) || !fdbq.f(this.c, dpuxVar.c) || !fdbq.f(this.d, dpuxVar.d) || this.e != dpuxVar.e || this.f != dpuxVar.f) {
            return false;
        }
        boolean z = dpuxVar.p;
        if (this.g != dpuxVar.g || this.h != dpuxVar.h) {
            return false;
        }
        boolean z2 = dpuxVar.i;
        if (this.j != dpuxVar.j || !fdbq.f(this.k, dpuxVar.k)) {
            return false;
        }
        boolean z3 = dpuxVar.l;
        return this.m == dpuxVar.m && this.n == dpuxVar.n;
    }

    public final int hashCode() {
        int iA = (((((dpuw.a(this.a) * 961) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        dpgl dpglVar = this.k;
        int iHashCode = dpglVar == null ? 0 : dpglVar.hashCode();
        int i = this.e;
        boolean z = this.f;
        int i2 = ((iA * 31) + i) * 31;
        int iA2 = dpuw.a(false);
        return ((((((((((((((((((i2 + dpuw.a(z)) * 31) + iA2) * 31) + dpuw.a(this.g)) * 31) + dpuw.a(this.h)) * 31) + dpuw.a(false)) * 31) + dpuw.a(this.j)) * 31) + iHashCode) * 31) + dpuw.a(false)) * 31) + dpuw.a(this.m)) * 31) + dpuw.a(this.n);
    }

    public final String toString() {
        return "RenderingStrategy(inSeparateWindow=" + this.a + ", minHeightProvider=null, maxHeightProvider=" + this.b + ", anchor=" + this.c + ", heightListener=" + this.d + ", elevationOnScrollPx=" + this.e + ", commitFragmentTransactionsImmediately=" + this.f + ", neverAllowStateLoss=false, ignoreComposeLayoutWithoutVisibleHeight=" + this.g + ", reattachRendererContainerOnRecreate=" + this.h + ", overrideScreenConfigurationOnScreenOpen=false, reopenOpenScreenOnRestore=" + this.j + ", colors=" + this.k + ", closeKeyboardAndInputOnClose=false, checkIfProxyActiveScreenHasChanged=" + this.m + ", detachScreensOnRestore=" + this.n + ")";
    }

    public /* synthetic */ dpux(fdae fdaeVar, ViewGroup viewGroup, Consumer consumer, boolean z, boolean z2, boolean z3, dpgl dpglVar, boolean z4, boolean z5, int i) {
        this(1 == (i & 1), fdaeVar, viewGroup, consumer, (i & 32) != 0 ? viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.renderer_elevation_default_value) : 0, !((i & 64) == 0), ((i & 256) == 0) & z, (!((i & 512) == 0)) | z2, (!((i & 2048) == 0)) | z3, (i & 4096) != 0 ? null : dpglVar, ((i & 16384) == 0) & z4, ((i & 32768) == 0) & z5);
    }
}
