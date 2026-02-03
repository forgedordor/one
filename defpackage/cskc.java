package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cskc {
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fdjx h;
    public static final cczi a = cdag.c(cdag.b, "penpal_spam_detection_threshold", 2.0d);
    private static final cczi i = cdag.c(cdag.b, "penpal_job_spam_detection_threshold", 2.0d);
    private static final cczi j = cdag.c(cdag.b, "penpal_delivery_spam_detection_threshold", 2.0d);
    private static final cczi k = cdag.c(cdag.b, "penpal_scam_detection_threshold", 2.0d);
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/spam/penpal/PenpalSpamEnforcement");

    public cskc(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fdjxVar.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.h = fdjxVar;
    }

    public static final boolean b(ezea ezeaVar) {
        int iB = ezdz.b(ezeaVar.b);
        return iB != 0 && iB == 5;
    }

    public static final boolean c(ezea ezeaVar) {
        Double d;
        int iB = ezdz.b(ezeaVar.b);
        if (iB == 0) {
            iB = 1;
        }
        int i2 = iB - 2;
        if (i2 == 2) {
            d = (Double) a.e();
        } else if (i2 == 3) {
            d = (Double) k.e();
        } else if (i2 == 4) {
            d = (Double) i.e();
        } else {
            if (i2 != 5) {
                return false;
            }
            d = (Double) j.e();
        }
        return ((double) ezeaVar.c) >= d.doubleValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5, defpackage.ezgd r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cskb
            if (r0 == 0) goto L13
            r0 = r7
            cskb r0 = (defpackage.cskb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cskb r0 = new cskb
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L61
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r7)
            int r7 = r6.b
            r2 = 5
            if (r7 != r2) goto L3c
            java.lang.Object r7 = r6.c
            ezea r7 = (defpackage.ezea) r7
            goto L3e
        L3c:
            ezea r7 = defpackage.ezea.a
        L3e:
            r7.getClass()
            boolean r7 = b(r7)
            if (r7 == 0) goto La6
            fcsu r7 = r4.f
            java.lang.Object r7 = r7.b()
            j$.util.Optional r7 = (j$.util.Optional) r7
            java.lang.Object r7 = r7.get()
            afkc r7 = (defpackage.afkc) r7
            java.util.List r6 = defpackage.fcva.b(r6)
            r0.c = r3
            java.lang.Object r7 = r7.d(r5, r6, r0)
            if (r7 == r1) goto La5
        L61:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            java.lang.String r6 = "saveScamClassification"
            java.lang.String r7 = "com/google/android/apps/messaging/shared/util/spam/penpal/PenpalSpamEnforcement"
            java.lang.String r0 = "BugleSpam"
            java.lang.String r1 = "PenpalSpamEnforcement.kt"
            if (r5 == 0) goto L8a
            ekrg r5 = defpackage.cskc.b
            ekrw r5 = r5.f()
            ekrz r2 = defpackage.eksq.a
            r5.X(r2, r0)
            r0 = 227(0xe3, float:3.18E-43)
            ekrw r5 = r5.h(r7, r6, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r6 = "Penpal classification was saved"
            r5.q(r6)
            goto La2
        L8a:
            ekrg r5 = defpackage.cskc.b
            ekrw r5 = r5.j()
            ekrz r2 = defpackage.eksq.a
            r5.X(r2, r0)
            r0 = 229(0xe5, float:3.21E-43)
            ekrw r5 = r5.h(r7, r6, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r6 = "Penpal classification was not saved"
            r5.q(r6)
        La2:
            fctx r5 = defpackage.fctx.a
            return r5
        La5:
            return r1
        La6:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Failed requirement."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cskc.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, ezgd, fcxy):java.lang.Object");
    }
}
