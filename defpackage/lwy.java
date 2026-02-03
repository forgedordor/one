package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwy extends lxm implements lxk {
    private Application a;
    private final lxk b;
    private Bundle c;
    private lvc d;
    private pix e;

    public lwy() {
        this.b = new lxh();
    }

    @Override // defpackage.lxk
    public final lxd a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.lxk
    public final lxd b(Class cls, lyp lypVar) {
        String str = (String) lypVar.a(lxo.a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (lypVar.a(lwu.a) == null || lypVar.a(lwu.b) == null) {
            if (this.d != null) {
                return e(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) lypVar.a(lxh.b);
        boolean zIsAssignableFrom = luh.class.isAssignableFrom(cls);
        Constructor constructorB = (!zIsAssignableFrom || application == null) ? lwz.b(cls, lwz.b) : lwz.b(cls, lwz.a);
        return constructorB == null ? this.b.b(cls, lypVar) : (!zIsAssignableFrom || application == null) ? lwz.a(cls, constructorB, lwu.a(lypVar)) : lwz.a(cls, constructorB, application, lwu.a(lypVar));
    }

    @Override // defpackage.lxk
    public final lxd c(fddy fddyVar, lyp lypVar) {
        return b(fdab.a(fddyVar), lypVar);
    }

    @Override // defpackage.lxm
    public final void d(lxd lxdVar) throws NoSuchMethodException, SecurityException {
        lvc lvcVar = this.d;
        if (lvcVar != null) {
            pix pixVar = this.e;
            pixVar.getClass();
            luy.b(lxdVar, pixVar, lvcVar);
        }
    }

    public final lxd e(String str, Class cls) throws Exception {
        Application application;
        lvc lvcVar = this.d;
        if (lvcVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = luh.class.isAssignableFrom(cls);
        Constructor constructorB = (!zIsAssignableFrom || this.a == null) ? lwz.b(cls, lwz.b) : lwz.b(cls, lwz.a);
        if (constructorB == null) {
            if (this.a != null) {
                return this.b.a(cls);
            }
            if (lxl.c == null) {
                lxl.c = new lxl();
            }
            lxl.c.getClass();
            return lza.a(cls);
        }
        pix pixVar = this.e;
        pixVar.getClass();
        lwp lwpVarA = luy.a(pixVar, lvcVar, str, this.c);
        lxd lxdVarA = (!zIsAssignableFrom || (application = this.a) == null) ? lwz.a(cls, constructorB, lwpVarA.a) : lwz.a(cls, constructorB, application, lwpVarA.a);
        lxdVarA.fA("androidx.lifecycle.savedstate.vm.tag", lwpVarA);
        return lxdVarA;
    }

    public lwy(Application application, pjb pjbVar, Bundle bundle) {
        lxh lxhVar;
        this.e = pjbVar.U();
        this.d = pjbVar.P();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (lxh.a == null) {
                lxh.a = new lxh(application);
            }
            lxhVar = lxh.a;
            lxhVar.getClass();
        } else {
            lxhVar = new lxh();
        }
        this.b = lxhVar;
    }
}
