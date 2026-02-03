package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.ContentObserver;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.apps.messaging.R;
import j$.util.Objects;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efsj {
    public static final String a = "efsj";
    public static Bundle b = null;
    public static Bundle c = null;
    public static Bundle d = null;
    public static Bundle e = null;
    public static Bundle f = null;
    public static Bundle g = null;
    public static Bundle h = null;
    public static Bundle i = null;
    static boolean j = true;
    public static Bundle k = null;
    public static Bundle l = null;
    public static Bundle m = null;
    public static int n = 1;
    public static int o;
    public static int p;
    private static efsj s;
    private static ContentObserver t;
    private static int u;
    private static boolean v;
    Bundle q;
    final EnumMap r;

    private efsj(Context context) {
        this.q = null;
        EnumMap enumMap = new EnumMap(efsh.class);
        this.r = enumMap;
        Bundle bundle = this.q;
        if (bundle == null || bundle.isEmpty()) {
            try {
                this.q = context.getContentResolver().call(g(), "getOverlayConfig", (String) null, (Bundle) null);
                enumMap.clear();
                String str = a;
                Bundle bundle2 = this.q;
                Log.i(str, a.J(bundle2 != null ? Integer.valueOf(bundle2.size()) : "(null)", "PartnerConfigsBundle="));
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "Fail to get config from suw provider");
            }
        }
        if (u(context)) {
            if (t != null) {
                try {
                    context.getContentResolver().unregisterContentObserver(t);
                    t = null;
                } catch (IllegalArgumentException | NullPointerException | SecurityException e2) {
                    Log.w(a, "Failed to unregister content observer: ".concat(e2.toString()));
                }
            }
            Uri uriG = g();
            try {
                t = new efsi();
                context.getContentResolver().registerContentObserver(uriG, true, t);
            } catch (IllegalArgumentException | NullPointerException | SecurityException e3) {
                Log.w(a, a.p(uriG, e3, "Failed to register content observer for ", ": "));
            }
        }
    }

    static final efsk A(efsk efskVar) throws Resources.NotFoundException {
        try {
            String str = efskVar.a;
            if (Objects.equals(str, "com.google.android.setupwizard")) {
                Resources resources = efskVar.d;
                String resourceTypeName = resources.getResourceTypeName(efskVar.c);
                String strConcat = efskVar.b.concat("_material_you");
                int identifier = resources.getIdentifier(strConcat, resourceTypeName, str);
                if (identifier != 0) {
                    Log.i(a, a.v(strConcat, "use material you resource:"));
                    return new efsk(str, strConcat, identifier, resources);
                }
            }
        } catch (Resources.NotFoundException unused) {
        }
        return efskVar;
    }

    private static float C(Context context, TypedValue typedValue) {
        return typedValue.getDimension(context.getResources().getDisplayMetrics());
    }

    public static Activity e(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return e(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Cannot find instance of Activity in parent tree");
    }

    public static Uri g() {
        return new Uri.Builder().scheme("content").authority("com.google.android.setupwizard.partner").build();
    }

    public static synchronized efsj h(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        boolean z = true;
        if (s == null) {
            if (!n(context) || !eftb.c()) {
                z = false;
            }
            v = z;
            u = configuration.uiMode & 48;
            n = configuration.orientation;
            p = configuration.screenWidthDp;
            o = configuration.screenHeightDp;
        } else {
            boolean z2 = u(context) && (configuration.uiMode & 48) != u;
            if (!n(context) || !eftb.c()) {
                z = false;
            }
            if (z2 || z != v || configuration.orientation != n || configuration.screenWidthDp != p || configuration.screenHeightDp != o) {
                u = configuration.uiMode & 48;
                n = configuration.orientation;
                o = configuration.screenHeightDp;
                p = configuration.screenWidthDp;
                k();
            }
        }
        s = new efsj(context);
        return s;
    }

    public static synchronized void k() {
        s = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        h = null;
        k = null;
        l = null;
        i = null;
        m = null;
    }

    public static boolean n(Context context) {
        if (h == null) {
            try {
                h = context.getContentResolver().call(g(), "isEmbeddedActivityOnePaneEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "SetupWizard one-pane support in embedded activity status unknown; return as false.");
                h = null;
                return false;
            }
        }
        Bundle bundle = h;
        return bundle != null && bundle.getBoolean("isEmbeddedActivityOnePaneEnabled", false);
    }

    public static boolean o(Context context) {
        Bundle bundle = m;
        if (bundle == null || bundle.isEmpty()) {
            try {
                m = context.getContentResolver().call(g(), "isEnhancedSetupDesignMetricsEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "Method isEnhancedSetupDesignMetricsEnabled is unknown");
                m = null;
                return false;
            }
        }
        Bundle bundle2 = m;
        if (bundle2 == null || bundle2.isEmpty()) {
            return false;
        }
        return m.getBoolean("isEnhancedSetupDesignMetricsEnabled", false);
    }

    public static boolean p(Context context) {
        if (g == null) {
            try {
                g = context.getContentResolver().call(g(), "isFontWeightEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "Font weight supporting status unknown; return as false.");
                g = null;
                return false;
            }
        }
        Bundle bundle = g;
        return bundle != null && bundle.getBoolean("isFontWeightEnabled", true);
    }

    public static boolean q(Context context) {
        Bundle bundle = k;
        if (bundle == null || bundle.isEmpty()) {
            try {
                k = context.getContentResolver().call(g(), "isForceTwoPaneEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "isForceTwoPaneEnabled status is unknown; return as false.");
            }
        }
        Bundle bundle2 = k;
        if (bundle2 == null || bundle2.isEmpty()) {
            return false;
        }
        return k.getBoolean("isForceTwoPaneEnabled", false);
    }

    public static boolean r(Context context) {
        Activity activityE;
        Bundle bundle;
        boolean z;
        try {
            activityE = e(context);
        } catch (IllegalArgumentException e2) {
            Log.w(a, "Failed to lookup activity from context: ".concat(e2.toString()));
            activityE = null;
        }
        if (activityE != null) {
            bundle = new Bundle();
            boolean zA = eftj.a(activityE.getIntent());
            if (j != zA) {
                j = zA;
                Log.i(a, "Need to requery the flag isGlifExpressiveEnabled from provider");
                z = true;
            } else {
                z = false;
            }
            bundle.putBoolean("isSetupFlow", zA);
        } else {
            bundle = null;
            z = false;
        }
        Bundle bundle2 = l;
        if (bundle2 == null || bundle2.isEmpty() || z) {
            try {
                l = context.getContentResolver().call(g(), "isGlifExpressiveEnabled", (String) null, bundle);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "isGlifExpressiveEnabled status is unknown; return as false.");
            }
        }
        Bundle bundle3 = l;
        if (bundle3 != null && !bundle3.isEmpty()) {
            return l.getBoolean("isGlifExpressiveEnabled", false);
        }
        if (context.getTheme() != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.sucGlifExpressiveStyleEnabled});
            boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
            typedArrayObtainStyledAttributes.recycle();
            Log.i(a, a.r(z2, "isGlifExpressiveStyleEnabled is "));
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(Context context) {
        Bundle bundle = i;
        if (bundle == null || bundle.isEmpty()) {
            try {
                i = context.getContentResolver().call(g(), "isKeyboardFocusEnhancementEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "SetupWizard keyboard focus enhancement status unknown; return as false.");
                i = null;
                return false;
            }
        }
        Bundle bundle2 = i;
        if (bundle2 == null || bundle2.isEmpty()) {
            return false;
        }
        return i.getBoolean("isKeyboardFocusEnhancementEnabled");
    }

    public static boolean u(Context context) {
        if (b == null) {
            try {
                b = context.getContentResolver().call(g(), "isSuwDayNightEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "SetupWizard DayNight supporting status unknown; return as false.");
                b = null;
                return false;
            }
        }
        Bundle bundle = b;
        return bundle != null && bundle.getBoolean("isSuwDayNightEnabled", false);
    }

    public static boolean v(Context context) {
        if (f == null) {
            try {
                f = context.getContentResolver().call(g(), "isFullDynamicColorEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "SetupWizard full dynamic color supporting status unknown; return as false.");
                f = null;
                return false;
            }
        }
        Bundle bundle = f;
        return bundle != null && bundle.getBoolean("isFullDynamicColorEnabled", false);
    }

    public static boolean w(Context context) {
        if (c == null) {
            try {
                c = context.getContentResolver().call(g(), "isExtendedPartnerConfigEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "SetupWizard extended partner configs supporting status unknown; return as false.");
                c = null;
                return false;
            }
        }
        Bundle bundle = c;
        return bundle != null && bundle.getBoolean("isExtendedPartnerConfigEnabled", false);
    }

    static final efsk x(Context context, efsk efskVar) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        Resources resources;
        String resourceTypeName;
        String strConcat;
        String str;
        int identifier;
        try {
            resources = efskVar.d;
            resourceTypeName = resources.getResourceTypeName(efskVar.c);
            strConcat = efskVar.b.concat("_embedded_activity");
            str = efskVar.a;
            identifier = resources.getIdentifier(strConcat, resourceTypeName, str);
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
        }
        if (identifier != 0) {
            Log.i(a, a.v(strConcat, "use embedded activity resource:"));
            return new efsk(str, strConcat, identifier, resources);
        }
        Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.setupwizard");
        int identifier2 = resourcesForApplication.getIdentifier(strConcat, resourceTypeName, "com.google.android.setupwizard");
        if (identifier2 != 0) {
            return new efsk("com.google.android.setupwizard", strConcat, identifier2, resourcesForApplication);
        }
        return efskVar;
    }

    static final efsk y(Context context, efsk efskVar) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        if (context != null) {
            try {
                Resources resources = efskVar.d;
                String resourceTypeName = resources.getResourceTypeName(efskVar.c);
                String strConcat = efskVar.b.concat("_two_pane");
                String str = efskVar.a;
                int identifier = resources.getIdentifier(strConcat, resourceTypeName, str);
                if (identifier != 0) {
                    Log.i(a, a.v(strConcat, "two pane resource="));
                    return new efsk(str, strConcat, identifier, resources);
                }
                Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.setupwizard");
                int identifier2 = resourcesForApplication.getIdentifier(strConcat, resourceTypeName, "com.google.android.setupwizard");
                if (identifier2 != 0) {
                    return new efsk("com.google.android.setupwizard", strConcat, identifier2, resourcesForApplication);
                }
            } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
            }
        }
        return efskVar;
    }

    static final efsk z(efsk efskVar) throws Resources.NotFoundException {
        try {
            String str = efskVar.a;
            if (Objects.equals(str, "com.google.android.setupwizard")) {
                Resources resources = efskVar.d;
                String resourceTypeName = resources.getResourceTypeName(efskVar.c);
                String strConcat = efskVar.b.concat("_expressive");
                int identifier = resources.getIdentifier(strConcat, resourceTypeName, str);
                if (identifier != 0) {
                    Log.i(a, a.v(strConcat, "use expressive resource:"));
                    return new efsk(str, strConcat, identifier, resources);
                }
            }
        } catch (Resources.NotFoundException unused) {
        }
        return efskVar;
    }

    public final float B(Context context, efsh efshVar) {
        if (efshVar.bB != 7) {
            throw new IllegalArgumentException("Not a fraction resource");
        }
        EnumMap enumMap = this.r;
        if (enumMap.containsKey(efshVar)) {
            return ((Float) this.r.get(efshVar)).floatValue();
        }
        try {
            efsk efskVarI = i(context, efshVar.bA);
            float fraction = efskVarI.d.getFraction(efskVarI.c, 1, 1);
            try {
                enumMap.put((EnumMap) efshVar, (efsh) Float.valueOf(fraction));
                return fraction;
            } catch (Resources.NotFoundException | NullPointerException unused) {
                return fraction;
            }
        } catch (Resources.NotFoundException | NullPointerException unused2) {
            return 0.0f;
        }
    }

    public final float a(Context context, efsh efshVar) {
        return b(context, efshVar, 0.0f);
    }

    public final float b(Context context, efsh efshVar, float f2) throws Resources.NotFoundException {
        if (efshVar.bB != 6) {
            throw new IllegalArgumentException("Not a dimension resource");
        }
        EnumMap enumMap = this.r;
        if (enumMap.containsKey(efshVar)) {
            return C(context, (TypedValue) this.r.get(efshVar));
        }
        try {
            efsk efskVarI = i(context, efshVar.bA);
            Resources resources = efskVarI.d;
            int i2 = efskVarI.c;
            resources.getDimension(i2);
            TypedValue typedValue = new TypedValue();
            resources.getValue(i2, typedValue, true);
            if (typedValue.type == 5) {
                enumMap.put((EnumMap) efshVar, (efsh) typedValue);
                return C(context, (TypedValue) enumMap.get(efshVar));
            }
            throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i2) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
        } catch (Resources.NotFoundException | NullPointerException unused) {
            return f2;
        }
    }

    public final int c(Context context, efsh efshVar) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        if (efshVar.bB != 3) {
            throw new IllegalArgumentException("Not a color resource");
        }
        EnumMap enumMap = this.r;
        if (enumMap.containsKey(efshVar)) {
            return ((Integer) this.r.get(efshVar)).intValue();
        }
        int color = 0;
        try {
            efsk efskVarI = i(context, efshVar.bA);
            Resources resources = efskVarI.d;
            int i2 = efskVarI.c;
            TypedValue typedValue = new TypedValue();
            resources.getValue(i2, typedValue, true);
            if (typedValue.type == 1 && typedValue.data == 0) {
                return 0;
            }
            color = resources.getColor(i2, null);
            enumMap.put((EnumMap) efshVar, (efsh) Integer.valueOf(color));
            return color;
        } catch (NullPointerException unused) {
            return color;
        }
    }

    public final int d(Context context, efsh efshVar, int i2) throws Resources.NotFoundException {
        if (efshVar.bB != 1) {
            throw new IllegalArgumentException("Not a integer resource");
        }
        EnumMap enumMap = this.r;
        if (enumMap.containsKey(efshVar)) {
            return ((Integer) this.r.get(efshVar)).intValue();
        }
        try {
            efsk efskVarI = i(context, efshVar.bA);
            i2 = efskVarI.d.getInteger(efskVarI.c);
            enumMap.put((EnumMap) efshVar, (efsh) Integer.valueOf(i2));
            return i2;
        } catch (Resources.NotFoundException | NullPointerException unused) {
            return i2;
        }
    }

    public final Drawable f(Context context, efsh efshVar) throws Resources.NotFoundException {
        if (efshVar.bB != 4) {
            throw new IllegalArgumentException("Not a drawable resource");
        }
        EnumMap enumMap = this.r;
        if (enumMap.containsKey(efshVar)) {
            return (Drawable) this.r.get(efshVar);
        }
        Drawable drawable = null;
        try {
            efsk efskVarI = i(context, efshVar.bA);
            Resources resources = efskVarI.d;
            int i2 = efskVarI.c;
            TypedValue typedValue = new TypedValue();
            resources.getValue(i2, typedValue, true);
            if (typedValue.type == 1 && typedValue.data == 0) {
                return null;
            }
            drawable = resources.getDrawable(i2, null);
            enumMap.put((EnumMap) efshVar, (efsh) drawable);
            return drawable;
        } catch (Resources.NotFoundException | NullPointerException unused) {
            return drawable;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.efsk i(android.content.Context r5, java.lang.String r6) throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            r4 = this;
            android.os.Bundle r0 = r4.q
            android.os.Bundle r0 = r0.getBundle(r6)
            android.os.Bundle r1 = r4.q
            java.lang.String r2 = "fallbackConfig"
            android.os.Bundle r1 = r1.getBundle(r2)
            if (r1 == 0) goto L17
            android.os.Bundle r6 = r1.getBundle(r6)
            r0.putBundle(r2, r6)
        L17:
            efsk r6 = defpackage.efsk.a(r5, r0)
            boolean r0 = defpackage.eftb.c()
            if (r0 == 0) goto L42
            android.app.Activity r0 = e(r5)     // Catch: java.lang.IllegalArgumentException -> L3b
            boolean r1 = n(r5)
            if (r1 == 0) goto L42
            pru r1 = defpackage.pru.a(r0)
            boolean r0 = r1.b(r0)
            if (r0 == 0) goto L42
            efsk r6 = x(r5, r6)
            goto Lb9
        L3b:
            java.lang.String r0 = defpackage.efsj.a
            java.lang.String r1 = "Not a Activity instance in parent tree"
            android.util.Log.w(r0, r1)
        L42:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto L53
            boolean r0 = r(r5)
            if (r0 == 0) goto L53
            efsk r6 = z(r6)
            goto Lb9
        L53:
            boolean r0 = defpackage.eftb.c()
            if (r0 == 0) goto L64
            boolean r0 = q(r5)
            if (r0 == 0) goto L64
            efsk r6 = y(r5, r6)
            goto Lb9
        L64:
            boolean r0 = defpackage.eftb.b()
            if (r0 == 0) goto Lb9
            android.os.Bundle r0 = defpackage.efsj.d
            java.lang.String r1 = "IsMaterialYouStyleEnabled"
            if (r0 == 0) goto L76
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9a
        L76:
            r0 = 0
            android.content.ContentResolver r2 = r5.getContentResolver()     // Catch: java.lang.Throwable -> Lb0
            android.net.Uri r3 = g()     // Catch: java.lang.Throwable -> Lb0
            android.os.Bundle r2 = r2.call(r3, r1, r0, r0)     // Catch: java.lang.Throwable -> Lb0
            defpackage.efsj.d = r2     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto L9a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto L9a
            boolean r2 = defpackage.eftb.b()     // Catch: java.lang.Throwable -> Lb0
            if (r2 != 0) goto L9a
            boolean r0 = w(r5)     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto Lb9
            goto Lab
        L9a:
            android.os.Bundle r0 = defpackage.efsj.d
            if (r0 == 0) goto La5
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto Lab
        La5:
            boolean r0 = r(r5)
            if (r0 == 0) goto Lb9
        Lab:
            efsk r6 = A(r6)
            goto Lb9
        Lb0:
            java.lang.String r1 = defpackage.efsj.a
            java.lang.String r2 = "SetupWizard Material You configs supporting status unknown; return as false."
            android.util.Log.w(r1, r2)
            defpackage.efsj.d = r0
        Lb9:
            android.content.res.Resources r0 = r6.d
            android.content.res.Configuration r1 = r0.getConfiguration()
            boolean r5 = u(r5)
            if (r5 != 0) goto Le6
            int r5 = r1.uiMode
            r5 = r5 & 48
            r2 = 32
            if (r5 != r2) goto Le6
            if (r6 != 0) goto Ld7
            java.lang.String r5 = defpackage.efsj.a
            java.lang.String r0 = "resourceEntry is null, skip to force day mode."
            android.util.Log.w(r5, r0)
            goto Le6
        Ld7:
            int r5 = r1.uiMode
            r5 = r5 & (-49)
            r5 = r5 | 16
            r1.uiMode = r5
            android.util.DisplayMetrics r5 = r0.getDisplayMetrics()
            r0.updateConfiguration(r1, r5)
        Le6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efsj.i(android.content.Context, java.lang.String):efsk");
    }

    public final String j(Context context, efsh efshVar) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        if (efshVar.bB != 5) {
            throw new IllegalArgumentException("Not a string resource");
        }
        EnumMap enumMap = this.r;
        if (enumMap.containsKey(efshVar)) {
            return (String) this.r.get(efshVar);
        }
        try {
            efsk efskVarI = i(context, efshVar.bA);
            String string = efskVarI.d.getString(efskVarI.c);
            try {
                enumMap.put((EnumMap) efshVar, (efsh) string);
                return string;
            } catch (NullPointerException unused) {
                return string;
            }
        } catch (NullPointerException unused2) {
            return null;
        }
    }

    public final boolean l(Context context, efsh efshVar, boolean z) throws Resources.NotFoundException {
        if (efshVar.bB != 2) {
            throw new IllegalArgumentException("Not a bool resource");
        }
        EnumMap enumMap = this.r;
        if (enumMap.containsKey(efshVar)) {
            return ((Boolean) this.r.get(efshVar)).booleanValue();
        }
        try {
            efsk efskVarI = i(context, efshVar.bA);
            z = efskVarI.d.getBoolean(efskVarI.c);
            enumMap.put((EnumMap) efshVar, (efsh) Boolean.valueOf(z));
            return z;
        } catch (Resources.NotFoundException | NullPointerException unused) {
            return z;
        }
    }

    public final boolean m() {
        Bundle bundle = this.q;
        return (bundle == null || bundle.isEmpty()) ? false : true;
    }

    public final boolean t(efsh efshVar) {
        return m() && this.q.containsKey(efshVar.bA);
    }
}
