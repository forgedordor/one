package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crgm implements crbb {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/util/p2p/impl/SmartsConversationInfoImpl");
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    private final fcyh e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;

    public crgm(fcyh fcyhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        fcyhVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        this.e = fcyhVar;
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.c = fcsuVar6;
    }

    @Override // defpackage.crbb
    public final emig a(MessageCoreData messageCoreData) {
        ParticipantsTable.BindData bindDataB;
        return (messageCoreData == null || (bindDataB = ((bbca) this.f.b()).b(messageCoreData.aB())) == null) ? emig.UNKNOWN_REPLY_MODE : bbdl.k(bindDataB) ? emig.CONTINUATION : emig.REPLY;
    }

    @Override // defpackage.crbb
    public final ezdx b(List list, boolean z, boolean z2) {
        String strAB;
        String strValueOf;
        list.getClass();
        HashMap map = new HashMap();
        ezdw ezdwVar = (ezdw) ezdx.a.createBuilder();
        ezdwVar.getClass();
        bbca bbcaVar = (bbca) this.f.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strAB2 = ((MessageCoreData) it.next()).aB();
            if (strAB2 != null) {
                arrayList.add(strAB2);
            }
        }
        Map mapN = bbcaVar.n(arrayList);
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                MessageCoreData messageCoreData = (MessageCoreData) list.get(size);
                if (!byed.g(messageCoreData.k()) && (strAB = messageCoreData.aB()) != null) {
                    long jO = messageCoreData.o();
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) mapN.get(strAB);
                    if (bindData == null || !bbdl.k(bindData)) {
                        String strValueOf2 = (String) map.get(strAB);
                        if (strValueOf2 == null) {
                            strValueOf2 = String.valueOf(map.size() + 1);
                            map.put(strAB, strValueOf2);
                        }
                        strValueOf = strValueOf2;
                    } else {
                        strValueOf = z ? String.valueOf(((cqpz) this.g.b()).c("android_id", 0L)) : "0";
                    }
                    if (z2) {
                        jO = ((jO + 30000) / 60000) * 60000;
                    }
                    ezdu ezduVar = (ezdu) ezdv.a.createBuilder();
                    ezduVar.copyOnWrite();
                    ezdv ezdvVar = (ezdv) ezduVar.instance;
                    strValueOf.getClass();
                    ezdvVar.d = strValueOf;
                    ezduVar.copyOnWrite();
                    ((ezdv) ezduVar.instance).e = jO * 1000;
                    MessageIdType messageIdTypeC = messageCoreData.C();
                    ArrayList arrayList2 = cqyx.a(messageIdTypeC).d;
                    cqce cqceVar = cpez.a;
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ezds ezdsVar = (ezds) it2.next();
                            eyzy eyzyVarB = eyzy.b(ezdsVar.e);
                            if (eyzyVarB == null) {
                                eyzyVarB = eyzy.UNRECOGNIZED;
                            }
                            if (eyzyVarB == eyzy.ASSISTANT_ANNOTATION && ezdsVar.c == 10) {
                                ezbh ezbhVar = ezbh.a;
                                ezduVar.copyOnWrite();
                                ezdv ezdvVar2 = (ezdv) ezduVar.instance;
                                ezbhVar.getClass();
                                ezdvVar2.c = ezbhVar;
                                ezdvVar2.b = 34;
                                break;
                            }
                        } else {
                            String strAs = messageCoreData.as();
                            if (strAs != null) {
                                ezduVar.copyOnWrite();
                                ezdv ezdvVar3 = (ezdv) ezduVar.instance;
                                ezdvVar3.b = 30;
                                ezdvVar3.c = strAs;
                            }
                        }
                    }
                    if (size == 0) {
                        ekrw ekrwVarE = d.e();
                        ekrwVarE.X(eksq.a, "Bugle");
                        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/util/p2p/impl/SmartsConversationInfoImpl", "createMessageStream", 244, "SmartsConversationInfoImpl.kt")).r("annotations for target message: %d", arrayList2.size());
                    }
                    ezduVar.a(arrayList2);
                    crif crifVar = (crif) this.h.b();
                    messageIdTypeC.getClass();
                    ekgb ekgbVarB = crifVar.b(messageIdTypeC);
                    ArrayList arrayList3 = new ArrayList();
                    ekqh it3 = ekgbVarB.iterator();
                    while (it3.hasNext()) {
                        SuggestionData suggestionData = (SuggestionData) it3.next();
                        if (suggestionData instanceof SmartSuggestionItemSuggestionData) {
                            arrayList3.add(((SmartSuggestionItemSuggestionData) suggestionData).c);
                        }
                    }
                    ezduVar.copyOnWrite();
                    ezdv ezdvVar4 = (ezdv) ezduVar.instance;
                    evtg evtgVar = ezdvVar4.g;
                    if (!evtgVar.c()) {
                        ezdvVar4.g = evsn.mutableCopy(evtgVar);
                    }
                    evpz.addAll(arrayList3, ezdvVar4.g);
                    ezdwVar.copyOnWrite();
                    ezdx ezdxVar = (ezdx) ezdwVar.instance;
                    ezdv ezdvVar5 = (ezdv) ezduVar.build();
                    ezdvVar5.getClass();
                    ezdxVar.a();
                    ezdxVar.b.add(ezdvVar5);
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        evsn evsnVarBuild = ezdwVar.build();
        evsnVarBuild.getClass();
        return (ezdx) evsnVarBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.crbb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.crgl
            if (r0 == 0) goto L13
            r0 = r8
            crgl r0 = (defpackage.crgl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crgl r0 = new crgl
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L83
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.fctl.b(r8)
            ezgm r8 = defpackage.ezgm.a
            evsf r8 = r8.createBuilder()
            ezgl r8 = (defpackage.ezgl) r8
            r8.getClass()
            ejxr r2 = defpackage.tet.b
            java.lang.Object r2 = r2.get()
            cczi r2 = (defpackage.cczi) r2
            java.lang.Object r2 = r2.e()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L6f
            ejxr r2 = defpackage.czzm.a
            java.lang.Object r2 = r2.get()
            cczi r2 = (defpackage.cczi) r2
            java.lang.Object r2 = r2.e()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L6f
            evsn r7 = r8.build()
            r7.getClass()
            ezgm r7 = (defpackage.ezgm) r7
            return r7
        L6f:
            fcyh r2 = r6.e
            fcyh r2 = defpackage.eicg.a(r2)
            crgk r4 = new crgk
            r5 = 0
            r4.<init>(r5, r7, r8, r6)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdin.a(r2, r4, r0)
            if (r8 == r1) goto L89
        L83:
            r8.getClass()
            ezgm r8 = (defpackage.ezgm) r8
            return r8
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crgm.c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fcxy):java.lang.Object");
    }

    @Override // defpackage.crbb
    public final boolean d(final List list, final int i, final String str) {
        list.getClass();
        if (list.size() < i) {
            ekrw ekrwVarJ = d.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/util/p2p/impl/SmartsConversationInfoImpl", "isConversationEligibleForSmartReplies", 68, "SmartsConversationInfoImpl.kt")).p(new ekri() { // from class: crgf
                @Override // defpackage.ekri
                public final Object a() {
                    String str2 = String.format(str, Arrays.copyOf(new Object[]{fdgn.c("\n            The conversation's last messages list size (" + list.size() + ") \n            is less than minimum required (" + i + ")\n          ", "|")}, 1));
                    str2.getClass();
                    return str2;
                }
            });
            return false;
        }
        final MessageCoreData messageCoreData = (MessageCoreData) list.get(0);
        if (messageCoreData == null) {
            ekrw ekrwVarI = d.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/shared/util/p2p/impl/SmartsConversationInfoImpl", "isConversationEligibleForSmartReplies", 86, "SmartsConversationInfoImpl.kt")).p(new ekri() { // from class: crgg
                @Override // defpackage.ekri
                public final Object a() {
                    String str2 = String.format(str, Arrays.copyOf(new Object[]{"The conversation's latest message is null"}, 1));
                    str2.getClass();
                    return str2;
                }
            });
            return false;
        }
        if (byed.g(messageCoreData.k())) {
            ekrw ekrwVarI2 = d.i();
            ekrwVarI2.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarI2.h("com/google/android/apps/messaging/shared/util/p2p/impl/SmartsConversationInfoImpl", "isConversationEligibleForSmartReplies", 96, "SmartsConversationInfoImpl.kt")).p(new ekri() { // from class: crgh
                @Override // defpackage.ekri
                public final Object a() {
                    String str2 = String.format(str, Arrays.copyOf(new Object[]{"The conversation's latest message is a tombstone message"}, 1));
                    str2.getClass();
                    return str2;
                }
            });
            return false;
        }
        ParticipantsTable.BindData bindDataB = ((bbca) this.f.b()).b(messageCoreData.aB());
        if (bindDataB == null) {
            ekrw ekrwVarJ2 = d.j();
            ekrwVarJ2.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/shared/util/p2p/impl/SmartsConversationInfoImpl", "isConversationEligibleForSmartReplies", 112, "SmartsConversationInfoImpl.kt")).p(new ekri() { // from class: crgi
                @Override // defpackage.ekri
                public final Object a() {
                    String str2 = String.format(str, Arrays.copyOf(new Object[]{"No participant data for latest participant: ".concat(String.valueOf(messageCoreData.aB()))}, 1));
                    str2.getClass();
                    return str2;
                }
            });
            return false;
        }
        if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue()) {
            if (bindDataB.p() == 3) {
                return false;
            }
            ekgb ekgbVarE = bbca.e(messageCoreData.A());
            ekgbVarE.getClass();
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) fcva.Y(ekgbVarE);
            if (bindData != null && bindData.p() == 3) {
                return false;
            }
        }
        if (!bbbd.m(bindDataB)) {
            return (bbbe.d(bindDataB) || bindDataB.aa()) ? false : true;
        }
        ekrw ekrwVarI3 = d.i();
        ekrwVarI3.X(eksq.a, "Bugle");
        ((ekrd) ekrwVarI3.h("com/google/android/apps/messaging/shared/util/p2p/impl/SmartsConversationInfoImpl", "isConversationEligibleForSmartReplies", 144, "SmartsConversationInfoImpl.kt")).p(new ekri() { // from class: crgj
            @Override // defpackage.ekri
            public final Object a() {
                String str2 = String.format(str, Arrays.copyOf(new Object[]{"IncomingOnly participant: ".concat(String.valueOf(messageCoreData.aB()))}, 1));
                str2.getClass();
                return str2;
            }
        });
        return false;
    }

    @Override // defpackage.crbb
    public final boolean e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        ParticipantsTable.BindData bindDataB = ((bbca) this.f.b()).b(messageCoreData.aB());
        if (bindDataB != null) {
            return bbdl.k(bindDataB);
        }
        return false;
    }
}
