package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import j$.util.DesugarArrays;
import j$.util.function.Predicate$CC;
import java.util.Locale;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmxe implements cmxa {
    public final Context b;
    public final clgq c;
    private final cgei e;
    private final cgbn f;
    private static final eksp d = eksp.c("BugleNotifications");
    public static final cczv a = cdag.q(376869573, "enable_report_on_schema_upgrade_failure");

    public cmxe(Context context, cgei cgeiVar, cgbn cgbnVar, clgq clgqVar) {
        this.b = context;
        this.e = cgeiVar;
        this.f = cgbnVar;
        this.c = clgqVar;
    }

    @Override // defpackage.cmxa
    public final void a() {
        cgbn cgbnVar = this.f;
        if (cgbnVar.J()) {
            cgbnVar.H(this.e.a(new cgeg() { // from class: cmxc
                @Override // defpackage.cgeg
                public final Notification a(String str) {
                    Context context = this.a.b;
                    Resources resources = context.getResources();
                    kvq kvqVar = new kvq(context, str);
                    kvqVar.i(resources.getString(R.string.exhausted_storage_space_notification_and_dialog_title));
                    kvqVar.w(resources.getString(R.string.exhausted_storage_space_notification_body));
                    kvqVar.r(R.drawable.ic_warning_light);
                    kvqVar.l = 3;
                    kvqVar.o(false);
                    kvqVar.g(false);
                    kvj kvjVar = new kvj(kvqVar);
                    kvjVar.e(resources.getString(R.string.exhausted_storage_space_notification_body));
                    kvqVar.u(kvjVar);
                    return kvqVar.a();
                }
            }, cgbe.EXHAUSTED_STORAGE_SPACE));
        } else {
            ((eksl) d.n().h("com/google/android/apps/messaging/shared/storage/notification/ExhaustedStorageSpaceNotifierImpl", "postExhaustedStorageSpaceNotification", 67, "ExhaustedStorageSpaceNotifierImpl.java")).q("Notifications disabled, won't notify");
        }
    }

    @Override // defpackage.cmxa
    public final boolean b(final long j) {
        if (!c()) {
            return false;
        }
        this.f.H(this.e.a(new cgeg() { // from class: cmxd
            @Override // defpackage.cgeg
            public final Notification a(String str) {
                cmxe cmxeVar = this.a;
                kvq kvqVar = new kvq(cmxeVar.b, str);
                kvqVar.r(R.drawable.notification_icon);
                kvqVar.o(true);
                kvqVar.i("Schema Upgrade Failure");
                kvqVar.h(String.format(Locale.US, "Exception upgrading the schema from version %d.  Use Clear Storage to proceed.", Long.valueOf(j)));
                kve kveVar = new kve(R.drawable.ic_warning_light, "Report", cmxeVar.c.d(emgm.GENERIC_ISSUE));
                kveVar.d = true;
                kvqVar.e(kveVar.a());
                kvqVar.l = 1;
                return kvqVar.a();
            }
        }, cgbe.DATABASE_UPGRADE_FAILURE));
        return true;
    }

    @Override // defpackage.cmxa
    public final boolean c() {
        return ((Boolean) a.e()).booleanValue() && !DesugarArrays.stream(new elvg[]{elvg.ROBOLECTRIC_BUILD, elvg.ENG_BUILD, elvg.FISH_FOOD_BUILD, elvg.ARTIK_BUILD, elvg.ARIGATO_BUILD, elvg.DOMO_BUILD}).noneMatch(new Predicate() { // from class: cmxb
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                elvg elvgVar = (elvg) obj;
                cczv cczvVar = cmxe.a;
                return elvgVar == cqbe.a;
            }
        }) && this.f.J();
    }
}
