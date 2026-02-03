package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chrs extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ amlm c;
    final /* synthetic */ chrw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chrs(amlm amlmVar, chrw chrwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = amlmVar;
        this.d = chrwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chrs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ekgb ekgbVarS;
        Object objA;
        Optional optionalO;
        int i;
        fcyl fcylVar = fcyl.a;
        int i2 = this.b;
        if (i2 == 0) {
            fctl.b(obj);
            amlm amlmVar = this.c;
            ekgbVarS = amlmVar.s();
            ekrw ekrwVarH = chrw.b.h();
            ekrwVarH.X(eksq.a, "BugleProfiles");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/profile/transport/ProfileActionSenderImpl$shareProfileInfoToRecipientsIfEligible$1", "invokeSuspend", 68, "ProfileActionSenderImpl.kt")).q("Starting profile action sender: share");
            chrw chrwVar = this.d;
            aoer aoerVarG = amlmVar.g();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : ekgbVarS) {
                if (!fdbq.f(((ResolvedRecipient) obj2).g(), (aoerVarG == null || (optionalO = aoerVarG.o()) == null) ? null : (alqm) fdct.b(optionalO))) {
                    arrayList.add(obj2);
                }
            }
            chlv chlvVar = chrwVar.d;
            ekgb ekgbVarA = ekfv.a(arrayList);
            this.a = ekgbVarS;
            this.b = 1;
            objA = chlvVar.a(amlmVar, ekgbVarA, null, this);
            if (objA == fcylVar) {
                return fcylVar;
            }
        } else {
            if (i2 != 1) {
                fctl.b(obj);
                i = 3;
                ((chjq) this.d.f.b()).c(i);
                ekrw ekrwVarH2 = chrw.b.h();
                ekrwVarH2.X(eksq.a, "BugleProfiles");
                ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/profile/transport/ProfileActionSenderImpl$shareProfileInfoToRecipientsIfEligible$1", "invokeSuspend", 90, "ProfileActionSenderImpl.kt")).q("Finished profile action sender: share");
                return fctx.a;
            }
            Object obj3 = this.a;
            fctl.b(obj);
            ekgbVarS = obj3;
            objA = obj;
        }
        chrw chrwVar2 = this.d;
        chps chpsVar = (chps) objA;
        chjq chjqVar = (chjq) chrwVar2.f.b();
        chpr chprVar = chpsVar.a;
        ((ains) chjqVar.a.b()).e("Bugle.Profile.Share.Event.Count", chprVar.r);
        if (chprVar != chpr.b) {
            ekrw ekrwVarH3 = chrw.b.h();
            ekrwVarH3.X(eksq.a, "BugleProfiles");
            ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/shared/profile/transport/ProfileActionSenderImpl$shareProfileInfoToRecipientsIfEligible$1", "invokeSuspend", 79, "ProfileActionSenderImpl.kt")).t("Unable to share profile with recipients: %s", chprVar);
            return fctx.a;
        }
        chpt chptVar = chpsVar.b;
        if (chptVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (!chptVar.h) {
            this.a = null;
            i = 3;
            this.b = 3;
            if (chrwVar2.f(chptVar, this) == fcylVar) {
                return fcylVar;
            }
            ((chjq) this.d.f.b()).c(i);
            ekrw ekrwVarH22 = chrw.b.h();
            ekrwVarH22.X(eksq.a, "BugleProfiles");
            ((ekrd) ekrwVarH22.h("com/google/android/apps/messaging/shared/profile/transport/ProfileActionSenderImpl$shareProfileInfoToRecipientsIfEligible$1", "invokeSuspend", 90, "ProfileActionSenderImpl.kt")).q("Finished profile action sender: share");
            return fctx.a;
        }
        ekgbVarS.getClass();
        awjl awjlVarR = this.c.r();
        this.a = null;
        this.b = 2;
        if (chrwVar2.g(chptVar, ekgbVarS, awjlVarR, this) == fcylVar) {
            return fcylVar;
        }
        i = 3;
        ((chjq) this.d.f.b()).c(i);
        ekrw ekrwVarH222 = chrw.b.h();
        ekrwVarH222.X(eksq.a, "BugleProfiles");
        ((ekrd) ekrwVarH222.h("com/google/android/apps/messaging/shared/profile/transport/ProfileActionSenderImpl$shareProfileInfoToRecipientsIfEligible$1", "invokeSuspend", 90, "ProfileActionSenderImpl.kt")).q("Finished profile action sender: share");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chrs(this.c, this.d, fcxyVar);
    }
}
