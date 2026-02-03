package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import j$.time.Instant;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecqf {
    public static final ecqf a;
    public static final AtomicBoolean b;
    public ecpp d;
    public ecqt e;
    public String f;
    public ekgb g;
    public long h;
    public String j;
    public long k;
    public final diep i = new dieu();
    public final String l = "com.google.android.libraries.surveys.internal.view.SurveyActivity";
    public final ecqg c = ecqg.a;

    static {
        Arrays.asList("com.google.android.surveys.testapp", "com.google.android.maps", "com.google.android.apps.tv.launcherx", "com.google.android.tvrecommendations");
        a = new ecqf();
        b = new AtomicBoolean(false);
    }

    private ecqf() {
        ecql.a = new ecqd(this);
        this.h = 0L;
        this.k = Instant.now().toEpochMilli();
    }

    static void b() {
        AtomicBoolean atomicBoolean = b;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                Log.e("SurveyController", "Notified that survey was destroyed when it wasn't marked as running.");
            }
            atomicBoolean.set(false);
        }
    }

    public static void c() {
        AtomicBoolean atomicBoolean = b;
        synchronized (atomicBoolean) {
            atomicBoolean.set(true);
        }
    }

    public final ecro a(ecpx ecpxVar, String str) {
        ecri ecriVar = ecqc.a.d;
        Account account = ecpxVar.e;
        ecro ecroVarA = ecriVar.a(ecpxVar.a, ecpxVar.b, account == null ? "" : account.name, str);
        ((ecrh) ecroVarA).e = ecpxVar.c;
        return ecroVarA;
    }

    public final void d(exft exftVar, ecsc ecscVar, Context context) {
        String str = TextUtils.isEmpty(this.f) ? null : this.f;
        ecsj ecsjVar = ecrz.c;
        if (ecrz.c(fbka.b(ecrz.b))) {
            ecsa ecsaVarA = ecsa.a();
            exfl exflVar = (exfl) exfy.a.createBuilder();
            exflVar.copyOnWrite();
            exfy exfyVar = (exfy) exflVar.instance;
            exftVar.getClass();
            exfyVar.c = exftVar;
            exfyVar.b = 4;
            ecsaVarA.c((exfy) exflVar.build(), ecscVar.b(), ecscVar.a(), context, str);
        }
    }

    public final void e(int i, ecqt ecqtVar) {
        String str;
        int i2;
        ecpp ecppVar = this.d;
        if (ecppVar != null) {
            ecpu ecpuVarA = ecqtVar.a();
            if (((Boolean) ((cczi) cqrj.b.get()).e()).booleanValue()) {
                aill aillVar = (aill) ((cqrh) ecppVar).d.c.c.b();
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                emah emahVar = (emah) emau.a.createBuilder();
                emai emaiVar = (emai) emak.a.createBuilder();
                switch (i - 1) {
                    case 0:
                        i2 = 2;
                        break;
                    case 1:
                        i2 = 3;
                        break;
                    case 2:
                        i2 = 4;
                        break;
                    case 3:
                        i2 = 5;
                        break;
                    case 4:
                        i2 = 6;
                        break;
                    case 5:
                        i2 = 7;
                        break;
                    case 6:
                        i2 = 8;
                        break;
                    case 7:
                        i2 = 9;
                        break;
                    default:
                        i2 = 10;
                        break;
                }
                emaiVar.copyOnWrite();
                emak emakVar = (emak) emaiVar.instance;
                emakVar.d = i2 - 1;
                emakVar.b |= 2;
                String str2 = ecpuVarA.a;
                emaiVar.copyOnWrite();
                emak emakVar2 = (emak) emaiVar.instance;
                emakVar2.b |= 1;
                emakVar2.c = ejwk.b(str2);
                emahVar.copyOnWrite();
                emau emauVar = (emau) emahVar.instance;
                emak emakVar3 = (emak) emaiVar.build();
                emakVar3.getClass();
                emauVar.g = emakVar3;
                emauVar.b |= 16;
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
            cqrh cqrhVar = (cqrh) ecppVar;
            cqrhVar.b.setBackground(cqrhVar.c);
            switch (i) {
                case 1:
                    str = "CLIENT_ACTIVITY_WAS_DESTROYED";
                    break;
                case 2:
                    str = "CLIENT_ACTIVITY_WAS_FINISHING";
                    break;
                case 3:
                    str = "CLIENT_ACTIVITY_WAS_NULL";
                    break;
                case 4:
                    str = "INVALID_COMPLETION_STYLE";
                    break;
                case 5:
                    str = "INVALID_PROMPT_STYLE";
                    break;
                case 6:
                    str = "INVALID_SURVEY_DATA_TYPE";
                    break;
                case 7:
                    str = "INVALID_SURVEY_PAYLOAD";
                    break;
                case 8:
                    str = "SURVEY_ALREADY_RUNNING";
                    break;
                default:
                    str = "SURVEY_EXPIRED";
                    break;
            }
            cqrj.a.n(String.format("Failed to present survey (metadata: %s, error: %s.)", 0, str));
        }
    }
}
