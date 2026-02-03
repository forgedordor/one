package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.apps.messaging.R;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cukm {
    public final fcsu a;
    public final cogw b;
    public final ExecutorService c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    private final Context g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;

    public cukm(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cogw cogwVar, ExecutorService executorService, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        this.g = context;
        this.h = fcsuVar;
        this.i = fcsuVar2;
        this.a = fcsuVar3;
        this.b = cogwVar;
        this.c = executorService;
        this.d = fcsuVar4;
        this.j = fcsuVar5;
        this.e = fcsuVar6;
        this.f = fcsuVar7;
    }

    public static void b(Activity activity) {
        eeji eejiVar = new eeji(activity);
        eejiVar.k(R.string.bad_custom_theme);
        eejiVar.i(false);
        eejiVar.m(R.string.bad_custom_theme_close_button, new DialogInterface.OnClickListener() { // from class: cukh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                System.exit(0);
            }
        });
        eejiVar.a();
    }

    public final void a(final long j) {
        auwa.a(new Runnable() { // from class: cukj
            @Override // java.lang.Runnable
            public final void run() {
                cuka cukaVar = (cuka) this.a.a.b();
                fcsu fcsuVar = cukaVar.b;
                if (!((ajjp) fcsuVar.b()).b()) {
                    ((ajjp) fcsuVar.b()).a();
                    return;
                }
                long j2 = j;
                fcsu fcsuVar2 = cukaVar.d;
                ((crqv) fcsuVar2.b()).k("total_millis_spent", j2 + ((crqv) fcsuVar2.b()).e("total_millis_spent", 0L));
            }
        }, this.c);
    }

    public final boolean c(Activity activity) {
        if (!d()) {
            return false;
        }
        ((aijh) this.i.b()).a(activity);
        activity.finish();
        return true;
    }

    public final boolean d() {
        return !((crma) this.h.b()).j() && craf.j(this.g) && ((crmx) this.j.b()).G();
    }
}
