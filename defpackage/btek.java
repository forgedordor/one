package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btek extends dqpg {
    public Uri a;
    public Uri b;
    public String c;
    public String d;
    public int e;
    public int f;
    public long g;

    public btek() {
        super(btfy.a().M());
    }

    public final btei a() {
        btej btejVar = new btej();
        btejVar.aD(aB());
        btejVar.a = this.a;
        btejVar.b = this.b;
        btejVar.c = this.c;
        btejVar.d = this.d;
        btejVar.e = this.e;
        btejVar.f = this.f;
        btejVar.g = this.g;
        btejVar.cM = aC();
        return btejVar;
    }

    public final void b(Uri uri) {
        aE(1);
        this.b = uri;
    }

    public final void c(String str) {
        aE(2);
        this.c = str;
    }

    public final void d(int i) {
        aE(5);
        this.f = i;
    }

    public final void e(String str) {
        aE(3);
        this.d = str;
    }

    public final void f(Uri uri) {
        aE(0);
        this.a = uri;
    }

    public final void g(int i) {
        aE(4);
        this.e = i;
    }
}
