package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anmd implements anmk {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingNotDeliveredYetStatusHandler");
    public final eosd a;
    public final eigp b;
    private final fcsu d;
    private final cogw e;
    private final fcsu f;
    private final Long g;
    private final ahjy h;

    public anmd(fcsu fcsuVar, eosd eosdVar, cogw cogwVar, ahjy ahjyVar, eigp eigpVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        eosdVar.getClass();
        cogwVar.getClass();
        ahjyVar.getClass();
        eigpVar.getClass();
        fcsuVar2.getClass();
        this.d = fcsuVar;
        this.a = eosdVar;
        this.e = cogwVar;
        this.h = ahjyVar;
        this.b = eigpVar;
        this.f = fcsuVar2;
        this.g = (Long) anpo.b.e();
    }

    public static final anla c(String str, MessagesTable.BindData bindData, ajts ajtsVar, boolean z) {
        return new anla(str, (z && bindData.m() == 3) ? 2 : 1, bindData.m() == 3 && !z, bindData.m() == 3 && !ajtsVar.S(), false, g(bindData), false, z, false, 336);
    }

    public static final String d(Resources resources, MessagesTable.BindData bindData) throws Resources.NotFoundException {
        String string = resources.getString(R.string.mapi_message_status_not_delivered_yet);
        string.getClass();
        ekrd ekrdVar = (ekrd) c.h().h("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingNotDeliveredYetStatusHandler", "getAndLogString", 189, "OutgoingNotDeliveredYetStatusHandler.kt");
        Object objE = bindData.E();
        if (objE == null) {
            objE = -1;
        }
        ekrdVar.D("Message with id %x has status %s", objE, string);
        return string;
    }

    private final boolean e(andw andwVar) {
        if (!((aquo) this.f.b()).a() || andwVar.d().size() != 1) {
            return false;
        }
        ekgb ekgbVarD = andwVar.d();
        ekgbVarD.getClass();
        return ((ResolvedRecipient) fcva.N(ekgbVarD)).g().v();
    }

    private static final boolean f(ajts ajtsVar, boolean z) {
        return ajtsVar.P() || z;
    }

    private static final boolean g(MessagesTable.BindData bindData) {
        bvdn bvdnVarL = bindData.L();
        if (bvdnVarL == null) {
            bvdnVarL = bvdn.UNKNOWN;
        }
        return bvdnVarL == bvdn.CFS_AUTO_FALLBACK_ON_OUTGOING_FAILURE;
    }

    @Override // defpackage.anmk
    public final anlb a(Resources resources, MessagesTable.BindData bindData, ekgb ekgbVar, andw andwVar, ancl anclVar, ajts ajtsVar) throws Resources.NotFoundException {
        resources.getClass();
        bindData.getClass();
        ekgbVar.getClass();
        andwVar.getClass();
        anclVar.getClass();
        ajtsVar.getClass();
        boolean zE = e(andwVar);
        int i = (zE && bindData.m() == 3) ? 2 : 1;
        boolean z = bindData.m() == 3 && !zE;
        boolean z2 = bindData.m() == 3 && !ajtsVar.S();
        String strD = null;
        if (bindData.m() == 3 && !ajtsVar.S() && f(ajtsVar, zE)) {
            Instant instantOfEpochMilli = Instant.ofEpochMilli(this.e.f().toEpochMilli());
            Object objE = anpo.b.e();
            objE.getClass();
            if (instantOfEpochMilli.minusMillis(((Number) objE).longValue()).isAfter(Instant.ofEpochMilli(bindData.z()))) {
                strD = d(resources, bindData);
            }
        }
        return new anla(strD, i, z, z2, false, g(bindData), false, zE, false, 336);
    }

    @Override // defpackage.anmk
    public final anpj b(final Resources resources, final MessagesTable.BindData bindData, ekgb ekgbVar, andw andwVar, ancl anclVar, final ajts ajtsVar) {
        resources.getClass();
        bindData.getClass();
        ekgbVar.getClass();
        andwVar.getClass();
        anclVar.getClass();
        ajtsVar.getClass();
        final boolean zE = e(andwVar);
        if (bindData.m() != 3 || ajtsVar.S() || !f(ajtsVar, zE)) {
            return new anpk(c(null, bindData, ajtsVar, zE));
        }
        final long jLongValue = (zE ? ((Number) this.d.b()).longValue() * 1000 : this.g.longValue()) - (this.e.f().toEpochMilli() - bindData.z());
        if (jLongValue <= 0) {
            return new anpk(c(d(resources, bindData), bindData, ajtsVar, zE));
        }
        anla anlaVarC = c(null, bindData, ajtsVar, zE);
        final fdae fdaeVar = new fdae() { // from class: anmc
            @Override // defpackage.fdae
            public final Object invoke() {
                MessagesTable.BindData bindData2 = bindData;
                return anmd.c(anmd.d(resources, bindData2), bindData2, ajtsVar, zE);
            }
        };
        final fdci fdciVar = new fdci();
        anoz anozVarA = this.h.a(new fdap() { // from class: anlz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                final anoz anozVar = (anoz) obj;
                anozVar.getClass();
                final anmd anmdVar = this;
                final fdae fdaeVar2 = fdaeVar;
                fdciVar.a = anmdVar.a.schedule(new Runnable() { // from class: anmb
                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        eigp eigpVar = anmdVar.b;
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
        }, new fdap() { // from class: anma
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
