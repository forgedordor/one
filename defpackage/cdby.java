package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdby implements cdbq {
    public static final cqce a = cqce.g("Bugle", "BugleFirebaseInstanceIDManagerImpl");
    public static final eksp b = eksp.c("Bugle");
    public final Context c;
    public final fcsu d;
    public final fcsu e;
    private final eosc f;

    public cdby(Context context, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = context;
        this.f = eoscVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
    }

    @Override // defpackage.cdbq
    public final eiju a() {
        return eijx.g(new Callable() { // from class: cdbw
            @Override // java.util.concurrent.Callable
            public final Object call() throws Resources.NotFoundException {
                IOException e;
                String str;
                String str2;
                cdby cdbyVar = this.a;
                try {
                    String string = cdbyVar.c.getResources().getString(R.string.firebase_authorized_entity);
                    Optional optionalA = abwt.a(string, "");
                    str = optionalA.isPresent() ? (String) optionalA.get() : null;
                } catch (IOException e2) {
                    e = e2;
                    str = null;
                }
                try {
                    cdby.a.m("Received firebase instance token.");
                    return str;
                } catch (IOException e3) {
                    e = e3;
                    ((eksl) ((eksl) ((eksl) cdby.b.j()).g(e)).h("com/google/android/apps/messaging/shared/fcm/impl/BugleFirebaseInstanceIDManagerImpl", "logFirebaseRefreshIIDError", 98, "BugleFirebaseInstanceIDManagerImpl.java")).t("Failed to refresh firebase instance ID %s", e.getCause());
                    int[] iArr = {1, 2, 3, 4, 5, 6};
                    int i = 0;
                    while (true) {
                        if (i < 6) {
                            int i2 = iArr[i];
                            String strB = ejwk.b(e.getMessage());
                            switch (i2) {
                                case 1:
                                    str2 = "UNKNOWN";
                                    break;
                                case 2:
                                    str2 = "SERVICE_NOT_AVAILABLE";
                                    break;
                                case 3:
                                    str2 = "INTERNAL_SERVER_ERROR";
                                    break;
                                case 4:
                                    str2 = "MISSING_INSTANCEID_SERVICE";
                                    break;
                                case 5:
                                    str2 = "TIMEOUT";
                                    break;
                                case 6:
                                    str2 = "MAIN_THREAD";
                                    break;
                                default:
                                    str2 = "null";
                                    break;
                            }
                            if (i2 == 0) {
                                throw null;
                            }
                            if (ejuf.e(strB, str2)) {
                                ((ains) cdbyVar.e.b()).e("Bugle.Fcm.Failure.IIDRefresh.Counts", cdbx.a(i2));
                            } else {
                                i++;
                            }
                        } else {
                            ((ains) cdbyVar.e.b()).e("Bugle.Fcm.Failure.IIDRefresh.Counts", cdbx.a(1));
                        }
                    }
                    return str;
                }
            }
        }, this.f);
    }
}
