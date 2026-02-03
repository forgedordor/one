package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehb extends icr implements jfs {
    public icc a;

    public ehb(icc iccVar) {
        this.a = iccVar;
    }

    @Override // defpackage.jfs
    public final /* bridge */ /* synthetic */ Object ec(Object obj) {
        egj egjVar = obj instanceof egj ? (egj) obj : null;
        if (egjVar == null) {
            egjVar = new egj(null);
        }
        int i = edx.b;
        egjVar.c = new edw(this.a);
        return egjVar;
    }
}
