package defpackage;

import android.app.appsearch.GetSchemaResponse;
import android.app.appsearch.PackageIdentifier;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ais {
    public static Map<String, Set<Set<Integer>>> a(GetSchemaResponse getSchemaResponse) {
        return getSchemaResponse.getRequiredPermissionsForSchemaTypeVisibility();
    }

    public static Map<String, Set<PackageIdentifier>> b(GetSchemaResponse getSchemaResponse) {
        return getSchemaResponse.getSchemaTypesVisibleToPackages();
    }

    public static Set<String> c(GetSchemaResponse getSchemaResponse) {
        return getSchemaResponse.getSchemaTypesNotDisplayedBySystem();
    }
}
