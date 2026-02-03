package defpackage;

import com.google.android.libraries.abuse.hades.tartarus.runtime.Data;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhtq {
    final /* synthetic */ Data a;

    public dhtq(Data data) {
        this.a = data;
    }

    public final void a(String str, int i) {
        this.a.putInteger(str, i);
    }

    public final void b(String str, dhrp dhrpVar) {
        this.a.putData(str, dhtr.a(dhrpVar));
    }

    public final void c(String str, String str2) {
        this.a.putString(str, str2);
    }

    public final void d(String str, List list) {
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        for (Object objA : list) {
            if (objA instanceof dhrp) {
                objA = dhtr.a((dhrp) objA);
            }
            arrayList.add(objA);
        }
        this.a.putList(str, arrayList);
    }

    public final void e(String str, boolean z) {
        this.a.putBoolean(str, z);
    }
}
