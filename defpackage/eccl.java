package defpackage;

import android.os.Bundle;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eccl extends eccs {
    private eccr c;
    private eccr d;
    private eccr e;
    private eccr f;
    private eccr g;
    private eccr h;

    public static final void i(ecdj ecdjVar) {
        if (ecdjVar instanceof eccd) {
            ((eccd) ecdjVar).a();
        }
    }

    public final void a(Bundle bundle) {
        eccg eccgVar = new eccg(bundle);
        F(eccgVar);
        this.d = eccgVar;
    }

    public final void b() {
        eccr eccrVar = this.e;
        int i = 0;
        if (eccrVar != null) {
            E(eccrVar);
            this.e = null;
        }
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            ecdjVar.getClass();
            if (ecdjVar instanceof ecbz) {
                ((ecbz) ecdjVar).a();
            }
            i++;
        }
    }

    public final void c() {
        eccr eccrVar = this.c;
        int i = 0;
        if (eccrVar != null) {
            E(eccrVar);
            this.c = null;
        }
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            ecdjVar.getClass();
            if (ecdjVar instanceof ecca) {
                ((ecca) ecdjVar).a();
            }
            i++;
        }
    }

    @Override // defpackage.eccs
    public final void d() {
        super.d();
        eccr eccrVar = this.d;
        if (eccrVar != null) {
            E(eccrVar);
            this.d = null;
        }
        eccr eccrVar2 = this.f;
        if (eccrVar2 != null) {
            E(eccrVar2);
            this.f = null;
        }
        eccr eccrVar3 = this.h;
        if (eccrVar3 != null) {
            E(eccrVar3);
            this.h = null;
        }
    }

    public final void e() {
        if (this.h != null) {
            return;
        }
        ecck ecckVar = new ecck();
        F(ecckVar);
        this.h = ecckVar;
    }

    public final void g(Bundle bundle) {
        ecci ecciVar = new ecci(bundle);
        F(ecciVar);
        this.f = ecciVar;
    }

    public final void h(boolean z) {
        eccr eccrVar = this.g;
        if (eccrVar != null) {
            E(eccrVar);
            this.g = null;
        }
        if (!z) {
            ecch ecchVar = new ecch();
            F(ecchVar);
            this.g = ecchVar;
        } else {
            int i = 0;
            while (true) {
                List list = this.a;
                if (i >= list.size()) {
                    return;
                }
                i((ecdj) list.get(i));
                i++;
            }
        }
    }

    public final void j() {
        eccf eccfVar = new eccf();
        F(eccfVar);
        this.c = eccfVar;
    }

    public final void k(Bundle bundle) {
        eccj eccjVar = new eccj(bundle);
        F(eccjVar);
        this.e = eccjVar;
    }
}
