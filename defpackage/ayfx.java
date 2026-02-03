package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard;
import com.google.android.ims.rcsservice.chatsession.message.RichCardContainer;
import com.google.android.ims.rcsservice.chatsession.message.RichCardParser;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayfx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/RichCardMessagePartsCreator");
    public final bxoz b;
    private final fcsu c;
    private final dqsn d;
    private final bahv e;

    public ayfx(bxoz bxozVar, dqsn dqsnVar, bahv bahvVar, fcsu fcsuVar) {
        this.b = bxozVar;
        this.d = dqsnVar;
        this.e = bahvVar;
        this.c = fcsuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.ayfw b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r24, com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardMediaInfo r25, int r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayfx.b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardMediaInfo, int, boolean):ayfw");
    }

    public final void a(String str, MessageCoreData messageCoreData, boolean z) {
        int i = 0;
        RichCardContainer richCardContainer = new RichCardParser(str, false).parse(true);
        if (richCardContainer == null) {
            ekrd ekrdVar = (ekrd) a.j();
            ekrdVar.X(new ekrz("json", String.class, false, false), cqcv.b(str));
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/action/RichCardMessagePartsCreator", "addRichCardParts", 84, "RichCardMessagePartsCreator.java")).q("Rich Card parser failed to parse the incoming raw data.");
            return;
        }
        if (!TextUtils.isEmpty(richCardContainer.getExtractedTitle())) {
            messageCoreData.aM(this.e.i(richCardContainer.getExtractedTitle()));
        }
        if (!TextUtils.isEmpty(richCardContainer.getExtractedDescription())) {
            messageCoreData.aM(this.e.i(richCardContainer.getExtractedDescription()));
        }
        final ayfw ayfwVar = new ayfw();
        if (richCardContainer.containsStandaloneCard()) {
            messageCoreData.aM(this.e.h(str, elha.RICH_CARD));
            ayfw ayfwVarB = b(messageCoreData, richCardContainer.getStandaloneCard().content.media, 0, z);
            if (ayfwVarB != null) {
                ayfwVar.a(ayfwVarB);
            }
        } else if (richCardContainer.containsCarousel()) {
            messageCoreData.aM(this.e.h(str, elha.RICH_CARD_CAROUSEL));
            Iterator<GeneralPurposeRichCard> it = richCardContainer.getGeneralPurposeCards().iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                ayfw ayfwVarB2 = b(messageCoreData, it.next().content.media, i, z);
                if (ayfwVarB2 != null) {
                    ayfwVar.a(ayfwVarB2);
                }
                i = i2;
            }
        }
        if (z) {
            this.d.g(new dqsm() { // from class: ayfu
                @Override // defpackage.dqsm
                public final eieu a() {
                    return eiiy.k("RCMPC::downloadRichCardMediaParts::runAfterCommit");
                }
            }, null, new Runnable() { // from class: ayfv
                @Override // java.lang.Runnable
                public final void run() {
                    ayfv ayfvVar = this;
                    List<MessagePartCoreData> list = ayfwVar.a;
                    for (MessagePartCoreData messagePartCoreData : list) {
                        ayfx ayfxVar = ayfvVar.a;
                        if (messagePartCoreData.K() == elha.RICH_CARD_THUMBNAIL) {
                            Integer num = (Integer) dfaq.E().k().a();
                            num.intValue();
                            Uri uriV = messagePartCoreData.v();
                            uriV.getClass();
                            ekrd ekrdVar2 = (ekrd) ayfx.a.h();
                            ekrdVar2.X(new ekrz("downloadUrl", String.class, false, false), uriV.toString());
                            ekrdVar2.X(new ekrz("expectedSize", Long.class, false, false), Long.valueOf(messagePartCoreData.p()));
                            ekrdVar2.X(new ekrz("maxThumbnailSize", Integer.class, false, false), num);
                            ekrdVar2.X(new ekrz("conversationId", String.class, false, false), messagePartCoreData.A().a());
                            ekrdVar2.X(new ekrz("messageId", String.class, false, false), messagePartCoreData.B().b());
                            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/action/RichCardMessagePartsCreator", "downloadRichCardThumbnail", 301, "RichCardMessagePartsCreator.java")).q("Requesting thumbnail download");
                            bxoz bxozVar = ayfxVar.b;
                            if (bxozVar != null) {
                                bxozVar.a(messagePartCoreData, new bxqj[0]);
                            }
                        } else if (messagePartCoreData.K() == elha.RICH_CARD_MEDIA) {
                            Uri uriV2 = messagePartCoreData.v();
                            uriV2.getClass();
                            ekrd ekrdVar3 = (ekrd) ayfx.a.h();
                            ekrdVar3.X(new ekrz("downloadUrl", String.class, false, false), uriV2.toString());
                            ekrdVar3.X(new ekrz("expectedSize", Long.class, false, false), Long.valueOf(messagePartCoreData.p()));
                            ekrdVar3.X(new ekrz("conversationId", String.class, false, false), messagePartCoreData.A().a());
                            ekrdVar3.X(new ekrz("messageId", String.class, false, false), messagePartCoreData.B().b());
                            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/datamodel/action/RichCardMessagePartsCreator", "downloadRichCardMedia", 323, "RichCardMessagePartsCreator.java")).q("Requesting media download");
                            bxoz bxozVar2 = ayfxVar.b;
                            if (bxozVar2 != null) {
                                bxozVar2.a(messagePartCoreData, new bxqj[0]);
                            }
                        }
                        ayfvVar = this;
                    }
                    list.clear();
                }
            });
        }
    }
}
