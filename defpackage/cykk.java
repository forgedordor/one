package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.net.Uri;
import android.view.MenuItem;
import com.google.android.gms.wearable.PutDataRequest;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cykk {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/debug/wearable/WearableDebugMenuProvider");
    public static final Uri b = PutDataRequest.a("/bugle/phone_config/").a;
    public static final Uri c = PutDataRequest.a("/bugle/rpc/proto/v1/conversations_list/").a;
    public static final Uri d = PutDataRequest.a("/bugle/conversations/*").a;
    public final dens e;
    public final cmfo f;
    public final ctap g;
    public final ctbx h;
    public final fcsu i;
    public final eigp j;
    public final dain k;
    public final fdjx l;

    public cykk(cyfw cyfwVar, dens densVar, cmfo cmfoVar, ctap ctapVar, ctbx ctbxVar, fcsu fcsuVar, eigp eigpVar, dain dainVar, fdjx fdjxVar) {
        cyfwVar.getClass();
        densVar.getClass();
        ctapVar.getClass();
        ctbxVar.getClass();
        eigpVar.getClass();
        dainVar.getClass();
        fdjxVar.getClass();
        this.e = densVar;
        this.f = cmfoVar;
        this.g = ctapVar;
        this.h = ctbxVar;
        this.i = fcsuVar;
        this.j = eigpVar;
        this.k = dainVar;
        this.l = fdjxVar;
    }

    public static final Object c(defn defnVar, fcxy fcxyVar) {
        return fdxs.c(drgi.a(defnVar), fcxyVar);
    }

    public final void a(MenuItem menuItem, final Activity activity, final fdap fdapVar) {
        menuItem.setOnMenuItemClickListener(new eige(this.j, "WearDebugMenuClick", new MenuItem.OnMenuItemClickListener() { // from class: cyjw
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem2) {
                menuItem2.getClass();
                fdapVar.invoke(cyfw.a(activity, Optional.empty(), Optional.empty()));
                return false;
            }
        }));
    }

    public final void b(final Activity activity) {
        String str;
        boolean zB = this.h.b();
        boolean zB2 = this.g.b();
        dare dareVar = (dare) this.f.l();
        if ((dareVar.b & 1) != 0) {
            long epochSecond = Instant.now().getEpochSecond();
            evvp evvpVar = dareVar.c;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            long jG = fdhk.g(epochSecond - evvpVar.b, fdhl.d);
            str = fdhi.f(jG) + "d" + fdhi.b(jG) + "h" + fdhi.c(jG) + "m" + fdhi.e(jG) + "s ago";
        } else {
            str = "N/A";
        }
        final String strC = fdgn.c("\n      |Wear companion app installed: " + zB + "\n      |Watch recently online: " + zB2 + "\n      |Last online: " + str + "\n      |\n      |Wear sync enabled: " + zB2 + "\n    ", "|");
        cqdq.e(new Runnable() { // from class: cyjt
            @Override // java.lang.Runnable
            public final void run() {
                ekrg ekrgVar = cykk.a;
                new AlertDialog.Builder(activity).setTitle("Wear Sync State").setMessage(strC).setCancelable(true).show();
            }
        });
    }
}
