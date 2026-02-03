package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dovx extends dovz {
    private final String a;

    public dovx(String str) {
        this.a = str;
    }

    @Override // defpackage.dovz
    public final int a() {
        return R.drawable.quantum_gm_ic_history_vd_theme_24;
    }

    @Override // defpackage.dovz
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dovx) && fdbq.f(this.a, ((dovx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RecentSearchRow(content=" + this.a + ")";
    }
}
