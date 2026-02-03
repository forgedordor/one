package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmoy extends dqpg {
    public String a;
    public String b;
    public bmra c;
    public bmqz d;
    public emcn e;
    public int f;
    public String g;
    public byiv h;
    public int i;
    public int j;
    public String k;

    public bmoy() {
        super(bmqy.e());
        this.e = emcn.b(0);
        this.f = -1;
        this.g = "-1";
        this.j = -1;
        this.k = "-1";
    }

    public final bmou a() {
        return b(new Supplier() { // from class: bmox
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bmov();
            }
        });
    }

    public final bmou b(Supplier supplier) {
        bmou bmouVar = (bmou) supplier.get();
        bmouVar.aD(aB());
        bmouVar.a = this.a;
        bmouVar.b = this.b;
        bmouVar.c = this.c;
        bmouVar.d = this.d;
        bmouVar.e = this.e;
        bmouVar.f = this.f;
        bmouVar.g = this.g;
        bmouVar.h = this.h;
        bmouVar.i = this.i;
        bmouVar.j = this.j;
        bmouVar.k = this.k;
        bmouVar.cM = aC();
        return bmouVar;
    }

    public final void c(bmqz bmqzVar) {
        aE(3);
        this.d = bmqzVar;
    }

    public final void d(String str) {
        int i = this.aB;
        if (i < 57090) {
            dqru.x("backup_dependency_bugle_id", i);
        }
        aE(10);
        this.k = str;
    }

    public final void e(int i) {
        int i2 = this.aB;
        if (i2 < 57090) {
            dqru.x("backup_dependency_table_type", i2);
        }
        aE(9);
        this.j = i;
    }

    public final void f(int i) {
        int i2 = this.aB;
        if (i2 < 57090) {
            dqru.x("backup_flags", i2);
        }
        aE(8);
        this.i = i;
    }

    public final void g(String str) {
        int i = this.aB;
        if (i < 57090) {
            dqru.x("bugle_id", i);
        }
        aE(6);
        this.g = str;
    }

    public final void h(int i) {
        int i2 = this.aB;
        if (i2 < 57090) {
            dqru.x("bugle_table_type", i2);
        }
        aE(5);
        this.f = i;
    }

    public final void i(byiv byivVar) {
        int i = this.aB;
        if (i < 57090) {
            dqru.x("cms_backup_parameters", i);
        }
        aE(7);
        this.h = byivVar;
    }

    public final void j(bmra bmraVar) {
        aE(2);
        this.c = bmraVar;
    }

    public final void k(String str) {
        aE(1);
        this.b = str;
    }

    public final void l(emcn emcnVar) {
        aE(4);
        this.e = emcnVar;
    }
}
