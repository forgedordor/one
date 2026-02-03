package defpackage;

import android.content.Context;
import android.net.Uri;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxph implements bxoy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader");
    public final eosc b;
    public final bxpg c;
    public final dqsn d;
    private final bxqi e;
    private final eosc f;
    private final eosc g;
    private final bxox h;

    public bxph(bxox bxoxVar, bxqi bxqiVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, bxpg bxpgVar, dqsn dqsnVar) {
        this.h = bxoxVar;
        this.e = bxqiVar;
        this.f = eoscVar;
        this.g = eoscVar2;
        this.b = eoscVar3;
        this.c = bxpgVar;
        this.d = dqsnVar;
    }

    private final Set c(ConversationIdType conversationIdType, BugleMessageId bugleMessageId, bxqj[] bxqjVarArr) {
        Set<bxqj> setJ = ekpg.j();
        Collections.addAll(setJ, bxqjVarArr);
        String strValueOf = String.valueOf(bugleMessageId.b());
        for (bxqj bxqjVar : setJ) {
            if ((bxqjVar instanceof bxqh) && ((bxqh) bxqjVar).d.equals(strValueOf)) {
                return setJ;
            }
        }
        ekrd ekrdVar = (ekrd) a.h();
        ekrdVar.X(cqnc.s, conversationIdType);
        ekrdVar.X(cqnc.c, bugleMessageId);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader", "withDatabaseHandler", 288, "RichCardMediaDownloadServiceDownloader.java")).q("Adding database handler for downloaded media part.");
        bxqi bxqiVar = this.e;
        MessageIdType messageIdTypeC = bugleMessageId.c();
        eosc eoscVar = (eosc) bxqiVar.a.b();
        eoscVar.getClass();
        dqsn dqsnVar = (dqsn) bxqiVar.c.b();
        dqsnVar.getClass();
        bxqa bxqaVar = (bxqa) bxqiVar.d.b();
        bxqaVar.getClass();
        ((Context) bxqiVar.e.b()).getClass();
        ((bxos) bxqiVar.f.b()).getClass();
        ((Map) bxqiVar.g.b()).getClass();
        conversationIdType.getClass();
        messageIdTypeC.getClass();
        strValueOf.getClass();
        ((arvk) bxqiVar.h.b()).getClass();
        setJ.add(new bxqh(eoscVar, bxqiVar.b, dqsnVar, bxqaVar, conversationIdType, messageIdTypeC, strValueOf));
        return setJ;
    }

    public final void a(Uri uri) {
        ekrd ekrdVar = (ekrd) a.h();
        ekrdVar.X(new ekrz(VCardConstants.PROPERTY_URL, Uri.class, false, false), uri);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader", "cancelDownload", 209, "RichCardMediaDownloadServiceDownloader.java")).q("Cancelling a download.");
        bxox bxoxVar = this.h;
        ConcurrentMap concurrentMap = bxoxVar.c.a;
        String str = (String) concurrentMap.remove(uri);
        if (str != null) {
            Uri uriFromFile = Uri.fromFile(bxoxVar.f.a(bxoxVar.e, str));
            cqbd cqbdVarC = bxox.a.c();
            cqbdVarC.I("Cancelling download");
            cqbdVarC.N(VCardConstants.PROPERTY_URL, uri);
            cqbdVarC.N("file", uriFromFile);
            cqbdVarC.r();
            bxoxVar.b.b(uriFromFile.toString());
        } else {
            cqbd cqbdVarC2 = bxox.a.c();
            cqbdVarC2.I("No download to cancel");
            cqbdVarC2.N(VCardConstants.PROPERTY_URL, uri);
            cqbdVarC2.r();
        }
        cqbd cqbdVarC3 = bxox.a.c();
        cqbdVarC3.y("remainingDownloads", concurrentMap.size());
        cqbdVarC3.r();
        eika.l(eijx.e(Boolean.valueOf(str != null)), new bxpe(this, uri), this.f);
    }

    public final void b(ConversationIdType conversationIdType, BugleMessageId bugleMessageId, final Uri uri, long j, bxqj... bxqjVarArr) {
        Uri uri2;
        String str;
        dtzl dtzlVar;
        ekgb ekgbVar;
        String str2;
        evqe evqeVar;
        ConcurrentMap concurrentMap = this.c.a;
        bxpo bxpoVar = (bxpo) concurrentMap.get(uri);
        if (bxpoVar != null) {
            ekrd ekrdVar = (ekrd) a.h();
            ekrdVar.X(new ekrz(VCardConstants.PROPERTY_URL, Uri.class, false, false), uri);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader", "downloadMediaAndUpdateMessagePart", 120, "RichCardMediaDownloadServiceDownloader.java")).q("Adding callback to existing download.");
            bxpoVar.b(c(conversationIdType, bugleMessageId, bxqjVarArr));
            return;
        }
        eosc eoscVar = this.g;
        eosc eoscVar2 = this.f;
        bxpo bxpoVar2 = new bxpo(eoscVar, eoscVar2);
        bxpo bxpoVar3 = (bxpo) concurrentMap.putIfAbsent(uri, bxpoVar2);
        if (bxpoVar3 != null) {
            ekrd ekrdVar2 = (ekrd) a.h();
            ekrdVar2.X(new ekrz(VCardConstants.PROPERTY_URL, Uri.class, false, false), uri);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader", "downloadMediaAndUpdateMessagePart", 136, "RichCardMediaDownloadServiceDownloader.java")).q("Concurrent addition, adding callback to existing set of callbacks.");
            bxpoVar3.b(c(conversationIdType, bugleMessageId, bxqjVarArr));
            return;
        }
        ekrd ekrdVar3 = (ekrd) a.h();
        ekrdVar3.X(new ekrz(VCardConstants.PROPERTY_URL, Uri.class, false, false), uri);
        ekrz ekrzVar = new ekrz("numberOfAttachedCallbacks", Integer.class, false, false);
        Set<bxqj> set = bxpoVar2.b;
        ekrdVar3.X(ekrzVar, Integer.valueOf(set.size()));
        ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader", "downloadMediaAndUpdateMessagePart", 148, "RichCardMediaDownloadServiceDownloader.java")).q("Creating a new ongoing download.");
        bxpoVar2.b(c(conversationIdType, bugleMessageId, bxqjVarArr));
        bxox bxoxVar = this.h;
        int i = (int) j;
        String strValueOf = String.valueOf(String.valueOf(UUID.randomUUID()));
        bxos bxosVar = bxoxVar.f;
        String strConcat = bxosVar.b.concat(strValueOf);
        ConcurrentMap concurrentMap2 = bxoxVar.c.a;
        String str3 = (String) concurrentMap2.putIfAbsent(uri, strConcat);
        if (str3 != null) {
            strConcat = str3;
        }
        final Uri uriBuild = new Uri.Builder().authority(bxosVar.a).scheme("content").appendPath(strConcat).build();
        File fileA = bxosVar.a(bxoxVar.e, strConcat);
        cqce cqceVar = bxox.a;
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.I("Starting MDD download for");
        cqbdVarC.N(VCardConstants.PROPERTY_URL, uri);
        cqbdVarC.N("destinationFile", fileA);
        cqbdVarC.A("destinationUri", uriBuild);
        cqbdVarC.y("expectedSize", i);
        cqbdVarC.y("remainingDownloads", concurrentMap2.size());
        cqbdVarC.r();
        cqbd cqbdVarC2 = cqceVar.c();
        cqbdVarC2.I("Starting download...");
        cqbdVarC2.N(VCardConstants.PROPERTY_URL, uri);
        cqbdVarC2.r();
        try {
            for (final bxqj bxqjVar : set) {
                bxpoVar2.c(new Runnable() { // from class: bxpl
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            bxqjVar.d(uri.toString());
                        } catch (RuntimeException e) {
                            bxpo.a.s("Error while calling #onStart", e);
                        }
                    }
                });
            }
        } catch (RuntimeException e) {
            cqbd cqbdVarB = bxox.a.b();
            cqbdVarB.I("Callback error: #onStart");
            cqbdVarB.s(e);
        }
        bxov bxovVar = new bxov(bxoxVar, bxpoVar2, uri, uriBuild, i);
        duul duulVar = new duul();
        duulVar.e = -1;
        duulVar.m = (byte) (duulVar.m | 1);
        int i2 = ekgb.d;
        ekgb ekgbVar2 = ekoe.a;
        if (ekgbVar2 == null) {
            throw new NullPointerException("Null extraHttpHeaders");
        }
        duulVar.f = ekgbVar2;
        duulVar.a(0);
        duulVar.b(true);
        evqe evqeVar2 = evqe.a;
        if (evqeVar2 == null) {
            throw new NullPointerException("Null customDownloaderMetadata");
        }
        duulVar.l = evqeVar2;
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            throw new NullPointerException("Null destinationFileUri");
        }
        duulVar.a = uriFromFile;
        String string = uri.toString();
        if (string == null) {
            throw new NullPointerException("Null urlToDownload");
        }
        duulVar.b = string;
        duulVar.a(i);
        dtzl dtzlVar2 = dtzl.c;
        if (dtzlVar2 == null) {
            throw new NullPointerException("Null downloadConstraints");
        }
        duulVar.c = dtzlVar2;
        duulVar.b(false);
        duulVar.d = ejwi.j(bxovVar);
        String str4 = duulVar.h;
        if (!(str4 == null ? ejud.a : ejwi.j(str4)).g()) {
            String str5 = duulVar.b;
            if (str5 == null) {
                throw new IllegalStateException("Property \"urlToDownload\" has not been set");
            }
            duulVar.h = str5;
        }
        if (duulVar.m == 7 && (uri2 = duulVar.a) != null && (str = duulVar.b) != null && (dtzlVar = duulVar.c) != null && (ekgbVar = duulVar.f) != null && (str2 = duulVar.h) != null && (evqeVar = duulVar.l) != null) {
            eika.l(eiju.g(bxoxVar.b.a(new duum(uri2, str, dtzlVar, duulVar.d, duulVar.e, ekgbVar, duulVar.g, str2, duulVar.i, duulVar.j, duulVar.k, evqeVar))).i(new eooz() { // from class: bxou
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return eijx.e(uriBuild);
                }
            }, bxoxVar.d).f(Exception.class, new eooz() { // from class: bxpc
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    this.a.c.a.remove(uri);
                    return eijx.d((Exception) obj);
                }
            }, eoscVar2).h(new ejvr() { // from class: bxpd
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Uri uri3 = (Uri) obj;
                    this.a.c.a.remove(uri);
                    return uri3;
                }
            }, eoscVar2), new bxpf(uri), eoscVar2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (duulVar.a == null) {
            sb.append(" destinationFileUri");
        }
        if (duulVar.b == null) {
            sb.append(" urlToDownload");
        }
        if (duulVar.c == null) {
            sb.append(" downloadConstraints");
        }
        if ((duulVar.m & 1) == 0) {
            sb.append(" trafficTag");
        }
        if (duulVar.f == null) {
            sb.append(" extraHttpHeaders");
        }
        if ((duulVar.m & 2) == 0) {
            sb.append(" fileSizeBytes");
        }
        if (duulVar.h == null) {
            sb.append(" notificationContentTitle");
        }
        if ((duulVar.m & 4) == 0) {
            sb.append(" showDownloadedNotification");
        }
        if (duulVar.l == null) {
            sb.append(" customDownloaderMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
