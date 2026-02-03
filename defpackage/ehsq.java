package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import com.android.vcard.VCardConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehsq {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/nav/gateway/GatewayMixin");
    private static final String d = "$GA$" + System.currentTimeMillis();
    public final ehsl b;
    public boolean c;
    private final Activity e;
    private final egpr f;
    private final boolean g;
    private int i;
    private int j;
    private final ehsp k = new ehsp(this);
    private final egps h = new egps<Void, ehsj>() { // from class: ehsq.1
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) throws IOException {
            ehsq.this.a((ehsj) obj2);
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) throws IOException {
            ekrw ekrwVarI = ehsq.a.i();
            ekrwVarI.X(eksq.a, "GatewayActivityPeer");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(th)).h("com/google/apps/tiktok/nav/gateway/GatewayMixin$2", "onFailure", 'd', "GatewayMixin.java")).q("Couldn't get redirect intent.");
            ehsq.this.a(ehsj.a(null));
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r14.getAction() == null) goto L33;
     */
    /* JADX WARN: Type inference failed for: r12v14, types: [fcsu, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ehsq(android.app.Activity r11, java.util.Map r12, defpackage.ejwi r13, defpackage.egpr r14) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehsq.<init>(android.app.Activity, java.util.Map, ejwi, egpr):void");
    }

    private final void f() {
        int i = this.i;
        if (i != 0) {
            this.e.setTheme(i);
        }
        int i2 = this.j;
        if (i2 != 0) {
            this.e.setContentView(i2);
        }
    }

    private static void g(Intent intent) {
        ejwl.m((intent.getFlags() & 195) == 0, "Redirects to external apps must not grant Uri access.");
    }

    private static void h(Intent intent) {
        ejwl.m(!intent.hasExtra(d), "GatewayHandlers must not blindly forward all intent extras.");
    }

    private static void i(Intent intent) {
        String str = d;
        intent.putExtra(str, str);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : extras.keySet()) {
                try {
                    Object obj = extras.get(str2);
                    if (obj instanceof Intent) {
                        i((Intent) obj);
                    }
                } catch (Throwable th) {
                    ekrw ekrwVarI = a.i();
                    ekrwVarI.X(eksq.a, "GatewayActivityPeer");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(th)).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "taintExtras", (char) 470, "GatewayMixin.java")).q("Failed to read extra from Intent. Removing it.");
                    arrayList.add(str2);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                intent.removeExtra((String) arrayList.get(i));
            }
        }
    }

    public final void a(ehsj ehsjVar) throws IOException {
        int i = ehsjVar.a;
        Intent intent = null;
        if (i == 1) {
            List<Intent> list = ehsjVar.b;
            ejwl.l(!list.isEmpty());
            Activity activity = this.e;
            String packageName = activity.getPackageName();
            for (Intent intent2 : list) {
                h(intent2);
                intent2.setPackage(packageName);
                if (intent2.getData() != null && intent2.getType() == null && "content".equals(intent2.getData().getScheme())) {
                    ekrw ekrwVarI = a.i();
                    ekrwVarI.X(eksq.a, "GatewayActivityPeer");
                    ((ekrd) ((ekrd) ekrwVarI).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 253, "GatewayMixin.java")).q("Intent with [data] was missing [type]. Both must be set.");
                }
            }
            Intent intent3 = (Intent) list.get(list.size() - 1);
            if (list.size() == 1) {
                intent3.addFlags(VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING);
            } else if (list.size() > 1) {
                ejwl.b((((Intent) list.get(0)).getFlags() & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0, "Adding multiple activities requires using a new task.");
            }
            if (!ehsjVar.c) {
                intent3.addFlags(65536);
            }
            try {
                Intent[] intentArr = (Intent[]) list.toArray(new Intent[0]);
                long j = eiid.a;
                activity.getClass();
                intentArr.getClass();
                int length = intentArr.length;
                if (length != 0) {
                    int i2 = length - 1;
                    Intent intent4 = new Intent(intentArr[i2]);
                    intentArr[i2] = intent4;
                    eihr eihrVarT = eiid.t(intent4);
                    try {
                        activity.startActivities(intentArr);
                        fczl.a(eihrVarT, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            fczl.a(eihrVarT, th);
                            throw th2;
                        }
                    }
                }
            } catch (ActivityNotFoundException | SecurityException e) {
                ekrw ekrwVarI2 = a.i();
                ekrwVarI2.X(eksq.a, "GatewayActivityPeer");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarI2).g(e)).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", (char) 277, "GatewayMixin.java")).q("Missing internal activity.");
            }
            this.e.finish();
            return;
        }
        if (i == 2) {
            Intent intent5 = (Intent) ekis.l(ehsjVar.b);
            h(intent5);
            g(intent5);
            try {
                eiid.o(this.e, intent5);
            } catch (ActivityNotFoundException | SecurityException e2) {
                ekrw ekrwVarI3 = a.i();
                ekrwVarI3.X(eksq.a, "GatewayActivityPeer");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarI3).g(e2)).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 288, "GatewayMixin.java")).t("Missing external activity for %s.", intent5);
            }
            this.e.finish();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    ekrw ekrwVarG = a.g();
                    ekrwVarG.X(eksq.a, "GatewayActivityPeer");
                    ((ekrd) ((ekrd) ekrwVarG).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 339, "GatewayMixin.java")).q("Not redirecting");
                    this.e.finish();
                    return;
                }
                return;
            }
            List list2 = ehsjVar.b;
            if (list2.isEmpty()) {
                Integer num = ehsjVar.d;
                if (num != null) {
                    this.e.setResult(num.intValue());
                }
            } else {
                Intent intent6 = (Intent) ekis.l(list2);
                g(intent6);
                h(intent6);
                this.e.setResult(ehsjVar.d.intValue(), intent6);
            }
            this.e.finish();
            return;
        }
        Activity activity2 = this.e;
        Intent intent7 = activity2.getIntent();
        if (intent7.getPackage() != null) {
            activity2.finish();
        }
        Uri data = intent7.getData();
        if (data == null || !("https".equals(data.getScheme()) || "http".equals(data.getScheme()))) {
            ekrw ekrwVarI4 = a.i();
            ekrwVarI4.X(eksq.a, "GatewayActivityPeer");
            ((ekrd) ((ekrd) ekrwVarI4).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 306, "GatewayMixin.java")).q("Can't redirect non-http(s) intent to browser.");
            activity2.finish();
            return;
        }
        Intent intent8 = new Intent("android.intent.action.VIEW", Uri.parse("https://*"));
        intent8.addCategory("android.intent.category.BROWSABLE");
        String packageName2 = activity2.getPackageName();
        Iterator<ResolveInfo> it = activity2.getPackageManager().queryIntentActivities(intent8, 65536).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!packageName2.equals(activityInfo.packageName)) {
                intent = new Intent("android.intent.action.VIEW", data);
                intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                break;
            }
        }
        if (intent != null) {
            intent.addFlags(524288);
            eiid.o(activity2, intent);
        } else {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "GatewayActivityPeer");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 316, "GatewayMixin.java")).q("No browser is installed on the device.");
        }
        activity2.finish();
    }

    public final void b(Bundle bundle) {
        this.f.j(this.h);
        if (bundle != null) {
            this.i = bundle.getInt("theme", 0);
            this.j = bundle.getInt("layout", 0);
            f();
        }
        if (this.c) {
            this.e.getWindow().getDecorView().getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: ehso
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    ekrg ekrgVar = ehsq.a;
                    return false;
                }
            });
        }
    }

    public final void c(Bundle bundle) throws IOException {
        if (bundle == null) {
            if (this.b == null) {
                a(ehsj.a(null));
            } else {
                if (this.g) {
                    return;
                }
                e();
            }
        }
    }

    public final void d(Bundle bundle) {
        bundle.putInt("theme", this.i);
        bundle.putInt("layout", this.j);
    }

    public final void e() {
        ehsl ehslVar = this.b;
        ListenableFuture listenableFutureC = ehslVar.c();
        if (!listenableFutureC.isDone()) {
            ehslVar.d();
            this.i = 0;
            ehslVar.b();
            this.j = 0;
            f();
        }
        this.f.k(new egpq(listenableFutureC), new egpo(null), this.h);
    }
}
