package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dfcb implements Runnable {
    final /* synthetic */ dfcf b;

    public dfcb(dfcf dfcfVar) {
        this.b = dfcfVar;
    }

    protected abstract int a();

    protected abstract Cursor b();

    protected void c() {
        this.b.j(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x018f, code lost:
    
        defpackage.dhja.o("Finished discovery", new java.lang.Object[0]);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfcb.run():void");
    }
}
