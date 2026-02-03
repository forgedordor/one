package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhhb {
    public static final dbho a;
    public static final dbho b;
    public static final dbho c;
    public static final dbho d;
    public static final dbho e;
    public static final dbho f;
    public static final dbho g;
    public static final dbho h;
    public static final dbho i;
    private static final ejxr j;

    static {
        ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: dhha
            @Override // defpackage.ejxr
            public final Object get() {
                return dhhb.a();
            }
        });
        j = ejxrVarA;
        a = new dbhk((dbhq) ejxrVarA.get(), "last_stored_signatures_white_list", "");
        b = new dbhk((dbhq) ejxrVarA.get(), "last_stored_signatures_test_service_white_list", "");
        c = new dbhk((dbhq) ejxrVarA.get(), "last_stored_packages_white_list", "");
        d = new dbhk((dbhq) ejxrVarA.get(), "last_stored_packages_test_service_white_list", "");
        e = new dbhk((dbhq) ejxrVarA.get(), "provisionId", null);
        f = new dbhm((dbhq) ejxrVarA.get(), "operation_mode", 0);
        g = new dbhl((dbhq) ejxrVarA.get(), "migration_complete", false);
        h = new dbhm((dbhq) ejxrVarA.get(), "encryption_key", 0);
        i = new dbhk((dbhq) ejxrVarA.get(), "tachyon_anonymous_device_id", null);
    }

    static /* synthetic */ dbhq a() {
        try {
            return new dbhq("carrier_services");
        } catch (NullPointerException e2) {
            try {
                Context applicationContext = ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null)).getApplicationContext();
                applicationContext.getClass();
                dbhq.a = applicationContext;
                return new dbhq("carrier_services");
            } catch (ReflectiveOperationException | RuntimeException unused) {
                throw e2;
            }
        }
    }
}
