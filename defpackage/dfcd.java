package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfcd extends dfcb {
    final /* synthetic */ dfcf a;
    private long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfcd(dfcf dfcfVar) {
        super(dfcfVar);
        this.a = dfcfVar;
    }

    @Override // defpackage.dfcb
    protected final int a() {
        dhja.o("Attempt to poll status for unknowns, IMS and non IMS contacts last tried over %ds ago.", Long.valueOf(this.c / 1000));
        return this.a.c.a(this.c);
    }

    @Override // defpackage.dfcb
    protected final Cursor b() {
        return this.a.c.c(this.c);
    }

    @Override // defpackage.dfcb
    protected final void c() {
        super.c();
        dfcf dfcfVar = this.b;
        this.c = !dfcfVar.i() ? 86400000L : dfcfVar.f.a;
    }
}
