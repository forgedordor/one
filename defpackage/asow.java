package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asow {
    public static final ejxr a = cdag.v("set_media_download_error_retryable");
    public static final cczi b = cdag.e(cdag.b, "max_retries_for_business_info_download", 1);
    public static final cczv c;
    public static final ejxr d;
    public static final ejxr e;
    public static final ejxr f;
    public static final cczi g;
    public static final ejxr h;

    static {
        dzzf dzzfVar = cdag.b;
        ewtn ewtnVar = (ewtn) ewto.a.createBuilder();
        ewtnVar.b("wallet.google.com");
        ewtnVar.b("pay.google.com");
        c = cdag.t(dzzfVar, "bugle_phenotype__rbm_wallet_url_list", (ewto) ewtnVar.build(), new dzze() { // from class: asov
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (ewto) evsn.parseFrom(ewto.a, bArr);
            }
        });
        d = cdag.v("use_exponential_backoff_instead_for_business_info");
        e = cdag.v("log_cronet_errors_for_business_info");
        f = cdag.v("use_bot_info_dimain_from_rcs_config");
        g = cdag.g(cdag.b, "business_info_bot_domain_override", "");
        h = cdag.v("support_paths_in_bot_domain");
    }
}
