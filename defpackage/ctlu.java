package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctlu implements fdpm {
    final /* synthetic */ fdap a;
    final /* synthetic */ ctju b;
    final /* synthetic */ Context c;
    final /* synthetic */ View d;
    final /* synthetic */ jmj e;

    public ctlu(fdap fdapVar, ctju ctjuVar, jmj jmjVar, Context context, View view) {
        this.a = fdapVar;
        this.b = ctjuVar;
        this.e = jmjVar;
        this.c = context;
        this.d = view;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        this.a.invoke(bool);
        if (zBooleanValue && this.b.c) {
            jmj jmjVar = this.e;
            Context context = this.c;
            View view = this.d;
            if (jmjVar != null) {
                jmjVar.a();
            }
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
        return fctx.a;
    }
}
