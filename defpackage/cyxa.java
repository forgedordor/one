package defpackage;

import android.widget.CompoundButton;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyxa implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ int a;
    final /* synthetic */ cyxc b;

    public cyxa(cyxc cyxcVar, int i) {
        this.a = i;
        this.b = cyxcVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        evzc evzcVar = z ? evzc.VISIBLE : evzc.INVISIBLE;
        cyxc cyxcVar = this.b;
        int i = this.a;
        CustomizationModel customizationModel = cyxcVar.a;
        ArrayList arrayList = customizationModel.a;
        evza evzaVar = (evza) evzb.a.createBuilder((evzb) arrayList.get(i));
        evzaVar.copyOnWrite();
        ((evzb) evzaVar.instance).c = evzcVar.a();
        arrayList.set(i, evzaVar.build());
        customizationModel.c();
        customizationModel.b = true;
    }
}
