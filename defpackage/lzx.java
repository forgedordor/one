package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class lzx {
    private static final Object e = new Object();
    private static lzx f;
    public final Context a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayList d = new ArrayList();
    private final Handler g;

    private lzx(Context context) {
        this.a = context;
        this.g = new lzu(this, context.getMainLooper());
    }

    public static lzx a(Context context) {
        lzx lzxVar;
        synchronized (e) {
            if (f == null) {
                f = new lzx(context.getApplicationContext());
            }
            lzxVar = f;
        }
        return lzxVar;
    }

    public final void b(Intent intent) {
        ArrayList arrayList;
        synchronized (this.b) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList arrayList2 = (ArrayList) this.c.get(intent.getAction());
            if (arrayList2 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", a.l(arrayList2, "Action list: "));
                }
                ArrayList arrayList3 = null;
                int i = 0;
                while (i < arrayList2.size()) {
                    lzw lzwVar = (lzw) arrayList2.get(i);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + lzwVar.a);
                    }
                    if (lzwVar.c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        arrayList = arrayList2;
                    } else {
                        int iMatch = lzwVar.a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z) {
                                StringBuilder sb = new StringBuilder();
                                arrayList = arrayList2;
                                sb.append("  Filter matched!  match=0x");
                                sb.append(Integer.toHexString(iMatch));
                                Log.v("LocalBroadcastManager", sb.toString());
                            } else {
                                arrayList = arrayList2;
                            }
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(lzwVar);
                            lzwVar.c = true;
                        } else {
                            arrayList = arrayList2;
                            if (z) {
                                Log.v("LocalBroadcastManager", a.v(iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE : GroupManagementRequest.DATA_TAG : GroupManagementRequest.ACTION_TAG : "category", "  Filter did not match: "));
                            }
                        }
                    }
                    i++;
                    arrayList2 = arrayList;
                }
                if (arrayList3 != null) {
                    for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                        ((lzw) arrayList3.get(i2)).c = false;
                    }
                    this.d.add(new lzv(intent, arrayList3));
                    Handler handler = this.g;
                    if (!handler.hasMessages(1)) {
                        handler.sendEmptyMessage(1);
                    }
                }
            }
        }
    }
}
