package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class axdl extends dqpg {
    public int a;
    public String b;
    public String c;
    public axcm d;
    public axcm e;

    public axdl() {
        super(axer.g());
        this.d = null;
        this.e = null;
    }

    public final axdh a() {
        return b(new Supplier() { // from class: axdj
            @Override // java.util.function.Supplier
            public final Object get() {
                return new axdi();
            }
        });
    }

    public final axdh b(Supplier supplier) {
        try {
            axcm axcmVar = this.d;
            if (axcmVar != null) {
                d(axcmVar);
            }
            axdh axdhVar = (axdh) supplier.get();
            axdhVar.aD(aB());
            axdhVar.a = this.a;
            axdhVar.b = this.b;
            axdhVar.c = this.c;
            axdhVar.d = this.d;
            axdhVar.e = this.e;
            axdhVar.cM = aC();
            return axdhVar;
        } catch (Throwable th) {
            throw new dqod(th);
        }
    }

    public final void c(axcm axcmVar) {
        int i = this.aB;
        if (i < 59450) {
            dqru.x("my_identity_token", i);
        }
        aE(3);
        this.d = axcmVar;
    }

    public final void d(axcm axcmVar) {
        if (this.aB < 60160) {
            return;
        }
        aE(4);
        this.e = axcmVar;
    }

    public final void e(String str) {
        aE(1);
        this.b = str;
    }

    public final void f(int i) {
        aE(0);
        this.a = i;
    }

    public final void g(String str) {
        aE(2);
        this.c = str;
    }
}
