package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atyp extends cayv {
    private static final ekrg h = ekrg.c("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler");
    public final aypy a;
    public final fcsu b;
    public final fcsu c;
    public final eosc d;
    public final eosc e;
    public final clec f;
    public final fcsu g;
    private final cden i;
    private final fcsu j;
    private final Map k;
    private final asry l;
    private final atah m;
    private final fcsu n;
    private final fcsu o;
    private final cogw p;
    private final asbt q;

    public atyp(aypy aypyVar, cden cdenVar, fcsu fcsuVar, fcsu fcsuVar2, clec clecVar, asry asryVar, atah atahVar, fcsu fcsuVar3, fcsu fcsuVar4, Map map, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar5, fcsu fcsuVar6, cogw cogwVar, asbt asbtVar) {
        this.a = aypyVar;
        this.i = cdenVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.f = clecVar;
        this.l = asryVar;
        this.m = atahVar;
        this.n = fcsuVar3;
        this.j = fcsuVar4;
        this.k = map;
        this.d = eoscVar;
        this.e = eoscVar2;
        this.g = fcsuVar5;
        this.o = fcsuVar6;
        this.p = cogwVar;
        this.q = asbtVar;
    }

    private final eiju m(augz augzVar, auhf auhfVar, evvp evvpVar, enxu enxuVar) {
        aubl aublVar = augzVar.c;
        if (aublVar == null) {
            aublVar = aubl.a;
        }
        aubl aublVar2 = aublVar;
        evvp evvpVarB = augzVar.e;
        if (evvpVarB == null) {
            evvpVarB = evvp.a;
        }
        Instant instantF = this.p.f();
        if (evwz.d(evvpVarB).isBefore(evwz.d(evvpVar))) {
            ekrw ekrwVarH = h.h();
            ekrwVarH.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "getValidTimestamp", 679, "SendChatMessageResponseHandler.java")).q("Overriding transport sent timestamp because is in the past");
            evvpVarB = evwz.b(instantF);
        } else if (evwz.d(evvpVarB).isAfter(instantF)) {
            ekrw ekrwVarH2 = h.h();
            ekrwVarH2.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "getValidTimestamp", 683, "SendChatMessageResponseHandler.java")).q("Overriding transport sent timestamp because is in the future");
            evvpVarB = evwz.b(instantF);
        }
        evvp evvpVar2 = evvpVarB;
        boolean z = augzVar.f;
        elpg elpgVar = augzVar.h;
        if (elpgVar == null) {
            elpgVar = elpg.b;
        }
        elpg elpgVar2 = elpgVar;
        augm augmVar = augzVar.g;
        if (augmVar == null) {
            augmVar = augm.a;
        }
        return n(auhfVar, aublVar2, evvpVar2, z, elpgVar2, augmVar, enxuVar);
    }

    private final eiju n(final auhf auhfVar, final aubl aublVar, final evvp evvpVar, final boolean z, final elpg elpgVar, final augm augmVar, final enxu enxuVar) {
        return ((ciza) this.o.b()).a(ciyz.SENT).i(new eooz() { // from class: atyk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final auhf auhfVar2 = auhfVar;
                final basd basdVarA = basd.a(auhfVar2.e);
                final atyp atypVar = this.a;
                assc asscVar = (assc) atypVar.g.b();
                auib auibVar = auhfVar2.g;
                if (auibVar == null) {
                    auibVar = auib.a;
                }
                final elpg elpgVar2 = elpgVar;
                asscVar.a(auibVar, basdVarA);
                enyw enywVarB = enyw.b(elpgVar2.Y);
                if (enywVarB == null) {
                    enywVarB = enyw.UNKNOWN_RCS_TYPE;
                }
                final enxu enxuVar2 = enxuVar;
                final augm augmVar2 = augmVar;
                final boolean z2 = z;
                final evvp evvpVar2 = evvpVar;
                eiju eijuVarL = atypVar.l(aublVar, auhfVar2, enywVarB);
                ejvr ejvrVar = new ejvr() { // from class: atyf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return atypVar.a.e(basdVarA, (aubl) obj2, evwz.d(evvpVar2), z2, elpgVar2, augmVar2, enxuVar2);
                    }
                };
                eosc eoscVar = atypVar.d;
                return eijuVarL.h(ejvrVar, eoscVar).i(new eooz() { // from class: atyg
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return ((Action) obj2).e();
                    }
                }, eoscVar).h(new ejvr() { // from class: atyh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        auib auibVar2 = auhfVar2.g;
                        if (auibVar2 == null) {
                            auibVar2 = auib.a;
                        }
                        ((assc) atypVar.g.b()).b(auibVar2, basdVarA);
                        return atav.SUCCESS;
                    }
                }, eoscVar);
            }
        }, this.d);
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("SendChatMessageResponseHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return augz.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        return k((augz) evuhVar).h(new ejvr() { // from class: atyi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int iOrdinal = ((atav) obj).ordinal();
                return iOrdinal != 0 ? iOrdinal != 1 ? cbcw.k() : cbcw.m() : cbcw.i();
            }
        }, eoqg.a);
    }

    final eiju k(final augz augzVar) {
        int i;
        int i2;
        enxu enxuVar;
        int i3;
        final basd basdVar;
        final int i4;
        try {
            final auhf auhfVar = (auhf) evsn.parseFrom(auhf.a, augzVar.d, evrr.a());
            aubl aublVar = augzVar.c;
            if (aublVar == null) {
                aublVar = aubl.a;
            }
            ekrg ekrgVar = h;
            ekrw ekrwVarE = ekrgVar.e();
            ekrz ekrzVar = eksq.a;
            ekrwVarE.X(ekrzVar, "BugleDataModel");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrz ekrzVar2 = cqnc.f;
            ekrdVar.X(ekrzVar2, basd.a(auhfVar.e));
            ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "processSendChatMessageResponse", 176, "SendChatMessageResponseHandler.java");
            aubk aubkVarB = aubk.b(aublVar.c);
            if (aubkVarB == null) {
                aubkVarB = aubk.UNKNOWN_STATUS;
            }
            aubi aubiVarB = aubi.b(aublVar.d);
            if (aubiVarB == null) {
                aubiVarB = aubi.UNKNOWN_CAUSE;
            }
            ekrdVar2.D("Received response for sent message [chatApiResult.status=%s, chatApiResult.cause=%s]", aubkVarB, aubiVarB);
            aubk aubkVarB2 = aubk.b(aublVar.c);
            if (aubkVarB2 == null) {
                aubkVarB2 = aubk.UNKNOWN_STATUS;
            }
            if (aubkVarB2 == aubk.FAILED_PERMANENTLY || aubkVarB2 == aubk.FAILED_TRANSIENTLY) {
                enxt enxtVar = (enxt) enxu.a.createBuilder();
                i = 4;
                enxv enxvVar = (enxv) enxw.a.createBuilder();
                enxvVar.copyOnWrite();
                i2 = 1;
                enxw enxwVar = (enxw) enxvVar.instance;
                enxwVar.e = 2;
                enxwVar.b |= 4;
                enxk enxkVar = (enxk) this.l.fM(aubkVarB2);
                enxvVar.copyOnWrite();
                enxw enxwVar2 = (enxw) enxvVar.instance;
                enxwVar2.g = enxkVar.f;
                enxwVar2.b |= 16;
                atah atahVar = this.m;
                aubi aubiVarB2 = aubi.b(aublVar.d);
                if (aubiVarB2 == null) {
                    aubiVarB2 = aubi.UNKNOWN_CAUSE;
                }
                enxi enxiVar = (enxi) atahVar.fM(aubiVarB2);
                enxvVar.copyOnWrite();
                enxw enxwVar3 = (enxw) enxvVar.instance;
                enxwVar3.f = enxiVar.D;
                enxwVar3.b |= 8;
                enxtVar.copyOnWrite();
                enxu enxuVar2 = (enxu) enxtVar.instance;
                enxw enxwVar4 = (enxw) enxvVar.build();
                enxwVar4.getClass();
                enxuVar2.c = enxwVar4;
                enxuVar2.b |= 1;
                enxuVar = (enxu) enxtVar.build();
            } else {
                enxuVar = null;
                i2 = 1;
                i = 4;
            }
            switch (auhfVar.c) {
                case 0:
                    i3 = 11;
                    break;
                case 1:
                case 8:
                case 9:
                case 11:
                case 12:
                default:
                    i3 = 0;
                    break;
                case 2:
                    i3 = i2;
                    break;
                case 3:
                    i3 = 2;
                    break;
                case 4:
                    i3 = 3;
                    break;
                case 5:
                    i3 = i;
                    break;
                case 6:
                    i3 = 5;
                    break;
                case 7:
                    i3 = 6;
                    break;
                case 10:
                    i3 = 7;
                    break;
                case 13:
                    i3 = 8;
                    break;
                case 14:
                    i3 = 9;
                    break;
                case 15:
                    i3 = 10;
                    break;
            }
            if (i3 == 0) {
                throw null;
            }
            switch (i3 - 1) {
                case 0:
                    enxu enxuVar3 = enxuVar;
                    if (this.q.a()) {
                        evvp evvpVar = (auhfVar.c == 2 ? (augu) auhfVar.d : augu.a).c;
                        if (evvpVar == null) {
                            evvpVar = evvp.a;
                        }
                        return m(augzVar, auhfVar, evvpVar, enxuVar3);
                    }
                    aubl aublVar2 = augzVar.c;
                    if (aublVar2 == null) {
                        aublVar2 = aubl.a;
                    }
                    aubl aublVar3 = aublVar2;
                    evvp evvpVar2 = (auhfVar.c == 2 ? (augu) auhfVar.d : augu.a).c;
                    if (evvpVar2 == null) {
                        evvpVar2 = evvp.a;
                    }
                    boolean z = augzVar.f;
                    elpg elpgVar = augzVar.h;
                    if (elpgVar == null) {
                        elpgVar = elpg.b;
                    }
                    augm augmVar = augzVar.g;
                    if (augmVar == null) {
                        augmVar = augm.a;
                    }
                    return n(auhfVar, aublVar3, evvpVar2, z, elpgVar, augmVar, enxuVar3);
                case 1:
                    enxu enxuVar4 = enxuVar;
                    if (this.q.a()) {
                        evvp evvpVar3 = (auhfVar.c == 3 ? (auhd) auhfVar.d : auhd.a).c;
                        if (evvpVar3 == null) {
                            evvpVar3 = evvp.a;
                        }
                        return m(augzVar, auhfVar, evvpVar3, enxuVar4);
                    }
                    aubl aublVar4 = augzVar.c;
                    if (aublVar4 == null) {
                        aublVar4 = aubl.a;
                    }
                    aubl aublVar5 = aublVar4;
                    evvp evvpVar4 = (auhfVar.c == 3 ? (auhd) auhfVar.d : auhd.a).c;
                    if (evvpVar4 == null) {
                        evvpVar4 = evvp.a;
                    }
                    boolean z2 = augzVar.f;
                    elpg elpgVar2 = augzVar.h;
                    if (elpgVar2 == null) {
                        elpgVar2 = elpg.b;
                    }
                    augm augmVar2 = augzVar.g;
                    if (augmVar2 == null) {
                        augmVar2 = augm.a;
                    }
                    return n(auhfVar, aublVar5, evvpVar4, z2, elpgVar2, augmVar2, enxuVar4);
                case 2:
                    enxu enxuVar5 = enxuVar;
                    if (this.q.a()) {
                        evvp evvpVar5 = (auhfVar.c == i ? (auhb) auhfVar.d : auhb.a).c;
                        if (evvpVar5 == null) {
                            evvpVar5 = evvp.a;
                        }
                        return m(augzVar, auhfVar, evvpVar5, enxuVar5);
                    }
                    aubl aublVar6 = augzVar.c;
                    if (aublVar6 == null) {
                        aublVar6 = aubl.a;
                    }
                    aubl aublVar7 = aublVar6;
                    evvp evvpVar6 = (auhfVar.c == 4 ? (auhb) auhfVar.d : auhb.a).c;
                    if (evvpVar6 == null) {
                        evvpVar6 = evvp.a;
                    }
                    boolean z3 = augzVar.f;
                    elpg elpgVar3 = augzVar.h;
                    if (elpgVar3 == null) {
                        elpgVar3 = elpg.b;
                    }
                    augm augmVar3 = augzVar.g;
                    if (augmVar3 == null) {
                        augmVar3 = augm.a;
                    }
                    return n(auhfVar, aublVar7, evvpVar6, z3, elpgVar3, augmVar3, enxuVar5);
                case 3:
                    final enxu enxuVar6 = enxuVar;
                    assc asscVar = (assc) this.g.b();
                    auib auibVar = auhfVar.g;
                    if (auibVar == null) {
                        auibVar = auib.a;
                    }
                    asscVar.a(auibVar, basd.a(auhfVar.e));
                    basd basdVarA = basd.a((auhfVar.c == 5 ? (auhl) auhfVar.d : auhl.a).c);
                    if (basdVarA.f().isEmpty()) {
                        ekrw ekrwVarJ = ekrgVar.j();
                        ekrwVarJ.X(ekrzVar, "BugleDataModel");
                        ekrd ekrdVar3 = (ekrd) ekrwVarJ;
                        ekrdVar3.X(ekrzVar2, basd.a(auhfVar.e));
                        ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessMessageReceipt", 437, "SendChatMessageResponseHandler.java")).q("Invalid empty RCS Message ID in receipt sent confirmation");
                        return eijx.e(atav.FAIL_NO_RETRY);
                    }
                    auhk auhkVarB = auhk.b((auhfVar.c == 5 ? (auhl) auhfVar.d : auhl.a).d);
                    if (auhkVarB == null) {
                        auhkVarB = auhk.UNKNOWN_RECEIPT_TYPE;
                    }
                    int iOrdinal = auhkVarB.ordinal();
                    int i5 = i2;
                    if (iOrdinal == i5) {
                        basdVar = basdVarA;
                        i4 = i5;
                    } else if (iOrdinal == 2) {
                        basdVar = basdVarA;
                        i4 = 10;
                    } else {
                        if (iOrdinal != 3) {
                            ekrw ekrwVarJ2 = ekrgVar.j();
                            ekrwVarJ2.X(ekrzVar, "BugleDataModel");
                            ekrd ekrdVar4 = (ekrd) ekrwVarJ2;
                            ekrdVar4.X(ekrzVar2, basdVarA);
                            ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessMessageReceipt", 456, "SendChatMessageResponseHandler.java")).q("Invalid SendMessageOpaqueData.receipt_type.");
                            return eijx.e(atav.FAIL_NO_RETRY);
                        }
                        basdVar = basdVarA;
                        i4 = 3;
                    }
                    return eijx.h(new eooy() { // from class: atym
                        @Override // defpackage.eooy
                        public final ListenableFuture a() {
                            augz augzVar2 = augzVar;
                            aubl aublVar8 = augzVar2.c;
                            if (aublVar8 == null) {
                                aublVar8 = aubl.a;
                            }
                            elpg elpgVar4 = augzVar2.h;
                            if (elpgVar4 == null) {
                                elpgVar4 = elpg.b;
                            }
                            final elpg elpgVar5 = elpgVar4;
                            final basd basdVar2 = basdVar;
                            final atyp atypVar = this.a;
                            final MessageCoreData messageCoreDataY = ((baxe) atypVar.b.b()).y(basdVar2);
                            aubk aubkVar = aubk.OK;
                            aubk aubkVarB3 = aubk.b(aublVar8.c);
                            if (aubkVarB3 == null) {
                                aubkVarB3 = aubk.UNKNOWN_STATUS;
                            }
                            final int i6 = i4;
                            if (aubkVar.equals(aubkVarB3)) {
                                ajhd ajhdVar = (ajhd) atypVar.c.b();
                                enyw enywVarB = enyw.b(elpgVar5.Y);
                                if (enywVarB == null) {
                                    enywVarB = enyw.UNKNOWN_RCS_TYPE;
                                }
                                ajhdVar.v(basdVar2, messageCoreDataY, i6, enywVarB);
                                return eijx.e(atav.SUCCESS);
                            }
                            enyw enywVarB2 = enyw.b(elpgVar5.Y);
                            if (enywVarB2 == null) {
                                enywVarB2 = enyw.UNKNOWN_RCS_TYPE;
                            }
                            auhf auhfVar2 = auhfVar;
                            final enxu enxuVar7 = enxuVar6;
                            return atypVar.l(aublVar8, auhfVar2, enywVarB2).i(new eooz() { // from class: atyl
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj) {
                                    aubk aubkVar2 = aubk.FAILED_PERMANENTLY;
                                    aubk aubkVarB4 = aubk.b(((aubl) obj).c);
                                    if (aubkVarB4 == null) {
                                        aubkVarB4 = aubk.UNKNOWN_STATUS;
                                    }
                                    atyp atypVar2 = atypVar;
                                    enxu enxuVarA = enxuVar7;
                                    int i7 = i6;
                                    basd basdVar3 = basdVar2;
                                    atypVar2.f.a(basdVar3, i7, aubkVar2.equals(aubkVarB4));
                                    ajhd ajhdVar2 = (ajhd) atypVar2.c.b();
                                    if (enxuVarA == null) {
                                        enxuVarA = chwn.a();
                                    }
                                    enxu enxuVar8 = enxuVarA;
                                    enyw enywVarB3 = enyw.b(elpgVar5.Y);
                                    if (enywVarB3 == null) {
                                        enywVarB3 = enyw.UNKNOWN_RCS_TYPE;
                                    }
                                    ajhdVar2.w(basdVar3, messageCoreDataY, i7, enxuVar8, enywVarB3);
                                    return eijx.e(atav.SUCCESS);
                                }
                            }, atypVar.e);
                        }
                    }, this.e).h(new ejvr() { // from class: atyn
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            assc asscVar2 = (assc) this.a.g.b();
                            auhf auhfVar2 = auhfVar;
                            auib auibVar2 = auhfVar2.g;
                            if (auibVar2 == null) {
                                auibVar2 = auib.a;
                            }
                            asscVar2.b(auibVar2, basd.a(auhfVar2.e));
                            return atav.SUCCESS;
                        }
                    }, this.d);
                case 4:
                    basd basdVarA2 = basd.a(auhfVar.e);
                    aubk aubkVar = aubk.OK;
                    aubl aublVar8 = augzVar.c;
                    if (aublVar8 == null) {
                        aublVar8 = aubl.a;
                    }
                    aubk aubkVarB3 = aubk.b(aublVar8.c);
                    if (aubkVarB3 == null) {
                        aubkVarB3 = aubk.UNKNOWN_STATUS;
                    }
                    if (aubkVar.equals(aubkVarB3)) {
                        ekrw ekrwVarH = ekrgVar.h();
                        ekrwVarH.X(ekrzVar, "BugleDataModel");
                        ekrd ekrdVar5 = (ekrd) ekrwVarH;
                        ekrdVar5.X(ekrzVar2, basdVarA2);
                        ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessTypingIndicator", 489, "SendChatMessageResponseHandler.java")).q("Typing indicator successfully sent.");
                    } else {
                        ekrw ekrwVarJ3 = ekrgVar.j();
                        ekrwVarJ3.X(ekrzVar, "BugleDataModel");
                        ekrd ekrdVar6 = (ekrd) ekrwVarJ3;
                        ekrdVar6.X(ekrzVar2, basdVarA2);
                        ((ekrd) ekrdVar6.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessTypingIndicator", 494, "SendChatMessageResponseHandler.java")).q("Typing indicator failed to send.");
                    }
                    fcsu fcsuVar = this.g;
                    assc asscVar2 = (assc) fcsuVar.b();
                    auib auibVar2 = auhfVar.g;
                    if (auibVar2 == null) {
                        auibVar2 = auib.a;
                    }
                    asscVar2.a(auibVar2, basd.a(auhfVar.e));
                    assc asscVar3 = (assc) fcsuVar.b();
                    auib auibVar3 = auhfVar.g;
                    if (auibVar3 == null) {
                        auibVar3 = auib.a;
                    }
                    asscVar3.b(auibVar3, basd.a(auhfVar.e));
                    return eijx.e(atav.SUCCESS);
                case 5:
                    if (this.q.a()) {
                        evvp evvpVar7 = (auhfVar.c == 7 ? (auhx) auhfVar.d : auhx.a).c;
                        if (evvpVar7 == null) {
                            evvpVar7 = evvp.a;
                        }
                        return m(augzVar, auhfVar, evvpVar7, enxuVar);
                    }
                    aubl aublVar9 = augzVar.c;
                    if (aublVar9 == null) {
                        aublVar9 = aubl.a;
                    }
                    aubl aublVar10 = aublVar9;
                    evvp evvpVar8 = (auhfVar.c == 7 ? (auhx) auhfVar.d : auhx.a).c;
                    if (evvpVar8 == null) {
                        evvpVar8 = evvp.a;
                    }
                    enxu enxuVar7 = enxuVar;
                    boolean z4 = augzVar.f;
                    elpg elpgVar4 = augzVar.h;
                    if (elpgVar4 == null) {
                        elpgVar4 = elpg.b;
                    }
                    augm augmVar4 = augzVar.g;
                    if (augmVar4 == null) {
                        augmVar4 = augm.a;
                    }
                    return n(auhfVar, aublVar10, evvpVar8, z4, elpgVar4, augmVar4, enxuVar7);
                case 6:
                    basd basdVarA3 = basd.a(auhfVar.e);
                    aubk aubkVar2 = aubk.OK;
                    aubl aublVar11 = augzVar.c;
                    if (aublVar11 == null) {
                        aublVar11 = aubl.a;
                    }
                    aubk aubkVarB4 = aubk.b(aublVar11.c);
                    if (aubkVarB4 == null) {
                        aubkVarB4 = aubk.UNKNOWN_STATUS;
                    }
                    if (aubkVar2.equals(aubkVarB4)) {
                        ekrw ekrwVarH2 = ekrgVar.h();
                        ekrwVarH2.X(ekrzVar, "BugleDataModel");
                        ekrd ekrdVar7 = (ekrd) ekrwVarH2;
                        ekrdVar7.X(ekrzVar2, basdVarA3);
                        ((ekrd) ekrdVar7.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessRbmSpamReport", 517, "SendChatMessageResponseHandler.java")).q("RBM spam report successfully sent.");
                        ((cskd) this.n.b()).c(basdVarA3);
                    } else {
                        ekrw ekrwVarJ4 = ekrgVar.j();
                        ekrwVarJ4.X(ekrzVar, "BugleDataModel");
                        ekrd ekrdVar8 = (ekrd) ekrwVarJ4;
                        ekrdVar8.X(ekrzVar2, basdVarA3);
                        ((ekrd) ekrdVar8.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessRbmSpamReport", 523, "SendChatMessageResponseHandler.java")).q("RBM spam report failed to send.");
                        ((cskd) this.n.b()).b(basdVarA3, enxuVar);
                    }
                    return eijx.e(atav.SUCCESS);
                case 7:
                    basd basdVarA4 = basd.a(auhfVar.e);
                    aubk aubkVar3 = aubk.OK;
                    aubl aublVar12 = augzVar.c;
                    if (aublVar12 == null) {
                        aublVar12 = aubl.a;
                    }
                    aubk aubkVarB5 = aubk.b(aublVar12.c);
                    if (aubkVarB5 == null) {
                        aubkVarB5 = aubk.UNKNOWN_STATUS;
                    }
                    if (aubkVar3.equals(aubkVarB5)) {
                        ekrw ekrwVarH3 = ekrgVar.h();
                        ekrwVarH3.X(ekrzVar, "BugleDataModel");
                        ekrd ekrdVar9 = (ekrd) ekrwVarH3;
                        ekrdVar9.X(ekrzVar2, basdVarA4);
                        ((ekrd) ekrdVar9.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessProtoMessage", 554, "SendChatMessageResponseHandler.java")).q("Proto message successfully sent.");
                    } else {
                        ekrw ekrwVarJ5 = ekrgVar.j();
                        ekrwVarJ5.X(ekrzVar, "BugleDataModel");
                        ekrd ekrdVar10 = (ekrd) ekrwVarJ5;
                        ekrdVar10.X(ekrzVar2, basdVarA4);
                        ((ekrd) ekrdVar10.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessProtoMessage", 559, "SendChatMessageResponseHandler.java")).q("Proto message failed to send.");
                    }
                    return eijx.e(atav.SUCCESS);
                case 8:
                    basd basdVarA5 = basd.a(auhfVar.e);
                    aubl aublVar13 = augzVar.c;
                    if (aublVar13 == null) {
                        aublVar13 = aubl.a;
                    }
                    aubk aubkVarB6 = aubk.b(aublVar13.c);
                    if (aubkVarB6 == null) {
                        aubkVarB6 = aubk.UNKNOWN_STATUS;
                    }
                    if (aubkVarB6.equals(aubk.OK)) {
                        ekrw ekrwVarH4 = ekrgVar.h();
                        ekrwVarH4.X(ekrzVar, "BugleDataModel");
                        ekrd ekrdVar11 = (ekrd) ekrwVarH4;
                        ekrdVar11.X(ekrzVar2, basdVarA5);
                        ((ekrd) ekrdVar11.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessMlsMessage", 573, "SendChatMessageResponseHandler.java")).q("Zinnia message successfully sent.");
                    } else {
                        ekrw ekrwVarJ6 = ekrgVar.j();
                        ekrwVarJ6.X(ekrzVar, "BugleDataModel");
                        ekrd ekrdVar12 = (ekrd) ekrwVarJ6;
                        ekrdVar12.X(ekrzVar2, basdVarA5);
                        ((ekrd) ekrdVar12.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessMlsMessage", 578, "SendChatMessageResponseHandler.java")).q("Zinnia message failed to send.");
                    }
                    return eijx.e(atav.SUCCESS);
                case 9:
                    basd basdVarA6 = basd.a(auhfVar.e);
                    aubl aublVar14 = augzVar.c;
                    if (aublVar14 == null) {
                        aublVar14 = aubl.a;
                    }
                    aubk aubkVarB7 = aubk.b(aublVar14.c);
                    if (aubkVarB7 == null) {
                        aubkVarB7 = aubk.UNKNOWN_STATUS;
                    }
                    if (aubkVarB7.equals(aubk.OK)) {
                        ekrw ekrwVarH5 = ekrgVar.h();
                        ekrwVarH5.X(ekrzVar, "BugleDataModel");
                        ekrd ekrdVar13 = (ekrd) ekrwVarH5;
                        ekrdVar13.X(ekrzVar2, basdVarA6);
                        ((ekrd) ekrdVar13.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessRbmDeepLinkContext", 536, "SendChatMessageResponseHandler.java")).q("RBM deeplink context successfully sent.");
                        ((cskd) this.n.b()).c(basdVarA6);
                    } else {
                        ekrw ekrwVarJ7 = ekrgVar.j();
                        ekrwVarJ7.X(ekrzVar, "BugleDataModel");
                        ekrd ekrdVar14 = (ekrd) ekrwVarJ7;
                        ekrdVar14.X(ekrzVar2, basdVarA6);
                        ((ekrd) ekrdVar14.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessRbmDeepLinkContext", 542, "SendChatMessageResponseHandler.java")).q("RBM deeplink context failed to send.");
                    }
                    return eijx.e(atav.SUCCESS);
                default:
                    ekrw ekrwVarJ8 = ekrgVar.j();
                    ekrwVarJ8.X(ekrzVar, "BugleDataModel");
                    ekrd ekrdVar15 = (ekrd) ekrwVarJ8;
                    ekrdVar15.X(ekrzVar2, basd.a(auhfVar.e));
                    ((ekrd) ekrdVar15.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "processSendChatMessageResponse", 267, "SendChatMessageResponseHandler.java")).q("No case handled in SendMessageOpaqueData.getDataCase()");
                    return eijx.e(atav.FAIL_NO_RETRY);
            }
        } catch (evtj e) {
            ekrw ekrwVarJ9 = h.j();
            ekrwVarJ9.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ9).g(e)).h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "processSendChatMessageResponse", (char) 165, "SendChatMessageResponseHandler.java")).q("Failed to parse SendChatMessageResponse.opaque_data.");
            return this.i.b(e).h(new ejvr() { // from class: atyj
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return atav.FAIL_NO_RETRY;
                }
            }, eoqg.a);
        }
    }

    public final eiju l(final aubl aublVar, auhf auhfVar, enyw enywVar) {
        aubk aubkVarB = aubk.b(aublVar.c);
        if (aubkVarB == null) {
            aubkVarB = aubk.UNKNOWN_STATUS;
        }
        if (aubkVarB.equals(aubk.OK)) {
            return eijx.e(aublVar);
        }
        auga augaVarB = auga.b(aublVar.e);
        if (augaVarB == null) {
            augaVarB = auga.RECOVERY_STRATEGY_UNSPECIFIED;
        }
        ekrw ekrwVarE = h.e();
        ekrwVarE.X(eksq.a, "BugleDataModel");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "recoverFailedChatApiResult", 322, "SendChatMessageResponseHandler.java")).t("Recovering for RecoveryStrategy: %s", augaVarB);
        Map map = this.k;
        ejwl.p(map.containsKey(augaVarB), "No converter provided for recovery strategy %s", augaVarB);
        atao ataoVar = (atao) map.get(augaVarB);
        ataoVar.getClass();
        aujk aujkVarA = ataoVar.a(auhfVar);
        final aujw aujwVar = (aujw) this.j.b();
        enywVar.getClass();
        return (enywVar.ordinal() != 3 ? new auju() { // from class: aujv
            @Override // defpackage.auju
            public final auji a(auga augaVar) {
                augaVar.getClass();
                return aujwVar.b;
            }
        } : aujwVar.a).a(augaVarB).a(aujkVarA).h(new ejvr() { // from class: atyo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aubl aublVar2 = aublVar;
                aujh aujhVar = (aujh) obj;
                if (aujhVar != aujh.d && aujhVar != aujh.b) {
                    return aublVar2;
                }
                aubg aubgVar = (aubg) aublVar2.toBuilder();
                aubk aubkVar = aubk.FAILED_PERMANENTLY;
                aubgVar.copyOnWrite();
                aubl aublVar3 = (aubl) aubgVar.instance;
                aublVar3.c = aubkVar.f;
                aublVar3.b |= 1;
                return (aubl) aubgVar.build();
            }
        }, this.d);
    }
}
