package defpackage;

import android.app.appsearch.PackageIdentifier;
import android.app.appsearch.SchemaVisibilityConfig;
import android.app.appsearch.SetSchemaRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aji {
    public static void a(SetSchemaRequest.Builder builder, String str, Set<agl> set) {
        for (agl aglVar : set) {
            lcg.i(aglVar);
            SchemaVisibilityConfig.Builder builder2 = new SchemaVisibilityConfig.Builder();
            if (aglVar.d == null) {
                List list = aglVar.a;
                aglVar.d = new ArrayList(list.size());
                for (int i = 0; i < list.size(); i++) {
                    aglVar.d.add(new agd((ajr) list.get(i)));
                }
            }
            List list2 = aglVar.d;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                builder2.addAllowedPackage(new PackageIdentifier(((agd) list2.get(i2)).a(), ((agd) list2.get(i2)).b()));
            }
            if (aglVar.e == null) {
                List list3 = aglVar.b;
                aglVar.e = new css(list3.size());
                for (int i3 = 0; i3 < list3.size(); i3++) {
                    int[] iArr = ((aha) list3.get(i3)).a;
                    css cssVar = new css(iArr.length);
                    for (int i4 : iArr) {
                        cssVar.add(Integer.valueOf(i4));
                    }
                    Set set2 = aglVar.e;
                    if (set2 != null) {
                        set2.add(cssVar);
                    }
                }
            }
            Set set3 = aglVar.e;
            set3.getClass();
            csr csrVar = new csr((css) set3);
            while (csrVar.hasNext()) {
                builder2.addRequiredPermissions((Set) csrVar.next());
            }
            ajr ajrVar = aglVar.c;
            agd agdVar = ajrVar == null ? null : new agd(ajrVar);
            if (agdVar != null) {
                builder2.setPubliclyVisibleTargetPackage(new PackageIdentifier(agdVar.a(), agdVar.b()));
            }
            builder.addSchemaTypeVisibleToConfig(str, builder2.build());
        }
    }

    public static void b(SetSchemaRequest.Builder builder, String str, PackageIdentifier packageIdentifier) {
        builder.setPubliclyVisibleSchema(str, packageIdentifier);
    }
}
