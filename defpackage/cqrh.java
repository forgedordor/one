package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqrh implements ecpp {
    final /* synthetic */ cqqh a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ cqri d;

    public cqrh(cqri cqriVar, cqqh cqqhVar, View view, Drawable drawable) {
        this.a = cqqhVar;
        this.b = view;
        this.c = drawable;
        this.d = cqriVar;
    }

    @Override // defpackage.ecpp
    public final void a(ecpu ecpuVar) {
        if (((Boolean) ((cczi) cqrj.b.get()).e()).booleanValue()) {
            aill aillVar = (aill) this.d.c.c.b();
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            emah emahVar = (emah) emau.a.createBuilder();
            emaq emaqVar = (emaq) emar.a.createBuilder();
            String str = ecpuVar.a;
            emaqVar.copyOnWrite();
            emar emarVar = (emar) emaqVar.instance;
            emarVar.b |= 1;
            emarVar.c = ejwk.b(str);
            emahVar.copyOnWrite();
            emau emauVar = (emau) emahVar.instance;
            emar emarVar2 = (emar) emaqVar.build();
            emarVar2.getClass();
            emauVar.f = emarVar2;
            emauVar.b |= 8;
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
        this.b.setBackground(this.c);
    }

    @Override // defpackage.ecpp
    public final void b(ecpu ecpuVar) {
        if (((Boolean) ((cczi) cqrj.b.get()).e()).booleanValue()) {
            aill aillVar = (aill) this.d.c.c.b();
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            emah emahVar = (emah) emau.a.createBuilder();
            emas emasVar = (emas) emat.a.createBuilder();
            String str = ecpuVar.a;
            emasVar.copyOnWrite();
            emat ematVar = (emat) emasVar.instance;
            ematVar.b |= 1;
            ematVar.c = ejwk.b(str);
            emahVar.copyOnWrite();
            emau emauVar = (emau) emahVar.instance;
            emat ematVar2 = (emat) emasVar.build();
            ematVar2.getClass();
            emauVar.e = ematVar2;
            emauVar.b |= 4;
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
        cwyn cwynVar = (cwyn) this.a;
        cwynVar.e = true;
        long epochMilli = cwynVar.c.f().toEpochMilli();
        crqv crqvVar = (crqv) cwynVar.a.b();
        if (crqvVar.e("last_saw_survey_time", 0L) + TimeUnit.DAYS.toMillis(1L) < epochMilli) {
            ((ains) cwynVar.b.b()).c("Bugle.UI.HaTS.Shown");
            crqvVar.k("last_saw_survey_time", epochMilli);
        }
    }
}
