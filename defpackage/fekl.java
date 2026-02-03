package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fekl {
    public static fekj a;
    public static ComponentName b;
    private static final List c;
    private static volatile Boolean d;
    private static final Object e;

    static {
        LinkedList linkedList = new LinkedList();
        c = linkedList;
        e = new Object();
        linkedList.add(fekm.class);
        linkedList.add(fekn.class);
        linkedList.add(fekr.class);
        linkedList.add(feks.class);
        linkedList.add(fekw.class);
        linkedList.add(fekz.class);
        linkedList.add(feko.class);
        linkedList.add(fekq.class);
        linkedList.add(fekt.class);
        linkedList.add(feku.class);
        linkedList.add(felb.class);
        linkedList.add(feky.class);
        linkedList.add(fela.class);
        linkedList.add(fekx.class);
    }

    public static boolean a(Context context) {
        fekj fekjVar;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package ".concat(String.valueOf(context.getPackageName())));
            return false;
        }
        b = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        String str = resolveInfoResolveActivity.activityInfo.packageName;
        Iterator it = c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            try {
                fekjVar = (fekj) ((Class) it.next()).newInstance();
            } catch (Exception unused) {
                fekjVar = null;
            }
            if (fekjVar != null && fekjVar.a().contains(str)) {
                a = fekjVar;
                break;
            }
        }
        if (a != null) {
            return true;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            a = new fekz();
            return true;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("ZUK")) {
            a = new felb();
            return true;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
            a = new fekt();
            return true;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("VIVO") || Build.MANUFACTURER.equalsIgnoreCase("JOVI")) {
            a = new feky();
            return true;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("ZTE") || Build.MANUFACTURER.equalsIgnoreCase("NUBIA")) {
            a = new fela();
            return true;
        }
        a = (Build.MANUFACTURER.equalsIgnoreCase("TECNO") || Build.MANUFACTURER.equalsIgnoreCase("INFINIX") || Build.MANUFACTURER.equalsIgnoreCase("ITEL") || Build.MANUFACTURER.equalsIgnoreCase("TECNO MOBILE")) ? new fekx() : new fekp();
        return true;
    }

    public static boolean b(Context context) {
        int i;
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    String message = null;
                    int i2 = 0;
                    while (i2 < 3) {
                        try {
                            i = i2 + 1;
                            Log.i("ShortcutBadger", "Checking if platform supports badge counters, attempt " + String.format("%d/%d.", Integer.valueOf(i), 3));
                        } catch (Exception e2) {
                            message = e2.getMessage();
                            i2++;
                        }
                        if (a(context)) {
                            a.b(context, b, 0);
                            d = true;
                            Log.i("ShortcutBadger", "Badge counter is supported in this platform.");
                            break;
                        }
                        message = "Failed to initialize the badge counter.";
                        i2 = i;
                    }
                    if (d == null) {
                        Log.w("ShortcutBadger", a.v(message, "Badge counter seems not supported in this platform: "));
                        d = false;
                    }
                }
            }
        }
        return d.booleanValue();
    }
}
