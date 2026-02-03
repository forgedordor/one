package defpackage;

import android.app.appsearch.AppSearchSchema;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aix {
    public static List<String> a(AppSearchSchema.DocumentPropertyConfig documentPropertyConfig) {
        return documentPropertyConfig.getIndexableNestedProperties();
    }

    public static List<String> b(AppSearchSchema appSearchSchema) {
        return appSearchSchema.getParentTypes();
    }

    public static void c(AppSearchSchema.DocumentPropertyConfig.Builder builder, Collection<String> collection) {
        builder.addIndexableNestedProperties(collection);
    }

    public static void d(AppSearchSchema.Builder builder, String str) {
        builder.addParentType(str);
    }
}
