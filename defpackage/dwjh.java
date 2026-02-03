package defpackage;

import android.os.Parcelable;
import java.io.Serializable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwjh implements Serializable, Parcelable {
    private final dwpk h(String str) {
        dwip dwipVar = new dwip();
        dwipVar.c(str);
        dwipVar.e(dwpj.DEVICE_ID);
        dwipVar.d(c());
        return dwipVar.a();
    }

    private final dwpk i(String str) {
        dwip dwipVar = new dwip();
        dwipVar.c(str);
        dwipVar.e(dwpj.EMAIL);
        dwipVar.d(c());
        return dwipVar.a();
    }

    public abstract ejwi a();

    public abstract ejwi b();

    public abstract String c();

    public abstract Set d();

    public final dwpk e(String str) {
        dwip dwipVar = new dwip();
        dwipVar.c(str);
        dwipVar.e(dwpj.PHONE_NUMBER);
        dwipVar.d(c());
        return dwipVar.a();
    }

    public final dwpk f() {
        return b().g() ? i((String) b().c()) : a().g() ? h((String) a().c()) : e((String) d().iterator().next());
    }

    public final ekgb g() {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        if (b().g()) {
            ekfwVar.h(i((String) b().c()));
        }
        if (a().g()) {
            ekfwVar.h(h((String) a().c()));
        }
        ekfwVar.j(ekeh.d(d()).f(new ejvr() { // from class: dwjf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return this.a.e((String) obj);
            }
        }));
        return ekfwVar.g();
    }
}
