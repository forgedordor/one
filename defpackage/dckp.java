package defpackage;

import android.content.ComponentName;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dckp {
    public final String a;
    public final String b;
    public final ComponentName c;
    public final int d;
    public final boolean e;

    public dckp(ComponentName componentName, int i) {
        this.a = null;
        this.b = null;
        dclh.m(componentName);
        this.c = componentName;
        this.d = i;
        this.e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dckp)) {
            return false;
        }
        dckp dckpVar = (dckp) obj;
        return dclc.a(this.a, dckpVar.a) && dclc.a(this.b, dckpVar.b) && dclc.a(this.c, dckpVar.c) && this.d == dckpVar.d && this.e == dckpVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.c;
        dclh.m(componentName);
        return componentName.flattenToString();
    }

    public dckp(String str, String str2, int i, boolean z) {
        dclh.k(str);
        this.a = str;
        dclh.k(str2);
        this.b = str2;
        this.c = null;
        this.d = i;
        this.e = z;
    }
}
