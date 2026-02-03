package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bahx {
    public abstract bahy a();

    public abstract elha b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract String e();

    public abstract void f(int i);

    public abstract void g(long j);

    public abstract void h(long j);

    public abstract void i(int i);

    public abstract void j(long j);

    public abstract void k(boolean z);

    public abstract void l(bvdy bvdyVar);

    public abstract void m(boolean z);

    public abstract void n(elha elhaVar);

    public abstract void o(long j);

    public abstract void p(int i);

    public final bahy q() {
        elha elhaVarB = b();
        k(((Boolean) c().orElse(Boolean.valueOf(elhaVarB == elha.FILE_CHOOSER))).booleanValue());
        Boolean bool = (Boolean) d().orElse(Boolean.valueOf(elhaVarB == elha.CAMERA || elhaVarB == elha.MINI_CAMERA || elhaVarB == elha.FULLSCREEN_CAMERA));
        m(bool.booleanValue());
        String strE = e();
        ejwl.m(!bool.booleanValue() || le.m(strE) || le.z(strE), "saveToExternalStorageValue but part is not image or video: ".concat(String.valueOf(strE)));
        return a();
    }
}
