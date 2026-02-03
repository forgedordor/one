package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eatv implements Parcelable {
    public static eatu e(eary earyVar, easj easjVar) {
        eapj eapjVar = new eapj();
        if (earyVar == null) {
            throw new NullPointerException("Null day");
        }
        eapjVar.b = earyVar;
        eapjVar.c = easjVar;
        eapjVar.b(false);
        return eapjVar;
    }

    public abstract eary a();

    public abstract easi b();

    public abstract easj c();

    public abstract boolean d();
}
