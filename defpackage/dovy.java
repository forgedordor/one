package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dovy extends dovz {
    private final String a;

    public dovy(String str) {
        this.a = str;
    }

    @Override // defpackage.dovz
    public final int a() {
        return R.drawable.quantum_gm_ic_search_vd_theme_24;
    }

    @Override // defpackage.dovz
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dovy) && fdbq.f(this.a, ((dovy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuggestedSearchRow(content=" + this.a + ")";
    }
}
