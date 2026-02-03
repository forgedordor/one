package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvq {
    public String A;
    public Bundle B;
    public int C;
    public int D;
    Notification E;
    public String F;
    int G;
    public String H;
    kxx I;
    public long J;
    int K;
    public boolean L;
    public kvn M;
    Notification N;
    public boolean O;
    Object P;

    @Deprecated
    public ArrayList Q;
    public Context a;
    public ArrayList b;
    public ArrayList c;
    ArrayList d;
    CharSequence e;
    CharSequence f;
    public PendingIntent g;
    PendingIntent h;
    IconCompat i;
    CharSequence j;
    public int k;
    public int l;
    public boolean m;
    boolean n;
    kwk o;
    CharSequence p;
    CharSequence q;
    int r;
    int s;
    boolean t;
    public String u;
    public boolean v;
    String w;
    public boolean x;
    boolean y;
    boolean z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kvq(android.content.Context r32, android.app.Notification r33) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kvq.<init>(android.content.Context, android.app.Notification):void");
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    private final void z(int i, boolean z) {
        if (z) {
            Notification notification = this.N;
            notification.flags = i | notification.flags;
        } else {
            Notification notification2 = this.N;
            notification2.flags = (~i) & notification2.flags;
        }
    }

    public final Notification a() {
        Bundle bundle;
        kwr kwrVar = new kwr(this);
        kvq kvqVar = kwrVar.c;
        kwk kwkVar = kvqVar.o;
        if (kwkVar != null) {
            kwkVar.b(kwrVar);
        }
        Notification notificationBuild = kwrVar.b.build();
        if (kwkVar != null) {
            kvqVar.o.k();
        }
        if (kwkVar != null && (bundle = notificationBuild.extras) != null) {
            kwkVar.j(bundle);
        }
        return notificationBuild;
    }

    public final Bundle b() {
        if (this.B == null) {
            this.B = new Bundle();
        }
        return this.B;
    }

    public final void d(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.b.add(new kvf(IconCompat.i(null, "", i), charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false));
    }

    public final void e(kvf kvfVar) {
        this.b.add(kvfVar);
    }

    public final void f(kxa kxaVar) {
        if (kxaVar != null) {
            this.c.add(kxaVar);
        }
    }

    public final void g(boolean z) {
        z(16, z);
    }

    public final void h(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void i(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void j(int i) {
        this.N.defaults = i;
        if ((i & 4) != 0) {
            this.N.flags |= 1;
        }
    }

    public final void k(PendingIntent pendingIntent) {
        this.N.deleteIntent = pendingIntent;
    }

    public final void l() {
        this.K = 2;
    }

    public final void m(Bitmap bitmap) throws Resources.NotFoundException {
        IconCompat iconCompatG;
        if (bitmap == null) {
            iconCompatG = null;
        } else {
            Context context = this.a;
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = context.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
                }
            }
            iconCompatG = IconCompat.g(bitmap);
        }
        this.i = iconCompatG;
    }

    public final void n(int i, int i2, int i3) {
        this.N.ledARGB = i;
        this.N.ledOnMS = i2;
        this.N.ledOffMS = i3;
        int i4 = 0;
        if (this.N.ledOnMS != 0 && this.N.ledOffMS != 0) {
            i4 = 1;
        }
        Notification notification = this.N;
        notification.flags = i4 | (notification.flags & (-2));
    }

    public final void o(boolean z) {
        z(2, z);
    }

    public final void p(boolean z) {
        z(8, z);
    }

    public final void q(int i, int i2, boolean z) {
        this.r = i;
        this.s = i2;
        this.t = z;
    }

    public final void r(int i) {
        this.N.icon = i;
    }

    public final void s(IconCompat iconCompat) {
        this.P = kzt.c(iconCompat, this.a);
    }

    public final void t(Uri uri) {
        this.N.sound = uri;
        this.N.audioStreamType = -1;
        AudioAttributes.Builder builderD = kvo.d(kvo.b(kvo.a(), 4), 5);
        this.N.audioAttributes = kvo.e(builderD);
    }

    public final void u(kwk kwkVar) {
        if (this.o != kwkVar) {
            this.o = kwkVar;
            if (kwkVar != null) {
                kwkVar.i(this);
            }
        }
    }

    public final void v(CharSequence charSequence) {
        this.p = c(charSequence);
    }

    public final void w(CharSequence charSequence) {
        this.N.tickerText = c(charSequence);
    }

    public final void x(long[] jArr) {
        this.N.vibrate = jArr;
    }

    public final void y(long j) {
        this.N.when = j;
    }

    public kvq(Context context, String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.m = true;
        this.x = false;
        this.C = 0;
        this.D = 0;
        this.G = 0;
        this.K = 0;
        Notification notification = new Notification();
        this.N = notification;
        this.a = context;
        this.F = str;
        notification.when = System.currentTimeMillis();
        this.N.audioStreamType = -1;
        this.l = 0;
        this.Q = new ArrayList();
        this.L = true;
    }
}
