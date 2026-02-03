package defpackage;

import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abry implements abpm {
    private final Context a;
    private final abru b;

    public abry(Context context, abru abruVar) {
        this.a = context;
        this.b = abruVar;
    }

    @Override // defpackage.abpm
    public final eiju a(eppi eppiVar, eppj eppjVar) {
        eppt epptVar = eppiVar.b == 105 ? (eppt) eppiVar.c : eppt.a;
        if (epptVar.equals(eppt.a)) {
            throw new IllegalStateException("Request has incorrect payload");
        }
        abru abruVar = this.b;
        epnw epnwVar = epptVar.b;
        if (epnwVar == null) {
            epnwVar = epnw.a;
        }
        String str = epnwVar.d;
        epnw epnwVar2 = epptVar.b;
        if (epnwVar2 == null) {
            epnwVar2 = epnw.a;
        }
        String str2 = epnwVar2.b;
        epqj epqjVar = epptVar.h;
        if (epqjVar == null) {
            epqjVar = epqj.a;
        }
        kxa kxaVarA = abruVar.a();
        if (!epptVar.d.isEmpty()) {
            kwz kwzVar = new kwz();
            kwzVar.d = epptVar.d;
            if (epptVar.e.isEmpty()) {
                kwzVar.a = this.a.getResources().getString(R.string.unknown_person_name);
            } else {
                kwzVar.a = epptVar.e;
            }
            if (!epptVar.g.isEmpty() && epptVar.f.d() > 0) {
                kwzVar.b = IconCompat.k(epptVar.f.I(), epptVar.f.d());
            }
            kxaVarA = new kxa(kwzVar);
        }
        epnw epnwVar3 = epptVar.b;
        if (epnwVar3 == null) {
            epnwVar3 = epnw.a;
        }
        abruVar.d(str, str2, epqjVar, new kwe(epnwVar3.c, epptVar.c, kxaVarA));
        evrl evrlVar = evrl.a;
        eppjVar.copyOnWrite();
        eppl epplVar = (eppl) eppjVar.instance;
        eppl epplVar2 = eppl.a;
        evrlVar.getClass();
        epplVar.c = evrlVar;
        epplVar.b = 105;
        return eijx.e(eppjVar.build());
    }
}
