package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ecsm extends ea {
    protected exqd a;
    protected exoc b;
    protected Integer c;

    static Bundle a(exqd exqdVar, Integer num, int i) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("Question", exqdVar.toByteArray());
        if (num != null) {
            bundle.putInt("DisplayLogoResId", num.intValue());
        }
        bundle.putInt("QuestionIndex", i);
        return bundle;
    }

    protected final ecvr b() {
        ecvr ecvrVar;
        Activity activityB;
        Object objZ = z();
        lvj lvjVar = this.E;
        if (lvjVar instanceof ecvr) {
            return (ecvr) lvjVar;
        }
        if (!(objZ instanceof ecvr) || (activityB = (ecvrVar = (ecvr) objZ).b()) == null || activityB.isFinishing() || activityB.isDestroyed()) {
            return null;
        }
        return ecvrVar;
    }

    public abstract exoz e();

    @Override // defpackage.ea
    public void h(Bundle bundle) {
        super.h(bundle);
        Bundle bundle2 = this.m;
        byte[] byteArray = bundle2.getByteArray("Question");
        if (byteArray != null) {
            this.a = (exqd) ecse.c(exqd.a, byteArray);
        }
        this.c = bundle2.containsKey("DisplayLogoResId") ? Integer.valueOf(bundle2.getInt("DisplayLogoResId", 0)) : null;
        bundle2.getInt("QuestionIndex");
        byte[] byteArray2 = bundle2.getByteArray("Completion");
        if (byteArray2 != null) {
            this.b = (exoc) ecse.c(exoc.b, byteArray2);
        }
    }

    public abstract void p();

    public abstract void q(String str);

    public void f() {
    }
}
