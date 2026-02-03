package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfob implements cfmt {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate");
    public final eosc b;
    public final eosc c;
    public final fcsu d;
    public final alrj e;
    public final cmpy f;
    public final asrh g;
    public final fcsu h;
    public final cogw i;
    public final fcsu j;

    public cfob(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, alrj alrjVar, cmpy cmpyVar, asrh asrhVar, fcsu fcsuVar2, cogw cogwVar, fcsu fcsuVar3) {
        this.b = eoscVar;
        this.c = eoscVar2;
        this.d = fcsuVar;
        this.e = alrjVar;
        this.f = cmpyVar;
        this.g = asrhVar;
        this.h = fcsuVar2;
        this.i = cogwVar;
        this.j = fcsuVar3;
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ eiju a(cfmy cfmyVar) {
        return cfms.a(this, cfmyVar);
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ eiju b(cfmy cfmyVar, evuh evuhVar) {
        return eijx.c();
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ evuh c(evqs evqsVar) {
        return (epfa) evsn.parseFrom(epfa.a, evqsVar, evrr.a());
    }

    @Override // defpackage.cfmt
    public final /* bridge */ /* synthetic */ eiju d(cfmy cfmyVar, evuh evuhVar) {
        final epfa epfaVar = (epfa) evuhVar;
        if ((epfaVar.b & 1) != 0) {
            return eijx.g(new Callable() { // from class: cfnv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bakt baktVar = (bakt) this.a.d.b();
                    epey epeyVar = epfaVar.c;
                    if (epeyVar == null) {
                        epeyVar = epey.a;
                    }
                    return baktVar.r(barn.b(epeyVar.c));
                }
            }, this.b).i(new eooz() { // from class: cfnw
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final bojh bojhVar = (bojh) obj;
                    if (bojhVar == null) {
                        ekrw ekrwVarE = cfob.a.e();
                        ekrwVarE.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "handleRequestInternalForOptionalResponse", 113, "TypingUpdateDelegate.java")).q("Cannot find conversation for typing indicator.");
                        return eijx.e(Optional.empty());
                    }
                    final epfa epfaVar2 = epfaVar;
                    final cfob cfobVar = this.a;
                    cqle cqleVar = (cqle) cfobVar.j.b();
                    epes epesVar = epfaVar2.d;
                    if (epesVar == null) {
                        epesVar = epes.a;
                    }
                    Optional optionalA = cqleVar.a(epesVar);
                    if (!optionalA.isEmpty()) {
                        final int iIntValue = ((Integer) optionalA.get()).intValue();
                        eiju eijuVarG = eijx.g(new Callable() { // from class: cfny
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ekrw ekrwVarE2 = cfob.a.e();
                                ekrwVarE2.X(eksq.a, "BugleNetwork");
                                ekrd ekrdVar = (ekrd) ekrwVarE2;
                                int i = iIntValue;
                                ekrdVar.X(cqnc.w, Integer.valueOf(i));
                                ekrdVar.X(cqnc.s, bojhVar.C());
                                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "handleTypingUpdatesWithChatApi", 145, "TypingUpdateDelegate.java")).q("Checking whether current subscription ID supports sending typing indicators.");
                                return Boolean.valueOf(cfobVar.f.b(i));
                            }
                        }, cfobVar.b);
                        eooz eoozVar = new eooz() { // from class: cfnz
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                final bojh bojhVar2 = bojhVar;
                                if (!zBooleanValue) {
                                    ekrw ekrwVarJ = cfob.a.j();
                                    ekrwVarJ.X(eksq.a, "BugleNetwork");
                                    ekrd ekrdVar = (ekrd) ekrwVarJ;
                                    ekrdVar.X(cqnc.s, bojhVar2.C());
                                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "handleTypingUpdatesWithChatApi", 157, "TypingUpdateDelegate.java")).q("Not sending typing indicator because typing indicator should not be shared for the subscription ID.");
                                    return eijx.e(Optional.empty());
                                }
                                final cfob cfobVar2 = cfobVar;
                                if (bojhVar2.k() != 2) {
                                    String strAb = bojhVar2.ab();
                                    if (!ejwk.c(strAb)) {
                                        return eijx.e(Optional.of(new asrg(((asqx) cfobVar2.h.b()).a(strAb, false))));
                                    }
                                    ekrw ekrwVarJ2 = cfob.a.j();
                                    ekrwVarJ2.X(eksq.a, "BugleNetwork");
                                    ekrd ekrdVar2 = (ekrd) ekrwVarJ2;
                                    ekrdVar2.X(cqnc.s, bojhVar2.C());
                                    ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "getRecipientsDescriptor", 198, "TypingUpdateDelegate.java")).q("Not sending typing indicator because the other participant does not have a valid normalized destination");
                                    return eijx.e(Optional.empty());
                                }
                                final String strAe = bojhVar2.ae();
                                if (ejwk.c(strAe)) {
                                    ekrw ekrwVarJ3 = cfob.a.j();
                                    ekrwVarJ3.X(eksq.a, "BugleNetwork");
                                    ekrd ekrdVar3 = (ekrd) ekrwVarJ3;
                                    ekrdVar3.X(cqnc.s, bojhVar2.C());
                                    ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "getGroupRecipientsDescriptor", 220, "TypingUpdateDelegate.java")).q("Not sending typing indicator because RCS group id is missing");
                                    return eijx.e(Optional.empty());
                                }
                                final String strAd = bojhVar2.ad();
                                if (!ejwk.c(strAd)) {
                                    return eijx.g(new Callable() { // from class: cfnx
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            String str;
                                            int i = ekgb.d;
                                            ekfw ekfwVar = new ekfw();
                                            cfob cfobVar3 = cfobVar2;
                                            bakt baktVar = (bakt) cfobVar3.d.b();
                                            bojh bojhVar3 = bojhVar2;
                                            Iterator it = baktVar.K(bojhVar3.C()).iterator();
                                            while (true) {
                                                str = strAe;
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                                                if (ejwk.c(bindData.T())) {
                                                    ekrw ekrwVarJ4 = cfob.a.j();
                                                    ekrwVarJ4.X(eksq.a, "BugleNetwork");
                                                    ekrd ekrdVar4 = (ekrd) ekrwVarJ4;
                                                    ekrdVar4.X(cqnc.s, bojhVar3.C());
                                                    ekrdVar4.X(cqnc.N, str);
                                                    ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "getGroupRecipientsDescriptor", 246, "TypingUpdateDelegate.java")).q("Ignoring participant with invalid normalized destination while sending typing indicator");
                                                } else {
                                                    ekfwVar.h(cfobVar3.e.q(bindData));
                                                }
                                            }
                                            ekgb ekgbVarG = ekfwVar.g();
                                            if (!ekgbVarG.isEmpty()) {
                                                return Optional.of(cfobVar3.g.d(str, strAd, ekgbVarG));
                                            }
                                            ekrw ekrwVarJ5 = cfob.a.j();
                                            ekrwVarJ5.X(eksq.a, "BugleNetwork");
                                            ekrd ekrdVar5 = (ekrd) ekrwVarJ5;
                                            ekrdVar5.X(cqnc.s, bojhVar3.C());
                                            ekrdVar5.X(cqnc.N, str);
                                            ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "getGroupRecipientsDescriptor", 262, "TypingUpdateDelegate.java")).q("Not sending typing indicator because no valid participant found in the conference");
                                            return Optional.empty();
                                        }
                                    }, cfobVar2.b);
                                }
                                ekrw ekrwVarJ4 = cfob.a.j();
                                ekrwVarJ4.X(eksq.a, "BugleNetwork");
                                ekrd ekrdVar4 = (ekrd) ekrwVarJ4;
                                ekrdVar4.X(cqnc.s, bojhVar2.C());
                                ekrdVar4.X(cqnc.N, strAe);
                                ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "getGroupRecipientsDescriptor", 230, "TypingUpdateDelegate.java")).q("Not sending typing indicator because RCS conference URI is missing");
                                return eijx.e(Optional.empty());
                            }
                        };
                        eosc eoscVar = cfobVar.c;
                        return eijuVarG.i(eoozVar, eoscVar).i(new eooz() { // from class: cfoa
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                Optional optional = (Optional) obj2;
                                if (optional.isEmpty()) {
                                    return eijx.e(Optional.empty());
                                }
                                epfa epfaVar3 = epfaVar2;
                                cfob cfobVar2 = cfobVar;
                                epey epeyVar = epfaVar3.c;
                                if (epeyVar == null) {
                                    epeyVar = epey.a;
                                }
                                return cfobVar2.f.a(epeyVar.e ? cmpx.ACTIVE : cmpx.IDLE, (asrg) optional.get(), cfobVar2.i.f(), iIntValue).h(new ejvr() { // from class: cfnu
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        return Optional.empty();
                                    }
                                }, eoqg.a);
                            }
                        }, eoscVar);
                    }
                    ekrw ekrwVarJ = cfob.a.j();
                    ekrwVarJ.X(eksq.a, "BugleNetwork");
                    ekrd ekrdVar = (ekrd) ekrwVarJ;
                    ekrdVar.X(cqnc.s, bojhVar.C());
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "handleTypingUpdatesWithChatApi", 133, "TypingUpdateDelegate.java")).q("Not sending typing indicator because the subscription ID was DEFAULT_SELF_SUB_ID");
                    return eijx.e(Optional.empty());
                }
            }, this.c);
        }
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "handleRequestInternalForOptionalResponse", 98, "TypingUpdateDelegate.java")).q("TypingUpdatesRequest does not have typing event.");
        return eijx.e(Optional.empty());
    }
}
