package defpackage;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agr extends ajn {
    final ajp a;
    final List b;
    public final String c;
    public final String d;
    public final double e;
    public final List f;
    public final List g;
    final Bundle h;
    private afv i;
    private List j;

    public agr(ajp ajpVar, List list, String str, String str2, double d, List list2, List list3, Bundle bundle) {
        this.a = ajpVar;
        lcg.i(list);
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = d;
        lcg.i(list2);
        this.f = DesugarCollections.unmodifiableList(list2);
        if (list3 != null) {
            this.g = DesugarCollections.unmodifiableList(list3);
        } else {
            this.g = Collections.EMPTY_LIST;
        }
        if (bundle != null) {
            this.h = bundle;
        } else {
            this.h = Bundle.EMPTY;
        }
    }

    public final afv a() {
        if (this.i == null) {
            this.i = new afv(this.a);
        }
        return this.i;
    }

    public final List b() {
        if (this.j == null) {
            List list = this.b;
            this.j = new ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                ago agoVar = (ago) list.get(i);
                afv afvVarA = a();
                lcg.i(afvVarA);
                agoVar.e = afvVarA;
                agq agqVar = agoVar.d;
                lcg.i(afvVarA);
                String str = agoVar.a;
                List list2 = this.j;
                if (list2 != null) {
                    list2.add(agoVar);
                }
            }
            this.j = DesugarCollections.unmodifiableList(this.j);
        }
        List list3 = this.j;
        lcg.i(list3);
        return list3;
    }
}
