package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecix extends eclo {
    public static final eclo a = new ecix();

    private ecix() {
    }

    @Override // defpackage.eclo
    public final /* synthetic */ ecln a(ecjj ecjjVar, String str, Executor executor, ecev ecevVar) {
        evrr evrrVarA;
        ecia eciaVar = (ecia) ecjjVar;
        ejwl.a(eciaVar.e instanceof ecim);
        if (eciaVar.f) {
            evrrVarA = evrr.a();
        } else {
            evrr evrrVar = evrr.a;
            evuq evuqVar = evuq.a;
            evrrVarA = evrr.a;
        }
        eclw eclwVar = new eclw(eciaVar.b, evrrVarA);
        Uri uri = eciaVar.a;
        return new ecja(str, eork.i(uri), eclwVar, executor, ecevVar, eciaVar.c, new eidn());
    }

    @Override // defpackage.eclo
    public final String b() {
        return "multiproc";
    }
}
