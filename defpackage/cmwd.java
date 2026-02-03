package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmwd {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/sms/wappushsi/WapPushSiUtils");
    public final fcsu a;
    public final fcsu b;
    public final Context c;
    private final fcsu e;
    private final Executor f;
    private final cuur g;
    private final Object h = new Object();
    private final HashMap i = new HashMap();

    public cmwd(Context context, Executor executor, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cuur cuurVar) {
        this.c = context;
        this.f = executor;
        this.a = fcsuVar;
        this.e = fcsuVar2;
        this.b = fcsuVar3;
        this.g = cuurVar;
    }

    public static int a() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
        int i = gregorianCalendar.get(15) + gregorianCalendar.get(16);
        ekrg ekrgVar = d;
        ekrw ekrwVarE = ekrgVar.e();
        ekrz ekrzVar = eksq.a;
        ekrwVarE.X(ekrzVar, "Bugle");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/sms/wappushsi/WapPushSiUtils", "getTimeOffset", 44, "WapPushSiUtils.java")).r("Timezone Offset: %d", i);
        ekrw ekrwVarE2 = ekrgVar.e();
        ekrwVarE2.X(ekrzVar, "Bugle");
        ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/sms/wappushsi/WapPushSiUtils", "getTimeOffset", 45, "WapPushSiUtils.java")).r("DST Timezone Offset: %d", gregorianCalendar.get(16));
        return i;
    }

    public final void b() {
        auwa.a(new Runnable() { // from class: cmwc
            @Override // java.lang.Runnable
            public final void run() {
                final cmwd cmwdVar = this.a;
                ((crny) cmwdVar.b.b()).o(new crnx() { // from class: cmwb
                    @Override // defpackage.crnx
                    public final boolean a(int i) {
                        cmwd cmwdVar2 = cmwdVar;
                        ((crqu) cmwdVar2.a.b()).a(i).h(cmwdVar2.c.getResources().getString(R.string.wap_push_si_pref_key), false);
                        return true;
                    }
                });
            }
        }, this.f);
    }

    public final boolean c(int i) {
        cuuq cuuqVarA;
        synchronized (this.h) {
            HashMap map = this.i;
            Integer numValueOf = Integer.valueOf(i);
            cuuqVarA = (cuuq) map.get(numValueOf);
            if (cuuqVarA == null) {
                cuuqVarA = this.g.a(i);
                map.put(numValueOf, cuuqVarA);
            }
        }
        return ((Boolean) cuuqVarA.g().orElse(Boolean.valueOf(((cmum) this.e.b()).a(i).k()))).booleanValue();
    }
}
