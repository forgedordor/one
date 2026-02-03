package defpackage;

import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatv {
    public static final cqce a = cqce.g("Bugle", "DataDonationFragmentPeer");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    final egzv m = new aatt(this);
    final egps n = new aatu(this);
    public RecyclerView o;
    public aauj p;
    public CircularProgressIndicator q;
    public FrameLayout r;
    public Button s;

    public aatv(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
        this.h = fcsuVar7;
        this.i = fcsuVar8;
        this.j = fcsuVar9;
        this.k = fcsuVar10;
        this.l = fcsuVar11;
    }

    public final void a() {
        CircularProgressIndicator circularProgressIndicator = this.q;
        if (circularProgressIndicator.getVisibility() != 0) {
            circularProgressIndicator.removeCallbacks(circularProgressIndicator.h);
        } else {
            Runnable runnable = circularProgressIndicator.i;
            circularProgressIndicator.removeCallbacks(runnable);
            long jUptimeMillis = SystemClock.uptimeMillis() - circularProgressIndicator.e;
            long j = circularProgressIndicator.d;
            if (jUptimeMillis >= j) {
                runnable.run();
            } else {
                circularProgressIndicator.postDelayed(runnable, j - jUptimeMillis);
            }
        }
        this.r.setVisibility(8);
    }

    public final void b() {
        this.q.g();
        this.r.setVisibility(0);
    }
}
