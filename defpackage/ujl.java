package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujl implements dnhm {
    public final Context a;
    public final aipw b;
    public emss c;
    public empl d;
    private final fcsu e;

    public ujl(Context context, aipw aipwVar, fcsu fcsuVar) {
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        this.a = context;
        this.b = aipwVar;
        this.e = fcsuVar;
    }

    private final void d(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            ((cden) this.e.b()).b(th);
        }
    }

    private final void e(final int i, final dnnp dnnpVar) {
        d(new Runnable() { // from class: ujk
            @Override // java.lang.Runnable
            public final void run() {
                emoo emooVar = (emoo) emop.a.createBuilder();
                emov emovVar = (emov) empe.a.createBuilder();
                dnnp dnnpVar2 = dnnpVar;
                dnno dnnoVar = dnnpVar2.d;
                if (dnnoVar == dnnm.a) {
                    empb empbVar = empb.a;
                    emovVar.copyOnWrite();
                    empe empeVar = (empe) emovVar.instance;
                    empbVar.getClass();
                    empeVar.d = empbVar;
                    empeVar.c = 103;
                } else if (dnnoVar == dnnk.a) {
                    emox emoxVar = emox.a;
                    emovVar.copyOnWrite();
                    empe empeVar2 = (empe) emovVar.instance;
                    emoxVar.getClass();
                    empeVar2.d = emoxVar;
                    empeVar2.c = 102;
                } else if (dnnoVar == dnnl.a) {
                    emoz emozVar = emoz.a;
                    emovVar.copyOnWrite();
                    empe empeVar3 = (empe) emovVar.instance;
                    emozVar.getClass();
                    empeVar3.d = emozVar;
                    empeVar3.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                } else if (dnnoVar instanceof dnnn) {
                    empd empdVar = empd.a;
                    emovVar.copyOnWrite();
                    empe empeVar4 = (empe) emovVar.instance;
                    empdVar.getClass();
                    empeVar4.d = empdVar;
                    empeVar4.c = 104;
                }
                dnnl dnnlVar = dnnl.a;
                if (dnnoVar != dnnlVar) {
                    boolean z = dnnpVar2.e;
                    emovVar.copyOnWrite();
                    empe empeVar5 = (empe) emovVar.instance;
                    empeVar5.b |= 1;
                    empeVar5.e = z;
                }
                ujl ujlVar = this.a;
                empe empeVar6 = (empe) emovVar.build();
                emooVar.copyOnWrite();
                emop emopVar = (emop) emooVar.instance;
                empeVar6.getClass();
                emopVar.f = empeVar6;
                emopVar.e = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
                int iIntValue = -1;
                if (dnnoVar != dnnlVar) {
                    if (ujlVar.c == null) {
                        emsn emsnVar = (emsn) emss.a.createBuilder();
                        emsp emspVar = emsp.EMOJI;
                        emsnVar.copyOnWrite();
                        emss emssVar = (emss) emsnVar.instance;
                        emssVar.c = emspVar.v;
                        emssVar.b |= 1;
                        emsr emsrVar = emsr.EXPANDED;
                        emsnVar.copyOnWrite();
                        emss emssVar2 = (emss) emsnVar.instance;
                        emssVar2.d = emsrVar.e;
                        emssVar2.b = 2 | emssVar2.b;
                        ujlVar.c = (emss) emsnVar.build();
                    }
                    emss emssVar3 = ujlVar.c;
                    emooVar.copyOnWrite();
                    emop emopVar2 = (emop) emooVar.instance;
                    emssVar3.getClass();
                    emopVar2.d = emssVar3;
                    emopVar2.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                } else {
                    if (ujlVar.d == null) {
                        int iA = aiuw.a(ujlVar.a);
                        empj empjVar = (empj) empl.a.createBuilder();
                        int i2 = iA != 3 ? 1 : 2;
                        empjVar.copyOnWrite();
                        empl emplVar = (empl) empjVar.instance;
                        emplVar.c = i2 - 1;
                        emplVar.b |= 1;
                        ujlVar.d = (empl) empjVar.build();
                    }
                    empl emplVar2 = ujlVar.d;
                    emooVar.copyOnWrite();
                    emop emopVar3 = (emop) emooVar.instance;
                    emplVar2.getClass();
                    emopVar3.d = emplVar2;
                    emopVar3.c = 102;
                }
                emop emopVar4 = (emop) emooVar.build();
                Integer num = dnnpVar2.c;
                if (dnnoVar != dnnk.a && num != null) {
                    iIntValue = num.intValue();
                }
                ujlVar.b.d(i, emopVar4, iIntValue, null).k(auvh.b(), eoqg.a);
            }
        });
    }

    @Override // defpackage.dnhm
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        e(2, (dnnp) obj);
    }

    @Override // defpackage.dnhm
    public final void b(final List list) {
        d(new Runnable() { // from class: ujj
            @Override // java.lang.Runnable
            public final void run() {
                List list2 = list;
                if (!list2.isEmpty()) {
                    ekgb.n(list2);
                } else {
                    int i = ekgb.d;
                    ekgb ekgbVar = ekoe.a;
                }
            }
        });
    }

    @Override // defpackage.dnhm
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        e(4, (dnnp) obj);
    }
}
