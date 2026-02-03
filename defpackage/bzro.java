package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzro implements bzre {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadHandlerImpl");
    public final dqsn a;
    private final bzuf c;
    private final eosc d;
    private final eosc e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final efwo i;
    private final bzsn j;
    private final bzvp k;
    private final fcsu l;
    private final appp m;

    public bzro(bzuf bzufVar, dqsn dqsnVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, efwo efwoVar, bzsn bzsnVar, bzvp bzvpVar, fcsu fcsuVar4, appp apppVar, eosc eoscVar, eosc eoscVar2) {
        this.c = bzufVar;
        this.a = dqsnVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = efwoVar;
        this.j = bzsnVar;
        this.k = bzvpVar;
        this.l = fcsuVar4;
        this.m = apppVar;
        this.d = eoscVar;
        this.e = eoscVar2;
    }

    @Override // defpackage.bzre
    public final eiju a(final MessagePartCoreData messagePartCoreData) {
        String strO = messagePartCoreData.O();
        if (!TextUtils.isEmpty(strO)) {
            ekrw ekrwVarH = b.h();
            ekrwVarH.X(eksq.a, "BugleCms");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadHandlerImpl", "uploadCompressedImageForPart", 158, "CmsMediaUploadHandlerImpl.java")).t("Part %s already has a compressed blob id set.", messagePartCoreData.W());
            return eijx.e(strO);
        }
        Uri uriT = messagePartCoreData.t();
        if (uriT == null || TextUtils.isEmpty(uriT.toString())) {
            return eijx.c();
        }
        bzuf bzufVar = this.c;
        bzuf.h(2, uriT);
        if (!this.j.a(messagePartCoreData)) {
            return eijx.c();
        }
        bzufVar.i();
        String strValueOf = String.valueOf(String.valueOf(UUID.randomUUID()));
        boolean zBooleanValue = ((Boolean) ((cczi) cpyl.y.get()).e()).booleanValue();
        final String strConcat = "cms-file-id".concat(strValueOf);
        return zBooleanValue ? this.k.b().i(new eooz() { // from class: bzrh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                if (!zBooleanValue2) {
                    throw new cpzj(78, messagePartCoreData2.W());
                }
                return this.a.d(messagePartCoreData2, strConcat);
            }
        }, this.e) : d(messagePartCoreData, strConcat);
    }

    @Override // defpackage.bzre
    public final eiju b(final MessagePartCoreData messagePartCoreData) {
        String strP = messagePartCoreData.P();
        if (!TextUtils.isEmpty(strP)) {
            ekrw ekrwVarH = b.h();
            ekrwVarH.X(eksq.a, "BugleCms");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadHandlerImpl", "uploadMediaForPart", 122, "CmsMediaUploadHandlerImpl.java")).t("Part %s already has a full-size blob id set.", messagePartCoreData.W());
            return eijx.e(strP);
        }
        final Uri uriT = messagePartCoreData.t();
        if (uriT == null || TextUtils.isEmpty(uriT.toString())) {
            return eijx.c();
        }
        bzuf bzufVar = this.c;
        bzuf.h(1, uriT);
        if (!bzsn.c(messagePartCoreData)) {
            return eijx.c();
        }
        bzufVar.i();
        String strValueOf = String.valueOf(String.valueOf(UUID.randomUUID()));
        boolean zBooleanValue = ((Boolean) ((cczi) cpyl.y.get()).e()).booleanValue();
        final String strConcat = "cms-file-id".concat(strValueOf);
        return zBooleanValue ? this.k.b().i(new eooz() { // from class: bzrj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                if (!zBooleanValue2) {
                    throw new cpzj(77, messagePartCoreData2.W());
                }
                String str = strConcat;
                return this.a.e(uriT, messagePartCoreData2, str);
            }
        }, this.e) : e(uriT, messagePartCoreData, strConcat);
    }

    @Override // defpackage.bzre
    public final eiju c(ParticipantsTable.BindData bindData) {
        Uri uriX = bindData.x();
        if (uriX == null || TextUtils.isEmpty(uriX.toString())) {
            return eijx.c();
        }
        final String strR = bindData.R();
        String strU = bindData.U();
        if (!TextUtils.isEmpty(strU)) {
            ekrw ekrwVarH = b.h();
            ekrwVarH.X(eksq.a, "BugleCms");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadHandlerImpl", "uploadProfilePhotoForParticipant", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "CmsMediaUploadHandlerImpl.java")).t("Participant %s already has a profile photo blob id set.", bindData.R());
            return eijx.e(strU);
        }
        bzuf bzufVar = this.c;
        bzuf.h(1, uriX);
        if (!this.j.b(bindData)) {
            return eijx.c();
        }
        bzufVar.i();
        return eiju.g(bzufVar.d(uriX, this.i, "cms-file-id".concat(String.valueOf(String.valueOf(UUID.randomUUID()))), false)).h(new ejvr() { // from class: bzrg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final bzue bzueVar = (bzue) obj;
                final bzro bzroVar = this.a;
                final String str = strR;
                bzroVar.a.d("CmsMediaUploadHandlerImpl#uploadProfilePhoto", new Runnable() { // from class: bzrk
                    @Override // java.lang.Runnable
                    public final void run() {
                        eieu eieuVarK;
                        bzro bzroVar2 = bzroVar;
                        String str2 = str;
                        bzue bzueVar2 = bzueVar;
                        evqs evqsVarA = bzueVar2.a();
                        if (evqsVarA != null) {
                            byte[] bArrI = evqsVarA.I();
                            eieuVarK = eiiy.k("CmsMediaUploadHandlerImpl#updateParticipantsProfilePhotoEncryptionKey");
                            try {
                                cqaz.h();
                                bsbs bsbsVarF = ParticipantsTable.f();
                                bsbsVarF.ap("updateParticipantsProfilePhotoEncryptionKey");
                                bsbsVarF.L(bArrI);
                                bzroVar2.g(str2, bsbsVarF);
                                eieuVarK.close();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        String strB = bzueVar2.b();
                        eieuVarK = eiiy.k("CmsMediaUploadHandlerImpl#updateParticipantsBlobId");
                        try {
                            cqaz.h();
                            bsbs bsbsVarF2 = ParticipantsTable.f();
                            bsbsVarF2.ap("updateParticipantsBlobId");
                            bsbsVarF2.K(strB);
                            bzroVar2.g(str2, bsbsVarF2);
                            eieuVarK.close();
                        } finally {
                            try {
                                eieuVarK.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                    }
                });
                return bzueVar.b();
            }
        }, this.d);
    }

    public final eiju d(final MessagePartCoreData messagePartCoreData, String str) {
        final String strW = messagePartCoreData.W();
        final ConversationIdType conversationIdTypeA = messagePartCoreData.A();
        final MessageIdType messageIdTypeB = messagePartCoreData.B();
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleCms");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadHandlerImpl", "uploadCompressedImagePart", 280, "CmsMediaUploadHandlerImpl.java")).D("Start uploading compressed image part. partId=%s messageId=%s", strW, messageIdTypeB);
        Uri uriT = messagePartCoreData.t();
        return (uriT == null || TextUtils.isEmpty(uriT.toString())) ? eijx.c() : eiju.g(this.c.j(messagePartCoreData.R(), messagePartCoreData.v(), uriT, messagePartCoreData.c(), messagePartCoreData.b(), this.i, str, false)).h(new ejvr() { // from class: bzrl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final bzue bzueVar = (bzue) obj;
                final bzro bzroVar = this.a;
                final ConversationIdType conversationIdType = conversationIdTypeA;
                final MessageIdType messageIdType = messageIdTypeB;
                final String str2 = strW;
                final MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                bzroVar.a.d("CmsMediaUploadHandlerImpl#uploadCompressedImagePart", new Runnable() { // from class: bzrm
                    @Override // java.lang.Runnable
                    public final void run() {
                        bzue bzueVar2 = bzueVar;
                        String strB = bzueVar2.b();
                        eieu eieuVarK = eiiy.k("CmsMediaUploadHandlerImpl#updateMessagePartCmsCompressedSizeBlobId");
                        bzro bzroVar2 = bzroVar;
                        MessagePartCoreData messagePartCoreData3 = messagePartCoreData2;
                        ConversationIdType conversationIdType2 = conversationIdType;
                        MessageIdType messageIdType2 = messageIdType;
                        String str3 = str2;
                        try {
                            ecem.b();
                            String[] strArr = PartsTable.a;
                            bsjh bsjhVar = new bsjh();
                            bsjhVar.ap("updateMessagePartCmsCompressedSizeBlobId");
                            bsjhVar.g(strB);
                            bzroVar2.h(conversationIdType2, messageIdType2, str3, bsjhVar);
                            eieuVarK.close();
                            evqs evqsVarA = bzueVar2.a();
                            if (evqsVarA != null) {
                                byte[] bArrI = evqsVarA.I();
                                eieu eieuVarK2 = eiiy.k("CmsMediaUploadHandlerImpl#updateMessagePartCmsCompressedMediaEncryptionKey");
                                try {
                                    ecem.b();
                                    bsjh bsjhVar2 = new bsjh();
                                    bsjhVar2.ap("updateMessagePartCmsCompressedMediaEncryptionKey");
                                    int iIntValue = PartsTable.e().intValue();
                                    int iIntValue2 = PartsTable.e().intValue();
                                    if (iIntValue2 < 42070) {
                                        dqru.x("cms_compressed_media_encryption_key", iIntValue2);
                                    }
                                    if (iIntValue >= 42070) {
                                        bsjhVar2.a.put("cms_compressed_media_encryption_key", bArrI);
                                    }
                                    bzroVar2.f(messagePartCoreData3, bsjhVar2);
                                    eieuVarK2.close();
                                } catch (Throwable th) {
                                    try {
                                        eieuVarK2.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                eieuVarK.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                });
                return bzueVar.b();
            }
        }, this.d);
    }

    public final eiju e(Uri uri, final MessagePartCoreData messagePartCoreData, String str) {
        final String strW = messagePartCoreData.W();
        final ConversationIdType conversationIdTypeA = messagePartCoreData.A();
        final MessageIdType messageIdTypeB = messagePartCoreData.B();
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleCms");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadHandlerImpl", "uploadMediaPart", 247, "CmsMediaUploadHandlerImpl.java")).D("Start uploading media part. partId=%s messageId=%s", strW, messageIdTypeB);
        return eiju.g(this.c.d(uri, this.i, str, false)).h(new ejvr() { // from class: bzrn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final bzue bzueVar = (bzue) obj;
                final bzro bzroVar = this.a;
                final ConversationIdType conversationIdType = conversationIdTypeA;
                final MessageIdType messageIdType = messageIdTypeB;
                final String str2 = strW;
                final MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                bzroVar.a.d("CmsMediaUploadHandlerImpl#uploadMediaPart", new Runnable() { // from class: bzri
                    @Override // java.lang.Runnable
                    public final void run() {
                        bzue bzueVar2 = bzueVar;
                        String strB = bzueVar2.b();
                        eieu eieuVarK = eiiy.k("CmsMediaUploadHandlerImpl#updateMessagePartCmsFullSizeBlobId");
                        bzro bzroVar2 = bzroVar;
                        MessagePartCoreData messagePartCoreData3 = messagePartCoreData2;
                        ConversationIdType conversationIdType2 = conversationIdType;
                        MessageIdType messageIdType2 = messageIdType;
                        String str3 = str2;
                        try {
                            ecem.b();
                            String[] strArr = PartsTable.a;
                            bsjh bsjhVar = new bsjh();
                            bsjhVar.ap("updateMessagePartCmsFullSizeBlobId");
                            bsjhVar.h(strB);
                            bzroVar2.h(conversationIdType2, messageIdType2, str3, bsjhVar);
                            eieuVarK.close();
                            evqs evqsVarA = bzueVar2.a();
                            if (evqsVarA != null) {
                                byte[] bArrI = evqsVarA.I();
                                eieu eieuVarK2 = eiiy.k("CmsMediaUploadHandlerImpl#updateMessagePartCmsMediaEncryptionKey");
                                try {
                                    ecem.b();
                                    bsjh bsjhVar2 = new bsjh();
                                    bsjhVar2.ap("updateMessagePartCmsMediaEncryptionKey");
                                    bsjhVar2.i(bArrI);
                                    bzroVar2.f(messagePartCoreData3, bsjhVar2);
                                    eieuVarK2.close();
                                } catch (Throwable th) {
                                    try {
                                        eieuVarK2.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                eieuVarK.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                });
                return bzueVar.b();
            }
        }, this.d);
    }

    public final void f(MessagePartCoreData messagePartCoreData, bsjh bsjhVar) {
        h(messagePartCoreData.A(), messagePartCoreData.B(), messagePartCoreData.W(), bsjhVar);
    }

    final void g(final String str, bsbs bsbsVar) {
        eieu eieuVarK = eiiy.k("CmsMediaUploadHandlerImpl#updateParticipantRowIfExists");
        try {
            cqaz.h();
            bsbsVar.am();
            bsbsVar.U(new Function() { // from class: bzrf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsbx bsbxVar = (bsbx) obj;
                    bsbxVar.k(str);
                    return bsbxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int iE = bsbsVar.b().e();
            if (iE != 0) {
                if (iE != 1) {
                    ekrw ekrwVarI = b.i();
                    ekrwVarI.X(eksq.a, "BugleCms");
                    ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadHandlerImpl", "updateParticipantRowIfExists", 376, "CmsMediaUploadHandlerImpl.java")).r("Updated more than one row when only one should be updated or tried to update a non-exist participant.\n updateCount = %s", iE);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    Iterator<E> it = ((bakt) this.f.b()).E(arrayList).iterator();
                    while (it.hasNext()) {
                        ((bxlc) this.h.b()).n((ConversationIdType) it.next());
                    }
                }
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(ConversationIdType conversationIdType, MessageIdType messageIdType, String str, bsjh bsjhVar) {
        eieu eieuVarK = eiiy.k("CmsMediaUploadHandlerImpl#updatePartRowIfExists");
        try {
            if (!((bbae) this.g.b()).g(conversationIdType, messageIdType, str, bsjhVar, !((eoth) ((aotp) this.m).a.b()).a("bugle.prevent_unnecessary_part_update_notification"))) {
                ekrw ekrwVarJ = b.j();
                ekrwVarJ.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadHandlerImpl", "updatePartRowIfExists", 487, "CmsMediaUploadHandlerImpl.java")).I("Cannot update non-existent part. partId=%s messageId=$%s conversationId=%s", str, messageIdType, conversationIdType);
                ((ains) this.l.b()).c("Bugle.Cms.Media.Upload.UpdatePart.MissingPart.Count");
            }
            eieuVarK.close();
        } finally {
        }
    }
}
