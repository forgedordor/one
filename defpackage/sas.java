package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sas extends Thread {
    final /* synthetic */ sam a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sas(String str, sam samVar) {
        super(str);
        this.a = samVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            sam samVar = this.a;
            synchronized (samVar) {
                Thread.currentThread();
            }
            samVar.a(samVar.b);
        } catch (IOException e) {
            rzl.b(e, rzl.a("Could not start Stetho server: %s", this.a.a));
        }
    }
}
