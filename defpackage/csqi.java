package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csqi {
    private final fcsu a;
    private final fcsu b;
    private final fcyh c;

    public csqi(fcsu fcsuVar, fcsu fcsuVar2, fcyh fcyhVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcyhVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcyhVar;
    }

    public final csoc a(ParticipantsTable.BindData bindData) {
        return ((cspt) this.a.b()).a(bindData);
    }

    public final csoc b(cspo cspoVar) {
        ecem.b();
        return a(((bbca) this.b.b()).b(cspoVar.a));
    }

    public final Object c(cspo cspoVar, fcxy fcxyVar) {
        return eicj.a(this.c, new csqh(this, cspoVar, null), fcxyVar);
    }
}
