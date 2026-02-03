package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myo {
    public final mdm[] a;
    public final mzd b;
    public final mdr c;

    public myo(mdm... mdmVarArr) {
        mzd mzdVar = new mzd();
        mdr mdrVar = new mdr();
        mdm[] mdmVarArr2 = {mzdVar, mdrVar};
        this.a = mdmVarArr2;
        System.arraycopy(mdmVarArr, 0, mdmVarArr2, 0, 0);
        this.b = mzdVar;
        this.c = mdrVar;
    }
}
