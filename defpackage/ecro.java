package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import j$.time.Instant;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ecro {
    protected final Context a;
    protected final String b;
    protected final String c;
    protected final String d;
    public ecpw e;
    private final Handler f = new Handler(Looper.getMainLooper());

    public ecro(Context context, String str, String str2, String str3) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final void h(exne exneVar, final exng exngVar, ecsc ecscVar) {
        if (exngVar == null) {
            Log.e("SurveyNetworkConnection", "Survey trigger response was null for trigger id: ".concat(String.valueOf(this.b)));
            i(2);
            return;
        }
        expq expqVar = exngVar.d;
        if (expqVar == null) {
            expqVar = expq.a;
        }
        if (expqVar.g.size() == 0) {
            i(3);
            return;
        }
        long j = ecse.a;
        if (this.e == null) {
            Log.w("SurveyNetworkConnection", "RequestSurveyCallback was null for trigger request.");
            return;
        }
        expq expqVar2 = exngVar.d;
        if (expqVar2 == null) {
            expqVar2 = expq.a;
        }
        exoi exoiVar = expqVar2.e;
        if (exoiVar == null) {
            exoiVar = exoi.b;
        }
        exog exogVar = exoiVar.d;
        if (exogVar == null) {
            exogVar = exog.a;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        evrj evrjVar = exogVar.b;
        if (evrjVar == null) {
            evrjVar = evrj.a;
        }
        long millis = timeUnit.toMillis(evrjVar.b);
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        evrj evrjVar2 = exogVar.b;
        if (evrjVar2 == null) {
            evrjVar2 = evrj.a;
        }
        final long millis2 = millis + timeUnit2.toMillis(evrjVar2.c);
        this.f.post(millis2 < 100 ? new Runnable() { // from class: ecrj
            @Override // java.lang.Runnable
            public final void run() {
                ecro ecroVar = this.a;
                ecroVar.e.b(ecroVar.j(exngVar));
            }
        } : new Runnable() { // from class: ecrk
            @Override // java.lang.Runnable
            public final void run() {
                new ecrn(this.a, millis2, exngVar).start();
            }
        });
        Context context = this.a;
        String str = this.c;
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        ecsb.b(exneVar, exngVar, ecscVar, context, str);
    }

    public final void i(final int i) {
        if (this.e != null) {
            this.f.post(new Runnable() { // from class: ecrl
                @Override // java.lang.Runnable
                public final void run() {
                    ecro ecroVar = this.a;
                    ecroVar.e.a(ecroVar.b, i);
                }
            });
        } else {
            Log.w("SurveyNetworkConnection", "RequestSurveyCallback was null for trigger request.");
        }
    }

    public final ecqt j(exng exngVar) {
        String str = exngVar.g;
        expq expqVar = exngVar.d;
        if (expqVar == null) {
            expqVar = expq.a;
        }
        expq expqVar2 = expqVar;
        String str2 = this.b;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
        }
        if (expqVar2 == null) {
            throw new IllegalArgumentException("Payload is null.");
        }
        exqw exqwVar = exngVar.c;
        if (exqwVar == null) {
            exqwVar = exqw.a;
        }
        exqw exqwVar2 = exqwVar;
        String str3 = exngVar.e;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ekgb ekgbVarN = ekgb.n(exngVar.f);
        if (jCurrentTimeMillis != 0) {
            return new ecqt(str2, str, jCurrentTimeMillis, exqwVar2, expqVar2, str3, ekgbVarN);
        }
        throw new IllegalStateException("Trigger time is not set");
    }

    public final void k(final ecqe ecqeVar) {
        this.f.post(new Runnable() { // from class: ecrm
            @Override // java.lang.Runnable
            public final void run() {
                ecsc ecscVar = new ecsc();
                ecqe ecqeVar2 = ecqeVar;
                ecqf ecqfVar = ecqeVar2.c;
                ecpx ecpxVar = ecqeVar2.a;
                ecro ecroVar = ecqeVar2.b;
                synchronized (ecqf.b) {
                    String str = ecpxVar.b;
                    if (TextUtils.isEmpty(str)) {
                        Log.w("SurveyController", "No trigger ID set, ignoring show request.");
                        ecpxVar.c.a(str, 4);
                        return;
                    }
                    ecqfVar.h = Instant.now().toEpochMilli();
                    ecqfVar.c.c.put(str, Long.valueOf(Instant.now().toEpochMilli()));
                    exrf exrfVar = (exrf) exrg.a.createBuilder();
                    exrfVar.copyOnWrite();
                    exrg exrgVar = (exrg) exrfVar.instance;
                    str.getClass();
                    exrgVar.b = str;
                    ecsj ecsjVar = ecrz.c;
                    ecrz.c(fblt.a.get().c(ecrz.b));
                    String language = Locale.getDefault().getLanguage();
                    ecsj ecsjVar2 = ecrz.c;
                    if (ecrz.b(fblh.b(ecrz.b))) {
                        language = Locale.getDefault().toLanguageTag();
                    }
                    ekgb ekgbVarR = ekgb.r(language);
                    exrfVar.copyOnWrite();
                    exrg exrgVar2 = (exrg) exrfVar.instance;
                    evtg evtgVar = exrgVar2.c;
                    if (!evtgVar.c()) {
                        exrgVar2.c = evsn.mutableCopy(evtgVar);
                    }
                    evpz.addAll(ekgbVarR, exrgVar2.c);
                    boolean z = ecpxVar.f;
                    exrfVar.copyOnWrite();
                    ((exrg) exrfVar.instance).d = z;
                    exrg exrgVar3 = (exrg) exrfVar.build();
                    Context context = ecpxVar.a;
                    exny exnyVarD = ecse.d(context);
                    exnd exndVar = (exnd) exne.a.createBuilder();
                    exndVar.copyOnWrite();
                    exne exneVar = (exne) exndVar.instance;
                    exrgVar3.getClass();
                    exneVar.c = exrgVar3;
                    exneVar.b |= 1;
                    exndVar.copyOnWrite();
                    exne exneVar2 = (exne) exndVar.instance;
                    exnyVarD.getClass();
                    exneVar2.d = exnyVarD;
                    exneVar2.b |= 2;
                    final exne exneVar3 = (exne) exndVar.build();
                    final ecsc ecscVar2 = new ecsc();
                    if (exneVar3 == null) {
                        Log.e("NetworkCallerGrpc", "Survey trigger request was null");
                    } else {
                        final ecrh ecrhVar = (ecrh) ecroVar;
                        ecqx.a().execute(new Runnable() { // from class: ecrb
                            @Override // java.lang.Runnable
                            public final void run() {
                                ecrhVar.c(exneVar3, ecscVar2);
                            }
                        });
                    }
                    exfw exfwVar = (exfw) exfx.a.createBuilder();
                    exfwVar.copyOnWrite();
                    exfx exfxVar = (exfx) exfwVar.instance;
                    str.getClass();
                    exfxVar.b = str;
                    exfwVar.copyOnWrite();
                    ((exfx) exfwVar.instance).c = z;
                    exfwVar.copyOnWrite();
                    ((exfx) exfwVar.instance).d = false;
                    exfx exfxVar2 = (exfx) exfwVar.build();
                    Account account = ecpxVar.e;
                    String str2 = account == null ? null : account.name;
                    ecsj ecsjVar3 = ecrz.c;
                    if (ecrz.c(fbka.b(ecrz.b))) {
                        ecsa ecsaVarA = ecsa.a();
                        exfl exflVar = (exfl) exfy.a.createBuilder();
                        exflVar.copyOnWrite();
                        exfy exfyVar = (exfy) exflVar.instance;
                        exfxVar2.getClass();
                        exfyVar.c = exfxVar2;
                        exfyVar.b = 3;
                        ecsaVarA.c((exfy) exflVar.build(), ecscVar.b(), ecscVar.a(), context, str2);
                    }
                }
            }
        });
    }
}
