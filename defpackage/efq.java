package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efq extends icr implements jfs {
    public float a;
    public boolean b;

    public efq(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.jfs
    public final /* bridge */ /* synthetic */ Object ec(Object obj) {
        egj egjVar = obj instanceof egj ? (egj) obj : null;
        if (egjVar == null) {
            egjVar = new egj(null);
        }
        egjVar.a = this.a;
        egjVar.b = this.b;
        return egjVar;
    }
}
