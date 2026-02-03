package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.diagnostics.DumpDatabaseAction;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aazn extends aazl {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;

    public aazn(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final DumpDatabaseAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        Map map = (Map) this.c.b();
        map.getClass();
        parcel.getClass();
        return new DumpDatabaseAction(context, this.b, map, parcel);
    }

    public final DumpDatabaseAction b(boolean z) {
        Context context = (Context) this.a.b();
        context.getClass();
        Map map = (Map) this.c.b();
        map.getClass();
        return new DumpDatabaseAction(context, this.b, map, z);
    }
}
