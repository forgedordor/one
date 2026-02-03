package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eabz extends eabc implements eabm {
    private volatile int d;
    private eadn e;

    public eabz(String str, String str2, eadc eadcVar) {
        super(str, str2, eadcVar);
        this.d = -1;
    }

    @Override // defpackage.eabm
    public final int c() {
        return this.d;
    }

    @Override // defpackage.eabc
    protected final Object e(final dzyn dzynVar) {
        eadb eadbVarA;
        Object objGY;
        Object obj;
        int iC = c();
        if (iC == -1 || iC < f().a()) {
            synchronized (this) {
                int iC2 = c();
                Object objA = null;
                if (iC2 == -1) {
                    dzyn.g();
                    dzynVar.getClass();
                    eadbVarA = this.c.a(dzynVar);
                    k(eadbVarA.i);
                } else {
                    eadbVarA = null;
                }
                int iA = f().a();
                if (iC2 < iA) {
                    dzyn.g();
                    dzynVar.getClass();
                    Context context = dzynVar.d;
                    ejwi ejwiVarA = dzya.a(context);
                    if (ejwiVarA.g()) {
                        String strA = ((dzxt) ejwiVarA.c()).a(dzyc.a(this.a), null, null, this.b);
                        objGY = strA == null ? null : gY(strA);
                    }
                    if (eadbVarA == null) {
                        eadbVarA = this.c.a(dzynVar);
                    }
                    final String str = eadbVarA.d;
                    if (!context.getPackageName().equals("com.android.vending")) {
                        eadw.a(dzynVar.e().submit(new Runnable() { // from class: eadj
                            @Override // java.lang.Runnable
                            public final void run() {
                                Map mapA = eadk.a(dzynVar.d);
                                String str2 = str;
                                if (mapA.containsKey(str2)) {
                                    return;
                                }
                                Log.e("FilePhenotypeFlags", a.a(str2, "Config package ", " cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags."));
                            }
                        }));
                    }
                    boolean zG = g();
                    String str2 = this.b;
                    if (zG) {
                        eaez eaezVarA = eadbVarA.a();
                        obj = eaezVarA.d.contains(str2) ? eaezVarA.e.get(str2) : null;
                    } else {
                        obj = eadbVarA.a().e.get(str2);
                    }
                    if (obj != null) {
                        try {
                            objA = a(obj);
                        } catch (IOException | ClassCastException e) {
                            Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e);
                        }
                    }
                    if (true != ejwiVarA.g()) {
                        objGY = objA;
                    }
                    if (objGY == null) {
                        objGY = d();
                    }
                    if (objGY != null) {
                        i(objGY);
                        j(iA);
                    }
                    return objGY;
                }
            }
        }
        return h();
    }

    @Override // defpackage.eabm
    public final eadn f() {
        return this.e;
    }

    @Override // defpackage.eabm
    public final void j(int i) {
        this.d = i;
    }

    @Override // defpackage.eabm
    public final void k(eadn eadnVar) {
        this.e = eadnVar;
    }
}
