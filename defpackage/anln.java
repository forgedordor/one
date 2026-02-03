package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anln implements anmk {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingCompleteStatusHandler");
    public final eosd a;
    public final eigp b;
    private final cogw d;
    private final Long e;
    private final ahjy f;

    public anln(cogw cogwVar, ahjy ahjyVar, eosd eosdVar, eigp eigpVar) {
        cogwVar.getClass();
        ahjyVar.getClass();
        eosdVar.getClass();
        eigpVar.getClass();
        this.d = cogwVar;
        this.f = ahjyVar;
        this.a = eosdVar;
        this.b = eigpVar;
        this.e = (Long) anpo.b.e();
    }

    public static final anla c(String str, MessagesTable.BindData bindData, ajts ajtsVar) {
        int iM = bindData.m();
        return new anla(str, 1, iM == 3, bindData.m() == 3 && !ajtsVar.S(), false, e(bindData), false, false, false, 464);
    }

    public static final String d(Resources resources, MessagesTable.BindData bindData, int i) throws Resources.NotFoundException {
        String string = resources.getString(i);
        string.getClass();
        ekrd ekrdVar = (ekrd) c.h().h("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingCompleteStatusHandler", "getAndLogString", 175, "OutgoingCompleteStatusHandler.kt");
        Object objE = bindData.E();
        if (objE == null) {
            objE = -1;
        }
        ekrdVar.D("Message with id %x has status %s", objE, string);
        return string;
    }

    private static final boolean e(MessagesTable.BindData bindData) {
        bvdn bvdnVarL = bindData.L();
        if (bvdnVarL == null) {
            bvdnVarL = bvdn.UNKNOWN;
        }
        return bvdnVarL == bvdn.CFS_AUTO_FALLBACK_ON_OUTGOING_FAILURE;
    }

    private static final boolean f(MessagesTable.BindData bindData, ajts ajtsVar) {
        Instant instantJ = ajtsVar.J();
        return bindData.m() == 3 && bindData.s() != 14 && instantJ != null && Instant.ofEpochMilli(bindData.z()).isAfter(instantJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    @Override // defpackage.anmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.anlb a(android.content.res.Resources r19, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r20, defpackage.ekgb r21, defpackage.andw r22, defpackage.ancl r23, defpackage.ajts r24) throws android.content.res.Resources.NotFoundException {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            r0.getClass()
            r1.getClass()
            r21.getClass()
            r22.getClass()
            r23.getClass()
            r24.getClass()
            int r2 = r1.m()
            int r3 = r1.m()
            r4 = 1
            r5 = 0
            r6 = 3
            if (r3 != r6) goto L2d
            boolean r3 = r24.S()
            if (r3 != 0) goto L2d
            r3 = r24
            r11 = r4
            goto L30
        L2d:
            r3 = r24
            r11 = r5
        L30:
            boolean r7 = f(r1, r3)
            if (r7 == 0) goto L41
            r3 = 2132085380(0x7f150a84, float:1.9810957E38)
            java.lang.String r0 = d(r0, r1, r3)
            r3 = r18
        L3f:
            r8 = r0
            goto L8f
        L41:
            int r7 = r1.m()
            r8 = 0
            if (r7 != r6) goto L8d
            boolean r7 = r3.S()
            if (r7 != 0) goto L8d
            boolean r3 = r3.P()
            if (r3 == 0) goto L8d
            r3 = r18
            cogw r7 = r3.d
            j$.time.Instant r7 = r7.f()
            long r9 = r7.toEpochMilli()
            j$.time.Instant r7 = j$.time.Instant.ofEpochMilli(r9)
            cczv r9 = defpackage.anpo.b
            java.lang.Object r9 = r9.e()
            r9.getClass()
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            j$.time.Instant r7 = r7.minusMillis(r9)
            long r9 = r1.z()
            j$.time.Instant r9 = j$.time.Instant.ofEpochMilli(r9)
            boolean r7 = r7.isAfter(r9)
            if (r7 == 0) goto L8f
            r7 = 2132085378(0x7f150a82, float:1.9810953E38)
            java.lang.String r0 = d(r0, r1, r7)
            goto L3f
        L8d:
            r3 = r18
        L8f:
            if (r2 != r6) goto L93
            r10 = r4
            goto L94
        L93:
            r10 = r5
        L94:
            boolean r13 = e(r1)
            anla r7 = new anla
            r16 = 0
            r17 = 464(0x1d0, float:6.5E-43)
            r9 = 1
            r12 = 0
            r14 = 0
            r15 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anln.a(android.content.res.Resources, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, ekgb, andw, ancl, ajts):anlb");
    }

    @Override // defpackage.anmk
    public final anpj b(final Resources resources, final MessagesTable.BindData bindData, ekgb ekgbVar, andw andwVar, ancl anclVar, final ajts ajtsVar) {
        resources.getClass();
        bindData.getClass();
        ekgbVar.getClass();
        andwVar.getClass();
        anclVar.getClass();
        ajtsVar.getClass();
        if (f(bindData, ajtsVar)) {
            return new anpk(c(d(resources, bindData, R.string.mapi_message_status_recipient_offline), bindData, ajtsVar));
        }
        if (bindData.m() != 3 || ajtsVar.S() || !ajtsVar.P()) {
            return new anpk(c(null, bindData, ajtsVar));
        }
        final long jLongValue = this.e.longValue() - (this.d.f().toEpochMilli() - bindData.z());
        if (jLongValue <= 0) {
            return new anpk(c(d(resources, bindData, R.string.mapi_message_status_not_delivered_yet), bindData, ajtsVar));
        }
        anla anlaVarC = c(null, bindData, ajtsVar);
        final fdae fdaeVar = new fdae() { // from class: anlk
            @Override // defpackage.fdae
            public final Object invoke() {
                MessagesTable.BindData bindData2 = bindData;
                return anln.c(anln.d(resources, bindData2, R.string.mapi_message_status_not_delivered_yet), bindData2, ajtsVar);
            }
        };
        final fdci fdciVar = new fdci();
        anoz anozVarA = this.f.a(new fdap() { // from class: anll
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                final anoz anozVar = (anoz) obj;
                anozVar.getClass();
                final anln anlnVar = this;
                final fdae fdaeVar2 = fdaeVar;
                fdciVar.a = anlnVar.a.schedule(new Runnable() { // from class: anlj
                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        eigp eigpVar = anlnVar.b;
                        anoz anozVar2 = anozVar;
                        fdae fdaeVar3 = fdaeVar2;
                        eieh eiehVarA = eigpVar.a("OutgoingCompleteStatusHandler::delayedStatus");
                        try {
                            anozVar2.d(fdaeVar3.invoke());
                            fczl.a(eiehVarA, null);
                        } finally {
                        }
                    }
                }, jLongValue, TimeUnit.MILLISECONDS);
                return fctx.a;
            }
        }, new fdap() { // from class: anlm
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((anoz) obj).getClass();
                fdci fdciVar2 = fdciVar;
                eosb eosbVar = (eosb) fdciVar2.a;
                if (eosbVar != null) {
                    eosbVar.cancel(false);
                }
                fdciVar2.a = null;
                return fctx.a;
            }
        });
        anozVarA.d(anlaVarC);
        return anozVarA;
    }
}
