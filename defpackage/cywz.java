package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cywz extends aak {
    final /* synthetic */ cyxc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cywz(cyxc cyxcVar) {
        super(3, 0);
        this.c = cyxcVar;
    }

    @Override // defpackage.aag
    public final boolean m(RecyclerView recyclerView, wv wvVar, wv wvVar2) {
        cyxc cyxcVar = this.c;
        int iFt = wvVar.ft();
        int iFt2 = wvVar2.ft();
        if (iFt >= 0 && iFt2 >= 0) {
            CustomizationModel customizationModel = cyxcVar.a;
            if (iFt < customizationModel.a() && iFt2 < customizationModel.a() && iFt != iFt2) {
                evzb evzbVarB = customizationModel.b(iFt);
                ArrayList arrayList = customizationModel.a;
                arrayList.remove(iFt);
                arrayList.add(iFt2, evzbVarB);
                customizationModel.c();
                customizationModel.b = true;
            }
        }
        cyxcVar.q(iFt);
        cyxcVar.q(iFt2);
        cyxcVar.t(iFt, iFt2);
        return true;
    }

    @Override // defpackage.aag
    public final void i(wv wvVar, int i) {
    }
}
