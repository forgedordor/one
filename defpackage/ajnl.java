package defpackage;

import android.content.SharedPreferences;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajnl implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final cqtq a;
    private final ekhx b;

    public ajnl(ekhx ekhxVar, cqtq cqtqVar) {
        this.b = ekhxVar;
        this.a = cqtqVar;
    }

    final void a() {
        this.a.c(new Supplier() { // from class: ajnk
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "Notify configuration callbacks");
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.b.contains(str)) {
            a();
        }
    }
}
