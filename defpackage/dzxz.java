package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzxz implements dzxw {
    public static dzxz a;
    public final Context b;
    public final ContentObserver c;
    public boolean d;

    public dzxz() {
        this.d = false;
        this.b = null;
        this.c = null;
    }

    static synchronized void c() {
        Context context;
        dzxz dzxzVar = a;
        if (dzxzVar != null && (context = dzxzVar.b) != null && dzxzVar.c != null && dzxzVar.d) {
            context.getContentResolver().unregisterContentObserver(a.c);
        }
        a = null;
    }

    @Override // defpackage.dzxw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        Context context = this.b;
        if (context != null && !dqyw.g(context)) {
            try {
                return (String) dzxu.a(new dzxv() { // from class: dzxx
                    @Override // defpackage.dzxv
                    public final Object a() {
                        Context context2 = this.a.b;
                        context2.getClass();
                        return devd.c(context2.getContentResolver(), str, null);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    public dzxz(Context context) {
        this.d = false;
        this.b = context;
        this.c = new dzxy();
    }
}
