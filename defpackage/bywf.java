package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bywf {
    private static final cqce a = cqce.g("Bugle", "CmsMessagesToTelephonyPersister");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final cmqj e;
    private final Context f;
    private final chwq g;
    private final crny h;
    private final bveg i;
    private final bahv j;
    private final alrj k;

    static {
        cdag.w(227918773, "use_sms_telephony_uri_for_sms_messages");
    }

    public bywf(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cmqj cmqjVar, chwq chwqVar, crny crnyVar, bveg bvegVar, bahv bahvVar, alrj alrjVar, Context context) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = cmqjVar;
        this.g = chwqVar;
        this.h = crnyVar;
        this.f = context;
        this.i = bvegVar;
        this.j = bahvVar;
        this.k = alrjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Uri a(MessagesTable.BindData bindData, ekgb ekgbVar) {
        String strT;
        String strAb;
        lx lxVar;
        MessageCoreData messageCoreDataA = this.i.a();
        messageCoreDataA.bY(bindData);
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            messageCoreDataA.aM(this.j.e((PartsTable.BindData) ekgbVar.get(i)));
        }
        String strAB = messageCoreDataA.aB();
        bojh bojhVarR = ((bakt) this.c.b()).r(messageCoreDataA.A());
        ParticipantsTable.BindData bindDataB = ((bbca) this.b.b()).b(strAB);
        bindDataB.getClass();
        bindData.D();
        bojhVarR.getClass();
        cczv cczvVar = alvx.a;
        String strO = ((Boolean) new ejxr() { // from class: alvf
            @Override // defpackage.ejxr
            public final Object get() {
                return Boolean.valueOf(eotp.a("bugle.enable_mi_in_cms_messages_to_telephony_persister", "bugle"));
            }
        }.get()).booleanValue() ? this.k.t(bindDataB).o() : bindDataB.T();
        boolean zCS = messageCoreDataA.cS();
        if (!zCS) {
            strO.getClass();
        }
        long jO = messageCoreDataA.o();
        long jR = messageCoreDataA.r();
        cnqj cnqjVarN = bojhVarR.N();
        int iC = this.h.c();
        int iD = messageCoreDataA.d();
        Uri uriWithAppendedId = null;
        if (iD == 0) {
            if (ekgbVar.isEmpty()) {
                throw new IllegalArgumentException("No parts provided for SMS message");
            }
            if (ekgbVar.size() > 1) {
                throw new IllegalArgumentException("More than 1 part provided for an SMS message.");
            }
            List listK = ((bakt) this.c.b()).K(bojhVarR.C());
            boolean zBooleanValue = ((Boolean) new ejxr() { // from class: alvf
                @Override // defpackage.ejxr
                public final Object get() {
                    return Boolean.valueOf(eotp.a("bugle.enable_mi_in_cms_messages_to_telephony_persister", "bugle"));
                }
            }.get()).booleanValue();
            if (bojhVarR.k() != 0) {
                if (zBooleanValue) {
                    ekgb ekgbVarN = ekgb.n(listK);
                    alrj alrjVar = this.k;
                    ArrayList arrayList = new ArrayList(ekgbVarN.size());
                    int size2 = ekgbVarN.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList.add(alrjVar.t((ParticipantsTable.BindData) ekgbVarN.get(i2)).o());
                    }
                    strT = TextUtils.join(" ", ekgb.n(arrayList));
                } else {
                    strT = bbbd.t(listK);
                }
                ejwl.b(!TextUtils.isEmpty(strT), "Not able to get participants for mass text SMS");
            } else {
                if (listK.isEmpty()) {
                    throw new IllegalArgumentException(String.format("1:1 conversation does not have participant, conversation id = %s", bojhVarR.C()));
                }
                if (listK.size() > 1) {
                    throw new IllegalArgumentException(String.format("1: 1 conversation has more than one participants, conversation id = %s", bojhVarR.C()));
                }
                ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) listK.get(0);
                String strO2 = zBooleanValue ? this.k.q(bindData2).o() : bindData2.T();
                bindData2.R();
                strO2.getClass();
                strT = strO2;
            }
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) ((MessageData) messageCoreDataA).i.get(0);
            UUID uuidAI = messageCoreDataA.aI();
            Optional optionalAe = messageCoreDataA.ae();
            if (messagePartCoreData.ab() == null) {
                cqbd cqbdVarE = a.e();
                cqbdVarE.I("MessagePartCoreData's text is null! Continuing with empty part data.");
                cqbdVarE.A("draftId", uuidAI);
                cqbdVarE.z("sentTimestamp", jR);
                cqbdVarE.z("receivedTimestampInMs", jO);
                cqbdVarE.A("threadId", cnqjVarN);
                cqbdVarE.r();
                strAb = "";
            } else {
                strAb = messagePartCoreData.ab();
                strAb.getClass();
            }
            String str = strAb;
            cmqj cmqjVar = this.e;
            Uri uriAk = cmqjVar.ak(this.f, Telephony.Sms.CONTENT_URI, iC, strT, str, jO, 0, true == zCS ? 2 : 1, cnqjVarN, optionalAe);
            if (uriAk != null) {
                cmqjVar.K(uriAk, 0, jR);
                uriWithAppendedId = ContentUris.withAppendedId(Telephony.Sms.CONTENT_URI, ContentUris.parseId(uriAk));
            }
        } else if (iD == 1 || iD == 3 || iD == 7) {
            long jA = cnqk.a(cnqjVarN);
            if (zCS) {
                ConversationIdType conversationIdTypeA = messageCoreDataA.A();
                ceah ceahVar = new ceah();
                ceahVar.b = this.g.f(messageCoreDataA);
                ArrayList arrayListA = ((baqt) this.d.b()).a(conversationIdTypeA, true);
                String strAw = messageCoreDataA.aw();
                byte[] bytes = !TextUtils.isEmpty(strAw) ? strAw.getBytes(StandardCharsets.US_ASCII) : null;
                cmqj cmqjVar2 = this.e;
                lz lzVarT = cmqjVar2.T((String[]) arrayListA.toArray(new String[0]), messageCoreDataA, ceahVar, 604800L, messageCoreDataA.b(), jO, bytes);
                lzVarT.getClass();
                Uri uriL = cmqjVar2.l(this.f, lzVarT, iC, null, jA, null);
                if (uriL != null) {
                    uriWithAppendedId = ContentUris.withAppendedId(Telephony.Mms.CONTENT_URI, ContentUris.parseId(uriL));
                }
            } else {
                strO.getClass();
                try {
                    lx lxVar2 = new lx();
                    lxVar2.b(new lg(strO));
                    if (!TextUtils.isEmpty(messageCoreDataA.av())) {
                        lxVar2.g(new lg(messageCoreDataA.av()));
                    }
                    lxVar2.b = this.g.f(messageCoreDataA);
                    lxVar2.f(jR / 1000);
                    lxVar2.i(new byte[0]);
                    if (messageCoreDataA.cX()) {
                        lxVar2.e();
                    }
                    String strAw2 = messageCoreDataA.aw();
                    if (!TextUtils.isEmpty(strAw2)) {
                        lxVar2.i(strAw2.getBytes());
                    }
                    lxVar = lxVar2;
                } catch (li unused) {
                    lxVar = null;
                }
                lxVar.getClass();
                Uri uriK = this.e.k(this.f, lxVar, iC, null, jA, jO / 1000, null);
                if (uriK != null) {
                    uriWithAppendedId = ContentUris.withAppendedId(Telephony.Mms.CONTENT_URI, ContentUris.parseId(uriK));
                }
            }
        }
        Uri uri = uriWithAppendedId;
        if (uri != null && bindData.s() >= 100 && bindData.s() <= 117) {
            this.e.ac(uri, bindData.w());
        }
        return uri;
    }
}
