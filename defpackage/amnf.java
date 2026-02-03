package defpackage;

import android.os.Build;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amnf implements amng {
    public static final eksp a = eksp.c("BugleConversation");
    public final eosc b;
    public final fcsu c;
    private final eosc d;
    private final amnk e;

    public amnf(eosc eoscVar, eosc eoscVar2, amnk amnkVar, fcsu fcsuVar) {
        this.b = eoscVar;
        this.d = eoscVar2;
        this.e = amnkVar;
        this.c = fcsuVar;
    }

    @Override // defpackage.amng
    public final eiju a(final ajts ajtsVar, final ekgb ekgbVar) {
        final eiju eijuVarB = this.e.b();
        return eijx.k(eijuVarB).b(new eooy() { // from class: amne
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                boolean zBooleanValue = ((Boolean) eork.q(eijuVarB)).booleanValue();
                amnf amnfVar = this.a;
                boolean zA = ((aqbh) amnfVar.c.b()).a();
                final ekgb ekgbVar2 = ekgbVar;
                final boolean z = zA && ekgbVar2.size() == 1 && ((ResolvedRecipient) ekgbVar2.get(0)).g().B();
                if (!zBooleanValue && !z) {
                    return eijx.e(ajli.NOT_DEFAULT_SMS_APP);
                }
                final ajts ajtsVar2 = ajtsVar;
                final aoer aoerVarH = ajtsVar2.h();
                eiju eijuVarB2 = aoerVarH != null ? aoerVarH.f().b() : eijx.e(aoio.b);
                final eiju eijuVarB3 = aoerVarH != null ? aoerVarH.e().b() : eijx.e(aoff.a);
                final eiju eijuVar = eijuVarB2;
                return eijx.k(eijuVarB2, eijuVarB3).a(new Callable() { // from class: amnd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ajli ajliVar;
                        aoer aoerVarH2;
                        alqm alqmVar;
                        aoer aoerVarH3;
                        eksp ekspVar = amnf.a;
                        aoio aoioVar = (aoio) eork.q(eijuVar);
                        ajts ajtsVar3 = ajtsVar2;
                        Object objQ = eork.q(eijuVarB3);
                        aoff aoffVar = aoff.e;
                        if (ajtsVar3.z()) {
                            eksl ekslVar = (eksl) amnf.a.j();
                            ekslVar.X(cqnc.t, ajtsVar3.d());
                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 129, "BugleComposeDisabler.java")).q("No conversation found for ComposeDisabler");
                            ajliVar = ajli.CONVERSATION_UNKNOWN;
                        } else if (ajtsVar3.f() != akbl.b) {
                            eksl ekslVar2 = (eksl) amnf.a.j();
                            ekslVar2.X(cqnc.t, ajtsVar3.d());
                            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 137, "BugleComposeDisabler.java")).q("Compose Disabled: Conversation not approved by parent.");
                            ajliVar = ajli.PARENTAL_APPROVAL_REQUIRED;
                        } else if (aoerVarH != null || z) {
                            int iOrdinal = ajtsVar3.F().ordinal();
                            if (iOrdinal == 1) {
                                eksl ekslVar3 = (eksl) amnf.a.h();
                                ekslVar3.X(cqnc.t, ajtsVar3.d());
                                ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 167, "BugleComposeDisabler.java")).q("Compose Disabled: The RCS group has no other members.");
                                ajliVar = ajli.GROUP_EMPTY;
                            } else if (iOrdinal == 2) {
                                eksl ekslVar4 = (eksl) amnf.a.h();
                                ekslVar4.X(cqnc.t, ajtsVar3.d());
                                ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 173, "BugleComposeDisabler.java")).q("Compose Disabled: The RCS group is too large.");
                                ajliVar = ajli.GROUP_TOO_LARGE;
                            } else if (iOrdinal == 3) {
                                eksl ekslVar5 = (eksl) amnf.a.j();
                                ekslVar5.X(cqnc.t, ajtsVar3.d());
                                ((eksl) ekslVar5.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 161, "BugleComposeDisabler.java")).q("Compose Disabled: The RCS group was not found on the server.");
                                ajliVar = ajli.CONVERSATION_UNKNOWN;
                            } else {
                                if (iOrdinal == 4) {
                                    throw new IllegalStateException("UNRECOGNIZED ConversationErrorState");
                                }
                                if (ajtsVar3.B() == 9) {
                                    eksl ekslVar6 = (eksl) amnf.a.h();
                                    ekslVar6.X(cqnc.t, ajtsVar3.d());
                                    ((eksl) ekslVar6.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 186, "BugleComposeDisabler.java")).q("Compose Disabled: The satellite communication has ended.");
                                    ajliVar = ajli.CONVERSATION_ENDED;
                                } else if (ajtsVar3.B() == 8) {
                                    eksl ekslVar7 = (eksl) amnf.a.h();
                                    ekslVar7.X(cqnc.t, ajtsVar3.d());
                                    ((eksl) ekslVar7.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 195, "BugleComposeDisabler.java")).q("Compose Disabled: The RCS group creation is in progress.");
                                    ajliVar = ajli.RCS_GROUP_CREATION_IN_PROGRESS;
                                } else if (ajtsVar3.B() != 0 && ajtsVar3.B() != 1) {
                                    eksl ekslVar8 = (eksl) amnf.a.h();
                                    ekslVar8.X(cqnc.t, ajtsVar3.d());
                                    ((eksl) ekslVar8.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 204, "BugleComposeDisabler.java")).q("Compose Disabled: The user is no longer a member of this group.");
                                    ajliVar = ajli.GROUP_NOT_A_MEMBER;
                                } else if (objQ == aoffVar && bvdi.b(ajtsVar3.A())) {
                                    eksl ekslVar9 = (eksl) amnf.a.h();
                                    ekslVar9.X(cqnc.t, ajtsVar3.d());
                                    ((eksl) ekslVar9.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 212, "BugleComposeDisabler.java")).q("Compose Disabled: Group chat is not supported by manual satellite.");
                                    ajliVar = ajli.GROUP_UNSUPPORTED_BY_MANUAL_SATELLITE;
                                } else if (bvdi.d(ajtsVar3.A()) && !aoioVar.a()) {
                                    eksl ekslVar10 = (eksl) amnf.a.h();
                                    ekslVar10.X(cqnc.t, ajtsVar3.d());
                                    ((eksl) ekslVar10.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 221, "BugleComposeDisabler.java")).q("Compose Disabled: This is an RCS group and RCS is not connected.");
                                    ajliVar = aoioVar == aoio.c ? ajli.RCS_UNSUPPORTED_BY_CARRIER : ajli.RCS_DISCONNECTED;
                                } else if (bvdi.b(ajtsVar3.A()) && (aoerVarH2 = ajtsVar3.h()) != null && ((alqmVar = (alqm) aoerVarH2.o().orElse(null)) == null || alqmVar.w())) {
                                    eksl ekslVar11 = (eksl) amnf.a.h();
                                    ekslVar11.X(cqnc.t, ajtsVar3.d());
                                    ((eksl) ekslVar11.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 236, "BugleComposeDisabler.java")).q("Compose Disabled: This is a group and self phone number is unknown.");
                                    ajliVar = ajli.GROUP_NO_SELF_NUMBER;
                                } else {
                                    eksl ekslVar12 = (eksl) amnf.a.h();
                                    ekslVar12.X(cqnc.t, ajtsVar3.d());
                                    ((eksl) ekslVar12.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 245, "BugleComposeDisabler.java")).q("Compose is Enabled.");
                                    ajliVar = ajli.NONE;
                                }
                            }
                        } else {
                            eksl ekslVar13 = (eksl) amnf.a.j();
                            ekslVar13.X(cqnc.t, ajtsVar3.d());
                            ((eksl) ekslVar13.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "getComposeDisabledFromConversationProperties", 146, "BugleComposeDisabler.java")).q("Compose Disabled: No active Self Identity.");
                            ajliVar = ajli.SELFIDENTITY_UNAVAILABLE;
                        }
                        ajli ajliVar2 = ajli.NONE;
                        if (ajliVar != ajliVar2) {
                            return ajliVar;
                        }
                        ekgb ekgbVar3 = ekgbVar2;
                        boolean zA2 = aoioVar.a();
                        if (ekgbVar3.size() <= 1) {
                            if (ekgbVar3.isEmpty()) {
                                eksl ekslVar14 = (eksl) amnf.a.j();
                                ekslVar14.X(cqnc.t, ajtsVar3.d());
                                ((eksl) ekslVar14.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "handleOneOnOneRecipientReasons", 260, "BugleComposeDisabler.java")).r("Compose Disabled: This conversation has no recipients. Conversation type %d.", ajtsVar3.A());
                                return ajli.GROUP_EMPTY;
                            }
                            ResolvedRecipient resolvedRecipient = (ResolvedRecipient) ekgbVar3.get(0);
                            if (resolvedRecipient.C()) {
                                eksl ekslVar15 = (eksl) amnf.a.h();
                                ekslVar15.X(cqnc.t, ajtsVar3.d());
                                ((eksl) ekslVar15.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "handleOneOnOneRecipientReasons", 272, "BugleComposeDisabler.java")).q("Compose Disabled: This is an incoming-only recipient.");
                                return ajli.RECIPIENT_INCOMING_ONLY;
                            }
                            if (resolvedRecipient.g().A() && !zA2) {
                                eksl ekslVar16 = (eksl) amnf.a.h();
                                ekslVar16.X(cqnc.t, ajtsVar3.d());
                                ((eksl) ekslVar16.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "handleOneOnOneRecipientReasons", 280, "BugleComposeDisabler.java")).q("Compose Disabled: This is an RBM conversation and RCS is not connected.");
                                return ajli.RCS_DISCONNECTED;
                            }
                            if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && resolvedRecipient.g().z()) {
                                if (!zA2) {
                                    eksl ekslVar17 = (eksl) amnf.a.h();
                                    ekslVar17.X(cqnc.t, ajtsVar3.d());
                                    ((eksl) ekslVar17.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "handleOneOnOneRecipientReasons", 291, "BugleComposeDisabler.java")).q("Compose Disabled: This is an RCS required conversation and RCS is not connected");
                                    return ajli.RCS_DISCONNECTED;
                                }
                                if (((Boolean) crbf.aq.e()).booleanValue() && (aoerVarH3 = ajtsVar3.h()) != null && !aoerVarH3.j().e()) {
                                    eksl ekslVar18 = (eksl) amnf.a.h();
                                    ekslVar18.X(cqnc.t, ajtsVar3.d());
                                    ((eksl) ekslVar18.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/disable/BugleComposeDisabler", "handleOneOnOneRecipientReasons", 301, "BugleComposeDisabler.java")).q("Compose Disabled: This is an RCS Tachygram required conversation and current transport type does not support Penpal");
                                    return ajli.RCS_UNSUPPORTED_BY_CARRIER;
                                }
                            }
                        }
                        return ajliVar2;
                    }
                }, amnfVar.b);
            }
        }, Build.VERSION.SDK_INT <= 26 ? this.d : this.b);
    }
}
