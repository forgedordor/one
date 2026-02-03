package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqri implements ecpw {
    final /* synthetic */ Activity a;
    final /* synthetic */ cqqh b;
    public final /* synthetic */ cqrj c;

    public cqri(cqrj cqrjVar, Activity activity, cqqh cqqhVar) {
        this.a = activity;
        this.b = cqqhVar;
        this.c = cqrjVar;
    }

    @Override // defpackage.ecpw
    public final void a(String str, int i) {
        if (((Boolean) ((cczi) cqrj.b.get()).e()).booleanValue()) {
            aill aillVar = (aill) this.c.c.b();
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            emah emahVar = (emah) emau.a.createBuilder();
            emal emalVar = (emal) eman.a.createBuilder();
            emalVar.copyOnWrite();
            eman emanVar = (eman) emalVar.instance;
            str.getClass();
            emanVar.b |= 1;
            emanVar.c = str;
            int i2 = i - 1;
            int i3 = i2 != 1 ? i2 != 2 ? i2 != 3 ? 7 : 6 : 5 : 4;
            emalVar.copyOnWrite();
            eman emanVar2 = (eman) emalVar.instance;
            emanVar2.d = i3 - 1;
            emanVar2.b |= 2;
            emahVar.copyOnWrite();
            emau emauVar = (emau) emahVar.instance;
            eman emanVar3 = (eman) emalVar.build();
            emanVar3.getClass();
            emauVar.d = emanVar3;
            emauVar.b |= 2;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            emau emauVar2 = (emau) emahVar.build();
            emauVar2.getClass();
            ellhVar.aO = emauVar2;
            ellhVar.e |= 262144;
            ellf ellfVar = ellf.BUGLE_HATS_NEXT_CLIENT_EVENT;
            ellgVar.copyOnWrite();
            ellh ellhVar2 = (ellh) ellgVar.instance;
            ellhVar2.j = ellfVar.f11do;
            ellhVar2.b |= 1;
            aillVar.j(ellgVar);
        }
        cqrj.a.n(String.format("Failed to fetch survey (trigger id: %s, error: %s.)", str, ecpv.a(i)));
    }

    @Override // defpackage.ecpw
    public final void b(ecqt ecqtVar) {
        if (((Boolean) ((cczi) cqrj.b.get()).e()).booleanValue()) {
            aill aillVar = (aill) this.c.c.b();
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            emah emahVar = (emah) emau.a.createBuilder();
            emao emaoVar = (emao) emap.a.createBuilder();
            String str = ecqtVar.a().a;
            emaoVar.copyOnWrite();
            emap emapVar = (emap) emaoVar.instance;
            emapVar.b |= 1;
            emapVar.c = ejwk.b(str);
            emahVar.copyOnWrite();
            emau emauVar = (emau) emahVar.instance;
            emap emapVar2 = (emap) emaoVar.build();
            emapVar2.getClass();
            emauVar.c = emapVar2;
            emauVar.b |= 1;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            emau emauVar2 = (emau) emahVar.build();
            emauVar2.getClass();
            ellhVar.aO = emauVar2;
            ellhVar.e |= 262144;
            ellf ellfVar = ellf.BUGLE_HATS_NEXT_CLIENT_EVENT;
            ellgVar.copyOnWrite();
            ellh ellhVar2 = (ellh) ellgVar.instance;
            ellhVar2.j = ellfVar.f11do;
            ellhVar2.b |= 1;
            aillVar.j(ellgVar);
        }
        Activity activity = this.a;
        ecpn ecpnVar = new ecpn(activity, ecqtVar);
        cqqh cqqhVar = this.b;
        View viewFindViewById = activity.findViewById(R.id.bottom_layout);
        int measuredWidth = ((cwyn) cqqhVar).d.getMeasuredWidth();
        if (viewFindViewById == null || measuredWidth < 0) {
            return;
        }
        Drawable background = viewFindViewById.getBackground();
        viewFindViewById.setBackground(null);
        cqrh cqrhVar = new cqrh(this, cqqhVar, viewFindViewById, background);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new lcb("sessionId", ejwk.b(ecqtVar.a().b)));
        ecpnVar.b(viewFindViewById.getId(), Integer.valueOf(measuredWidth));
        ecpnVar.b = 1;
        ecpnVar.a = cqrhVar;
        ecpnVar.d = arrayList;
        ecpy.a(ecpnVar.a());
    }
}
