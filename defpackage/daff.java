package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.search.resultsview.ResultsFilterView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daff {
    public static final ekgp a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public dacu f;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i(Integer.valueOf(R.id.images_chip), 2);
        ekgiVar.i(Integer.valueOf(R.id.videos_chip), 3);
        ekgiVar.i(Integer.valueOf(R.id.places_chip), 5);
        ekgiVar.i(Integer.valueOf(R.id.links_chip), 4);
        a = ekgiVar.c();
    }

    public daff(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
    }

    public final void a() {
        dacu dacuVar = this.f;
        dacuVar.getClass();
        if (dacuVar.v()) {
            ((ResultsFilterView) this.b.b()).setVisibility(0);
        } else {
            ((ResultsFilterView) this.b.b()).setVisibility(8);
        }
    }
}
