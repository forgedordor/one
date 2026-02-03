package defpackage;

import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.gms.iid.MessengerCompat;
import j$.util.Objects;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddes {
    static String a = null;
    static boolean b = false;
    static int c;
    static BroadcastReceiver d;
    private static final Pattern k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context e;
    final Map f = new csq();
    Messenger g;
    Messenger h;
    MessengerCompat i;
    PendingIntent j;

    public ddes(Context context) {
        this.e = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r5) {
        /*
            java.lang.String r0 = defpackage.ddes.a
            if (r0 == 0) goto L5
            return r0
        L5:
            android.os.Process.myUid()
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.iid.TOKEN_REQUEST"
            r0.<init>(r1)
            r1 = 0
            java.util.List r0 = r5.queryBroadcastReceivers(r0, r1)
            java.lang.String r1 = "InstanceID"
            if (r0 == 0) goto L4b
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r0.next()
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            java.lang.String r2 = r2.packageName
            java.lang.String r3 = "com.google.android.c2dm.permission.SEND"
            int r3 = r5.checkPermission(r3, r2)
            if (r3 != 0) goto L3f
            boolean r2 = i(r5, r2)
            if (r2 == 0) goto L20
            goto L5f
        L3f:
            java.lang.String r3 = "Possible malicious package "
            java.lang.String r4 = " declares com.google.iid.TOKEN_REQUEST without permission"
            java.lang.String r2 = defpackage.a.a(r2, r3, r4)
            android.util.Log.w(r1, r2)
            goto L20
        L4b:
            java.lang.String r0 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r1, r0)
            java.lang.String r0 = "com.google.android.gms"
            boolean r5 = i(r5, r0)
            if (r5 != 0) goto L5f
            java.lang.String r5 = "Google Play services is missing, unable to get tokens"
            android.util.Log.w(r1, r5)
            r5 = 0
            return r5
        L5f:
            r5 = 1
            defpackage.ddes.b = r5
            java.lang.String r5 = defpackage.ddes.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddes.b(android.content.Context):java.lang.String");
    }

    public static synchronized String c() {
        int i;
        i = c;
        c = i + 1;
        return Integer.toString(i);
    }

    private final Bundle f(Bundle bundle) throws RemoteException, IOException {
        Bundle bundle2;
        ConditionVariable conditionVariable = new ConditionVariable();
        Class<?> cls = getClass();
        String strC = c();
        synchronized (cls) {
            this.f.put(strC, conditionVariable);
        }
        if (this.g == null) {
            Context context = this.e;
            dclh.m(context);
            b(context);
            this.g = new Messenger(new ddeq(this, Looper.getMainLooper()));
        }
        if (a == null) {
            throw new IOException("MISSING_INSTANCEID_SERVICE");
        }
        Intent intent = new Intent(true != b ? "com.google.android.c2dm.intent.REGISTER" : "com.google.iid.TOKEN_REQUEST");
        intent.setPackage(a);
        intent.putExtras(bundle);
        e(intent);
        intent.putExtra("kid", a.a(strC, "|ID|", "|"));
        intent.putExtra("X-kid", a.a(strC, "|ID|", "|"));
        boolean zEquals = Objects.equals(a, "com.google.android.gsf");
        String stringExtra = intent.getStringExtra("useGsf");
        if (stringExtra != null) {
            zEquals = stringExtra.equals("1");
        }
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Sending ".concat(String.valueOf(String.valueOf(intent.getExtras()))));
        }
        Messenger messenger = this.h;
        if (messenger != null) {
            intent.putExtra("google.messenger", this.g);
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                messenger.send(messageObtain);
            } catch (RemoteException unused) {
                if (Log.isLoggable("InstanceID", 3)) {
                    Log.d("InstanceID", "Messenger failed, fallback to startService");
                }
            }
        } else if (zEquals) {
            synchronized (ddes.class) {
                if (d == null) {
                    Context context2 = this.e;
                    dclh.m(context2);
                    dder dderVar = new dder(this);
                    d = dderVar;
                    if (Log.isLoggable("InstanceID", 3)) {
                        Log.d("InstanceID", "Registered GSF callback receiver");
                    }
                    IntentFilter intentFilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
                    intentFilter.addCategory(context2.getPackageName());
                    kxj.h(context2, dderVar, intentFilter, "com.google.android.c2dm.permission.SEND");
                }
            }
            Context context3 = this.e;
            dclh.m(context3);
            g(context3, intent);
        } else {
            intent.putExtra("google.messenger", this.g);
            intent.putExtra("messenger2", "1");
            MessengerCompat messengerCompat = this.i;
            if (messengerCompat != null) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.obj = intent;
                try {
                    messengerCompat.b(messageObtain2);
                } catch (RemoteException unused2) {
                    if (Log.isLoggable("InstanceID", 3)) {
                        Log.d("InstanceID", "Messenger failed, fallback to startService");
                    }
                }
            } else if (b) {
                Context context4 = this.e;
                dclh.m(context4);
                g(context4, intent);
            } else {
                Context context5 = this.e;
                dclh.m(context5);
                context5.startService(intent);
            }
        }
        conditionVariable.block(30000L);
        synchronized (getClass()) {
            Object objRemove = this.f.remove(strC);
            if (!(objRemove instanceof Bundle)) {
                if (objRemove instanceof String) {
                    throw new IOException((String) objRemove);
                }
                Log.w("InstanceID", a.E(objRemove, "No response "));
                throw new IOException("TIMEOUT");
            }
            bundle2 = (Bundle) objRemove;
        }
        return bundle2;
    }

    private static void g(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    private final void h(String str, Object obj) {
        synchronized (getClass()) {
            Map map = this.f;
            Object obj2 = map.get(str);
            map.put(str, obj);
            if (obj2 != null) {
                j(obj2, obj);
            }
        }
    }

    private static boolean i(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            a = applicationInfo.packageName;
            int i = applicationInfo.uid;
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private static final void j(Object obj, Object obj2) throws RemoteException {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message messageObtain = Message.obtain();
            messageObtain.obj = obj2;
            try {
                messenger.send(messageObtain);
            } catch (RemoteException e) {
                Log.w("InstanceID", "Failed to send response ".concat(e.toString()));
            }
        }
    }

    public final Bundle a(Bundle bundle) throws RemoteException, IOException {
        Bundle bundleF = f(bundle);
        if (bundleF == null || !bundleF.containsKey("google.messenger")) {
            return bundleF;
        }
        Bundle bundleF2 = f(bundle);
        if (bundleF2 == null || !bundleF2.containsKey("google.messenger")) {
            return bundleF2;
        }
        return null;
    }

    public final void d(Intent intent) {
        String strSubstring;
        if (intent == null) {
            if (Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", "Unexpected response: null");
                return;
            }
            return;
        }
        String action = intent.getAction();
        if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION") && !Objects.equals(action, "com.google.android.gms.iid.InstanceID")) {
            if (Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", "Unexpected response ".concat(String.valueOf(intent.getAction())));
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("unregistered");
        }
        if (stringExtra != null) {
            Matcher matcher = k.matcher(stringExtra);
            if (!matcher.matches()) {
                if (Log.isLoggable("InstanceID", 3)) {
                    Log.d("InstanceID", "Unexpected response string: ".concat(stringExtra));
                    return;
                }
                return;
            }
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putString("registration_id", strGroup2);
            h(strGroup, extras);
            return;
        }
        String stringExtra2 = intent.getStringExtra("error");
        if (stringExtra2 == null) {
            Log.w("InstanceID", "Unexpected response, no error or registration id ".concat(String.valueOf(String.valueOf(intent.getExtras()))));
            return;
        }
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Received InstanceID error ".concat(stringExtra2));
        }
        String str = null;
        if (stringExtra2.startsWith("|")) {
            String[] strArrSplit = stringExtra2.split("\\|");
            if (!Objects.equals(strArrSplit[1], "ID")) {
                Log.w("InstanceID", "Unexpected structured response ".concat(stringExtra2));
            }
            if (strArrSplit.length > 2) {
                String str2 = strArrSplit[2];
                strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                str = str2;
            } else {
                strSubstring = "UNKNOWN";
            }
            stringExtra2 = strSubstring;
            intent.putExtra("error", stringExtra2);
        }
        if (str != null) {
            h(str, stringExtra2);
            return;
        }
        synchronized (getClass()) {
            Map map = this.f;
            for (String str3 : map.keySet()) {
                Object obj = map.get(str3);
                map.put(str3, stringExtra2);
                if (obj != null) {
                    j(obj, stringExtra2);
                }
            }
        }
    }

    final synchronized void e(Intent intent) {
        if (this.j == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            Context context = this.e;
            dclh.m(context);
            this.j = ddmt.a(context, intent2, VCardConfig.FLAG_APPEND_TYPE_PARAM);
        }
        intent.putExtra("app", this.j);
    }
}
