package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class buzt extends dqpg {
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Uri f;
    public String g;

    public buzt() {
        super(bvaz.b().M());
    }

    public final buzr a() {
        buzs buzsVar = new buzs();
        buzsVar.aD(aB());
        buzsVar.a = this.a;
        buzsVar.b = this.b;
        buzsVar.c = this.c;
        buzsVar.d = this.d;
        buzsVar.e = this.e;
        buzsVar.f = this.f;
        buzsVar.g = this.g;
        buzsVar.cM = aC();
        return buzsVar;
    }

    public final void b(String str) {
        aE(1);
        this.b = str;
    }

    public final void c(String str) {
        aE(3);
        this.d = str;
    }

    public final void d(long j) {
        aE(0);
        this.a = j;
    }

    public final void e(Uri uri) {
        aE(5);
        this.f = uri;
    }

    public final void f(String str) {
        aE(4);
        this.e = str;
    }

    public final void g(String str) {
        aE(2);
        this.c = str;
    }

    public final void h(String str) {
        aE(6);
        this.g = str;
    }
}
