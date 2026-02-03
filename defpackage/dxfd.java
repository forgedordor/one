package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxfd {
    public static final String a = "dxfd";
    private static final ejwy d = new dxet();
    private static final ejwy e = new dxeu();
    private static final ejwy f = new dxev();
    public final dxey b;
    protected final List c;
    private final Context g;
    private final Executor h;
    private final dxfe i;
    private final ConnectivityManager j;
    private final Map k;
    private final Map l;
    private final Queue m;
    private boolean n;
    private final BroadcastReceiver o;

    public dxfd(dxfe dxfeVar, Context context, Executor executor) {
        dxey dxeyVar = new dxey();
        this.k = new HashMap();
        this.l = new HashMap();
        this.m = new ConcurrentLinkedQueue();
        this.c = new ArrayList();
        this.n = false;
        this.o = new dxew(this);
        this.g = context;
        this.i = dxfeVar;
        this.h = executor;
        this.b = dxeyVar;
        this.j = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static String a(File file, String str) {
        return file.getAbsolutePath() + "/" + str;
    }

    public static void j(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (IllegalStateException | NullPointerException unused) {
            }
        }
    }

    public static dxep m(int i) {
        return new dxep(dxeo.INVALID_REQUEST, -1, "DataUri error type: ".concat(dxem.a(i)), null, null);
    }

    private static boolean p(Context context, String str) {
        return kxj.c(context, str) == 0;
    }

    private static final void q(List list, ejwy ejwyVar) {
        ekqh it = ((ekgb) list).iterator();
        while (it.hasNext()) {
            ejwyVar.a((dxfa) it.next());
        }
    }

    public final synchronized HttpURLConnection b(String str, String str2) {
        HttpURLConnection httpURLConnectionA;
        dxfe dxfeVar = this.i;
        dxfeVar.e();
        if (!p(this.g, "android.permission.INTERNET")) {
            throw new IllegalStateException("Missing INTERNET permission, can't start download");
        }
        ejwl.l(!((dxes) this.k.get(str)).e());
        httpURLConnectionA = dxfeVar.a(str2);
        String str3 = this.b.b;
        this.l.put(str, httpURLConnectionA);
        return httpURLConnectionA;
    }

    protected final synchronized List c() {
        ekfw ekfwVar;
        int i = ekgb.d;
        ekfwVar = new ekfw();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            dxfa dxfaVar = (dxfa) ((WeakReference) it.next()).get();
            if (dxfaVar == null) {
                it.remove();
            } else {
                ekfwVar.h(dxfaVar);
            }
        }
        return ekfwVar.g();
    }

    public final synchronized void d(File file, String str) {
        Map map = this.k;
        String strA = a(file, str);
        dxes dxesVar = (dxes) map.get(strA);
        if (dxesVar != null) {
            dxesVar.d();
        } else {
            Log.v(a, "Attempted to setCanceled unknown request: ".concat(strA));
        }
        j((HttpURLConnection) this.l.get(strA));
        if (dxesVar != null) {
            g();
        }
    }

    public final synchronized void e() {
        dxfe dxfeVar = this.i;
        dxfeVar.b();
        dxfeVar.c();
    }

    public final void f(dxes dxesVar) {
        List listC;
        dxesVar.c();
        synchronized (this) {
            Queue queue = this.m;
            boolean zIsEmpty = queue.isEmpty();
            queue.add(dxesVar);
            if (zIsEmpty) {
                this.g.registerReceiver(this.o, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.n = true;
                g();
            }
            listC = queue.containsAll(this.k.values()) ? c() : null;
        }
        if (listC != null) {
            q(listC, d);
        }
    }

    public final synchronized void g() {
        Queue queue = this.m;
        Log.d(a, "Running " + queue.size() + " requests pending connectivity");
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            dxes dxesVar = (dxes) it.next();
            if (dxesVar.e() || k(dxesVar.a())) {
                it.remove();
                dxesVar.b();
                i(dxesVar);
            }
        }
        if (queue.isEmpty() && this.n) {
            this.g.unregisterReceiver(this.o);
            this.n = false;
        }
    }

    public final synchronized void h(dxfa dxfaVar) {
        this.c.add(new WeakReference(dxfaVar));
    }

    public final void i(dxes dxesVar) {
        q(c(), e);
        this.h.execute(new dxex(this, dxesVar));
    }

    public final synchronized boolean k(dxer dxerVar) {
        if (dxerVar == dxer.NONE) {
            return true;
        }
        if (!p(this.g, "android.permission.ACCESS_NETWORK_STATE")) {
            throw new IllegalStateException("Attempting to determine connectivity without the ACCESS_NETWORK_STATE permission.");
        }
        ConnectivityManager connectivityManager = this.j;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            this.i.e();
            if (!activeNetworkInfo.isConnected()) {
                Log.d(a, "Network disconnected, connectivity cannot be satisfied.");
                return false;
            }
            int iOrdinal = dxerVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    Log.e(a, "Unknown connectivity type checked: ".concat(String.valueOf(dxerVar.name())));
                } else if (activeNetworkInfo.getType() != 0 && activeNetworkInfo.getType() != 4 && activeNetworkInfo.getType() != 6 && activeNetworkInfo.getType() != 7 && activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 9 && activeNetworkInfo.getType() != 16 && activeNetworkInfo.getType() != 17) {
                    return false;
                }
            } else if (connectivityManager.isActiveNetworkMetered() && activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 9 && activeNetworkInfo.getType() != 17) {
                return false;
            }
            return true;
        }
        Log.d(a, "No current network, connectivity cannot be satisfied.");
        return false;
    }

    public final synchronized boolean l(dxes dxesVar) {
        File file = dxesVar.b;
        String str = dxesVar.c;
        Map map = this.k;
        String strA = a(file, str);
        if (map.containsKey(strA)) {
            Log.i(a, "Request is already being executed for key: ".concat(strA));
            return false;
        }
        map.put(strA, dxesVar);
        i(dxesVar);
        return true;
    }

    public final void n(File file, String str, dtzq dtzqVar, dxep dxepVar, File file2) {
        List listC;
        List listC2;
        dtow dtowVar;
        String strA = a(file, str);
        synchronized (this) {
            Map map = this.k;
            map.remove(strA);
            this.l.remove(strA);
            if (map.isEmpty()) {
                listC = c();
                listC2 = null;
            } else if (this.m.containsAll(map.values())) {
                listC2 = c();
                listC = null;
            } else {
                listC = null;
                listC2 = null;
            }
        }
        if (dxepVar == null) {
            durt.c("%s: Downloaded file %s", "DownloadCompleteHandler", file2.getName());
            dtzqVar.a.b(null);
        } else {
            String name = file2.getName();
            dxeo dxeoVar = dxepVar.a;
            Object[] objArr = {"DownloadCompleteHandler", name, dxeoVar};
            Throwable th = dxepVar.e;
            durt.e(th, "%s: Failed to download file %s due to %s", objArr);
            dtov dtovVarA = dtox.a();
            switch (dxeoVar) {
                case UNKNOWN:
                    dtowVar = dtow.ANDROID_DOWNLOADER_UNKNOWN;
                    break;
                case CANCELED:
                    dtowVar = dtow.ANDROID_DOWNLOADER_CANCELED;
                    break;
                case INVALID_REQUEST:
                    dtowVar = dtow.ANDROID_DOWNLOADER_INVALID_REQUEST;
                    break;
                case HTTP_ERROR:
                    dtowVar = dtow.ANDROID_DOWNLOADER_HTTP_ERROR;
                    break;
                case REQUEST_ERROR:
                    dtowVar = dtow.ANDROID_DOWNLOADER_REQUEST_ERROR;
                    break;
                case RESPONSE_OPEN_ERROR:
                    dtowVar = dtow.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR;
                    break;
                case RESPONSE_CLOSE_ERROR:
                    dtowVar = dtow.ANDROID_DOWNLOADER_RESPONSE_CLOSE_ERROR;
                    break;
                case NETWORK_IO_ERROR:
                    dtowVar = dtow.ANDROID_DOWNLOADER_NETWORK_IO_ERROR;
                    break;
                case DISK_IO_ERROR:
                    dtowVar = dtow.ANDROID_DOWNLOADER_DISK_IO_ERROR;
                    break;
                case FILE_SYSTEM_ERROR:
                    dtowVar = dtow.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR;
                    break;
                case UNKNOWN_IO_ERROR:
                    dtowVar = dtow.ANDROID_DOWNLOADER_UNKNOWN_IO_ERROR;
                    break;
                case OAUTH_ERROR:
                    dtowVar = dtow.ANDROID_DOWNLOADER_OAUTH_ERROR;
                    break;
                default:
                    dtowVar = dtow.UNKNOWN_ERROR;
                    break;
            }
            dtovVarA.a = dtowVar;
            String str2 = "ANDROID_DOWNLOADER_" + dxeoVar.name() + "; ";
            int i = dxepVar.b;
            if (i >= 0) {
                str2 = str2 + "HttpCode: " + i + "; ";
            }
            String str3 = dxepVar.c;
            if (str3 != null) {
                str2 = str2 + "Message: " + str3 + "; ";
            }
            dtovVarA.b = str2;
            if (th != null) {
                dtovVarA.c = th;
            }
            dtzqVar.a.c(dtovVarA.a());
        }
        if (listC != null) {
            q(listC, f);
        } else if (listC2 != null) {
            q(listC2, d);
        }
    }

    public final synchronized void o(HttpURLConnection httpURLConnection, int i) {
        if (i != -1) {
            this.i.d(httpURLConnection, i);
        }
    }
}
