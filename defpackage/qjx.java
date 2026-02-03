package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qjx extends pfn {
    public qjx(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pfn
    public final String c() {
        return "UPDATE workspec SET generation=generation+1 WHERE id=?";
    }
}
