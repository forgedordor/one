package defpackage;

import android.util.LruCache;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csio {
    public static final eksp a = eksp.c("BugleSpam");
    public static final Object b = new Object();
    public static final cczi c = cdag.e(cdag.b, "moirai_max_number_of_messages_to_send", 10);
    static final cczi d = cdag.h(cdag.b, "moirai_enable_uma_logs", false);
    public static final ekgp e = ekgp.o(csir.b, sfp.USER_FEEDBACK_CONFIRMED_SPAM, csir.e, sfp.USER_FEEDBACK_BLOCKED_SPAM, csir.c, sfp.USER_FEEDBACK_DELETED_SPAM, csir.d, sfp.USER_FEEDBACK_LEFT_SPAM);
    public final ejxr f = ejxx.a(new ejxr() { // from class: csim
        @Override // defpackage.ejxr
        public final Object get() {
            eksp ekspVar = csio.a;
            return new LruCache(BasePaymentResult.ERROR_REQUEST_FAILED);
        }
    });
    public final fcsu g;
    public final fcsu h;
    public final cpkp i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final eosc n;
    public final eosc o;

    public csio(fcsu fcsuVar, fcsu fcsuVar2, cpkp cpkpVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, eosc eoscVar, eosc eoscVar2) {
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = cpkpVar;
        this.j = fcsuVar3;
        this.k = fcsuVar4;
        this.l = fcsuVar5;
        this.m = fcsuVar6;
        this.n = eoscVar;
        this.o = eoscVar2;
    }

    public final void a(ekgb ekgbVar, final sfp sfpVar) {
        if (ekgbVar.isEmpty()) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/util/spam/hades/MoiraiSpamReporter", "reportHadesDetectedMessages", 273, "MoiraiSpamReporter.java")).q("MoiraiSpamReporterImpl#reportHadesDetectedMessages: No detections to log, skipping.");
            return;
        }
        final ekgb ekgbVarL = ((baxe) this.j.b()).L(ekgbVar);
        if (ekgbVarL.isEmpty()) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/util/spam/hades/MoiraiSpamReporter", "reportHadesDetectedMessages", 282, "MoiraiSpamReporter.java")).q("MoiraiSpamReporterImpl#reportHadesDetectedMessages: No messages to log, skipping.");
        } else {
            auvh.h(((csig) this.h.b()).a((MessageCoreData) ekgbVarL.get(0)).h(new ejvr() { // from class: csik
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    boolean zEquals;
                    if (!((Boolean) obj).booleanValue()) {
                        return null;
                    }
                    ekgb ekgbVar2 = ekgbVarL;
                    sfp sfpVar2 = sfpVar;
                    csio csioVar = this.a;
                    if (((Boolean) csio.d.e()).booleanValue()) {
                        if (sfpVar2 == sfp.USER_FEEDBACK_MARKED_NOT_SPAM) {
                            ((ains) csioVar.m.b()).c("Bugle.Spam.Hades.FalsePositive.Count");
                        } else {
                            ((ains) csioVar.m.b()).e("Bugle.Spam.Hades.TruePositivePerFeedbackType.Count", sfpVar2.h);
                            if (sfpVar2 == sfp.USER_FEEDBACK_LEFT_SPAM) {
                                synchronized (csio.b) {
                                    Boolean bool = Boolean.TRUE;
                                    ejxr ejxrVar = csioVar.f;
                                    zEquals = bool.equals(((LruCache) ejxrVar.get()).get(((MessageCoreData) ekgbVar2.get(0)).A()));
                                    ((LruCache) ejxrVar.get()).put(((MessageCoreData) ekgbVar2.get(0)).A(), Boolean.TRUE);
                                }
                                if (zEquals) {
                                    ((ains) csioVar.m.b()).c("Bugle.Spam.Hades.RepeatedReport.SpamFolder.Count");
                                }
                            }
                        }
                        ((ains) csioVar.m.b()).e("Bugle.Spam.Hades.DetectedMessage.Hist", ekgbVar2.size());
                    }
                    int size = ekgbVar2.size();
                    for (int i = 0; i < size; i++) {
                        auvh.h(((csgi) csioVar.g.b()).d(((cspk) csioVar.l.b()).a((MessageCoreData) ekgbVar2.get(i)), sfpVar2));
                    }
                    return null;
                }
            }, this.n));
        }
    }
}
