package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anhx implements anhs {
    private final Context a;
    private final arxn b;

    public anhx(dnwr dnwrVar, Context context, arxn arxnVar) {
        dnwrVar.getClass();
        context.getClass();
        arxnVar.getClass();
        this.a = context;
        this.b = arxnVar;
    }

    private static final ckmb d(angp angpVar) {
        ckma ckmaVar = (ckma) ckmb.a.createBuilder();
        ckmaVar.getClass();
        ckmk.c(angpVar.a(), ckmaVar);
        ckmk.d(ckml.EMOTIFY, ckmaVar);
        ckmk.b(dnwr.h(new dnvg(angpVar.a(), angpVar.b(), null, false, null, null, null, 0, 0, 0L, null, null, 4092)), ckmaVar);
        return ckmk.a(ckmaVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    @Override // defpackage.anhs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.amwf a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r3, defpackage.anhj r4, defpackage.anhk r5, boolean r6) {
        /*
            r2 = this;
            angp r4 = (defpackage.angp) r4
            r5.getClass()
            r4 = 0
            if (r6 == 0) goto Ld
            anhk r6 = defpackage.anhk.a
            if (r5 != r6) goto Ld
            return r4
        Ld:
            amul r6 = defpackage.amum.d()
            int r5 = r5.ordinal()
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L4e
            if (r5 != r1) goto L48
            java.lang.String r3 = r3.as()
            if (r3 == 0) goto L3b
            int r5 = r3.length()
            if (r5 != 0) goto L28
            goto L29
        L28:
            r4 = r3
        L29:
            if (r4 == 0) goto L3b
            android.content.Context r3 = r2.a
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r0] = r4
            r4 = 2132087130(0x7f15115a, float:1.9814507E38)
            java.lang.String r3 = r3.getString(r4, r5)
            if (r3 == 0) goto L3b
            goto L7a
        L3b:
            android.content.Context r3 = r2.a
            r4 = 2132087129(0x7f151159, float:1.9814505E38)
            java.lang.String r3 = r3.getString(r4)
            r3.getClass()
            goto L7a
        L48:
            fctg r3 = new fctg
            r3.<init>()
            throw r3
        L4e:
            java.lang.String r3 = r3.as()
            if (r3 == 0) goto L6e
            int r5 = r3.length()
            if (r5 != 0) goto L5b
            goto L5c
        L5b:
            r4 = r3
        L5c:
            if (r4 == 0) goto L6e
            android.content.Context r3 = r2.a
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r0] = r4
            r4 = 2132087018(0x7f1510ea, float:1.981428E38)
            java.lang.String r3 = r3.getString(r4, r5)
            if (r3 == 0) goto L6e
            goto L7a
        L6e:
            android.content.Context r3 = r2.a
            r4 = 2132087017(0x7f1510e9, float:1.9814277E38)
            java.lang.String r3 = r3.getString(r4)
            r3.getClass()
        L7a:
            r6.c(r3)
            amum r3 = r6.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anhx.a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, anhj, anhk, boolean):amwf");
    }

    @Override // defpackage.anhs
    public final /* bridge */ /* synthetic */ ekgb b(anhj anhjVar, anhk anhkVar) {
        angp angpVar = (angp) anhjVar;
        anhkVar.getClass();
        if (anhkVar != anhk.a) {
            int i = ekgb.d;
            ekgb ekgbVar = ekoe.a;
            ekgbVar.getClass();
            return ekgbVar;
        }
        ckmb ckmbVarD = d(angpVar);
        dnwn dnwnVar = ckmbVarD.b == 101 ? (dnwn) ckmbVarD.c : dnwn.a;
        dnwnVar.getClass();
        dnvg dnvgVarI = dnwr.i(dnwnVar);
        String strA = dojn.a(dnvgVarI).a();
        if (strA == null) {
            throw new NullPointerException("Null contentType");
        }
        Uri uri = Uri.parse(dnvgVarI.b);
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        ekgb ekgbVarR = ekgb.r(new anht(strA, uri, new Size(dnvgVarI.g, dnvgVarI.h), dnvgVarI.a));
        ekgbVarR.getClass();
        return ekgbVarR;
    }

    @Override // defpackage.anhs
    public final void c(MessageCoreData messageCoreData, anhn anhnVar, ajlh ajlhVar, MessageCoreData messageCoreData2, boolean z) {
        ckmc ckmcVar;
        String str;
        String str2;
        angn angnVar;
        basd basdVar;
        String str3;
        ajlhVar.getClass();
        aoer aoerVarG = ajlhVar.g();
        if (aoerVarG == null) {
            throw new IllegalArgumentException("Could not send a reaction without a SelfIdentity");
        }
        ConversationIdType conversationIdType = ((BugleConversationId) ajlhVar.f()).a;
        MessageIdType messageIdTypeC = messageCoreData.C();
        messageIdTypeC.getClass();
        angp angpVar = (angp) anhnVar.b();
        anhk anhkVarC = anhnVar.c();
        ckmh ckmhVar = (ckmh) ckmi.a.createBuilder();
        ckmhVar.getClass();
        cklx cklxVar = (cklx) ckly.a.createBuilder();
        cklxVar.getClass();
        cklz.b(true, cklxVar);
        cklz.c(aoerVarG.h().b(), cklxVar);
        ckmj.b(cklz.a(cklxVar), ckmhVar);
        fhaz fhazVarAJ = messageCoreData2.aJ();
        fhazVarAJ.getClass();
        ckmj.d(fhazVarAJ, ckmhVar);
        if (this.b.a() && (str3 = messageCoreData2.F().b) != null) {
            ckmj.c(str3, ckmhVar);
        }
        ckmi ckmiVarA = ckmj.a(ckmhVar);
        ckmm ckmmVar = (ckmm) ckmo.a.createBuilder();
        ckmmVar.getClass();
        ckmp.b(anhnVar.d(), ckmmVar);
        ckmo ckmoVarA = ckmp.a(ckmmVar);
        ckmb ckmbVarD = d(angpVar);
        int iOrdinal = anhkVarC.ordinal();
        if (iOrdinal == 0) {
            ckmcVar = ckmc.ADD_REACTION;
        } else {
            if (iOrdinal != 1) {
                throw new fctg();
            }
            ckmcVar = ckmc.REMOVE_REACTION;
        }
        ((MessageData) messageCoreData2).l = ckwk.a(conversationIdType, messageIdTypeC, ckmbVarD, ckmiVarA, ckmcVar, ckmoVarA);
        messageCoreData2.bx(true);
        if (messageCoreData2.cX() && messageCoreData.cX()) {
            eyga eygaVarAc = messageCoreData2.ac();
            if (!messageCoreData.F().k()) {
                throw new IllegalArgumentException("Could not send reaction to a message without RCS message id");
            }
            String str4 = messageCoreData.E().k() ? messageCoreData.E().b : messageCoreData.F().b;
            boolean z2 = anhnVar instanceof anhm;
            String str5 = null;
            if (z2 && (angnVar = ((anhm) anhnVar).a) != null && (basdVar = angnVar.f) != null) {
                str5 = basdVar.b;
            }
            civc civcVarB = civc.b(eygaVarAc);
            civa civaVar = civa.EMOTIFY_REACTIONS_NAMESPACE;
            civcVarB.e(civaVar, "Reaction-Emotify-Id", ((angp) anhnVar.b()).a());
            if (!z || (z2 && str5 == null)) {
                int iOrdinal2 = anhnVar.c().ordinal();
                if (iOrdinal2 == 0) {
                    str = "message-reaction-add";
                } else {
                    if (iOrdinal2 != 1) {
                        throw new fctg();
                    }
                    str = "message-reaction-remove";
                }
                civcVarB.e(civaVar, "Message-Reply-Type", str);
                civcVarB.e(civaVar, "In-Reply-To-Message-Id", str4);
            } else {
                if (z2) {
                    str5.getClass();
                    str4 = str5;
                } else {
                    str4.getClass();
                }
                anhk anhkVarC2 = anhnVar.c();
                civa civaVar2 = civa.GSMA_RCS_NAMESPACE;
                int iOrdinal3 = anhkVarC2.ordinal();
                if (iOrdinal3 == 0) {
                    str2 = "+Custom-Reaction";
                } else {
                    if (iOrdinal3 != 1) {
                        throw new fctg();
                    }
                    str2 = "-Custom-Reaction";
                }
                civcVarB.e(civaVar2, "Reference-Type", str2);
                civcVarB.e(civaVar2, "Reference-ID", str4);
            }
            eyga eygaVarC = civcVarB.c();
            eygaVarC.getClass();
            messageCoreData2.bs(eygaVarC);
        }
    }
}
