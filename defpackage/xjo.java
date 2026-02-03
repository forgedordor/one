package defpackage;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjo implements xjc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl");
    public final fdjx b;
    public final Context c;
    public final afzc d;
    public final dnhq e;
    public final lwn f;
    public final ahax g;
    public final cliy h;
    public final fcsu i;
    public final arjv j;
    private final Optional k;
    private final fduj l;
    private final fcsu m;
    private final Duration n;
    private final fduj o;
    private final aaft p;

    public xjo(fdjx fdjxVar, Context context, Optional optional, fduj fdujVar, afzc afzcVar, dnhq dnhqVar, aaft aaftVar, lwn lwnVar, ahax ahaxVar, cliy cliyVar, fcsu fcsuVar, Duration duration, fcsu fcsuVar2, fduj fdujVar2, arjv arjvVar) {
        fdjxVar.getClass();
        context.getClass();
        optional.getClass();
        fdujVar.getClass();
        afzcVar.getClass();
        dnhqVar.getClass();
        aaftVar.getClass();
        ahaxVar.getClass();
        cliyVar.getClass();
        fcsuVar.getClass();
        this.b = fdjxVar;
        this.c = context;
        this.k = optional;
        this.l = fdujVar;
        this.d = afzcVar;
        this.e = dnhqVar;
        this.p = aaftVar;
        this.f = lwnVar;
        this.g = ahaxVar;
        this.h = cliyVar;
        this.m = fcsuVar;
        this.n = duration;
        this.i = fcsuVar2;
        this.o = fdujVar2;
        this.j = arjvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.xjm
            if (r0 == 0) goto L13
            r0 = r5
            xjm r0 = (defpackage.xjm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xjm r0 = new xjm
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fduj r5 = r4.o
            r0.c = r3
            java.lang.Object r5 = defpackage.fdtc.a(r5, r0)
            if (r5 == r1) goto L4d
        L3c:
            aoff r5 = (defpackage.aoff) r5
            aoff r0 = defpackage.aoff.d
            if (r5 == r0) goto L48
            aoff r0 = defpackage.aoff.e
            if (r5 != r0) goto L47
            goto L48
        L47:
            r3 = 0
        L48:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xjo.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if (r5 == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014f, code lost:
    
        if (r0 != r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r22, defpackage.kun r23, defpackage.fcxy r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xjo.b(java.lang.String, kun, fcxy):java.lang.Object");
    }

    public final void c() {
        deep deepVar = new deep();
        ddnn ddnnVar = (ddnn) this.m.b();
        ddnh ddnhVar = new ddnh();
        ddnhVar.c(100);
        ddnhVar.b(this.n.toMillis());
        dclh.b(true, "maxUpdateAgeMillis must be greater than or equal to 0");
        ddnhVar.a = 10000L;
        ddnp.b(2);
        ddnhVar.b = 2;
        defn defnVarA = ddnnVar.a(ddnhVar.a(), deepVar.a);
        final fdap fdapVar = new fdap() { // from class: xjd
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                xjo xjoVar = this.a;
                Location location = (Location) obj;
                if (location == null) {
                    xjoVar.d(new IllegalStateException("Location is null"));
                } else {
                    String strA = bbgx.a(location.getLatitude(), location.getLongitude());
                    ekrw ekrwVarE = xjo.a.e();
                    ekrwVarE.X(eksq.a, "BugleComposeRow2");
                    ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLatLngResult", 291, "LocationHandlerImpl.kt")).D("Setting location url as attachment, uri %s, location %s", strA, location);
                    strA.getClass();
                    auvw.k(xjoVar.b, null, null, new xji(xjoVar, new RichLocation(strA, location.getLatitude(), location.getLongitude()), null), 3);
                }
                return fctx.a;
            }
        };
        defnVarA.a(new defh() { // from class: xje
            @Override // defpackage.defh
            public final void e(Object obj) {
                fdapVar.invoke(obj);
            }
        });
        defnVarA.t(new defe() { // from class: xjf
            @Override // defpackage.defe
            public final void d(Exception exc) {
                this.a.d(exc);
            }
        });
        if (this.j.a()) {
            Toast.makeText(this.c, R.string.location_shortcut_satellite_finding_location, 1).show();
        }
    }

    public final void d(Exception exc) {
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ((ekrd) ekrwVarJ).g(exc).h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLocationFailure", 275, "LocationHandlerImpl.kt")).q("Unable to attach location directly");
        auvw.k(this.b, null, null, new xjl(this, null), 3);
    }

    public final void e(adh adhVar) {
        this.f.d("location_saved_state_pending_result", false);
        int i = adhVar.a;
        if (i != -1) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLocationResult", 190, "LocationHandlerImpl.kt")).r("Location picker did not succeed. resultCode %s", i);
            return;
        }
        Intent intent = adhVar.b;
        if (intent == null) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLocationResult", 195, "LocationHandlerImpl.kt")).q("Location picker succeeded with null data");
            return;
        }
        Uri data = intent.getData();
        String stringExtra = intent.getStringExtra("location_url");
        Location location = (Location) (Build.VERSION.SDK_INT > 33 ? (Parcelable) intent.getParcelableExtra("location_extra", Location.class) : intent.getParcelableExtra("location_extra"));
        if (data == null || stringExtra == null || location == null) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLocationResult", 224, "LocationHandlerImpl.kt")).I("Missing data, not setting location, dataUri %s, locationUrl %s, location %s", data, stringExtra, location);
            return;
        }
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLocationResult", 205, "LocationHandlerImpl.kt")).I("Setting location url as attachment, dataUri %s, locationUrl %s, location %s", data, stringExtra, location);
        if (fdbq.f(data, Uri.EMPTY)) {
            this.e.f(new RichLocation(stringExtra, location.getLatitude(), location.getLongitude()));
        } else {
            Objects.toString(data);
            throw new IllegalStateException("Location picker result data URI is ".concat(data.toString()));
        }
    }
}
