package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bha {
    public abstract int a();

    public abstract Range b();

    public abstract Range c();

    public abstract Size d();

    public abstract azv e();

    public abstract bjq f();

    public final bms g(bjq bjqVar) {
        bmr bmrVarI = bms.i(d());
        bhn bhnVar = (bhn) bmrVarI;
        bhnVar.a = e();
        bhnVar.b = bjqVar;
        if (!bms.h.equals(c())) {
            bmrVarI.b(c());
        } else if (b() != null) {
            bmrVarI.b(b());
        }
        return bmrVarI.a();
    }

    public abstract bmv h();

    public abstract List i();
}
