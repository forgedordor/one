package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgam {
    public static final /* synthetic */ int a = 0;
    private static final ekgp b;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i(ejuf.c(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT), ewgp.FEATURE_TAG_TEXT);
        ekgiVar.i(ejuf.c("video"), ewgp.FEATURE_TAG_VIDEO);
        ekgiVar.i(ejuf.c("+g.3gpp.smsip"), ewgp.FEATURE_TAG_3GPP_SMSIP);
        ekgiVar.i(ejuf.c("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.dp\""), ewgp.FEATURE_TAG_3GPP_IARI_REF_RCSE_DP);
        ekgiVar.i(ejuf.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel\""), ewgp.FEATURE_TAG_3GPP_ICSI_REF_MMTEL);
        ekgiVar.i(ejuf.c("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush\""), ewgp.FEATURE_TAG_3GPP_IARI_REF_GEOPUSH);
        ekgiVar.i(ejuf.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session\""), ewgp.FEATURE_TAG_3GPP_ICSI_REF_CPM_SESSION);
        ekgiVar.i(ejuf.c("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp\""), ewgp.FEATURE_TAG_3GPP_IARI_REF_FTHTTP);
        ekgiVar.i(ejuf.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.filetransfer\""), ewgp.FEATURE_TAG_3GPP_IARI_REF_CPM_FILETRANSFER);
        ekgiVar.i(ejuf.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.msg\""), ewgp.FEATURE_TAG_3GPP_ICSI_REF_CPM_MSG);
        ekgiVar.i(ejuf.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.largemsg\""), ewgp.FEATURE_TAG_3GPP_ICSI_REF_CPM_LARGEMSG);
        ekgiVar.i(ejuf.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.deferred\""), ewgp.FEATURE_TAG_3GPP_ICSI_REF_CPM_DEFERRED);
        ekgiVar.i(ejuf.c("+g.gsma.rcs.cpm.pager-large"), ewgp.FEATURE_TAG_CPM_PAGER_LARGE);
        ekgiVar.i(ejuf.c("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftsms\""), ewgp.FEATURE_TAG_3GPP_IARI_REF_FTSMS);
        ekgiVar.i(ejuf.c("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callcomposer\""), ewgp.FEATURE_TAG_3GPP_ICSI_REF_CALLCOMPOSER);
        ekgiVar.i(ejuf.c("+g.gsma.callcomposer"), ewgp.FEATURE_TAG_GSMA_CALLCOMPOSER);
        ekgiVar.i(ejuf.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callunanswered\""), ewgp.FEATURE_TAG_3GPP_ICSI_REF_CALLUNANSWERED);
        ekgiVar.i(ejuf.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedmap\""), ewgp.FEATURE_TAG_3GPP_ICSI_REF_SHAREDMAP);
        ekgiVar.i(ejuf.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedsketch\""), ewgp.FEATURE_TAG_3GPP_ICSI_REF_SHAREDSKETCH);
        ekgiVar.i(ejuf.c("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geosms\""), ewgp.FEATURE_TAG_3GPP_IARI_REF_GEOSMS);
        ekgiVar.i(ejuf.c("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot\""), ewgp.FEATURE_TAG_3GPP_IARI_REF_CHATBOT);
        ekgiVar.i(ejuf.c("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot.sa\""), ewgp.FEATURE_TAG_3GPP_IARI_REF_CHATBOT_SA);
        ekgiVar.i(ejuf.c("+g.gsma.rcs.botversion=\"#=1,#=2\""), ewgp.FEATURE_TAG_GSMA_BOTVERSION);
        ekgiVar.i(ejuf.c("+g.gsma.rcs.cpimext"), ewgp.FEATURE_TAG_GSMA_CPIMEXT);
        b = ekgiVar.c();
    }

    static ewgp a(String str) {
        return (ewgp) b.getOrDefault(ejuf.c(str), ewgp.FEATURE_TAG_TYPE_UNKNOWN);
    }
}
