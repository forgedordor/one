package defpackage;

import android.content.ContentValues;
import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chir implements cgxk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/pipeline/sms/receive/ReceiveSmsInfoGatherer");
    private final cmqj b;
    private final aydh c;
    private final fcsu d;
    private final fcyh e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final Context l;
    private final cgxm m;

    public chir(cmqj cmqjVar, aydh aydhVar, fcsu fcsuVar, fcyh fcyhVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, Context context) {
        cmqjVar.getClass();
        aydhVar.getClass();
        fcsuVar.getClass();
        fcyhVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        context.getClass();
        this.b = cmqjVar;
        this.c = aydhVar;
        this.d = fcsuVar;
        this.e = fcyhVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.j = fcsuVar6;
        this.k = fcsuVar7;
        this.l = context;
        this.m = new cgxm("ReceiveSmsInfoGatherer");
    }

    private final ContentValues f(chik chikVar, Long l) {
        chia chiaVar = chikVar.d;
        chjn chjnVar = chiaVar.e;
        ContentValues contentValues = new ContentValues();
        String str = chjnVar.a;
        if (str.length() > 0) {
            contentValues.put("subject", str);
        }
        contentValues.put("sub_id", Integer.valueOf(chjnVar.b));
        contentValues.put("reply_path_present", Integer.valueOf(chjnVar.c ? 1 : 0));
        String str2 = chjnVar.d;
        if (str2.length() > 0) {
            contentValues.put("service_center", str2);
        }
        contentValues.put("protocol", Integer.valueOf(chjnVar.e));
        contentValues.put("address", chiaVar.b.o());
        if (this.b.O()) {
            contentValues.put("date_sent", Long.valueOf(chiaVar.c.toEpochMilli()));
        }
        contentValues.put("date", Long.valueOf(chiaVar.d.toEpochMilli()));
        contentValues.put("body", chiaVar.a);
        contentValues.put("m_cls", Integer.valueOf(chiaVar.f - 1));
        if (l != null) {
            contentValues.put("thread_id", Long.valueOf(l.longValue()));
        }
        return contentValues;
    }

    @Override // defpackage.cgxk
    public final cgxm a() {
        return this.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r23v0, types: [chir] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.chik r24, defpackage.fcxy r25) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chir.b(chik, fcxy):java.lang.Object");
    }

    @Override // defpackage.cgxk
    public final /* synthetic */ Object c(Object obj, fcxy fcxyVar) {
        chil chilVar;
        chil chilVar2 = (chil) obj;
        if (chilVar2 instanceof chik) {
            ekrw ekrwVarH = cgxj.a.h();
            ekrwVarH.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "Interceptor.kt");
            cgxm cgxmVar = this.m;
            int i = fdcj.a;
            ekrdVar.D("Running Interceptor %s. Subject is expected type %s", cgxmVar.a, new fdbi(chik.class).c());
            chilVar = chilVar2;
        } else {
            ekrw ekrwVarH2 = cgxj.a.h();
            ekrwVarH2.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 110, "Interceptor.kt");
            cgxm cgxmVar2 = this.m;
            int i2 = fdcj.a;
            ekrdVar2.I("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cgxmVar2.a, new fdbi(chik.class).c(), new fdbi(chilVar2.getClass()).c());
            chilVar = null;
        }
        chik chikVar = (chik) chilVar;
        return chikVar == null ? chilVar2 : eicj.a(this.e, new chiq(this, chikVar, null), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078 A[Catch: all -> 0x00e6, TryCatch #1 {all -> 0x00e6, blocks: (B:23:0x006d, B:25:0x0078, B:27:0x00a9, B:28:0x00c0, B:31:0x00d7, B:32:0x00e4, B:21:0x004f), top: B:44:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7 A[Catch: all -> 0x00e6, TRY_ENTER, TryCatch #1 {all -> 0x00e6, blocks: (B:23:0x006d, B:25:0x0078, B:27:0x00a9, B:28:0x00c0, B:31:0x00d7, B:32:0x00e4, B:21:0x004f), top: B:44:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.chik r10, java.lang.String r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chir.d(chik, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.chik r24, defpackage.chhu r25, boolean r26, defpackage.fcxy r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chir.e(chik, chhu, boolean, fcxy):java.lang.Object");
    }
}
