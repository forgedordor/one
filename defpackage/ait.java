package defpackage;

import android.app.appsearch.GetSchemaResponse;
import android.app.appsearch.PackageIdentifier;
import android.app.appsearch.SchemaVisibilityConfig;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ait {
    public static Map<String, agd> a(GetSchemaResponse getSchemaResponse) {
        Map publiclyVisibleSchemas = getSchemaResponse.getPubliclyVisibleSchemas();
        if (publiclyVisibleSchemas.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        csq csqVar = new csq(publiclyVisibleSchemas.size());
        for (Map.Entry entry : publiclyVisibleSchemas.entrySet()) {
            csqVar.put((String) entry.getKey(), new agd(aib$$ExternalSyntheticApiModelOutline0.m92m(entry.getValue()).getPackageName(), aib$$ExternalSyntheticApiModelOutline0.m92m(entry.getValue()).getSha256Certificate()));
        }
        return csqVar;
    }

    public static Map<String, Set<agl>> b(GetSchemaResponse getSchemaResponse) {
        Map schemaTypesVisibleToConfigs = getSchemaResponse.getSchemaTypesVisibleToConfigs();
        if (schemaTypesVisibleToConfigs.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        csq csqVar = new csq(schemaTypesVisibleToConfigs.size());
        for (Map.Entry entry : schemaTypesVisibleToConfigs.entrySet()) {
            css cssVar = new css(((Set) entry.getValue()).size());
            Iterator it = ((Set) entry.getValue()).iterator();
            while (it.hasNext()) {
                SchemaVisibilityConfig schemaVisibilityConfigM = ait$$ExternalSyntheticApiModelOutline0.m(it.next());
                lcg.i(schemaVisibilityConfigM);
                agk agkVar = new agk();
                List allowedPackages = schemaVisibilityConfigM.getAllowedPackages();
                for (int i = 0; i < allowedPackages.size(); i++) {
                    agkVar.b(new agd(aib$$ExternalSyntheticApiModelOutline0.m92m(allowedPackages.get(i)).getPackageName(), aib$$ExternalSyntheticApiModelOutline0.m92m(allowedPackages.get(i)).getSha256Certificate()));
                }
                Iterator it2 = schemaVisibilityConfigM.getRequiredPermissions().iterator();
                while (it2.hasNext()) {
                    agkVar.c((Set) it2.next());
                }
                PackageIdentifier publiclyVisibleTargetPackage = schemaVisibilityConfigM.getPubliclyVisibleTargetPackage();
                if (publiclyVisibleTargetPackage != null) {
                    agkVar.d(new agd(publiclyVisibleTargetPackage.getPackageName(), publiclyVisibleTargetPackage.getSha256Certificate()));
                }
                cssVar.add(agkVar.a());
            }
            csqVar.put((String) entry.getKey(), cssVar);
        }
        return csqVar;
    }
}
