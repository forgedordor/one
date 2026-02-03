package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dypm extends LinearLayout {
    public dypm(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.signed_out_content, this);
        setOrientation(1);
    }

    public static void b(RecyclerView recyclerView, vo voVar) {
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.getContext();
        recyclerView.ao(new LinearLayoutManager());
        dyra.a(recyclerView, voVar);
    }

    public final dyfx a(lvv lvvVar, dymv dymvVar, dydh dydhVar, dyqd dyqdVar, int i) {
        Context context = getContext();
        if (lvvVar == null) {
            int i2 = ekgb.d;
            lvvVar = new lvy(ekoe.a);
        }
        lvv lvvVar2 = lvvVar;
        dydm dydmVar = (dydm) dydhVar;
        dydi dydiVar = dydmVar.b;
        dyyb dyybVar = dydmVar.k;
        dyif dyifVar = dydmVar.e;
        return new dyfx(context, dydiVar, lvvVar2, dyqdVar, dyybVar, i);
    }
}
