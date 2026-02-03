package defpackage;

import android.view.View;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.libraries.messaging.lighter.ui.messagecell.MessageCellStatusView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxbv {
    public final dxbu a;
    public dxbz b = null;
    public dwya c;
    public dxdb d;

    public dxbv(dxbu dxbuVar) {
        ((dxbx) dxbuVar).setOnClickListener(new View.OnClickListener() { // from class: dxbw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxbv dxbvVar = this.a;
                dxbz dxbzVar = dxbvVar.b;
                if (dxbzVar == null || !dxbzVar.c().g()) {
                    return;
                }
                dxdb dxdbVar = dxbvVar.d;
                if (dxdbVar != null) {
                    Object objC = dxbvVar.b.c().c();
                    dxah dxahVar = dxdbVar.a.e;
                    if (dxahVar != null) {
                        dwqw dwqwVar = (dwqw) objC;
                        if (dwqwVar.i() == dwqq.OUTGOING_FAILED_SEND) {
                            dxaw dxawVar = dxahVar.a;
                            dxba dxbaVar = dxawVar.e;
                            dxbaVar.b.b(dxbaVar.b(EnergyProfile.EVCONNECTOR_TYPE_OTHER).a());
                            dxawVar.f(dwqwVar);
                        }
                    }
                }
                if (((dwqw) dxbvVar.b.c().c()).i().equals(dwqq.OUTGOING_FAILED_SEND)) {
                    return;
                }
                MessageCellStatusView messageCellStatusView = ((dxbx) dxbvVar.a).d;
                messageCellStatusView.setVisibility(messageCellStatusView.getVisibility() == 0 ? 8 : 0);
            }
        });
        this.a = dxbuVar;
    }
}
