package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efrr extends Fragment {
    public static final String a = "efrr";
    public static final efte b = new efte("efrr");
    public efrj c;
    private MetricKey d;
    private long e;
    private long f = 0;

    public efrr() {
        setRetainInstance(true);
    }

    @Override // android.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        b.a("onAttach host=".concat(String.valueOf(getActivity().getClass().getSimpleName())));
        this.d = MetricKey.b("ScreenDuration", getActivity());
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        b.a("onDetach host=".concat(String.valueOf(getActivity().getClass().getSimpleName())));
        Activity activity = getActivity();
        MetricKey metricKey = this.d;
        long millis = TimeUnit.NANOSECONDS.toMillis(this.f);
        int i = efsf.a;
        efrt.c(activity, "Context cannot be null.");
        efrt.c(metricKey, "Timer name cannot be null.");
        efrt.a(millis >= 0, "Duration cannot be negative.");
        efrw efrwVarA = efrw.a(activity);
        Bundle bundle = new Bundle();
        bundle.putParcelable("MetricKey_bundle", MetricKey.a(metricKey));
        bundle.putLong("timeMillis", millis);
        efrwVarA.d(2, bundle);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        b.a("onPause host=".concat(String.valueOf(getActivity().getClass().getSimpleName())));
        this.f += System.nanoTime() - this.e;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        b.a("onResume host=" + getActivity().getClass().getSimpleName() + ", startInNanos=" + System.nanoTime());
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.e = System.nanoTime();
        b.a("onStart host=" + getActivity().getClass().getSimpleName() + ", startInNanos=" + this.e);
        if (Build.VERSION.SDK_INT >= 29) {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putLong("onScreenStart", System.nanoTime());
            efsf.a(getActivity(), CustomEvent.b(MetricKey.b("ScreenActivity", getActivity()), persistableBundle));
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        Activity activity;
        super.onStop();
        long jNanoTime = System.nanoTime();
        b.a("onStop host=" + getActivity().getClass().getSimpleName() + ", onStopTimestamp=" + jNanoTime);
        if (Build.VERSION.SDK_INT < 29 || this.c == null) {
            return;
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putLong("onScreenStop", jNanoTime);
        efrl efrlVar = this.c.a;
        if (Build.VERSION.SDK_INT < 29 || (activity = efrlVar.b) == null || !eftj.a(activity.getIntent()) || !efsj.o(efrlVar.getContext())) {
            return;
        }
        efss efssVar = (efss) efrlVar.i(efss.class);
        if (efssVar == null) {
            efrl.a.f("FooterBarMixin is null");
            efsf.a(efrlVar.getContext(), CustomEvent.b(MetricKey.b("FooterButtonMetrics", efrlVar.b), persistableBundle));
        } else {
            efssVar.e();
            efst efstVar = efssVar.h;
            efst efstVar2 = efssVar.i;
            efsf.a(efrlVar.getContext(), CustomEvent.b(MetricKey.b("FooterButtonMetrics", efrlVar.b), efrs.b(efssVar.a(), efstVar != null ? efstVar.a("PrimaryFooterButton") : PersistableBundle.EMPTY, efstVar2 != null ? efstVar2.a("SecondaryFooterButton") : PersistableBundle.EMPTY, persistableBundle)));
        }
    }
}
