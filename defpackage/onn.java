package defpackage;

import android.os.Bundle;
import android.view.MenuItem;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class onn implements oja {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ ojc b;

    public onn(WeakReference weakReference, ojc ojcVar) {
        this.a = weakReference;
        this.b = ojcVar;
    }

    @Override // defpackage.oja
    public final void a(ojx ojxVar, Bundle bundle) {
        ojxVar.getClass();
        eeoc eeocVar = (eeoc) this.a.get();
        if (eeocVar == null) {
            this.b.b.m.remove(this);
            return;
        }
        if (ojxVar instanceof olk) {
            return;
        }
        eenq eenqVar = eeocVar.a;
        eenqVar.getClass();
        int size = eenqVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eenqVar.getItem(i);
            if (ono.a(ojxVar, item.getItemId())) {
                item.setChecked(true);
            }
        }
    }
}
