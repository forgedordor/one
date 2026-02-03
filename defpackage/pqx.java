package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pqx {
    public static final ppu a;
    public static final ppw b;
    public static final ppu c;
    public static final ppu d;
    public static final ppw e;
    public static final pqa f;
    public static final ppw g;
    public static final ppw h;
    public static final ppw i;

    static {
        new ppu("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
        new ppu("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
        new ppx("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
        new ppv("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
        new ppy("START_SAFE_BROWSING", "START_SAFE_BROWSING");
        new ppy("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
        new ppy("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
        new ppy("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
        new ppy("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
        new ppy("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
        new ppv("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
        new ppv("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
        new ppv("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
        new ppv("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
        new ppv("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
        new ppv("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
        new ppu("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
        new ppu("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
        new ppv("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
        new ppy("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
        new ppv("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
        new ppu("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        new ppu("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
        new ppy("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
        new ppy("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
        new ppy("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        a = new ppu("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
        new ppu("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
        b = new ppw("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
        c = new ppu("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
        new ppu("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
        d = new ppu("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
        new ppu("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
        new ppx("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
        new ppx("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
        new pqa("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
        new pqa("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
        new ppz();
        new pql();
        new pqk();
        new pqk();
        new pqa("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        new pqu();
        new ppw("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
        e = new ppw("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
        f = new pqa("FORCE_DARK", "FORCE_DARK");
        g = new ppw("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
        h = new ppw("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
        new ppw("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
        new ppw("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
        new ppw("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
        new ppw("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
        new ppw("GET_COOKIE_INFO", "GET_COOKIE_INFO");
        new ppw("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
        new ppw("USER_AGENT_METADATA", "USER_AGENT_METADATA");
        new pqv();
        new ppw("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
        new ppw("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
        new ppw("MUTE_AUDIO", "MUTE_AUDIO");
        new ppw("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");
        new ppw("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");
        new ppw("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");
        new ppw("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA");
        new pqw();
        new ppw("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP");
        new ppw("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");
        new ppw("PRERENDER_URL_V2", "PRERENDER_URL_V2");
        new ppw("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2");
        new ppw("SAVE_STATE", "SAVE_STATE");
        new ppw("WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE");
        i = new ppw("CACHE_PROVIDER", "PROVIDER_WEAKLY_REF_WEBVIEW");
        new ppw("PAYMENT_REQUEST", "PAYMENT_REQUEST");
    }

    public static boolean a(String str) {
        Set<pqg> setUnmodifiableSet = DesugarCollections.unmodifiableSet(pqc.a);
        HashSet hashSet = new HashSet();
        for (pqg pqgVar : setUnmodifiableSet) {
            if (pqgVar.b().equals(str)) {
                hashSet.add(pqgVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((pqg) it.next()).c()) {
                return true;
            }
        }
        return false;
    }
}
