package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfbz extends dfcb {
    final /* synthetic */ dfcf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfbz(dfcf dfcfVar) {
        super(dfcfVar);
        this.a = dfcfVar;
    }

    @Override // defpackage.dfcb
    protected final int a() {
        dhja.o("Attempt to execute discovery for untried entries", new Object[0]);
        return this.a.c.b();
    }

    @Override // defpackage.dfcb
    protected final Cursor b() {
        return this.a.c.d();
    }
}
