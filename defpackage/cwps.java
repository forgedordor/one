package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwps implements ehsl {
    final /* synthetic */ ehsm a;
    final /* synthetic */ cwpt b;

    public cwps(ehsm ehsmVar, cwpt cwptVar) {
        this.a = ehsmVar;
        this.b = cwptVar;
    }

    @Override // defpackage.ehsl
    public final ejwi a() {
        return ejwi.i(null);
    }

    @Override // defpackage.ehsl
    public final ListenableFuture c() {
        Uri uri;
        Intent intent = this.a.a;
        Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            ((eksl) cwpt.a.h()).q("intent data is null");
            cwpt cwptVar = this.b;
            aspz aspzVar = (aspz) cwptVar.d.b();
            if (intent != null) {
                uri = (Uri) (Build.VERSION.SDK_INT > 33 ? (Parcelable) intent.getParcelableExtra("android.intent.extra.REFERRER", Uri.class) : intent.getParcelableExtra("android.intent.extra.REFERRER"));
            } else {
                uri = null;
            }
            aspzVar.m(2, null, null, String.valueOf(uri));
            return fdxs.b(cwptVar.c, eicg.a(fcyi.a), fdjz.a, new cwpo(null));
        }
        eksp ekspVar = cwpt.a;
        ((eksl) ekspVar.h()).t("Open SMS deep link intent: %s", data);
        cwpt cwptVar2 = this.b;
        if (!((apsv) cwptVar2.f.b()).a() || fdbq.f(data.getScheme(), "smsto")) {
            return fdxs.b(cwptVar2.c, eicg.a(fcyi.a), fdjz.a, new cwpp(null, cwptVar2, data));
        }
        if (fdbq.f(data.getScheme(), "sms") || fdbq.f(data.getScheme(), "smsto")) {
            return fdxs.b(cwptVar2.c, eicg.a(fcyi.a), fdjz.a, new cwpq(null, cwptVar2, intent));
        }
        ((eksl) ekspVar.h()).q("SMS deep link format error!");
        aspz aspzVar2 = (aspz) cwptVar2.d.b();
        String scheme = data.getScheme();
        intent.getClass();
        aspzVar2.m(2, null, scheme, String.valueOf(Build.VERSION.SDK_INT > 33 ? (Parcelable) intent.getParcelableExtra("android.intent.extra.REFERRER", Uri.class) : intent.getParcelableExtra("android.intent.extra.REFERRER")));
        return fdxs.b(cwptVar2.c, eicg.a(fcyi.a), fdjz.a, new cwpr(null));
    }

    @Override // defpackage.ehsl
    public final /* synthetic */ ehsj e() {
        return ehsk.a();
    }

    @Override // defpackage.ehsl
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.ehsl
    public final /* synthetic */ void d() {
    }
}
