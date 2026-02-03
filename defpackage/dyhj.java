package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dyhj {
    public abstract dyhk a();

    public abstract void b(int i);

    public abstract void c(boolean z);

    public final dyhk d() {
        dyhk dyhkVarA = a();
        dyfb dyfbVar = (dyfb) dyhkVarA;
        ejwl.m((dyfbVar.b != -1) ^ (dyfbVar.a != null), "Either icon id or icon drawable must be specified");
        return dyhkVarA;
    }
}
