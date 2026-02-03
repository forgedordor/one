package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class exkb {
    public static exka e() {
        exiy exiyVar = new exiy();
        exiyVar.b(0L);
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        if (ekgbVar == null) {
            throw new NullPointerException("Null servicePacketHandles");
        }
        exiyVar.a = ekgbVar;
        return exiyVar;
    }

    public abstract long a();

    public abstract ekgb b();

    public abstract void c();

    public abstract void d();
}
