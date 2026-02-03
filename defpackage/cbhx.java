package defpackage;

import j$.util.Optional;
import java.util.Date;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cbhx extends dqpg {
    public String a;
    public Optional b;
    public Date c;
    public Date d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    public cbhx() {
        super(cbjq.d());
        this.b = basg.a;
        Date date = barp.a;
        this.c = date;
        this.d = date;
    }

    public final cbht a(Supplier supplier) {
        cbht cbhtVar = (cbht) supplier.get();
        cbhtVar.aD(aB());
        cbhtVar.a = this.a;
        cbhtVar.b = this.b;
        cbhtVar.c = this.c;
        cbhtVar.d = this.d;
        cbhtVar.e = this.e;
        cbhtVar.f = this.f;
        cbhtVar.g = this.g;
        cbhtVar.h = this.h;
        cbhtVar.i = this.i;
        cbhtVar.cM = aC();
        return cbhtVar;
    }

    public final void b(Date date) {
        aE(3);
        this.d = date;
    }

    public final void c(String str) {
        aE(0);
        this.a = str;
    }

    public final void d(boolean z) {
        aE(7);
        this.h = z;
    }

    public final void e(boolean z) {
        aE(5);
        this.f = z;
    }

    public final void f(boolean z) {
        aE(6);
        this.g = z;
    }

    public final void g(int i) {
        aE(4);
        this.e = i;
    }

    public final void h(boolean z) {
        aE(8);
        this.i = z;
    }

    public final void i(Date date) {
        aE(2);
        this.c = date;
    }

    public final void j(Optional optional) {
        aE(1);
        this.b = optional;
    }
}
