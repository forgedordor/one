package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efe extends icr implements jfs {
    public ibx a;

    public efe(ibx ibxVar) {
        this.a = ibxVar;
    }

    @Override // defpackage.jfs
    public final /* bridge */ /* synthetic */ Object ec(Object obj) {
        egj egjVar = obj instanceof egj ? (egj) obj : null;
        if (egjVar == null) {
            egjVar = new egj(null);
        }
        int i = edx.b;
        egjVar.c = new edu(this.a);
        return egjVar;
    }
}
