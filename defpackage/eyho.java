package defpackage;

import android.app.Application;
import android.app.Service;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyho implements eyhx {
    private final Service a;
    private Object b;

    /* compiled from: PG */
    public interface a {
        ahih iC();
    }

    public eyho(Service service) {
        this.a = service;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        if (this.b == null) {
            Service service = this.a;
            Application application = service.getApplication();
            eyhz.a(application instanceof eyhx, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            ahih ahihVarIC = ((a) eygm.a(application, a.class)).iC();
            ahihVarIC.b = service;
            eyij.a(ahihVarIC.b, Service.class);
            this.b = new ahij(ahihVarIC.a, ahihVarIC.b);
        }
        return this.b;
    }
}
