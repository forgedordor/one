package defpackage;

import android.app.appsearch.SetSchemaRequest;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajh {
    public static void a(SetSchemaRequest.Builder builder, String str, Set<Integer> set) {
        builder.addRequiredPermissionsForSchemaTypeVisibility(str, set);
    }
}
