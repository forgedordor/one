package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cgkt {
    public static cgkr t() {
        cggx cggxVar = new cggx();
        cggxVar.b(cgks.BASIC_STYLE);
        cggxVar.b = Optional.empty();
        cggxVar.c = Optional.empty();
        cggxVar.m = Optional.empty();
        cggxVar.o = Optional.empty();
        cggxVar.n = Optional.empty();
        cggxVar.f = Optional.empty();
        cggxVar.l = Optional.empty();
        cggxVar.i = Optional.empty();
        cggxVar.d = Optional.empty();
        cggxVar.e = Optional.empty();
        cggxVar.j = Optional.empty();
        cggxVar.h = Optional.empty();
        cggxVar.k = Optional.empty();
        cggxVar.g = Optional.empty();
        return cggxVar;
    }

    public static cgkr u(cglt cgltVar, List list, CharSequence charSequence, Boolean bool) {
        cggx cggxVar = new cggx();
        cggxVar.b(cgks.MESSAGING_STYLE);
        cggxVar.b = Optional.empty();
        cggxVar.c = Optional.empty();
        cggxVar.i = Optional.of(cgltVar);
        cggxVar.g = Optional.of(ekgb.n(list));
        cggxVar.l = Optional.empty();
        cggxVar.o = Optional.empty();
        cggxVar.f = Optional.empty();
        cggxVar.p = Optional.empty();
        cggxVar.n = Optional.empty();
        cggxVar.d = Optional.empty();
        cggxVar.e = Optional.empty();
        cggxVar.j = Optional.of(charSequence);
        cggxVar.h = Optional.empty();
        cggxVar.k = Optional.of(bool);
        cggxVar.m = Optional.empty();
        return cggxVar;
    }

    public abstract int a();

    public abstract IconCompat b();

    public abstract cgks c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract Optional i();

    public abstract Optional j();

    public abstract Optional k();

    public abstract Optional l();

    public abstract Optional m();

    public abstract Optional n();

    public abstract Optional o();

    public abstract Optional p();

    public abstract Optional q();

    public abstract Optional r();

    public abstract CharSequence s();
}
