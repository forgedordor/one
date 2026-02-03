package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ecbw extends eccs {
    private eccr c;
    private eccr d;
    private eccr e;
    private eccr f;

    public final void a() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecav) {
                ((ecav) ecdjVar).a();
            }
            i++;
        }
    }

    public final void b() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecaw) {
                ((ecaw) ecdjVar).a();
            }
            i++;
        }
    }

    public final void c() {
        ecbv ecbvVar = new ecbv();
        F(ecbvVar);
        this.f = ecbvVar;
    }

    @Override // defpackage.eccs
    public final void d() {
        eccr eccrVar = this.d;
        if (eccrVar != null) {
            E(eccrVar);
            this.d = null;
        }
        eccr eccrVar2 = this.c;
        if (eccrVar2 != null) {
            E(eccrVar2);
            this.c = null;
        }
        super.d();
    }

    public final void e() {
        eccr eccrVar = this.f;
        int i = 0;
        if (eccrVar != null) {
            E(eccrVar);
            this.f = null;
        }
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            ecdjVar.getClass();
            if (ecdjVar instanceof ecbc) {
                ((ecbc) ecdjVar).a();
            }
            i++;
        }
    }

    @Override // defpackage.eccs
    public final void f() {
        eccr eccrVar = this.e;
        if (eccrVar != null) {
            E(eccrVar);
            this.e = null;
        }
        super.f();
    }

    public final void g(Bundle bundle) {
        ecbs ecbsVar = new ecbs(bundle);
        F(ecbsVar);
        this.c = ecbsVar;
    }

    public final void h() {
        ecbu ecbuVar = new ecbu();
        F(ecbuVar);
        this.e = ecbuVar;
    }

    public final void i(Bundle bundle) {
        ecbt ecbtVar = new ecbt(bundle);
        F(ecbtVar);
        this.d = ecbtVar;
    }

    public final void j() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecbo) {
                ((ecbo) ecdjVar).a();
            }
            i++;
        }
    }

    public final void k() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecbp) {
                ((ecbp) ecdjVar).a();
            }
            i++;
        }
    }

    public final boolean l() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return false;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if ((ecdjVar instanceof ecbb) && ((ecbb) ecdjVar).a()) {
                return true;
            }
            i++;
        }
    }

    public final boolean m() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return false;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if ((ecdjVar instanceof ecau) && ((ecau) ecdjVar).a()) {
                return true;
            }
            i++;
        }
    }

    public final void n() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecaz) {
                ((ecaz) ecdjVar).a();
            }
            i++;
        }
    }

    public final void o(Consumer consumer) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                consumer.z(Collections.EMPTY_LIST);
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecbd) {
                ((ecbd) ecdjVar).a();
                return;
            }
            i++;
        }
    }

    public final boolean p() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return false;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if ((ecdjVar instanceof ecbe) && ((ecbe) ecdjVar).a()) {
                return true;
            }
            i++;
        }
    }

    public final boolean q() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return false;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if ((ecdjVar instanceof ecbf) && ((ecbf) ecdjVar).a()) {
                return true;
            }
            i++;
        }
    }

    public final void r() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecbg) {
                ((ecbg) ecdjVar).a();
            }
            i++;
        }
    }

    public final void s() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecbh) {
                ((ecbh) ecdjVar).a();
                return;
            }
            i++;
        }
    }

    public final void t() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecbk) {
                ((ecbk) ecdjVar).a();
            }
            i++;
        }
    }

    public final void u() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecbl) {
                ((ecbl) ecdjVar).a();
            }
            i++;
        }
    }

    public final void v() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecbq) {
                ((ecbq) ecdjVar).a();
            }
            i++;
        }
    }

    public final void w() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecbr) {
                ((ecbr) ecdjVar).a();
            }
            i++;
        }
    }
}
