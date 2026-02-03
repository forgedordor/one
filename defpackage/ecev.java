package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecev {
    public final Map a;
    public final Map b;
    public final List c;

    public ecev(List list) {
        this(list, Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    private static final Uri k(Uri uri) {
        return uri.buildUpon().fragment(null).build();
    }

    private final eceq l(Uri uri) throws ecgh {
        ekgb ekgbVarN = n(uri);
        ecep ecepVar = new ecep();
        ecepVar.a = this;
        ecepVar.b = m(uri.getScheme());
        ecepVar.d = this.c;
        ecepVar.c = ekgbVarN;
        ecepVar.e = uri;
        if (!ekgbVarN.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str = (String) arrayList.get(arrayList.size() - 1);
                ListIterator<E> listIterator = ekgbVarN.listIterator(ekgbVarN.size());
                while (listIterator.hasPrevious()) {
                    ((echu) listIterator.previous()).f();
                }
                arrayList.set(arrayList.size() - 1, str);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        ecepVar.f = uri;
        return new eceq(ecepVar);
    }

    private final echo m(String str) throws ecgh {
        echo echoVar = (echo) this.a.get(str);
        if (echoVar != null) {
            return echoVar;
        }
        throw new ecgh(String.format("Requested backend isn't registered: %s", str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ekgb n(Uri uri) throws ecgh {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Pattern pattern = ecgp.a;
        ekfw ekfwVar2 = new ekfw();
        String encodedFragment = uri.getEncodedFragment();
        ekgb ekgbVarJ = (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? ekoe.a : ekgb.j(ejxk.d("+").a().g(encodedFragment.substring(10)));
        int size = ekgbVarJ.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) ekgbVarJ.get(i2);
            Matcher matcher = ecgp.a.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
            ekfwVar2.h(matcher.group(1));
        }
        ekgb ekgbVarG = ekfwVar2.g();
        int i3 = ((ekoe) ekgbVarG).c;
        for (int i4 = 0; i4 < i3; i4++) {
            String str2 = (String) ekgbVarG.get(i4);
            echu echuVar = (echu) this.b.get(str2);
            if (echuVar == null) {
                throw new ecgh("Requested transform isn't registered: " + str2 + ": " + String.valueOf(uri));
            }
            ekfwVar.h(echuVar);
        }
        return ekfwVar.g().a();
    }

    public final long a(Uri uri) throws ecgh {
        eceq eceqVarL = l(uri);
        return eceqVarL.b.a(eceqVarL.f);
    }

    public final Iterable b(Uri uri) throws ecgh {
        echo echoVarM = m(uri.getScheme());
        ekgb ekgbVarN = n(uri);
        ArrayList arrayList = new ArrayList();
        String encodedFragment = uri.getEncodedFragment();
        Iterator it = echoVarM.h(k(uri)).iterator();
        while (it.hasNext()) {
            Uri uriBuild = ((Uri) it.next()).buildUpon().encodedFragment(encodedFragment).build();
            if (!ekgbVarN.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(uriBuild.getPathSegments());
                if (!arrayList2.isEmpty() && !uriBuild.getPath().endsWith("/")) {
                    String str = (String) ekis.j(arrayList2);
                    Iterator<E> it2 = ekgbVarN.iterator();
                    while (it2.hasNext()) {
                        ((echu) it2.next()).e();
                    }
                    arrayList2.set(arrayList2.size() - 1, str);
                    uriBuild = uriBuild.buildUpon().path(TextUtils.join("/", arrayList2)).build();
                }
            }
            arrayList.add(uriBuild);
        }
        return arrayList;
    }

    public final Object c(Uri uri, ecer ecerVar) {
        return ecerVar.a(l(uri));
    }

    public final void d(Uri uri) {
        m(uri.getScheme()).j(k(uri));
    }

    public final void e(Uri uri) {
        m(uri.getScheme()).k(k(uri));
    }

    public final void f(Uri uri) throws ecgh {
        eceq eceqVarL = l(uri);
        eceqVarL.b.l(eceqVarL.f);
    }

    public final void g(Uri uri, Uri uri2) throws ecgh {
        eceq eceqVarL = l(uri);
        echo echoVar = eceqVarL.b;
        eceq eceqVarL2 = l(uri2);
        if (echoVar != eceqVarL2.b) {
            throw new ecgh("Cannot rename file across backends");
        }
        echoVar.m(eceqVarL.f, eceqVarL2.f);
    }

    public final boolean h(Uri uri) throws ecgh {
        eceq eceqVarL = l(uri);
        return eceqVarL.b.n(eceqVarL.f);
    }

    public final boolean i(Uri uri) {
        return m(uri.getScheme()).o(k(uri));
    }

    @Deprecated
    public final void j(Uri uri) throws ecgh {
        if (h(uri)) {
            if (!i(uri)) {
                f(uri);
                return;
            }
            Iterator it = b(uri).iterator();
            while (it.hasNext()) {
                j((Uri) it.next());
            }
            e(uri);
        }
    }

    public ecev(List list, List list2, List list3) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            echo echoVar = (echo) it.next();
            if (TextUtils.isEmpty(echoVar.i())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                echo echoVar2 = (echo) this.a.put(echoVar.i(), echoVar);
                if (echoVar2 != null) {
                    throw new IllegalArgumentException("Cannot override Backend " + echoVar2.getClass().getCanonicalName() + " with " + echoVar.getClass().getCanonicalName());
                }
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            echu echuVar = (echu) it2.next();
            if (TextUtils.isEmpty(echuVar.c())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                echu echuVar2 = (echu) this.b.put(echuVar.c(), echuVar);
                if (echuVar2 != null) {
                    throw new IllegalArgumentException("Cannot to override Transform " + echuVar2.getClass().getCanonicalName() + " with " + echuVar.getClass().getCanonicalName());
                }
            }
        }
        this.c.addAll(list3);
    }
}
