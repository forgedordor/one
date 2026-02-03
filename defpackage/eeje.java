package defpackage;

import android.view.View;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeje implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ eejg b;

    public eeje(eejg eejgVar, int i) {
        this.a = i;
        this.b = eejgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        eeih eeihVar = this.b.a;
        eeis eeisVarD = eeis.d(this.a, eeihVar.c.b);
        eehq eehqVar = eeihVar.b;
        eeis eeisVar = eehqVar.a;
        if (eeisVarD.compareTo(eeisVar) < 0) {
            eeisVarD = eeisVar;
        } else {
            eeis eeisVar2 = eehqVar.b;
            if (eeisVarD.compareTo(eeisVar2) > 0) {
                eeisVarD = eeisVar2;
            }
        }
        eeihVar.e(eeisVarD);
        eeihVar.p(1);
        MaterialButton materialButton = eeihVar.ai;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }
}
