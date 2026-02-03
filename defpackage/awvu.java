package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class awvu extends dqpg {
    public axcm a;
    public axcm b;
    public String c;
    public boolean d;
    public awxl e;
    public String f;
    public String g;

    public awvu() {
        super(awxh.e());
        this.a = null;
        this.b = null;
        this.d = false;
    }

    public final awvq a() {
        return b(new Supplier() { // from class: awvt
            @Override // java.util.function.Supplier
            public final Object get() {
                return new awvr();
            }
        });
    }

    public final awvq b(Supplier supplier) {
        awvq awvqVar = (awvq) supplier.get();
        awvqVar.aD(aB());
        awvqVar.a = this.a;
        awvqVar.b = this.b;
        awvqVar.c = this.c;
        awvqVar.d = this.d;
        awvqVar.e = this.e;
        awvqVar.f = this.f;
        awvqVar.g = this.g;
        awvqVar.cM = aC();
        return awvqVar;
    }

    public final void c(String str) {
        aE(5);
        this.f = str;
    }

    public final void d(awxl awxlVar) {
        if (this.aB < 59980) {
            return;
        }
        aE(4);
        this.e = awxlVar;
    }

    public final void e(axcm axcmVar) {
        int i = this.aB;
        if (i < 60530) {
            dqru.x("canonical_token", i);
        }
        aE(1);
        this.b = axcmVar;
    }

    public final void f(String str) {
        int i = this.aB;
        if (i < 60120) {
            dqru.x("display_name", i);
        }
        aE(6);
        this.g = str;
    }

    public final void g(boolean z) {
        int i = this.aB;
        if (i < 60810) {
            dqru.x("is_verified_v2", i);
        }
        aE(3);
        this.d = z;
    }

    public final void h(String str) {
        int i = this.aB;
        if (i < 60810) {
            dqru.x("provisioning_id_v2", i);
        }
        aE(2);
        this.c = str;
    }

    public final void i(axcm axcmVar) {
        aE(0);
        this.a = axcmVar;
    }
}
