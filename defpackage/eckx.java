package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eckx extends eclo {
    public static final eclo a = new eckx();

    private eckx() {
    }

    @Override // defpackage.eclo
    public final /* synthetic */ ecln a(ecjj ecjjVar, String str, Executor executor, ecev ecevVar) {
        evrr evrrVarA;
        ecia eciaVar = (ecia) ecjjVar;
        if (eciaVar.f) {
            evrrVarA = evrr.a();
        } else {
            evrr evrrVar = evrr.a;
            evuq evuqVar = evuq.a;
            evrrVarA = evrr.a;
        }
        eclw eclwVar = new eclw(eciaVar.b, evrrVarA);
        Uri uri = eciaVar.a;
        return new eckz(str, eork.i(uri), eclwVar, executor, ecevVar, eciaVar.c, new eidn());
    }

    @Override // defpackage.eclo
    public final String b() {
        return "singleproc";
    }
}
