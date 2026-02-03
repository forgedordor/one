package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dapa {
    private static final eksp b = eksp.c("BugleConversation");
    public final fdjx a;
    private final Context c;
    private final batn d;
    private final avmp e;
    private final ajso f;
    private final ajln g;
    private final anty h;
    private final aofc i;
    private final alrj j;
    private final aypn k;

    public dapa(Context context, fdjx fdjxVar, batn batnVar, avmp avmpVar, ajso ajsoVar, ajln ajlnVar, anty antyVar, aofc aofcVar, alrj alrjVar, aypn aypnVar) {
        context.getClass();
        fdjxVar.getClass();
        batnVar.getClass();
        avmpVar.getClass();
        ajsoVar.getClass();
        ajlnVar.getClass();
        antyVar.getClass();
        aofcVar.getClass();
        alrjVar.getClass();
        aypnVar.getClass();
        this.c = context;
        this.a = fdjxVar;
        this.d = batnVar;
        this.e = avmpVar;
        this.f = ajsoVar;
        this.g = ajlnVar;
        this.h = antyVar;
        this.i = aofcVar;
        this.j = alrjVar;
        this.k = aypnVar;
    }

    private final void b(Intent intent, ConversationId conversationId, boolean z, boolean z2, boolean z3, boolean z4) throws IOException {
        eksp ekspVar;
        boolean z5;
        eksp ekspVar2;
        PendingAttachmentData pendingAttachmentDataA;
        long jLongValue;
        eksp ekspVar3 = b;
        eksl ekslVar = (eksl) ekspVar3.h();
        ekrz ekrzVar = cqnc.t;
        ekslVar.X(ekrzVar, conversationId);
        ekslVar.q("Action Voice Handler using MAPI to process SendMessage Intent.");
        boolean z6 = true;
        ajso.d(conversationId, intent, true);
        intent.setAction("android.intent.action.SENDTO");
        if (z3) {
            try {
                ArrayList arrayList = new ArrayList();
                boolean z7 = false;
                if (intent.getBooleanExtra("SEND_MULTIPLE", false)) {
                    intent.setAction("android.intent.action.SEND_MULTIPLE");
                    ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT > 33 ? intent.getParcelableArrayListExtra("android.intent.extra.STREAM", Uri.class) : intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                    if (parcelableArrayListExtra == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    arrayList.addAll(parcelableArrayListExtra);
                } else {
                    Uri uri = (Uri) (Build.VERSION.SDK_INT > 33 ? (Parcelable) intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class) : intent.getParcelableExtra("android.intent.extra.STREAM"));
                    if (uri != null) {
                        arrayList.add(uri);
                    }
                }
                batn batnVar = this.d;
                String type = intent.getType();
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Uri uriB = (Uri) arrayList.get(i);
                    String strC = batnVar.c(uriB, type);
                    cqce cqceVar = batn.a;
                    boolean z8 = z7;
                    boolean z9 = z6;
                    Object[] objArr = new Object[3];
                    objArr[z8 ? 1 : 0] = uriB;
                    objArr[z9 ? 1 : 0] = type;
                    objArr[2] = strC;
                    cqceVar.m(String.format("createAttachmentsFromUris: uri=%s, defaultType=%s, finalType=%s", objArr));
                    if (uriB != null) {
                        if (cqmz.o(uriB)) {
                            uriB = batnVar.b.b(uriB);
                        }
                        Uri uri2 = uriB;
                        cqmr cqmrVar = batnVar.b;
                        Context context = batnVar.c;
                        uri2.getClass();
                        if (cqmrVar.g(context, uri2)) {
                            if (cqmz.s(uri2)) {
                                batnVar.d.c("Bugle.Share.InternalTelephonyMmsFile.AttachAborted");
                            } else {
                                batnVar.d.c("Bugle.Share.InternalDataFile.AttachAborted");
                            }
                            throw new IllegalArgumentException("Cannot send private app data");
                        }
                        if (le.p(strC)) {
                            if (le.i(strC)) {
                                String strH = cqmz.h(context, uri2);
                                try {
                                    Long l = (Long) cqmz.g(context, uri2, "_size", new cqmv());
                                    ekspVar2 = ekspVar3;
                                    jLongValue = l != null ? l.longValue() : 0L;
                                } catch (SecurityException e) {
                                    ekrw ekrwVarI = cqmz.a.i();
                                    ekrwVarI.X(eksq.a, "Bugle");
                                    ekspVar2 = ekspVar3;
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "extractFileSizeFromUri", 832, "UriUtil.java")).t("Unable to extract file size from uri: %s", cqcv.b(uri2.toString()));
                                    jLongValue = 0;
                                }
                                if (strH != null && jLongValue > 0) {
                                    baii baiiVar = batnVar.e;
                                    elha elhaVar = elha.SHARE;
                                    cqxl cqxlVar = (cqxl) baiiVar.a.b();
                                    cqxlVar.getClass();
                                    Context context2 = (Context) baiiVar.b.b();
                                    context2.getClass();
                                    cqmp cqmpVar = (cqmp) baiiVar.c.b();
                                    cqmpVar.getClass();
                                    cmum cmumVar = (cmum) baiiVar.d.b();
                                    cmumVar.getClass();
                                    cqmz cqmzVar = (cqmz) baiiVar.e.b();
                                    cqmzVar.getClass();
                                    bxfu bxfuVar = (bxfu) baiiVar.g.b();
                                    bxfuVar.getClass();
                                    cmtv cmtvVar = (cmtv) baiiVar.i.b();
                                    cmtvVar.getClass();
                                    bahv bahvVar = (bahv) baiiVar.f.b();
                                    bahvVar.getClass();
                                    baii baiiVar2 = (baii) baiiVar.t.b();
                                    baiiVar2.getClass();
                                    cqsu cqsuVar = (cqsu) baiiVar.j.b();
                                    cqsuVar.getClass();
                                    cogw cogwVar = (cogw) baiiVar.k.b();
                                    cogwVar.getClass();
                                    crqx crqxVar = (crqx) baiiVar.l.b();
                                    crqxVar.getClass();
                                    cqok cqokVar = (cqok) baiiVar.m.b();
                                    cqokVar.getClass();
                                    Optional optional = (Optional) ((eyig) baiiVar.n).a;
                                    cqxp cqxpVar = (cqxp) baiiVar.o.b();
                                    cqxpVar.getClass();
                                    eosc eoscVar = (eosc) baiiVar.p.b();
                                    eoscVar.getClass();
                                    apsl apslVar = (apsl) baiiVar.q.b();
                                    apslVar.getClass();
                                    elhaVar.getClass();
                                    aqbx aqbxVar = (aqbx) baiiVar.s.b();
                                    aqbxVar.getClass();
                                    pendingAttachmentDataA = new PendingAttachmentData(cqxlVar, context2, cqmpVar, cmumVar, cqmzVar, bahvVar, bxfuVar, baiiVar.h, cmtvVar, baiiVar2, cqsuVar, cogwVar, crqxVar, cqokVar, optional, cqxpVar, eoscVar, apslVar, baiiVar.r, null, strC, uri2, null, -1, -1, null, null, jLongValue, elhaVar, -1L, null, null, strH, aqbxVar);
                                }
                                arrayList2.add(pendingAttachmentDataA);
                            } else {
                                ekspVar2 = ekspVar3;
                            }
                            pendingAttachmentDataA = batnVar.e.a(strC, uri2, elha.SHARE);
                            arrayList2.add(pendingAttachmentDataA);
                        } else {
                            Object[] objArr2 = new Object[3];
                            objArr2[z8 ? 1 : 0] = uri2;
                            objArr2[z9 ? 1 : 0] = type;
                            objArr2[2] = strC;
                            cqceVar.n(String.format("Unsupported content type: uri=%s, defaultType=%s, finalType=%s", objArr2));
                            ekspVar2 = ekspVar3;
                        }
                    } else {
                        ekspVar2 = ekspVar3;
                    }
                    i++;
                    z7 = z8 ? 1 : 0;
                    z6 = z9 ? 1 : 0;
                    ekspVar3 = ekspVar2;
                }
                ekspVar = ekspVar3;
                z5 = z6;
                intent.putParcelableArrayListExtra("message_parts", arrayList2);
            } catch (IllegalArgumentException e2) {
                ((eksl) ((eksl) b.j()).g(e2)).q("Internal error. Failed to extract data from intent.");
                throw new IllegalArgumentException("Internal error. Failed to extract data from intent.", e2);
            }
        } else {
            ekspVar = ekspVar3;
            z5 = true;
        }
        if (z2) {
            ComposeRowState composeRowStateA = avnr.a(this.d.a(intent), null);
            if (composeRowStateA != null || z4) {
                this.e.m(this.c, conversationId, new bato(composeRowStateA), z4, intent.getExtras());
                return;
            } else {
                ((eksl) ekspVar.j()).q("Internal error. Failed to parse draft data from intent.");
                throw new IllegalArgumentException("Internal error. Failed to parse draft data from intent.");
            }
        }
        eksl ekslVar2 = (eksl) ekspVar.h();
        ekslVar2.X(ekrzVar, conversationId);
        ekslVar2.q("Action Voice Handler using MAPI to Sending Message.");
        Action actionA = this.k.a();
        if (intent != null) {
            aypn.a.q("sendMessageFromAssistantIntent.");
            String scheme = intent.getScheme();
            if (scheme != null && scheme.startsWith("mms")) {
                intent.putExtra("requires_mms", z5);
            }
            aymo aymoVar = actionA.v;
            aymoVar.t("notification_intent", intent);
            aymoVar.r("bugle_message_source", 9);
            actionA.q(null);
        }
        if (z) {
            this.e.m(this.c, conversationId, new bato(null), z4, intent.getExtras());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Intent r14, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r15, java.lang.String r16, boolean r17, boolean r18, boolean r19, boolean r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dapa.a(android.content.Intent, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, java.lang.String, boolean, boolean, boolean, boolean, fcxy):java.lang.Object");
    }
}
