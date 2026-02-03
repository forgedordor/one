package defpackage;

import android.content.SharedPreferences;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtbp implements eora {
    final /* synthetic */ dtbq a;

    public dtbp(dtbq dtbqVar) {
        this.a = dtbqVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ewwm ewwmVar = (ewwm) obj;
        ewwmVar.getClass();
        String str = ewwmVar.b;
        str.getClass();
        if (str.length() > 0) {
            dtbq dtbqVar = this.a;
            final String str2 = ewwmVar.b;
            str2.getClass();
            final fdap fdapVar = new fdap() { // from class: dtbj
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    SharedPreferences.Editor editorPutString;
                    SharedPreferences sharedPreferences = (SharedPreferences) obj2;
                    sharedPreferences.getClass();
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (editorEdit == null || (editorPutString = editorEdit.putString("zb", str2)) == null) {
                        return null;
                    }
                    editorPutString.apply();
                    return fctx.a;
                }
            };
            ejvr ejvrVar = new ejvr() { // from class: dtbk
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    return fdapVar.invoke(obj2);
                }
            };
            dtbl dtblVar = dtbqVar.c;
            eooq.f(dtblVar.c, ejvrVar, dtblVar.b);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        th.getClass();
        Log.w("ZBCC", "Failed to get session", th);
    }
}
