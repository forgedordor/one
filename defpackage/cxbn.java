package defpackage;

import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugMobileConfigurationFragment;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxbn {
    public final DebugMobileConfigurationFragment a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public Set e;
    public final ConcurrentHashMap f;
    private final fdjx g;

    public cxbn(DebugMobileConfigurationFragment debugMobileConfigurationFragment, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        this.a = debugMobileConfigurationFragment;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.g = fdjxVar;
        this.e = fcvq.a;
        this.f = new ConcurrentHashMap();
    }

    public final RadioGroup a() {
        View viewFindViewById = this.a.N().findViewById(R.id.sims_radio_group);
        viewFindViewById.getClass();
        return (RadioGroup) viewFindViewById;
    }

    public final TextView b() {
        View viewFindViewById = this.a.N().findViewById(R.id.flag_values);
        viewFindViewById.getClass();
        return (TextView) viewFindViewById;
    }

    public final void c(String str) {
        auvw.k(this.g, null, null, new cxbm(this, str, null), 3);
    }
}
