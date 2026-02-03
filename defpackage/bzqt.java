package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzqt implements bzqk {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl");
    public final Context b;
    public final bxlc c;
    public final bzox d;
    public final cden e;
    private final eosc f;
    private final eosc g;
    private final aurx h;

    public bzqt(Context context, bxlc bxlcVar, eosc eoscVar, eosc eoscVar2, bzox bzoxVar, cden cdenVar, aurx aurxVar) {
        this.b = context;
        this.c = bxlcVar;
        this.f = eoscVar;
        this.g = eoscVar2;
        this.d = bzoxVar;
        this.e = cdenVar;
        this.h = aurxVar;
    }

    public static Uri c(final MessageIdType messageIdType, final String str) {
        return (Uri) MessagesTable.j(messageIdType, new Function() { // from class: bzqr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Uri uriC = ((MessagesTable.BindData) obj).C();
                if (uriC == null) {
                    String str2 = str;
                    ekrw ekrwVarJ = bzqt.a.j();
                    ekrwVarJ.X(eksq.a, "BugleCms");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl", "getMessageUri", 240, "CmsMediaDownloadStarterImpl.java")).t("Message is not persisted in Telephony before downloading its media part. Check the restore chaining flow. partId = %s", str2);
                }
                return uriC;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Supplier() { // from class: bzqs
            @Override // java.util.function.Supplier
            public final Object get() {
                ekrw ekrwVarJ = bzqt.a.j();
                ekrwVarJ.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl", "getMessageUri", 248, "CmsMediaDownloadStarterImpl.java")).t("Can't find message data for partId when downloading Cms media. messageId = %s", messageIdType.b());
                return null;
            }
        });
    }

    @Override // defpackage.bzqk
    public final void a(final ConversationIdType conversationIdType, final MessageIdType messageIdType, final String str) {
        eijx.f(new Runnable() { // from class: bzql
            @Override // java.lang.Runnable
            public final void run() {
                Integer numValueOf;
                ConversationIdType conversationIdType2 = conversationIdType;
                bzqt bzqtVar = this.a;
                MessageIdType messageIdType2 = messageIdType;
                if (messageIdType2.c()) {
                    return;
                }
                String str2 = str;
                ecem.b();
                ekrw ekrwVarH = bzqt.a.h();
                ekrwVarH.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl", "setMediaStatusToDownloading", 112, "CmsMediaDownloadStarterImpl.java")).t("Updating CmsAttachmentProcessingStatus to CMS_MEDIA_DOWNLOADING for partId = %s", str2);
                String[] strArr = PartsTable.a;
                bsjh bsjhVar = new bsjh();
                bsjhVar.ap("setMediaStatusToDownloading");
                bsjhVar.f(bvdl.CMS_MEDIA_DOWNLOADING);
                bsjhVar.c(str2);
                try {
                    String[] strArr2 = bpyh.a;
                    bpye bpyeVar = new bpye(bpyh.a);
                    bpyeVar.A("getAccountId");
                    bpyeVar.y(1);
                    bpxv bpxvVar = (bpxv) bpyeVar.b().p();
                    try {
                        if (bpxvVar.moveToFirst()) {
                            numValueOf = Integer.valueOf(bpxvVar.c());
                            bpxvVar.close();
                        } else {
                            bpxvVar.close();
                            numValueOf = null;
                        }
                        numValueOf.getClass();
                        int iIntValue = numValueOf.intValue();
                        Uri uriC = bzqt.c(messageIdType2, str2);
                        if (uriC != null && !uriC.equals(Uri.EMPTY)) {
                            String string = uriC.toString();
                            int length = string.length();
                            int iCharCount = 0;
                            while (iCharCount < length) {
                                int iCodePointAt = string.codePointAt(iCharCount);
                                if (!Character.isWhitespace(iCodePointAt)) {
                                    pzh pzhVar = new pzh();
                                    pzhVar.c(4);
                                    bzto.a(bzqtVar.b, pzhVar.a(), str2, uriC, iIntValue);
                                    return;
                                }
                                iCharCount += Character.charCount(iCodePointAt);
                            }
                        }
                        bzqtVar.d(bzqtVar.d.a(str2, iIntValue), str2, messageIdType2);
                    } finally {
                    }
                } catch (RuntimeException unused) {
                    bvdl bvdlVar = ((Boolean) ((cczi) cpxw.n.get()).e()).booleanValue() ? bvdl.CMS_MEDIA_DOWNLOAD_FAILED : bvdl.CMS_MEDIA_DOWNLOAD_NOT_STARTED;
                    ekrw ekrwVarH2 = bzqt.a.h();
                    ekrwVarH2.X(eksq.a, "BugleCms");
                    ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl", "setMediaStatusForFailure", 125, "CmsMediaDownloadStarterImpl.java")).D("Setting CmsAttachmentProcessingStatus to %s for partId = %s", bvdlVar.name(), str2);
                    bsjh bsjhVar2 = new bsjh();
                    bsjhVar2.ap("setMediaStatusForFailure");
                    bsjhVar2.f(bvdlVar);
                    bsjhVar2.c(str2);
                } finally {
                    bzqtVar.c.l(conversationIdType2, messageIdType2, "parts");
                }
            }
        }, this.f).k(auvh.b(), eoqg.a);
    }

    @Override // defpackage.bzqk
    public final void b(MessageIdType messageIdType, String str, final String str2, final int i, boolean z) {
        if (z) {
            d(this.d.e(str2, i), str2, messageIdType);
            return;
        }
        final Uri uriC = c(messageIdType, str2);
        if (uriC == null) {
            throw new bywa(String.format("Bugle non-tombstone message with no Telephony uri. message id = %s, message cmsId = %s", messageIdType, str), cpyz.NO_RETRY);
        }
        this.h.k().h(new ejvr() { // from class: bzqm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aumq aumqVar = (aumq) obj;
                aumqVar.getClass();
                ecem.b();
                pzh pzhVar = new pzh();
                pzhVar.c(true != aumqVar.d ? 4 : 3);
                bzto.a(this.a.b, pzhVar.a(), str2, uriC, i);
                return fctx.a;
            }
        }, this.g).k(auwc.a(new cqob(new Consumer() { // from class: bzqn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ekrw ekrwVarH = bzqt.a.h();
                ekrwVarH.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl", "enqueueMediaDownloadWorkToTelephonyForNonUserInitiated", 210, "CmsMediaDownloadStarterImpl.java")).q("CmsMediaDownloadStarterImpl: Successfully enqueued CmsTelephonyMediaRestoreWorker");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: bzqo
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ekrw ekrwVarJ = bzqt.a.j();
                ekrwVarJ.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl", "enqueueMediaDownloadWorkToTelephonyForNonUserInitiated", (char) 214, "CmsMediaDownloadStarterImpl.java")).q("CmsMediaDownloadStarterImpl: Failed to enqueue CmsTelephonyMediaRestoreWorker");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })), this.f);
    }

    public final void d(eiju eijuVar, final String str, final MessageIdType messageIdType) {
        ejvr ejvrVar = new ejvr() { // from class: bzqp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrw ekrwVarH = bzqt.a.h();
                ekrwVarH.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl", "handleEnqueueDownloadFutureResult", 171, "CmsMediaDownloadStarterImpl.java")).q("CmsMediaDownloadStarterImpl: Successfully enqueued restore of media.");
                return fctx.a;
            }
        };
        eosc eoscVar = this.g;
        eijuVar.h(ejvrVar, eoscVar).e(Exception.class, new ejvr() { // from class: bzqq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                ekrw ekrwVarJ = bzqt.a.j();
                ekrwVarJ.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl", "handleEnqueueDownloadFutureResult", 179, "CmsMediaDownloadStarterImpl.java")).D("CmsMediaDownloadStarterImpl: Failed to enqueue restore of media. partId: %s, messageId: %s", str, messageIdType);
                this.a.e.b(exc);
                return fctx.a;
            }
        }, eoscVar).k(auvh.b(), eoqg.a);
    }
}
