package defpackage;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esup implements fbso {
    public final esum[] a;

    public esup(esum... esumVarArr) {
        this.a = esumVarArr;
    }

    @Override // defpackage.fbso
    public final fbsl a(fbsm fbsmVar, fbrg fbrgVar, fbsn fbsnVar) {
        fbsnVar.getClass();
        fbog fbogVarK = fbog.k();
        fbogVarK.getClass();
        int i = 0;
        while (true) {
            esum[] esumVarArr = this.a;
            if (i >= esumVarArr.length) {
                return fboi.a(fbogVarK, new esuo(fbsmVar, this, fbogVarK), fbrgVar, fbsnVar);
            }
            esum esumVar = esumVarArr[i];
            fbogVarK = fbogVarK.l(esumVar.c, new AtomicReference()).l(esumVar.d, new AtomicReference());
            fbrb fbrbVar = esumVar.a;
            if (fbrgVar.i(fbrbVar)) {
                fbogVarK = fbogVarK.l(esumVar.b, fbrgVar.c(fbrbVar));
            }
            i++;
        }
    }

    public final void b(fbrg fbrgVar, fbog fbogVar, boolean z) {
        int i = 0;
        while (true) {
            esum[] esumVarArr = this.a;
            if (i >= esumVarArr.length) {
                return;
            }
            esum esumVar = esumVarArr[i];
            Parcelable parcelable = (Parcelable) ((AtomicReference) (z ? esumVar.c : esumVar.d).b(fbogVar)).getAndSet(null);
            if (parcelable != null) {
                fbrgVar.h(esumVar.a, parcelable);
            }
            i++;
        }
    }
}
