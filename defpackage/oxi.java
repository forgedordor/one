package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class oxi implements fdap {
    public final /* synthetic */ fdap a;
    public final /* synthetic */ oxm b;

    public /* synthetic */ oxi(fdap fdapVar, oxm oxmVar) {
        this.a = fdapVar;
        this.b = oxmVar;
    }

    @Override // defpackage.fdap
    public final Object invoke(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        Object objG = this.b.g(iIntValue);
        return objG == null ? new oxt(iIntValue) : this.a.invoke(objG);
    }
}
