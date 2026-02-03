package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaza {
    public static final cqce a = cqce.f("BugleDiagnostics", aaza.class);
    public final Context b;
    public List c;
    public final fcsu d;
    public final abag e;
    public final ServiceConnection f = new aayy(this);
    public boolean g;
    public aayz h;
    private final aazb i;

    public aaza(Context context, aazb aazbVar, fcsu fcsuVar, abag abagVar) {
        this.b = context;
        this.i = aazbVar;
        this.d = fcsuVar;
        this.e = abagVar;
    }

    public final List a() {
        if (this.c == null) {
            aazb aazbVar = this.i;
            ArrayList arrayList = new ArrayList();
            aayw aaywVar = aazbVar.e;
            arrayList.add(new aban(aazbVar.a, new abam(aaywVar.b.d(), ((cczl) aaywVar.a.b()).a())));
            arrayList.add(aazbVar.c);
            arrayList.add(aazbVar.b);
            arrayList.add(aazbVar.d);
            this.c = arrayList;
        }
        return this.c;
    }
}
