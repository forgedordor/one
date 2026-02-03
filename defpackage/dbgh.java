package defpackage;

import android.util.Log;
import com.google.research.xeno.effect.Effect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class dbgh {
    public final /* synthetic */ dbgm a;
    public final /* synthetic */ dqjd b;

    public /* synthetic */ dbgh(dbgm dbgmVar, dqjd dqjdVar) {
        this.a = dbgmVar;
        this.b = dqjdVar;
    }

    public final void a(String str, Effect effect, String str2) {
        String str3 = dbgi.a;
        dbgm dbgmVar = this.a;
        if (effect == null) {
            dbgmVar.e = new dbgg(dbgk.FAILURE, str2);
            Log.w(dbgi.a, "ES effect " + str + " failed to load: ", new RuntimeException(str2));
        } else {
            dbgmVar.e = new dbgg(dbgk.SUCCESS, str2);
            dbgmVar.d = effect;
            Log.d(dbgi.a, "ES effect " + str + " loaded successfully");
        }
        this.b.a.invoke(dbgmVar);
    }
}
