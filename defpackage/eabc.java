package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eabc<T> implements eaci<T> {
    public final String a;
    public final String b;
    public final eadc c;

    public eabc(String str, String str2, eadc eadcVar) {
        this.a = str;
        this.b = str2;
        this.c = eadcVar;
    }

    protected abstract Object a(Object obj);

    protected abstract Object b(String str);

    protected Object d() {
        return null;
    }

    protected abstract Object e(dzyn dzynVar);

    protected boolean g() {
        return false;
    }

    @Override // defpackage.eaci
    public final Object gX(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        Object objE = e(dzyn.a(applicationContext));
        objE.getClass();
        return objE;
    }

    protected final Object gY(String str) {
        try {
            return b(str);
        } catch (IOException | IllegalArgumentException e) {
            Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e);
            return null;
        }
    }

    @Override // defpackage.eaci, defpackage.ejxr
    public final T get() {
        Context context = dzyn.a;
        dzyp.b = true;
        if (dzyp.c == null) {
            dzyp.c = new dzyo();
        }
        Context context2 = dzyn.a;
        if (context2 == null) {
            dzyp.a();
            throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
        }
        T t = (T) e(dzyn.a(context2));
        t.getClass();
        return t;
    }
}
