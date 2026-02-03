package defpackage;

import android.app.appsearch.AppSearchSchema;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiw {
    public static int a(AppSearchSchema.LongPropertyConfig longPropertyConfig) {
        return longPropertyConfig.getIndexingType();
    }

    public static int b(AppSearchSchema.StringPropertyConfig stringPropertyConfig) {
        return stringPropertyConfig.getJoinableValueType();
    }

    public static void c(AppSearchSchema.LongPropertyConfig.Builder builder, int i) {
        builder.setIndexingType(i);
    }

    public static void d(AppSearchSchema.StringPropertyConfig.Builder builder, int i) {
        builder.setJoinableValueType(i);
    }
}
