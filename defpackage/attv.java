package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class attv implements atru {
    public static final eksp a = eksp.c("BugleGroupManagement");
    public final eosc b;
    public final fcsu c;
    public final fcsu d;
    public final cogw e;
    public final atrt f;
    public final eygg g;
    private final fcsu h;
    private final bxkp i;
    private final attm j;
    private final ardl k;

    public attv(eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, bxkp bxkpVar, fcsu fcsuVar3, cogw cogwVar, attm attmVar, atrt atrtVar, eygg eyggVar, ardl ardlVar) {
        this.b = eoscVar;
        this.h = fcsuVar;
        this.c = fcsuVar2;
        this.i = bxkpVar;
        this.d = fcsuVar3;
        this.e = cogwVar;
        this.j = attmVar;
        this.f = atrtVar;
        this.g = eyggVar;
        this.k = ardlVar;
    }

    public static ekvt d(ParticipantsTable.BindData bindData, ParticipantsTable.BindData bindData2, String str) {
        ekvr ekvrVarA = ekvw.a();
        ekvrVarA.c(new ekwe("groupOperation", str));
        ekvrVarA.b(atnw.d, bindData.T());
        ekvrVarA.b(atnw.e, bindData2.T());
        return ekvrVarA.a();
    }

    private final brvp f(String str) {
        fcsu fcsuVar = this.h;
        brvp brvpVarF = bbbd.f(str);
        ((bbca) fcsuVar.b()).j(brvpVarF);
        return brvpVarF;
    }

    private final void g(Set set, brvp brvpVar) {
        String str = brvpVar.g;
        if (ejwk.c(str) || set.contains(str)) {
            return;
        }
        this.i.e(brvpVar, 4);
        set.add(str);
    }

    @Override // defpackage.atru
    public final eiju a(final ConversationIdType conversationIdType, final auey aueyVar) {
        final auen auenVar = aueyVar.e;
        if (auenVar == null) {
            auenVar = auen.a;
        }
        eiju eijuVarH = this.j.h(conversationIdType);
        ejvr ejvrVar = new ejvr() { // from class: attp
            /* JADX WARN: Code restructure failed: missing block: B:101:0x0213, code lost:
            
                if (((defpackage.bakt) r14.b()).ag(r2.f(), r9.R()) == false) goto L103;
             */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x0215, code lost:
            
                ((defpackage.eksl) ((defpackage.eksl) defpackage.attv.a.j()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ParticipantsGroupMetadataProcessor", "removeParticipantFromGroup", 385, "ParticipantsGroupMetadataProcessor.java")).q("Participant not successfully removed from the conversation.");
                r1 = defpackage.attu.e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x022e, code lost:
            
                r1 = r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:104:0x0231, code lost:
            
                r1 = defpackage.attv.a;
                ((defpackage.eksl) ((defpackage.eksl) r1.e()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ParticipantsGroupMetadataProcessor", "removeParticipantFromGroup", 392, "ParticipantsGroupMetadataProcessor.java")).q("Participant successfully removed from the conversation.");
             */
            /* JADX WARN: Code restructure failed: missing block: B:105:0x0254, code lost:
            
                if (r2.c().d.equals(r9.T()) == false) goto L107;
             */
            /* JADX WARN: Code restructure failed: missing block: B:106:0x0256, code lost:
            
                ((defpackage.eksl) ((defpackage.eksl) r1.h()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ParticipantsGroupMetadataProcessor", "removeParticipantFromGroup", 400, "ParticipantsGroupMetadataProcessor.java")).q("Skipping inserting tombstone for removing the self user.");
                r1 = defpackage.attu.d;
             */
            /* JADX WARN: Code restructure failed: missing block: B:107:0x026c, code lost:
            
                r1 = defpackage.dfpg.d();
                r5 = com.google.android.ims.rcsservice.businessinfo.BasePaymentResult.ERROR_REQUEST_TIMEOUT;
             */
            /* JADX WARN: Code restructure failed: missing block: B:108:0x0272, code lost:
            
                if (r1 == false) goto L117;
             */
            /* JADX WARN: Code restructure failed: missing block: B:110:0x0278, code lost:
            
                if ((r8.b & 1) == 0) goto L117;
             */
            /* JADX WARN: Code restructure failed: missing block: B:111:0x027a, code lost:
            
                r1 = r8.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:112:0x027c, code lost:
            
                if (r1 != null) goto L114;
             */
            /* JADX WARN: Code restructure failed: missing block: B:113:0x027e, code lost:
            
                r1 = defpackage.aubq.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:115:0x028a, code lost:
            
                if (r1.d.equals(r9.T()) != false) goto L117;
             */
            /* JADX WARN: Code restructure failed: missing block: B:116:0x028c, code lost:
            
                r5 = 221;
             */
            /* JADX WARN: Code restructure failed: missing block: B:117:0x028e, code lost:
            
                r20 = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:118:0x0294, code lost:
            
                if (r4.e(r2, r8, r9) == false) goto L127;
             */
            /* JADX WARN: Code restructure failed: missing block: B:119:0x0296, code lost:
            
                r14 = (defpackage.byeb) r4.d.b();
                r15 = j$.util.Optional.empty();
                r16 = r2.f();
                r17 = r2.e();
                r19 = defpackage.ekgb.r(r9);
             */
            /* JADX WARN: Code restructure failed: missing block: B:120:0x02b3, code lost:
            
                if ((r8.b & 2) == 0) goto L125;
             */
            /* JADX WARN: Code restructure failed: missing block: B:121:0x02b5, code lost:
            
                r1 = r8.d;
             */
            /* JADX WARN: Code restructure failed: missing block: B:122:0x02b7, code lost:
            
                if (r1 != null) goto L124;
             */
            /* JADX WARN: Code restructure failed: missing block: B:123:0x02b9, code lost:
            
                r1 = defpackage.evvp.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:124:0x02bb, code lost:
            
                r8 = defpackage.evxc.a(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:125:0x02c0, code lost:
            
                r8 = r4.e.f().toEpochMilli();
             */
            /* JADX WARN: Code restructure failed: missing block: B:126:0x02ca, code lost:
            
                r14.k(r15, r16, r17, r5, r19, r20, r8, -1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:127:0x02d1, code lost:
            
                r1 = defpackage.attu.d;
             */
            /* JADX WARN: Code restructure failed: missing block: B:128:0x02d3, code lost:
            
                r10 = r10.c(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:129:0x02d7, code lost:
            
                r11.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x02df, code lost:
            
                if (((defpackage.atqt) r10).a != false) goto L132;
             */
            /* JADX WARN: Code restructure failed: missing block: B:132:0x02e3, code lost:
            
                r1 = r25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:133:0x02e7, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:140:0x02f2, code lost:
            
                r1 = r3.d.iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:142:0x02fc, code lost:
            
                if (r1.hasNext() == false) goto L230;
             */
            /* JADX WARN: Code restructure failed: missing block: B:143:0x02fe, code lost:
            
                r3 = (defpackage.auiu) r1.next();
                r5 = r3.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:144:0x0306, code lost:
            
                if (r5 != null) goto L146;
             */
            /* JADX WARN: Code restructure failed: missing block: B:145:0x0308, code lost:
            
                r5 = defpackage.aubq.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:146:0x030a, code lost:
            
                r5 = r4.b(r7, r5);
                r8 = r3.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:147:0x0310, code lost:
            
                if (r8 != null) goto L149;
             */
            /* JADX WARN: Code restructure failed: missing block: B:148:0x0312, code lost:
            
                r8 = defpackage.aubq.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:149:0x0314, code lost:
            
                r9 = r3.e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:150:0x0316, code lost:
            
                if (r9 != null) goto L152;
             */
            /* JADX WARN: Code restructure failed: missing block: B:151:0x0318, code lost:
            
                r9 = defpackage.aufb.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:152:0x031a, code lost:
            
                r8 = defpackage.attv.d(r5, r4.c(r7, r8, r9, r2), "update");
             */
            /* JADX WARN: Code restructure failed: missing block: B:153:0x0324, code lost:
            
                r3 = defpackage.auej.b(r3.d);
             */
            /* JADX WARN: Code restructure failed: missing block: B:154:0x032a, code lost:
            
                if (r3 != null) goto L156;
             */
            /* JADX WARN: Code restructure failed: missing block: B:155:0x032c, code lost:
            
                r3 = defpackage.auej.UNKNOWN_STATE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:158:0x0349, code lost:
            
                if (((defpackage.bakt) r4.c.b()).al(r2.f(), r5.R(), new defpackage.barf(r3)) != false) goto L160;
             */
            /* JADX WARN: Code restructure failed: missing block: B:159:0x034b, code lost:
            
                ((defpackage.eksl) ((defpackage.eksl) defpackage.attv.a.j()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ParticipantsGroupMetadataProcessor", "updateParticipantInGroup", 479, "ParticipantsGroupMetadataProcessor.java")).q("Participant not successfully updated in the conversation.");
                r3 = defpackage.attu.e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:160:0x0363, code lost:
            
                ((defpackage.eksl) ((defpackage.eksl) defpackage.attv.a.e()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ParticipantsGroupMetadataProcessor", "updateParticipantInGroup", 483, "ParticipantsGroupMetadataProcessor.java")).q("Participant successfully updated in the conversation.");
                r3 = r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:161:0x0379, code lost:
            
                r10 = r10.c(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:162:0x037d, code lost:
            
                r8.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:163:0x0385, code lost:
            
                if (((defpackage.atqt) r10).a != false) goto L231;
             */
            /* JADX WARN: Code restructure failed: missing block: B:165:0x0388, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:167:0x038a, code lost:
            
                r8.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:169:0x038e, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:170:0x038f, code lost:
            
                r0.addSuppressed(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:171:0x0392, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:173:0x0398, code lost:
            
                if (((defpackage.atqt) r10).b == false) goto L175;
             */
            /* JADX WARN: Code restructure failed: missing block: B:174:0x039a, code lost:
            
                r1 = r4.c;
                ((defpackage.bakt) r1.b()).P(r0);
                ((defpackage.bakt) r1.b()).T(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:176:0x03b2, code lost:
            
                if (((defpackage.atqt) r10).a == false) goto L178;
             */
            /* JADX WARN: Code restructure failed: missing block: B:177:0x03b4, code lost:
            
                r0 = defpackage.cbcw.i();
             */
            /* JADX WARN: Code restructure failed: missing block: B:178:0x03b9, code lost:
            
                r0 = defpackage.cbcw.m();
             */
            /* JADX WARN: Code restructure failed: missing block: B:179:0x03bd, code lost:
            
                r28.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:180:0x03c0, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:234:?, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x01b2, code lost:
            
                r28 = r5;
                r1 = r3.c.iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:86:0x01c0, code lost:
            
                if (r1.hasNext() == false) goto L228;
             */
            /* JADX WARN: Code restructure failed: missing block: B:87:0x01c2, code lost:
            
                r5 = (defpackage.auge) r1.next();
                r8 = r5.d;
             */
            /* JADX WARN: Code restructure failed: missing block: B:88:0x01ca, code lost:
            
                if (r8 != null) goto L90;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x01cc, code lost:
            
                r8 = defpackage.aufb.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:90:0x01ce, code lost:
            
                r9 = r5.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x01d0, code lost:
            
                if (r9 != null) goto L93;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x01d2, code lost:
            
                r9 = defpackage.aubq.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x01d4, code lost:
            
                r9 = r4.b(r7, r9);
                r5 = r5.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x01da, code lost:
            
                if (r5 != null) goto L96;
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x01dc, code lost:
            
                r5 = defpackage.aubq.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x01de, code lost:
            
                r5 = r4.c(r7, r5, r8, r2);
                r11 = defpackage.attv.d(r9, r5, "remove");
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x01e8, code lost:
            
                r14 = r4.c;
                r25 = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:99:0x01ff, code lost:
            
                if (((defpackage.bakt) r14.b()).ai(r9, r2.f(), false) != false) goto L104;
             */
            @Override // defpackage.ejvr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r30) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 984
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.attp.apply(java.lang.Object):java.lang.Object");
            }
        };
        eosc eoscVar = this.b;
        return eijuVarH.h(ejvrVar, eoscVar).i(new eooz() { // from class: attq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cbcw cbcwVar = (cbcw) obj;
                if (!cbcwVar.e()) {
                    return eijx.e(cbcwVar);
                }
                final auen auenVar2 = auenVar;
                final ConversationIdType conversationIdType2 = conversationIdType;
                final auey aueyVar2 = aueyVar;
                attv attvVar = this.a;
                Stream map = Collection.EL.stream((Set) attvVar.g.b()).map(new Function() { // from class: attr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        atto attoVar = (atto) obj2;
                        eksp ekspVar = attv.a;
                        aubq aubqVar = aueyVar2.l;
                        if (aubqVar == null) {
                            aubqVar = aubq.a;
                        }
                        return attoVar.a(aubqVar, conversationIdType2, auenVar2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                return eijx.j((Iterable) map.collect(ekcv.a)).a(new Callable() { // from class: atts
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return cbcw.i();
                    }
                }, attvVar.b);
            }
        }, eoscVar);
    }

    public final ParticipantsTable.BindData b(Set set, aubq aubqVar) {
        brvp brvpVarF = f(aubqVar.d);
        g(set, brvpVarF);
        return brvpVarF.a();
    }

    public final ParticipantsTable.BindData c(Set set, aubq aubqVar, aufb aufbVar, atrj atrjVar) {
        String str = aubqVar.d;
        if ((aufbVar.b & 1) != 0) {
            aubq aubqVar2 = aufbVar.c;
            String str2 = (aubqVar2 == null ? aubq.a : aubqVar2).d;
            if (aubqVar2 == null) {
                aubqVar2 = aubq.a;
            }
            if (aubqVar2.equals(atrjVar.c())) {
                ParticipantsTable.BindData bindDataB = ((bbca) this.h.b()).b(((SelfIdentityIdImpl) atrjVar.b()).a);
                bindDataB.getClass();
                return bindDataB;
            }
            str = str2;
        }
        brvp brvpVarF = f(str);
        g(set, brvpVarF);
        return brvpVarF.a();
    }

    public final boolean e(atrj atrjVar, aufb aufbVar, ParticipantsTable.BindData bindData) {
        if (atrjVar.c().d.equals(bindData.T())) {
            return false;
        }
        if (!this.k.a() || !aufbVar.equals(aufb.a) || (!atrjVar.j().isEmpty() && atrjVar.a() != 4)) {
            return true;
        }
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(cqnc.s, atrjVar.f());
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ParticipantsGroupMetadataProcessor", "shouldInsertTombstone", 459, "ParticipantsGroupMetadataProcessor.java")).q("Skipping inserting tombstone for out-of-sync state.");
        return false;
    }
}
