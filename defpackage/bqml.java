package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqml extends dqpg {
    public UUID a;
    public MessageIdType b;
    public long c;
    public long d;
    public bvea e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;

    public bqml() {
        super(bqoo.a().M());
        this.a = base.b();
        this.b = bary.a;
    }

    public final bqmh a(Supplier supplier) {
        bqmh bqmhVar = (bqmh) supplier.get();
        bqmhVar.aD(aB());
        bqmhVar.a = this.a;
        bqmhVar.b = this.b;
        bqmhVar.c = this.c;
        bqmhVar.d = this.d;
        bqmhVar.e = this.e;
        bqmhVar.f = this.f;
        bqmhVar.g = this.g;
        bqmhVar.h = this.h;
        bqmhVar.i = this.i;
        bqmhVar.j = this.j;
        bqmhVar.k = this.k;
        bqmhVar.l = this.l;
        bqmhVar.m = this.m;
        bqmhVar.cM = aC();
        return bqmhVar;
    }

    public final void b(String str) {
        aE(7);
        this.h = str;
    }

    public final void c(String str) {
        aE(6);
        this.g = str;
    }

    public final void d(String str) {
        aE(5);
        this.f = str;
    }

    public final void e(String str) {
        aE(12);
        this.m = str;
    }

    public final void f(String str) {
        aE(9);
        this.j = str;
    }

    public final void g(String str) {
        aE(11);
        this.l = str;
    }

    public final void h(UUID uuid) {
        aE(0);
        this.a = uuid;
    }

    public final void i(String str) {
        aE(10);
        this.k = str;
    }

    public final void j(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void k(long j) {
        aE(3);
        this.d = j;
    }

    public final void l(String str) {
        aE(8);
        this.i = str;
    }

    public final void m(long j) {
        aE(2);
        this.c = j;
    }

    public final void n(bvea bveaVar) {
        aE(4);
        this.e = bveaVar;
    }
}
