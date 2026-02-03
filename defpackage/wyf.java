package defpackage;

import android.content.Context;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyf implements wxl, vwi {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/scheduledsend/ScheduledSendUiAdapterImpl");
    public final Context b;
    public final fdjx c;
    public final wre d;
    public final aihi e;
    public final fcsu f;
    private final wwy g;
    private final ahax h;
    private final afzc i;
    private final cogw j;
    private final wmp k;
    private final crma l;
    private final aaft m;

    public wyf(Context context, fdjx fdjxVar, wre wreVar, aihi aihiVar, wwy wwyVar, ahax ahaxVar, afzc afzcVar, cogw cogwVar, wmp wmpVar, crma crmaVar, aaft aaftVar, fcsu fcsuVar) {
        context.getClass();
        fdjxVar.getClass();
        wreVar.getClass();
        aihiVar.getClass();
        ahaxVar.getClass();
        afzcVar.getClass();
        cogwVar.getClass();
        crmaVar.getClass();
        aaftVar.getClass();
        fcsuVar.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.d = wreVar;
        this.e = aihiVar;
        this.g = wwyVar;
        this.h = ahaxVar;
        this.i = afzcVar;
        this.j = cogwVar;
        this.k = wmpVar;
        this.l = crmaVar;
        this.m = aaftVar;
        this.f = fcsuVar;
    }

    public static final fctx d() {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/scheduledsend/ScheduledSendUiAdapterImpl", "showScheduledSendDialog$lambda$2", 94, "ScheduledSendUiAdapterImpl.kt")).q("Dismissed scheduled send dialog");
        return fctx.a;
    }

    @Override // defpackage.vwi
    public final boolean a() {
        fdvc fdvcVar = this.d.a;
        if (((vvw) fdvcVar.c()).e != null) {
            this.k.i();
            return false;
        }
        if (((Boolean) this.f.b()).booleanValue() && ((vvw) fdvcVar.c()).f != null) {
            this.k.g();
            return false;
        }
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/scheduledsend/ScheduledSendUiAdapterImpl", "showScheduledSendDialog", 91, "ScheduledSendUiAdapterImpl.kt")).q("Opening scheduled send dialog");
        this.g.a(new fdae() { // from class: wxn
            @Override // defpackage.fdae
            public final Object invoke() {
                return wyf.d();
            }
        }, new fdap() { // from class: wxo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Instant instant = (Instant) obj;
                instant.getClass();
                wyf wyfVar = this.a;
                auvw.k(wyfVar.c, null, null, new wye(wyfVar, instant, null), 3);
                return fctx.a;
            }
        });
        return true;
    }

    @Override // defpackage.wxl
    public final fdvc b() {
        return fdtg.b(new wxx(fdqq.a(new wxu(this.d.a)), this), this.c, fdur.b, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0102, code lost:
    
        if (c(r13, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013e, code lost:
    
        if (r13.a(r5, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(final j$.time.Instant r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyf.c(j$.time.Instant, fcxy):java.lang.Object");
    }
}
