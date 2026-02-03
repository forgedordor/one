package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crem {
    public static final cczv a = cdag.e(cdag.b, "smart_cache_file_ttl", 28);
    public static final cczv b = cdag.h(cdag.b, "enable_model_based_reranker", false);
    public static final cczi c = cdag.g(cdag.b, "model_based_reranker_config", "");
    public static final cczv d = cdag.e(cdag.b, "model_based_reranker_fallback_strategy", 1);
    public static final cczv e = cdag.e(cdag.b, "reranker_max_suggestions_per_impression", 4);
    public static final cczv f = cdag.e(cdag.b, "reranker_filter_strategy", 0);
    public static final cczv g = cdag.c(cdag.b, "reranker_filter_threshold", 0.0d);
    public static final cczv h = cdag.h(cdag.b, "reranker_enable_type_sorting", false);
    public static final cczv i = cdag.h(cdag.b, "reranker_enable_rerank_by_score", true);
    public static final cczv j = cdag.e(cdag.b, "reranker_target_impression_size", 0);
    public static final cczv k = cdag.e(cdag.b, "reranker_model_type", 1);
    public static final cczi l = cdag.g(cdag.b, "in_apk_multitask_config", "");
    public static final cczv m = cdag.c(cdag.b, "p2p_conversations_suggestions_hobbes_emp_prob_factor", -0.35d);
    public static final cczv n = cdag.c(cdag.b, "p2p_conversations_suggestions_hobbes_confidence_threshold", 0.038d);
    public static final cczv o = cdag.c(cdag.b, "p2p_conversations_suggestions_hobbes_diversification_distance_threshold", 0.25d);
    public static final cczi p = cdag.g(cdag.b, "p2p_suggestion_model_based_providers_config_file_specs_with_backoff", "");
    static final cczi q = cdag.h(cdag.b, "enable_model_based_provider_backoff", false);
    static final ejxr r = cdag.v("enable_model_based_provider_backoff_merged");
    static final cczi s = cdag.g(cdag.b, "base_model_role", "BASE");
    static final ejxr t = cdag.w(191287092, "enable_preferred_suggestion_score");
    static final ejxr u = cdag.v("enable_max_suggestions_per_type_and_tag");
    static final cczu v = cdag.r(cdag.b, "reranker_exempt_types_list", new ejxr() { // from class: crel
        @Override // defpackage.ejxr
        public final Object get() {
            cczv cczvVar = crem.a;
            return crdg.b.toByteArray();
        }
    });
}
