package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwj extends kwk {
    private boolean d;
    private IconCompat f;
    private IconCompat k;
    private IconCompat l;
    private List a = new ArrayList();
    private List b = new ArrayList();
    private int c = 0;
    private boolean e = true;

    private static IconCompat h(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            return kzt.e((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.g((Bitmap) parcelable);
        }
        return null;
    }

    @Override // defpackage.kwk
    protected final String a() {
        return "androidx.core.app.NotificationCompat$ProgressStyle";
    }

    @Override // defpackage.kwk
    public final void b(kux kuxVar) {
        int i = Build.VERSION.SDK_INT;
        kwr kwrVar = (kwr) kuxVar;
        Notification.Builder builder = kwrVar.b;
        if (i < 36) {
            int iG = g();
            builder.setProgress(iG, Math.min(this.c, iG), this.d);
            return;
        }
        Context context = kwrVar.a;
        Notification.ProgressStyle progressStyle = new Notification.ProgressStyle();
        kwg.h(progressStyle, this.e);
        kwg.a(progressStyle, this.c);
        kwg.c(progressStyle, this.d);
        IconCompat iconCompat = this.k;
        kwg.f(progressStyle, iconCompat != null ? kzt.c(iconCompat, context) : null);
        IconCompat iconCompat2 = this.l;
        kwg.b(progressStyle, iconCompat2 != null ? kzt.c(iconCompat2, context) : null);
        IconCompat iconCompat3 = this.f;
        kwg.g(progressStyle, iconCompat3 != null ? kzt.c(iconCompat3, context) : null);
        kwg.d(progressStyle, this.b);
        kwg.e(progressStyle, this.a);
        builder.setStyle(progressStyle);
    }

    @Override // defpackage.kwk
    protected final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.progressSegments");
        bundle.remove("android.progress");
        bundle.remove("android.styledByProgress");
        bundle.remove("android.progressTrackerIcon");
        bundle.remove("android.progressStartIcon");
        bundle.remove("android.progressEndIcon");
        bundle.remove("android.progressPoints");
        bundle.remove("android.progressIndeterminate");
    }

    @Override // defpackage.kwk
    protected final void d(Bundle bundle) {
        super.d(bundle);
        ArrayList arrayListB = ih.b(bundle, "android.progressSegments", Bundle.class);
        ArrayList arrayList = new ArrayList();
        if (arrayListB != null && !arrayListB.isEmpty()) {
            for (int i = 0; i < arrayListB.size(); i++) {
                Bundle bundle2 = (Bundle) arrayListB.get(i);
                int i2 = bundle2.getInt("length");
                if (i2 > 0) {
                    int i3 = bundle2.getInt("id");
                    int i4 = bundle2.getInt("colorInt", 0);
                    kwi kwiVar = new kwi(i2);
                    kwiVar.b = i3;
                    kwiVar.c = i4;
                    arrayList.add(kwiVar);
                }
            }
        }
        this.a = arrayList;
        this.c = bundle.getInt("android.progress", 0);
        this.d = bundle.getBoolean("android.progressIndeterminate", false);
        this.e = bundle.getBoolean("android.styledByProgress", true);
        ArrayList arrayListB2 = ih.b(bundle, "android.progressPoints", Bundle.class);
        ArrayList arrayList2 = new ArrayList();
        if (arrayListB2 != null && !arrayListB2.isEmpty()) {
            for (int i5 = 0; i5 < arrayListB2.size(); i5++) {
                Bundle bundle3 = (Bundle) arrayListB2.get(i5);
                int i6 = bundle3.getInt("position");
                if (i6 >= 0) {
                    int i7 = bundle3.getInt("id");
                    int i8 = bundle3.getInt("colorInt", 0);
                    kwh kwhVar = new kwh(i6);
                    kwhVar.b = i7;
                    kwhVar.c = i8;
                    arrayList2.add(kwhVar);
                }
            }
        }
        this.b = arrayList2;
        this.f = h((Parcelable) ih.a(bundle, "android.progressTrackerIcon", Icon.class));
        this.k = h((Parcelable) ih.a(bundle, "android.progressStartIcon", Icon.class));
        this.l = h((Parcelable) ih.a(bundle, "android.progressEndIcon", Icon.class));
    }

    public final int g() {
        List list = this.a;
        if (list == null || list.isEmpty()) {
            return 100;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long j = i2 + ((kwi) list.get(i3)).a;
            i2 = (int) j;
            if (j != i2) {
                try {
                    throw new ArithmeticException();
                } catch (ArithmeticException unused) {
                    return 100;
                }
            }
            i++;
        }
        if (i == 0) {
            return 100;
        }
        return i2;
    }

    @Override // defpackage.kwk
    public final void j(Bundle bundle) {
        super.j(bundle);
        if (Build.VERSION.SDK_INT < 36) {
            List list = this.a;
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    kwi kwiVar = (kwi) list.get(i);
                    int i2 = kwiVar.a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("length", i2);
                    bundle2.putInt("id", kwiVar.b);
                    bundle2.putInt("colorInt", kwiVar.c);
                    arrayList.add(bundle2);
                }
            }
            bundle.putParcelableArrayList("android.progressSegments", arrayList);
            List list2 = this.b;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            if (list2 != null && !list2.isEmpty()) {
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    kwh kwhVar = (kwh) list2.get(i3);
                    int i4 = kwhVar.a;
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("position", i4);
                    bundle3.putInt("id", kwhVar.b);
                    bundle3.putInt("colorInt", kwhVar.c);
                    arrayList2.add(bundle3);
                }
            }
            bundle.putParcelableArrayList("android.progressPoints", arrayList2);
            bundle.putInt("android.progress", this.c);
            bundle.putBoolean("android.progressIndeterminate", this.d);
            bundle.putInt("android.progressMax", g());
            bundle.putBoolean("android.styledByProgress", this.e);
            kvq kvqVar = this.g;
            Context context = kvqVar != null ? kvqVar.a : null;
            if (context != null) {
                IconCompat iconCompat = this.f;
                if (iconCompat != null) {
                    bundle.putParcelable("android.progressTrackerIcon", kzt.c(iconCompat, context));
                } else {
                    bundle.remove("android.progressTrackerIcon");
                }
                IconCompat iconCompat2 = this.k;
                if (iconCompat2 != null) {
                    bundle.putParcelable("android.progressStartIcon", kzt.c(iconCompat2, context));
                } else {
                    bundle.remove("android.progressStartIcon");
                }
                IconCompat iconCompat3 = this.l;
                if (iconCompat3 != null) {
                    bundle.putParcelable("android.progressEndIcon", kzt.c(iconCompat3, context));
                } else {
                    bundle.remove("android.progressEndIcon");
                }
            }
        }
    }
}
