package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emny {
    public final emnv a;

    public emny(emnv emnvVar) {
        this.a = emnvVar;
    }

    public final /* synthetic */ emnw a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (emnw) evsnVarBuild;
    }

    public final void b(int i) {
        emnv emnvVar = this.a;
        emnvVar.copyOnWrite();
        emnw emnwVar = (emnw) emnvVar.instance;
        emnw emnwVar2 = emnw.a;
        emnwVar.c = Integer.valueOf(i - 1);
        emnwVar.b = 2;
    }
}
