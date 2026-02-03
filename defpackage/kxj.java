package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kxj {
    public static int c(Context context, String str) {
        lca.b(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new kwx(context).i() ? 0 : -1;
    }

    public static ColorStateList d(Context context, int i) throws Resources.NotFoundException {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        kys kysVar;
        Resources.Theme theme;
        Resources resources = context.getResources();
        Resources.Theme theme2 = context.getTheme();
        WeakHashMap weakHashMap = kyy.a;
        kyt kytVar = new kyt(resources, theme2);
        synchronized (kyy.b) {
            SparseArray sparseArray = (SparseArray) kyy.a.get(kytVar);
            colorStateListA = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (kysVar = (kys) sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (!kysVar.b.equals(kytVar.a.getConfiguration()) || (!((theme = kytVar.b) == null && kysVar.c == 0) && (theme == null || kysVar.c != theme.hashCode()))) {
                sparseArray.remove(i);
                colorStateList = null;
            } else {
                colorStateList = kysVar.a;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        TypedValue typedValueC = kyy.c();
        resources.getValue(i, typedValueC, true);
        if (typedValueC.type < 28 || typedValueC.type > 31) {
            try {
                colorStateListA = kyj.a(resources, resources.getXml(i), theme2);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i, theme2);
        }
        synchronized (kyy.b) {
            WeakHashMap weakHashMap2 = kyy.a;
            SparseArray sparseArray2 = (SparseArray) weakHashMap2.get(kytVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap2.put(kytVar, sparseArray2);
            }
            sparseArray2.append(i, new kys(colorStateListA, kytVar.a.getConfiguration(), theme2));
        }
        return colorStateListA;
    }

    public static Executor e(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? context.getMainExecutor() : new lae(new Handler(context.getMainLooper()));
    }

    @Deprecated
    public static File[] f(Context context) {
        return context.getExternalFilesDirs(null);
    }

    public static Intent g(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return h(context, broadcastReceiver, intentFilter, null);
    }

    public static Intent h(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str) {
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, str, null, 2) : context.registerReceiver(broadcastReceiver, intentFilter, str, null, 0);
    }
}
