package com.google.android.ims.rcsservice.chatsession.message;

import android.text.TextUtils;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import defpackage.dfoy;
import defpackage.dhic;
import defpackage.dhja;
import defpackage.ekfw;
import defpackage.ekgb;
import defpackage.esyd;
import defpackage.esye;
import defpackage.esyr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RichCardParser {
    private final boolean enablePdfInRichCards;
    private RbmSpecificMessage message;
    private esyd parser;
    private final String rawData;

    public RichCardParser(String str, boolean z) {
        this.rawData = str;
        esye esyeVar = new esye();
        esyeVar.b();
        this.parser = esyeVar.a();
        this.enablePdfInRichCards = z;
    }

    private void extractTitleAndDescription() {
        RbmSpecificMessage rbmSpecificMessage = this.message;
        if (rbmSpecificMessage == null || rbmSpecificMessage.container == null) {
            return;
        }
        if (((Boolean) RichCardContainer.USE_REFACTORED_RICH_CARD_CONTAINER.a()).booleanValue()) {
            if (!rbmSpecificMessage.container.hasGeneralPurposeCard()) {
                return;
            }
        } else if (!rbmSpecificMessage.container.containsStandaloneCard() && !rbmSpecificMessage.container.containsCarousel()) {
            return;
        }
        GeneralPurposeRichCard generalPurposeRichCard = rbmSpecificMessage.container.getGeneralPurposeCards().get(0);
        GeneralPurposeRichCardContent generalPurposeRichCardContent = generalPurposeRichCard.content;
        if (generalPurposeRichCardContent != null) {
            rbmSpecificMessage.container.setExtractedTitle(generalPurposeRichCardContent.title);
            rbmSpecificMessage.container.setExtractedDescription(generalPurposeRichCard.content.description);
        }
    }

    private ekgb<String> getAllSupportedRichCardMediaTypes() {
        if (!this.enablePdfInRichCards) {
            return GeneralPurposeRichCardMediaInfo.SUPPORTED_RICH_CARD_MEDIA_TYPES;
        }
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.j(GeneralPurposeRichCardMediaInfo.SUPPORTED_RICH_CARD_MEDIA_TYPES);
        ekfwVar.j(GeneralPurposeRichCardMediaInfo.SUPPORTED_RICH_CARD_FILE_TYPES);
        return ekfwVar.g();
    }

    private boolean hasValidMediaFilesInformation(GeneralPurposeRichCardMediaInfo generalPurposeRichCardMediaInfo, boolean z) {
        String str;
        if (generalPurposeRichCardMediaInfo == null) {
            return true;
        }
        if (TextUtils.isEmpty(generalPurposeRichCardMediaInfo.mediaUrl)) {
            dhja.g("Media payload was not empty but media url was missing.", new Object[0]);
            return false;
        }
        if (generalPurposeRichCardMediaInfo.mediaContentType == null || !getAllSupportedRichCardMediaTypes().contains(generalPurposeRichCardMediaInfo.mediaContentType.toLowerCase(Locale.ROOT))) {
            dhja.g("Media content type unsupported: {%s}. Discarding message..", generalPurposeRichCardMediaInfo.mediaContentType);
            return false;
        }
        Long l = generalPurposeRichCardMediaInfo.mediaFileSize;
        if (l == null || l.longValue() < 1) {
            dhja.g("Media file size invalid: {%d}. Discarding message..", generalPurposeRichCardMediaInfo.mediaFileSize);
            return false;
        }
        if (!TextUtils.isEmpty(generalPurposeRichCardMediaInfo.thumbnailUrl)) {
            String str2 = generalPurposeRichCardMediaInfo.thumbnailContentType;
            if (str2 == null || !GeneralPurposeRichCardMediaInfo.SUPPORTED_MEDIA_IMAGE_TYPES.contains(str2.toLowerCase(Locale.ROOT))) {
                dhja.g("Thumbnail content type unsupported: {%s}. Discarding message..", generalPurposeRichCardMediaInfo.thumbnailContentType);
                return false;
            }
            Long l2 = generalPurposeRichCardMediaInfo.thumbnailFileSize;
            if (l2 == null || l2.longValue() < 1) {
                dhja.g("Thumbnail file size invalid: {%d}. Discarding message..", generalPurposeRichCardMediaInfo.thumbnailFileSize);
                return false;
            }
        }
        return !z || ((str = generalPurposeRichCardMediaInfo.height) != null && (TextUtils.equals(str, GeneralPurposeRichCardMediaInfo.IMAGE_HEIGHT_SHORT) || TextUtils.equals(generalPurposeRichCardMediaInfo.height, GeneralPurposeRichCardMediaInfo.IMAGE_HEIGHT_MEDIUM) || TextUtils.equals(generalPurposeRichCardMediaInfo.height, GeneralPurposeRichCardMediaInfo.IMAGE_HEIGHT_TALL)));
    }

    private static boolean isValidCarouselLayout(GeneralPurposeRichCardLayoutInfo generalPurposeRichCardLayoutInfo) {
        String str = generalPurposeRichCardLayoutInfo.cardOrientation;
        String str2 = generalPurposeRichCardLayoutInfo.cardWidth;
        if (TextUtils.isEmpty(str) || GeneralPurposeRichCardLayoutInfo.ORIENTATION_VERTICAL.equals(str)) {
            return GeneralPurposeRichCardLayoutInfo.WIDTH_SMALL.equals(str2) || GeneralPurposeRichCardLayoutInfo.WIDTH_MEDIUM.equals(str2);
        }
        return false;
    }

    private boolean isValidGeneralPurposeCard(RbmSpecificMessage rbmSpecificMessage) {
        GeneralPurposeRichCardLayoutInfo generalPurposeRichCardLayoutInfo;
        if (rbmSpecificMessage == null || rbmSpecificMessage.container == null) {
            return false;
        }
        if (((Boolean) RichCardContainer.USE_REFACTORED_RICH_CARD_CONTAINER.a()).booleanValue() && !rbmSpecificMessage.container.containsStandaloneCard()) {
            return false;
        }
        GeneralPurposeRichCard standaloneCard = ((Boolean) RichCardContainer.USE_REFACTORED_RICH_CARD_CONTAINER.a()).booleanValue() ? rbmSpecificMessage.container.getStandaloneCard() : rbmSpecificMessage.container.generalPurposeCard;
        if (standaloneCard == null || standaloneCard.content == null || (generalPurposeRichCardLayoutInfo = standaloneCard.layout) == null || !isValidStandaloneLayout(generalPurposeRichCardLayoutInfo)) {
            return false;
        }
        return hasValidMediaFilesInformation(standaloneCard.content.media, TextUtils.equals(standaloneCard.layout.cardOrientation, GeneralPurposeRichCardLayoutInfo.ORIENTATION_VERTICAL));
    }

    private boolean isValidGeneralPurposeCardCarousel(RbmSpecificMessage rbmSpecificMessage) {
        GeneralPurposeRichCardCarousel generalPurposeRichCardCarousel;
        GeneralPurposeRichCardLayoutInfo generalPurposeRichCardLayoutInfo;
        if (rbmSpecificMessage == null || rbmSpecificMessage.container == null || ((((Boolean) RichCardContainer.USE_REFACTORED_RICH_CARD_CONTAINER.a()).booleanValue() && !rbmSpecificMessage.container.containsCarousel()) || (generalPurposeRichCardCarousel = rbmSpecificMessage.container.generalPurposeCardCarousel) == null || dhic.a(generalPurposeRichCardCarousel.contents) || (generalPurposeRichCardLayoutInfo = generalPurposeRichCardCarousel.layout) == null || !isValidCarouselLayout(generalPurposeRichCardLayoutInfo))) {
            return false;
        }
        ArrayList<GeneralPurposeRichCardContent> arrayList = generalPurposeRichCardCarousel.contents;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            boolean zHasValidMediaFilesInformation = hasValidMediaFilesInformation(arrayList.get(i).media, true);
            i++;
            if (!zHasValidMediaFilesInformation) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidStandaloneLayout(GeneralPurposeRichCardLayoutInfo generalPurposeRichCardLayoutInfo) {
        String str = generalPurposeRichCardLayoutInfo.cardOrientation;
        String str2 = generalPurposeRichCardLayoutInfo.imageAlignment;
        if (GeneralPurposeRichCardLayoutInfo.ORIENTATION_VERTICAL.equals(str)) {
            return true;
        }
        if (GeneralPurposeRichCardLayoutInfo.ORIENTATION_HORIZONTAL.equals(str)) {
            return GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_LEFT.equals(str2) || GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_RIGHT.equals(str2);
        }
        return false;
    }

    RbmSpecificMessage getMessage() {
        return this.message;
    }

    public RichCardContainer parse() {
        return parse(false);
    }

    public RichCardContainer parse(boolean z) {
        if (TextUtils.isEmpty(this.rawData)) {
            return null;
        }
        String str = this.rawData;
        if (!dfoy.n() && !dfoy.d()) {
            dhja.k("Both, Rich Cards and Rich Card carousels are disabled, discarding message.", new Object[0]);
            return null;
        }
        try {
            RbmSpecificMessage rbmSpecificMessage = (RbmSpecificMessage) this.parser.i(str, RbmSpecificMessage.class);
            this.message = rbmSpecificMessage;
            if (!isValidGeneralPurposeCard(rbmSpecificMessage) && !isValidGeneralPurposeCardCarousel(this.message)) {
                dhja.g("Incoming Rich Card data is not valid.", new Object[0]);
                return null;
            }
            RichCardContainer richCardContainer = this.message.container;
            if (richCardContainer.containsStandaloneCard()) {
                if (!dfoy.n()) {
                    dhja.k("Discarding incoming standalone Rich Card since feature is disabled.", new Object[0]);
                    return null;
                }
                richCardContainer.setGeneralPurposeCards(Collections.singletonList(((Boolean) RichCardContainer.USE_REFACTORED_RICH_CARD_CONTAINER.a()).booleanValue() ? richCardContainer.getStandaloneCard() : richCardContainer.generalPurposeCard));
            } else if (richCardContainer.containsCarousel()) {
                if (!dfoy.d()) {
                    dhja.k("Discarding incoming Rich Card carousel since feature is disabled.", new Object[0]);
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                GeneralPurposeRichCardCarousel generalPurposeRichCardCarousel = richCardContainer.generalPurposeCardCarousel;
                generalPurposeRichCardCarousel.layout.cardOrientation = GeneralPurposeRichCardLayoutInfo.ORIENTATION_VERTICAL;
                ArrayList<GeneralPurposeRichCardContent> arrayList2 = generalPurposeRichCardCarousel.contents;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    GeneralPurposeRichCardContent generalPurposeRichCardContent = arrayList2.get(i);
                    GeneralPurposeRichCard generalPurposeRichCard = new GeneralPurposeRichCard();
                    generalPurposeRichCard.layout = richCardContainer.generalPurposeCardCarousel.layout;
                    generalPurposeRichCard.content = generalPurposeRichCardContent;
                    arrayList.add(generalPurposeRichCard);
                }
                richCardContainer.setGeneralPurposeCards(arrayList);
            }
            if (z) {
                extractTitleAndDescription();
            }
            Iterator<GeneralPurposeRichCard> it = richCardContainer.getGeneralPurposeCards().iterator();
            while (it.hasNext()) {
                ArrayList<ConversationSuggestion> arrayList3 = it.next().content.suggestions;
                if (!dhic.a(arrayList3)) {
                    arrayList3.removeAll(Collections.singleton(null));
                }
            }
            return richCardContainer;
        } catch (esyr e) {
            dhja.i(e, "Unable to parse incoming Rich Card.", new Object[0]);
            return null;
        }
    }
}
