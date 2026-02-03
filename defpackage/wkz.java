package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wkz extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ wlg c;
    final /* synthetic */ dojp d;
    final /* synthetic */ fdae e;
    final /* synthetic */ dike f;
    final /* synthetic */ yov g;
    final /* synthetic */ fduf h;
    final /* synthetic */ fduf i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkz(fcxy fcxyVar, wlg wlgVar, dojp dojpVar, fdae fdaeVar, dike dikeVar, yov yovVar, fduf fdufVar, fduf fdufVar2) {
        super(3, fcxyVar);
        this.c = wlgVar;
        this.d = dojpVar;
        this.e = fdaeVar;
        this.f = dikeVar;
        this.g = yovVar;
        this.h = fdufVar;
        this.i = fdufVar2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wkz wkzVar = new wkz((fcxy) obj3, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        wkzVar.j = (fdpm) obj;
        wkzVar.b = (Object[]) obj2;
        return wkzVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Float f;
        boolean z;
        float fLongValue;
        dlro dlroVarB;
        Object diklVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r2 = this.j;
            Object[] objArr = (Object[]) this.b;
            Object obj2 = objArr[0];
            obj2.getClass();
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            Object obj3 = objArr[1];
            obj3.getClass();
            boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
            Object obj4 = objArr[2];
            obj4.getClass();
            wkw wkwVar = new wkw(zBooleanValue, zBooleanValue2, ((Boolean) obj4).booleanValue(), (Long) objArr[3], (Float) objArr[4]);
            boolean z2 = wkwVar.a;
            boolean z3 = wkwVar.b;
            boolean z4 = wkwVar.c;
            Long l = wkwVar.d;
            Float f2 = wkwVar.e;
            dojp dojpVar = this.d;
            yov yovVar = this.g;
            wlf wlfVar = new wlf(z2, yovVar, this.h, this.i);
            fdae fdaeVar = this.e;
            Duration duration = dojpVar.e;
            long millis = duration.toMillis();
            if (f2 != null) {
                fLongValue = f2.floatValue();
                f = f2;
                z = z3;
            } else if (millis <= 0 || l == null) {
                f = f2;
                z = z3;
                fLongValue = 0.0f;
            } else {
                f = f2;
                z = z3;
                fLongValue = l.longValue() / millis;
            }
            dikq dikqVar = new dikq(fLongValue, wlfVar, fdaeVar);
            wle wleVar = new wle(z2, yovVar);
            long millis2 = duration.toMillis();
            if (f != null) {
                millis2 = (long) (f.floatValue() * millis2);
            } else if (l != null) {
                millis2 = l.longValue();
            }
            long j = millis2;
            if (((Boolean) aonl.g.e()).booleanValue()) {
                dqcs dqcsVar = dojpVar.f.c;
                if (dqcsVar == null) {
                    dqcsVar = dqcs.a;
                }
                dqcsVar.getClass();
                dlroVarB = dqct.b(dqcsVar, true);
            } else {
                dlroVarB = null;
            }
            dlro dlroVar = dlroVarB;
            if (z4) {
                ekrw ekrwVarF = wlg.a.f();
                ekrwVarF.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/audio/DraftAudioAttachmentUiAdapter$convert$$inlined$combineWithLogging-exY8QGI$2$3", "invokeSuspend", 116, "DraftAudioAttachmentUiAdapter.kt")).t("Audio attachment hasError %s", dojpVar);
                String str = dojpVar.c;
                diklVar = new dikg(str == null ? "" : str, null, true, false, false, this.f, null, 374);
            } else if (z) {
                ekrw ekrwVarF2 = wlg.a.f();
                ekrwVarF2.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarF2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/audio/DraftAudioAttachmentUiAdapter$convert$$inlined$combineWithLogging-exY8QGI$2$3", "invokeSuspend", 124, "DraftAudioAttachmentUiAdapter.kt")).t("Audio attachment isLoading %s", dojpVar);
                String str2 = dojpVar.c;
                diklVar = new dikp(str2 == null ? "" : str2, null, dlroVar, true, false, false, null, j, null, new diki(false, false));
            } else {
                ekrw ekrwVarF3 = wlg.a.f();
                ekrwVarF3.X(eksq.a, "BugleComposeRow2");
                ekrd ekrdVar = (ekrd) ekrwVarF3;
                ekrdVar.V(2, TimeUnit.SECONDS);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/audio/DraftAudioAttachmentUiAdapter$convert$$inlined$combineWithLogging-exY8QGI$2$3", "invokeSuspend", 136, "DraftAudioAttachmentUiAdapter.kt")).J("Audio attachment loaded isPlaying: %b, currentPosition: %d, seekProgress: %d, %s", Boolean.valueOf(z2), l, new Integer((int) (100.0f * (f != null ? f.floatValue() : 0.0f))), dojpVar);
                String str3 = dojpVar.c;
                diklVar = new dikl(str3 == null ? "" : str3, null, dlroVar, true, false, false, z2, j, wleVar, dikqVar, new wld(yovVar), null, null, this.f, null, 22578);
            }
            this.a = 1;
            if (r2.fO(diklVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
