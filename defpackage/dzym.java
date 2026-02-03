package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzym {
    public Context a;
    public ejxr b;
    public ejxr c;
    public ejxr d;
    public ejxr e;
    private ejxr f;

    public final dzyn a() {
        this.a.getClass();
        if (this.b == null) {
            this.b = dzyn.b;
        }
        if (this.c == null) {
            this.c = dzyn.d(this.a);
        }
        if (this.d == null) {
            this.d = new ejxr() { // from class: dzyj
                @Override // defpackage.ejxr
                public final Object get() {
                    return ejwi.j(new eaeg(this.a.b));
                }
            };
        }
        if (this.e == null) {
            Context context = this.a;
            Context context2 = dzyn.a;
            final ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, new ecey(new ecex(context)), new ecfn());
            this.e = ejxx.a(new ejxr() { // from class: dzyg
                @Override // defpackage.ejxr
                public final Object get() {
                    Context context3 = dzyn.a;
                    return new ecev(arrayList);
                }
            });
        }
        if (this.f == null) {
            this.f = new ejxr() { // from class: dzyk
                @Override // defpackage.ejxr
                public final Object get() {
                    Context context3 = this.a.a;
                    Context context4 = dzyn.a;
                    try {
                        return ejwi.j(context3.getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                    } catch (PackageManager.NameNotFoundException unused) {
                        return ejud.a;
                    }
                }
            };
        }
        return new dzyn(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
