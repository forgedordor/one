package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckws implements bayb {
    private ckxk a;
    private final ckxl b;

    public ckws(ckxl ckxlVar) {
        this.b = ckxlVar;
    }

    private final ckxk a(MessageCoreData messageCoreData) {
        if (this.a == null) {
            ckxl ckxlVar = this.b;
            String strAs = messageCoreData.as();
            eyga eygaVarAc = messageCoreData.ac();
            ConversationIdType conversationIdTypeA = messageCoreData.A();
            ckvy ckvyVar = (ckvy) ckxlVar.a.b();
            ckvyVar.getClass();
            ckxj ckxjVar = (ckxj) ckxlVar.b.b();
            ckxjVar.getClass();
            cklf cklfVar = (cklf) ckxlVar.c.b();
            cklfVar.getClass();
            cklg cklgVar = (cklg) ckxlVar.d.b();
            cklgVar.getClass();
            arxn arxnVar = (arxn) ckxlVar.k.b();
            arxnVar.getClass();
            arxp arxpVar = (arxp) ckxlVar.l.b();
            arxpVar.getClass();
            arxq arxqVar = (arxq) ckxlVar.m.b();
            arxqVar.getClass();
            conversationIdTypeA.getClass();
            this.a = new ckxr(ckvyVar, ckxjVar, cklfVar, cklgVar, ckxlVar.e, ckxlVar.f, ckxlVar.g, ckxlVar.h, ckxlVar.i, ckxlVar.j, arxnVar, arxpVar, arxqVar, ckxlVar.n, strAs, eygaVarAc, conversationIdTypeA);
        }
        ckxk ckxkVar = this.a;
        if (ckxkVar != null) {
            return ckxkVar;
        }
        fdbq.c("reactionsRcsReceiver");
        return null;
    }

    @Override // defpackage.bayb
    public final void d(MessageCoreData messageCoreData) {
        emqr emqrVarB;
        ekgb ekgbVarR;
        engg enggVarB;
        messageCoreData.getClass();
        ckxk ckxkVarA = a(messageCoreData);
        if (ckxkVarA.b()) {
            ConversationIdType conversationIdTypeA = messageCoreData.A();
            String strAB = messageCoreData.aB();
            MessageIdType messageIdTypeC = messageCoreData.C();
            basd basdVarF = messageCoreData.F();
            conversationIdTypeA.getClass();
            strAB.getClass();
            ckxr ckxrVar = (ckxr) ckxkVarA;
            ejyb.c(ckxrVar.b(), "This should be called only if isReaction() is true.", new Object[0]);
            if (!ckxrVar.g.a() || ckxrVar.i()) {
                MessageIdType messageIdTypeC2 = ckxrVar.c();
                eksl ekslVar = (eksl) ckxr.a.h();
                ekslVar.X(cqnc.s, conversationIdTypeA);
                ekslVar.X(cqnc.p, strAB);
                ekslVar.X(ckmz.e, ckxrVar.e());
                ekslVar.X(ckmz.d, messageIdTypeC2);
                ekslVar.X(ckmz.a, messageIdTypeC);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/reactions/transport/rcsfallback/receiver/ReactionsRcsReceiverImpl", "persistInDatabase", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "ReactionsRcsReceiverImpl.java")).q("Trigger persisting of an incoming reaction in the database.");
                ckmh ckmhVar = (ckmh) ckmi.a.createBuilder();
                cklx cklxVar = (cklx) ckly.a.createBuilder();
                cklxVar.copyOnWrite();
                ((ckly) cklxVar.instance).b = strAB;
                ckmhVar.copyOnWrite();
                ckmi ckmiVar = (ckmi) ckmhVar.instance;
                ckly cklyVar = (ckly) cklxVar.build();
                cklyVar.getClass();
                ckmiVar.c = cklyVar;
                ckmiVar.b |= 1;
                if (ckxrVar.f.a()) {
                    String strF = basdVarF.f();
                    if (!strF.isEmpty()) {
                        ckmhVar.copyOnWrite();
                        ckmi ckmiVar2 = (ckmi) ckmhVar.instance;
                        ckmiVar2.b |= 8;
                        ckmiVar2.f = strF;
                    }
                }
                ckxrVar.b.a(ckwk.a(conversationIdTypeA, messageIdTypeC2, ckxrVar.f(), (ckmi) ckmhVar.build(), ckxrVar.g(), null), messageIdTypeC);
            } else {
                eksl ekslVar2 = (eksl) ckxr.a.h();
                ekslVar2.X(cqnc.s, conversationIdTypeA);
                ekslVar2.X(cqnc.p, strAB);
                ekslVar2.X(ckmz.g, ckxrVar.g());
                ekslVar2.X(ckmz.e, ckxrVar.e());
                ekslVar2.X(ckmz.d, ckxrVar.l);
                ekslVar2.X(ckmz.a, messageIdTypeC);
                ekrz ekrzVar = ckmz.h;
                ckml ckmlVarB = ckml.b(ckxrVar.f().e);
                if (ckmlVarB == null) {
                    ckmlVarB = ckml.UNRECOGNIZED;
                }
                ekslVar2.X(ekrzVar, Boolean.valueOf(ckmlVarB == ckml.REACTION_TYPE_UNSPECIFIED));
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/reactions/transport/rcsfallback/receiver/ReactionsRcsReceiverImpl", "persistInDatabase", 189, "ReactionsRcsReceiverImpl.java")).q("Dropping RCS reaction due to missing attributes.");
            }
        }
        ckxr ckxrVar2 = (ckxr) ckxkVarA;
        if (ckxrVar2.j()) {
            Optional optionalA = civb.a(ckxrVar2.j, civa.REACTIONS_NAMESPACE, "Origin-Surface-Type");
            if (optionalA.isPresent()) {
                try {
                    emqrVarB = emqr.b(Integer.parseInt((String) optionalA.get()));
                } catch (NumberFormatException e) {
                    ((eksl) ((eksl) ((eksl) ckxr.a.j()).g(e)).h("com/google/android/apps/messaging/shared/reactions/transport/rcsfallback/receiver/ReactionsRcsReceiverImpl", "getReactionOriginSurface", (char) 541, "ReactionsRcsReceiverImpl.java")).q("Failed to parse reaction origin surface.");
                }
            } else {
                emqrVarB = emqr.REACTION_SURFACE_TYPE_UNSPECIFIED;
            }
            emoo emooVar = (emoo) emop.a.createBuilder();
            emqn emqnVar = (emqn) emqo.a.createBuilder();
            int iA = cklf.a(messageCoreData.as());
            emqnVar.copyOnWrite();
            emqo emqoVar = (emqo) emqnVar.instance;
            emqoVar.b |= 1;
            emqoVar.c = iA;
            emqo emqoVar2 = (emqo) emqnVar.build();
            emooVar.copyOnWrite();
            emop emopVar = (emop) emooVar.instance;
            emqoVar2.getClass();
            emopVar.f = emqoVar2;
            emopVar.e = 209;
            if (emqrVarB != null && emqrVarB != emqr.REACTION_SURFACE_TYPE_UNSPECIFIED) {
                emqp emqpVar = (emqp) emqs.a.createBuilder();
                emqpVar.copyOnWrite();
                emqs emqsVar = (emqs) emqpVar.instance;
                emqsVar.c = emqrVarB.k;
                emqsVar.b |= 1;
                emooVar.copyOnWrite();
                emop emopVar2 = (emop) emooVar.instance;
                emqs emqsVar2 = (emqs) emqpVar.build();
                emqsVar2.getClass();
                emopVar2.d = emqsVar2;
                emopVar2.c = 103;
            }
            ckml ckmlVarB2 = ckml.b(ckxrVar2.f().e);
            if (ckmlVarB2 == null) {
                ckmlVarB2 = ckml.UNRECOGNIZED;
            }
            if (ckmlVarB2 == ckml.REACTION_TYPE_UNSPECIFIED) {
                int i = ekgb.d;
                ekgbVarR = ekoe.a;
            } else {
                ekgbVarR = ekgb.r((emop) emooVar.build());
            }
            if (ckxrVar2.h().booleanValue()) {
                ckmc ckmcVarG = ckxrVar2.g();
                boolean z = !ckxrVar2.c().c();
                ckml ckmlVarB3 = ckml.b(ckxrVar2.f().e);
                if (ckmlVarB3 == null) {
                    ckmlVarB3 = ckml.UNRECOGNIZED;
                }
                enggVarB = cklf.c(ckmcVarG, z, ckmlVarB3 == ckml.CUSTOM, cklf.f(ckxrVar2.f(), ckxrVar2.j));
            } else {
                ckmc ckmcVarG2 = ckxrVar2.g();
                boolean z2 = !ckxrVar2.c().c();
                ckml ckmlVarB4 = ckml.b(ckxrVar2.f().e);
                if (ckmlVarB4 == null) {
                    ckmlVarB4 = ckml.UNRECOGNIZED;
                }
                enggVarB = cklf.b(ckmcVarG2, z2, ckmlVarB4 == ckml.CUSTOM, cklf.e(ckxrVar2.f(), ckxrVar2.j, messageCoreData.F()));
            }
            ckxrVar2.c.g(messageCoreData, ekgbVarR, enggVarB);
            ckxrVar2.d.b(ckxrVar2.f(), ckxrVar2.g(), !ckxrVar2.c().c());
            if (ckxrVar2.h.a() && ckxrVar2.c().c() && ckxrVar2.e().k()) {
                ailn ailnVarA = ((aimb) ckxrVar2.i.b()).a();
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.MISSING_RCS_MESSAGE_EVENT;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b |= 1;
                enur enurVar = (enur) enut.a.createBuilder();
                enurVar.copyOnWrite();
                enut enutVar = (enut) enurVar.instance;
                enutVar.c = 3;
                enutVar.b = 1 | enutVar.b;
                String strF2 = ckxrVar2.e().f();
                enurVar.copyOnWrite();
                enut enutVar2 = (enut) enurVar.instance;
                enutVar2.b |= 2;
                enutVar2.d = strF2;
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                enut enutVar3 = (enut) enurVar.build();
                enutVar3.getClass();
                ellhVar2.cA = enutVar3;
                ellhVar2.i |= 128;
                ailnVarA.j(ellgVar, aioj.LOG_SPEC_MISSING_RCS_MESSAGE_DEBUG_EVENT);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    @Override // defpackage.bayb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r8) {
        /*
            r7 = this;
            r8.getClass()
            ckxk r0 = r7.a(r8)
            boolean r1 = r8.cF()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L18
            boolean r1 = r0.b()
            if (r1 == 0) goto L16
            goto L18
        L16:
            r1 = r2
            goto L19
        L18:
            r1 = r3
        L19:
            r8.bx(r1)
            boolean r1 = r8.cM()
            if (r1 != 0) goto L8d
            r1 = r0
            ckxr r1 = (defpackage.ckxr) r1
            boolean r4 = r1.b()
            if (r4 != 0) goto L2c
            goto L8e
        L2c:
            arxp r4 = r1.g
            boolean r4 = r4.a()
            if (r4 == 0) goto L3b
            boolean r4 = r1.i()
            if (r4 != 0) goto L3b
            goto L8d
        L3b:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r4 = r1.c()
            boolean r4 = r4.c()
            if (r4 != 0) goto L8d
            brdr r4 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.d()
            java.lang.String r5 = "shouldNotify"
            r4.A(r5)
            brao[] r5 = new defpackage.brao[r3]
            bran r6 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.c
            brao r6 = r6.k
            r5[r2] = r6
            r4.c(r5)
            ckxm r5 = new ckxm
            r5.<init>()
            r4.h(r5)
            brdp r1 = r4.b()
            dqqj r1 = r1.p()
            brap r1 = (defpackage.brap) r1
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L83
            if (r4 == 0) goto L7f
            int r4 = r1.i()     // Catch: java.lang.Throwable -> L83
            boolean r4 = defpackage.baui.p(r4)     // Catch: java.lang.Throwable -> L83
            r1.close()
            if (r4 != 0) goto L8e
            goto L8d
        L7f:
            r1.close()
            goto L8d
        L83:
            r8 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r0 = move-exception
            r8.addSuppressed(r0)
        L8c:
            throw r8
        L8d:
            r2 = r3
        L8e:
            r8.bz(r2)
            java.lang.String r1 = r0.a()
            if (r1 == 0) goto Lb9
            java.util.List r8 = r8.M()
            java.util.Iterator r8 = r8.iterator()
        L9f:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lb9
            java.lang.Object r1 = r8.next()
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r1 = (com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData) r1
            boolean r2 = r1.bv()
            if (r2 == 0) goto L9f
            java.lang.String r2 = r0.a()
            r1.aI(r2)
            goto L9f
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckws.e(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData):void");
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
