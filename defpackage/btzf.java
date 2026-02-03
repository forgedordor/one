package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btzf extends dqpg {
    public long a;
    public axcm b;
    public String c;
    public Uri d;
    public boolean e;
    public boolean f;
    public long g;

    public btzf() {
        super(buat.f());
        this.b = null;
        this.e = true;
        this.f = false;
        this.g = 0L;
    }

    public final btzd a() {
        btze btzeVar = new btze();
        btzeVar.aD(aB());
        btzeVar.a = this.a;
        btzeVar.b = this.b;
        btzeVar.c = this.c;
        btzeVar.d = this.d;
        btzeVar.e = this.e;
        btzeVar.f = this.f;
        btzeVar.g = this.g;
        btzeVar.cM = aC();
        return btzeVar;
    }

    public final void b(boolean z) {
        aE(5);
        this.f = z;
    }

    public final void c(boolean z) {
        int i = this.aB;
        if (i < 60400) {
            dqru.x("is_self_profile_shareable", i);
        }
        aE(4);
        this.e = z;
    }

    public final void d(String str) {
        aE(2);
        this.c = str;
    }

    public final void e(axcm axcmVar) {
        aE(1);
        this.b = axcmVar;
    }

    public final void f(Uri uri) {
        aE(3);
        this.d = uri;
    }

    public final void g(long j) {
        aE(6);
        this.g = j;
    }
}
