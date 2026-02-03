package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eccs {
    private static final Bundle c = new Bundle();
    public final List a = new ArrayList();
    protected final List b = new ArrayList();
    private eccr d;
    private eccr e;
    private eccr f;
    private eccr g;
    private eccr h;

    public eccs() {
        new HashSet();
        Thread.currentThread().getId();
    }

    public static final String G(ecdj ecdjVar) {
        if (ecdjVar instanceof ecdg) {
            return ecdjVar instanceof ecdk ? ((ecdk) ecdjVar).a() : ecdjVar.getClass().getName();
        }
        return null;
    }

    public static final Bundle H(ecdj ecdjVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String strG = G(ecdjVar);
        return strG != null ? bundle.getBundle(strG) : c;
    }

    public static final void I(ecdj ecdjVar) {
        if (ecdjVar instanceof ecbn) {
            ((ecbn) ecdjVar).a();
        }
    }

    public final void A(Bundle bundle) {
        eccq eccqVar = new eccq(bundle);
        F(eccqVar);
        this.g = eccqVar;
    }

    public final void B() {
        ecco eccoVar = new ecco();
        F(eccoVar);
        this.e = eccoVar;
    }

    public final void C() {
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
            if (ecdjVar instanceof ecdi) {
                ((ecdi) ecdjVar).a();
            }
            i++;
        }
    }

    public final void D(boolean z) {
        if (z) {
            eccr eccrVar = new eccr() { // from class: eccm
                @Override // defpackage.eccr
                public final void a(ecdj ecdjVar) {
                    eccs.I(ecdjVar);
                }
            };
            F(eccrVar);
            this.h = eccrVar;
            return;
        }
        eccr eccrVar2 = this.h;
        int i = 0;
        if (eccrVar2 != null) {
            E(eccrVar2);
            this.h = null;
        }
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            I((ecdj) list.get(i));
            i++;
        }
    }

    public final void E(eccr eccrVar) {
        this.b.remove(eccrVar);
    }

    public final void F(eccr eccrVar) {
        ecem.c();
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                this.b.add(eccrVar);
                return;
            } else {
                eccrVar.a((ecdj) list.get(i));
                i++;
            }
        }
    }

    public final void J() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecct) {
                ((ecct) ecdjVar).a();
            }
            i++;
        }
    }

    public final void K() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof eccu) {
                ((eccu) ecdjVar).a();
            }
            i++;
        }
    }

    public final boolean L() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return false;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if ((ecdjVar instanceof eccv) && ((eccv) ecdjVar).a()) {
                return true;
            }
            i++;
        }
    }

    public final void M() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof eccx) {
                ((eccx) ecdjVar).a();
            }
            i++;
        }
    }

    public final boolean N() {
        int i = 0;
        boolean zA = false;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return zA;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof eccy) {
                zA |= ((eccy) ecdjVar).a();
            }
            i++;
        }
    }

    public final boolean O() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return false;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if ((ecdjVar instanceof ecdb) && ((ecdb) ecdjVar).a()) {
                return true;
            }
            i++;
        }
    }

    public final boolean P() {
        int i = 0;
        boolean zA = false;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return zA;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecdd) {
                zA |= ((ecdd) ecdjVar).a();
            }
            i++;
        }
    }

    public final void Q() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecde) {
                ((ecde) ecdjVar).a();
            }
            i++;
        }
    }

    public void d() {
        eccr eccrVar = this.g;
        if (eccrVar != null) {
            E(eccrVar);
            this.g = null;
        }
        eccr eccrVar2 = this.d;
        int i = 0;
        if (eccrVar2 != null) {
            E(eccrVar2);
            this.d = null;
        }
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            ecdjVar.getClass();
            if (ecdjVar instanceof eccz) {
                ((eccz) ecdjVar).a();
            }
            i++;
        }
    }

    public void f() {
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
            if (ecdjVar instanceof ecdc) {
                ((ecdc) ecdjVar).a();
            }
            i++;
        }
    }

    public final void x(Bundle bundle) {
        eccn eccnVar = new eccn(bundle);
        F(eccnVar);
        this.d = eccnVar;
    }

    public final void y() {
        for (ecdj ecdjVar : this.a) {
            if (ecdjVar instanceof ecda) {
                ((ecda) ecdjVar).a();
            }
        }
    }

    public final void z() {
        eccp eccpVar = new eccp();
        F(eccpVar);
        this.f = eccpVar;
    }
}
