package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bahy {
    public static bahx D() {
        bacm bacmVar = new bacm();
        bacmVar.a = bary.a;
        bacmVar.p(-1);
        bacmVar.i(-1);
        bacmVar.g(-1L);
        bacmVar.o(-1L);
        bacmVar.h(-1L);
        bacmVar.j(-1L);
        bacmVar.n(elha.UNKNOWN);
        bacmVar.f(0);
        bvdr bvdrVar = bvdr.STANDARD;
        if (bvdrVar == null) {
            throw new NullPointerException("Null mediaSendType");
        }
        bacmVar.m = bvdrVar;
        bacmVar.l(bvdy.NONE);
        bacmVar.o = bvdq.DEFAULT_NO_VERDICT;
        return bacmVar;
    }

    public abstract void A();

    public abstract void B();

    public abstract void C();

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract long d();

    public abstract long e();

    public abstract long f();

    public abstract long g();

    public abstract Uri h();

    public abstract Uri i();

    public abstract athh j();

    public abstract MessageIdType k();

    public abstract bvdq l();

    public abstract bvdr m();

    public abstract bvdy n();

    public abstract LocationInformation o();

    public abstract dqbw p();

    public abstract elha q();

    public abstract String r();

    public abstract String s();

    public abstract String t();

    public abstract String u();

    public abstract String v();

    public abstract String w();

    public abstract String x();

    public abstract boolean y();

    public abstract boolean z();
}
