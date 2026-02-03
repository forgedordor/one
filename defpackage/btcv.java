package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btcv extends dqpg {
    public String a;
    public Uri b;
    public String c;
    public int d;
    public int e;
    public long f;

    public btcv() {
        super(btee.a().M());
    }

    public final btct a() {
        btcu btcuVar = new btcu();
        btcuVar.aD(aB());
        btcuVar.a = this.a;
        btcuVar.b = this.b;
        btcuVar.c = this.c;
        btcuVar.d = this.d;
        btcuVar.e = this.e;
        btcuVar.f = this.f;
        btcuVar.cM = aC();
        return btcuVar;
    }

    public final void b(String str) {
        aE(2);
        this.c = str;
    }

    public final void c(Uri uri) {
        aE(1);
        this.b = uri;
    }

    public final void d(int i) {
        aE(4);
        this.e = i;
    }

    public final void e(long j) {
        aE(5);
        this.f = j;
    }

    public final void f(String str) {
        aE(0);
        this.a = str;
    }

    public final void g(int i) {
        aE(3);
        this.d = i;
    }
}
