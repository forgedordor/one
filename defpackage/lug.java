package defpackage;

/* compiled from: PG */
@fcsv
/* loaded from: classes.dex */
public abstract class lug extends lxm implements lxk {
    private final pix a;
    private final lvc b;

    public lug(pjb pjbVar) {
        pjbVar.getClass();
        this.a = pjbVar.U();
        this.b = pjbVar.P();
    }

    private final lxd f(String str, Class cls) throws Exception {
        lvc lvcVar = this.b;
        lvcVar.getClass();
        lwp lwpVarA = luy.a(this.a, lvcVar, str, null);
        lxd lxdVarE = e(cls, lwpVarA.a);
        lxdVarE.fA("androidx.lifecycle.savedstate.vm.tag", lwpVarA);
        return lxdVarE;
    }

    @Override // defpackage.lxk
    public final lxd a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.b != null) {
            return f(canonicalName, cls);
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.lxk
    public final lxd b(Class cls, lyp lypVar) {
        String str = (String) lypVar.a(lxl.d);
        if (str != null) {
            return f(str, cls);
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd c(fddy fddyVar, lyp lypVar) {
        return lxj.a(this, fddyVar, lypVar);
    }

    @Override // defpackage.lxm
    public final void d(lxd lxdVar) throws NoSuchMethodException, SecurityException {
        lvc lvcVar = this.b;
        lvcVar.getClass();
        luy.b(lxdVar, this.a, lvcVar);
    }

    protected abstract lxd e(Class cls, lwn lwnVar);
}
