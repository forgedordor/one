package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dicr {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public ejwi b;
    public ejwi c;
    public ejwi d;
    public ejwi e;
    public ejwi f;
    private final Context g;

    public dicr(Context context) {
        ejud ejudVar = ejud.a;
        this.b = ejudVar;
        this.c = ejudVar;
        this.d = ejudVar;
        this.e = ejudVar;
        this.f = ejudVar;
        this.g = context;
    }

    public static final int f(boolean z) {
        return z ? 4866 : 768;
    }

    public final void a() {
        Log.d("SystemUiManager", String.format("#reinstateActivitySystemUi(): activityWindow.isPresent() = %b", Boolean.valueOf(this.c.g())));
        if (!this.c.g()) {
            Log.d("SystemUiManager", "#reinstateActivitySystemUi(): activityWindow not present");
            return;
        }
        if (e()) {
            ((dicq) this.c.c()).g();
            ((dicq) this.c.c()).d();
        }
        ((dicq) this.c.c()).b();
        ((dicq) this.c.c()).e();
    }

    public final void b() {
        Log.d("SystemUiManager", String.format("#reinstatePopupWindowSystemUi(): popupWindow.isPresent() = %b", Boolean.valueOf(this.d.g())));
        if (this.d.g()) {
            if (e()) {
                ((dicq) this.d.c()).g();
                ((dicq) this.d.c()).d();
            }
            ((dicq) this.d.c()).b();
            ((dicq) this.d.c()).e();
        }
    }

    public final void c() {
        Log.d("SystemUiManager", "#reinstateSystemUi()");
        b();
        a();
        ejud ejudVar = ejud.a;
        this.f = ejudVar;
        this.e = ejudVar;
        this.a.set(false);
    }

    public final void d(dicq dicqVar) {
        if (e()) {
            dicqVar.c();
            if (this.e.g()) {
                dicqVar.h();
            }
        }
        dicqVar.a();
        if (this.f.g()) {
            dicqVar.f(((Integer) this.f.c()).intValue());
        }
    }

    public final boolean e() {
        return !dida.a.contains(this.g.getPackageName());
    }
}
