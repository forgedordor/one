package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qc extends DataSetObservable {
    static final String a = "qc";
    private static final Object k = new Object();
    private static final Map l = new HashMap();
    final Context e;
    final String f;
    public Intent g;
    public qa j;
    public final Object b = new Object();
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    private final py p = new py();
    private final int m = 50;
    boolean h = true;
    private boolean n = false;
    private boolean o = true;
    public boolean i = false;

    private qc(Context context, String str) {
        this.e = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f = str;
        } else {
            this.f = String.valueOf(str).concat(".xml");
        }
    }

    public static qc e(Context context, String str) {
        qc qcVar;
        synchronized (k) {
            Map map = l;
            qcVar = (qc) map.get(str);
            if (qcVar == null) {
                qcVar = new qc(context, str);
                map.put(str, qcVar);
            }
        }
        return qcVar;
    }

    private final void h() {
        List list = this.d;
        int size = list.size() - this.m;
        if (size <= 0) {
            return;
        }
        this.o = true;
        for (int i = 0; i < size; i++) {
        }
    }

    private final void i() throws IOException {
        FileInputStream fileInputStreamOpenFileInput;
        try {
            try {
                fileInputStreamOpenFileInput = this.e.openFileInput(this.f);
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                    for (int next = 0; next != 1 && next != 2; next = xmlPullParserNewPullParser.next()) {
                    }
                    if (!"historical-records".equals(xmlPullParserNewPullParser.getName())) {
                        throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                    }
                    List list = this.d;
                    list.clear();
                    while (true) {
                        int next2 = xmlPullParserNewPullParser.next();
                        if (next2 == 1) {
                            break;
                        }
                        if (next2 != 3 && next2 != 4) {
                            if (!"historical-record".equals(xmlPullParserNewPullParser.getName())) {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                            list.add(new pz(ComponentName.unflattenFromString(xmlPullParserNewPullParser.getAttributeValue(null, "activity")), Long.parseLong(xmlPullParserNewPullParser.getAttributeValue(null, "time")), Float.parseFloat(xmlPullParserNewPullParser.getAttributeValue(null, "weight"))));
                        }
                    }
                } catch (IOException e) {
                    Log.e(a, "Error reading historical recrod file: " + this.f, e);
                } catch (XmlPullParserException e2) {
                    Log.e(a, "Error reading historical recrod file: " + this.f, e2);
                }
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (FileNotFoundException unused2) {
            }
        } catch (Throwable th) {
            if (fileInputStreamOpenFileInput != null) {
                try {
                    fileInputStreamOpenFileInput.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    private final void j() {
        py pyVar = this.p;
        if (pyVar == null || this.g == null) {
            return;
        }
        List list = this.c;
        if (list.isEmpty()) {
            return;
        }
        List list2 = this.d;
        if (list2.isEmpty()) {
            return;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(list2);
        Map map = pyVar.a;
        map.clear();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            px pxVar = (px) list.get(i);
            pxVar.b = 0.0f;
            ResolveInfo resolveInfo = pxVar.a;
            map.put(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name), pxVar);
        }
        float f = 1.0f;
        for (int size2 = listUnmodifiableList.size() - 1; size2 >= 0; size2--) {
            pz pzVar = (pz) listUnmodifiableList.get(size2);
            px pxVar2 = (px) map.get(pzVar.a);
            if (pxVar2 != null) {
                pxVar2.b += pzVar.c * f;
                f *= 0.95f;
            }
        }
        Collections.sort(list);
    }

    public final int a() {
        int size;
        synchronized (this.b) {
            f();
            size = this.c.size();
        }
        return size;
    }

    public final Intent b(int i) {
        synchronized (this.b) {
            if (this.g == null) {
                return null;
            }
            f();
            ResolveInfo resolveInfo = ((px) this.c.get(i)).a;
            ComponentName componentName = new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            Intent intent = new Intent(this.g);
            intent.setComponent(componentName);
            if (this.j != null) {
                new Intent(intent);
                this.j.a();
            }
            g(new pz(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public final ResolveInfo c(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.b) {
            f();
            resolveInfo = ((px) this.c.get(i)).a;
        }
        return resolveInfo;
    }

    public final ResolveInfo d() {
        synchronized (this.b) {
            f();
            List list = this.c;
            if (list.isEmpty()) {
                return null;
            }
            return ((px) list.get(0)).a;
        }
    }

    public final void f() throws IOException {
        boolean z;
        boolean z2 = true;
        if (!this.i || this.g == null) {
            z = false;
        } else {
            this.i = false;
            List list = this.c;
            list.clear();
            List<ResolveInfo> listQueryIntentActivities = this.e.getPackageManager().queryIntentActivities(this.g, 0);
            int size = listQueryIntentActivities.size();
            for (int i = 0; i < size; i++) {
                list.add(new px(listQueryIntentActivities.get(i)));
            }
            z = true;
        }
        if (this.h && this.o && !TextUtils.isEmpty(this.f)) {
            this.h = false;
            this.n = true;
            i();
        } else {
            z2 = false;
        }
        boolean z3 = z | z2;
        h();
        if (z3) {
            j();
            notifyChanged();
        }
    }

    public final void g(pz pzVar) {
        List list = this.d;
        if (list.add(pzVar)) {
            this.o = true;
            h();
            if (!this.n) {
                throw new IllegalStateException("No preceding call to #readHistoricalData");
            }
            if (this.o) {
                this.o = false;
                String str = this.f;
                if (!TextUtils.isEmpty(str)) {
                    new qb(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(list), str);
                }
            }
            j();
            notifyChanged();
        }
    }
}
