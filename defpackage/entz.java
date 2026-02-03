package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class entz {
    public final empq a;

    public entz(empq empqVar) {
        this.a = empqVar;
    }

    public final /* synthetic */ emqj a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (emqj) evsnVarBuild;
    }

    public final void b(emps empsVar) {
        empq empqVar = this.a;
        empqVar.copyOnWrite();
        emqj emqjVar = (emqj) empqVar.instance;
        emqj emqjVar2 = emqj.a;
        emqjVar.d = empsVar;
        emqjVar.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
    }

    public final void c(empw empwVar) {
        empq empqVar = this.a;
        empqVar.copyOnWrite();
        emqj emqjVar = (emqj) empqVar.instance;
        emqj emqjVar2 = emqj.a;
        emqjVar.d = empwVar;
        emqjVar.c = 103;
    }

    public final void d(emqa emqaVar) {
        empq empqVar = this.a;
        empqVar.copyOnWrite();
        emqj emqjVar = (emqj) empqVar.instance;
        emqj emqjVar2 = emqj.a;
        emqjVar.d = emqaVar;
        emqjVar.c = 104;
    }

    public final void e(int i) {
        empq empqVar = this.a;
        empqVar.copyOnWrite();
        emqj emqjVar = (emqj) empqVar.instance;
        emqj emqjVar2 = emqj.a;
        emqjVar.b |= 2;
        emqjVar.f = i;
    }

    public final void f(String str) {
        str.getClass();
        empq empqVar = this.a;
        empqVar.copyOnWrite();
        emqj emqjVar = (emqj) empqVar.instance;
        emqj emqjVar2 = emqj.a;
        emqjVar.b |= 8;
        emqjVar.g = str;
    }

    public final void g(emqg emqgVar) {
        empq empqVar = this.a;
        empqVar.copyOnWrite();
        emqj emqjVar = (emqj) empqVar.instance;
        emqj emqjVar2 = emqj.a;
        emqjVar.d = emqgVar;
        emqjVar.c = 105;
    }

    public final void h(int i) {
        empq empqVar = this.a;
        empqVar.copyOnWrite();
        emqj emqjVar = (emqj) empqVar.instance;
        emqj emqjVar2 = emqj.a;
        emqjVar.b |= 1;
        emqjVar.e = i;
    }
}
