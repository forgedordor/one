package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chro extends fcyz implements fdat {
    int a;
    final /* synthetic */ chrw b;
    final /* synthetic */ ParticipantsTable.BindData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chro(chrw chrwVar, ParticipantsTable.BindData bindData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chrwVar;
        this.c = bindData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chro) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            chrw chrwVar = this.b;
            eiju eijuVarP = ((anty) chrwVar.e.b()).p(((alrj) chrwVar.g.b()).q(this.c));
            this.a = 1;
            obj = fdxs.c(eijuVarP, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj;
        if (resolvedRecipient == null) {
            ekrw ekrwVarH = chrw.b.h();
            ekrwVarH.X(eksq.a, "BugleProfiles");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/profile/transport/ProfileActionSenderImpl$revokeProfileInfoFromParticipant$1", "invokeSuspend", 169, "ProfileActionSenderImpl.kt")).t("Not revoking profile info for %s, unable to find recipient", this.c.R());
            return fctx.a;
        }
        chrw chrwVar2 = this.b;
        ekgb ekgbVarR = ekgb.r(resolvedRecipient);
        ekgbVarR.getClass();
        chrwVar2.b(ekgbVarR, 1);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chro(this.b, this.c, fcxyVar);
    }
}
