package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eykh {
    public final ezqs a;

    public eykh(ezqs ezqsVar) {
        this.a = ezqsVar;
    }

    public final /* synthetic */ ezqt a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (ezqt) evsnVarBuild;
    }

    public final void b(ezol ezolVar) {
        ezqs ezqsVar = this.a;
        ezqsVar.copyOnWrite();
        ezqt ezqtVar = (ezqt) ezqsVar.instance;
        ezqt ezqtVar2 = ezqt.a;
        ezqtVar.d = ezolVar;
        ezqtVar.b |= 2;
    }

    public final void c(ezpp ezppVar) {
        ezppVar.getClass();
        ezqs ezqsVar = this.a;
        ezqsVar.copyOnWrite();
        ezqt ezqtVar = (ezqt) ezqsVar.instance;
        ezqt ezqtVar2 = ezqt.a;
        ezqtVar.c = ezppVar;
        ezqtVar.b |= 1;
    }
}
