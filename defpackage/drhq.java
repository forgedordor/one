package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drhq implements Parcelable {
    public static final Parcelable.Creator<drhq> CREATOR = new drhp();
    public final Bundle a;
    public final List b;
    private List c = new ArrayList();

    public drhq() {
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putString("m.v", "3");
        this.b = new ArrayList();
    }

    public static boolean b(int i, long j) {
        return i == 0 && j < 1500;
    }

    private final void g(String str, boolean z) {
        if (z) {
            this.a.putString(str, "1");
        } else {
            this.a.remove(str);
        }
    }

    private final void h(String str, long j) {
        if (j < 0) {
            this.a.remove(str);
        } else {
            this.a.putLong(str, j);
        }
    }

    public final Uri a(boolean z) {
        Uri.Builder builder = new Uri.Builder();
        h("m.lt", System.currentTimeMillis() / 1000);
        Bundle bundle = this.a;
        for (String str : bundle.keySet()) {
            if (z || !this.c.contains(str)) {
                Object obj = bundle.get(str);
                if (obj instanceof List) {
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        builder.appendQueryParameter(str, String.valueOf(it.next()));
                    }
                } else if (obj != null) {
                    builder.appendQueryParameter(str, obj.toString());
                }
            }
        }
        if ("o".equals(bundle.getString("t"))) {
            builder.appendQueryParameter("m.sh", "close");
        }
        builder.appendQueryParameter("d", "1");
        return builder.build();
    }

    public final void c(String str) {
        f("t", str);
    }

    public final void d(int i, etdj etdjVar, erwu erwuVar) {
        long j = (etdjVar.b & 2) != 0 ? etdjVar.e : -1L;
        Bundle bundle = this.a;
        bundle.remove(a.g(i, "m.sc-"));
        bundle.remove(a.g(i, "m.d-"));
        if (b(i, j)) {
            Log.d("HatsLibAnswerBeacon", a.A(j, "First question delay ", " is considered spammy."));
            h(a.g(i, "m.sc-"), j);
        } else {
            h(a.g(i, "m.d-"), j);
        }
        evsx evsxVar = erwuVar.h;
        if (evsxVar.isEmpty()) {
            f(a.g(i, "r.o-"), null);
        } else {
            f(a.g(i, "r.o-"), TextUtils.join(".", evsxVar));
        }
        g(a.g(i, "r.t-"), etdjVar.f);
        evtg evtgVar = etdjVar.d;
        int iB = erxc.b(erwuVar.d);
        if (iB != 0 && iB == 5) {
            this.c.add(a.g(i, "r.r-"));
        }
        bundle.putStringArrayList(a.g(i, "r.r-"), new ArrayList<>(evtgVar));
        if ((etdjVar.b & 16) != 0) {
            String str = etdjVar.g;
            if (Log.isLoggable("HatsLibAnswerBeacon", 3)) {
                Log.d("HatsLibAnswerBeacon", "Setting piped answer in beacon. Question Index: " + i + ", PipedAnswer candidate: " + str);
            }
            f(a.g(i, "m.pa-"), str);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i) {
        g(a.g(i, "r.s-"), true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof drhq)) {
            return false;
        }
        Bundle bundle = this.a;
        Bundle bundle2 = ((drhq) obj).a;
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = bundle.get(str);
            Object obj3 = bundle2.get(str);
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    public final void f(String str, String str2) {
        if (str2 == null) {
            this.a.remove(str);
        } else {
            this.a.putString(str, str2);
        }
    }

    public final int hashCode() {
        return this.a.keySet().hashCode();
    }

    public final String toString() {
        return "AnswerBeacon{" + a(true).toString().replace("&", "\n") + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
        List list = this.b;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeByteArray(((etdj) it.next()).toByteArray());
        }
    }

    public drhq(Parcel parcel) {
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        this.a = bundle;
        if (bundle != null) {
            int i = parcel.readInt();
            this.b = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.b.add((etdj) drhy.a(etdj.a, parcel.createByteArray()));
            }
            return;
        }
        throw new NullPointerException("Parcel did not contain required Bundle while unparceling an AnswerBeacon.");
    }
}
