package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddeu {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature[] d;

    static {
        Feature feature = new Feature("account_health_alerts", 1L);
        a = feature;
        Feature feature2 = new Feature("account_messages", 1L);
        b = feature2;
        Feature feature3 = new Feature("account_data_response", 1L);
        c = feature3;
        d = new Feature[]{feature, feature2, feature3};
    }
}
