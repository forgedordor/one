package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekvh extends ekvk {
    public static final ekvk a = new ekvh();

    private ekvh() {
    }

    @Override // defpackage.ekvk
    public final ekvi a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.ekte
    public final int b() {
        return 0;
    }

    @Override // defpackage.ekte
    public final Object d(ekrz ekrzVar) {
        ekwr.a(!ekrzVar.b, "metadata key must be single valued");
        return null;
    }

    @Override // defpackage.ekvk
    public final ekvk f(ekvk ekvkVar) {
        return ekvkVar;
    }
}
